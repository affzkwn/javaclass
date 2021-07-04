package com.lessons.javaclass;

import com.lessons.javaclass.Triangle.Triangle;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class JavaclassApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JavaclassApplication.class, args);
		Triangle triangleA = new Triangle(15,8,15,8,17);
		Triangle triangleB = new Triangle(3,2.598,3,3,3);

		double triangleAArea = triangleA.findArea();
		System.out.println(triangleAArea);

		double triangleBArea = triangleB.findArea();
		System.out.println(triangleBArea);

		System.out.println(triangleA.sideLenThree);
		System.out.println(triangleB.base);

		System.out.println(Triangle.numofside);
	}

}
