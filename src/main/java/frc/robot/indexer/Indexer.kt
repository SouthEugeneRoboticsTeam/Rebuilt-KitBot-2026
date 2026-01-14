package frc.robot.indexer

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX
import com.revrobotics.spark.SparkLowLevel
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkMax
import com.revrobotics.spark.config.SparkMaxConfig
import frc.robot.IndexerConstants

object Indexer : SubsystemBase() {

    private val flywheelMotor = SparkMax(IndexerConstants.FLYWHEEL_MOTOR_ID, SparkLowLevel.MotorType.kBrushless)
    private val intakeMotor = WPI_TalonSRX(IndexerConstants.ROLLER_MOTOR_ID)

    private val flywheelMotorConfig = SparkMaxConfig()

    init{
        flywheelMotorConfig.inverted(IndexerConstants.FLYWHEEL_MOTOR_INVERTED)
        flywheelMotorConfig.smartCurrentLimit(IndexerConstants.FLYWHEEL_MOTOR_CURRENT_LIMIT)

        intakeMotor.inverted = IndexerConstants.ROLLER_MOTOR_INVERTED
        intakeMotor.enableCurrentLimit(true)
    }

    fun setFlywheel(voltage: Double) { flywheelMotor.setVoltage(voltage) }

    fun getFlywheelRPM(): Double { return flywheelMotor.encoder.velocity }

    fun setIntake(speed: Double) { intakeMotor.set(speed) }

    fun stopFlywheel(){ flywheelMotor.stopMotor() }

    fun stopIntake(){ intakeMotor.stopMotor() }

}