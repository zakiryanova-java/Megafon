package ru.itpark.model;

public class TarrifVibiray extends BaseTarrif {
    private int internet;
    private int sms;
    private int cashback;
    private String megafonPress;

    public TarrifVibiray(int id, String name, int price, int callDuration, String callAcrossMegafon, String incomingCall, String specialTerm, String megafonTV, String litRes, String antivirusEsetNod32, String serviceArea, int internet, int sms, int cashback, String megafonPress) {
        super(id, name, price, callDuration, callAcrossMegafon, incomingCall, specialTerm, megafonTV, litRes, antivirusEsetNod32, serviceArea);
        this.internet = internet;
        this.sms = sms;
        this.cashback = cashback;
        this.megafonPress = megafonPress;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public int getCashback() {
        return cashback;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }

    public String getMegafonPress() {
        return megafonPress;
    }

    public void setMegafonPress(String megafonPress) {
        this.megafonPress = megafonPress;
    }
}
