	package com.gl.email.service;
	
	import java.util.Random;
	import com.gl.email.model.Employee;
	
	public class Service {
	
		public String generatePassword() {
			
			String capitalCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String lowerCase = "abcdefghijklmaoparstuvwxyz";
			String number = "0123456789";
			String special = "^1⑥#＄%^&*";
			String combine = capitalCase+lowerCase+number+special;
			String mypass = "";
			
			Random random = new Random();
			for (int i=0; i<8; i++) {
				mypass = mypass+String.valueOf(combine.charAt(random.nextInt (combine.length())));
			}
			return mypass ;
			 
		}
	public String generateEmailAddress( String firstName, String lastName, String department) {
	return  firstName+lastName+"@"+department+".gl.com";
		}
	public void showCredentials(Employee emp, String email, String mypass) {
	System.out.println("Dear "+emp.getFirstname()+" "+emp.getLastname()+ ", your generated creadential are as follow :- ");
	System.out.println("Email --> "+ email);
	System.out.println("Password --> "+ mypass);
		}
	}

