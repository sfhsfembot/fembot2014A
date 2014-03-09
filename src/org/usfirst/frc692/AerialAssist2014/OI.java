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
import org.usfirst.frc692.AerialAssist2014.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton lowShiftButton;
    public Joystick leftDrive;
    public JoystickButton highShiftButton;
    public Joystick rightDrive;
    public JoystickButton buttonTwoReadyToPass;
    public JoystickButton buttonOneShootGoAndReset;
    public JoystickButton buttonFiveMoveGathererDown;
    public JoystickButton buttonFourMoveGathererUp;
    public JoystickButton buttonThreeShooterEmergencyStop;
    public Joystick operatorStick;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        operatorStick = new Joystick(3);
        
        buttonThreeShooterEmergencyStop = new JoystickButton(operatorStick, 3);
        buttonThreeShooterEmergencyStop.whenPressed(new ShooterTestStop());
        buttonFourMoveGathererUp = new JoystickButton(operatorStick, 4);
        buttonFourMoveGathererUp.whenPressed(new MoveGathererUp());
        buttonFiveMoveGathererDown = new JoystickButton(operatorStick, 5);
        buttonFiveMoveGathererDown.whenPressed(new MoveGathererDown());
        buttonOneShootGoAndReset = new JoystickButton(operatorStick, 1);
        buttonOneShootGoAndReset.whenPressed(new ShootGoAndReset());
        buttonTwoReadyToPass = new JoystickButton(operatorStick, 2);
        buttonTwoReadyToPass.whenPressed(new ReadyToPass());
        rightDrive = new Joystick(2);
        
        highShiftButton = new JoystickButton(rightDrive, 1);
        highShiftButton.whenPressed(new HighShift());
        leftDrive = new Joystick(1);
        
        lowShiftButton = new JoystickButton(leftDrive, 1);
        lowShiftButton.whenPressed(new LowShift());
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("GatherRollerControl", new GatherRollerControl());
        SmartDashboard.putData("ReadyToPass", new ReadyToPass());
        SmartDashboard.putData("MoveGathererUp", new MoveGathererUp());
        SmartDashboard.putData("DriveWithTwoJoystick", new DriveWithTwoJoystick());
        SmartDashboard.putData("LowShift", new LowShift());
        SmartDashboard.putData("HighShift", new HighShift());
        SmartDashboard.putData("AutonGroup", new AutonGroup());
        SmartDashboard.putData("AutonMoveForward", new AutonMoveForward());
        SmartDashboard.putData("MoveGathererDown", new MoveGathererDown());
        SmartDashboard.putData("PassBall", new PassBall());
        SmartDashboard.putData("ShooterGo", new ShooterGo());
        SmartDashboard.putData("Pass", new Pass());
        SmartDashboard.putData("PushBallToPass", new PushBallToPass());
        SmartDashboard.putData("PusherRetract", new PusherRetract());
        SmartDashboard.putData("ShooterTestGo", new ShooterTestGo());
        SmartDashboard.putData("ShooterTestStop", new ShooterTestStop());
        SmartDashboard.putData("PassLimitSwitch", new PassLimitSwitch());
        SmartDashboard.putData("ShootGoAndReset", new ShootGoAndReset());
        SmartDashboard.putData("GathererAndMotorUp", new GathererAndMotorUp());
        SmartDashboard.putData("GathererAndMotorDown", new GathererAndMotorDown());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getleftDrive() {
        return leftDrive;
    }
    public Joystick getrightDrive() {
        return rightDrive;
    }
    public Joystick getoperatorStick() {
        return operatorStick;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
