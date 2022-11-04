package org.example.dominio.connection;

public class ExcecaoPersistencia extends Exception {

    public ExcecaoPersistencia() {
    }

    public ExcecaoPersistencia(String message) {
        super(message);
    }

    public ExcecaoPersistencia(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcecaoPersistencia(Throwable cause) {
        super(cause);
    }

    public ExcecaoPersistencia(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
