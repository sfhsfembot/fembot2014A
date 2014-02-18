// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc692.AerialAssist2014.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;


public class AutonGroup extends CommandGroup {
    
    public  AutonGroup() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        
        /*
         * -Auton Planning for 2014
         * Shoot the ball into top goal
         * Move forward (5 feet?) -- about 216 in.
         * 
         * -Nice to have-
         * Detect hot goal with camera
         * AC 1/20/14
         */
        
        //shoots the ball into the top goal
        //AC 1/20/14
        //addSequential(new AutonMoveForward());
        //AC 1/20/14
        addSequential(new AutonMoveForward());
        addSequential(new ShootGoAndReset());
        //addSequential(new ShootForwardAndBack());
    }
    /*
     * robot moves forward about 36 inches then shoots the ball
     * AO 1/23/14
     */
    
    /*
     * - NOTES FOR DRIVING FORWARD IN AUTON -
     * given 5 seconds to travel
     * needed speed to travel into alliance zone = 34 RPM
     * 1 revolution = 12 inches (because diameter of wheel is 4 in.)
     * therefore, need 3 revolutions to travel 33 inches
     * EV 1/23/14
     */
   
}