
public class Remove_duplicate_String {

	public static void main(String[] args) {
     String str="deepak";
     String Strs=" ";
     for(int i=0;i<str.length();i++)
     {
    	 String str2=""+str.charAt(i);
    	 if(Strs.contains(str2))
    	 { continue;
    		 
    	 }
    	 Strs=""+str2;
    	 
    	 System.out.println(Strs); 
     }
     
	}

}
