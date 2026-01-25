package frc.robot.indexer

import com.ctre.phoenix.motorcontrol.can.VictorSPXConfiguration
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.FeederConstants

object Feeder : SubsystemBase() {
    private val feederMotor = WPI_VictorSPX(FeederConstants.FEEDER_MOTOR_ID)
    private val feederMotorConfig = VictorSPXConfiguration()

    init {
        feederMotor.inverted = FeederConstants.FEEDER_MOTOR_INVERTED
    }

    fun setFeederVoltage(voltage: Double) {
        feederMotor.setVoltage(voltage)
    }

    fun setFeederSpeed(speed: Double) {
        feederMotor.set(speed)
    }

    fun getFeederVoltage(): Double {
        return feederMotor.busVoltage
    }

    fun stopFeeder(){
        feederMotor.stopMotor()
    }

}