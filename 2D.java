  
  import java.util.*;
  import java.io.*;
  
    class D{
	
	 public static void main(String [] args)throws IOException{
	 
	    Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the Row & column ");	
        //int i=Integer.parseInt		
	    int r=sc.nextInt();
		int c=sc.nextInt();
		
		int arr[][]=new int[r][c];
		System.out.println("Enter the matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				 arr[i][j]=sc.nextInt();
			}
		
	}	
	  System.out.println("The Transpose of the Matrix is:");
	  
	  for(int i=0; i<c;i++)
	  {
		  
		  for(int j=0;j<r;j++){
			  
			  System.out.print(arr[j][i]+ " ");	  
		  }
		 System.out.println(); 
	  }
	 }
	 
	 
	
	
	}
	
	
	