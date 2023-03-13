package com.gl.gradedproject1.employee;

public class Employee {
		

	
		private String firstName;
		private String lastName;
		private String department;
		
		
		public Employee(String firstName, String lastName, String department) {
			super();
			
		}
	
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName=firstName;
		}
				
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName=lastName;
		}
		
		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}
		
		public String generateEmail()
			{
		      String generatedEmail;
		      generatedEmail = firstName+lastName+"."+department+"@abc.com";
		      		return generatedEmail;
			
		}
	
		
}	

	


	
