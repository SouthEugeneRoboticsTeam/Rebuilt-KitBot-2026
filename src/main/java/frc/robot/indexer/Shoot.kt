package frc.robot.indexer

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.IndexerConstants

class Shoot : Command() {

    init { addRequirements(Indexer) }

    override fun initialize() {
        Indexer.setRollerVoltage(IndexerConstants.ROLLER_SHOOT_VOLTAGE)
    }

    override fun execute() {}

    override fun isFinished(): Boolean { return false }

    override fun end(interrupted: Boolean) {
        Indexer.stopRoller()
    }
}
