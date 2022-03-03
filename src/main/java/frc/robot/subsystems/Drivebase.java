// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.commands.JoystickDrive;


public class Drivebase extends SubsystemBase {

  private Victor leftmotors;
  private Victor rightmotors;
 

 public Drivebase() {
leftmotors= new Victor(0);
rightmotors= new Victor(1);

  }

  public void setRaw(double leftvalue, double rightvalue) {
		leftmotors.set(leftvalue);
		rightmotors.set(rightvalue);
  }

  @Override
  public void periodic() {
    
  }

  

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }








  }



