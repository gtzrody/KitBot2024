package frc.robot.commands;

import frc.robot.subsystems.Shooter;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ShooterTeleop extends CommandBase {
    
        private Shooter shooterMotor;
        private DoubleSupplier power;

        public ShooterTeleop(Shooter shooterMotor, DoubleSupplier power){
            this.shooterMotor = shooterMotor;
            this.power = power;

            addRequirements(shooterMotor);
        }

        @Override
        public void initialize() {
            this.shooterMotor.stop();
        }

        @Override
        public void execute(){

            double speed = power.getAsDouble();
            this.shooterMotor.setRollers(speed);

        }

        @Override
        public boolean isFinished(){
            return false;
        }

        @Override 
        public void end(boolean interrupted){
            this.shooterMotor.stop();
        }
}