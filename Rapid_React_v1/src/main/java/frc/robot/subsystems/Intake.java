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

public class Intake extends SubsystemBase {
  VictorSP intakeMotor;

  /** Creates a new Intake. */
  public Intake() {
    intakeMotor = new VictorSP(Constants.INTAKE);
  }

  // Toggle motors on button click
  public void toggleIntake(Boolean itoggle){
    //System.out.print(itoggle);
    if(itoggle){
      intakeMotor.set(1);
    }else{
      intakeMotor.set(0);
    }
  }

  // Reverses intake motor
  public void reverseIntake(Boolean itoggle){
    //System.out.print(itoggle);
    if(itoggle){
      intakeMotor.set(-1);
    }else{
      intakeMotor.set(0);
    }
  }

  // public void autoIntake() throws InterruptedException{
  //   intakeMotor.set(1);
  //   Thread.sleep(4500);
  //   intakeMotor.set(0);
  // }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
