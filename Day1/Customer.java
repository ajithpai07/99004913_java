import java.util.*;
public class Customer{

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
