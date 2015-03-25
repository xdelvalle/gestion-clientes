package bbdd;

public class GestionBDFactory {
    private static GestionBDFactory instance = new GestionBDFactory();

    private GestionBDFactory() {
        super();
    }

    public IGestionBD getBDMySQL() {
        return new GestionBDMySQL();
    }

    public static GestionBDFactory getInstance() {
        return instance;
    }
}
