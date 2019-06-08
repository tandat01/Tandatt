package jv2_secsion7;

import java.util.ArrayList;

public interface UserInterface {

    boolean create(User u);
    ArrayList<User> getList();
    boolean update(User u);
    boolean delete(User u);
}
