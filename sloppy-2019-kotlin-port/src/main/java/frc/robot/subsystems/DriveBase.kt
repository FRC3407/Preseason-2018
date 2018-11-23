package main.java.frc.robot.subsystems


import edu.wpi.first.wpilibj.SpeedControllerGroup
import edu.wpi.first.wpilibj.Victor
import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import main.java.frc.robot.RobotMap
import main.java.frc.robot.commands.DriveCommand

class DriveBase : Subsystem() {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private val frontLeft = Victor(RobotMap.frontLeft)
    private val rearLeft = Victor(RobotMap.rearLeft)
    private val left = SpeedControllerGroup(frontLeft, rearLeft)
    private val frontRight = Victor(RobotMap.frontRight)
    private val rearRight = Victor(RobotMap.rearRight)
    private val right = SpeedControllerGroup(frontRight, rearRight)

    internal var drive = DifferentialDrive(left, right)

    fun tank(leftPower: Double, rightPower: Double) {
        drive.tankDrive(leftPower, rightPower)
    }

    fun arcade(power: Double, angle: Double) {
        drive.arcadeDrive(power, angle)
    }

    fun stop() {
        drive.tankDrive(0.0, 0.0)
    }

    public override fun initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        defaultCommand = DriveCommand()
    }
}

