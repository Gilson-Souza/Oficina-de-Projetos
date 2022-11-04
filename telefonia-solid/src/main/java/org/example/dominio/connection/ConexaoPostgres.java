package org.example.dominio.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgres implements IConexao {

    @Override
    public Connection getConexao() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        return DriverManager
                .getConnection("jdbc:postgresql://127.0.0.1:5432/registro-uso",
                        "postgres",
                        "itachi10");
    }


}
