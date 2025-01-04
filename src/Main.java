/*

// Завдання 1

class Task1 {
    public static void main(String[] args) {
        System.out.println("\"Your time is limited,\n\tso don’t waste it\n\t\tliving someone else’s life\"\n\t\t\tSteve Jobs");
    }
}
*/

/*

// Завдання 2

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення: ");
        double value = scanner.nextDouble();

        System.out.print("Введіть відсоток: ");
        double percent = scanner.nextDouble();

        double result = (value * percent) / 100;
        System.out.println(percent + "% від " + value + " дорівнює " + result);
    }
}
*/

/*

// Завдання 3

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int first = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int second = scanner.nextInt();

        System.out.print("Введіть третє число: ");
        int third = scanner.nextInt();

        String result = "" + first + second + third;
        System.out.println("Сформоване число: " + result);
    }
}
*/

/*

// Завдання 4

import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть шестизначне число: ");
        String number = scanner.next();

        if (number.length() != 6) {
            System.out.println("Помилка: потрібно ввести шестизначне число.");
        } else {
            char[] digits = number.toCharArray();

            char temp = digits[0];
            digits[0] = digits[5];
            digits[5] = temp;

            temp = digits[1];
            digits[1] = digits[4];
            digits[4] = temp;

            String swappedNumber = new String(digits);
            System.out.println("Перетворене число: " + swappedNumber);
        }
    }
}

*/

/*

// Завдання 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер місяця (1-12): ");
        int month = scanner.nextInt();

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Помилка: номер місяця повинен бути від 1 до 12.");
        }
    }
}*/

/*

// Завдання 6

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість метрів: ");
        double meters = scanner.nextDouble();

        System.out.println("Виберіть одиницю вимірювання:");
        System.out.println("1 - милі");
        System.out.println("2 - дюйми");
        System.out.println("3 - ярди");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println(meters + " метрів = " + meters * 0.000621371 + " миль");
                break;
            case 2:
                System.out.println(meters + " метрів = " + meters * 39.3701 + " дюймів");
                break;
            case 3:
                System.out.println(meters + " метрів = " + meters * 1.09361 + " ярдів");
                break;
            default:
                System.out.println("Невірний вибір.");
        }
    }
}
*/

/*

// Завдання 7

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int start = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int end = scanner.nextInt();

        // Нормалізація меж
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        System.out.println("Непарні числа в діапазоні від " + start + " до " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
*/

/*

// Завдання 8

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int start = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println("Таблиця множення для " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
*/

/*

// Завдання 9

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[20];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int neg = 0;
        int pos = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101) - 50;
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < 0) neg++;
            if (arr[i] > 0) pos++;
            if (arr[i] == 0) zero++;
        }

        System.out.println("Мінімальні: " + min);
        System.out.println("Максимальні: " + max);
        System.out.println("Від'ємні: " + neg);
        System.out.println("Додатні: " + pos);
        System.out.println("Нулі: " + zero);
    }
}
*/

/*

// Завдання 10

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }

        int[] even = new int[array.length];
        int[] odd = new int[array.length];
        int[] neg = new int[array.length];
        int[] pos = new int[array.length];

        int evenIndex = 0, oddIndex = 0, negIndex = 0, posIndex = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                even[evenIndex++] = num;
            } else {
                even[oddIndex++] = num;
            }
            if (num < 0) {
                neg[negIndex++] = num;
            } else if (num > 0) {
                pos[posIndex++] = num;
            }
        }

        System.out.println("Парні числа: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.println("Непарні числа: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        System.out.println("Від'ємні числа: ");
        for (int i = 0; i < negIndex; i++) {
            System.out.print(neg[i] + " ");
        }
        System.out.println();

        System.out.println("Додатні числа: ");
        for (int i = 0; i < posIndex; i++) {
            System.out.print(pos[i] + " ");
        }
    }
}
*/

/*

// Завдання 11

public class Main {
    public static void main(String[] args) {
        drawLine(14, "horizontal", "*");
        drawLine(4, "vertical", "#");
    }

    public static void drawLine(int length, String direction, String symbol) {
        if (direction.equalsIgnoreCase("horizontal")) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else if (direction.equalsIgnoreCase("vertical")) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Невірний напрям лінії!");
        }
    }
}
*/

/*

// Завдання 12

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Виберіть напрям сортування:");
        System.out.println("1 - за зростанням");
        System.out.println("2 - за спаданням");
        int choice = scanner.nextInt();

        if (choice == 1) {
            sortArray(array, true);
        } else if (choice == 2) {
            sortArray(array, false);
        } else {
            System.out.println("Невірний вибір!");
        }

        System.out.println("Відсортований масив: " + Arrays.toString(array));
    }

    public static void sortArray(int[] array, boolean ascending) {
        if (ascending) {
            Arrays.sort(array);
        } else {
            Arrays.sort(array);
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
    }
}
*/
