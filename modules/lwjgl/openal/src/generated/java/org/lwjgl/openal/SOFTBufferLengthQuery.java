/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_buffer_length_query.txt">SOFT_buffer_length_query</a> extension.
 * 
 * <p>This extension adds buffer queries to get the length in bytes, samples, and seconds.</p>
 * 
 * <p>Standard OpenAL only has queries for a buffer's storage size, the bits per sample, channel count, and sample rate, where the application needs to
 * calculate what it wants from those. While this works alright for standard formats and most extension formats, it won't work for certain compressed
 * formats like ADPCM. These extra queries ensure the application can get information about the buffer it may need.</p>
 */
public final class SOFTBufferLengthQuery {

    /** Accepted by the {@code paramName} parameter of {@link AL10#alGetBufferi GetBufferi} and {@link AL11#alGetBufferiv GetBufferiv}. */
    public static final int
        AL_BYTE_LENGTH_SOFT   = 0x2009,
        AL_SAMPLE_LENGTH_SOFT = 0x200A;

    /** Accepted by the {@code paramName} parameter of {@link AL10#alGetBufferf GetBufferf} and {@link AL11#alGetBufferfv GetBufferfv}. */
    public static final int AL_SEC_LENGTH_SOFT = 0x200B;

    private SOFTBufferLengthQuery() {}

}