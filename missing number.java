import java.util.*;

public class Main
{
	
public static void main(String[] args) {
	    
Scanner sc = new Scanner(System.in);
	    
int d=sc.nextInt();
	    
List<Integer>k=new ArrayList<>();
	    
for(int i=0;i<d;i++){
	        k.add(sc.nextInt());
	    
}
	    
Collections.sort(k);
	    
int n=k.get(k.size()-1);
	   
 for(int i=1;i<=n;i++){
	       
 if(!k.contains(i)){
		       
System.out.println(i);
		       
return ;
	            
	       
 }
	   
 }
	
}

}
