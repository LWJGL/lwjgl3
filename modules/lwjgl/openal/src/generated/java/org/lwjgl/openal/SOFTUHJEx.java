/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_UHJ_ex.txt">SOFT_UHJ_ex</a> extension.
 * 
 * <p>This extension supplements {@code AL_SOFT_UHJ} by adding {@code muLaw}, {@code aLaw}, {@code IMA4}, and {@code MSADPCM} sample types to UHJ formats.
 * The base {@code AL_SOFT_UHJ} extension could already use these formats (when available) for Super Stereo processing, and this extension allows them to
 * be used for UHJ itself too.</p>
 * 
 * <p>Requires {@link SOFTUHJ SOFT_UHJ} and one or more of {@link EXTMulaw EXT_MULAW}, {@link EXTAlaw EXT_ALAW}, {@link EXTIma4 EXT_IMA4}, and {@link SOFTMSADPCM SOFT_MSADPCM}.</p>
 */
public final class SOFTUHJEx {

    /** Accepted by the {@code format} parameter of {@link AL10#alBufferData BufferData} if {@link EXTMulaw EXT_MULAW} is also supported. */
    public static final int
        AL_FORMAT_UHJ2CHN_MULAW_SOFT = 0x19B3,
        AL_FORMAT_UHJ3CHN_MULAW_SOFT = 0x19B7,
        AL_FORMAT_UHJ4CHN_MULAW_SOFT = 0x19B9;

    /** Accepted by the {@code format} parameter of {@link AL10#alBufferData BufferData} if {@link EXTAlaw EXT_ALAW} is also supported. */
    public static final int
        AL_FORMAT_UHJ2CHN_ALAW_SOFT = 0x19B4,
        AL_FORMAT_UHJ3CHN_ALAW_SOFT = 0x19B8,
        AL_FORMAT_UHJ4CHN_ALAW_SOFT = 0x19BA;

    /** Accepted by the {@code format} parameter of {@link AL10#alBufferData BufferData} if {@link EXTIma4 EXT_IMA4} is also supported. */
    public static final int AL_FORMAT_UHJ2CHN_IMA4_SOFT = 0x19B5;

    /** Accepted by the {@code format} parameter of {@link AL10#alBufferData BufferData} if {@link SOFTMSADPCM SOFT_MSADPCM} is also supported. */
    public static final int AL_FORMAT_UHJ2CHN_MSADPCM_SOFT = 0x19B6;

    private SOFTUHJEx() {}

}