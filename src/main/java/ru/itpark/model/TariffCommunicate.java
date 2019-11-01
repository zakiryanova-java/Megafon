package ru.itpark.model;

public class TariffCommunicate extends BaseTariff {
    private String internet;
    private int cashback;
    private String megafonPress;

    public TariffCommunicate(int id, String name, int price, int callDuration, String callAcrossMegafon, String incomingCall, String specialTerm, String megafonTV, String litRes, String antivirusEsetNod32, String serviceArea, String internet, int cashback, String megafonPress) {
        super(id, name, price, callDuration, callAcrossMegafon, incomingCall, specialTerm, megafonTV, litRes, antivirusEsetNod32, serviceArea);
        this.internet = internet;
        this.cashback = cashback;
        this.megafonPress = megafonPress;
    }

    @Override
    public String toString() {
        String output=super.toString()+ "\nTariffCommunicate{" +
                "internet='" + internet + '\'' +
                ", cashback=" + cashback +
                ", megafonPress='" + megafonPress + '\'' +
                '}';
        return output;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
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
