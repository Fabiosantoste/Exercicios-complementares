package Armazenamento veiculos;
import java.util.Scanner;

class Motor {
    private int numCilindro;
    private int potencia;

    public Motor() {
        this.numCilindro = 0;
        this.potencia = 0;
    }

    public Motor(int numCilindro, int potencia) {
        this.numCilindro = numCilindro;
        this.potencia = potencia;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de cilindros: ");
        numCilindro = scanner.nextInt();
        System.out.print("Potência: ");
        potencia = scanner.nextInt();
    }

    public void print() {
        System.out.println("Número de cilindros: " + numCilindro);
        System.out.println("Potência: " + potencia);
    }
}