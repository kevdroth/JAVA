package test;

import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        /*insertando nuevo objeto
        Persona personaNueva = new Persona("Carlos","Esparza","cesparza@gmail.com","1186685214");
        personaDao.insertar(personaNueva);
         */

        /*modificar un objeto de persona existente
        Persona personaModificar = new Persona(4,"Juan Carlos","Esparza","jcesparza@gmail.com","1174285921");
        personaDao.actualizar(personaModificar);
         */

        /*eliminar un objeto de persona
        Persona personaEliminar = new Persona(4);
        personaDao.eliminar(personaEliminar);
         */

        //listar los objetos persona
        List<Persona> personas = personaDao.seleccionar();
        for(Persona persona : personas){
            System.out.println("Persona= " + persona);
        }
    }
}
