package main.java.frc.robot.commands

import edu.wpi.first.wpilibj.command.CommandGroup


class DefaultAuto : CommandGroup() {
    init {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
        addSequential(TimedDrive(4.0, 0.5, 0.5))
        addSequential(TimedDrive(1.0, 0.1, 0.7))

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 wil12lrun in parallel.

        // A command group will require all of the subsystems that each member would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the arm.
    }
}
