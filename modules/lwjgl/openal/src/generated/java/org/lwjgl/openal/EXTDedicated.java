/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the {@code ALC_EXT_DEDICATED} extension.
 * 
 * <p>This extension provides two "routing" EFX effects that allow sounds to be sent to dedicated speaker channels. Audio rendered to the dedicated low
 * frequency effect ({@link #AL_EFFECT_DEDICATED_LOW_FREQUENCY_EFFECT EFFECT_DEDICATED_LOW_FREQUENCY_EFFECT}) is routed to a subwoofer if one is present. Otherwise, it is discarded.</p>
 * 
 * <p>Audio rendered to the dedicated dialogue effect ({@link #AL_EFFECT_DEDICATED_DIALOGUE EFFECT_DEDICATED_DIALOGUE}) is routed to a front centre speaker if one is present. Otherwise, it is
 * rendered to the front centre using the normal spatialisation logic.</p>
 * 
 * <p>Both effects support a gain control parameter {@link #AL_DEDICATED_GAIN DEDICATED_GAIN}, which defaults to 1.</p>
 */
public final class EXTDedicated {

    /** {@code ALC_EXT_DEDICATED} tokens. */
    public static final int
        AL_DEDICATED_GAIN                        = 0x1,
        AL_EFFECT_DEDICATED_DIALOGUE             = 0x9001,
        AL_EFFECT_DEDICATED_LOW_FREQUENCY_EFFECT = 0x9000;

    private EXTDedicated() {}

}