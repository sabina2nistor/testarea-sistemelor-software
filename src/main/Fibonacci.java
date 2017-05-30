package main;

import java.util.Scanner;

public class Fibonacci {

	public Fibonacci(){}
	
	public static int fibonacci(int fn) {
	    if (fn == 1 || fn == 2) {
	        return 1;
	    } else {
	        return fibonacci(fn - 1) + fibonacci(fn - 2);
	    }
	}
// functie ce verifica daca un numar intreg este fibonacci
	public static boolean check(int number){
		int i = 1;
	    while (i >= 0) {
	        int fibnumber = fibonacci(i);
		        if (fibnumber != number) {
		            if (fibnumber >= number) {
		                return false;
		            
		            } else {
		                i++;
		            }
		        } else {
		            return true;
		        }
	    }
	    return false;
	}
//functie ce numara cate numere sunt fibonacci si pare
	public static int countFib(int n, int[] v){
		int count = 0;
		for(int i=0; i<n; i++){
			
			if( v[i]<=0 ){
				System.out.println("Nu se poate!");
				return -1;
			}
			
			if(check(v[i]) && v[i] % 2 == 0 ){
				count +=1;	
			}
		}
		return count;
	}
	
//	public static void main(String[] args){
//		int n;
//		int[] v = null;
//		try (Scanner sc = new Scanner(System.in)) {
//		      n = sc.nextInt();
//		      if(n > 0) {
//		    	  v = new int[n];
//		      }
//		      	
//		      for(int i = 0; i < n; i++) {
//		          v[i] = sc.nextInt();
//		      }
//		}
//		System.out.println(countFib(n, v));
//	}
	
}







