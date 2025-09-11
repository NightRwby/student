package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter(urlPatterns = {"/index.do"})
public class HomeFilter_1 implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		//Request�� Servlet�� ���޵Ǳ� �� �ڵ�
		
		System.out.println("[FILTER] HOME FILTER_1 START..");
		
		chain.doFilter(req, resp);
		
		//Response�� Client�� ���޵Ǳ� ��
		System.out.println("[FILTER] HOME FILTER_1 END..");
		
	}

}
