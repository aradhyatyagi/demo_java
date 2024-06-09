package Javapackage;

import java.util.Scanner;
public class sum {
    
	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l];
		int sum = 0;
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d]:",i);
			a[i]=input.nextInt();
		}
		for(int o:a)
		{
			if(o%2==1)
				sum = sum + o;
		}		
		System.out.println("Sum:"+sum);
    }
}


    

