import java.util.Scanner;

public class tryCatchFinallyDemo {
    public static void main(String[] args) {
        try {

            //ArithmeticException
            int a = 1;
            int b = 1;
            System.out.println(a / b);

            //NullPointerException
            String s = null;
            //System.out.println(s.length());

            //ArithmeticException
            int[] array = {1, 2, 3};
            //System.out.println(array[100]);

            //Exception
            throw new IllegalAccessException("Ngoai le khong xac dinh");
        }catch (ArithmeticException exception) {
            System.out.println("Khong the chia cho 0");
        }catch (NullPointerException | ArrayIndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }catch (Exception exception) {
            System.out.println("Da co loi , vui long thu lai sau");
        }finally {
            System.out.println("Khoi finally luon duoc goi");
        }
    }
    // try catch
    // try finally
    // try catch finally
}
