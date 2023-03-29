package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemoWithBuffer {

	public static void main(String[] args) {

		try (
				BufferedInputStream fis = new BufferedInputStream(new FileInputStream("myfile1.txt"));
				BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream("myfile2.txt",true));
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
