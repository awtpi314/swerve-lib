package com.swervedrivespecialties.swervelib;

public interface DriveController<T> {
    void setReferenceVoltage(double voltage);

    double getStateVelocity();

    T getMotor();
}
