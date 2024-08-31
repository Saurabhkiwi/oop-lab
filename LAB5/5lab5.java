class Number {
    private double val;

    Number(double v) {
        val = v;
    }

    boolean isZero() {
        return val == 0;
    }

    boolean isPositive() {
        return val > 0;
    }

    boolean isNegative() {
        return val < 0;
    }

    boolean isOdd() {
        return val % 2 != 0;
    }

    boolean isEven() {
        return val % 2 == 0;
    }

    boolean isPrime() {
        if (val <= 1) return false;
        for (int i = 2; i <= Math.sqrt(val); i++) {
            if (val % i == 0) return false;
        }
        return true;
    }

    boolean isArmstrong() {
        int n = (int) val;
        int sum = 0;
        int temp = n;
        int digits = String.valueOf(n).length();
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Number num = new Number(153);
        System.out.println("Is zero: " + num.isZero());
        System.out.println("Is positive: " + num.isPositive());
        System.out.println("Is negative: " + num.isNegative());
        System.out.println("Is odd: " + num.isOdd());
        System.out.println("Is even: " + num.isEven());
        System.out.println("Is prime: " + num.isPrime());
        System.out.println("Is Armstrong: " + num.isArmstrong());
    }
}