package frc.robot.indexer

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.FeederConstants
import frc.robot.FlintakeConstants

class SetFeeder(private val speed: Double) : Command() {

    init {
        addRequirements(Feeder)
    }

    override fun initialize() {
        Feeder.setFeederSpeed(speed)
    }

    override fun execute() {}

    override fun isFinished(): Boolean { return false }

    override fun end(interrupted: Boolean) {
        Feeder.stopFeeder()
    }
}
