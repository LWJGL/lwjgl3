/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SOFTHRTF {

    public static final int ALC_HRTF_SOFT = 0x1992;

    public static final int ALC_HRTF_ID_SOFT = 0x1996;

    public static final int ALC_DONT_CARE_SOFT = 0x2;

    public static final int
        ALC_HRTF_STATUS_SOFT         = 0x1993,
        ALC_NUM_HRTF_SPECIFIERS_SOFT = 0x1994;

    public static final int ALC_HRTF_SPECIFIER_SOFT = 0x1995;

    public static final int
        ALC_HRTF_DISABLED_SOFT            = 0x0,
        ALC_HRTF_ENABLED_SOFT             = 0x1,
        ALC_HRTF_DENIED_SOFT              = 0x2,
        ALC_HRTF_REQUIRED_SOFT            = 0x3,
        ALC_HRTF_HEADPHONES_DETECTED_SOFT = 0x4,
        ALC_HRTF_UNSUPPORTED_FORMAT_SOFT  = 0x5;

    protected SOFTHRTF() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcGetStringiSOFT ] ---

    /** {@code ALCchar const * alcGetStringiSOFT(ALCdevice * device, ALCenum paramName, ALCsizei index)} */
    public static long nalcGetStringiSOFT(long device, int paramName, int index) {
		long __functionAddress = ALC.getICD().alcGetStringiSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return invokePP(device, paramName, index, __functionAddress);
    }

    /** {@code ALCchar const * alcGetStringiSOFT(ALCdevice * device, ALCenum paramName, ALCsizei index)} */
    @NativeType("ALCchar const *")
    public static @Nullable String alcGetStringiSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCenum") int paramName, @NativeType("ALCsizei") int index) {
        long __result = nalcGetStringiSOFT(device, paramName, index);
        return memUTF8Safe(__result);
    }

    // --- [ alcResetDeviceSOFT ] ---

    /** {@code ALCboolean alcResetDeviceSOFT(ALCdevice * device, ALCint const * attrList)} */
    public static boolean nalcResetDeviceSOFT(long device, long attrList) {
		long __functionAddress = ALC.getICD().alcResetDeviceSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return invokePPZ(device, attrList, __functionAddress);
    }

    /** {@code ALCboolean alcResetDeviceSOFT(ALCdevice * device, ALCint const * attrList)} */
    @NativeType("ALCboolean")
    public static boolean alcResetDeviceSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCint const *") @Nullable IntBuffer attrList) {
        if (CHECKS) {
            checkNTSafe(attrList);
        }
        return nalcResetDeviceSOFT(device, memAddressSafe(attrList));
    }

    /** {@code ALCboolean alcResetDeviceSOFT(ALCdevice * device, ALCint const * attrList)} */
    @NativeType("ALCboolean")
    public static boolean alcResetDeviceSOFT(@NativeType("ALCdevice *") long device, @NativeType("ALCint const *") int @Nullable [] attrList) {
		long __functionAddress = ALC.getICD().alcResetDeviceSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            checkNTSafe(attrList);
        }
        return invokePPZ(device, attrList, __functionAddress);
    }

}