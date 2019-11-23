package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Wesley, Quemuel
 */
//call persistense
@Entity
@Table(name="tb_usuario")
public class User implements Serializable{
    
    @Id
    @SequenceGenerator(
        name="tb_usuario_id_seq",
        sequenceName = "tb_usuario_id_seq",allocationSize=1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "tb_usuario_id_seq"
    )

    @Column(name="id",nullable = false)
    private Long id;
    
    @Column(name="name", length = 50, nullable = true)
    private String name;
    
    @Column(name="registration", length = 12, nullable = true)
    private String date;
    
    @Column(name="password", length = 100, nullable = true)
    private String password;
    
    @Column(name="email",length = 30, nullable = true)
    private String email;
    
    @Column(name="responsible",length = 30, nullable = true)
    private String responsible;
    
    @Column(name="occupation",nullable = false)
    private int occupation;
    
    @Column(name="permission",nullable = false)
    private int permissions;
    
    public User() {
    }

    public User(Long id, String name, String date, String password, String email, String responsible, int occupation, int permissions) {
        this.setId(id);
        this.setName(name);
        this.setDate(date);
        this.setPassword(password);
        this.setEmail(email);
        this.setResponsible(responsible);
        this.setOccupation(occupation);
        this.setPermissions(permissions);
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if(!date.isEmpty()){
            this.date = date;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!password.isEmpty()){
            this.password = password;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.isEmpty()){
            this.email = email;
        }
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsable) {
        if(!responsable.isEmpty()){
            this.responsible = responsable;
        }
    }

    public int getOccupation() {
        return occupation;
    }

    public void setOccupation(int Occupation) {
        if(Occupation > -1 && Occupation < 3 ){
            this.occupation = Occupation;
        }
    }

    public int getPermissions() {
        return permissions;
    }

    public void setPermissions(int permissions) {
        if(permissions > -1 && permissions < 2 ){
            this.permissions = permissions;
        }else{
            this.permissions = 1;
        }
    }
}
