package com.adl.exercise;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Task4 tsk = new Task4();
		tsk.tugas4();
}
	public void tugas4 () {
		Scanner scan = new Scanner (System.in);
		System.out.print("Masukan Ukuran Persegi:");
		int ukuran = scan.nextInt();
		
		for (int i=0;i<ukuran;i++) {
			for (int j=0;j<ukuran;j++) {
				if (i==0 ||i==ukuran-1||j==0||j==ukuran-1){
					System.out.print("*");
				}else if (i==ukuran-4 && j==ukuran-4){
					System.out.print("@");
				}else {
					System.out.print(" ");
				}
			}System.out.println("");
		}
			
		String arah="";	
		while (!arah.equalsIgnoreCase("a")) {
		System.out.println("Masukan arah (a ke kiri, d ke kanan, w ke atas, s ke bawah:");
		arah = scan.nextLine();
			for (int i=0;i<ukuran;i++) {
				for (int j=0;j<ukuran;j++) {
					if (i==0 ||i==ukuran-1||j==0||j==ukuran-1){
						System.out.print("*");
					}else if (i==ukuran-2 && j==ukuran-2){
						System.out.print("@");
					}else {
						System.out.print(" ");
					}
				}System.out.println("");
			}
		}
		System.out.println("Selamat kawan");
	}
}		
