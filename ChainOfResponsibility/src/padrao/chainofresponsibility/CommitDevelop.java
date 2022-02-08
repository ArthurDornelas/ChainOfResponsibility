package padrao.chainofresponsibility;

public class CommitDevelop implements TipoCommit {
    private static CommitDevelop commitDevelop = new CommitDevelop();

    private CommitDevelop() {};

    public static CommitDevelop getCommitDevelop() {
        return commitDevelop;
    }
}
