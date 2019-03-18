package org.usfirst.frc5577.GearsBot.subsystems;

import org.usfirst.frc5577.GearsBot.Robot;
import org.usfirst.frc5577.GearsBot.RobotMap;
import org.usfirst.frc5577.GearsBot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends Subsystem {
    SpeedController rightMotor = RobotMap.driveTrainRightMotor;
    SpeedController leftMotor = RobotMap.driveTrainLeftMotor;
    DifferentialDrive robotDrive = RobotMap.driveTrainRobotDrive;

    double driveTrainSpeed = 1.0;

    public DriveTrain() {

    }

    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoysticks());
    }

    public void turn(double rotateValue) {
        robotDrive.setSafetyEnabled(true);
        robotDrive.arcadeDrive(0.1, -rotateValue, true);
    }

    public void takeJoystickInputs(Joystick xBoxController) {
        robotDrive.setSafetyEnabled(true);

        /*
         * The two options for driving are tank drive and arcade mode. To choose tank
         * you comment arcade out (i.e. //robotDrive.arcadeDrive...) To choose arcade
         * you comment tank out (i.e. //robotDrive.tankDrive...)
         */
        /**
         * You can also configure which joystick you want to use for control. Just
         * uncomment the line with the joystick you want to use, and comment out the one
         * you don't want to use.
         */
        // robotDrive.tankDrive(xBoxController.getRawAxis(Robot.oi.LEFT_AXIS_Y) *
        // driveTrainSpeed,
        robotDrive.arcadeDrive(xBoxController.getRawAxis(Robot.oi.LEFT_AXIS_Y) * driveTrainSpeed,
                -xBoxController.getRawAxis(Robot.oi.LEFT_AXIS_X) * driveTrainSpeed,
                // -xBoxController.getRawAxis(Robot.oi.RIGHT_AXIS_X) * driveTrainSpeed,
                true);
    }

    public void stop() {
        robotDrive.arcadeDrive(0, 0);
    }

}
