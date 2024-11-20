# **Gestión de Transacciones | NTTDATA Bootcamp**

---

## Descripción

Este es un microservicio que gestiona las transacciones bancarias de un sistema, permitiendo realizar operaciones como **depósitos**, **retiros**, y **transferencias**. El proyecto está basado en **Spring Boot**, con **Spring WebFlux** para programación reactiva, y utiliza **MongoDB** para almacenar el historial de transacciones.

---

## **Requerimientos**

- **Java 17** o superior
- **Spring Boot** 3.x
- **MongoDB** (para la base de datos)
- **Postman** (para probar las funcionalidades de la API)

---

## **Funcionalidades**

El microservicio de transacciones permite realizar operaciones como:

- **💰 Realizar un Depósito**
- **💸 Realizar un Retiro**
- **🔄 Realizar una Transferencia**

El historial de transacciones está almacenado en **MongoDB** y se puede consultar a través de un endpoint.

---

## **Endpoints**

### 1. **Crear Cuenta**

- **URL:** `http://localhost:8085/api/cuentas`
- **Método:** `POST`
- **Cuerpo de la solicitud:**
{
    "numeroCuenta": "123456789",
    "saldo": 1000.0,
    "tipoCuenta": "AHORROS",
    "clienteId": "672baead077bfeb5056b92a4",
}

### 2. **Realizar Retiro**

- **URL:** `http://localhost:8085/api/transacciones/retiro`
- **Método:** `POST`
- **Cuerpo de la solicitud:**
{
  "monto": 900.0,
  "cuentaOrigen": "123456789"
}

### 3. **Realizar Depósito**

- **URL:** `http://localhost:8085/api/transacciones/deposito`
- **Método:** `POST`
- **Cuerpo de la solicitud:** 
{
  "monto": 900.0,
  "cuentaOrigen": "123456789"
}

### 4. **Realizar Transferencia**

- **URL:** `http://localhost:8085/api/transacciones/transferencia`
- **Método:** `POST`
- **Cuerpo de la solicitud:** 
{
  "monto": 100.0,
  "cuentaOrigen": "123456789",
  "cuentaDestino": "101112131415"
}

### 5. **Consultar historial**

- **URL:** `http://localhost:8085/api/transacciones/historial`
- **Método:** `GET`

---

## **Autor**

- [Lisbeth Callata](https://github.com/lisbeth-callata)
