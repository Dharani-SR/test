import java.util.*;

public class Main
{
   
public static int angleOfClock(int h,int m){
        
int v=(int)((h*60+m)*0.5);
        
int ang=(m*6)-v;
        
if(ang<0)
        
ang=-ang;
        
return
        
Math.m(360-ang,ang);
   
 }
	
public static void main(String[] args) {
	
 Scanner sc = new Scanner(System.in);
	   
 String[] a=sc.nextLine().split(":");
	    
int h=Integer.valueOf(a[0]),m=Integer.valueOf(a[1]);
	    
if(m==30)
		
System.out.println("90 degrees");
		
else if(m==0)
		
System.out.println("180 degrees");
		
else
		
System.out.println("angleOfClock(h,m)"+"degrees");
	
}

}
