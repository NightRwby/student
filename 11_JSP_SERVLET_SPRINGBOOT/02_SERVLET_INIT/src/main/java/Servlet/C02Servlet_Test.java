package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


public class C02Servlet_Test extends HttpServlet{

	@Override
	public void init() throws ServletException {
		//���� ���� ���� �Լ�
		System.out.println("C02Servlet_Test's INIT() invoke...");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//��û�ø��� �����ϴ� �Լ�
		System.out.println("C02Servlet_Test's SERVICE() invoke...");
	}

	@Override
	public void destroy() {
		//���� ����� �����ϴ� �Լ�
		System.out.println("C02Servlet_Test's DESTORY() invoke...");
	}


	
	

}
