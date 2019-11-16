package yzw.filter;

import sun.nio.ch.FileChannelImpl;
import yzw.user.CE_USER;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //把ServletRequest转换成HttpServletRequest
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        //获得session
        HttpSession session = req.getSession();
        //从session中来获取user
        CE_USER user = (CE_USER) session.getAttribute("user");
        if(user == null){
            HttpServletResponse resp = (HttpServletResponse)servletResponse;
            resp.sendRedirect("/login.jsp");
        }else{
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
