package padrao.chainofresponsibility;

public class Commit {
    private TipoCommit tipoCommit;

    public Commit(TipoCommit tipoCommit) {
        this.tipoCommit = tipoCommit;
    }

    public TipoCommit getTipoCommit() {
        return tipoCommit;
    }

    public void setTipoCommit(TipoCommit tipoCommit) {
        this.tipoCommit = tipoCommit;
    }
}
