import java.util.Objects;

public class User {
    private String nickname;
    private String email;

    public User(String nickname, String email) {
        this.nickname = nickname;
        this.email = email;
    }

    @Override
    public String toString() {
        return nickname + " ("+ email + ")";
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
