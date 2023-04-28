public final class LivroRomance extends Livro{
    public LivroRomance(String nome, double preço){
        super(nome, preço);
    }
    @Override
    public double desconto(){
        return this.preço * 0.9;
    }
}
