package frc.robot

import edu.wpi.first.wpilibj.smartdashboard.Field2d
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard
import edu.wpi.first.wpilibj2.command.SubsystemBase
import frc.robot.indexer.Feeder
import frc.robot.indexer.Flintake

object Output : SubsystemBase() {
    private val values = mutableListOf<Pair<String, () -> Double>>()
    private val bools = mutableListOf<Pair<String, () -> Boolean>>()

    init{
        values.add(Pair("Flintake Speed") { Flintake.getFlintakeSpeed() })
        values.add(Pair("Feeder Voltage") { Feeder.getFeederVoltage() })
        values.add(Pair("Flintake Current") { Flintake.getFlintakeCurrent() })

        values.add(Pair("Speed") { Input.leftStickY() })
        values.add(Pair("Turning Speed") { Input.rightStickX() })
        update()
    }

    fun update(){
        for (value in values) {
            SmartDashboard.putNumber("Output/${value.first}", value.second())
        }

//        for (bool in bools) {
//            SmartDashboard.putNumber("Output/${bool.first}", bool.second())
//        }
    }

}