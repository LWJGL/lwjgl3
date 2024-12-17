/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class SOFTDeferredUpdates {

    public static final int AL_DEFERRED_UPDATES_SOFT = 0xC002;

    protected SOFTDeferredUpdates() {
        throw new UnsupportedOperationException();
    }

    // --- [ alDeferUpdatesSOFT ] ---

    /** {@code ALvoid alDeferUpdatesSOFT(void)} */
    @NativeType("ALvoid")
    public static void alDeferUpdatesSOFT() {
        long __functionAddress = AL.getICD().alDeferUpdatesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ alDeferUpdatesDirectSOFT ] ---

    /** {@code ALvoid alDeferUpdatesDirectSOFT(ALCcontext * context)} */
    @NativeType("ALvoid")
    public static void alDeferUpdatesDirectSOFT(@NativeType("ALCcontext *") long context) {
        long __functionAddress = AL.getICD().alDeferUpdatesDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ alProcessUpdatesSOFT ] ---

    /** {@code ALvoid alProcessUpdatesSOFT(void)} */
    @NativeType("ALvoid")
    public static void alProcessUpdatesSOFT() {
        long __functionAddress = AL.getICD().alProcessUpdatesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ alProcessUpdatesDirectSOFT ] ---

    /** {@code ALvoid alProcessUpdatesDirectSOFT(ALCcontext * context)} */
    @NativeType("ALvoid")
    public static void alProcessUpdatesDirectSOFT(@NativeType("ALCcontext *") long context) {
        long __functionAddress = AL.getICD().alProcessUpdatesDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, __functionAddress);
    }

}