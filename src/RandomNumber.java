public class RandomNumber {
    public static void main(String[] args) {

        int[] numbers = {23, 3, 5, 7, 6, 8, 9, 0, 2, 3, 1, 2, 5, 66, 57, 33, 24, 54, 65, 1, 11};
        int oneLength = numbers.length;

        int oneRandomNumber = (int) (Math.random() * oneLength);

        int number = (numbers[oneRandomNumber]);
        System.out.println(number);
    }
}
