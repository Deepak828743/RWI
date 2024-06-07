
public class Palindrome {
     static String Str="nitin";
     static boolean pallindrom(String str)
     { 
    	 int i=str.length()-1, j=0;
    	 while(j<i)
    	 {
    		 if(str.charAt(j)!=str.charAt(i))
    		 {
    			 return false;
    		 }
    		 j++;
    		 i--;
    		 
    	 }
	
    	 return true;
     }
	public static void main(String[] args) 
	{
		
	   if( pallindrom(Str))
	   {
		   System.out.println("true");
	   }
	   else
	   {
		   System.out.println("false");
	   }
	}

}
