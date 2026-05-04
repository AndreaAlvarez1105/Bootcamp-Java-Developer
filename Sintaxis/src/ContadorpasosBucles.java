public class ContadorpasosBucles {
    public static void main(String[] args) {
         //uso de bubcle for
        for (int i = 1; i <= 5; i++){
            System.out.println("Paso = " + i);;
        }

        //uso de bucle while
        int pasos = 6;
        while(pasos <= 10){
            System.out.println("Pasos = " + pasos);
            pasos++;
        }

        //Uso de bucle do-while
        int pasoExtra = 11;
        do {
            System.out.println("Paso = " + pasoExtra);
            pasoExtra++;
        } while(pasoExtra <= 15);
    }
}
