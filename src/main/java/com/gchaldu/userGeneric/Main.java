package com.gchaldu.userGeneric;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("pepe", "pepe@gmail.com");
        User user2 = new User("maria", "maria@gmail.com");
        User user3 = new User("juana", "juana@gmail.com");
        
        ClienteRepository<User> clienteRepository = new ClienteRepository<>();
        clienteRepository.add(user);
        clienteRepository.add(user2);
        clienteRepository.add(user3);
        
        clienteRepository.getUserList().forEach( cli ->{
            System.out.println(cli.getUsername());
        });
        
        String[] palabras = {"juana", "Ana", "Maria"};
        List<String> listaPalabras = arrayToList(palabras);
        
        listaPalabras.forEach(palabra->{
            System.out.println("palabra = " + palabra);
        });
        
        Integer[] integer = {11,22,33};
        List<Integer> listaNumeros = arrayToList(integer);
        
        listaNumeros.forEach( numero -> {
            System.out.println("numero = " + numero);
        });
    }

    public static <T> List<T> arrayToList(T[] array){
        return Arrays.asList(array);
    }
}
