package org.jana;

import org.junit.Test;

public class AppTest {

    @Test
    public void test() {
        Computer computer = new Computer.Builder(500, 4).hasBluetooth(true).hasWifi(true).build();
        System.out.println("computer = " + computer);

        Computer computerCustom = new Computer.Builder(750, 6).hasBluetooth(true).build();
        System.out.println("computerCustom = " + computerCustom);
    }

}
