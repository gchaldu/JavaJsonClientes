package com.gchaldu.cliente;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private static final String FILE_PATH = "src/main/resources/clientes.json";
    private Gson gson = new Gson();
    private List<Cliente> clientes = new ArrayList<>();

    public ClienteRepository() {
        loadClientes();
    }

    private void loadClientes() {
        try (Reader reader = new FileReader(FILE_PATH)) {
            Type listType = new TypeToken<ArrayList<Cliente>>() {}.getType();
            clientes = gson.fromJson(reader, listType);
            if (clientes == null) {
                clientes = new ArrayList<>();
            }
        } catch (FileNotFoundException e) {
            clientes = new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveClientes() {
        try (Writer writer = new FileWriter(FILE_PATH)) {
            gson.toJson(clientes, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
        saveClientes();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente getClienteLambda(int id) {
        return clientes.stream().filter(cliente -> cliente.getId() == id).findFirst().orElse(null);
    }
    public Cliente getCliente(int id) {
        for (int i=0; i<clientes.size(); i++) {
            if(this.clientes.get(i).getId()==id){
                return this.clientes.get(i);
            }
        }
        return null;
    }
    public void updateCliente(Cliente cliente) {
        Cliente existingCliente = getCliente(cliente.getId());
        if (existingCliente != null) {
            existingCliente.setNombre(cliente.getNombre());
            existingCliente.setEmail(cliente.getEmail());
            saveClientes();
        }
    }

    public void deleteCliente(int id) {
        clientes.removeIf(cliente -> cliente.getId() == id);
        saveClientes();
    }
}
