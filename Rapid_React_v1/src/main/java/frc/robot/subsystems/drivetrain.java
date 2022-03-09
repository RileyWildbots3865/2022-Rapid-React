// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.Timer;
import java.util.TimerTask;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class drivetrain extends SubsystemBase {
  WPI_TalonSRX frontRight;
  WPI_TalonSRX frontLeft;

  WPI_TalonSRX backRight;
  WPI_TalonSRX backLeft;

  MotorControllerGroup leftGroup;
  MotorControllerGroup rightGroup;

  DifferentialDrive drive;

  /** Creates a new drivetrain. */
  public drivetrain() {
    frontLeft = new WPI_TalonSRX(Constants.LEFT_FRONT_MOTOR);
    backLeft = new WPI_TalonSRX(Constants.LEFT_REAR_MOTOR);

    frontRight = new WPI_TalonSRX(Constants.RIGHT_FRONT_MOTOR);
    backRight = new WPI_TalonSRX(Constants.RIGHT_REAR_MOTOR);
    

    leftGroup = new MotorControllerGroup(frontLeft, backLeft);
    rightGroup = new MotorControllerGroup(frontRight, backRight);

    drive = new DifferentialDrive(leftGroup, rightGroup);
  }

  // public void autoCrossLine(){
  //   System.out.println("Working");
  //   boolean bool = true;
  //   while (bool){
  //     drive.arcadeDrive(-.7, 0);
  //   }
    
    // try {
    //   Thread.sleep(2000);
    // } catch (InterruptedException e) {
    //   // TODO Auto-generated catch block
    //   Thread.currentThread().interrupt();
    //   e.printStackTrace();
    // }
    // drive.arcadeDrive(0,0);
//  }

  public void tankDrive(double leftSpeed, double rightSpeed){
    System.out.println(leftSpeed);
    System.out.println(rightSpeed);
    // System.out.printf(Double.toString(leftSpeed), Double.toString(rightSpeed));
    drive.tankDrive(.7*leftSpeed, .7*rightSpeed);
  }

  public void arcadeDrive(double leftSpeed, double rotation){
    leftSpeed = leftSpeed *.7;
    rotation = rotation *-.7;
    drive.arcadeDrive(leftSpeed, rotation);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
