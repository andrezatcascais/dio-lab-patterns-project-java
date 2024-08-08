package subsystem2.cep;

// implement a singleton pattern
public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instance;
    }

    public String recoverCity(String cep){
        return "Palhoça";
    }

    public String recoverState(String cep){
        return "SC";
    }
}
