package ru.itpark;

public class Main {
    public static void main(String[] args) {
        BonusServise service = new BonusServise();
        int result = service.calculate(1000, 4000);
        int result2 = service.calculate(1000, 50_000);
        int result3 = service.calculate(1000, 240_000);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }

}











































