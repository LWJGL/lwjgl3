/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_output_limiter.txt">SOFT_output_limiter</a> extension.
 * 
 * <p>This extension allows an application to control OpenAL Soft's output limiter. OpenAL Soft 1.18 adds an output limiter to prevent excessive clipping on
 * the output, and this extension allows applications to turn it off or on.</p>
 */
public final class SOFTOutputLimiter {

    /** Accepted as part of the {@code attrList} parameter of {@link ALC10#alcCreateContext CreateContext} and {@link SOFTHRTF#alcResetDeviceSOFT ResetDeviceSOFT}, and as the {@code paramName} parameter of {@link AL10#alGetIntegerv GetIntegerv}. */
    public static final int ALC_OUTPUT_LIMITER_SOFT = 0x199A;

    private SOFTOutputLimiter() {}

}