package org.usfirst.frc5577.GearsBot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.can.*;

import org.usfirst.frc5577.GearsBot.subsystems.pid.PIDSourceTalon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static SpeedControllerGroup driveTrainRightMotor;
	public static SpeedControllerGroup driveTrainLeftMotor;
	public static DifferentialDrive driveTrainRobotDrive;

	public static WPI_TalonSRX intakeTalonSRX; // intake
	public static PIDSourceTalon elevatorTalonSRX; // elevator
	public static PIDSourceTalon armTalonSRX; // arm
	public static WPI_VictorSPX victorSPX4;
	public static WPI_VictorSPX victorSPX5;
	public static WPI_VictorSPX victorSPX6;
	public static WPI_VictorSPX victorSPX7;

	public static Compressor compressor;
	public static DoubleSolenoid driveTrainSwitch;
	public static DoubleSolenoid wristSwitch;
	public static DoubleSolenoid hatchPanelSwitch;

	static void init() {

		intakeTalonSRX = new WPI_TalonSRX(1); // intake
		elevatorTalonSRX = new PIDSourceTalon(2); // elevator
		armTalonSRX = new PIDSourceTalon(3); // arm
		victorSPX4 = new WPI_VictorSPX(4);
		victorSPX5 = new WPI_VictorSPX(5);
		victorSPX6 = new WPI_VictorSPX(6);
		victorSPX7 = new WPI_VictorSPX(7);

		driveTrainLeftMotor = new SpeedControllerGroup(victorSPX4, victorSPX5);
		driveTrainRightMotor = new SpeedControllerGroup(victorSPX6, victorSPX7);

		driveTrainRobotDrive = new DifferentialDrive(driveTrainLeftMotor, driveTrainRightMotor);
		driveTrainRobotDrive.setSafetyEnabled(true);
		driveTrainRobotDrive.setExpiration(0.1);
		driveTrainRobotDrive.setMaxOutput(1.0);

		compressor = new Compressor();
		compressor.setClosedLoopControl(true);

		driveTrainSwitch = new DoubleSolenoid(0, 1);
		driveTrainSwitch.set(DoubleSolenoid.Value.kOff);
		wristSwitch = new DoubleSolenoid(2, 3);
		wristSwitch.set(DoubleSolenoid.Value.kOff);
		hatchPanelSwitch = new DoubleSolenoid(4, 5);
		hatchPanelSwitch.set(DoubleSolenoid.Value.kOff);
	}
}
