import java.util.Scanner;
import java.util.Random;
public class lr_2 {
    private static final int MAX_SIZE = 20;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix;
        int width, height;

        System.out.println("Введіть ширину матриці (до 20):");
        width = readValidDimension(scanner);
        System.out.println("Введіть висоту матриці (до 20):");
        height = readValidDimension(scanner);

        if (width > MAX_SIZE || height > MAX_SIZE) {
            System.out.println("Розмір матриці перевищує максимальний допустимий розмір 20x20.");
            return;
        }

        System.out.println("Оберіть спосіб заповнення матриці: 1 - ручний, 2 - випадковий");
        int choice = scanner.nextInt();

        if (choice == 1) {
            matrix = createMatrixManually(scanner, width, height);
        } else if (choice == 2) {
            matrix = createMatrixRandomly(width, height);
        } else {
            System.out.println("Неправильний вибір.");
            return;
        }

        System.out.println("Матриця:");
        printMatrix(matrix);

        int min = findMin(matrix);
        int max = findMax(matrix);
        double average = calculateAverage(matrix);
        double geometricAverage = calculateGeometricAverage(matrix);

        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + average);
        System.out.println("Середнє геометричне: " + geometricAverage);
    }

    private static int readValidDimension(Scanner scanner) {
        int dimension;
        while (true) {
            if (scanner.hasNextInt()) {
                dimension = scanner.nextInt();
                if (dimension > 0 && dimension <= MAX_SIZE) {
                    break;
                } else {
                    System.out.println("Введіть число від 1 до " + MAX_SIZE + ":");
                }
            } else {
                System.out.println("Введіть коректне ціле число:");
                scanner.next();
            }
        }
        return dimension;
    }

    private static int[][] createMatrixManually(Scanner scanner, int width, int height) {
        int[][] matrix = new int[height][width];
        System.out.println("Введіть елементи матриці:");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("Елемент [" + (i + 1) + "][" + (j + 1) + "]:");
                matrix[i][j] = readValidElement(scanner);
            }
        }
        return matrix;
    }

    private static int[][] createMatrixRandomly(int width, int height) {
        Random random = new Random();
        int[][] matrix = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }
        }
        return matrix;
    }

    private static int readValidElement(Scanner scanner) {
        int element;
        while (true) {
            if (scanner.hasNextInt()) {
                element = scanner.nextInt();
                break;
            } else {
                System.out.println("Введіть коректне ціле число:");
                scanner.next();
            }
        }
        return element;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }
        }
        return min;
    }

    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    private static double calculateAverage(int[][] matrix) {
        double sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
                count++;
            }
        }
        return sum / count;
    }

    private static double calculateGeometricAverage(int[][] matrix) {
        double product = 1.0;
        int count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                product *= num;
                count++;
            }
        }
        return Math.pow(product, 1.0 / count);
    }
}
