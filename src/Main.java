public class Main {
    public static void main(String[] args) {

        {// Задание 1
            int[] arr = generateRandomArray();
            int sum = 0;
            for (int index = 0; index < arr.length; index++) {
                sum += arr[index];
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
        {// Задание 2
            int[] arr = generateRandomArray();
            int max = arr[0];
            int min = arr[0];
            for (int index = 0; index < arr.length; index++) {
                if (max < arr[index]) {
                    max = arr[index];
                }
                if (min > arr[index]) {
                    min = arr[index];
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        }
        {// Задание 3
            var arr = generateRandomArray();
            int sum = 0;
            for (var index = 0; index < arr.length; index++) {
                sum += arr[index];
            }
            var middle = (double) sum / arr.length;
            System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", middle);

        }
        System.out.println();
        {// Задание 4
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }

        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

}