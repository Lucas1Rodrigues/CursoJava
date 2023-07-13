package setsExercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Student {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Set<Integer> courseA = new HashSet<>();
	Set<Integer> courseB = new HashSet<>();
	Set<Integer> courseC = new HashSet<>();
	
	System.out.println("How many student for course A:");
	int A = sc.nextInt();
	System.out.println("------------------------------");
	for (int i = 0; i < A; i++) {
		int student = sc.nextInt();
		courseA.add(student);
		
	}
	
	System.out.println("How many student for course B:");
	int B = sc.nextInt();
	System.out.println("------------------------------");
	for (int i = 0; i < B; i++) {
		int student = sc.nextInt();
		courseB.add(student);
		
	}
	System.out.println("How many student for course C:");
	int C = sc.nextInt();
	System.out.println("------------------------------");
	for (int i = 0; i < C; i++) {
		int student = sc.nextInt();
		courseC.add(student);
		
	}
	
	Set<Integer> union = new TreeSet<>(courseA);
	union.addAll(courseB);
	union.addAll(courseC);
	System.out.println("total students: " + union.size() );
	
	
	
	
	
	
}
}
