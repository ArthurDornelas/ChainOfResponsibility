package padrao.chainofresponsibility;

public class DesenvolvedorSenior extends Desenvolvedor {
    public DesenvolvedorSenior(Desenvolvedor superior) {
        listaCommits.add(CommitHomologacao.getCommitHomologacao());
        setDesenvolvedorSuperior(superior);
    }

    public String getDescricaoDesenvolvedor() {
        return "Senior";
    }
}
