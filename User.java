import java.time.LocalDate;

enum Class {
    PROGRAMMING, ALGORITHMS, GAME_DESIGN, CALCULUS 
}

public abstract class User {
    static int nextId;
    private String name;
    LocalDate dob;
    int id;
    Class[] classes;
    String email;

    public User(String name) {
        System.out.println("Call the User Constructor");
        this.name = name;
        this.id = ++nextId;
    }

    public String GetName() {
        return this.name;
    }
}
