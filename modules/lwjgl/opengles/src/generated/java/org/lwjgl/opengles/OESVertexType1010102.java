/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_vertex_type_10_10_10_2.txt">OES_vertex_type_10_10_10_2</a> extension.
 * 
 * <p>This extension adds the following data formats:</p>
 * 
 * <p>Two new vertex attribute data formats: a signed 10.10.10.2 and an unsigned 10.10.10.2 vertex data format. These vertex data formats describe a 3- or
 * 4-tuple stream which can be used to store normals or other attributes in a quantized form. Normals, tangents, binormals and other vertex attributes can
 * often be specified at reduced precision without introducing noticeable artifacts, reducing the amount of memory and memory bandwidth they consume.</p>
 */
public final class OESVertexType1010102 {

    /** Accepted by the {@code type} parameter of VertexAttribPointer. */
    public static final int
        GL_UNSIGNED_INT_10_10_10_2_OES = 0x8DF6,
        GL_INT_10_10_10_2_OES          = 0x8DF7;

    private OESVertexType1010102() {}

}