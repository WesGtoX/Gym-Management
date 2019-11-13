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
@Table(name="tb_categoria")
@SequenceGenerator(
    name="tb_categoria_id_seq",
    sequenceName = "tb_categoria_id_seq",
    initialValue = 1,
    allocationSize = 1
)
public class User implements Serializable{
    
    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "tb_categoria_id_seq"
    )
    
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

    public int getFunction() {
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
