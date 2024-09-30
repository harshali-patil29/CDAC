package org.example.collectiondemo;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Question1 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the size of list: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements: ");
		for(int i=0; i < n;i++) {
			list.add(sc.nextInt());
		}		
		System.out.println("List entered is "+list.toString());		
		
		Set<Integer> uniqueSet = new HashSet<>(list);  
		List<Integer> listUnique = new ArrayList<>(uniqueSet);  
				
		System.out.println("Unique elements list: " + listUnique.toString());	
		sc.close();
	}	
}

