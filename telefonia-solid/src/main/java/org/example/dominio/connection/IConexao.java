package org.example.dominio.connection;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConexao {

    Connection getConexao() throws SQLException, ClassNotFoundException;

}
