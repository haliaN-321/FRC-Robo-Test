package frc.robot.subsystems.drivetrain.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.subsystems.drivetrain.Drivetrain;
import frc.robot.utilities.XboxController;

import java.util.HashSet;
import java.util.Set;

public class UseDrivetrain extends CommandBase {
    private final Drivetrain drivetrain;
    private final XboxController xboxController;
    double throttle, turn, leftPower, rightPower;

    public UseDrivetrain(Drivetrain subsystem, XboxController xboxController) {
        this.drivetrain = subsystem;
        this.xboxController = xboxController;
        addRequirements(drivetrain);
    }

    @Override
    public void execute() {

        throttle = xboxController.getAxisValue(XboxController.Axis.LEFT_Y);
        turn = xboxController.getAxisValue(XboxController.Axis.RIGHT_X);

        leftPower = throttle + turn;
        rightPower = throttle - turn;

        drivetrain.getLeft().getMaster().set(leftPower);
        drivetrain.getRight().getMaster().set(rightPower);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
