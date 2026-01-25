package frc.robot


object GeneralConstants {
    var driveSpeed = 1.0 // idk

    const val CONTROLLER_PORT = 0
}

object FlintakeConstants {
    const val FLINTAKE_MOTOR_INVERTED = false

    const val FLINTAKE_MOTOR_ID = 18

    const val FLINTAKE_MOTOR_CURRENT_LIMIT = 50

    const val FLINTAKE_P = 10.0
    const val FLINTAKE_I = 0.0
    const val FLINTAKE_D = 0.0

    const val FLINTAKE_INTAKE_SPEED = -0.5
    const val FLINTAKE_IDLE_SPEED = 0.0
    const val FLINTAKE_OUTTAKE_SPEED = 0.5
    const val FLINTAKE_REV_RPM = 500.0
}

object FeederConstants {
    const val FEEDER_MOTOR_ID = 3

    const val FEEDER_MOTOR_INVERTED = false

    const val FEEDER_INTAKE_SPEED = -0.5
    const val FEEDER_OUTTAKE_SPEED = 0.5

    const val FEEDER_SHOOT_SPEED = -0.5

}

object DrivetrainConstants {
    const val LEFT_LEADER_ID = 5
    const val RIGHT_LEADER_ID = 11
    const val LEFT_FOLLOWER_ID = 12
    const val RIGHT_FOLLOWER_ID = 7

    const val LEFT_LEADER_INVERTED = true
    const val RIGHT_LEADER_INVERTED = false
    const val LEFT_FOLLOWER_INVERTED = true
    const val RIGHT_FOLLOWER_INVERTED = false
}