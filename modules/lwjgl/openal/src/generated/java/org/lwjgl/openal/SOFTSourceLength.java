/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_source_length.txt">SOFT_source_length</a> extension.
 * 
 * <p>This extension adds a method to retrieve the total length of a source's buffer data in bytes, samples, and seconds, which correspond to the byte,
 * sample, and seconds offset extents. By default, OpenAL only provides a way to retrieve a buffer's storage size in bytes, which does not necessarily
 * represent the data size given to alBufferData nor the byte offset extent for the source's {@link AL11#AL_BYTE_OFFSET BYTE_OFFSET} property. The
 * {@code AL_SOFT_buffer_samples} extension allows an application to query a buffer for its length in bytes, samples, and seconds, but this is only for a
 * single buffer; a buffer queue on a source still requires additional bookkeeping by the application to keep track of the length of  each buffer being
 * queued and unqueued on a given source. This extension aims to ease that and provide a simple query.</p>
 */
public final class SOFTSourceLength {

    /** Accepted by the {@code paramName} parameter of {@link AL10#alGetSourcei GetSourcei} and {@link AL10#alGetSourceiv GetSourceiv} (these are the same as in AL_SOFT_buffer_samples). */
    public static final int
        AL_BYTE_LENGTH_SOFT   = 0x2009,
        AL_SAMPLE_LENGTH_SOFT = 0x200A;

    /** Accepted by the {@code paramName} parameter of {@link AL10#alGetSourcef GetSourcef} and {@link AL10#alGetSourcefv GetSourcefv} (these are the same as in AL_SOFT_buffer_samples). */
    public static final int AL_SEC_LENGTH_SOFT = 0x200B;

    private SOFTSourceLength() {}

}