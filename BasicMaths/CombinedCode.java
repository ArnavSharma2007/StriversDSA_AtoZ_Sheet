import java.util.Scanner;

public class basicMaths {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        
        //Count digits of a number
        // Method - 1
        // int n = sc.nextInt();
        // int count = 0;
        // while(n != 0){
        //     n = n / 10;
        //     count++;
        // }
        // System.out.println(count);

        // Method - 2
        // System.out.println(String.valueOf(n).length());

        //Reverse a number
        // int n = sc.nextInt();
        // int arr[] = new int[String.valueOf(n).length()];
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = (int)(n/(Math.pow(10, i))) % 10;
        // }
        // for(int a : arr){
        //     System.out.print(a);
        // }

        //Check for palindrome
        // int n = sc.nextInt();
        // int lengthOfN = String.valueOf(n).length();
        // int arr[] = new int[lengthOfN];
        // for(int i = 0; i < lengthOfN; i++){
        //     arr[i] = (int) (n / Math.pow(10, i) % 10);
        // }
        // boolean isPalindrome = false;
        // for(int i = 0; i < lengthOfN / 2; i++){
        //     if(arr[i] == arr[lengthOfN - i - 1]){
        //         isPalindrome = true;
        //     } else {
        //         isPalindrome = false;
        //         break;
        //     }
        // }
        // if(isPalindrome || lengthOfN == 1) System.out.println("The number is a palindrome");

        //GCD
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int gcd = 1;
        // int min = Math.min(a, b);
        // for(int i = 2; i <= min; i++){
        //     if(a % i == 0 && b % i == 0){
        //         gcd = i;
        //     }
        // }
        // System.out.println(gcd);

        //Armstrong number
        // int n = sc.nextInt();
        // int lengthOfN = String.valueOf(n).length();
        // int arr[] = new int[lengthOfN];
        // int check = 0;
        // for(int i = 0; i < lengthOfN; i++){
        //     arr[i] = (int) (n / (Math.pow(10, i)) % 10);
        // }
        // for(int i = 0; i < lengthOfN; i++){
        //     check += Math.pow(arr[i], lengthOfN);
        // }
        // if(check == n){
        //     System.out.println("Armstrong Number");
        // }

        //All divisors
        // int n = sc.nextInt();
        // for(int i = 2; i <= n; i++){
        //     if(n % i == 0){
        //         System.out.println(i);
        //     }
        // }

        //Prime number
        // int n = sc.nextInt();
        // boolean isPrime = true;
        // for(int i = 2; i < n; i++){
        //     if(n % i == 0){
        //         isPrime = false;
        //         break;
        //     }
        // }
        // System.out.println(isPrime);
        
        // sc.close();
    }   
}
