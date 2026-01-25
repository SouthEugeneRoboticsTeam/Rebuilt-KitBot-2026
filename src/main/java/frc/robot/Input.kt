package frc.robot

import edu.wpi.first.wpilibj2.command.button.CommandXboxController
import frc.robot.indexer.Intake
import frc.robot.indexer.Outtake
import frc.robot.indexer.SetFlintake
import frc.robot.indexer.Shoot

object Input {
    private val controller = CommandXboxController(GeneralConstants.CONTROLLER_PORT)


    // Controls:
    //     Intake: LB
    //     Rev: Y
    //     Shoot: Right bumper
    //     Outtake (to HP): X


    private val intake = controller.leftBumper()
    private val rev = controller.y()
    private val shoot = controller.rightBumper()
    private val outtake = controller.x()

    init {

        intake.whileTrue(Intake())

        rev.onTrue(SetFlintake(FlintakeConstants.FLINTAKE_REV_RPM))
            .onFalse(SetFlintake(FlintakeConstants.FLINTAKE_IDLE_SPEED))

        shoot.whileTrue(Shoot())

        outtake.whileTrue(Outtake())

    }

    fun leftStickY(): Double {
        return controller.leftY / 4.0 // 1/4 SPEED! too fast for rowing room lol
    }

    fun rightStickX(): Double {
        return controller.rightX
    }

    fun getTurnMode(): Boolean {
        return controller.a().asBoolean
    }
}