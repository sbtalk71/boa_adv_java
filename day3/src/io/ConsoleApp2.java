package io;

import java.util.Scanner;

public class ConsoleApp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int data = sc.nextInt();
			if(data==0) break;
			System.out.println("Received : " + data);
		}
		sc.close();
	}

}
