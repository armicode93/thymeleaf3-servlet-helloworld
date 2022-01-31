package config.entities.repositories;


import config.entities.Artist;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ArtistRepository {

    private static final ArtistRepository INSTANCE = new ArtistRepository();
    private final Map<Integer, Artist> artistById;

    public static ArtistRepository getInstance() {
        return INSTANCE;
    }

    private ArtistRepository()
    {
        super();
        this.artistById = new LinkedHashMap<Integer, Artist>();

        final Artist artist1 = new Artist(1,"Naser","Ben Kheder","rue baudribut");
        final Artist artist2 = new Artist(2, "Marco","Luslo","rue de la gare 5");
        final Artist artist3 = new Artist(3,"Elodie", "Mint", "rue de l'eglise 29");


        this.artistById.put(artist1.getId(), artist1);
        this.artistById.put(artist2.getId(), artist2);
        this.artistById.put(artist3.getId(), artist3);



    }

    public List<Artist> findAll()
    {
        return new ArrayList<Artist>(this.artistById.values());

    }
    public Artist findById (final Integer id)
    {
        return this.artistById.get(id);
    }
}
