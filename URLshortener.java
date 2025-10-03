package Package;

import java.util.*;

public class URLshortener {
	private static final String BASE_URL = "http://short.ly/";
    private static Map<String, String> urlMap = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("URL Shortener:");
            System.out.println("1. Shorten URL");
            System.out.println("2. Resolve Short URL");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter long URL: ");
                String longUrl = sc.nextLine();
                String key = "u" + (urlMap.size()+1);
                String shortUrl = BASE_URL + key;
                urlMap.put(shortUrl, longUrl);
                System.out.println("Short URL: " + shortUrl);
            } else if (choice == 2) {
                System.out.print("Enter short URL: ");
                String shortUrl = sc.nextLine();
                if (urlMap.containsKey(shortUrl)) {
                    System.out.println("Original URL: " + urlMap.get(shortUrl));
                } else {
                    System.out.println("Short URL not found.");
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
