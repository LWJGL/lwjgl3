/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_compiled_vertex_array.txt">EXT_compiled_vertex_array</a> extension.
 * 
 * <p>This extension defines an interface which allows static vertex array data to be cached or pre-compiled for more efficient rendering. This is useful for
 * implementations which can cache the transformed results of array data for reuse by several DrawArrays, ArrayElement, or DrawElements commands. It is
 * also useful for implementations which can transfer array data to fast memory for more efficient processing.</p>
 * 
 * <p>For example, rendering an M by N mesh of quadrilaterals can be accomplished by setting up vertex arrays containing all of the vertexes in the mesh and
 * issuing M DrawElements commands each of which operate on 2 * N vertexes. Each DrawElements command after the first will share N vertexes with the
 * preceding DrawElements command. If the vertex array data is locked while the DrawElements commands are executed, then OpenGL may be able to transform
 * each of these shared vertexes just once.</p>
 */
public class EXTCompiledVertexArray {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_ARRAY_ELEMENT_LOCK_FIRST_EXT = 0x81A8,
        GL_ARRAY_ELEMENT_LOCK_COUNT_EXT = 0x81A9;

    protected EXTCompiledVertexArray() {
        throw new UnsupportedOperationException();
    }

    // --- [ glLockArraysEXT ] ---

    public static native void glLockArraysEXT(@NativeType("GLint") int first, @NativeType("GLsizei") int count);

    // --- [ glUnlockArraysEXT ] ---

    public static native void glUnlockArraysEXT();

}