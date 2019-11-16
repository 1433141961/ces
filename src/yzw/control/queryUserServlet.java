package yzw.control;

import yzw.service.CEUserService;
import yzw.service.impl.CEUserServiceImpl;
import yzw.user.CE_USER;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class queryUserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CEUserService userDAO = new CEUserServiceImpl();
        List<CE_USER> ce_usersList = userDAO.queryUser();
        req.setAttribute("userList",ce_usersList);
        req.getRequestDispatcher("/tab/tab.jsp").forward(req,resp);
    }
}
