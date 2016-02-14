package domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_DEVICE")
@DiscriminatorValue("smartDevice")
public class SmartDevice {
    private String power;
    private long id;

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public SmartDevice(){
        
    }
    
    public SmartDevice(String power){
        this.power = power;
    }
}
