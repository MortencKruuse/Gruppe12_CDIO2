package data.DTO;

import java.util.List;

public class UserDTO {
    int userID;
    private String username;
    private String ini;
    private String cpr;
    private String password;
    //private List<String> roles;
    private String role;

    public UserDTO() {
    }

    public UserDTO(int userID, String username, String ini, String cpr, String password, List<String> roles) {
        this.userID = userID;
        this.username = username;
        this.ini = ini;
        this.cpr = cpr;
        this.password = password;
        this.role = roles.get(0);
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIni() {
        return ini;
    }

    public void setIni(String ini) {
        this.ini = ini;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //public List<String> getRoles() {
        //return roles;
    //}

    //public void setRoles(List<String> roles) {
        //this.roles = roles;
    //}
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("User ID: " + userID
                + "\n\tUsername: " + username
                + "\n\tInitials: " + ini
                + "\n\tCPR: " + cpr
                + "\n\tPassword: " + password
                + "\n\tRole: " + role);
        /*for (int i = 0; i < roles.size(); i++) {
            str.append("\n\tRole ").append(i).append(" ").append(roles.get(i));
        }*/
        return str.toString();
    }
}


