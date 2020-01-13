package frc.robot.commands;

import com.revrobotics.ColorMatch;
import com.revrobotics.ColorMatchResult;
import com.revrobotics.ColorSensorV3;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj.util.ColorShim;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Constants;
import frc.robot.subsystems.ColorSensor;

import java.util.Set;

public class UseColorSensor implements Command {
    private ColorSensor instance;

    public UseColorSensor() {
        this.instance = ColorSensor.getInstance();
    }


    @Override
    public void execute() {
        ColorMatch matcher = instance.colorMatcher;

        Color detectedColor = ColorSensor.getInstance().getColor();
        ColorMatchResult match = matcher.matchClosestColor(detectedColor);

        double IR = ColorSensor.getInstance().getIR();

    }

    @Override
    public Set<Subsystem> getRequirements() {
        return null;
    }
}
