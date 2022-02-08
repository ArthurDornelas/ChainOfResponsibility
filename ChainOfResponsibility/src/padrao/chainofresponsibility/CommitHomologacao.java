package padrao.chainofresponsibility;

public class CommitHomologacao implements TipoCommit {
    private static CommitHomologacao commitHomologacao = new CommitHomologacao();

    private CommitHomologacao() {};

    public static CommitHomologacao getCommitHomologacao() {
        return commitHomologacao;
    }
}
