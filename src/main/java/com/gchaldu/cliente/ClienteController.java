package com.gchaldu.cliente;

public class ClienteController {
    private ClienteRepository clienteRepository;
    private ClienteView clienteView;

    public ClienteController(ClienteRepository clienteRepository, ClienteView clienteView) {
        this.clienteRepository = clienteRepository;
        this.clienteView = clienteView;
    }

    public void addCliente(){
        Cliente cliente = this.getClienteView().addCliente();
        this.getClienteRepository().addCliente(cliente);
    }

    public ClienteRepository getClienteRepository() {
        return clienteRepository;
    }

    public void setClienteRepository(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteView getClienteView() {
        return clienteView;
    }

    public void setClienteView(ClienteView clienteView) {
        this.clienteView = clienteView;
    }
}
