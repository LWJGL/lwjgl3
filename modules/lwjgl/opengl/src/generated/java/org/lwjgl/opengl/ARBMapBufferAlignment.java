/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_map_buffer_alignment.txt">ARB_map_buffer_alignment</a> extension.
 * 
 * <p>This extension adds a requirement to the pointer returned by {@link GL15C#glMapBuffer MapBuffer} and {@link GL30C#glMapBufferRange MapBufferRange} that they provide a minimum of 64 byte alignment
 * to support processing of the data directly with special CPU instructions like SSE and AVX.</p>
 * 
 * <p>Requires {@link GL21 OpenGL 2.1}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
 */
public final class ARBMapBufferAlignment {

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int GL_MIN_MAP_BUFFER_ALIGNMENT = 0x90BC;

    private ARBMapBufferAlignment() {}

}