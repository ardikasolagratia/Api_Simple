package com.example.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ApiSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSimpleApplication.class, args);
// tipe data
//		int a = 5;
//		int b = 2;
//		String darwin = "Darwin Sibarani ingin ke Bali" ;
//		char bebas = 'a';
//
//		System.out.println(a+b);
//		System.out.println(darwin);
//		System.out.println(bebas);

		// kondisi if-else
//		Scanner darwin = new Scanner(System.in);
//
//		System.out.print("Masukkan angka a: ");
//		int a = darwin.nextInt();
//
//		System.out.print("Masukkan angka b: ");
//		int b = darwin.nextInt();
//
//
//		if (a > b) {
//			System.out.println("a lebih besar dari b");
//		} else if (b > a) {
//			System.out.println("a lebih kecil dari b");
//		}
//
//		int a = 10;
//
//		for (int b = 0; b < a; b++){
//			System.out.println(b);
//		}

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
	}

}
