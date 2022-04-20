package accesodatos;

/*//interfaces son similares a las clases abstractas.
Los metodos son abstractos (no se implementan).
Caracteristicas similares: relacion de herencia (recomendable usar clase abstracta)
Comportamiento: usar interface.
Sus atributos son CONSTANTES: public final static*/

public interface IAccesoDatos {
    int MAX_REGISTRO = 10;

    void insertar();

    void listar();

    void actualizar();

    void eliminar();

}
