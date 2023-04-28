public class Smartphone extends Eletronico{
    public Smartphone (String nome, double preço){
        super(nome, preço);
    }

    @Override
    public double desconto(){
        return this.preço * 0.95;
    }
}
