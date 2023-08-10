/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_bformat_ex.txt">SOFT_bformat_ex</a> extension.
 * 
 * <p>This extension allows B-Format buffers to be interpreted according to the ACN (Ambisonic Channel Number), SN3D (Semi-Normalized), and N3D (fully
 * Normalized) standards. The AL_EXT_BFORMAT extension provides support for B-Format buffers using the FuMa standard for channel ordering and scaling,
 * however much of the ambisonic content being produced today is using a more formalized ACN ordering and SN3D scaling, some even using N3D scaling. The
 * option to interpret B-Format buffers using these standards makes them easier to use since an application won't need to manually convert them before
 * loading.</p>
 */
public final class SOFTBformatEx {

    /** Accepted as the {@code paramName} parameter of {@link AL11#alBufferi Bufferi}, {@link AL11#alBufferiv Bufferiv}, {@link AL10#alGetBufferi GetBufferi}, and {@link AL11#alGetBufferiv GetBufferiv}. */
    public static final int
        AL_AMBISONIC_LAYOUT_SOFT  = 0x1997,
        AL_AMBISONIC_SCALING_SOFT = 0x1998;

    /** Accepted as the {@code value} parameter of {@link AL11#alBufferi Bufferi} and {@link AL11#alBufferiv Bufferiv} for the {@link #AL_AMBISONIC_LAYOUT_SOFT AMBISONIC_LAYOUT_SOFT} and {@link #AL_AMBISONIC_SCALING_SOFT AMBISONIC_SCALING_SOFT} properties. */
    public static final int AL_FUMA_SOFT = 0x0;

    /** Accepted as the {@code value} parameter of {@link AL11#alBufferi Bufferi} and {@link AL11#alBufferiv Bufferiv} for the {@link #AL_AMBISONIC_LAYOUT_SOFT AMBISONIC_LAYOUT_SOFT} property. */
    public static final int AL_ACN_SOFT = 0x1;

    /** Accepted as the {@code value} parameter of {@link AL11#alBufferi Bufferi} and {@link AL11#alBufferiv Bufferiv} for the {@link #AL_AMBISONIC_SCALING_SOFT AMBISONIC_SCALING_SOFT} property. */
    public static final int
        AL_SN3D_SOFT = 0x1,
        AL_N3D_SOFT  = 0x2;

    private SOFTBformatEx() {}

}