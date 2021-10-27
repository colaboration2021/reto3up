/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retomv.reto.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import retomv.reto.interfaces.InterfaceAuditorio;
import retomv.reto.modelo.Auditorio;

/**
 *
 * @author Jair
 */
@Repository
public class RepositorioAuditorio {
    @Autowired
    private InterfaceAuditorio crud; 
    
    public List<Auditorio> getAll(){
        return (List<Auditorio>) crud.findAll(); 
    }
    
    public Optional<Auditorio> getAuditorio(int id){
        return crud.findById(id); 
    }
    
    public Auditorio save(Auditorio auditorio){
        return crud.save(auditorio); 
    }
    
    public void delete(Auditorio auditorio){
        crud.delete(auditorio);
    }
    
}
