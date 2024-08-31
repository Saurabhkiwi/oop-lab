import java.util.Scanner;
class Emp{
    String name , city ;
    int salary , da, hra ;
    double total ;
    Scanner sc = new Scanner(System.in);
    void getdata(){
        
        System.out.println("enter name :");
        name = sc.next();
        System.out.println("enter city :");
        city = sc.next();
        System.out.println("enter salary :");
        salary = sc.nextInt();
        System.out.println("enter da : ");
        da = sc.nextInt();
        System.out.println("enter hra :");
        hra = sc.nextInt();
    }
    void calculate(){
         total =   salary+salary*da/100+salary*hra/100;
    }
    void display(){
          System.out.println("total salary is : " + total);
    }
}
class q2{
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.getdata();
        e1.calculate();
        e1.display();

    }
}