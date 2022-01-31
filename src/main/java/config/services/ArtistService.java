package config.services;


import config.entities.Artist;
import config.entities.repositories.ArtistRepository;

import java.util.List;

public class ArtistService {

    public ArtistService() {
        super();
    }

    public List<Artist> findAll()
    {
        return ArtistRepository.getInstance().findAll();
    }
    public Artist findById(final Integer id)
    {
        return ArtistRepository.getInstance().findById(id);
    }
}
