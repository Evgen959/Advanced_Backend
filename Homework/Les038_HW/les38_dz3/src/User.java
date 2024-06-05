import java.util.Objects;

public class User {
    String nickname;
    String email;

    public User(String nickname, String email) {
        this.nickname = nickname;
        this.email = email;
    }

    @Override
    public String toString() {
        return nickname + ": " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nickname, user.nickname) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, email);
    }
}
