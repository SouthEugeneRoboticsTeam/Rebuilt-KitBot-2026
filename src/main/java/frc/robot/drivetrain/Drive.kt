package frc.robot.drivetrain

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.drivetrain.Drivetrain

class Drive : Command() {
    private val drivetrain = Drivetrain


    init {
        // each subsystem used by the command must be passed into the addRequirements() method
        addRequirements(drivetrain)
    }

    override fun initialize() {}

    override fun execute() {}

    override fun isFinished(): Boolean {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false
    }

    override fun end(interrupted: Boolean) {}
}
