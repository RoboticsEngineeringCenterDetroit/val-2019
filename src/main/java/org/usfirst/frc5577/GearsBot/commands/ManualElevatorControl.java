package org.usfirst.frc5577.GearsBot.commands;

import org.usfirst.frc5577.GearsBot.*;

import edu.wpi.first.wpilibj.command.Command;

public class ManualElevatorControl extends Command {
  public ManualElevatorControl() {
    requires(Robot.elevator);
  }

  @Override
  protected void initialize() {
    Robot.elevator.enablePID();
  }

  @Override
  protected void execute() {

    double speed = -Robot.oi.manipulatorController.getRawAxis(Robot.oi.LEFT_AXIS_Y);

    speed = Math.signum(speed) * Math.pow(speed, 2);
    Robot.elevator.moveSetpoint(speed);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }
}
