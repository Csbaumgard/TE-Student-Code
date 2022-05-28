package com.techelevator;

public class Television {
    public boolean isOn;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void turnOff() {
        this.isOn = false;
    }
    public void turnOn() {
        this.isOn = true;
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
    }
    public void changeChannel(int newChannel) {
        if (isOn) {
            this.currentChannel = newChannel;
        }
    }
    public void channelUp() {
        if (isOn) {
            this.currentChannel = currentChannel + 1;
            if (currentChannel > 18) {
                this.currentChannel = 3;
            }
        }

    }
    public void channelDown() {
        if (isOn) {
            this.currentChannel = currentChannel - 1;
            if (currentChannel < 3) {
                this.currentChannel = 18;
            }
        }
    }
    public void raiseVolume() {
        if (isOn) {
            if (currentVolume < 10) {
                this.currentVolume += 1;
            }
        }
    }
    public void lowerVolume() {
        if (isOn) {
            if (currentVolume > 0) {
                this.currentVolume -= 1;
            }
        }
    }
}
