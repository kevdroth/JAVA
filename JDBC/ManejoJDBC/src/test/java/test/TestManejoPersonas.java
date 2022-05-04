package test;

import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        //insertando nuevo objeto
        Persona personaNueva = new Persona("Carlos","Esparza","cesparza@gmail.com","1186685214");
        personaDao.insertar(personaNueva);

        personaDao.seleccionar();
        List<Persona> personas = personaDao.seleccionar();
        for(Persona persona : personas){
            System.out.println("Persona= " + persona);
        }
    }
}
