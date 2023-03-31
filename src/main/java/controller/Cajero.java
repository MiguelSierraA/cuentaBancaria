package controller;

import models.Cliente;

import java.util.List;

public class Cajero {

    private List<Cliente> clientes;

    public Cajero(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
