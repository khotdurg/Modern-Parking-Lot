package Project.ParkingLot.Model;

import Project.ParkingLot.Model.Enum.ParkingFloorStatus;
import Project.ParkingLot.Model.Enum.PaymentMode;
import Project.ParkingLot.Model.Enum.PaymentStatus;
import Project.ParkingLot.Model.Enum.VehicleType;

public class LuxeParkingSpot extends ParkingSpot{
    private ParkingFloorStatus floorStatus;
    private ParkingFloor parkingFloorNumber;
    private Gate gateNumber;
    private int amount;
    private Bill bill;
    private Payment payment;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;

    public LuxeParkingSpot(){

    }

    public LuxeParkingSpot(ParkingFloorStatus floorStatus, ParkingFloor parkingFloorNumber, Gate gateNumber, int amount, Bill bill, Payment payment, PaymentMode paymentMode, PaymentStatus paymentStatus, VehicleType vehicleType) {
        this.floorStatus = floorStatus;
        this.parkingFloorNumber = parkingFloorNumber;
        this.gateNumber = gateNumber;
        this.amount = amount;
        this.bill = bill;
        this.payment = payment;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
    }

    public ParkingFloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(ParkingFloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }

    public ParkingFloor getParkingFloorNumber() {
        return parkingFloorNumber;
    }

    public void setParkingFloorNumber(ParkingFloor parkingFloorNumber) {
        this.parkingFloorNumber = parkingFloorNumber;
    }

    public Gate getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(Gate gateNumber) {
        this.gateNumber = gateNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

}

