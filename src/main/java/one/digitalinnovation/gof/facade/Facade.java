package one.digitalinnovation.gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.cep.CepApi;

public class Facade {

    // Interface of the facade
    public void migrateClient(String name, String cep) {
        // Now let's integrate with these subsystems
        // that we want to use for this migration.
        System.out.println("Migrating Client ...");
        // To retrieve the city and state, we have subsystems that can do this.
        String city = CepApi.getInstance().recoverCity(cep);
        String state = CepApi.getInstance().recoverState(cep);

        CrmService.recordClient(name, cep, city, state);
    }
}
