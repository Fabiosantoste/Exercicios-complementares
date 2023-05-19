package Armazenamento veiculos;

class Veiculo extends Motor {
    private int peso;
    private int velocMax;
    private float preco;

    public Veiculo() {
        this.peso = 0;
        this.velocMax = 0;
        this.preco = 0.0f;
    }

    public Veiculo(int numCilindro, int potencia, int peso, int velocMax, float preco) {
        super(numCilindro, potencia);
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public void insertData() {
        super.insertData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Peso (em quilos): ");
        peso = scanner.nextInt();
        System.out.print("Velocidade Máxima (em Km/h): ");
        velocMax = scanner.nextInt();
        System.out.print("Preço (em R$): ");
        preco = scanner.nextFloat();
    }

    public void print() {
        super.print();
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Velocidade Máxima: " + velocMax + " Km/h");
        System.out.println("Preço: R$" + preco);
    }
}