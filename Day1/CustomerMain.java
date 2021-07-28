import java.util.*;
public class CustomerMain{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
String inp=sc.nextLine();
String[] str= inp.split(",");
Customer cust= new Customer();
cust.setter(str);
cust.getter();
}
}