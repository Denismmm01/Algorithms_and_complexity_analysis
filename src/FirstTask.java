public class FirstTask {

    public static int countDigits(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным: " + n);
        }
        if (n < 10) {
            return 1;
        }
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Количество цифр в 572: " + countDigits(572));
    }
}