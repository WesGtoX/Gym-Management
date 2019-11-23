package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import model.Payment;

/**
 *
 * @author Wesley, Quemuel
 */
public class PayDAO {
    
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public PayDAO(){
        this.emf = Persistence.createEntityManagerFactory("GymManagementPU");
        this.em = emf.createEntityManager();
    }
    
    public int save(Payment p){
        try{
            Payment pay = null;
            if(p.getId() == null){
                pay = p;                                             //create a new Payment
                em.persist(pay);
            }else{
                pay = em.find(Payment.class, p.getId());            //update a existing id_pay
                pay.setClient(p.getClient());                       //update a existing client_pay
                pay.setDiscount(p.getDiscount());                   //update a existing discount_pay
                pay.setExpiry(p.getExpiry());                       //update a existing expiry_pay
                pay.setPaydate(p.getPaydate());                     //update a existing date_pay
                pay.setPaymode(p.getPaymode());                     //update a existing mode_pay
                pay.setPayrate(p.getPayrate());                     //update a existing rate_pay
                pay.setStatus(p.isStatus());                        //update a existing status_pay
                pay.setMonthly(p.getMonthly());                         //update a existing total_pay
            }
            em.getTransaction().begin();
            p = em.merge(pay);
            em.getTransaction().commit();
            return pay.getId().intValue();
        }catch(Exception e){
            System.out.println("Não foi possível lançar um novo pagamento, ERRO: "+e.getMessage());
            return -1;
        }finally{
            em.close();
            emf.close();
        }
    }
    
    public int delete(int id){
        try{
            Payment pay = em.find(Payment.class,new Long(id)); 
            em.getTransaction().begin();
            em.remove(pay);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null,"Id do pagamento deletado: "+id);
            return pay.getId().intValue();
        }catch(Exception e){
            System.out.println("Não foi possível deletar o pagamento id="+id+", ERRO: "+e.getMessage());
            return -1;
        }finally{
            em.close();
            emf.close();
        }
    }
    
    public List<Payment> searchAll(){
        try{
            Query q = em.createQuery("SELECT p FROM Payment p ORDER BY p.id");
            return q.getResultList();
        }catch(Exception e){
            System.out.println("Não foi possível buscar pagamentos, ERRO: "+e.getMessage());
            return null;
        }finally{
            em.close();
            emf.close();
        }
    }
    
    public List<Payment> searchId(int id){
        try{
            Query q = em.createQuery("SELECT p FROM Payment p WHERE p.id=:id ORDER BY p.id");
            q.setParameter("id",id);
            return q.getResultList();
        }catch(Exception e){
            System.out.println("Não foi possível buscar pagamentos pelo id, ERRO: "+e.getMessage());
            return null;
        }finally{
            em.close();
            emf.close();
        }
    }
    
    public List<Payment> searchHistoric(int id){
        try{
//            Query q = em.createQuery("SELECT p FROM Payment p WHERE p.fk_client:id ORDER BY p.paydate");
            Query q = em.createQuery("SELECT p FROM Payment p WHERE p.fk_client=:id");
            q.setParameter("id",id);
            return q.getResultList();
        }catch(Exception e){
            System.out.println("Não foi possível buscar o histórico de pagamentos pelo id, ERRO: "+e.getMessage());
            return null;
        }finally{
            em.close();
            emf.close();
        }
    }
    
    public List<Payment> searchName(String name){
        try{
            Query q = em.createQuery("SELECT p FROM Payment p WHERE p.fk_client.name LIKE :name ORDER BY p.fk_client.name");//select all with typed name order by name
            q.setParameter("name", "%"+name+"%");
            return q.getResultList();
        }catch(Exception e){
            System.out.println("Não foi possível buscar pagamentos pelo cliente, ERRO: "+e.getMessage());
            return null;
        }finally{
            em.close();
            emf.close();
        }
    }
    
}
