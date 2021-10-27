/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package retomv.reto.interfaces;

import org.springframework.data.repository.CrudRepository;
import retomv.reto.modelo.Cliente;

/**
 *
 * @author Jair
 */
public interface InterfaceCliente extends CrudRepository<Cliente, Integer> {
    
}
