package padrao.chainofresponsibility;

public class CommitBeta implements TipoCommit {
    private static CommitBeta commitBeta = new CommitBeta();

    private CommitBeta() {};

    public static CommitBeta getCommitBeta() {
        return commitBeta;
    }
}
