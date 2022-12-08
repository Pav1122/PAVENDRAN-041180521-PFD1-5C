import java.util.Scanner;
public class Recursive {
public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);
String string1,string2; 
System.out.println("Enter String 1"); 
string1 = myObj.nextLine();
System.out.println("Enter String 2");
string2= myObj.nextLine(); 
String result = recursive(string1,string2,""); 
System.out.println(result); 
}
public static String recursive(String s1,String s2,String result) {
if (s1.length() == 1) {
return result+s1+s2;
}
else {
result=result+s1.charAt(0)+s2.charAt(0);
s1 = s1.substring(1);
s2 = s2.substring(1);
return recursive(s1,s2,result);
}
}
}