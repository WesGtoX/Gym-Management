package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.User;

/**
 *
 * @author Quemuel
 */
public class UserDAO {
    
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public UserDAO(){
        this.emf = Persistence.createEntityManagerFactory("gym_management");
        this.em = emf.createEntityManager();
    }
    
    public int save(User usr){
        try{
            User user;
            if(usr.getId() == null){
                user = usr;//create a new user
            }else{
                user = em.find(User.class, usr.getId());//update a existing id_user
                user.setName(usr.getName());//update a existing name_user
                user.setEmail(usr.getEmail());//update a existing email_user
                user.setDate(usr.getDate());//update a existing date_user
                user.setPassword(usr.getPassword());//update a existing password_user
                user.setPermissions(usr.getPermissions());//update a existing permission_user
                user.setResponsable(usr.getResponsable());//update a existing responsable_user
                user.setOccupation(usr.getOccupation());//update a existing occupation_user
            }
            em.getTransaction().begin();
            em.merge(usr);
            em.getTransaction().commit();
            return usr.getId().intValue();
        }catch(Exception e){
            System.out.println("Não foi possível inserir o novo usuário, ERRO: "+e.getMessage());
            return -1;
        }finally{
            em.close();
            emf.close();
        }
    }
    
    public int delete(int id){
        try{
            User usr = em.find(User.class,new Long(id));//delete selected id_user
            em.getTransaction().begin();
            em.merge(usr);
            em.getTransaction().commit();
            return usr.getId().intValue();
        }catch(Exception e){
            System.out.println("Não foi possível deletar o usuário id="+id+", ERRO: "+e.getMessage());
            return -1;
        }finally{
            em.close();
            emf.close();
        }
    }
    
    public List<User> searchAll(){
        try{
            Query q = em.createQuery("SELECT u FROM User u ORDER BY u.id");//select all order by id
            return q.getResultList();
        }catch(Exception e){
            System.out.println("Não foi possível buscar usuários, ERRO: "+e.getMessage());
            return null;
        }finally{
            em.close();
            emf.close();
        }
    }
    
    public List<User> searchId(int id){
        try{
            Query q = em.createQuery("SELECT u FROM User u WHERE u.id=:id ORDER BY u.id");//select all with id_user order by id_user
            q.setParameter("id",id);
            return q.getResultList();
        }catch(Exception e){
            System.out.println("Não foi possível buscar usuários pelo id, ERRO: "+e.getMessage());
            return null;
        }finally{
            em.close();
            emf.close();
        }
    }
    
    public List<User> searchName(String name){
        try{
            Query q = em.createQuery("SELECT u FROM User u WHERE u.name LIKE :name ORDER BY u.name");//select all with typed name order by name
            q.setParameter("name", "%"+name+"%");
            return q.getResultList();
        }catch(Exception e){
            System.out.println("Não foi possível buscar usuários pelo nome, ERRO: "+e.getMessage());
            return null;
        }finally{
            em.close();
            emf.close();
        }
    }
    
}