package org.example.dominio.persistencia;

import org.example.dominio.Uso;
import org.example.dominio.connection.ExcecaoPersistencia;

import java.util.List;

public class UsoDAO implements IUsoDAO{


    @Override
    public void registrar(Uso uso) throws ExcecaoPersistencia {

    }

    @Override
    public List<Uso> listarUso() {
        return null;
    }
}

