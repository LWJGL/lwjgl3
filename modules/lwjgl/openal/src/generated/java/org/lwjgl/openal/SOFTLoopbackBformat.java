/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/ALC_SOFT_loopback_bformat.txt">ALC_SOFT_loopback_bformat</a> extension.
 * 
 * <p>This extension allows a loopback device to render B-Format audio channels. The base loopback extension provides for discrete channel mixes, while
 * sometimes a non-discrete soundfield mix may be desirable, for instance if recording a 3D video or passing the output to an external ambisonic decoder.</p>
 */
public final class SOFTLoopbackBformat {

    /**
     * Accepted as parameters for {@link SOFTLoopback#ALC_FORMAT_CHANNELS_SOFT FORMAT_CHANNELS_SOFT} in the {@code attrList} parameter of {@link ALC10#alcCreateContext CreateContext}, and by the {@code channels} parameter of
     * {@link SOFTLoopback#alcIsRenderFormatSupportedSOFT IsRenderFormatSupportedSOFT}.
     */
    public static final int ALC_BFORMAT3D_SOFT = 0x1507;

    /** Accepted as part of the {@code attrList} parameter of {@link ALC10#alcCreateContext CreateContext}. */
    public static final int
        ALC_AMBISONIC_LAYOUT_SOFT  = 0x1997,
        ALC_AMBISONIC_SCALING_SOFT = 0x1998,
        ALC_AMBISONIC_ORDER_SOFT   = 0x1999;

    /** Accepted as parameters for {@link #ALC_AMBISONIC_LAYOUT_SOFT AMBISONIC_LAYOUT_SOFT} in the {@code attrList} parameter of {@link ALC10#alcCreateContext CreateContext}. */
    public static final int
        ALC_FUMA_SOFT = 0x0,
        ALC_ACN_SOFT  = 0x1;

    /** Accepted as parameters for {@link #ALC_AMBISONIC_SCALING_SOFT AMBISONIC_SCALING_SOFT} in the {@code attrList} parameter of {@link ALC10#alcCreateContext CreateContext}. */
    public static final int
        ALC_SN3D_SOFT = 0x1,
        ALC_N3D_SOFT  = 0x2;

    /** Accepted as the {@code paramName} parameter of {@link AL10#alGetIntegerv GetIntegerv}. */
    public static final int ALC_MAX_AMBISONIC_ORDER_SOFT = 0x199B;

    private SOFTLoopbackBformat() {}

}