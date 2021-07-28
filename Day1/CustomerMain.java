import java.util.*;
class Customer{

private String name;
private String address;
private String mobile;
public void getter(){
System.out.println(name);
System.out.println(address);
System.out.println(mobile);
}
public void setter(String[] str){
this.name=str[0];
this.address=str[1];
this.mobile=str[2];
}
}

public class CustomerMain{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter details:");
String inp=sc.nextLine();
String[] str= inp.split(",");
Customer cust= new Customer();
cust.setter(str);
cust.getter();
}
}