package seldemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static <a> void main(String[] args) {
		// TODO Auto-generated method stub
		
		//basics of java:
		//array:
		
		
		//int a[]=new int[5];
		// int a[]= {100,200,300,400,500};
		// int b;
		//  System.out.println(a.length);
		/*  for(int i=0;i<5;i++)                  classic for loop
		  {
			System.out.println(a[i]);
			
		  }*/
		  //enhanced for loop used for array ,array list, hash map
		/*  for(int i:a)
		  {
			  System.out.println(i);
			  
		  }*/
		  
		 //
		
		//int c[][]=new int[3][2];
		 /* c[0][0]=100;
		  c[0][1]=200;  */
		  
		  int c[][]= {{100,200},{300,400},{500,600}};
		  System.out.println(c.length);
		   
		  for( int i=0;i<c.length;i++)
		  {
			for(int j=0;j<c[i].length;j++) 
			
			{
				System.out.println(c[i][j]);
			}
		  }
		  System.out.println("done");		  
		
}
	  
	  public void  demo()
	  {
		  System.out.println("welcome to branching");
	  }
	  
	  public void  demo1()
	  {
		  System.out.println("welcome to branching1");
	  } 
	
}




 