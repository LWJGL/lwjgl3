/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_direct_channels.txt">SOFT_direct_channels</a> extension.
 * 
 * <p>This extension allows a multi-channel source to play without virtualized output speakers. By default, OpenAL requires buffer channels to be down-mixed
 * to the output channel configuration, possibly using HRTF or other virtualization techniques to give a sense of speakers that may not be physically
 * present. Sometimes audio tracks are authored with their own spatialization effects, where the AL's virtualization methods can cause a notable decrease
 * in audio quality.</p>
 * 
 * <p>This extension provides a mechanism for applications to specify whether audio should be filtered according to the AL's channel virtualization rules for
 * multi-channel buffers.</p>
 */
public final class SOFTDirectChannels {

    /** Accepted by the {@code paramName} parameter of {@link AL10#alSourcei Sourcei}, {@link AL11#alSourceiv Sourceiv}, {@link AL10#alGetSourcei GetSourcei}, and {@link AL10#alGetSourceiv GetSourceiv}. */
    public static final int AL_DIRECT_CHANNELS_SOFT = 0x1033;

    private SOFTDirectChannels() {}

}