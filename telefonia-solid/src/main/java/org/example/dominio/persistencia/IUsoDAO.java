package org.example.dominio.persistencia;

import org.example.dominio.Uso;
import org.example.dominio.connection.ExcecaoPersistencia;

import java.util.List;

public interface IUsoDAO {

    void registrar(Uso uso) throws ExcecaoPersistencia;
    List<Uso> listarUso();


}
