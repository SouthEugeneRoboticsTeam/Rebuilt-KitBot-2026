package frc.robot.indexer

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.FeederConstants

object Feeder : SubsystemBase() {
    private val feederMotor = WPI_TalonSRX(FeederConstants.FEEDER_MOTOR_ID)

    init {
        feederMotor.inverted = FeederConstants.FEEDER_MOTOR_INVERTED
        feederMotor.enableCurrentLimit(true)
    }

    fun setFeederVoltage(voltage: Double) {
        feederMotor.setVoltage(voltage)
    }

    fun setFeederSpeed(speed: Double) {
        feederMotor.set(speed)
    }

    fun getFeederVoltage(): Double {
        return feederMotor.motorOutputVoltage
    }

    fun stopFeeder(){
        feederMotor.stopMotor()
    }

}