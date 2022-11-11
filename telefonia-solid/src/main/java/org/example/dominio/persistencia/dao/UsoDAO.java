package org.example.dominio.persistencia.dao;

import org.example.dominio.Uso;
import org.example.dominio.util.connection.ExcecaoPersistencia;
import org.example.dominio.persistencia.IDao;

import java.util.List;

public class UsoDAO implements IDao {


    @Override
    public void registrar(Uso uso) throws ExcecaoPersistencia {

    }

    @Override
    public List<Uso> listarUso() {
        return null;
    }


}

