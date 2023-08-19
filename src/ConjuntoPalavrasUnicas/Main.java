package ConjuntoPalavrasUnicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("oi");
        conjuntoPalavrasUnicas.adicionarPalavra("ola");
        conjuntoPalavrasUnicas.adicionarPalavra("pqp");
        conjuntoPalavrasUnicas.adicionarPalavra("alou");
        conjuntoPalavrasUnicas.adicionarPalavra("remover");

        conjuntoPalavrasUnicas.removerPalavra("remover");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("remover"));
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
