package cn.edu.hcxy.bean;

public class FlightInformation {
    private String zwq_Id;
    private String zwq_filghtId;
    private String zwq_departureTime;
    private String zwq_departurePlase;//起飞地
    private String zwq_destinationPlace;//目的地
    private int zwq_seatsNumber;//作为总数
    private int zwq_seatsRemainder;//作为余数
    private int zwq_adultPrice;//成人票价
    private int zwq_childPrice;//儿童票价

    public FlightInformation(int zwq_adultPrice, int zwq_childPrice) {
        this.zwq_adultPrice = zwq_adultPrice;
        this.zwq_childPrice = zwq_childPrice;
    }


    public FlightInformation(String zwq_filghtId, String zwq_departureTime, String zwq_departurePlase, String zwq_destinationPlace) {
        this.zwq_filghtId = zwq_filghtId;
        this.zwq_departureTime = zwq_departureTime;
        this.zwq_departurePlase = zwq_departurePlase;
        this.zwq_destinationPlace = zwq_destinationPlace;
    }

    public FlightInformation(String zwq_Id, String zwq_filghtId, String zwq_departureTime, String zwq_departurePlase, String zwq_destinationPlace, int zwq_seatsNumber, int zwq_seatsRemainder, int zwq_adultPrice, int zwq_childPrice) {
        this.zwq_Id=zwq_Id;
        this.zwq_filghtId = zwq_filghtId;
        this.zwq_departureTime = zwq_departureTime;
        this.zwq_departurePlase = zwq_departurePlase;
        this.zwq_destinationPlace = zwq_destinationPlace;
        this.zwq_seatsNumber = zwq_seatsNumber;
        this.zwq_seatsRemainder=zwq_seatsRemainder;
        this.zwq_adultPrice = zwq_adultPrice;
        this.zwq_childPrice = zwq_childPrice;
    }

    public FlightInformation(String zwq_filghtId, String zwq_departureTime, String zwq_departurePlase, String zwq_destinationPlace, int zwq_seatsNumber, int zwq_seatsRemainder, int zwq_adultPrice, int zwq_childPrice) {
        this.zwq_filghtId = zwq_filghtId;
        this.zwq_departureTime = zwq_departureTime;
        this.zwq_departurePlase = zwq_departurePlase;
        this.zwq_destinationPlace = zwq_destinationPlace;
        this.zwq_seatsNumber = zwq_seatsNumber;
        this.zwq_seatsRemainder = zwq_seatsRemainder;
        this.zwq_adultPrice = zwq_adultPrice;
        this.zwq_childPrice = zwq_childPrice;
    }

    public String getZwq_Id() {
        return zwq_Id;
    }

    public void setZwq_Id(String zwq_Id) {
        this.zwq_Id = zwq_Id;
    }

    public String getZwq_filghtId() {
        return zwq_filghtId;
    }

    public void setZwq_filghtId(String zwq_filghtId) {
        this.zwq_filghtId = zwq_filghtId;
    }

    public String getZwq_departureTime() {
        return zwq_departureTime;
    }

    public void setZwq_departureTime(String zwq_departureTime) {
        this.zwq_departureTime = zwq_departureTime;
    }

    public String getZwq_departurePlase() {
        return zwq_departurePlase;
    }

    public void setZwq_departurePlase(String zwq_departurePlase) {
        this.zwq_departurePlase = zwq_departurePlase;
    }

    public String getZwq_destinationPlace() {
        return zwq_destinationPlace;
    }

    public void setZwq_destinationPlace(String zwq_destinationPlace) {
        this.zwq_destinationPlace = zwq_destinationPlace;
    }

    public int getZwq_seatsNumber() {
        return zwq_seatsNumber;
    }

    public void setZwq_seatsNumber(int zwq_seatsNumber) {
        this.zwq_seatsNumber = zwq_seatsNumber;
    }

    public int getZwq_seatsRemainder() {
        return zwq_seatsRemainder;
    }

    public void setZwq_seatsRemainder(int zwq_seatsRemainder) {
        this.zwq_seatsRemainder = zwq_seatsRemainder;
    }

    public int getZwq_adultPrice() {
        return zwq_adultPrice;
    }

    public void setZwq_adultPrice(int zwq_adultPrice) {
        this.zwq_adultPrice = zwq_adultPrice;
    }

    public int getZwq_childPrice() {
        return zwq_childPrice;
    }

    public void setZwq_childPrice(int zwq_childPrice) {
        this.zwq_childPrice = zwq_childPrice;
    }

    public String toString(int a)
    {
        return
                "航班号：'" + zwq_filghtId + '\'' +
                ", 起飞地：'" + zwq_departurePlase + '\'' +
                ", z目的地：'" + zwq_destinationPlace + '\'' +
                ", 起飞时间：'" + zwq_departureTime + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "FlightInformation{" +
                "航班号：'" + zwq_filghtId + '\'' +
                ", 起飞时间：'" + zwq_departureTime + '\'' +
                ", 起飞地：'" + zwq_departurePlase + '\'' +
                ", z目的地：'" + zwq_destinationPlace + '\'' +
                ", 座位总数：" + zwq_seatsNumber +
                ", 剩余座位数：" + zwq_seatsRemainder +
                ", 成人票价：" + zwq_adultPrice +
                ", 儿童票价:" + zwq_childPrice +
                '}';
    }

}
