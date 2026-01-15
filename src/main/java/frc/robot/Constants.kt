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

    const val FLYWHEEL_MOTOR_ID = -1
    const val ROLLER_MOTOR_ID = -1

    const val FLYWHEEL_MOTOR_INVERTED = false
    const val ROLLER_MOTOR_INVERTED = false

    const val FLYWHEEL_MOTOR_CURRENT_LIMIT = 30
    const val ROLLER_MOTOR_CURRENT_LIMIT = 30

    const val FLYWHEEL_P = 0.0
    const val FLYWHEEL_I = 0.0
    const val FLYWHEEL_D = 0.0

    const val FLYWHEEL_KS = 0.0
    const val FLYWHEEL_KV = 0.0
    const val FLYWHEEL_KA = 0.0

    const val ROLLER_INTAKE_VOLTAGE: Double = 10.0
    const val ROLLER_OUTTAKE_VOLTAGE: Double = -12.0
    const val ROLLER_SHOOT_VOLTAGE: Double = 9.0

}

object DrivetrainConstants {

    const val LEFT_LEADER_ID = -1
    const val RIGHT_LEADER_ID = -1
    const val LEFT_FOLLOWER_ID = -1
    const val RIGHT_FOLLOWER_ID = -1


    const val LEFT_LEADER_INVERTED = false // These are random, I have a 50/50 chance of being right lol
    const val RIGHT_LEADER_INVERTED = true
    const val LEFT_FOLLOWER_INVERTED = false
    const val RIGHT_FOLLOWER_INVERTED = true

}



