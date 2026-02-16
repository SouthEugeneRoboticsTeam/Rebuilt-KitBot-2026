package frc.robot

import edu.wpi.first.wpilibj2.command.button.CommandXboxController
import frc.robot.indexer.SetFeeder
import frc.robot.indexer.SetFlintake

object Input {
    private val controller = CommandXboxController(GeneralConstants.CONTROLLER_PORT)


    // Controls:
    //     Intake: LB
    //     Rev: Y
    //     Shoot: Right bumper
    //     Outtake (to HP): X


    private val intake = controller.leftBumper()
    private val rev = controller.rightTrigger()
    private val shoot = controller.rightBumper()
    private val outtake = controller.leftTrigger()

    init {

        intake
            .whileTrue(
                SetFlintake(FlintakeConstants.FLINTAKE_INTAKE_SPEED)
                    .alongWith(SetFeeder(FeederConstants.FEEDER_INTAKE_SPEED))
        )

        rev
            .whileTrue(SetFlintake(FlintakeConstants.FLINTAKE_REV_RPM))
            .onFalse(SetFlintake(FlintakeConstants.FLINTAKE_IDLE_SPEED))

        shoot
            .whileTrue(SetFeeder(FeederConstants.FEEDER_SHOOT_SPEED))
            .onFalse(SetFeeder(0.0))

        outtake
            .whileTrue(SetFlintake(FlintakeConstants.FLINTAKE_OUTTAKE_SPEED)
                .alongWith(SetFeeder(FeederConstants.FEEDER_OUTTAKE_SPEED)))

    }

    fun leftStickY(): Double {
        return controller.leftY
    }

    fun rightStickY(): Double {
        return controller.rightY
    }
}