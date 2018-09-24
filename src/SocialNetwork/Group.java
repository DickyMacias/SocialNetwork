/*
Es una clase que no hereda. Su funcion es crear grupos. Contiene por composicion
una pagina que se crea o destruye con la existencia del grupo, 
y por asociacion se unen usuario o dejan el grupo
 */
package SocialNetwork;

/**
 *
 * @author dicky
 */
public class Group {
    
    public Page page;
    public User[] members;


    public Group() {
        
        members = new User[10];
        page = new Page(members[0], 100, "El nuevo grupo", "www.facebook.com/elnuevogrupo", "Aqui esta mi imagen");
        
        
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public User[] getMembers() {
        return members;
    }

    public void setMembers(User[] members) {
        this.members = members;
    }
 
    


    
    
    public void addUser(int id, User m){
               
        members[id] = m;
    
    }
    
    public void dropUser(int id){
        
        members[id] = null;
    
    }
    
}
