package com.demo.interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		MyDBDriver driver=new MySQLDBDriver();
		
		driver.getConnection();
		driver.showDbDetails();

	}

}
