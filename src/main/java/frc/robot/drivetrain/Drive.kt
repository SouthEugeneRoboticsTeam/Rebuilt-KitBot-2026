package frc.robot.drivetrain

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.GeneralConstants
import frc.robot.Input

class Drive : Command() {

    init { addRequirements(Drivetrain) }

    override fun execute() {
        Drivetrain.drivetrain.tankDrive(
            (Input.leftStickY() * GeneralConstants.driveSpeed),
            (Input.rightStickY() * GeneralConstants.driveSpeed)
        )
    }

    override fun isFinished(): Boolean {
        return false
    }

    override fun end(interrupted: Boolean) {
        Drivetrain.stopMotors()
    }
}
