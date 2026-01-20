package frc.robot.indexer

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.FeederConstants
import frc.robot.FlintakeConstants

class Intake : Command() {
    init {
        addRequirements(Feeder, Flintake)
    }

    override fun initialize() {
        Flintake.setFlintakeSpeed(FlintakeConstants.FLINTAKE_INTAKE_SPEED)
        Feeder.setFeederSpeed(FeederConstants.FEEDER_INTAKE_SPEED)
    }

    override fun isFinished(): Boolean {
        return false
    }

    override fun end(interrupted: Boolean) {
        Feeder.stopFeeder()
        Flintake.setFlintakeSpeed(FlintakeConstants.FLINTAKE_IDLE_SPEED)
    }
}
