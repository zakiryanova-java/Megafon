package ru.itpark.model;

public class TariffSpeak extends BaseTariff {
    private int internetTotal;
    private String internetMessenger;
    private int cashback;

    public TariffSpeak(int id, String name, int price, int callDuration, String callAcrossMegafon, String incomingCall, String specialTerm, String megafonTV, String litRes, String antivirusEsetNod32, String serviceArea, int internetTotal, String internetMessenger, int cashback) {
        super(id, name, price, callDuration, callAcrossMegafon, incomingCall, specialTerm, megafonTV, litRes, antivirusEsetNod32, serviceArea);
        this.internetTotal = internetTotal;
        this.internetMessenger = internetMessenger;
        this.cashback = cashback;
    }

    public int getInternetTotal() {
        return internetTotal;
    }

    public void setInternetTotal(int internetTotal) {
        this.internetTotal = internetTotal;
    }

    public String getInternetMessenger() {
        return internetMessenger;
    }

    public void setInternetMessenger(String internetMessenger) {
        this.internetMessenger = internetMessenger;
    }

    public int getCashback() {
        return cashback;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }
}
