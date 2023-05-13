package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId) {
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword) {
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if (oldPassword.equalsIgnoreCase(password)) {
            if (isValid(newPassword)) {
                System.out.println("Password changed Successfully");
                this.password = newPassword;
            } else {
                System.out.println("The old password is invalid");
            }
        } else {
            System.out.println("The old password does not match with current one");
        }


    }

    private Boolean isValid(String password) {
        Boolean Capital = false;
        Boolean Small = false;
        Boolean digit = false;
        Boolean Special = false;
        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                Capital = true;
            } else if (c >= 'a' && c <= 'z') {
                Small = true;
            } else if (c >= '0' && c <= 9) {
                digit = true;

            } else {
                Special = true;
            }
        }
        if (Capital && Small && digit && Special) {
            return true;
        }
        return false;
    }
}






