public class tuxing {
    public static void main(String[] args) {
        //5*5长方形
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        //平行四边形
        String sum = "";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        //三角形
        for (int i = 1; i <=5; i++)
        {
            for (int j = 0; j <= 5 - i; j++)
            {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();

        }

        }
}
