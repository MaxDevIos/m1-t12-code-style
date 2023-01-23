import java.util.Scanner;

public class DepositCalculator {
    double calculateComplexPercent(double amount, int deposit) {
       double pay = amount * Math.pow((1 + 0.06 / 12), 12 * deposit);
       return round(pay);
    }

    double calculateSimplePercent(double amount, int depositPeriod) {
         return round(amount + amount * 0.06 * depositPeriod);
    }

    double round(double value) {
        double scaLe = Math.pow(10, 2);
        return Math.round(value * scaLe) / scaLe;
    }

    void calculationDeposit() {
        int period;
        int action;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();

        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();

        double totalSum = 0;

        if (action == 1) {
            totalSum = calculateSimplePercent(amount, period);
        } else if (action == 2) {
            totalSum = calculateComplexPercent(amount, period);
        }

        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + totalSum);
    }

    public static void main(String[] args) {
        new DepositCalculator().calculationDeposit();
    }
}
