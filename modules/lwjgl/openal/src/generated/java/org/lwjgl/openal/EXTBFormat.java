/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the {@code AL_EXT_BFORMAT} extension.
 * 
 * <p>This extension indicates support for the {@link #AL_FORMAT_BFORMAT2D_8 FORMAT_BFORMAT2D_8}, {@link #AL_FORMAT_BFORMAT2D_16 FORMAT_BFORMAT2D_16}, {@link #AL_FORMAT_BFORMAT2D_FLOAT32 FORMAT_BFORMAT2D_FLOAT32}, {@link #AL_FORMAT_BFORMAT3D_8 FORMAT_BFORMAT3D_8},
 * {@link #AL_FORMAT_BFORMAT3D_16 FORMAT_BFORMAT3D_16} and {@link #AL_FORMAT_BFORMAT3D_FLOAT32 FORMAT_BFORMAT3D_FLOAT32} buffer formats. These provide 2D (WXY) and 3D (WXYZ) 8bit int, 16bit int and ALfloat support for
 * Ambisonic three- or four-channel B-Format (using W X Y Z channel ordering, encoded as the first three or four channels of Furse-Malham higher order
 * Ambisonics). Use of these formats indicate that sources are Ambisonic sources. Such sources can be oriented via {@link AL10#alSourcefv Sourcefv} using the
 * {@link AL10#AL_ORIENTATION ORIENTATION} tag, which takes the same parameters as {@code alListenerfv(AL_ORIENTATION,...)}. Such sources DO support {@link AL10#AL_SOURCE_RELATIVE SOURCE_RELATIVE} and the
 * soundfield will rotate to reflect the listener's orientation if this is off (the default). Other behaviour is as for stereo or multichannel assets.</p>
 * 
 * <p>Note that Ambisonics orients X, Y and Z axes in a different way to OpenAL. For clarity, we ignore the Ambisonic coordinate system in the API and stick
 * to the OpenAL one, making sure that the Front of the Ambisonic soundfield (actually Ambisonic +X) matches the Front of the OpenAL coordinate system (-Z
 * by default) etc. For instance, if the orientation of the source is set so that the "at" vector is to the left, then the front of the B-Format
 * soundfield will be presented to the left.</p>
 */
public final class EXTBFormat {

    /** Ambisonic formats. */
    public static final int
        AL_FORMAT_BFORMAT2D_16      = 0x20022,
        AL_FORMAT_BFORMAT2D_8       = 0x20021,
        AL_FORMAT_BFORMAT2D_FLOAT32 = 0x20023,
        AL_FORMAT_BFORMAT3D_16      = 0x20032,
        AL_FORMAT_BFORMAT3D_8       = 0x20031,
        AL_FORMAT_BFORMAT3D_FLOAT32 = 0x20033;

    private EXTBFormat() {}

}