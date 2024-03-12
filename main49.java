public class Main {
    public static void main(String[] args) {
        int liczba = 5;
        int wynik = silnia(liczba);
        System.out.println("Silnia z " + liczba + " to: " + wynik);
    }

    public static int silnia(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * silnia(n - 1);
        }
    }
}
