import java.util.*;
public class sortedPlayer{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
TreeSet<String> set= new TreeSet<String>();
System.out.println("Enter the number of matches");
int n= sc.nextInt();
for(int i=0;i<=n;i++){
String temp= sc.nextLine();
if(i==0){
    continue;
}
set.add(temp);
}
System.out.println(set);

}

}