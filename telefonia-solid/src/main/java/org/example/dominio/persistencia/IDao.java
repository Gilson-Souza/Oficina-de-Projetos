package org.example.dominio.persistencia;

import org.example.dominio.Uso;
import org.example.dominio.util.connection.ExcecaoPersistencia;

import java.util.List;

public interface IDao {

    void registrar(Uso uso) throws ExcecaoPersistencia;
    List<Uso> listarUso();


}
