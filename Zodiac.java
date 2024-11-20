

import java.util.Scanner;

public class Zodiac {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth month (1-12): ");
        int month = scanner.nextInt();

        System.out.println("Enter your birth day (1-31): ");
        int day = scanner.nextInt();

        String zodiacSign = getZodiacSign(month, day);

        if (zodiacSign != null) {
            System.out.println("Your zodiac sign is: " + zodiacSign);
        } else {
            System.out.println("Invalid date entered.");
        }
    }

    private static String getZodiacSign(int month, int day) {
        if (month == 1) {
            if (day <= 19) {
                return "Capricorn";
            } else if (day <= 31) {
                return "Aquarius";
            }
        } else if (month == 2) {
            if (day <= 18) {
                return "Aquarius";
            } else if (day <= 29) {
                return "Pisces";
            }
        } else if (month == 3) {
            if (day <= 20) {
                return "Pisces";
            } else if (day <= 31) {
                return "Aries";
            }
        } else if (month == 4) {
            if (day <= 19) {
                return "Aries";
            } else if (day <= 30) {
                return "Taurus";
            }
        } else if (month == 5) {
            if (day <= 20) {
                return "Taurus";
            } else if (day <= 31) {
                return "Gemini";
            }
        } else if (month == 6) {
            if (day <= 20) {
                return "Gemini";
            } else if (day <= 30) {
                return "Cancer";
            }
        } else if (month == 7) {
            if (day <= 22) {
                return "Cancer";
            } else if (day <= 31) {
                return "Leo";
            }
        } else if (month == 8) {
            if (day <= 22) {
                return "Leo";
            } else if (day <= 31) {
                return "Virgo";
            }
        } else if (month == 9) {
            if (day <= 22) {
                return "Virgo";
            } else if (day <= 30) {
                return "Libra";
            }
        } else if (month == 10) {
            if (day <= 22) {
                return "Libra";
            } else if (day <= 31) {
                return "Scorpio";
            }
        } else if (month == 11) {
            if (day <= 21) {
                return "Scorpio";
            } else if (day <= 30) {
                return "Sagittarius";
            }
        } else if (month == 12) {
            if (day <= 21) {
                return "Sagittarius";
            } else if (day <= 31) {
                return "Capricorn";
            }
        }

        return null;
    }
}

