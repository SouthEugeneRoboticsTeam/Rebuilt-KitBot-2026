package frc.robot.indexer

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.FeederConstants
import frc.robot.FlintakeConstants

class Shoot : Command() {

    init { addRequirements(Feeder, Flintake) }

    override fun initialize() {
        Feeder.setFeederSpeed(FeederConstants.FEEDER_SHOOT_SPEED)
    }

    override fun execute() {}

    override fun isFinished(): Boolean { return false }

    override fun end(interrupted: Boolean) {
        Feeder.stopFeeder()
    }
}
