package models;

public class User {
    private String name;
    private String email;
    private int id;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

}
