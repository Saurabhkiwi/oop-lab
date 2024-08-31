import java.util.*;
class Box{
    double length , width , height ;
    void dimensions (double l , double b , double  h){
        length = l ;
        width = b;
        height = h ;
    }
    double volume(){
        double vol = length*width*height ; 
        return vol;
    }
    
}
class main{
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.dimensions(5,5,5);

       
        System.out.println("The volume of the box is : " + b1.volume());

    }
}