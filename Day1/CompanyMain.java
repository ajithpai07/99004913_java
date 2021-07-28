import java.util.*;
class Company{

private String name;
private String employees;
private String teamlead;
public void getter(){
System.out.println(name);
System.out.println(employees);
System.out.println(teamlead);
}
public void setter(String cmp, String emp, String lead){
this.name=cmp;
this.employees=emp;
this.teamlead=lead;
}
}

public class CompanyMain{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter Company name:");
String cmp=sc.nextLine();
System.out.println("Enter Employees:");
String emp=sc.nextLine();
System.out.println("Enter TeamLead:");
String lead=sc.nextLine();

Company cust= new Company();
cust.setter(cmp, emp, lead);
cust.getter();
}
}