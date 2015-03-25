
import bbdd.GestionBDFactory;
import java.util.Iterator;
import java.util.List;
import model.Clientes;
import model.Historicos;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.run();
    }

    private void run() {
//        Clientes c = GestionBDFactory.getInstance().getBDMySQL().findCliente(51, null, null, null, null);
//        System.out.println(c.toString());

//        if(GestionBDFactory.getInstance().getBDMySQL().removeCliente(51)) {
//            System.out.println(c.toString());
//            System.out.println("Cliente borrado");
//        }
//        else
//            System.out.println("Cliente NO borrado!!");

//        Clientes c = new Clientes();
//        //c.setId(1000);
//        c.setNombre("Xavi");
//        c.setApellido1("del Valle");
//        c.setApellido2("Gombau");
//        c.setEdad("31");
//        c.setDireccion("Bilbao 237 3º 4ª");
//        c.setDireccionTipo("Calle");
//        c.setFechaNacimiento("17/11/1979");
//        c.setSexo("Hombre");
//        c.setTelefono("933087951");
//        c.setMovil("626917964");
//        c.setComentarios("Primer cliente!!");
//        c.setEmail("xavi.delvalle@gmail.com");

//        Historicos h = new Historicos("720", "19/02/2011", "Algun tratamiento 2", "1600", "No hay recomandaciones", "Total");
//        if(GestionBDFactory.getInstance().getBDMySQL().addHistorico(h)) {
//            System.out.println("Historico añadido!!");
//        }
//        else
//            System.out.println("Historico NO añadido!!");

//        if(GestionBDFactory.getInstance().getBDMySQL().addCliente(c)) {
//            System.out.println(c.toString());
//            System.out.println("Cliente añadido!!");
//        }
//        else
//            System.out.println("Cliente NO añadido!!");

//        List<Clientes> listaClientes = GestionBDFactory.getInstance().getBDMySQL().getListClientes();
//        Clientes cli;
//        for (Iterator iterator = listaClientes.iterator(); iterator.hasNext();) {
//            cli = (Clientes) iterator.next();
//            System.out.println(cli.toString());
//        }

//        GestionBDFactory.getInstance().getBDMySQL().removeCliente(720);

//        List<Historicos> lista = GestionBDFactory.getInstance().getBDMySQL().findHistoricos(51);
//        for(Historicos h : lista) {
//            System.out.println(h.toString());
//        }

        List<Clientes> cli = GestionBDFactory.getInstance().getBDMySQL().findCliente(0, "ma", "g", null);
        for(Clientes cliente : cli) {
            System.out.println(cliente.toString());
        }
    }
}
