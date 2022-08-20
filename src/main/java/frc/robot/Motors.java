// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motors extends SubsystemBase {
  /** Creates a new motors. */
  TalonFX falconMotor;
  TalonSRX bagMotor;
  CANSparkMax miniNEO;
  CANSparkMax NEO;

  public Motors() {
    this.falconMotor = new TalonFX(1);
    this.bagMotor = new TalonSRX(2);
    this.miniNEO = new CANSparkMax(3, MotorType.kBrushless);
    this.NEO = new CANSparkMax(4, MotorType.kBrushless);
  }

  public void setMotors(double power) {
    falconMotor.set(ControlMode.PercentOutput, power);
    bagMotor.set(ControlMode.PercentOutput, power);
    miniNEO.set(power);
    NEO.set(power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
