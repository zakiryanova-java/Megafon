package ru.itpark.model;

public class TarrifSmotri extends TarrifObshchaysya {
       private int sms;
       private String megafonProtect;

    public TarrifSmotri(int id, String name, int price, int callDuration, String callAcrossMegafon, String incomingCall, String specialTerm, String megafonTV, String litRes, String antivirusEsetNod32, String serviceArea, String internet, int cashback, String megafonPress, int sms, String megafonProtect) {
        super(id, name, price, callDuration, callAcrossMegafon, incomingCall, specialTerm, megafonTV, litRes, antivirusEsetNod32, serviceArea, internet, cashback, megafonPress);
        this.sms = sms;
        this.megafonProtect = megafonProtect;
    }

    @Override
    public String toString() {
        String output= super.toString()+"\nTarrifSmotri{" +
                "sms=" + sms +
                ", megafonProtect='" + megafonProtect + '\'' +
                '}';
        return output;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public String getMegafonProtect() {
        return megafonProtect;
    }

    public void setMegafonProtect(String megafonProtect) {
        this.megafonProtect = megafonProtect;
    }
}


