class Palindrome {
    public boolean isPalindrome(int x) {
        int b=x;
        int n=0;
        int i=0;
        while(x>0){
            int rem =x%10;
            n= n*10+rem;
            x=x/10;


        }
        if(b==n){
            return(true);
        }else{
            return(false);
        }



    }
}

class Mains{
    public static void main(String[] args) {
        Palindrome newob=new Palindrome();
        boolean  x=newob.isPalindrome(101);
        if (x){
            System.out.println("The number is palindrome");

        }else{
            System.out.println("The number is not palindrome");
        }
    }

}