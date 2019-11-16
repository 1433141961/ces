package yzw.control;



import yzw.service.CEUserService;
import yzw.service.impl.CEUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class delUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Integer idInt = null;
        if(id !=null) {
            idInt = new Integer(id);
        }
        CEUserService ceUserService = new CEUserServiceImpl();
        ceUserService.delUser(idInt);
        //重定向页面
        resp.sendRedirect("/queryUserServlet");
    }
}
