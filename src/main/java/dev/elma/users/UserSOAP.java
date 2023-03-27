package dev.elma.users;

import dev.elma.proxys.BankServices;
import dev.elma.proxys.BankServices_Service;
import dev.elma.proxys.Client;


public class UserSOAP {
    public static void main(String[] args) {
        BankServices stubs = new BankServices_Service().getBankServicesPort();
        System.out.println("-------------------------------------------");
        System.out.println("10$ => "+stubs.conversionToDH(10)+" DH");
        System.out.println("*******************************************");
        Client newCompte = stubs.createNewCompte("client 1",1234,25000);
        System.out.println("New Compte: "+newCompte.getCode()+" "+newCompte.getSolde());
        System.out.println("*******************************************");
        Client newCompte2 = stubs.createNewCompte("client 2",4321,25000);
        System.out.println("New Compte: "+newCompte2.getCode()+" "+newCompte2.getSolde());
        System.out.println("*******************************************");
        Client newCompte3 = stubs.createNewCompte("client 3",4321,25000);
        System.out.println("New Compte: "+newCompte3.getCode()+" "+newCompte3.getSolde());
        System.out.println("********************LIST OF CLIENTS******************");
        for(Object o: stubs.allComptes().toArray()){
            System.out.println(((Client)o));
        }
    }
}
