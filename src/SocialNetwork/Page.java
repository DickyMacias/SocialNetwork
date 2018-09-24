/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocialNetwork;

/**
 *
 * @author dicky
 */
public class Page extends Profile{
    
    public User admin;

    public Page() {
    }

    public Page(User admin, int id, String name, String url, String image) {
        super(id, name, url, image);
        this.admin = admin;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
    
    
    @Override
    public void isPosting(){
    
        
    
    }
    
    public void isSetAdmin(){
    
    
    }
    
    
    
}
