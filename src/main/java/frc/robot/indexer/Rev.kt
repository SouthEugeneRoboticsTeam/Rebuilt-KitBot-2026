package frc.robot.indexer

import edu.wpi.first.math.controller.PIDController
import edu.wpi.first.math.controller.SimpleMotorFeedforward
import edu.wpi.first.wpilibj2.command.Command
import frc.robot.IndexerConstants

class Rev(private val rpm: Double) : Command() {

    private val pid = PIDController(IndexerConstants.FLYWHEEL_P, IndexerConstants.FLYWHEEL_I, IndexerConstants.FLYWHEEL_D)
    private val feedForward = SimpleMotorFeedforward(IndexerConstants.FLYWHEEL_KS, IndexerConstants.FLYWHEEL_KV, IndexerConstants.FLYWHEEL_KA)

    init { addRequirements(Indexer) }

    override fun execute() {
        Indexer.setFlywheel(pid.calculate(Indexer.getFlywheelRPM(), rpm) + feedForward.calculate(rpm))
    }

    override fun isFinished(): Boolean { return false }

    override fun end(interrupted: Boolean) {
        Indexer.stopFlywheel()
    }
}
