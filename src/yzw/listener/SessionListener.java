package yzw.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class SessionListener implements HttpSessionListener {


            @Override
            public void sessionCreated(HttpSessionEvent httpSessionEvent) {
                countPerson(httpSessionEvent.getSession().getServletContext(),true);

            }

            @Override
            public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
                countPerson(httpSessionEvent.getSession().getServletContext(),false);
            }

            public void countPerson(ServletContext sc,Boolean isAdd){
                synchronized (sc){
                    if (isAdd){
                        Integer count = (Integer) sc.getAttribute("count");
                        sc.setAttribute("count",++count);
                    }else {
                        Integer count = (Integer) sc.getAttribute("count");
                        sc.setAttribute("count",--count);
                    }
                }
            }
        }
