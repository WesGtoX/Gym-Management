package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
//    @Column(name="id")
    @JoinColumn(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "name", length = 100, nullable = true)
    private String name;
    
    @Column(name = "cpf", length = 14, nullable = true)
    private String cpf;
    
    @Column(name = "birth_date", length = 10, nullable = true)
    private String birth_date;
    
    @Column(name = "sex", length = 20, nullable = true)
    private String sex;
    
    @Column(name = "address", length = 100, nullable = true)
    private String address;
    
    @Column(name = "number", length = 10, nullable = true)
    private String number;
    
    @Column(name = "complement", length = 100, nullable = true)
    private String complement;
    
    @Column(name = "neighborhood", length = 100, nullable = true)
    private String neighborhood;
    
    @Column(name = "city", length = 50, nullable = true)
    private String city;
    
    @Column(name = "uf", length = 2, nullable = true)
    private String uf;
    
    @Column(name = "cep", length = 9, nullable = true)
    private String cep;
    
    @Column(name = "phone", length = 14, nullable = true)
    private String phone;
    
    @Column(name = "cel_phone", length = 15, nullable = true)
    private String cel_phone;
    
    @Column(name = "email", length = 100, nullable = true)
    private String email;
    
    @OneToMany//(mappedBy = "fk_client", cascade = {CascadeType.PERSIST},fetch=FetchType.EAGER)
    private List<Payment> historic;
    
    public Client() {
    }

    public Client(Long id, String name, String cpf, String birth_date, String sex, String address, String number, String complement, String neighborhood, String city, String uf, String cep, String phone, String cel_phone, String email, List<Payment> historic) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.birth_date = birth_date;
        this.sex = sex;
        this.address = address;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.uf = uf;
        this.cep = cep;
        this.phone = phone;
        this.cel_phone = cel_phone;
        this.email = email;
        this.historic = historic;
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
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCel_phone() {
        return cel_phone;
    }

    public void setCel_phone(String cel_phone) {
        this.cel_phone = cel_phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Payment> getHistoric() {
        return historic;
    }

    public void setHistoric(List<Payment> historic) {
        if(historic != null){
            this.historic = historic;
        }
    }
    
    

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", cpf=" + cpf + ", birth_date=" + birth_date + ", sex=" + sex + ", address=" + address + ", number=" + number + ", complement=" + complement + ", neighborhood=" + neighborhood + ", city=" + city + ", uf=" + uf + ", cep=" + cep + ", phone=" + phone + ", cel_phone=" + cel_phone + ", email=" + email + '}';
    }
}
