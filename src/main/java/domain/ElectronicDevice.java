package domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("electronicDevice")
public class ElectronicDevice extends SmartDevice {
    
    public ElectronicDevice(){
        super();
    }
    
    public ElectronicDevice(String power){
        super(power);
    }
}
