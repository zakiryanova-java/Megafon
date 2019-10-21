package ru.itpark.model;

public class BaseTarrif {
    private int id;
    private String name;
    private int price;
    private int callDuration;
    private String callAcrossMegafon;
    private String incomingCall;
    private String specialTerm;
    private String megafonTV;
    private String litRes;
    private String antivirusEsetNod32;
    private String serviceArea;

    public BaseTarrif(int id, String name, int price, int callDuration, String callAcrossMegafon, String incomingCall, String specialTerm, String megafonTV, String litRes, String antivirusEsetNod32, String serviceArea) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.callDuration = callDuration;
        this.callAcrossMegafon = callAcrossMegafon;
        this.incomingCall = incomingCall;
        this.specialTerm = specialTerm;
        this.megafonTV = megafonTV;
        this.litRes = litRes;
        this.antivirusEsetNod32 = antivirusEsetNod32;
        this.serviceArea = serviceArea;
    }


    @Override
    public String toString() {
        return "BaseTarrif{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", callDuration=" + callDuration +
                ", callAcrossMegafon='" + callAcrossMegafon + '\'' +
                ", incomingCall='" + incomingCall + '\'' +
                ", specialTerm='" + specialTerm + '\'' +
                ", megafonTV='" + megafonTV + '\'' +
                ", litRes='" + litRes + '\'' +
                ", antivirusEsetNod32='" + antivirusEsetNod32 + '\'' +
                ", serviceArea='" + serviceArea + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCallDuration(int callDuration) {
        this.callDuration = callDuration;
    }

    public void setCallAcrossMegafon(String callAcrossMegafon) {
        this.callAcrossMegafon = callAcrossMegafon;
    }

    public void setIncomingCall(String incomingCall) {
        this.incomingCall = incomingCall;
    }

    public void setSpecialTerm(String specialTerm) {
        this.specialTerm = specialTerm;
    }

    public void setMegafonTV(String megafonTV) {
        this.megafonTV = megafonTV;
    }

    public void setLitRes(String litRes) {
        this.litRes = litRes;
    }

    public void setAntivirusEsetNod32(String antivirusEsetNod32) {
        this.antivirusEsetNod32 = antivirusEsetNod32;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCallDuration() {
        return callDuration;
    }

    public String getCallAcrossMegafon() {
        return callAcrossMegafon;
    }

    public String getIncomingCall() {
        return incomingCall;
    }

    public String getSpecialTerm() {
        return specialTerm;
    }

    public String getMegafonTV() {
        return megafonTV;
    }

    public String getLitRes() {
        return litRes;
    }

    public String getAntivirusEsetNod32() {
        return antivirusEsetNod32;
    }

    public String getServiceArea() {
        return serviceArea;
    }
}
