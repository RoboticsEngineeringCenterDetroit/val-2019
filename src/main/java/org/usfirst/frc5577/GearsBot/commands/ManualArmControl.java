package org.usfirst.frc5577.GearsBot.commands;

import org.usfirst.frc5577.GearsBot.*;

import edu.wpi.first.wpilibj.command.Command;

public class ManualArmControl extends Command {
  public ManualArmControl() {
    requires(Robot.arm);
  }

  @Override
  protected void initialize() {
    Robot.arm.enablePID();
  }

  @Override
  protected void execute() {

    double speed = -Robot.oi.manipulatorController.getRawAxis(Robot.oi.RIGHT_AXIS_Y);

    speed = Math.signum(speed) * Math.pow(speed, 2);

    Robot.arm.moveSetpoint(speed);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }
}
