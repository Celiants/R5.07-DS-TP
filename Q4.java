public class Q4 {
    public static void main(String[] args) {
        int hauteur = Integer.parseInt(args[0]);
        for (int i = 1; i <= hauteur; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
