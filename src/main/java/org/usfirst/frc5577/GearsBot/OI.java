// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc5577.GearsBot;

import java.util.ArrayList;
import java.util.List;

import org.usfirst.frc5577.GearsBot.buttons.DPadButton;
import org.usfirst.frc5577.GearsBot.buttons.DPadButton.Direction;
import org.usfirst.frc5577.GearsBot.buttons.JoystickAnalogButton;
import org.usfirst.frc5577.GearsBot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public final double ANGLE_MOTOR_SPEED = 0.5;
	public final double SHOOTER_GATE_POSITION = 0.5;

	public final int A_BUTTON = 1;
	public final int B_BUTTON = 2;
	public final int X_BUTTON = 3;
	public final int Y_BUTTON = 4;
	public final int L_BUMPER = 5;
	public final int R_BUMPER = 6;
	public final int BACK_BUTTON = 7;
	public final int START_BUTTON = 8;
	public final int LEFT_STICK_BUTTON = 9;
	public final int RIGHT_STICK_BUTTON = 10;

	public final int LEFT_AXIS_X = 0;
	public final int LEFT_AXIS_Y = 1;
	public final int LEFT_TRIGGER_AXIS = 2;
	public final int RIGHT_TRIGGER_AXIS = 3;
	public final int RIGHT_AXIS_X = 4;
	public final int RIGHT_AXIS_Y = 5;
	public final int DPAD_AXIS = 6;

	public Joystick driverController; // This is for xbox controller one or player one
	public Joystick manipulatorController; // This is for xbox controller two or player two

	private List<Button> buttons = new ArrayList<>();
	public Button rBumperDriver;
	public Button aButtonManipulator;
	public Button bButtonManipulator;
	public Button xButtonManipulator;
	public Button yButtonManipulator;
	public Button lBumperManipulator;
	public Button lTriggerManipulator;
	public Button rBumperManipulator;
	public Button rTriggerManipulator;
	public Button dPadUp;
	public Button dPadDown;

	public static OI instance;

	public static OI GetInstance() {
		if (instance == null) {
			instance = new OI();
		}
		return instance;
	}

	public Joystick getJoystick() {
		return driverController;
	}

	public OI() {

		// Driver Controller Setup
		driverController = new Joystick(0);

		rBumperDriver = new JoystickButton(driverController, R_BUMPER);
		buttons.add(rBumperDriver);

		rBumperDriver.whenPressed(new ShiftGear());

		// Manipulator Controller Setup
		manipulatorController = new Joystick(1);

		aButtonManipulator = new JoystickButton(manipulatorController, A_BUTTON);
		buttons.add(aButtonManipulator);
		bButtonManipulator = new JoystickButton(manipulatorController, B_BUTTON);
		buttons.add(bButtonManipulator);
		xButtonManipulator = new JoystickButton(manipulatorController, X_BUTTON);
		buttons.add(xButtonManipulator);
		yButtonManipulator = new JoystickButton(manipulatorController, Y_BUTTON);
		buttons.add(yButtonManipulator);
		lBumperManipulator = new JoystickButton(manipulatorController, L_BUMPER);
		buttons.add(lBumperManipulator);
		lTriggerManipulator = new JoystickAnalogButton(manipulatorController, LEFT_TRIGGER_AXIS);
		buttons.add(lTriggerManipulator);
		rBumperManipulator = new JoystickButton(manipulatorController, R_BUMPER);
		buttons.add(rBumperManipulator);
		rTriggerManipulator = new JoystickAnalogButton(manipulatorController, RIGHT_TRIGGER_AXIS);
		buttons.add(rTriggerManipulator);
		dPadUp = new DPadButton(manipulatorController, Direction.UP);
		buttons.add(dPadUp);
		dPadDown = new DPadButton(manipulatorController, Direction.DOWN);
		buttons.add(dPadDown);

		lBumperManipulator.whenPressed(new ShiftWrist());
		lTriggerManipulator.whenPressed(new ShiftHatchPanel());

		xButtonManipulator.whileHeld(new IntakeBall(1.0));
		bButtonManipulator.whileHeld(new ShootBall(1.0));
	}

	public void close() {
		for (Button b : buttons) {
			b.close();
		}
	}

}
