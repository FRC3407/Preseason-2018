package main.java.frc.robot.subsystems


import edu.wpi.first.wpilibj.AnalogGyro
import edu.wpi.first.wpilibj.command.Subsystem

class GyroSub : Subsystem() {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    // Initialize new object gyro
    private val geoff = AnalogGyro(1)

    val angle: Double
        get() = geoff.angle

    fun gyroCalibrate() {
        geoff.initGyro()
        geoff.calibrate()
    }


    public override fun initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

