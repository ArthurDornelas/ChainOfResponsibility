package padrao.chainofresponsibility;

public class DesenvolvedorPleno extends Desenvolvedor {
    public DesenvolvedorPleno(Desenvolvedor superior) {
        listaCommits.add(CommitDevelop.getCommitDevelop());
        setDesenvolvedorSuperior(superior);
    }

    public String getDescricaoDesenvolvedor() {
        return "Pleno";
    }
}
