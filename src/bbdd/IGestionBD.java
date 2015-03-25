package bbdd;

import java.util.List;
import model.Clientes;
import model.Historicos;

public interface IGestionBD {
    // Priera conexion
    public void firstConnection();
    
    // Clientes
    public boolean addCliente(Clientes c);
    public List<Clientes> findCliente(int id, String nombre, String apellido, String telefono);
    public boolean removeCliente(int id);

    // Historicos
    public List<Historicos> findHistoricos(int id);
    public boolean addHistorico(Historicos h);
    public boolean removeHistorico(int idHistorico);

    // Varios
    public List<Clientes> getListClientes();
    public List<Clientes> getListaCumpleanyos();
    public List<Clientes> getListaMails();
}
