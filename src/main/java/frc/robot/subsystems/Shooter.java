package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

    private final VictorSP roller1, roller2;
    
    public Shooter(VictorSP roller1, VictorSP roller2) {
        this.roller1 = roller1;
        this.roller2 = roller2;
    }

    public void setRollers(double speed) {
            this.roller1.set(speed);
            this.roller2.set(-speed);
        }

    public void stop() {
        this.roller1.stopMotor();
        this.roller2.stopMotor();
    }
    
}
