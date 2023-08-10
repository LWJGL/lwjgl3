/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_half_float_vertex.txt">ARB_half_float_vertex</a> extension.
 * 
 * <p>This extension extends the usage of the half-precision (16-bit) floating-point quantities introduced in {@link ARBHalfFloatPixel ARB_half_float_pixel} for usage in
 * specifying vertex array data.</p>
 * 
 * <p>This extension allows applications to use half-precision floating point data when specifying vertices. This can allow applications to reduce their
 * memory footprint, as well as the memory bandwidth required for vertex data.</p>
 * 
 * <p>This extension extends the existing vertex array commands to accept the new data type.</p>
 * 
 * <p>Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public final class ARBHalfFloatVertex {

    /**
     * Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, FogCoordPointer, TexCoordPointer, and
     * VertexAttribPointer.
     */
    public static final int GL_HALF_FLOAT = 0x140B;

    private ARBHalfFloatVertex() {}

}