package padrao.chainofresponsibility;

public class CommitProducao implements TipoCommit {
    private static CommitProducao commitProducao = new CommitProducao();

    private CommitProducao() {};

    public static CommitProducao getCommitProducao() {
        return commitProducao;
    }
}
