package frc.robot.indexer

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.GeneralConstants
import frc.robot.IndexerConstants
import frc.robot.indexer.Indexer

class Outtake : Command() {

    init { addRequirements(Indexer) }

    override fun initialize() {
        run { Rev(GeneralConstants.flywheelReverseSpeed) } // TODO: check if this is correct syntax
        Indexer.setRollerVoltage(IndexerConstants.ROLLER_OUTTAKE_VOLTAGE)
    }

    override fun isFinished(): Boolean { return false }

    override fun end(interrupted: Boolean) {
        run{ Rev(GeneralConstants.flywheelIdleSpeed) }
        Indexer.stopRoller()
    }
}
