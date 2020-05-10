package data;

import data.DTO.UserDTO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LocalStorage {
    private static int id = 0;
    private List<UserDTO> list;


    public LocalStorage() {
        list = new ArrayList<>();
        //TODO: 08-05-2020  Sejr lav createfile her
    }


    public void createUser(String name, String ini, String cpr, String password, String role) {
        UserDTO newUser = new UserDTO(id, name, ini, cpr, password, role);
        list.add(newUser);
        id++;
    }

    public void deleteUser(int id) {
        list.removeIf(user -> user.getUserID() == id);
    }

    public List<UserDTO> getUsers() {
        return list;
    }
}