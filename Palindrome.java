class Palindrome {
    public static boolean isPalindrome(int num){
        int myNum = num;
        int reverse = 0;
        while (num != 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num/10;
        }
        if(myNum == reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(2222));
    }
}