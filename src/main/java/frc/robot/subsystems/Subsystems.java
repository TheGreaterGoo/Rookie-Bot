// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

/** Container class that manages robot subsystems. */
public class Subsystems {
  public final SwerveSubsystem drivetrain = new SwerveSubsystem();
  public final ClawSubsystem claw = new ClawSubsystem();
}
