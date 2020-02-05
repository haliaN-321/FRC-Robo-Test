package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
    private TalonSRX intake, transfer;

    public Intake() {
        intake = new TalonSRX(Constants.Manipulator.Intake.INTAKE_PORT);
        transfer = new TalonSRX(Constants.Manipulator.Intake.INTAKE2_PORT);

        intake.setNeutralMode(NeutralMode.Brake);
        transfer.setNeutralMode(NeutralMode.Brake);
    }

    public TalonSRX getIntakeMotor() {
        return intake;
    }

    public TalonSRX getTransferMotor() {return transfer;}


}