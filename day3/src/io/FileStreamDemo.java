package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("myfile1.txt");
			int b = 0;
			while ((b = fis.read()) != -1) {
				System.out.print((char)b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File is not found : " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
