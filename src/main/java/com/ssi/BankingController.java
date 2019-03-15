package com.ssi;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankingController {

	@RequestMapping("dataentryform")
	public String showDataEntryForm(){
		System.out.println("Testing-It");
		return "dataentry.jsp";
	}
	
	@RequestMapping("Calculate")
	public void calculateInterest(HttpServletRequest request, HttpServletResponse response){
		try{
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		
		int amount=Integer.parseInt(s1);
		int time=Integer.parseInt(s2);
		
		int interest=amount*time*10/100;
		
		PrintWriter out=response.getWriter();
		out.println("Interest Amount Is : "+interest);
		out.close();
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
			
	}
	
}
