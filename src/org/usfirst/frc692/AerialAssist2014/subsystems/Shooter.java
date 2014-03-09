// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc692.AerialAssist2014.subsystems;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import org.usfirst.frc692.AerialAssist2014.RobotMap;
import org.usfirst.frc692.AerialAssist2014.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Shooter extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController shooterMotor1 = RobotMap.shootershooterMotor1;
    DigitalInput shooterLimit = RobotMap.shootershooterLimit;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shooterMotorOneGo() {
        shooterMotor1.set(1.0);
    }
    
    /*
    public void shooterMotorOneGo(double speed) {
        Math.abs(speed);
        // take the absolute value so we only use the maximum value
        // EV 1/14/14
        if (speed > 1.0) {
            speed = 1.0;
        }
        // implemented to make sure output isn't out of range
        // EV 1/14/14
        shooterMotor1.set(speed);
        // pos value corresponds to counterclockwise rotation as wanted;
        // therefore, no inverse value needed
        // EV 1/14/14
    }
    */
    
    public void shooterMotorOneStop() {
        shooterMotor1.set(0.0);
    }
    /*
     * set the rotation value to 0.0 for shooterMotor1 to stop the motor
     * AO 1/14/14
     */
    
    /*public void shooterMotorOneReverse()
    {
        shooterMotor1.set(1.0);
    }
    /* 
     * set the rotation value to 1.0 for shooterMotor1 so that it would turn 
     * clockwise 
     * AO 1/16/14  
     */
    //commented out reverse because reverse could possibly ruin the choo choo
    //mechanism
    //AC 1/25/14
    
    public boolean isShooterLimitPressed()
    {
        if (shooterLimit.get() == false)
        {
            System.out.println("Limit switch is pressed.");
            return true;
        }
        else
        {
            System.out.println("Limit switch is not pressed.");
            return false;
        }
        // .get() means that the code will run if the limit is pressed -- add
        // return !x for it to run when not pressed
        // AC 1/14/14
        // checks to see when the shooter limit is pressed
        // AC 1/14/14
    }
    
    /*
    private static final int checkLimitSwitch = 0;
    private int limitSwitchState;
    
    public void readyToShoot()
    {
        limitSwitchState = checkLimitSwitch;
    }
    */
}
