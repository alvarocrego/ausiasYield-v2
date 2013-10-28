package net.daw.operation;

import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.bean.ClienteBean;
import net.daw.dao.ClienteDao;
import net.daw.helper.Contexto;

public class ClienteList1 extends Operation {

    @Override
    public Object execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Contexto oContexto = (Contexto) request.getAttribute("contexto");
        oContexto.setVista("jsp/cliente/list.jsp");
        try {
            ClienteDao oClienteDAO = new ClienteDao(oContexto.getEnumTipoConexion());
            Integer intPages = oClienteDAO.getPages(oContexto.getNrpp());
            if (oContexto.getPage() >= intPages) {
                oContexto.setPage(intPages);
            }
            ArrayList<ClienteBean> listado = (ArrayList<ClienteBean>) oClienteDAO.getPage(oContexto.getNrpp(), oContexto.getPage());
            ArrayList<String> vecindad = (ArrayList<String>) oClienteDAO.getNeighborhood("<a href=\"Controller?class=cliente&method=list&rpp=" + oContexto.getNrpp() + "&page=", oContexto.getPage(), intPages, 2);
            ArrayList<Object> a = new ArrayList<>();
            a.add(listado);
            a.add(vecindad);            
            return a;
        } catch (Exception e) {
            throw new ServletException("ClienteList1: View Error: " + e.getMessage());
        }
    }
}
