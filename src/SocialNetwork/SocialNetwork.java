
/*
Integrantes del Equipo:
== Ricardo Ivan Macias
== Daniel Emir Olivas
== Luis Orozco
== Victor Valdez
== Karen Peña

 */
package SocialNetwork;

/**
 *
 * @author dicky
 */
public class SocialNetwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Facebook f = new Facebook();
        
        f.createUser();
        f.createPage();
       
        
        User dicky = new User();
        
        dicky.createGroup();
        
        Group g = new Group();
        
        dicky.setName("Dicky");
        
        g.addUser(0, dicky);
        
        System.out.println("Los miembros del grupo son:\n");
        for (User member : g.members)      
            System.out.println(member);
        }
        
        
        
        
    }
    

