package com.FileHandling.InputOuput;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputOutput {

	public static void main(String[] args) {
		{
			try {
				String path1 = "C:\\Users\\ANANDH\\Documents\\Java File Handling\\Input.txt";
				String path2 = "C:\\Users\\ANANDH\\Documents\\Java File Handling\\Output.txt";
				
				try (FileInputStream fis = new FileInputStream(path1);
						FileOutputStream fos = new FileOutputStream(path2)) {
					
					int a; 
					
					    while ((a = fis.read()) != -1) {
						fos.write(a);
					}
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
