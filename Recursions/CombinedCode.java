import java.util.Scanner;

public class Recursions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printViaRecursion(n, "Arnav");
        printUptoN(n);
        printNtoUno(n);
        sumUptoN(n);
        System.out.println(fact(n));
        int arr[] = {1, 2, 3, 4, 5};
        for(int a : arr) System.out.print(a);
        reverseArray(arr);
        System.out.println("");
        for(int a : arr) System.out.print(a);
        System.out.println(checkForPalindrom("abba"));
        System.out.println(fibbonaciNum(n));
        sc.close();
    }

    //Print Name N times
    public static void printViaRecursion(int n, String name){
        if(n < 0){
            System.out.println("Invalid value for N");
            return;
        }
        if(n == 0){
            return;
        } else {
            System.out.print(name + " ");
            printViaRecursion(n - 1, name);
        }
    }

    //Print 1 to N
    static int i = 1;
    public static void printUptoN(int n){
        if(n < 0) return;
        if (i == n){
            System.out.print(i);
            return;
        } else {
            System.out.print(i + " ");
            i++;
            printUptoN(n);
        }
    }

    //Print N to 1
    static void printNtoUno(int n){
        if(n < 0) return;
        if(n == 0){
            return;
        } else {
            System.out.println(n);
            printNtoUno(n - 1);
        }
    }

    //Sum upto N
    static int sum = 0;
    static int x = 0;
    static int sumUptoN(int n){
        if(n < 0){
            return 0;
        }
        if(x == n){
            System.out.println(sum);
            return sum;
        } else {
            sum = sum + x;
            x++;
            return sumUptoN(n);
        }
    }

    //Factorial upto N
    static int fact(int n){
        if (n < 0) return 0;
        if (n == 0){
            return 1;
        }
        else {
            return n * fact(n - 1);
        }
    }

    //Reverse an Array
    static int traverseArray = 0;
    static void reverseArray(int[] arr){
        if(arr.length == 0) return;
        if(traverseArray == arr.length/2) return;
        else {
            int temp = arr[traverseArray];
            arr[traverseArray] = arr[arr.length - traverseArray - 1];
            arr[arr.length - traverseArray - 1] = temp;
            traverseArray++;
            reverseArray(arr);
        }
    }

    //Check for palindrome in String
    static int checkingS = 0;
    static boolean checkForPalindrom(String s){
        if(s.length() == 0) return false;
        if(checkingS == s.length() / 2) return true;
        else{
            if(s.charAt(checkingS) == s.charAt(s.length() - checkingS - 1)){
                checkingS++;
                return checkForPalindrom(s);
            } else {
                return false;
            }
        }
    }

    //Fibbonaci upto Nth term
    static int fibbonaciNum(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else {
            return fibbonaciNum(n - 1) + fibbonaciNum(n - 2);
        }
    }
}
