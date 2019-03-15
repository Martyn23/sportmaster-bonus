package ru.itpark;

public class BonusServise {
    public int calculate(int currentPurchase, int totalPurchases) {

        int cardBonusPoints=100;

            if (totalPurchases < 150_000){
                cardBonusPoints=70;
            }
            if (totalPurchases < 15_000){
                cardBonusPoints=50;
            }
        return currentPurchase/1000*cardBonusPoints;













    }
}