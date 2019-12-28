package main.java.ua.nure.itkn179.ponomarenko.usermanagement.db;

import java.util.Collection;
public interface UserDao {


    public interface Dao<T> {
        <DatabaseException extends Throwable> T create(T entity) throws DatabaseException;

        void update(T entity) throws DatabaseException;

        void delete(T entity) throws DatabaseException;

        T find(long id) throws DatabaseException;

        Collection<T> findAll() throws DatabaseException;

        void setConnectionFactory(ConnectionFactory connectionFactory);


        public Collection findByName(String firstName, String lastName);
    }
}