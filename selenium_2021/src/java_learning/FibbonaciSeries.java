package java_learning;

public class FibbonaciSeries {

	    
	
	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int num=0;
		
        for(int a=0;a<=100;a++)
        {
	     if(num>50)
	     {
		break;
	       }
	    
	    System.out.println(num);
	    num=n1+n2;
	    
	      n1=n2;
	       n2=num;
	   }
		
	   }	
		
		
	   }


