package models.dao;

/**
 * Created by peter on 2016/9/11.
 */
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String password;

//    public User(long id, String firstName, String lastName, String password) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.password = password;
//    }

    public Long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setId(Long id) {
        this.id =  id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
