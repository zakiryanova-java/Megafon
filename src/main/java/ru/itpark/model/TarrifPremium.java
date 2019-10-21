package ru.itpark.model;

public class TarrifPremium extends TarrifObshchaysya {
    private String smsMegafon;
    private int smsOther;
    private String megafonProtect;

    public TarrifPremium(int id, String name, int price, int callDuration, String callAcrossMegafon, String incomingCall, String specialTerm, String megafonTV, String litRes, String antivirusEsetNod32, String serviceArea, String internet, int cashback, String megafonPress, String smsMegafon, int smsOther, String megafonProtect) {
        super(id, name, price, callDuration, callAcrossMegafon, incomingCall, specialTerm, megafonTV, litRes, antivirusEsetNod32, serviceArea, internet, cashback, megafonPress);
        this.smsMegafon = smsMegafon;
        this.smsOther = smsOther;
        this.megafonProtect = megafonProtect;
    }

    public String getSmsMegafon() {
        return smsMegafon;
    }

    public void setSmsMegafon(String smsMegafon) {
        this.smsMegafon = smsMegafon;
    }

    public int getSmsOther() {
        return smsOther;
    }

    public void setSmsOther(int smsOther) {
        this.smsOther = smsOther;
    }

    public String getMegafonProtect() {
        return megafonProtect;
    }

    public void setMegafonProtect(String megafonProtect) {
        this.megafonProtect = megafonProtect;
    }
}
