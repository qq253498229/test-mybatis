package cn.codeforfun.testmapper.generator.model;

import javax.persistence.*;

@Table(name = "t_user")
public class TUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String username;

    private Integer password;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public Integer getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(Integer password) {
        this.password = password;
    }
}