/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_block_alignment.txt">SOFT_block_alignment</a> extension.
 * 
 * <p>This extension provides a mechanism for specifying block alignment properties for sample data. This is useful for, though not strictly limited to,
 * ADPCM compression where the block alignment is specified in the media file header instead of the data stream, and controls the decoding process.</p>
 */
public final class SOFTBlockAlignment {

    /** Accepted by the {@code paramName} parameter of {@link AL11#alBufferi Bufferi}, {@link AL11#alBufferiv Bufferiv}, {@link AL10#alGetBufferi GetBufferi}, and {@link AL11#alGetBufferiv GetBufferiv}. */
    public static final int
        AL_UNPACK_BLOCK_ALIGNMENT_SOFT = 0x200C,
        AL_PACK_BLOCK_ALIGNMENT_SOFT   = 0x200D;

    private SOFTBlockAlignment() {}

}