public class ForIndexDemo {
    public static void main(String[] args) {
        // 1...10
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }
        // 10....1
        for (int i = 10; i >= 1; i--){
            System.out.println(i);

        }
        // 2.4.6.8
        for (int i = 2; i <= 10; i++){
            System.out.println(i);
        }
        // lap cac phan tu array
        int[] numbers = { 4,8,5,7,1,2,3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
