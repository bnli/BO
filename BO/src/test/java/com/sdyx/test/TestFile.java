package com.sdyx.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class TestFile {

	@Test
	public void Test1() {
		
		Scanner cin = null;
		long num;
		
		try {
			cin = new Scanner (new FileInputStream("C:\\workspaces\\MyEclipse 10\\PortalServer-App\\src\\test\\resources\\dy.txt"));
			num = Long.parseLong(cin.nextLine());
			System.out.println(num);
			for (int i = 0; i < num; i++) {
				System.out.println("(\""+cin.nextLine()+"\",\""+cin.nextLine()+"\",\""+cin.nextLine()+"\",\""+cin.nextLine()+"\")");
			}
			
			cin = new Scanner (new FileInputStream("C:\\workspaces\\MyEclipse 10\\PortalServer-App\\src\\test\\resources\\wf.txt"));
			num = Long.parseLong(cin.nextLine());
			System.out.println(num);
			for (int i = 0; i < num; i++) {
				System.out.println("(\""+cin.nextLine()+"\",\""+cin.nextLine()+"\",\""+cin.nextLine()+"\",\""+cin.nextLine()+"\")");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
