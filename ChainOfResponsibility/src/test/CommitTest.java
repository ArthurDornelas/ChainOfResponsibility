package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padrao.chainofresponsibility.*;

import static org.junit.jupiter.api.Assertions.*;

public class CommitTest {
    DesenvolvedorPleno desenvolvedorPleno;
    DesenvolvedorSenior desenvolvedorSenior;
    DesenvolvedorTechLead desenvolvedorTechLead;

    @BeforeEach
    void setUp() {
        desenvolvedorTechLead = new DesenvolvedorTechLead(null);
        desenvolvedorSenior = new DesenvolvedorSenior(desenvolvedorTechLead);
        desenvolvedorPleno = new DesenvolvedorPleno(desenvolvedorSenior);
    }

    @Test
    void deveRetornarDesenvolvedorPlenoParaAprovarCommit() {
        assertEquals("Pleno", desenvolvedorPleno.aprovarCommit(new Commit(CommitDevelop.getCommitDevelop())));
    }

    @Test
    void deveRetornarDesenvolvedorSeniorParaAprovarCommit() {
        assertEquals("Senior", desenvolvedorSenior.aprovarCommit(new Commit(CommitHomologacao.getCommitHomologacao())));
    }

    @Test
    void deveRetornarDesenvolvedorTechLeadParaAprovarCommit() {
        assertEquals("TechLead", desenvolvedorTechLead.aprovarCommit(new Commit(CommitProducao.getCommitProducao())));
    }

    @Test
    void deveRetornarSemAprovacaoParaAprovarCommit() {
        assertEquals("Sem aprovação", desenvolvedorPleno.aprovarCommit(new Commit(CommitBeta.getCommitBeta())));
    }
}
