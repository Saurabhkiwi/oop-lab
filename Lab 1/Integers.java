import java.util.Scanner;
class Integers{
public static void main(String args[]){
int a[]= new int[100]; int positive=0,negative=0,zero=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers:");
for(int i=0;i<10;i++){
a[i]= sc.nextInt();
if(a[i]>0){
positive = positive +1;
}
else if(a[i]<0){
negative=negative+1;
}
else{
zero=zero+1;
}
}
System.out.println("no of positives: "+ positive);
System.out.println("no of negatives: "+ negative);
System.out.println("no of zeros: "+ zero);
}
}