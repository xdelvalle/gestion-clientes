package bbdd;

import java.util.List;
import model.Clientes;
import model.Historicos;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.Utils;

public class GestionBDMySQL implements IGestionBD {

    public void firstConnection() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();
    }
    
    public boolean addCliente(Clientes c) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        boolean res = false;
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(c);
            transaction.commit();
            res = true;
        }
        catch (HibernateException e) {
            transaction.rollback();
            System.out.println("HibernateException: " + e.getMessage());
            res = false;
        }
        catch (Exception ex) {
            transaction.rollback();
            System.out.println("Exception: " + ex.getMessage());
            res = false;
        }
        finally {
            session.close();
            return res;
        }
    }

    public List<Clientes> findCliente(int id, String nombre, String apellido, String telefono) {
        Query q = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            if (id > 50) {
                q = session.createQuery(HQL.FIND_CLIENTE_BY_ID + id + "'");
            }
            else if (!nombre.equals("") || !apellido.equals("")) {
                q = session.createQuery(HQL.FIND_CLIENTE_LIKE_NAME + nombre + "%'" + HQL.AND_APELLIDO + apellido + "%'");
            }
            else if (!nombre.equals("")) {
                q = session.createQuery(HQL.FIND_CLIENTE_LIKE_NAME + nombre + "%'");
            }
            else if (!telefono.equals("")) {
                q = session.createQuery(HQL.FIND_CLIENTE_BY_PHONE + telefono + "' " + HQL.OR_MOVIL + telefono + "'");
            }
            else {
                return null;
            }

            List<Clientes> listaClientes = q.list();
            tx.commit();
            return listaClientes;
        }
        catch (HibernateException he) {
            System.out.println("HibernateException: " + he.getMessage());
            return null;
        }
        finally {
            session.flush();
            session.close();
        }
    }

    public boolean removeCliente(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        boolean res = false;
        try {
            transaction = session.beginTransaction();
            Clientes cliente = (Clientes) session.get(Clientes.class, id);
            session.delete(cliente);

            Query q = session.createQuery(HQL.FIND_HISTORICOS_BY_ID + id);
            List<Historicos> listaHistoricos = q.list();
            int id_Historicos = 0;

            for (Historicos historico : listaHistoricos) {
                id_Historicos = historico.getIdHistorico();
                Historicos historicos = (Historicos) session.get(Historicos.class, id_Historicos);
                session.delete(historicos);
            }

            transaction.commit();
            res = true;
        }
        catch (HibernateException e) {
            transaction.rollback();
            System.out.println("HibernateException: " + e.getMessage());
            res = false;
        }
        catch (Exception ex) {
            transaction.rollback();
            System.out.println("Exception: " + ex.getMessage());
            res = false;
        }
        finally {
            session.close();
            return res;
        }
    }

    public List<Historicos> findHistoricos(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery(HQL.FIND_HISTORICOS_BY_ID + id);
            List<Historicos> listaHistoricos = q.list();
            tx.commit();
            return listaHistoricos;
        }
        catch (HibernateException he) {
            System.out.println("HibernateException: " + he.getMessage());
            return null;
        }
        finally {
            session.flush();
            session.close();
        }
    }

    public boolean addHistorico(Historicos h) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        boolean res = false;
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(h);
            transaction.commit();
            res = true;
        }
        catch (HibernateException e) {
            transaction.rollback();
            System.out.println("HibernateException: " + e.getMessage());
            res = false;
        }
        catch (Exception ex) {
            transaction.rollback();
            System.out.println("Exception: " + ex.getMessage());
            res = false;
        }
        finally {
            session.close();
            return res;
        }
    }

    public boolean removeHistorico(int idHistorico) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        boolean res = false;
        try {
            transaction = session.beginTransaction();
            Historicos historico = (Historicos) session.get(Historicos.class, idHistorico);
            session.delete(historico);
            transaction.commit();
            res = true;
        }
        catch (HibernateException e) {
            transaction.rollback();
            System.out.println("HibernateException: " + e.getMessage());
            res = false;
        }
        catch (Exception ex) {
            transaction.rollback();
            System.out.println("Exception: " + ex.getMessage());
            res = false;
        }
        finally {
            session.close();
            return res;
        }
    }

    public List<Clientes> getListClientes() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            List<Clientes> lista = session.createQuery(HQL.FIND_LISTA_CLIENTES).list();
            transaction.commit();
            return lista;
        }
        catch (HibernateException e) {
            transaction.rollback();
            System.out.println("HibernateException: " + e.getMessage());
            return null;
        }
        finally {
            session.close();
        }
    }

    public List<Clientes> getListaCumpleanyos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            List<Clientes> lista = session.createQuery(HQL.FIND_LISTA_CUMPLEANYOS + Utils.DatetimeNowBirthday() + "%'").list();
            transaction.commit();
            return lista;
        }
        catch (HibernateException e) {
            transaction.rollback();
            System.out.println("HibernateException: " + e.getMessage());
            return null;
        }
        finally {
            session.close();
        }
    }

    public List<Clientes> getListaMails() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            List<Clientes> lista = session.createQuery(HQL.FIND_LISTA_EMAILS).list();
            transaction.commit();
            return lista;
        }
        catch (HibernateException e) {
            transaction.rollback();
            System.out.println("HibernateException: " + e.getMessage());
            return null;
        }
        finally {
            session.close();
        }
    }
}
