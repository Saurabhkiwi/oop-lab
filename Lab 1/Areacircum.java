import java.util.Scanner;
class Areacircum{
public static void main(String args[]){
int l,b,circum,area;
Scanner sc = new Scanner(System.in);
System.out.println("enter length and breadth: ");
l=sc.nextInt();
b=sc.nextInt();
circum= 2*(l+b);
area=l*b;
System.out.println("the circumference is : " +circum+ " , and the area is : "+area);
}}