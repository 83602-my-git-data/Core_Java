package com.app;

import java.util.Arrays;
import java.util.Comparator;

public class Q1 {
	static <T> void selectionSort(T[] arr, Comparator<T> b) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = i + 1; j < arr.length; j++)
				if (b.compare(arr[i],arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
	}
	
	static <T> void inserationSort(T[] arr, Comparator<T> com) {	
		for(int i = 1 ; i <arr.length; i++) {
			T key = arr[i];
			int j=i-1;
			
			while(j>=0 && com.compare(arr[j], key)>0) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
		}
		
	}	
	
	public static void main(String[] args) {
		Integer[] arr = {9,8,7,5,3,4,6,8,9,2,1,7};
		Student arr1[] = new Student[5];
		arr1[0] = new Student(3, "vrushab", "Pune", 546);
		arr1[1] = new Student(1, "rahul", "Mumbai", 646);
		arr1[2] = new Student(2, "prashant", "Akola", 596);
		arr1[3] = new Student(5, "pratik", "Dhule", 46);
		arr1[4] = new Student(4, "onkar", "Nashik", 54);
		
		System.out.println("Before Sorting :: ");
		System.out.println(Arrays.toString(arr));
		
		selectionSort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		} );
	
		System.out.println("After Sorting :: ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("******************************************************");
		System.out.println("Before Sorting Student :: ");
		System.out.println(Arrays.toString(arr1));
		
		selectionSort(arr1, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		} );
	
		System.out.println("After Sorting :: ");
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("************************Inseration Sort******************************");
		System.out.println("Before Sorting Student :: ");
		System.out.println(Arrays.toString(arr1));
		
		inserationSort(arr1, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o1.getName().length() ,o2.getName().length());
			}
		} );
	
		System.out.println("After Sorting :: ");
		System.out.println(Arrays.toString(arr1));
	}
}
