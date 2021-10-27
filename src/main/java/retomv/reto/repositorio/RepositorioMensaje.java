/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retomv.reto.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import retomv.reto.interfaces.InterfaceMensaje;
import retomv.reto.modelo.Mensaje;

/**
 *
 * @author Jair
 */
@Repository
public class RepositorioMensaje {
    @Autowired
    private InterfaceMensaje crud3; 
    
    public List<Mensaje> getAll(){
        return (List<Mensaje>) crud3.findAll(); 
    }
    
    public Optional<Mensaje> getMensaje(int id){
        return crud3.findById(id); 
    }
    
    public Mensaje save(Mensaje mensaje){
        return crud3.save(mensaje); 
    }
    
    public void delete(Mensaje mensaje){
        crud3.delete(mensaje);
    }
    
}
