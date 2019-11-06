package main.java.ua.nure.itkn179.ponomarenko.usermanagement.db;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection createConnection() throws DatabaseException;
}
