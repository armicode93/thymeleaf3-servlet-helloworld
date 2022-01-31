package config.entities.repositories;


import config.entities.Client;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ClientRepository {

    private static final ClientRepository INSTANCE = new ClientRepository();
    private final Map<Integer, Client> clientById;

    public static ClientRepository getInstance()
    {
        return INSTANCE ;
    }

    private ClientRepository() {
        super();
        this.clientById = new LinkedHashMap<Integer, Client>();

        final Client client1 = new Client();
        client1.setClientId((Integer.valueOf(1)));
        client1.setName("Marco");
        client1.setLastName("Surri");
    }


    public List<Client> findAll()
    {
        return new ArrayList<Client>(this.clientById.values());
    }



    public Client findById (final Integer id)
    {
        return this.clientById.get(id);
    }
}

