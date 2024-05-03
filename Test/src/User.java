public class User {
    public String name;
    public String password;
    User() {
        this.name = "John Doe";
        this.password = "password";
    }
    User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    void show() {
        System.out.println("Name: " + this.name);
    }
}
