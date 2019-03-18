package org.usfirst.frc5577.GearsBot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5577.GearsBot.Robot;

public class DriveWithJoysticks extends Command {

    public DriveWithJoysticks() {
        requires(Robot.driveTrain);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.driveTrain.takeJoystickInputs(Robot.oi.getJoystick());
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
