package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleApp {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		System.out.println("Type 'exit' to end");
		try {
			while (true) {
				line = br.readLine();
				if(line.equalsIgnoreCase("exit")) break;
				System.out.println("Received: "+line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
