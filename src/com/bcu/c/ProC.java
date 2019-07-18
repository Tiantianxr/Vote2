package com.bcu.c;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcu.bean.Pro;
import com.bcu.dao.ProDao;
public class ProC extends HttpServlet {
 
	public ProC() {
		super();
	}
 
 
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 
			this.doPost(request, response);
	}
 
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String cmd = request.getParameter("cmd");

		if(null==cmd||cmd.equals("select")) {
			select(request, response);
		}else if(cmd.equals("update")) {
			update(request,response);
		}else if(cmd.equals("add")) {
			add(request, response);
		}else if(cmd.equals("delete")) {
			delete(request,response);
		}else if(cmd.equals("update1")){
			update1(request,response);
		}
	}
	public void update1(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String pro_id = request.getParameter("pro_id");
		System.out.println("pro_id==="+pro_id);
		String pro_name = request.getParameter("pro_name");
		System.out.println("pro_name==="+pro_name);
		String pro_type = request.getParameter("pro_type");
		System.out.println("pro_type==="+pro_type);
		String pro_per = request.getParameter("pro_per");
		System.out.println("pro_per==="+pro_per);
		String pro_dan = request.getParameter("pro_dan");
		String pro_num = request.getParameter("pro_num");
		System.out.println("pro_num==="+pro_num);
	
		Pro pro = new Pro();
		
		pro.setPro_id(pro_id);
		pro.setPro_name(pro_name);
		pro.setPro_type(pro_type);
		pro.setPro_per(pro_per);
		pro.setPro_dan(pro_dan);
		pro.setPro_num(pro_num);
		pro.setFlag(1);
		
		ProDao proDao = new ProDao();
		int affCount = proDao.update2(pro);
		
		List<Pro> list=proDao.selectAll();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("grade.jsp").forward(request, response);
	}

	
	//删除
	public void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String pro_id = request.getParameter("pro_id");
		ProDao proDao = new ProDao();
		
		int affCount= proDao.delete(Integer.parseInt(pro_id));
		response.sendRedirect("ProC?cmd=select");
	}
	//修改
	public void update(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String pro_id = request.getParameter("pro_id");
		System.out.println("pro_id==="+pro_id);
		String pro_name = request.getParameter("pro_name");
		String pro_type = request.getParameter("pro_type");
		String pro_per = request.getParameter("pro_per");
		String pro_dan = request.getParameter("pro_dan");
		String pro_num = request.getParameter("pro_num");
		int flag = Integer.parseInt(request.getParameter("flag"));
	
		Pro pro = new Pro();
		
		pro.setPro_id(pro_id);
		pro.setPro_name(pro_name);
		pro.setPro_type(pro_type);
		pro.setPro_per(pro_per);
		pro.setPro_dan(pro_dan);
		pro.setPro_num(pro_num);
		pro.setFlag(flag);
		ProDao proDao = new ProDao();
		
		int affCount = proDao.update(pro);
		response.sendRedirect("ProC?cmd=select");
	}
	//查询
	public void select(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		Pro pro = new Pro();	
		ProDao proDao = new ProDao();
		List<Pro> list=proDao.selectAll();
		request.setAttribute("list", list);
		System.out.println("********");
		
		System.out.println(list.size());
		//request.setAttribute("pro", pro);
		request.getRequestDispatcher("pro-list.jsp").forward(request, response);
	}
	//添加
		public void add(HttpServletRequest request, HttpServletResponse response) throws IOException{
			String pro_id = request.getParameter("pro_id");
			System.out.println(pro_id);
			String pro_name = request.getParameter("pro_name");
			String pro_type = request.getParameter("pro_type");
			String pro_per = request.getParameter("pro_per");
			String pro_dan = request.getParameter("pro_dan");
			String pro_num = request.getParameter("pro_num");
			Pro pro = new Pro();
			pro.setPro_id(pro_id);
			pro.setPro_name(pro_name);
			pro.setPro_type(pro_type);
			pro.setPro_per(pro_per);
			pro.setPro_dan(pro_dan);
			pro.setPro_num(pro_num);
			
			ProDao proDao = new ProDao();
		    int affCount=proDao.insert(pro);
		    response.sendRedirect("ProC?cmd=select");		
		}
	public void init() throws ServletException {
		// Put your code here
	}
}