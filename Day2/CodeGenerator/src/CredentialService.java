import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CredentialService extends Employee{
    private String email;
    private String password;

    CredentialService(String firstName,String lastName,String department)
    {
        super(firstName,lastName,department);
    }

    public static String generatePassword()
    {
        String UPPER_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LOWER_CHARS = "abcdefghijklmnopqrstuvwxyz";
        String NUMBERS = "0123456789";
        String SPECIAL_CHARS = "!@#$%^&*()-_+=<>?";
        SecureRandom random = new SecureRandom();
        String combinedChars = UPPER_CHARS + LOWER_CHARS + NUMBERS + SPECIAL_CHARS;
        List<Character> passwordChars = new ArrayList<>();

        passwordChars.add(UPPER_CHARS.charAt(random.nextInt(UPPER_CHARS.length())));
        passwordChars.add(LOWER_CHARS.charAt(random.nextInt(LOWER_CHARS.length())));
        passwordChars.add(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        passwordChars.add(SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length())));

        for (int i = passwordChars.size(); i <6; i++) {
            passwordChars.add(combinedChars.charAt(random.nextInt(combinedChars.length())));
        }

        Collections.shuffle(passwordChars, random);

        StringBuilder password = new StringBuilder(6);
        for (char ch : passwordChars) {
            password.append(ch);
        }

        return password.toString();
    }

    public void generateEmailAddress() {
        String email = getFirstName() + getLastName() + "@" + getDepartment() + ".ford.com";
        System.out.println("Email: " + email);
    }

    public void showCredentials() {
        String email = getFirstName() + getLastName() + "@" + getDepartment() + ".ford.com";
        String password = generatePassword();
        System.out.println("Generated credentials for " + getFirstName() + " " + getLastName() + ":");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

}
