package com.nt.main;
import com.nt.service.ArthmeticOperations;

public class AppTest 
{
    public static void main(String args[])
    {
    	ArthmeticOperations ar = new ArthmeticOperations();
    	System.out.println("sum : "+ ar.sum(100,200));
        System.out.println("sub : "+ ar.sub(100, 200));
        System.out.println(" cahnge ");
        System.out.println("mul : "+ ar.mul(100, 200));//456 789

	}
}
