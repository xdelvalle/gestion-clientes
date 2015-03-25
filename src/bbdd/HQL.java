package bbdd;

public class HQL {
    public static String FIND_CLIENTE_BY_ID     = "from Clientes c where c.id = '";
    public static String FIND_CLIENTE_BY_NAME   = "from Clientes c where c.nombre = '";
    public static String FIND_CLIENTE_LIKE_NAME = "from Clientes c where c.nombre like '";
    public static String AND_APELLIDO           = " and c.apellido1 like '";
    public static String FIND_CLIENTE_BY_PHONE  = "from Clientes c where c.telefono = '";
    public static String OR_MOVIL               = " or c.movil = '";
    public static String FIND_LISTA_CLIENTES    = "from Clientes order by Apellido1";
    public static String FIND_HISTORICOS_BY_ID  = "from Historicos h where h.id = ";
    public static String FIND_LISTA_CUMPLEANYOS = "from Clientes c where c.fechaNacimiento like '";
    public static String FIND_LISTA_EMAILS      = "from Clientes c where c.email is not null";
}
