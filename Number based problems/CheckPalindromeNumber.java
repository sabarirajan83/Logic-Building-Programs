class CheckPalindromeNumber{
    public static boolean isPalindrome(int number) {
        int orgNum = number;
        int revNum = 0;

        while (number != 0) {
            int digit = number % 10;
            revNum = revNum*10 + digit;
            number /= 10;
        }

        return orgNum == revNum;
    }

    public static void main(String args[]){
        int number = 12321;

        System.out.println(isPalindrome(number));
    }
}