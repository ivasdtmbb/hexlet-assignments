package exercise;

import java.util.Arrays;
import java.util.List;

public class App {
    public static long getCountOfFreeEmails(List<String> emailsList) {
        return emailsList.stream()
                .filter(email -> isFree(email))
                .count();
    }
    private static boolean isFree(String email) {
        List<String> freeDomains = Arrays.asList(
                "gmail.com",
                "yandex.ru",
                "hotmail.com");

        String[] mailboxAndDomain = email.split("@");
        String emailDomain = mailboxAndDomain[mailboxAndDomain.length - 1];
        return freeDomains.contains(emailDomain);
    }
}
