package yzw.control;



import yzw.service.CEUserService;
import yzw.service.impl.CEUserServiceImpl;
import yzw.user.CE_USER;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class getUserByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Integer intId = null;
        if(id!=null){
            intId = new Integer(id);
        }
        CEUserService userService = new CEUserServiceImpl();
        CE_USER user = userService.getUserById(intId);
        req.setAttribute("user",user);
        req.getRequestDispatcher("/tab/toEdit.jsp").forward(req,resp);
    }
}
