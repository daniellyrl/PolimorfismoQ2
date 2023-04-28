public class Main {
    public static void main(String[] args) {
        Produtos l1 = new LivroRomance("É assim que acaba", 20);
        Produtos e1 = new Smartphone("Galaxy A14",900);
        Produtos r1 = new Blusa("Regata", 70);

        System.out.println("Informações do : + \n" +
                "Nome: " + l1.getNome() + "\n" +
                "Preço: " + l1.getPreço());
    }
}