package frc.robot


object GeneralConstants {
    var driveSpeed = 1.0 // idk

    const val CONTROLLER_PORT = 0
}

object FlintakeConstants {
    const val FLINTAKE_MOTOR_INVERTED = false

    const val FLINTAKE_MOTOR_ID = 18

    const val FLINTAKE_MOTOR_CURRENT_LIMIT = 40

    const val FLINTAKE_KS = 0.0
    const val FLINTAKE_KV = 0.0025

    const val FLINTAKE_INTAKE_SPEED = -1500.0
    const val FLINTAKE_IDLE_SPEED = 0.0
    const val FLINTAKE_OUTTAKE_SPEED = 1000.0
    const val FLINTAKE_REV_RPM = -3500.0
}

object FeederConstants {
    const val FEEDER_MOTOR_ID = 3

    const val FEEDER_MOTOR_INVERTED = false

    const val FEEDER_INTAKE_SPEED = 1.0
    const val FEEDER_OUTTAKE_SPEED = -1.0
    const val FEEDER_SHOOT_SPEED = -1.0

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