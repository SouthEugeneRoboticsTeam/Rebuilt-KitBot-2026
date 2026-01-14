package frc.robot.indexer

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX
import com.revrobotics.spark.SparkLowLevel
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkMax
import com.revrobotics.spark.config.SparkMaxConfig
import frc.robot.IndexerConstants

object Indexer : SubsystemBase() {

    private val flywheelMotor = SparkMax(IndexerConstants.FLYWHEEL_MOTOR_ID, SparkLowLevel.MotorType.kBrushless)
    private val rollerMotor = WPI_TalonSRX(IndexerConstants.ROLLER_MOTOR_ID)

    private val flywheelMotorConfig = SparkMaxConfig()

    init{
        flywheelMotorConfig.inverted(IndexerConstants.FLYWHEEL_MOTOR_INVERTED)
        flywheelMotorConfig.smartCurrentLimit(IndexerConstants.FLYWHEEL_MOTOR_CURRENT_LIMIT)

        rollerMotor.inverted = IndexerConstants.ROLLER_MOTOR_INVERTED
        rollerMotor.enableCurrentLimit(true)
    }

    fun setFlywheel(voltage: Double) { flywheelMotor.setVoltage(voltage) }

    fun getFlywheelRPM(): Double { return flywheelMotor.encoder.velocity }

    fun setRollerVoltage(voltage: Double) { rollerMotor.setVoltage(voltage) }

    fun stopFlywheel(){ flywheelMotor.stopMotor() }

    fun stopRoller(){ rollerMotor.stopMotor() }

}