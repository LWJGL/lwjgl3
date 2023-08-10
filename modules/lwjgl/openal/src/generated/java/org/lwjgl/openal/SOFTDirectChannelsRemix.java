/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_direct_channels_remix.txt">SOFT_direct_channels_remix</a> extension.
 * 
 * <p>This extension adds the ability to remix channels to the {@link SOFTDirectChannels SOFT_direct_channels} extension. By default, that extension drops input buffer
 * channels that don't have a matching output channel. This really only works well for controlled setups where the input and output are known, but
 * problems arise when these become variable. An option to remix input channels to the closest output channels will ensure the sound will still be audible
 * with as little virtualization as possible.</p>
 */
public final class SOFTDirectChannelsRemix {

    /** Accepted as the {@code value} parameter of {@link AL10#alSourcei Sourcei} and {@link AL11#alSourceiv Sourceiv} for the {@link SOFTDirectChannels#AL_DIRECT_CHANNELS_SOFT DIRECT_CHANNELS_SOFT} property. */
    public static final int
        AL_DROP_UNMATCHED_SOFT  = 0x1,
        AL_REMIX_UNMATCHED_SOFT = 0x2;

    private SOFTDirectChannelsRemix() {}

}