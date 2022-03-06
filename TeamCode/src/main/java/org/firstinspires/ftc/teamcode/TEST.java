package org.firstinspires.ftc.teamcode;/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;


@Autonomous(name = "Height Test")
public class TEST extends LinearOpMode {

    /* Declare OpMode members. */
    RobotHardware layerCake = new RobotHardware();
    ElapsedTime runtime = new ElapsedTime();
    @Override
    public void runOpMode() {
        layerCake.init(hardwareMap, telemetry);
        layerCake.initSlides();
        telemetry.addData("Status: ", "OK");
        telemetry.update();
        waitForStart();
        runtime.reset();
//        while(runtime.seconds() < 30 && opModeIsActive()){
//            telemetry.addData("Runtime(s): ", runtime.seconds());
//            telemetry.addData("Green Point(x): ", layerCake.getGreenPoint().x);
//            telemetry.addData("Status: ", "Running");
//            telemetry.update();
//        }
        layerCake.driveByAngleSensor(180, layerCake.getDistBack(), 100,5);
        sleep(1000);
        layerCake.driveByAngleEncoder(0,0,-45,0.2,5);
        sleep(1000);
        layerCake.driveByAngleEncoder(0,0,90,0.2,5);
        sleep(1000);
        layerCake.driveByAngleEncoder(0,0,0,0.2,5);
        sleep(1000);
    }

}
