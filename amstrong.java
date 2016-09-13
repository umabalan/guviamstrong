import java.io.*;
import java.util.*;
class Amstrong
{ public static void main(String args[]) 
{ 
System.out.println("enter a number:"); 
int no= new Scanner(System.in).nextInt(); 
if(isArmStrong(no))
{ System.out.println("Number : " + no + " is an Armstrong number"); 
}
else
{ System.out.println("Number : " + no + " is not an Armstrong number"); 
} } 
private static boolean isArmStrong(int no) 
{ 
int result = 0; 
int orig = no; 
while(no!= 0)
{ 
int  r= no%10; 
result = result + r*r*r;
no = no/10; 
} 
if(orig == result)
{ 
return true; 
} 
return false; 
} }


