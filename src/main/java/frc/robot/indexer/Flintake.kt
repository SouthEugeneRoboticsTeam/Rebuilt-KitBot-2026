package frc.robot.indexer

import com.revrobotics.spark.SparkLowLevel
import com.revrobotics.spark.SparkMax
import com.revrobotics.spark.config.SparkBaseConfig
import com.revrobotics.spark.config.SparkMaxConfig
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.FlintakeConstants
import frc.robot.GeneralConstants

object  Flintake : SubsystemBase() {

    private val flintakeMotor = SparkMax(FlintakeConstants.FLINTAKE_MOTOR_ID, SparkLowLevel.MotorType.kBrushless)
    private val flintakeMotorConfig = SparkMaxConfig()

    init {
        flintakeMotorConfig.inverted(FlintakeConstants.FLINTAKE_MOTOR_INVERTED)
        flintakeMotorConfig.smartCurrentLimit(FlintakeConstants.FLINTAKE_MOTOR_CURRENT_LIMIT)
        flintakeMotorConfig.idleMode(SparkBaseConfig.IdleMode.kCoast)
        flintakeMotorConfig.apply(flintakeMotorConfig)

        defaultCommand = SetFlintake(FlintakeConstants.FLINTAKE_IDLE_SPEED)
    }

    fun setFlintakeVoltage(voltage: Double) {
        flintakeMotor.setVoltage(voltage)
    }

    fun setFlintakeSpeed(speed: Double){
        flintakeMotor.set(speed)
    }

    fun getFlintakeSpeed(): Double {
        return flintakeMotor.encoder.velocity
    }

    fun getFlintakeCurrent(): Double{
        return flintakeMotor.outputCurrent
    }

    fun stopFlintake(){
        flintakeMotor.stopMotor()
    }
}