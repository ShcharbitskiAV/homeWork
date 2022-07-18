public class Task1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++){
            for(int j = 0; i > 6; j--)
                System.out.print(" ");
            for(int k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

