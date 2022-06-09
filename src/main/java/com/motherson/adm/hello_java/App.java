package com.motherson.adm.hello_java;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
/*
 * 
 * Added Name function
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
    	System.out.print( "Enter your name:" );
    	String name = scan.next();
    	System.out.print("Hello "+name);
    }
}
