public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Erro: O comprimento deve ser um número de ponto flutuante maior que 0.0 e menor que 20.0.");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Erro: A largura deve ser um número de ponto flutuante maior que 0.0 e menor que 20.0.");
        }
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Comprimento: " + rectangle.getLength());
        System.out.println("Largura: " + rectangle.getWidth());
        System.out.println("Perímetro: " + rectangle.calculatePerimeter());
        System.out.println("Área: " + rectangle.calculateArea());

        rectangle.setLength(5.0);
        rectangle.setWidth(3.0);

        System.out.println("\nNovos valores:");
        System.out.println("Comprimento: " + rectangle.getLength());
        System.out.println("Largura: " + rectangle.getWidth());
        System.out.println("Perímetro: " + rectangle.calculatePerimeter());
        System.out.println("Área: " + rectangle.calculateArea());
    }
}