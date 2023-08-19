package ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<PalavrasUnicas> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(new PalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra){
        PalavrasUnicas palavrasUnicas = null;
        for (PalavrasUnicas p : palavrasUnicasSet){
            if (p.getPalavra().equals(palavra)){
                palavrasUnicas = p;
                break;
            }
        }
        palavrasUnicasSet.remove(palavrasUnicas);
    }

    public boolean verificarPalavra(String palavra){
        boolean verificado = false;
        for (PalavrasUnicas p : palavrasUnicasSet){
            if (p.getPalavra().equals(palavra)){
                verificado = true;
                break;
            }
        }
        return verificado;
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }

}
