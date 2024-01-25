package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import frc.robot.commands.ShooterTeleop;
import frc.robot.subsystems.Shooter;

public class RobotContainer {
   
    //Subsystems
      public VictorSP roller1, roller2; 

    //OI
    public OI oi;

    //
    public Shooter shooter;


    //Commands
    public ShooterTeleop shooterTeleop;


      public RobotContainer(){

        //subsystems
        roller1 = new VictorSP(1);
        roller2 = new VictorSP(4);
        shooter = new Shooter(roller1, roller2);

        //OI
        oi = new OI();

        //Commands
        shooterTeleop = new ShooterTeleop(shooter, oi::getXboxRightY);
      }

      }