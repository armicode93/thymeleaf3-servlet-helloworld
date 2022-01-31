package config.entities;

public class Client {

    private Integer clientId ;
    private String name ;
    private String lastName ;

    public Client() {
    }

    public Client(Integer clientId, String name, String lastName) {
        this.clientId = clientId;
        this.name = name;
        this.lastName = lastName;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
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

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
