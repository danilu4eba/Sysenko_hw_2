import java.util.Random;

public class Main {
    public static void main(String[] args) {
        addition(19, -21);
        addition(10, 29);
        addition(40, 15);
        addition(60, 10);
        addition(70, 45);
        addition(generateRandomAge(),10);
    }

    public static int addition(int age, int temperature) {
        String getYes = "Можно иди гулять";
        String getNo = "Оставайтесь дома";
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            System.out.println(getYes);
        } else if ((age < 20 && temperature > 0 && temperature < 28)) {
            System.out.println(getYes);
        } else if (age > 45 && temperature > -10 && temperature < 20) {
            System.out.println(getYes);
        } else {
            System.out.println(getNo);
        }
        int value = age + temperature;
        return value;
    }

    public static int generateRandomAge() {
        int randomInt = new Random().ints(1, 1, 100).findFirst().getAsInt();
       //System.out.println(randomInt); //для проверки случайного числа
        return randomInt;
    }

   /*
   public static int generateRandomTemperature() {
        int randomInt = new Random().ints(1, -50, 50).findFirst().getAsInt();
       //System.out.println(randomInt); // для проверки случайного числа
        return randomInt;
    }
    */

}