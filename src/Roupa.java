public class Roupa extends Produtos implements PreçoFixo{
    public Roupa(String nome, double preço) {
        super(nome, preço);
    }
    @Override
    public double desconto() {
        return this.preço;
    }

    @Override
    public void PreçoFixo(){

    }
}
