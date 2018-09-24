/*
Clase hija de profile
 */
package SocialNetwork;

/**
 *
 * @author dicky
 */
public class User extends Profile{
       
    // crea atributos de perfil de usuario
    public String firstName;
    public String lastName;

    
    // Se crea constructor vacio y uno sobrecargado
    public User() {
    }

    public User(String firstName, String lastName, int id, String name, String url, String image) {
        super(id, name, url, image);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter y setters de los atributos de la clase y superclase
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    
    
    
    
    // Se sobreescribe un metodo abstracto heredado. 
    // Distingue los post de usuario de otros diferentes. 
    @Override
    public void isPosting(){
    
        System.out.println("Este es un psot de usuario");
        
    }
    
    // Se crea metodo creat grupo. Solo el usuario puede crear un grupo
    public void createGroup(){
           
        // Se instancia el grupo y el usuario, despues se anade el usuario al grupo creado.
        Group g = new Group();
        User u = new User();
        g.addUser(1,u);
        
        
    }
    

    
    
    
}
