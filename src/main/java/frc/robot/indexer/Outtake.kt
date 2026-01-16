package frc.robot.indexer

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.IndexerConstants

class Outtake : Command() {

    init { addRequirements(Indexer) }

    override fun initialize() {
        Indexer.setFlintakeVoltage(IndexerConstants.FLINTAKE_OUTTAKE_VOLTAGE)
    }

    override fun isFinished(): Boolean { return false }

    override fun end(interrupted: Boolean) {
        Indexer.stopFlintake()
    }
}
