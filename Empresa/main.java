package Empresa;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        restaurante.insertData();
        System.out.println("\nDados do restaurante:");
        restaurante.print();
    }
}