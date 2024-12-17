/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SOFTDeviceClock {

    public static final int
        ALC_DEVICE_CLOCK_SOFT         = 0x1600,
        ALC_DEVICE_LATENCY_SOFT       = 0x1601,
        ALC_DEVICE_CLOCK_LATENCY_SOFT = 0x1602;

    public static final int AL_SAMPLE_OFFSET_CLOCK_SOFT = 0x1202;

    public static final int AL_SEC_OFFSET_CLOCK_SOFT = 0x1203;

    protected SOFTDeviceClock() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcGetInteger64vSOFT ] ---

    /** {@code ALCvoid alcGetInteger64vSOFT(ALCdevice * device, ALCenum pname, ALsizei size, ALCint64SOFT * values)} */
    public static void nalcGetInteger64vSOFT(long device, int pname, int size, long values) {
		long __functionAddress = ALC.getICD().alcGetInteger64vSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(device, pname, size, values, __functionAddress);
    }

    /** {@code ALCvoid alcGetInteger64vSOFT(ALCdevice * device, ALCenum pname, ALsizei size, ALCint64SOFT * values)} */
    @NativeType("ALCvoid")
    public static void alcGetInteger64vSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCenum") int pname, @NativeType("ALCint64SOFT *") LongBuffer values) {
        nalcGetInteger64vSOFT(device, pname, values.remaining(), memAddress(values));
    }

    /** {@code ALCvoid alcGetInteger64vSOFT(ALCdevice * device, ALCenum pname, ALsizei size, ALCint64SOFT * values)} */
    @NativeType("ALCvoid")
    public static long alcGetInteger64vSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer values = stack.callocLong(1);
            nalcGetInteger64vSOFT(device, pname, 1, memAddress(values));
            return values.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code ALCvoid alcGetInteger64vSOFT(ALCdevice * device, ALCenum pname, ALsizei size, ALCint64SOFT * values)} */
    @NativeType("ALCvoid")
    public static void alcGetInteger64vSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCenum") int pname, @NativeType("ALCint64SOFT *") long[] values) {
		long __functionAddress = ALC.getICD().alcGetInteger64vSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(device, pname, values.length, values, __functionAddress);
    }

}