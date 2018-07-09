/*
 * Challenge urself
 */
package org.jana;

public class Computer {

    private int hdd;
    private int ram;

    private boolean hasBluetooth;
    private boolean hasWifi;

    private Computer(Builder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasWifi = builder.hasWifi;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hdd=" + hdd +
                ", ram=" + ram +
                ", hasBluetooth=" + hasBluetooth +
                ", hasWifi=" + hasWifi +
                '}';
    }

    public static class Builder {
        private int hdd;
        private int ram;

        private boolean hasBluetooth;
        private boolean hasWifi;

        Builder(int hdd, int ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public Builder hasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Builder hasWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}
