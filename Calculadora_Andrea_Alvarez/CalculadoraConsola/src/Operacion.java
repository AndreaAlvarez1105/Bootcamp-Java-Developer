/**
 * Clase Operacion
 * Esta clase permite realizar operaciones matemáticas básicas como suma, resta, multiplicación, división, potencia y raíz cuadrada.
 * @version 1.0
 * @author Andrea Álvarez
 * */

public class Operacion {
    private float resultado;
    private Numero numero1;
    private Numero numero2;

    public Operacion() {
        this.numero1 = new Numero(0);
        this.numero2 = new Numero(0);
        this.resultado = 0;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public Numero getNumero1() {
        return numero1;
    }

    public void setNumero1(Numero numero1) {
        this.numero1 = numero1;
    }

    public Numero getNumero2() {
        return numero2;
    }

    public void setNumero2(Numero numero2) {
        this.numero2 = numero2;
    }


    /**
     * Realiza la suma de dos números.
     * @param num1 Primer número a sumar.
     * @param num2 Segundo número a sumar.
     * @return Resultado de la suma.
     */
    public float suma(float num1, float num2) {
        numero1.setNumero(num1);
        numero2.setNumero(num2);
        resultado = numero1.getNumero() + numero2.getNumero();
        return resultado;
    }


    /**
     * Realiza la resta de dos números.
     * @param num1 Minuendo.
     * @param num2 Sustraendo.
     * @return Resultado de la resta.
     */
    public float resta(float num1, float num2) {
        numero1.setNumero(num1);
        numero2.setNumero(num2);
        resultado = numero1.getNumero() - numero2.getNumero();
        return resultado;
    }

    /**
     * Realiza la multiplicación de dos números.
     * @param num1 Primer número a multiplicar.
     * @param num2 Segundo número a multiplicar.
     * @return Resultado de la multiplicación.
     */
    public float multiplicacion(float num1, float num2) {
        numero1.setNumero(num1);
        numero2.setNumero(num2);
        resultado = numero1.getNumero() * numero2.getNumero();
        return resultado;

    }


    /**
     * Realiza la división de dos números.
     * @param num1 Numerador.
     * @param num2 Denominador.
     * @return Resultado de la división. Si el denominador es cero, se imprime un mensaje y se retorna 0.
     */
    public float division(float num1, float num2) {
        numero1.setNumero(num1);
        numero2.setNumero(num2);
        if (numero2.getNumero() == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        } else if (numero1.getNumero() == 0) {
            return 0; // Si el numerador es cero, el resultado es cero
        }
        resultado = numero1.getNumero() / numero2.getNumero();
        return resultado;
    }

    /**
     * Calcula la potencia de un número elevado a otro.
     * @param num1
     * @param num2
     * @return
     */

    public float power(float num1, float num2) {
        numero1.setNumero(num1);
        numero2.setNumero(num2);

        resultado = (float) Math.pow(numero1.getNumero(), numero2.getNumero());
        return resultado;
    }

    /**
     * Calcula la raíz cuadrada de un número.
     * @param num1 Número del cual se desea calcular la raíz cuadrada.
     * @return Resultado de la raíz cuadrada.
     */
    public float sqrt(float num1) {
        numero1.setNumero(num1);

        resultado = (float) Math.sqrt(numero1.getNumero());
        return resultado;
    }


    /**
     * Imprime el resultado de la operación realizada.
     */
    public void imprimirResultado() {
        System.out.println("El resultado es: " + resultado);
    }
}
