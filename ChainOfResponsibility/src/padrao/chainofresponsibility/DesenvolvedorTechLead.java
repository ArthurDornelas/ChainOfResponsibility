package padrao.chainofresponsibility;

public class DesenvolvedorTechLead extends Desenvolvedor {
    public DesenvolvedorTechLead(Desenvolvedor superior) {
        listaCommits.add(CommitProducao.getCommitProducao());
        setDesenvolvedorSuperior(superior);
    }

    public String getDescricaoDesenvolvedor() {
        return "TechLead";
    }
}
