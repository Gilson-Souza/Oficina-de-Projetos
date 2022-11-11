package org.example.dominio.util;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConnection {

    Connection getConnection() throws ClassNotFoundException, SQLException;

}
