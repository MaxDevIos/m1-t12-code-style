import java.util.Scanner; // Лишние импорты убрала - Отлично ))))

public class DepositCalculator { // В названии calculateComplexPercentFunction можно убрать слово Function
    double calculateComplexPercentFunction(double amount, double yearRate,int depositPeriod) { // перед int depositPeriod можно пробел поставить
        double pay = amount * Math.pow((1 + yearRate / 12), 12 * depositPeriod); // Название поменяла все понятно сразу - Отлично ))))
        return roundAvoid(pay,2); // Точно не знаю но перед 2 можно пробел поставить
    }
    double calculateSimplePercentFunction(double amount, double yearRate, int depositPeriod) { // В названии calculateSimplePercentFunction можно убрать слово Function
        return roundAvoid(amount+amount * yearRate * depositPeriod,2); // amount+amount можно плюс тоже пробелами отделить и в конце строки перед 2
    } // Вроде бы можно между функцией calculateSimplePercentFunction и roundAvoid - сделать пустую строку - отделить строкой функции
    double  roundAvoid(double value, int places) { // Я не придираюсь но между double  roundAvoid стоит 2 пробела можно оставить один
        double scaLe = Math.pow(10, places);
        return Math.round(value * scaLe) / scaLe; // Тут все супер !!!
    }
    void calculateDeposit() {
        int period;
        int action ; // можно убрать пробел между словом и ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:") ; // можно убрать пробел в конце перед знаком - ;
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:") ; // можно убрать пробел в конце перед знаком - ;
        period = scanner.nextInt( ); // Можно убрать пробел в скобках )))
        System.out.println (   "Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:"); // Можно убрать пробелы между println (   "Выберите
        action = scanner.nextInt();
        double out = 0;

        if (action == 1) {
            out = calculateSimplePercentFunction(amount, 0.06, period); // В названии calculateComplexPercentFunction можно убрать слово Function
        } else if (action == 2) {
            out = calculateComplexPercentFunction(amount, 0.06, period); // В названии calculateComplexPercentFunction можно убрать слово Function
        }

        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + out);
    }

    public static void main(String[] args) {
    new DepositCalculator().calculateDeposit(); // Можно поставить 4 отступа перед словом new
    }
    // Эту строку можно убрать но не обязательно )))
}
