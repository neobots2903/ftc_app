package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Hardware9330;
import org.firstinspires.ftc.teamcode.Subsystems.Grabber9330;

@TeleOp(name = "TeleOp9330", group = "Opmode")

public class TeleOp9330 extends OpMode {

    Hardware9330 robot9330 = new Hardware9330();
    Grabber9330 grabber9330;

    private boolean isAHeld = false;


    @Override
    public void init() {
        robot9330.init(hardwareMap);
        grabber9330 = new Grabber9330(robot9330);
    }

    @Override
    public void loop() {

        if(gamepad2.a && !isAHeld){

            grabber9330.toggle();
            isAHeld = true;

        } else if (!gamepad2.a){

            isAHeld = false;

        }

    }
}
