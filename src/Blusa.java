public class Blusa extends Roupa{
    public Blusa(String nome, double preço){
        super(nome, preço);
    }
    @Override
    public double desconto() {
        return this.preço;
    }
}
