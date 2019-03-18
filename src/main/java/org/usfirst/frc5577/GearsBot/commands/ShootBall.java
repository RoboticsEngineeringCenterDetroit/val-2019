package org.usfirst.frc5577.GearsBot.commands;

import org.usfirst.frc5577.GearsBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShootBall extends Command {

	private double speed = 0.7;

	public ShootBall() {
		this(0.8);
	}

	public ShootBall(double speed) {
		requires(Robot.intake);
		this.speed = speed;
	}

	@Override
	protected void initialize() {
		Robot.intake.shootOutBall(speed);
	}

	@Override
	protected void execute() {

	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void interrupted() {
		Robot.intake.shootOutBall(0);
	}

}
