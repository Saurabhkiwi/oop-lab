import java.util.Scanner;
class element_found{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={1,2,3,1,2,1,5,6,7};
        System.out.println("enter element to be searched: ");
        int what = sc.nextInt();
        int index = 0;
        int count = 0;
        for(int i : a){
            if(i == what){
                System.out.println("a["+index+"]");
                count ++;
            }
            index ++;
        }
        if(count ==0){
            System.out.println("element not found !!!!");
        }
    }
}