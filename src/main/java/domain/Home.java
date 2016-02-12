package domain;

import javax.persistence.*;

@Entity
public class Home {
    private long id;
    
    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public Home(){
        
    }
    
    
}
