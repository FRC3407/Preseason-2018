package main.java.frc.robot.commands

import edu.wpi.first.wpilibj.command.Command
import main.java.frc.robot.Robot


class DriveCommand : Command() {
    init {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drive)
    }


    /**
     * The initialize method is called just before the first time
     * this Command is run after being started.
     */
    override fun initialize() {

    }


    /**
     * The execute method is called repeatedly when this Command is
     * scheduled to run until this Command either finishes or is canceled.
     */
    override fun execute() {
        Robot.drive.arcade(Robot.oi.rStick.y, Robot.oi.rStick.x)
    }


    /**
     *
     *
     * Returns whether this command is finished. If it is, then the command will be removed and
     * [.end] will be called.
     *
     *
     * It may be useful for a team to reference the [.isTimedOut]
     * method for time-sensitive commands.
     *
     *
     * Returning false will result in the command never ending automatically. It may still be
     * cancelled manually or interrupted by another command. Returning true will result in the
     * command executing once and finishing immediately. It is recommended to use
     * [edu.wpi.first.wpilibj.command.InstantCommand] (added in 2017) for this.
     *
     *
     * @return whether this command is finished.
     * @see Command.isTimedOut
     */
    override fun isFinished(): Boolean = false

    /**
     * Called once when the command ended peacefully; that is it is called once
     * after [.isFinished] returns true. This is where you may want to
     * wrap up loose ends, like shutting off a motor that was being used in the
     * command.
     */
    override fun end() {
        Robot.drive.stop()
    }


    /**
     *
     *
     * Called when the command ends because somebody called [.cancel] or
     * another command shared the same requirements as this one, and booted it out. For example,
     * it is called when another command which requires one or more of the same
     * subsystems is scheduled to run.
     *
     *
     * This is where you may want to wrap up loose ends, like shutting off a motor that was being
     * used in the command.
     *
     *
     * Generally, it is useful to simply call the [.end] method within this
     * method, as done here.
     *
     */
    override fun interrupted() {
        super.interrupted()
        Robot.drive.stop()
    }
}
