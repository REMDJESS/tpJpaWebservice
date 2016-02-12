package domain;

import javax.persistence.*;

@Entity
public class Home {
    private long id;
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
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public Home(){
        
    }
    
    public Home(String area, int numberOfpiece){
        this.area = area;
        this.numberOfPiece = numberOfpiece;
    }
    
}
