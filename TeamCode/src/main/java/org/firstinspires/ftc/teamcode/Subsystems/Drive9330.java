package org.firstinspires.ftc.teamcode.Subsystems;

import org.firstinspires.ftc.teamcode.Hardware9330;

public class Drive9330 {

    Hardware9330 hwMap;

    public Drive9330(Hardware9330 hwMap) {
        this.hwMap = hwMap;
    }

    public void spinEverythingWow(float power) {
        hwMap.rightFront.setPower(power);
        hwMap.leftFront.setPower(power);
        hwMap.rightBack.setPower(power);
        hwMap.leftBack.setPower(power);
    }

}
