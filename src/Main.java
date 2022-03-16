public class Main {
    public static void main(String[] args) {

        boolean bonus = false;
        int bonusMoney = bonus ? 1 : 0;
        int enterMoney = 100;  // Ввод количества денег


        int clientMoney = 100; // Деньги на счете у клиента
        int equation = enterMoney + bonusMoney + clientMoney;

        System.out.println("Сумма " + equation + " рублей");

        System.out.println("Ваш бонус равен " + bonusMoney);

    }
}
//Клиент пополнил счёт на 100 рублей - бонусов нет, итоговая сумма на счету клиента - 200 рублей