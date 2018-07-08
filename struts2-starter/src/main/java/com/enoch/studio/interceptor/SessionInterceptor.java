package com.enoch.studio.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by Enoch on 2018/4/16.
 */
public class SessionInterceptor extends AbstractInterceptor{

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("interceptor->>SessionInterceptor");
         String  obj = invocation.invoke();
        System.out.println("after");
        return obj;
    }
}
