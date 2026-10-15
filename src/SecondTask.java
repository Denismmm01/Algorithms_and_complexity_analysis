public class SecondTask {

    public static int signal(int first, int difference, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Номер участка не может быть отрицательным: " + n);
        }
        if (n == 0) {
            return first;
        }
        return signal(first, difference, n - 1) + difference;
    }

    public static void main(String[] args) {
        System.out.println("Участок 4: " + signal(12, -3, 4));
    }
}