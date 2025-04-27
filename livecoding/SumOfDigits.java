package livecoding;

public class SumOfDigits {
    public static int sum(int n) {
        int result = 0;
        while (n != 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }

    // 987 result 24
    public static void main(String[] args) {
        int n = 987;
        System.out.println(sum(n));
    }
}
