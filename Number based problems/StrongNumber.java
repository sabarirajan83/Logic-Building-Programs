class StrongNumber{
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static boolean isStrongNumber(int number){
        int temp = number;
        int sum = 0;

        while(temp > 0){
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args){
        int number = 145;

        System.out.println(isStrongNumber(number));
    }
}