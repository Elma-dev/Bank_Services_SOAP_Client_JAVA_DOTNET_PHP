package dev.elma.services;

import dev.elma.classes.Client;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;

@WebService(serviceName="BankServices")
public class BankServices {
    ArrayList<Client> allComptes=new ArrayList<>();
    @WebMethod(operationName = "conversionToDH")
    public double convertToDH(double solde){
        return solde*11.40;
    }

    @WebMethod(operationName ="createNewCompte")
    public Client createCompte(String name, int code, double solde){
        Client c=new Client(name,code,solde);
        allComptes.add(c);
        return c;
    }

    @WebMethod(operationName = "AllComptes")
    public ArrayList<Client> getAllComptes(){
        return allComptes;
    }

}
