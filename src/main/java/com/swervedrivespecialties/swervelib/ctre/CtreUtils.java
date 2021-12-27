package com.swervedrivespecialties.swervelib.ctre;

import com.ctre.phoenix.ErrorCode;

public final class CtreUtils {
    private CtreUtils() {
    }

    public static void checkCtreError(ErrorCode errorCode, String message) {
        if (errorCode != ErrorCode.OK) {
            System.err.println("Could not update motor: Assuming we are running in the simulator...");
        }
    }
}
