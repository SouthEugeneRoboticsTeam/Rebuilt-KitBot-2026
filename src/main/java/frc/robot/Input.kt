package frc.robot

import edu.wpi.first.wpilibj2.command.button.CommandXboxController
import frc.robot.indexer.Intake
import frc.robot.indexer.Outtake
import frc.robot.indexer.SetFlywheel
import frc.robot.indexer.Shoot

object Input {
    private val controller = CommandXboxController(GeneralConstants.CONTROLLER_PORT)

    private val intake = controller.a()
    private val rev = controller.leftBumper()
    private val shoot = controller.rightBumper()
    private val outtake = controller.x()

    init {

        SetFlywheel(GeneralConstants.flywheelIdleSpeed)

        intake.whileTrue(Intake())

        rev.whileTrue(SetFlywheel(GeneralConstants.flywheelShootSpeed))
            .onFalse(SetFlywheel(GeneralConstants.flywheelIdleSpeed))

        shoot.whileTrue(Shoot())

        outtake.whileTrue(Outtake())

    }

    fun leftStickY(): Double { return controller.leftY }

    fun rightStickX(): Double { return controller.rightX }


}