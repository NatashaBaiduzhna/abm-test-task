package constants;

public enum User {

    VALID_USER("bayduzhnayanata@gmail.com", "123456qwerty"),

    INVALID_USER("invalidemail@gmail.com", "invalidPassword"),

    ABM_TEST_USER("abmtestcloud@gmail.com", "1q2w3e4r");

    private final String email;
    private final String password;

    User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
