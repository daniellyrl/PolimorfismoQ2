public class Livro extends Produtos{

    public Livro(String nome, double preço) {
        super(nome, preço);
    }
    @Override
    public double desconto(){
        return this.preço * 0.9;
    }
}
