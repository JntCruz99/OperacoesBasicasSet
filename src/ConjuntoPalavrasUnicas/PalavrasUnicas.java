package ConjuntoPalavrasUnicas;

public class PalavrasUnicas {

    private String Palavra;

    public PalavrasUnicas(String palavra) {
        Palavra = palavra;
    }

    public String getPalavra() {
        return Palavra;
    }

    public void setPalavra(String palavra) {
        Palavra = palavra;
    }

    @Override
    public String toString() {
        return "PalavrasUnicas{" +
                "Palavra='" + Palavra + '\'' +
                '}';
    }
}
