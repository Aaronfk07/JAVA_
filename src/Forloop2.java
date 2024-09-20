public class Forloop2 {
    public static void main(String[] args) {

        int summe = 0;

        for (int k = 2; k <= 1000; k += 2) {
            summe += k;
            System.out.println(summe);
        }
    }
}
