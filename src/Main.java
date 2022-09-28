
public class Main {

    public static void main(String[] args) {
        String gas;
        final int NUM = 2;
        String word = "car";
        gas = NUM + word ;

        System.out.println(gas);

        if(NUM < 0 ) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили ноль");
        }

    }
}
