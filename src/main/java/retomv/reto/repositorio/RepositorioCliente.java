/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retomv.reto.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import retomv.reto.interfaces.InterfaceCliente;
import retomv.reto.modelo.Cliente;

/**
 *
 * @author Jair
 */
@Repository
public class RepositorioCliente {
    @Autowired
    private InterfaceCliente crud1; 
    
    public List<Cliente> getAll(){
        return (List<Cliente>) crud1.findAll(); 
    }
    
    public Optional<Cliente> getCliente(int id){
        return crud1.findById(id); 
    }
    
    public Cliente save(Cliente cliente){
        return crud1.save(cliente); 
    }
    
    public void delete(Cliente cliente){
        crud1.delete(cliente);
    }
    
}
