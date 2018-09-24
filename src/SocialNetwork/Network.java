/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocialNetwork;

import java.util.Scanner;


/**
 *
 * @author dicky
 */
public abstract class Network {
    
    public String name;
    public String dns;
    public String ip;

    public Network() {
        
        
        
    }

    public Network(String name, String dns, String ip) {
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

    public void setDNS(String dns) {
        this.dns = dns;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    
    
    
    public void createNetwork(){
    
        String tmpName;
        int tmpIp;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Que nombre le daras a tu red: ");
        tmpName = scan.nextLine();
                
        System.out.println("Tu nueva red se llamara: " + tmpName);
        
    
    }
    
    
    public abstract void createUser();   
    
    
    
}
