package ru.itpark.model;

public class TariffWrite extends BaseTariff {
    private int internetTotal;
    private String internetMessengers;
    private int sms;

    public TariffWrite(int id, String name, int price, int callDuration, String callAcrossMegafon, String incomingCall, String specialTerm, String megafonTV, String litRes, String antivirusEsetNod32, String serviceArea, int internetTotal, String internetMessengers, int sms) {
        super(id, name, price, callDuration, callAcrossMegafon, incomingCall, specialTerm, megafonTV, litRes, antivirusEsetNod32, serviceArea);
        this.internetTotal = internetTotal;
        this.internetMessengers = internetMessengers;
        this.sms = sms;
    }

    public int getInternetTotal() {
        return internetTotal;
    }

    public void setInternetTotal(int internetTotal) {
        this.internetTotal = internetTotal;
    }

    public String getInternetMessengers() {
        return internetMessengers;
    }

    public void setInternetMessengers(String internetMessengers) {
        this.internetMessengers = internetMessengers;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }
}
