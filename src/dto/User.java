package dto;

import java.util.ArrayList;
import java.util.List;

public class User {
    int id;
    String name;
    String email;
    String phone;
    Address add;
    List<User> l;

    public User(int id, String name, String email, String phone, Address add) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.add = add;
        l = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public void addUser(User user)
    {
        l.add(user);
    }
    public void removeUser(User user)
    {
        l.remove(user);
    }
    public boolean searchUser(User user)
    {
        return l.contains(user);
    }

    @Override public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\''
            + ", phone='" + phone + '\'' + ", add=" + add + ", l=" + l + '}';
    }
}
