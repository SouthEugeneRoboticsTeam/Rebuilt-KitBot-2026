package frc.robot.indexer

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX
import com.revrobotics.spark.SparkLowLevel
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkMax
import com.revrobotics.spark.config.SparkMaxConfig
import frc.robot.GeneralConstants
import frc.robot.IndexerConstants

object Indexer : SubsystemBase() {

    private val flintakeMotor = SparkMax(IndexerConstants.FLINTAKE_MOTOR_ID, SparkLowLevel.MotorType.kBrushless)
    private val feederMotor = WPI_TalonSRX(IndexerConstants.FEEDER_MOTOR_ID)

    private val flintakeMotorConfig = SparkMaxConfig()

    init{
        flintakeMotorConfig.inverted(IndexerConstants.FLINTAKE_MOTOR_INVERTED)
        flintakeMotorConfig.smartCurrentLimit(IndexerConstants.FLINTAKE_MOTOR_CURRENT_LIMIT)

        feederMotor.inverted = IndexerConstants.FEEDER_MOTOR_INVERTED
        feederMotor.enableCurrentLimit(true)

        defaultCommand = SetFlywheel(GeneralConstants.flywheelIdleSpeed)
    }

    fun setFlintakeVoltage(voltage: Double) { flintakeMotor.setVoltage(voltage) }

    fun getFlywheelSpeed(): Double { return flintakeMotor.encoder.velocity * IndexerConstants.FLYWHEEL_GEAR_RATIO}

    fun setFeederVoltage(voltage: Double) { feederMotor.setVoltage(voltage) }

    fun stopFlintake(){ flintakeMotor.stopMotor() }

    fun stopFeeder(){ feederMotor.stopMotor() }

}