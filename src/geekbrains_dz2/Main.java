package geekbrains_dz2;


public class Main {

    public static void main(String[] args) {
        System.out.println(summm(10, 11));
        positiveandNegative(4);
        System.out.println(doHome(2));
        doHome6(5);
    }

    static boolean summm(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    static void positiveandNegative(int a) {
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    static boolean doHome(int a) {
        if (a < 0) return true;
        return false;
    }

    static void doHome6(int n) {
        for (int i = 1; i <= n; i++) {

            System.out.print("1");
        }

        System.out.println();
    }
}

