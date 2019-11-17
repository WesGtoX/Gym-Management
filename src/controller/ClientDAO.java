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
    
    public int save(Client c) {
        try {
            Client cli;
            if (c.getId() == null) {
                cli = c;
            } else {
                cli = em.find(Client.class, c.getId());
                cli.setName(c.getName());
                cli.setCpf(c.getCpf());
                cli.setBirth_date(c.getBirth_date());
                cli.setSex(c.getSex());
                cli.setAddress(c.getAddress());
                cli.setNumber(c.getNumber());
                cli.setComplement(c.getComplement());
                cli.setNeighborhood(c.getNeighborhood());
                cli.setCity(c.getCity());
                cli.setUf(c.getUf());
                cli.setCep(c.getCep());
                cli.setPhone(c.getPhone());
                cli.setCel_phone(c.getCel_phone());
                cli.setEmail(c.getEmail());
                cli.setHistoric(c.getHistoric());
            }
            em.getTransaction().begin();
            c = em.merge(cli);
            em.getTransaction().commit();
            return c.getId().intValue();
        } catch (Exception e) {
            System.out.println("Não foi possível inserir o novo cliente, ERRO: "+e.getMessage());
            return -1;
        } finally {
            em.close();
            emf.close();
        }
    }
    
    public int delete(int id) {
        try {
            Client obj = em.find(Client.class, new Long(id));
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
            return obj.getId().intValue();
        } catch (Exception e) {
            System.out.println("Não foi possível deletar o cliente id="+id+", ERRO: "+e.getMessage());
            return -1;
        } finally {
            em.close();
            emf.close();
        }
    }
    
    public List<Client> list() {
        try {
            Query q = em.createQuery("SELECT c FROM Client c ORDER BY c.id");
            return q.getResultList();
        } catch (Exception e) {
            System.out.println("Não foi possível carregar clientes, ERRO: "+e.getMessage());
            return null;
        }finally{
            em.close();
            emf.close();
        }
    }

    public List<Client> searchByName(String name) {
        try {
            Query q = em.createQuery("SELECT c FROM Client c WHERE c.name LIKE :name ORDER BY c.name");
            q.setParameter("name", "%" + name + "%");
            return q.getResultList();
        } catch (Exception e) {
            System.out.println("Não foi possível buscar cliente pelo nome, ERRO: "+e.getMessage());
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }
    
    public List<Client> searchById(int id) {;
        try {
            Query q = em.createQuery("SELECT c FROM Client c WHERE c.id=:id ORDER BY c.id");
            q.setParameter("id", id);
            return q.getResultList();
        } catch (Exception e) {
            System.out.println("Não foi possível buscar cliente pelo id, ERRO: "+e.getMessage());
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }
}
