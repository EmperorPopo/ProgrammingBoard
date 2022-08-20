// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.awt.AWTEvent;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyEvent;
import java.beans.EventHandler;
import java.util.EventListener;

import edu.wpi.first.wpilibj.TimedRobot;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  Motors motors;
  servos servos;
  @Override
  public void robotInit() {
    this.motors = new Motors();
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    if (IsKeyPressed.isWPressed() == true) {
      motors.setMotors(0.3);
      servos.setServos(90);
    } else {
      motors.setMotors(0.0);
      servos.setServos(0);
    }
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}

//   public static void test() {
//     KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {

//         @Override
//         public boolean dispatchKeyEvent(KeyEvent ke) {
//             synchronized (IsKeyPressed.class) {
//                 switch (ke.getID()) {
//                     case KeyEvent.KEY_PRESSED:
//                         if (ke.getKeyCode() == KeyEvent.VK_W) {
//                         wPressed = true;
//                     }
//                     break;

//                 case KeyEvent.KEY_RELEASED:
//                     if (ke.getKeyCode() == KeyEvent.VK_W) {
//                         wPressed = false;
//                     }
//                     break;
//                 }
//                 return false;
//         }
//     }
// });
// }
}


// Copyright (c) FIRST and other WPILib contributors.

