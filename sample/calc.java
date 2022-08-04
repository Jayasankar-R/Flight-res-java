package sample;

import java.util.Scanner;


public class calc{
    public static void main(String[] args) {
        try (var ind = new Scanner(System.in)) {
          int no_tic,ch1;
          String[] seat=new String[100];
          int[] seat_no=new int[100];
          
          for(int i=0;i<=60;i++)
          {
            seat[i]="["+i+"]";      
          }
          int no_tic1;
          String[] seat1=new String[100];
          int[] seat_no1=new int[100];
          
          for(int i=0;i<=60;i++)
          {
            seat1[i]="["+i+"]";      
          }

          while(true) {
          System.out.println("\n*********WELCOME TO INDIGO AIRLINE ONLINE BOOKING********");
          System.out.println("\n**        1.BUSSINESS CLASS                             2.ECONOMY             **");
          
          ch1=ind.nextInt();
          
          
          switch(ch1)
          {
          case 1: System.out.println("\n____________INDIGO AIRLINES____________"); 
                  System.out.println("\n   *****************BUSSINESS CLASS********************    ");
                  System.out.println("\n         1.BOOKING         \n 2.CANCELING         \n3.EXIT      ");
                  ch1=ind.nextInt();
                  switch(ch1)
                  {
                  case 1:
                   int index;                
                  System.out.print("\n NO. OF SEATS:");
                  no_tic=ind.nextInt();
                   
                 for(int i=0;i<=60;i++)
                  {
                   if((i==10)||(i==20)||(i==30)||(i==40)||(i==50)||(i==60))
                    {
                     System.out.println("\n");  
                    }
                  System.out.print(     seat[i]);
                    }
                 System.out.println("\n**SELECT YOUR SEAT**");
                 for(int i=0;i<no_tic;i++)
                 {
              	   seat_no[i]=ind.nextInt();
                 index=seat_no[i];
                 seat[index]="x";
                 }
                 System.out.println("***********************************************************");
                 System.out.println("**               COCHIN INTERNATIONAL                     **");
                 System.out.println("**DATE:                 ~INDIGO AIRLINE~           TIMING: **");
                 System.out.println("**18-11-18                                      7:00AM   **");
                 for(int i=0;i<no_tic;i++)
                 {
                 System.out.println("**                 SEAT NO.:"+seat_no[i]+"                     **"); 
                 }
                 System.out.println("**                 TOTAL AMOUNT:"+no_tic*8000+"                 **");
                 System.out.println("**        THANKS FOR BOOKING                      **");
                 System.out.println("***********************************************************");
                 break;
                 case 2:
              	   int c_no,index2;
              	   int[] c=new int[50];
              	   System.out.println("\n Enter the no. of SEATS to be cancel");
              	   c_no=ind.nextInt();
              	   for(int i=0;i<c_no;i++)
              	   {
              	   System.out.print("\n Enter your SEAT no. for cancelling");
              	   c[i]=ind.nextInt();
              	   index2=c[i];
              	   seat[index2]="["+c[i]+"]";
              	   }
              	   System.out.println("Your ticket was Cancelled");
                 case 3:
              	   exit();
              default:
              	System.out.println("invalid case");
                  }
          case 2:
          	            System.out.println("\n____________INDIGO AIRLINES____________"); 
                          System.out.println("\n   **************ECONOMY***************    ");
                          System.out.println("\n         1.BOOKING        \n 2.CANCELING          \n 3.EXIT       ");
                          ch1=ind.nextInt();
                          switch(ch1)
                          {
                          case 1:
                          int index4;
                          System.out.print("\n NO. OF SEATS:");
                          no_tic1=ind.nextInt();
                           
                         for(int i=0;i<=60;i++)
                          {
                           if((i==10)||(i==20)||(i==30)||(i==40)||(i==50)||(i==60))
                            {
                             System.out.println("\n");  
                            }
                          System.out.print(     seat1[i]);
                            }
                         System.out.println("\n**SELECT YOUR SEAT**");
                         for(int i=0;i<no_tic1;i++)
                         {
                      	   seat_no1[i]=ind.nextInt();
                         index4=seat_no1[i];
                         seat1[index4]="x";
                         }
                         System.out.println("***********************************************************");
                         System.out.println("**               COCHIN INTERNATIONAL                     **");
                         System.out.println("**DATE:             ~INDGO AIRLINES~           TIMING: **");
                         System.out.println("**01-05-19                                      7:00AM   **");
                         for(int i=0;i<no_tic1;i++)
                         {
                         System.out.println("**                 SEAT NO.:"+seat_no1[i]+"                     **"); 
                         }
                         System.out.println("**                 TOTAL AMOUNT:"+no_tic1*3000+"               **");
                         System.out.println("**        THANKS FOR BOOKING TICKETS                     **");
                         System.out.println("***********************************************************");
                         break;
                         case 2:
                      	   int c_no1,index3;
                      	   int[] c1=new int[50];
                      	   System.out.println("\n Enter the no. of SEATS to be cancel");
                      	   c_no1=ind.nextInt();
                      	   for(int i=0;i<c_no1;i++)
                      	   {
                      	   System.out.print("\n Enter your SEAT no. for cancelling");
                      	   c1[i]=ind.nextInt();
                      	    index3=c1[i];
                      	   seat1[index3]="["+c1[i]+"]";
                      	   }
                      	   System.out.println("Your ticket was Cancelled");
                      	   break;
                         case 3:
                      	   exit();
                      	   break;
                      default:
                      	System.out.println("invalid case");
                          }
                  
          
          	
          

          }
          }
         
          
        }
    
    }


	private static void exit() {
		
		
	}
}