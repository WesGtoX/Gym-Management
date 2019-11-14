package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Wesley
 */
@Entity
@Table(name="tb_cliente")
public class Client implements Serializable {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "seq_user"
    )
    @Column(name="id")
    private Long id;
    
    @Column(name = "login", length = 20, nullable = false)
    private String login;
    
    @Column(name = "password", length = 15, nullable = false)
    private String passwd;
    
    public Client() {
    }

    public Client(Long id, String login, String passwd) {
        this.id = id;
        this.login = login;
        this.passwd = passwd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", login=" + login + ", passwd=" + passwd + '}';
    }
}
