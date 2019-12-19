package com.iris.models;

	public class Employee {

		private int empId;
		private String name;
		private String gender;
		private String password;
		
		
		public int getEmpId() {
			return empId;
		}


		public void setEmpId(int empId) {
			this.empId = empId;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + ", password=" + password
					+ "]";
		} 
		
		
		
		
	}


