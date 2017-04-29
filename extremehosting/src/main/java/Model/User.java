/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private Long Id;
    
    @Column(nullable = false)
    private String Name;
    
    @Column(nullable = false)
    private String City;
    
    @Column(nullable = false)
    private String Country;
    
    @Column(nullable = false)
    private boolean Host;
    
    private String ProfileURL;
    
    
    @ManyToOne
    private Sport FavSport;
    
    @OneToMany
    private List<House> Houses;
    
    public Long getId(){
        return Id;
    }
    public String getName(){
        return Name;
    }
    public String getCity() {
        return City;
    }
    public String getCountry() {
        return Country;
    }
    public boolean isHost() {
        return Host;
    }
 
    public void setId(Long id){
        this.Id = id;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setCity(String City) {
        this.City = City;
    }
    public void setCountry(String Country) {
        this.Country = Country;
    } 
    public void setHost(boolean isHost) {
        this.Host = isHost;
    }

}
