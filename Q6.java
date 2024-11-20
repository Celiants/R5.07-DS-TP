public class Q6 {
    public static void main(String[] args) {
        int hauteur = Integer.parseInt(args[0]);
        for (int i = hauteur; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
