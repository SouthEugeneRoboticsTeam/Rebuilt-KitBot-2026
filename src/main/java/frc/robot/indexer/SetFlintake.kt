package frc.robot.indexer

import edu.wpi.first.math.controller.BangBangController
import edu.wpi.first.math.controller.PIDController
import edu.wpi.first.math.controller.SimpleMotorFeedforward
import edu.wpi.first.wpilibj2.command.Command
import frc.robot.FlintakeConstants

class SetFlintake (private val rpm: Double) : Command() {
    private val pidController = PIDController(
        FlintakeConstants.FLINTAKE_P,
        FlintakeConstants.FLINTAKE_I,
        FlintakeConstants.FLINTAKE_D
    )

    init {
        addRequirements(Flintake)
    }

    override fun initialize() {}

    override fun execute() {
        Flintake.setFlintakeVoltage(pidController.calculate(Flintake.getFlintakeSpeed(), rpm))
    }

    override fun isFinished(): Boolean {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false
    }

    override fun end(interrupted: Boolean) {
        Flintake.stopFlintake()
    }
}
