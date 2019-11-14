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
 * @author Quemuel
 */

//call persistense
@Entity
@Table(name="tb_users")
public class User implements Serializable{
    
    @SequenceGenerator(
        name="tb_user_id_seq",
        sequenceName = "tb_user_id_seq"
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "tb_user_id_seq"
    )

    @Id
    @Column(name="id")
    private Long id;
    @Column(name="name", length = 100)
    private String name;
    @Column(name="registration", length = 12)
    private String date;
    @Column(name="password", length = 30)
    private String password;
    @Column(name="email",length = 50)
    private String email;
    @Column(name="responsable",length = 20)
    private String responsable;
    @Column(name="occupation")
    private int occupation;
    @Column(name="permission")
    private int permissions;

    public User() {
    }

    public User(Long id, String name, String date, String password, String email, String responsable, int occupation, int permissions) {
        this.setId(id);
        this.setName(name);
        this.setDate(date);
        this.setPassword(password);
        this.setEmail(email);
        this.setResponsable(responsable);
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
        }else{
            this.name = "NULL";
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if(!date.isEmpty()){
            this.date = date;
        }else{
            this.date = "??/??/????";
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!password.isEmpty()){
            this.password = password;
        }else{
            this.password = "NULL";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.isEmpty()){
            this.email = email;
        }else{
            this.email = "NULL";
        }
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        if(!responsable.isEmpty()){
            this.responsable = responsable;
        }else{
            this.responsable = "NULL";
        }
    }

    public int getOccupation() {
        return occupation;
    }

    public void setOccupation(int Occupation) {
        if(Occupation > 0 && Occupation < 4 ){
            this.occupation = Occupation;
        }else{
            this.occupation = 1;
        }
    }

    public int getPermissions() {
        return permissions;
    }

    public void setPermissions(int permissions) {
        if(permissions > 0 && permissions < 3 ){
            this.permissions = permissions;
        }else{
            this.permissions = 1;
        }
    }
    
    
}
