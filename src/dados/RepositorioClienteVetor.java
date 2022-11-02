package dados;

import cliente.Cliente;
import java.util.Arrays;


public class RepositorioClienteVetor implements InterfaceCliente{
    private int tamanho = 0;
    private Cliente[] vetor = new Cliente[tamanho];;

    public RepositorioClienteVetor() {

    }


//    Arrumar!
    @Override
    public void cadastrar(Cliente cliente) {

        this.vetor[this.tamanho - 1] = cliente;

    }

    public void imprimir(){
        System.out.println(Arrays.toString(this.vetor));
    }
}
