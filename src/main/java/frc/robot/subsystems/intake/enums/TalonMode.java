package frc.robot.subsystems.intake.enums;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public enum TalonMode {
    PERCENTOUTPUT();
    TalonMode(ControlMode controlMode) {
        this.controlMode = CommandBase.PercentOutput;
    }
}
