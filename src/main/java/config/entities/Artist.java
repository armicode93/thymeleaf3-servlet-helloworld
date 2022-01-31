package config.entities;

public class Artist {


    private Integer id;
    private String name ;
    private String lastName ;
    private String adresse ;

    public Artist(Integer id, String name, String lastName, String adresse) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.adresse = adresse;
    }

    public Artist() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
