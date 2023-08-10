/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_output_mode.txt">SOFT_output_mode</a> extension.
 * 
 * <p>This extension provides a method for applications to request a particular output mode for playback devices, and query what's in use. With standard
 * OpenAL, the output mode is at the sole discretion of the library, with the application having no way to know what's being used. While this works fine
 * most of the time (typically the library will be able to query the system configuration and auto-select a mode to match, and the app handles sounds as
 * being in 3D space), this is sometimes not possible or the most ideal option for all use-cases. There are also cases where a desirable output mode isn't
 * distinguishable by the device configuration, for example with stereo vs UHJ vs HRTF.</p>
 */
public final class SOFTOutputMode {

    /** Accepted as part of the {@code attrList} parameter of {@link ALC10#alcCreateContext CreateContext} and as the {@code paramName} parameter of {@link AL10#alGetIntegerv GetIntegerv}. */
    public static final int ALC_OUTPUT_MODE_SOFT = 0x19AC;

    /** Accepted as part of the {@code attrList} parameter of {@link ALC10#alcCreateContext CreateContext}, for the {@link #ALC_OUTPUT_MODE_SOFT OUTPUT_MODE_SOFT} attribute. */
    public static final int
        ALC_ANY_SOFT          = 0x19AD,
        ALC_MONO_SOFT         = 0x1500,
        ALC_STEREO_SOFT       = 0x1501,
        ALC_STEREO_BASIC_SOFT = 0x19AE,
        ALC_STEREO_UHJ_SOFT   = 0x19AF,
        ALC_STEREO_HRTF_SOFT  = 0x19B2,
        ALC_QUAD_SOFT         = 0x1503,
        ALC_SURROUND_5_1_SOFT = 0x1504,
        ALC_SURROUND_6_1_SOFT = 0x1505,
        ALC_SURROUND_7_1_SOFT = 0x1506;

    private SOFTOutputMode() {}

}