import java.util.*;
abstract class Shape{
private int value;
abstract void calculateArea(int value);
public int getVal(){
return value;
}
public void setVal(int val){
this.value=val;
}
}
class circle extends Shape{
void calculateArea(int value){
double sum= 3.14*value*value;
System.out.println("Area of circle is: "+ sum);
}
}
class square extends Shape{
void calculateArea(int value){
float sum= value*value;
System.out.println("Area of Square is: "+ sum);
}
}
public class ShapeMain{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Shape:");
String shape= sc.next();
if(shape.equals("Circle")){
System.out.println("Enter the radius:");
int value=sc.nextInt();
Shape s=new circle();
s.calculateArea(value);
}
else if(shape.equals("Square")){
System.out.println("Enter the Side:");
int value=sc.nextInt();
Shape s=new square();
s.calculateArea(value);
}
else{
System.out.println("Invalid Shape");
}
}
}