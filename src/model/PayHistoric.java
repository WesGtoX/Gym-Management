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
@Table(name="tb_historic")
public class PayHistoric implements Serializable {
    
    @SequenceGenerator(
        name="tb_historic_id_seq",
        sequenceName = "tb_historic_id_seq"
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "tb_historic_id_seq"
    )
    
    @Id
    @Column(name="id")
    public String id;
    @Column(name="status")
    public boolean status;
    @Column(name="value")
    public String value;
    @Column(name="date")
    public String date;

    public PayHistoric(String id, boolean status, String value, String date) {
        this.setId(id);
        this.setStatus(status);
        this.setValue(value);
        this.setDate(date);
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if(!value.isEmpty()){
            this.value = value;
        }else{
            this.value = "0.00";
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
    
    
    
}
