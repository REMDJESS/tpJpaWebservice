package domain;

import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Home {
    private long id;
    private String name;
    private List<SmartDevice> smartDevices = new ArrayList<SmartDevice>();
    
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name="FK_HOME_ID", referencedColumnName = "HOME_ID")
    public List<SmartDevice> getSmartDevices() {
        return smartDevices;
    }

    public void setSmartDevices(List<SmartDevice> smartDevices) {
        this.smartDevices = smartDevices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String area;
    private int numberOfPiece;
    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
     
    public int getNumberOfPiece() {
        return numberOfPiece;
    }

    public void setNumberOfPiece(int numberOfPiece) {
        this.numberOfPiece = numberOfPiece;
    }
    
    @Id
    @Column(name="HOME_ID")
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public Home(){
        
    }
    
    public Home(String area, int numberOfpiece, String name){
        this.area = area;
        this.numberOfPiece = numberOfpiece;
        this.name = name;
    }
    
    public String toString(){
        return this.name+" "+this.area+" "+this.numberOfPiece;
    } 
}
