/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_pixel_buffer_object.txt">EXT_pixel_buffer_object</a> extension.
 * 
 * <p>This extension expands on the interface provided by buffer objects. It is intended to permit buffer objects to be used not only with vertex array data,
 * but also with pixel data. Buffer objects were promoted from the ARB_vertex_buffer_object extension in OpenGL 1.5.</p>
 */
public final class EXTPixelBufferObject {

    /**
     * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferParameteriv, and
     * GetBufferPointerv.
     */
    public static final int
        GL_PIXEL_PACK_BUFFER_EXT   = 0x88EB,
        GL_PIXEL_UNPACK_BUFFER_EXT = 0x88EC;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_PIXEL_PACK_BUFFER_BINDING_EXT   = 0x88ED,
        GL_PIXEL_UNPACK_BUFFER_BINDING_EXT = 0x88EF;

    private EXTPixelBufferObject() {}

}