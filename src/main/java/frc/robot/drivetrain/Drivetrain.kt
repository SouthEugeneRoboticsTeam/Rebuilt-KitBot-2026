package frc.robot.drivetrain

import com.ctre.phoenix.motorcontrol.NeutralMode
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.DrivetrainConstants

object Drivetrain : SubsystemBase() {

    private val leftLeader = WPI_TalonSRX(DrivetrainConstants.LEFT_LEADER_ID)
    private val leftFollower = WPI_TalonSRX(DrivetrainConstants.LEFT_FOLLOWER_ID)
    private val rightLeader = WPI_TalonSRX(DrivetrainConstants.RIGHT_LEADER_ID)
    private val rightFollower = WPI_TalonSRX(DrivetrainConstants.RIGHT_FOLLOWER_ID)


    init{
        leftLeader.inverted = DrivetrainConstants.LEFT_LEADER_INVERTED
        leftFollower.inverted = DrivetrainConstants.LEFT_FOLLOWER_INVERTED
        rightLeader.inverted = DrivetrainConstants.RIGHT_LEADER_INVERTED
        rightFollower.inverted = DrivetrainConstants.RIGHT_FOLLOWER_INVERTED

        leftLeader.setNeutralMode(NeutralMode.Brake)
        leftFollower.setNeutralMode(NeutralMode.Brake)
        rightLeader.setNeutralMode(NeutralMode.Brake)
        rightFollower.setNeutralMode(NeutralMode.Brake)

        leftFollower.follow(leftLeader)
        rightFollower.follow(rightLeader)

        defaultCommand = Drive()
    }

    val drivetrain = DifferentialDrive(leftLeader, rightLeader)

    fun setLeftVoltage(voltage: Double) { leftLeader.setVoltage(voltage) }

    fun setRightVoltage(voltage: Double) { rightLeader.setVoltage(voltage) }

    fun stopMotors(){
        leftLeader.stopMotor()
        rightLeader.stopMotor()
    }
}