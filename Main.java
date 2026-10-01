import java.util.Random;

public class Main {
    public static void main(String[] args) {


            Random random = new Random();

            int numero1 = random.nextInt(10) + 1;
            int numero2 = random.nextInt(10) + 1;
            int numero3 = random.nextInt(10) + 1;

            System.out.println("Arvotut numerot:");
            System.out.println(numero1);
            System.out.println(numero2);
            System.out.println(numero3);


            if (numero1 == 7 || numero2 == 7 || numero3 == 7) {
                System.out.println("Voitit!");
            } else {
                System.out.println("Hävisit!");
            }

    }





































}