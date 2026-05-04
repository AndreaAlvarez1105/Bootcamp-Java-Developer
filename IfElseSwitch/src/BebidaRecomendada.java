import java.util.Scanner;

public class BebidaRecomendada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qué edad tienes?");
        int edad = sc.nextInt();

        if (edad < 12){
            System.out.println("Recomendamos: Jugo natural");
        } else if (edad < 18) {
            System.out.println("Recomendamos: Refresco");
        }else {
            System.out.println("Recomendamos: Cerveza");
        }
        ;
    }


}

