package yzw.filter;

import javax.jnlp.FileContents;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;

public class EcodingFilter implements Filter {
    private String encode;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String paraEncod = filterConfig.getInitParameter("ecode");
        if(paraEncod != null && paraEncod != ""){
            this.encode = paraEncod;
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        //post请求乱码
        request.setCharacterEncoding("UTF-8");
        //post请求页面乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset="+encode);

        //get请求乱码处理
        //强制转换ServletRequest为httpServletRequ
        HttpServletRequest req = (HttpServletRequest)request;
        //获得请求方式
        String method = req.getMethod();
        if (method.equalsIgnoreCase("Get")){
            //创建装饰器类
            req =  new MyHttpServletRequestWrapper(req,encode);

        }

        System.out.println("过滤器开始。。。");
        filterChain.doFilter(req,response);

        System.out.println("过滤器结束。。。");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
