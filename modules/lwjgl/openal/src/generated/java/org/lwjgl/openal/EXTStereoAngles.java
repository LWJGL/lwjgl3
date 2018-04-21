/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the {@code AL_EXT_STEREO_ANGLES} extension.
 * 
 * <p>This extension allows any stereo source to be "steered" by setting the angles at which the left and right channels should play.</p>
 */
public final class EXTStereoAngles {

    /**
     * Can be used with {@link AL10#alSourcefv Sourcefv} and two angles. The angles are specified anticlockwise relative to the real front, so a normal 60degree front stage is
     * specified with {@code alSourcefv(sid,AL_STEREO_ANGLES,+M_PI/6,-M_PI/6)}.
     * 
     * <p>Angles are always specified in radians, anticlockwise relative to the real front ({@link AL10#AL_SOURCE_RELATIVE SOURCE_RELATIVE} is not supported).</p>
     */
    public static final int AL_STEREO_ANGLES = 0x1030;

    private EXTStereoAngles() {}

}