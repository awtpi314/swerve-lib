package com.swervedrivespecialties.swervelib.ctre;

import com.ctre.phoenix.ErrorCode;

import edu.wpi.first.wpilibj.RobotBase;

public final class CtreUtils {
    private CtreUtils() {
    }

    public static void checkCtreError(ErrorCode errorCode, String message) {
        if (errorCode != ErrorCode.OK && RobotBase.isReal()) {
            throw new RuntimeException(String.format("%s: %s", message, errorCode.toString()));
        } else if (!RobotBase.isReal()) {
            System.err.println("Motor config failed because running in simulator");
        }
    }
}
