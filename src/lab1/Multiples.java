package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 3, 5);

        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;

        int i;
        for(i = 1; i < n; i++) {
            boolean divisibleBya = i % a == 0;
            boolean divisibleByb = i % b == 0;
            if(divisibleBya || divisibleByb) {
                count++;
            }
        }
        return count;
    }
}
