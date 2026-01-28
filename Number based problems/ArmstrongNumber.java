class ArmstrongNumber{
    public static boolean isArmstrongNumber(int num){
        int dig = (int)Math.log10(num) + 1;
        int sum = 0;
        int temp = num;

        while(temp != 0){
            int val = temp % 10;
            sum += Math.pow(val, dig);
            temp /= 10;
        }

        return num == sum;
    }

    public static void main(String[] args){
        int number = 153;

        System.out.println(isArmstrongNumber(number));
    }
}