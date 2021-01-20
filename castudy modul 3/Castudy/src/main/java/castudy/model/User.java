package castudy.model;

public class User {
    private int id;
    private String userName;
    private String password;
    private String email;
    private String chucVu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(int id, String userName, String password, String email,String chucVu) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.chucVu= chucVu;
    }

    public User(String userName, String password, String email,String chucVu) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.chucVu= chucVu;
    }

    public User() {
    }

    public User(String userName, String password,String email) {
        this.userName = userName;
        this.password = password;
        this.email= email;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}
