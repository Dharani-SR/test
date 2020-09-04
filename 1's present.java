import java.util.*;

public class Main
{
	
public static void main(String[] args) {
	    
Scanner sc = new Scanner(System.in);
	    
int d=sc.nextInt();
	    
int c=0;
	    
for(int i=1;i<=d;i++){
	       
 String str=String.valueOf(i);
	       
 char k[]=str.toCharArray();
	       
 for(Character e:k){
	            
if(e=='1'){
	               
 c++;
	            
}
	        
}
	   
 }
		
System.out.println(c);
	
}

}
