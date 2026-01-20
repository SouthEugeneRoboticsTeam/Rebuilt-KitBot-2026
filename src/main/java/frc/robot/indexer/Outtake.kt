package frc.robot.indexer

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.FeederConstants
import frc.robot.FlintakeConstants

class Outtake : Command() {
    init {
        addRequirements(Flintake, Feeder)
    }

    override fun initialize() {
        Flintake.setFlintakeSpeed(FlintakeConstants.FLINTAKE_OUTTAKE_SPEED)
        Feeder.setFeederSpeed(FeederConstants.FEEDER_OUTTAKE_SPEED)
    }

    override fun isFinished(): Boolean {
        return false
    }

    override fun end(interrupted: Boolean) {
        Feeder.stopFeeder()
        Flintake.setFlintakeSpeed(FlintakeConstants.FLINTAKE_IDLE_SPEED)
    }
}
