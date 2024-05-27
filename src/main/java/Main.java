import com.gchaldu.cliente.Cliente;
import com.gchaldu.cliente.ClienteController;
import com.gchaldu.cliente.ClienteRepository;
import com.gchaldu.cliente.ClienteView;

public class Main {
    public static void main(String[] args) {
        ClienteRepository clienteService = new ClienteRepository();
        ClienteView clienteView = new ClienteView();

        ClienteController clienteController = new ClienteController(clienteService, clienteView);
        clienteController.addCliente();
        clienteController.getClienteView().showAllClientes(clienteController.getClienteRepository().getClientes());
        // Crear un nuevo cliente
//        Cliente cliente1 = new Cliente(1, "Juan Perez", "juan.perez@example.com");
//        Cliente cliente2 = new Cliente(2, "Maria Sanchez", "maria.sanchez@example.com");
//        clienteService.addCliente(cliente1);
//        clienteService.addCliente(cliente2);

        // Leer clientes
//        System.out.println("Lista de clientes:");
//        clienteView.showAllClientes(clienteService.getClientes());

        /*// Actualizar un cliente
        Cliente clienteActualizado = new Cliente(1, "Juan Pérez", "juan.perez@newemail.com");
        clienteService.updateCliente(clienteActualizado);

        // Leer cliente actualizado
        System.out.println("Cliente actualizado:");
        System.out.println(clienteService.getCliente(1));

        // Eliminar un cliente
        clienteService.deleteCliente(1);

        // Leer clientes después de eliminar
        System.out.println("Lista de clientes después de eliminar:");
        clienteService.getClientes().forEach(System.out::println);*/
    }
}
