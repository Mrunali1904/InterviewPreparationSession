package com.Mainapp;

import java.util.Scanner;

public class LiftQueries {
	
	static Scanner sc=new Scanner(System.in);
    void LiftQuery(int a,int b,int n){
        while(n!=0){
            System.out.println("Enter the test case");
            int call=sc.nextInt();
            if( Math.abs(call-a)<=Math.abs(call-b))
            {
                System.out.println("A");
                a=call;
            }
            else{
               System.out.println("B");
                b=call;
            }
            n--;
        }
    }
	public static void main(String args[]) {
		System.out.println("Enter the number of test case");
        int a=1, b=7,n;
        n=sc.nextInt();
        LiftQueries lq=new LiftQueries();
        lq.LiftQuery(a,b,n);

	}
}
