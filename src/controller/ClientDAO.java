package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Client;

/**
 *
 * @author Wesley
 */
public class ClientDAO {
    
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public ClientDAO() {
        this.emf = Persistence.createEntityManagerFactory("GymManagementPU");
        this.em = emf.createEntityManager();
    }
    
    public int save(Client u) {
        try {
            Client obj;
            if (u.getId() == null) {
                obj = u;
            } else {
                obj = em.find(Client.class, u.getId());
                obj.setLogin(u.getLogin());
            }
            em.getTransaction().begin();
            u = em.merge(obj);
            em.getTransaction().commit();
            return u.getId().intValue();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            em.close();
            emf.close();
        }
    }
    
    public int deletar(int id) {
        try {
            Client obj = em.find(Client.class, new Long(id));
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
            return obj.getId().intValue();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            em.close();
            emf.close();
        }
    }
    
    public List<Client> listar() {
        try {
            Query u = em.createQuery("SELECT u FROM Client u ORDER BY p.login");
            return u.getResultList();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            em.close();
            emf.close();
        }
    }

    public List<Client> pesquisarPorNome(String nome) {
        try {
            Query u = em.createQuery("SELECT p FROM Produto p WHERE p.nome LIKE :nome ORDER BY p.nome");
            u.setParameter("nome", "%" + nome + "%");
            return u.getResultList();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }
    
    public List<Client> pesquisarPorId(int id) {;
        try {
            Query u = em.createQuery("SELECT p FROM Produto p WHERE p.id=:id ORDER BY p.nome");
            u.setParameter("id", id);
            return u.getResultList();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }
}
