package org.example.dominio.criarPromocao;

import org.example.dominio.Contrato;

public interface IPromocao {

    void alterarPlanoPre(Contrato contrato);
    void alterarPlanoPos(Contrato  contrato);
    void alterarPlanoControle(Contrato contrato);


}
