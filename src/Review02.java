
public class Review02 {

    public static void main(String[] args) {
        // 整数iの値1から100より小さい間、処理を繰り返す
        for (int i = 1; i <= 100; i++) {
            // iの値が３で割り切れるかつ５で割り切れるなら”FizzBuss”と表示
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            // iの値が３で割り切れるなら”Fizz”と表示
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            // iの値が5で割り切れるなら”Buzz”と表示
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

}
