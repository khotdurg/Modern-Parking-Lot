package Project.ParkingLot.Model;

import Project.ParkingLot.Model.Enum.GateStatus;
import Project.ParkingLot.Model.Enum.GateType;

public class Gate extends BaseModel{
    private GateType gateType;
    private int gateNumber; // 101 -> floor 1, gate no 01
    private GateStatus gateStatus;
    private String operatorName;

    public Gate(){

    }

    public Gate(GateType gateType, int gateNumber, GateStatus gateStatus, String operatorName) {
        this.gateType = gateType;
        this.gateNumber = gateNumber;
        this.gateStatus = gateStatus;
        this.operatorName = operatorName;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
