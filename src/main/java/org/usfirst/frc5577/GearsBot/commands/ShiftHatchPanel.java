package org.usfirst.frc5577.GearsBot.commands;

import org.usfirst.frc5577.GearsBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShiftHatchPanel extends Command {

    private boolean initialHatchPanelState;
    private double time = 0.5;

    public ShiftHatchPanel() {
        requires(Robot.pneumatics);

    }

    @Override
    protected void initialize() {
        setTimeout(time);
        initialHatchPanelState = Robot.pneumatics.isHatchPanelOut();
    }

    @Override
    protected void execute() {
        if (initialHatchPanelState == Robot.pneumatics.isHatchPanelOut()) {
            Robot.pneumatics.shiftHatchPanel();
        }
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }
}
