package ru.itpark.model;

public class TarrifRazvlekaysya extends BaseTarrif {
    private int internetTotal;
    private String internetVideoMusic;
    private String internetSocial;
    private int cashback;

    public TarrifRazvlekaysya(int id, String name, int price, int callDuration, String callAcrossMegafon, String incomingCall, String specialTerm, String megafonTV, String litRes, String antivirusEsetNod32, String serviceArea, int internetTotal, String internetVideoMusic, String internetSocial, int cashback) {
        super(id, name, price, callDuration, callAcrossMegafon, incomingCall, specialTerm, megafonTV, litRes, antivirusEsetNod32, serviceArea);
        this.internetTotal = internetTotal;
        this.internetVideoMusic = internetVideoMusic;
        this.internetSocial = internetSocial;
        this.cashback = cashback;
    }

    public int getInternetTotal() {
        return internetTotal;
    }

    public void setInternetTotal(int internetTotal) {
        this.internetTotal = internetTotal;
    }

    public String getInternetVideoMusic() {
        return internetVideoMusic;
    }

    public void setInternetVideoMusic(String internetVideoMusic) {
        this.internetVideoMusic = internetVideoMusic;
    }

    public String getInternetSocial() {
        return internetSocial;
    }

    public void setInternetSocial(String internetSocial) {
        this.internetSocial = internetSocial;
    }

    public int getCashback() {
        return cashback;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }
}
