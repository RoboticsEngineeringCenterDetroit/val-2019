package org.usfirst.frc5577.GearsBot.commands;

import org.usfirst.frc5577.GearsBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShiftWrist extends Command {

	private boolean initialClawState;
	private double time = 0.5;

	public ShiftWrist() {
		requires(Robot.pneumatics);

	}

	@Override
	protected void initialize() {
		setTimeout(time);
		initialClawState = Robot.pneumatics.isWristUp();
	}

	@Override
	protected void execute() {
		if (initialClawState == Robot.pneumatics.isWristUp()) {
			Robot.pneumatics.shiftWrist();
		}
	}

	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

}
