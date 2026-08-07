class patterns{
    public static void main(String[] args) {
        // Pattern - 1
        // for(int i = 0; i < 4; i++){
        //     for (int j = 0; j < 4; j++){
        //         System.out.print("*-");
        //     }
        //     System.out.println("");
        // }

        // Pattern - 2
        // for(int i = 0; i < 4; i++){
        //     for (int j = 0; j <= i; j++){
        //         System.out.print("*-");
        //     }
        //     System.out.println("");
        // }

        // Pattern - 3
        // for(int i = 0; i < 4; i++){
        //     for (int j = 0; j <= i; j++){
        //         System.out.print((j + 1) + "-");
        //     }
        //     System.out.println("");
        // }

        // Pattern - 4
        // for(int i = 0; i < 4; i++){
        //     for (int j = 0; j <= i; j++){
        //         System.out.print((i + 1) + "-");
        //     }
        //     System.out.println("");
        // }

        // Pattern - 5
        // for(int i = 0; i < 5; i++){
        //     for (int j = 5; j > i; j--){
        //         System.out.print("*-");
        //     }
        //     System.out.println("");
        // }

        // Pattern - 6
        // for(int i = 0; i < 5; i++){
        //     for (int j = 5; j > i; j--){
        //         System.out.print(j + "-");
        //     }
        //     System.out.println("");
        // }

        // Pattern - 7
        // for(int i = 0; i < 5; i++){
        //     for(int j = 5 - i; j > 0; j--){
        //         System.out.print("-");
        //     }
        //     for(int j = i*2 + 1; j > 0 ; j--){
        //         System.out.print("*");
        //     }
        //     for(int j = 5 - i; j > 0; j--){
        //         System.out.print("-");
        //     }
        //     System.out.println("");
        // }

        //Pattern - 8
        // for(int i = 0; i < 5; i++){
        //     for(int j = 0; j < 0 + i; j++){
        //         System.out.print("-");
        //     }
        //     for(int j = 10; j > i*2 + 1; j--){
        //         System.out.print("*");
        //     }
        //     for(int j = 0; j < 0 + i; j++){
        //         System.out.print("-");
        //     }
        //     System.out.println("");
        // }

        //Pattern - 9
        // for(int i = 0; i < 5; i++){
        //     for(int j = 5 - i; j > 0; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j = i*2 + 1; j > 0 ; j--){
        //         System.out.print("*");
        //     }
        //     for(int j = 5 - i; j > 0; j--){
        //         System.out.print(" ");
        //     }
        //     System.out.println("");
        // }
        // for(int i = 0; i < 5; i++){
        //     for(int j = 0; j < 0 + i + 1; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 10; j > i*2 + 1; j--){
        //         System.out.print("*");
        //     }
        //     for(int j = 0; j < 0 + i; j++){
        //         System.out.print(" ");
        //     }
        //     System.out.println("");
        // }

        //Pattern - 10
        // for(int i = 1; i < 6; i++){
        //     for(int j = 0; j < i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for(int i = 4; i > 0; i--){
        //     for(int j = 0; j < i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //Pattern - 11
        // for(int i = 1; i < 6; i++){
        //     for(int j = 0; j < i; j++){
        //         if((i+j) % 2 == 0) System.out.print("1 ");
        //         else System.out.print("0 ");
        //     }
        //     System.out.println("");
        // }

        //Pattern - 12
        // for(int i = 1; i < 5; i++){
        //     for(int j = 0; j < i; j++){
        //         System.out.print(j + 1);
        //     }
        //     for(int j = 5 - i - 1; j > 0; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j < 5 - i - 1; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = i; j >= 1; j--){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        //Pattern - 13
        // int num = 1;
        // for(int i = 1; i < 6; i++){
        //     for(int j = 0; j < i; j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println("");
        // }

        //Pattern - 14
        //char c = 'A';
        // for(int i = 1; i < 6; i++){
        //     for(int j = 0; j < i; j++){
        //         System.out.print(c);
        //         c++;
        //     }
        //     System.out.println("");
        //     c = 'A';
        // }

        //Pattern - 15
        // for(int i = 1; i < 6; i++){
        //     for(int j = 5 - i + 1; j > 0; j--){
        //         System.out.print(c);
        //         c++;
        //     }
        //     System.out.println("");
        //     c = 'A';
        // }

        //Pattern - 16
        // for(int i = 1; i < 6; i++){
        //     for(int j = 0; j < i; j++){
        //         System.out.print(c);
        //     }
        //     c++;
        //     System.out.println("");
        // }

        //Pattern - 17
        // for(int i = 0; i < 5; i++) {
        //     for(int j = 0; j < 5 - i - 1; j++) {
        //         System.out.print(" ");
        //     }
        //     c = 'A';
        //     for(int j = 0; j <= i; j++) {
        //         System.out.print(c);
        //         c++;
        //     }
        //     c -= 2;
        //     for(int j = 0; j < i; j++) {
        //         System.out.print(c);
        //         c--;
        //     }
        //     System.out.println();
        // }

        //Pattern 18
        // c = 'F';
        // for(int i = 1; i < 6; i++){
        //     c -= i;
        //     for(int j = 0; j < i; j++){
        //         System.out.print(c);
        //         c++;
        //     }
        //     System.out.println("");
        // }

        //Pattern - 19
        // for(int i = 0; i < 8; i++){
        //     int stars;
        //     if (i < 4)
        //         stars = 4 - i;
        //     else
        //         stars = i - 3;
        //     for (int j = 0; j < stars; j++)
        //         System.out.print("*");
        //     for (int j = 0; j < 8 - 2 * stars; j++)
        //         System.out.print(" ");
        //     for (int j = 0; j < stars; j++)
        //         System.out.print("*");
        //     System.out.println("");
        // }

        //Pattern - 20
        // for(int i = 0; i < 10; i++){
        //     int spaces;
        //     if(i < 5){
        //         spaces = 5 - i;
        //     } else {
        //         spaces = i - 5;
        //     }
        //     for(int j = 0; j < 5 - spaces; j++){
        //         System.out.print("*");
        //     }
        //     for(int j = 0; j < 2 * spaces; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 5 - spaces; j > 0; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //pattern - 21
        // for(int i = 0; i < 5; i++){
        //     for(int j = 0; j < 5; j++){
        //         if(i == 0 || i == 4){
        //             System.out.print("*");
        //         }
        //         else{
        //             if(j == 0 || j == 4){
        //                 System.out.print("*");
        //             } else {
        //                 System.out.print(" ");
        //             }
        //         }
        //     }
        //     System.out.println("");
        // }

        //Pattern - 22
        // for(int i = 0; i < 5; i++){
        //     for(int j = 0; j < 5; j++){
        //         int value;
        //         if(i == 0 || i == 4 || j == 0 || j == 4) value = 3;
        //         else if (i == 1 || i == 3 || j == 1 || j == 3) value = 2;
        //         else value = 1;
        //         System.out.print(value + " ");
        //     }
        //     System.out.println("");
        // }
    }
}
