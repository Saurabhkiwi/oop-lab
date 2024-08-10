class Foreach{
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        for(int i : num){
            for(int j = 0 ; j<i; j++){
                System.out.print(i + "");
            }
            System.out.println();
        }
    }
}