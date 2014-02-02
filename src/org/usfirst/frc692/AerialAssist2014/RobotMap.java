// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc692.AerialAssist2014;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainlefttDriveVictor1;
    public static SpeedController driveTrainleftDriveVictor2;
    public static SpeedController driveTrainrightDriveVictor1;
    public static SpeedController driveTrainrightDriveVictor2;
    public static RobotDrive driveTrainRobotDrive;
    public static Encoder driveTrainleftEncoder;
    public static Encoder driveTrainrightEncoder;
    public static DoubleSolenoid driveTrainhighAndLowShift;
    public static SpeedController shootershooterMotor1;
    public static DigitalInput shootershooterLimit;
    public static SpeedController gatherergathererMotor;
    public static DoubleSolenoid gathererpasserPusher;
    public static DoubleSolenoid gathererupAndDownGatherer;
    public static Compressor pneumaticscompressor1;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainlefttDriveVictor1 = new Victor(1, 4);
	LiveWindow.addActuator("DriveTrain", "lefttDriveVictor1", (Victor) driveTrainlefttDriveVictor1);
        
        driveTrainleftDriveVictor2 = new Victor(1, 3);
	LiveWindow.addActuator("DriveTrain", "leftDriveVictor2", (Victor) driveTrainleftDriveVictor2);
        
        driveTrainrightDriveVictor1 = new Victor(1, 1);
	LiveWindow.addActuator("DriveTrain", "rightDriveVictor1", (Victor) driveTrainrightDriveVictor1);
        
        driveTrainrightDriveVictor2 = new Victor(1, 2);
	LiveWindow.addActuator("DriveTrain", "rightDriveVictor2", (Victor) driveTrainrightDriveVictor2);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainlefttDriveVictor1, driveTrainleftDriveVictor2,
              driveTrainrightDriveVictor1, driveTrainrightDriveVictor2);
	
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);
        driveTrainleftEncoder = new Encoder(1, 6, 1, 7, false, EncodingType.k4X);
	LiveWindow.addSensor("DriveTrain", "leftEncoder", driveTrainleftEncoder);
        driveTrainleftEncoder.setDistancePerPulse(1.0);
        driveTrainleftEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveTrainleftEncoder.start();
        driveTrainrightEncoder = new Encoder(1, 8, 1, 9, false, EncodingType.k4X);
	LiveWindow.addSensor("DriveTrain", "rightEncoder", driveTrainrightEncoder);
        driveTrainrightEncoder.setDistancePerPulse(1.0);
        driveTrainrightEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveTrainrightEncoder.start();
        driveTrainhighAndLowShift = new DoubleSolenoid(1, 1, 2);      
	
        
        shootershooterMotor1 = new Victor(1, 5);
	LiveWindow.addActuator("Shooter", "shooterMotor1", (Victor) shootershooterMotor1);
        
        shootershooterLimit = new DigitalInput(1, 2);
	LiveWindow.addSensor("Shooter", "shooterLimit", shootershooterLimit);
        
        gatherergathererMotor = new Victor(1, 7);
	LiveWindow.addActuator("Gatherer", "gathererMotor", (Victor) gatherergathererMotor);
        
        gathererpasserPusher = new DoubleSolenoid(2, 1, 2);      
	
        
        gathererupAndDownGatherer = new DoubleSolenoid(1, 3, 4);      
	
        
        pneumaticscompressor1 = new Compressor(1, 1, 1, 1);
	
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
