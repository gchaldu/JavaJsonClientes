package com.gchaldu.cliente;

import java.util.List;
import java.util.Scanner;

public class ClienteView {

    public void showCliente(Cliente cliente){
        System.out.println("Id: " + cliente.getId());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Email: " + cliente.getEmail());
    }

    public void showAllClientes(List<Cliente> clienteList){
        for (Cliente cliente: clienteList) {
            this.showCliente(cliente);
        }
    }

    public Cliente addCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el id");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el email");
        String email = scanner.nextLine();
        return new Cliente(id, nombre, email);
    }
}
