// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class servos extends SubsystemBase {
  /** Creates a new servos. */
  Servo servo1, servo2;
  public servos() {
    servo1 = new Servo(3);
    servo2 = new Servo(4);
  }

  public void setServos(double angle) {
    servo1.setAngle(angle);
    servo2.setAngle(angle);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
