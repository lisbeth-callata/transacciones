# Proyecto de Gestión de Transacciones

Este es un microservicio que gestiona las transacciones bancarias de un sistema, permitiendo realizar operaciones como **depósitos**, **retiros**, y **transferencias**. El proyecto está basado en **Spring Boot**, con **Spring WebFlux** para programación reactiva, y utiliza **MongoDB** para almacenar el historial de transacciones.

## Requerimientos

- **Java 17** o superior
- **Spring Boot** 3.x
- **MongoDB** (para la base de datos)
- **Postman** (para probar las funcionalidades de la API)

## Descripción del Proyecto

El sistema permite a los usuarios realizar los siguientes tipos de transacciones:

- **Depósito:** Permite agregar fondos a una cuenta.
- **Retiro:** Permite retirar fondos de una cuenta.
- **Transferencia:** Permite transferir fondos entre dos cuentas.

### Arquitectura

Este proyecto sigue una arquitectura de microservicios y está construido utilizando los siguientes componentes:

- **Spring Boot:** Para la creación del microservicio.
- **Spring WebFlux:** Para implementar la programación reactiva.
- **MongoDB:** Para almacenar el historial de transacciones.
- **OpenAPI:** Para documentar la API utilizando el enfoque *Contract First*.

## Funcionalidades

### Microservicio de Transacciones

El microservicio de transacciones permite realizar operaciones de:

- **💰 Registrar un Depósito**
- **💸 Registrar un Retiro**
- **🔄 Registrar una Transferencia**

El historial de transacciones está almacenado en **MongoDB** y se puede consultar a través de un endpoint.

## Endpoints
### 1. **Crear Cuentas**

- **URL:** `http://localhost:8085/api/cuentas`
- **Método:** `POST`
- **Descripción:** Crea una cuenta.
- **Cuerpo de la solicitud:** 


```json
{
    "numeroCuenta": "123456789",
    "saldo": 1000.0,
    "tipoCuenta": "AHORROS",
    "clienteId": "672baead077bfeb5056b92a4",
}
###
### 1. **Crear Cuentas**
