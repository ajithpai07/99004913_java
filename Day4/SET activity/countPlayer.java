import java.util.*;
public class countPlayer{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
HashSet<String> h= new HashSet<String>();
System.out.println("Enter the number of matches");
int n= sc.nextInt();
for(int i=0;i<=n;i++){
String temp= sc.nextLine();
if(i==0){
    continue;
}
h.add(temp);
}
System.out.println(h);
System.out.println(h.size());
}

}