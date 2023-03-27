package dev.elma.classes;

public class Client {
    private int code;
    private String Name;
    private double solde;

    public Client(String Name, int code, double solde){
        this.Name=Name;
        this.code=code;
        this.solde=solde;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Client{" +
                "code=" + code +
                ", Name='" + Name + '\'' +
                ", solde=" + solde +
                '}';
    }
}
