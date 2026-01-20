package frc.robot.indexer

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.IndexerConstants

class Intake : Command() {

    init { addRequirements(Indexer) }

    override fun initialize() {
        Indexer.setFlintakeVoltage(4.0)
    }

    override fun isFinished(): Boolean { return false }

    override fun end(interrupted: Boolean) {
        Indexer.stopFlintake()
    }
}
