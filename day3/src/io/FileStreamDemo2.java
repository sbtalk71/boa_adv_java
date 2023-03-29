package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileStreamDemo2 {

	public static void main(String[] args) {

		try (
				FileInputStream fis = new FileInputStream("myfile1.txt");
				FileOutputStream fos=new FileOutputStream("myfile2.txt",true);
				
			) {

			int b = 0;
			while ((b = fis.read()) != -1) {
				System.out.print((char) b);
				fos.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File is not found : " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
