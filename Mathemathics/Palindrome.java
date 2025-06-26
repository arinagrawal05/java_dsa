 
public class Palindrome {
  public static void main(String[] args)  { 
  boolean isPalindrome= isPalindrome(23432);
  
  System.out.println("answer is " + isPalindrome);
}

static private boolean isPalindrome(int n){
int  temp=n;
int rev=0;
while (temp != 0) {
 
int lastDigit=temp % 10;
rev=rev*10+lastDigit;
temp=temp/10;
}
return (n==rev); 

}
}