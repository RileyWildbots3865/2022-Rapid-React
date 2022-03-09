// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class Climber extends SubsystemBase {
  /** Creates a new Climber. */
  VictorSP climberMotor;

  public Climber() {
      climberMotor = new VictorSP(Constants.CLIMBER_MOTOR);
  }

    // Toggle motors on button press
  public void toggleClimber(boolean toggle){
    //System.out.print(toggle);
    if(toggle){
      climberMotor.set(0.8);
    }else{
      climberMotor.set(0);
    }
  }

   // Toggle motors on button press (REVERSE)
   public void reverseClimber(boolean toggle){
    //System.out.print(toggle);
    if(toggle){
      climberMotor.set(-0.8);
    }else{
      climberMotor.set(0);
    }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
