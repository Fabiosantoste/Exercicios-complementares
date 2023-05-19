package Armazenamento veiculos;

class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;

    public CarroPasseio() {
        this.cor = "";
        this.modelo = "";
    }

    public CarroPasseio(int numCilindro, int potencia, int peso, int velocMax, float preco, String cor, String modelo) {
        super(numCilindro, potencia, peso, velocMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public void insertData() {
        super.insertData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cor: ");
        cor = scanner.nextLine();
        System.out.print("Modelo: ");
        modelo = scanner.nextLine();
    }

    public void print() {
        super.print();
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
    }
}
