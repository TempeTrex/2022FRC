// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.subcommands.ClimbExtend;
import frc.robot.commands.subcommands.ClimbRetract;
import frc.robot.commands.subcommands.ClimbButton;
import frc.robot.subsystems.Climber;

public final class ClimbSequence {
  /** Creates a new ClimbSequence. */
  public ClimbSequence() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

public Command getStep1(Climber climber)
{
    return new ClimbButton(climber);
}

public Command getStep2(Climber climber)
{
    return new ClimbExtend(climber);
}
}
