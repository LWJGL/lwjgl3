/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the <a target="_blank" href="http://kcat.strangesoft.net/openal-extensions/SOFT_source_spatialize.txt">SOFT_source_spatialize</a> extension.
 * 
 * <p>This extension provides more control over the spatialization behavior of sources. By default, OpenAL will spatialize sources playing a mono buffer and
 * not spatialize sources playing a multi-channel buffer. Spatialization features include positional panning, distance attenuation, cone-related
 * attenuation, and doppler effects. This extension allows such features to be enabled and disabled per-source independently of the buffer format.</p>
 */
public final class SOFTSourceSpatialize {

    /** Accepted as the {@code param} parameter of {@link AL10#alSourcei Sourcei}, {@link AL11#alSourceiv Sourceiv}, {@link AL10#alGetSourcei GetSourcei}, and {@link AL10#alGetSourceiv GetSourceiv}. */
    public static final int AL_SOURCE_SPATIALIZE_SOFT = 0x1214;

    /** Accepted as the {@code value} of the {@link #AL_SOURCE_SPATIALIZE_SOFT SOURCE_SPATIALIZE_SOFT} property. */
    public static final int AL_AUTO_SOFT = 0x2;

    private SOFTSourceSpatialize() {}

}