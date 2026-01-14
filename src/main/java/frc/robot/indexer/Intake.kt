package frc.robot.indexer

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.indexer.Indexer

class Intake : Command() {

    init { addRequirements(Indexer) }

    override fun initialize() {}

    override fun execute() {}

    override fun isFinished(): Boolean {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false
    }

    override fun end(interrupted: Boolean) {}
}
