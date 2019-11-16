package model;

import java.io.Serializable;
import java.util.List;
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
public class Payment implements Serializable{
    
    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "tb_categoria_id_seq"
    )
    
    @Column(name="id")
    private Long id;
    @Column(name="name", length = 100)
    private String name;
    @Column(name="expiry", length = 12)
    private String expiry;
    @Column(name="paydate", length = 12)
    private String paydate;
    @Column(name="historic")
    private List<PayHistoric> historic;
    @Column(name="paymode")
    private int paymode;
    @Column(name="payrate",length = 30)
    private String payrate;
    @Column(name="discount",length = 30)
    private String discount;
    @Column(name="total", length = 30)
    private String total;

    public Payment() {
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

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        if(!paydate.isEmpty()){
            this.paydate = paydate;
        }else{
            this.paydate = "??/??/????";
        }
    }
    
    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        if(!expiry.isEmpty()){
            this.expiry = expiry;
        }else{
            this.expiry = "??/??/????";
        }
    }

    public int getPaymode() {
        return paymode;
    }

    public void setPaymode(int paymode) {
        if(paymode > 0 && paymode < 4 ){
            this.paymode = paymode;
        }else{
            this.paymode = 1;
        }
    }

    public String getPayrate() {
        return payrate;
    }

    public void setPayrate(String payrate) {
        if(!payrate.isEmpty()){
            this.payrate = payrate;
        }else{
            this.payrate = "0.00";
        }
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        if(!discount.isEmpty()){
            this.discount = discount;
        }else{
            this.discount = "0.00";
        }
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        if(!total.isEmpty()){
            this.total = total;
        }else{
            this.total = "0.00";
        }
    }
    
    
    
    
}
