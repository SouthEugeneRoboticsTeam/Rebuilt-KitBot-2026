package frc.robot.drivetrain

import edu.wpi.first.wpilibj.drive.DifferentialDrive
import edu.wpi.first.wpilibj2.command.Command
import frc.robot.Input
import frc.robot.drivetrain.Drivetrain

class Drive : Command() {

    init { addRequirements(Drivetrain) }

    override fun initialize() {}

    override fun execute() { Drivetrain.drivetrain.arcadeDrive(Input.leftStickY(), Input.rightStickX()) }

    override fun isFinished(): Boolean { return false }

    override fun end(interrupted: Boolean) { Drivetrain.stopMotors() }
}
