package org.example.dominio.util.connection;

import org.example.dominio.util.IConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPostgres implements IConnection {

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        return DriverManager
                .getConnection("jdbc:postgresql://127.0.0.1:5432/registro-uso",
                        "postgres",
                        "itachi10");

    }


}
