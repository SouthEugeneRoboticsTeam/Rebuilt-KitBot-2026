package frc.robot.indexer

import edu.wpi.first.math.controller.BangBangController
import edu.wpi.first.wpilibj2.command.Command
import frc.robot.IndexerConstants
import frc.robot.indexer.Indexer

class SetFlintake (private val rpm: Double) : Command() {
    private val indexer = Indexer

    private val bbController = BangBangController(IndexerConstants.BB_TOLERANCE)

    init {
        // each subsystem used by the command must be passed into the addRequirements() method
        addRequirements(indexer)
    }

    override fun initialize() {}

    override fun execute() {
        Indexer.setFlintakeVoltage(bbController.calculate(Indexer.getFlywheelSpeed(), rpm))
    }

    override fun isFinished(): Boolean {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false
    }

    override fun end(interrupted: Boolean) {
        Indexer.stopFlintake()
    }
}
