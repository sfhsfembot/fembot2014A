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
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.camera.AxisCamera;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc692.AerialAssist2014.commands.*;
import org.usfirst.frc692.AerialAssist2014.subsystems.*;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    Command autonomousCommand;
    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DriveTrain driveTrain;
    public static Shooter shooter;
    public static Gatherer gatherer;
    public static PneumaticsForDrive pneumaticsForDrive;
    public static PneumaticsForPasserPusher pneumaticsForPasserPusher;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    AxisCamera camera;
    Compressor compressor = new Compressor(1, 1, 1, 1);
    
    public void robotInit() {
	RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrain = new DriveTrain();
        shooter = new Shooter();
        gatherer = new Gatherer();
        pneumaticsForDrive = new PneumaticsForDrive();
        pneumaticsForPasserPusher = new PneumaticsForPasserPusher();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
        
        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        autonomousCommand = new AutonGroup();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
          compressor.start();
        //starts the compressor
        //AC 2/7/14
        
        
         camera = AxisCamera.getInstance("10.6.92.11");
        //gets the image from the camera
        //AC 1/18/14
        camera.writeResolution(AxisCamera.ResolutionT.k320x240);
        //sets resolution for camera image on driver station to 320x240
        //AC 1/18/14
        camera.writeBrightness(50);
        //does not change brightness
        //AC 1/18/14
        camera.writeCompression(52);
         
        Robot.pneumaticsForDrive.lowGear();
        Robot.gatherer.gathererGoUp();
        Robot.pneumaticsForPasserPusher.pusherGoBack();
            
    }
    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }
    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        
        Scheduler.getInstance().run();
    }
    public void teleopInit() {
	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        
        Scheduler.getInstance().run();
        
        DriverStationLCD.getInstance().updateLCD();
        //allows the driver station to be updated with the current image from the camera
        //AC 1/18/14
    }
    /**
     * This function called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
