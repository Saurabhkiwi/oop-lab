import java.util.*;
class Time{
    int hour , min , sec;
    Time(){
        hour = 0 ; 
        min = 0 ;
        sec = 0 ;
    }
    Time(int h , int m , int s){
        hour = h ; 
        min = m ; 
        sec  = s ;

    }
    void display() {
        System.out.printf("%02d:%02d:%02d\n", hour, min, sec);
    }
    Time add(Time t) {
        int totalSeconds = this.sec + t.sec;
        int totalMinutes = this.min + t.min + totalSeconds / 60;
        int totalHours = this.hour + t.hour + totalMinutes / 60;

        return new Time(totalHours % 24, totalMinutes % 60, totalSeconds % 60);
    }
    public static void main(String[] args) {
        Time t1 = new Time(5 , 50 , 50);
        Time t2 = new Time(6 , 50 , 40);
        t1.display();
        t2.display();
        Time t3 = new Time();
        t3 = t1.add(t2);
        t3.display();
    }
}