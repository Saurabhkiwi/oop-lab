class AnalyzeOutputs {
    public static void main(String[] args) {
        
        int x = 10;
        double y = x;
        System.out.println("Case a: " + y);
        double x2 = 10.5;
        int y2 = x2;
        System.out.println("Case b: " + y2); 
        double x3 = 10.5;
        int y3 = (int) x3;
        System.out.println("Case c: " + y3);
    }
} 