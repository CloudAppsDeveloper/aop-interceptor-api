package com.ass.esms.interceptor.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;

@Component
public class RequestFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		try {
			HttpServletRequest httpRequest=(HttpServletRequest)request;
			String mdcData=String.format("[%s]", httpRequest.getSession().getId());
			MDC.put("sessionId", mdcData);
			chain.doFilter(request, response);
		}finally {

			MDC.clear();
		}
		
	}
	

}
