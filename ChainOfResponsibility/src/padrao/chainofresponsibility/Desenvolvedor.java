package padrao.chainofresponsibility;

import java.util.ArrayList;

public abstract class Desenvolvedor {
    protected ArrayList listaCommits = new ArrayList();
    private Desenvolvedor desenvolvedorSuperior;

    public Desenvolvedor getDesenvolvedorSuperior() {
        return desenvolvedorSuperior;
    }

    public void setDesenvolvedorSuperior(Desenvolvedor desenvolvedorSuperior) {
        this.desenvolvedorSuperior = desenvolvedorSuperior;
    }

    public abstract String getDescricaoDesenvolvedor();

    public String aprovarCommit(Commit commit) {
        if (listaCommits.contains(commit.getTipoCommit())) {
            return getDescricaoDesenvolvedor();
        }
        else {
            if (desenvolvedorSuperior != null) {
                return desenvolvedorSuperior.aprovarCommit(commit);
            }
            else
            {
                return "Sem aprovação";
            }
        }
    }
}
