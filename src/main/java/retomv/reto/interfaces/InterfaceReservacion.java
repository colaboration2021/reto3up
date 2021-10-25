/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package retomv.reto.interfaces;

import org.springframework.data.repository.CrudRepository;
import retomv.reto.modelo.Reservacion;

/**
 *
 * @author Itsumi
 */
public interface InterfaceReservacion extends CrudRepository<Reservacion, Integer>{
    
}
