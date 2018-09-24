/*
Clase abstracta padre. De ella heredan usuario y pagina.
 */
package SocialNetwork;

/**
 *
 * @author dicky
 */
public abstract class Profile {

    public int id;
    public String name;
    public String url;
    public String image;  

    public Profile() {
    }

    public Profile(int id, String name, String url, String image) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.image = image;
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
    
    
    // Se crea metodo abstracto isPosting para poder ser sobreescrito
    public abstract void isPosting();
    
    // Se crea metodo para borrar post.
    public void deletePost() {
        
        System.err.println("Aqui estamos borrando un post");
    
    }
}
