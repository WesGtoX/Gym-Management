package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Quemuel
 */
//call persistense
@Entity
@Table(name="tb_pagamento")
public class Payment implements Serializable{
    
    @Id
    @SequenceGenerator(
        name="tb_pagamento_id_seq",
        sequenceName = "tb_pagamento_id_seq",allocationSize=1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "tb_pagamento_id_seq"
    )
    
    @Column(name="id", nullable = false)
    private Long id;
    
    @OneToOne
    @JoinColumn(name = "client", referencedColumnName = "id", nullable = false)
    private Client client;
    
    @Column(name="expiry", length = 12, nullable = false)
    private String expiry;
    
    @Column(name="paydate", length = 12, nullable = true)
    private String paydate;
    
    @Column(name="status", nullable = false)
    private boolean status;
    
    @Column(name="paymode",nullable = false)
    private int paymode;
    
    @Column(name="payrate",length = 30, nullable = true)
    private String payrate;
    
    @Column(name="discount",length = 30, nullable = true)
    private String discount;
    
    @Column(name="monthly", length = 30, nullable = false)
    private String monthly;
    
    public Payment() {
    }

    public Payment(Long id, Client fk_client, String expiry, String paydate, boolean status, int paymode, String payrate, String discount, String total) {
        this.setId(id);
        this.setClient(fk_client);
        this.setExpiry(expiry);
        this.setPaydate(paydate);
        this.setStatus(status);
        this.setPaymode(paymode);
        this.setPayrate(payrate);
        this.setDiscount(discount);
        this.setMonthly(total);
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return this.client;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setClient(Client cli) {
        if(cli != null){
            this.client = cli;
        }
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        if(!paydate.isEmpty()){
            this.paydate = paydate;
        }
    }
    
    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        if(!expiry.isEmpty()){
            this.expiry = expiry;
        }
    }

    public int getPaymode() {
        return paymode;
    }

    public void setPaymode(int paymode) {
        if(paymode > 0 && paymode < 4 ){
            this.paymode = paymode;
        }
    }

    public String getPayrate() {
        return payrate;
    }

    public void setPayrate(String payrate) {
        if(!payrate.isEmpty()){
            this.payrate = payrate;
        }
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        if(!discount.isEmpty()){
            this.discount = discount;
        }
    }

    public String getMonthly() {
        return monthly;
    }

    public void setMonthly(String monthly) {
        if(!monthly.isEmpty()){
            this.monthly = monthly;
        }
    }
}


