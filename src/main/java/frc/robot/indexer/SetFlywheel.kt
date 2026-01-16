package frc.robot.indexer

import edu.wpi.first.math.controller.PIDController
import edu.wpi.first.math.controller.SimpleMotorFeedforward
import edu.wpi.first.wpilibj2.command.Command
import frc.robot.IndexerConstants

class SetFlywheel(private val rpm: Double) : Command() {

    private val pid = PIDController(IndexerConstants.FLINTAKE_P, IndexerConstants.FLINTAKE_I, IndexerConstants.FLINTAKE_D)
    private val feedForward = SimpleMotorFeedforward(IndexerConstants.FLINTAKE_KS, IndexerConstants.FLINTAKE_KV, IndexerConstants.FLINTAKE_KA)

    init { addRequirements(Indexer) }

    override fun execute() {
        Indexer.setFlintakeVoltage(pid.calculate(Indexer.getFlywheelSpeed(), rpm) + feedForward.calculate(rpm))
    }

    override fun isFinished(): Boolean { return false }

    override fun end(interrupted: Boolean) {
        Indexer.stopFlintake()
    }
}
