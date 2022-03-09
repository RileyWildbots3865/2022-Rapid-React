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

public class Conveyor extends SubsystemBase {
  VictorSP conveyorMotorOne;
  VictorSP conveyorMotorTwo;

  /** Creates a new Conveyor. */
  public Conveyor() {
    conveyorMotorOne = new VictorSP(Constants.CONVEYOR_MOTOR_ONE);
    conveyorMotorTwo = new VictorSP(Constants.CONVEYOR_MOTOR_TWO);
  }

  // Toggle motors on button click
  public void toggleConveyor(boolean toggle){
    //System.out.print(toggle);
    if(toggle){
      conveyorMotorOne.set(1);
      conveyorMotorTwo.set(1);
    }else{
      conveyorMotorOne.set(0);
      conveyorMotorTwo.set(0);
    }
  }

  // Reverses conveyor motors
  public void reverseConveyor(boolean toggle){
    //System.out.print(toggle);
    if(toggle){
      conveyorMotorOne.set(-1);
      conveyorMotorTwo.set(-1);
    }else{
      conveyorMotorOne.set(0);
      conveyorMotorTwo.set(0);
    }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
