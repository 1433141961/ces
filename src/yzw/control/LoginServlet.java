package yzw.control;

import yzw.service.CEUserService;
import yzw.service.impl.CEUserServiceImpl;
import yzw.user.CE_USER;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得登录的传参数
        String username = request.getParameter("username1");
        String password = request.getParameter("password1");
        //创建Service的接口对象
        CEUserService userService = new CEUserServiceImpl();
        //调用Service的获取用户的方法
        CE_USER user = userService.getUserByUnameAndPassword(username, password);
        //判断账号密码是否正确
        if(user.getUsername()!=null && user.getPassword()!=null){
            //获得session对象
            HttpSession session = request.getSession();
            //把user对象放入session的域中
            session.setAttribute("user", user);
            response.sendRedirect("/ces/main.jsp");
        }else{
            response.getWriter().print("用户名或者密码错误");
        }
    }
}
