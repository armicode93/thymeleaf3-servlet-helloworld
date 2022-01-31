package config.services;



import config.entities.Client;
import config.entities.repositories.ClientRepository;

import java.util.List;

public class ClientService {

    public ClientService() {
        super();
    }
    public List<Client> findAll()
    {
        return ClientRepository.getInstance().findAll();
    }
    public Client findById(final Integer id)
    {
        return ClientRepository.getInstance().findById(id);
    }
}
