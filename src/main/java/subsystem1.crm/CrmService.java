package subsystem1.crm;

public class CrmService {

    // Ensures that whoever consumes this class will use the static methods,
    // and will not unnecessarily instantiate this class, as it has no structure
    // or attributes.
    private CrmService() {
        super();
    }

    // Interface
    public static void recordClient(String name, String cep,
                                    String city, String state) {
        System.out.println("Client saved successfully: "
                + name + " "
                + cep + " "
                + city + " "
                + state);
    }
}
