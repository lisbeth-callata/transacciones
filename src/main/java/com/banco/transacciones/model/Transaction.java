package com.banco.transacciones.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "transactions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @Id
    private String id;
    private TransactionType tipo;
    private Double monto;
    private LocalDateTime fecha;
    private String cuentaOrigen;
    private String cuentaDestino; // Solo es necesario para transferencias
}
