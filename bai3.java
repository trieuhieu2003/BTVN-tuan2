package bai3;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		String Ten;
		int Namsinh;
		int Tuoi;
		Scanner sc= new Scanner(System.in);
		System.out.println("ten cua ban la:");
		Ten=sc.nextLine();
		System.out.println("nam sinh cua ban la:");
		Namsinh=sc.nextInt();
		if(Namsinh<0||Namsinh>2023) {
			System.out.println("ban da nhap sai nam sinh");
		}else {
			Tuoi=2023-Namsinh;
		if(Tuoi<16) {
			System.out.println("Ban"+Ten+"la ci thanh nien.");
		}else if(Tuoi<18) {
			System.out.println("Ban"+Ten+"dang tuoi truong thanh");
		}else {
			System.out.println("Ban"+Ten+"da gia");
		}
		}
	}

}
