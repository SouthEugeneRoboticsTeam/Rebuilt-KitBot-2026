package frc.robot

import edu.wpi.first.wpilibj2.command.button.CommandXboxController
import frc.robot.indexer.Intake
import frc.robot.indexer.Outtake
import frc.robot.indexer.SetFlintake
import frc.robot.indexer.Shoot

object Input {
    private val controller = CommandXboxController(GeneralConstants.CONTROLLER_PORT)

    private val intake = controller.a()
    private val rev = controller.leftBumper()
    private val shoot = controller.rightBumper()
    private val outtake = controller.x()

    init {

        intake.whileTrue(Intake())

        rev.whileTrue(SetFlintake(GeneralConstants.flywheelShootSpeed))
            .onFalse(SetFlintake(GeneralConstants.flintakeIdle))

        shoot.whileTrue(Shoot())

        outtake.whileTrue(Outtake())

    }

    fun leftStickY(): Double { return controller.leftY }

    fun rightStickY(): Double { return controller.rightY }


}