package com.enoch.studio.model;

public class DeployKey {
    private Short terminalid;

    private Short stationid;

    public DeployKey(Short terminalid, Short stationid) {
        this.terminalid = terminalid;
        this.stationid = stationid;
    }

    public DeployKey() {
        super();
    }

    public Short getTerminalid() {
        return terminalid;
    }

    public void setTerminalid(Short terminalid) {
        this.terminalid = terminalid;
    }

    public Short getStationid() {
        return stationid;
    }

    public void setStationid(Short stationid) {
        this.stationid = stationid;
    }
}