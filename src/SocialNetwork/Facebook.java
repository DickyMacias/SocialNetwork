/*
Clase hija de network. Esta clase crea un sitio web llamado Facebook.
 */
package SocialNetwork;

import java.util.Scanner;

/**
 *
 * @author dicky
 */
public class Facebook extends Network{

    public Facebook() {
    }

    public Facebook(String name, String dns, String ip) {
        super(name, dns, ip);
        this.name = name;
        this.dns = dns;
        this.ip = ip;
        
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDns() {
        return dns;
    }

    public void setDns(String dns) {
        this.dns = dns;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    
    
    // Esta clase tiene un metodo crear pagina. 
    // Los usuarios crean paginas, o cuando se crea un grupo se crea la pagina.
    //Es un metodo unico de la clase Facebook.
    //Solo en facebook se pueden crear.
    public void createPage(){
        
        String tempData;
        int tempData2;
        Scanner scan = new Scanner(System.in);
        Profile page = new Page();
        System.out.println("Vamos a crear tu nueva pagina\n"
                + "Como se llamara?");
        tempData = scan.nextLine();
        page.setName(tempData);
        page.setUrl("www.facebook.com/" + page.name);
        tempData2 = (int) (Math.random() * 999) + 1; 
        page.setId(tempData2);
        System.out.println("Este sera tu nuevo id: " + page.id);
        System.out.println("Este sera tu nuevo url: " + page.url);     

    
    } 
    
    
    // Dentro de un sitio tienen que existir usuarios, asi que creado el sitio
    // se crea el usuario. Es un metodo propio de la clase network.
    @Override
    public void createUser(){
        
        String tempData;
        int tempData2;
        Scanner scan = new Scanner(System.in);
        Profile user = new User();
        System.out.println("Bienvenido a Facebook\n"
                + "Cual es tu nombre de usuario?");
        tempData = scan.nextLine();
        user.setName(tempData);
        System.out.println("Danos la URL de tu imagen:");
        user.setImage(tempData);
        user.setUrl("www.facebook.com/" + user.name);
        tempData2 = (int) (Math.random() * 999) + 1; 
        user.setId(tempData2);
        System.out.println("Gracias " +user.name + ".\n "
                + "Este sera tu nuevo sitio: " + user.url); 
    
    }
    
}
