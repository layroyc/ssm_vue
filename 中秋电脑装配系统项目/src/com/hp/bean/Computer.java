package com.hp.bean;

import java.io.Serializable;

/**
 * computer
 * @author 
 */
public class Computer implements Serializable {
    private Integer computerId;

    private String computerName;

    private String memory;

    private String cup;

    private String videocard;

    private String display;

    private String hdd;

    private String price;

    private static final long serialVersionUID = 1L;

    public Integer getComputerId() {
        return computerId;
    }

    public void setComputerId(Integer computerId) {
        this.computerId = computerId;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCup() {
        return cup;
    }

    public void setCup(String cup) {
        this.cup = cup;
    }

    public String getVideocard() {
        return videocard;
    }

    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Computer other = (Computer) that;
        return (this.getComputerId() == null ? other.getComputerId() == null : this.getComputerId().equals(other.getComputerId()))
            && (this.getComputerName() == null ? other.getComputerName() == null : this.getComputerName().equals(other.getComputerName()))
            && (this.getMemory() == null ? other.getMemory() == null : this.getMemory().equals(other.getMemory()))
            && (this.getCup() == null ? other.getCup() == null : this.getCup().equals(other.getCup()))
            && (this.getVideocard() == null ? other.getVideocard() == null : this.getVideocard().equals(other.getVideocard()))
            && (this.getDisplay() == null ? other.getDisplay() == null : this.getDisplay().equals(other.getDisplay()))
            && (this.getHdd() == null ? other.getHdd() == null : this.getHdd().equals(other.getHdd()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getComputerId() == null) ? 0 : getComputerId().hashCode());
        result = prime * result + ((getComputerName() == null) ? 0 : getComputerName().hashCode());
        result = prime * result + ((getMemory() == null) ? 0 : getMemory().hashCode());
        result = prime * result + ((getCup() == null) ? 0 : getCup().hashCode());
        result = prime * result + ((getVideocard() == null) ? 0 : getVideocard().hashCode());
        result = prime * result + ((getDisplay() == null) ? 0 : getDisplay().hashCode());
        result = prime * result + ((getHdd() == null) ? 0 : getHdd().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", computerId=").append(computerId);
        sb.append(", computerName=").append(computerName);
        sb.append(", memory=").append(memory);
        sb.append(", cup=").append(cup);
        sb.append(", videocard=").append(videocard);
        sb.append(", display=").append(display);
        sb.append(", hdd=").append(hdd);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}