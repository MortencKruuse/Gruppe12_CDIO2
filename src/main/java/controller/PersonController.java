package controller;

import data.DTO.UserDTO;
import data.LocalStorage;
import java.util.List;


public class PersonController {
    private LocalStorage localStorage;

    public PersonController() {
        localStorage = new LocalStorage();
        localStorage.createUser("Bubbers1", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers2", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers3", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers4", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers5", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers6", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers7", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers8", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers9", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers10", "Boob", "12345678", "iLikBoobs","Admin");
    }

    public void createUser(String name, String ini, String cpr, String password, String role) {
        localStorage.createUser(name, ini, cpr, password, role);
    }
    public void deleteUser(int id) {
        localStorage.deleteUser(id);
    }

    public List<UserDTO> getUsers(){
        return localStorage.getUserDTO();
    }
}

