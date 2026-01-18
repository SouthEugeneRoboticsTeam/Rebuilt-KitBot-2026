package frc.robot


object GeneralConstants {

    var driveSpeed = 1.0 // idk
    var turnSpeed = 0.8 // idk

    var flywheelShootSpeed = 2000.0 //Guess
    var flywheelIdleSpeed = 0.0 // Idle at 0 unless it is better to keep idled?
    var flywheelReverseSpeed = -500.0

    const val CONTROLLER_PORT = 0

}

object IndexerConstants {

    const val FLINTAKE_MOTOR_ID = 18
    const val FEEDER_MOTOR_ID = 3

    const val FLYWHEEL_GEAR_RATIO = 1.0 // This is if the flywheel spins twice as past as the motor

    const val FLINTAKE_MOTOR_INVERTED = false
    const val FEEDER_MOTOR_INVERTED = false

    const val FLINTAKE_MOTOR_CURRENT_LIMIT = 30
    const val FEEDER_MOTOR_CURRENT_LIMIT = 30

    const val FLINTAKE_P = 0.0
    const val FLINTAKE_I = 0.0
    const val FLINTAKE_D = 0.0

    const val FLINTAKE_KS = 0.0
    const val FLINTAKE_KV = 0.0
    const val FLINTAKE_KA = 0.0

    const val FLINTAKE_INTAKE_VOLTAGE = 10.0
    const val FLINTAKE_OUTTAKE_VOLTAGE = -12.0

    const val FEEDER_SHOOT_VOLTAGE = 9.0
}

object DrivetrainConstants {

    const val LEFT_LEADER_ID = 5
    const val RIGHT_LEADER_ID = 11
    const val LEFT_FOLLOWER_ID = 12
    const val RIGHT_FOLLOWER_ID = 7


    const val LEFT_LEADER_INVERTED = false // These are random, I have a 50/50 chance of being right lol
    const val RIGHT_LEADER_INVERTED = true
    const val LEFT_FOLLOWER_INVERTED = false
    const val RIGHT_FOLLOWER_INVERTED = true

}



