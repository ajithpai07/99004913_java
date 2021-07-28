import java.util.*;
public class Stringchange{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Firstname:");
String stringF=sc.next();
System.out.println("Enter your Lastname:");
String stringS=sc.next();
String FL= stringF.substring(0,1);
String RL= stringF.substring(1);
RL=RL.toLowerCase();
FL=FL.toUpperCase();
stringF=FL+RL;
stringS=stringS.toUpperCase();
System.out.print(stringF);
System.out.print(" "+stringS);
}
}