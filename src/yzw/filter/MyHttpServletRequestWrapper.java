package yzw.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.UnsupportedEncodingException;

public class MyHttpServletRequestWrapper extends HttpServletRequestWrapper {

    private String encode;
    public MyHttpServletRequestWrapper(HttpServletRequest request,String charSet) {
        super(request);
        this.encode = charSet;

    }

       @Override
    public String getParameter(String name) {

        String value = super.getParameter(name);
        try {
            value = value == null?null:new String(value.getBytes("UTF-8"),this.encode);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return value;
    }
}
