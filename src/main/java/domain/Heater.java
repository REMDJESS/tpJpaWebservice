package domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("heater")
public class Heater extends SmartDevice{
    
    public Heater(){
        super();
    }
    
    public Heater(String power){
        super(power);
    }
}
