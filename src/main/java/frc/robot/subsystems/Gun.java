// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Gun extends SubsystemBase {

  private Victor gunmotor;
 
 public Gun() {
gunmotor= new Victor(2);
gunmotor.setSafetyEnabled(false);
  }

  public void setRaw(double gunvalue) {
		gunmotor.set(gunvalue);
		
  }

  @Override
  public void periodic() {
    
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
