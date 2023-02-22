package Model;

public interface IList<T> {
    /**
     * Insertar elemento al inicio
     * @param value valor
     */
    void InsertAtStart(T value);

    /**
     * Insertar valor al final
     * @param value valor
     */

    void InsertAtEnd(T value);

    /**
     * Insertar valor en un indice
     * @param value valor
     * @param index indice
     */

    void Insert(T value, int index);

    /**
     * Eliminar
     * @param index indice
     * @return null
     */

    T Delete(int index);

    /**
     * Eliminar al inicio
     * @return null
     */

    T DeleteAtStart();

    /**
     * Eliminar al final
     * @return null
     */

    T DeleteAtEnd();

    /**
     * Obtener
     * @param index indice
     * @return null
     */

    T Get(int index);

    /**
     * esta vacio o no
     * @return si o no
     */

    boolean IsEmpty();

    /**
     * Cuenta
     * @return numero de elementos
     */

    int Count();
}
