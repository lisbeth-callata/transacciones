package com.banco.transacciones.repository;


import com.banco.transacciones.model.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends ReactiveMongoRepository<Transaction, String> {
    // Agregar consultas personalizadas si es necesario
}
