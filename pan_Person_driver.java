package com.maping.controller;

import java.util.Scanner;


import com.mapping.dao.personPan_test;

public class pan_Person_driver
{
	public static void main(String[] args)
	{
		 Scanner sc= new Scanner(System.in);
		    personPan_test p = new  personPan_test();
		    for(;;) 
		    {
		    	 System.out.println("1. get value 2.insert value  3.deletevalue 4.exit");
		  	   switch(sc.nextInt())
		  	      {
		  	         case 1:
		  	          {
		  	           p.getvalue();
		  	          }
		  	           break;
		  	        
		  	          case 2:
		  	          {
		  	           p.insertvalue();
		  	          }
		  	           break;
		  	           case 3:
		  	          {
		  	           p.deletevalue();
		  	          }
		  	           break;  
		  	         case 4:
		 	          {
		 	           System.exit(0);
		 	          }
		 	           break;
		  	       }
		    }
	}
}
