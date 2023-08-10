/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_occlusion_query_boolean.txt">EXT_occlusion_query_boolean</a> extension.
 * 
 * <p>This extension defines a mechanism whereby an application can query whether any pixels (or, more precisely, samples) are drawn by a primitive or group
 * of primitives.</p>
 * 
 * <p>The primary purpose of such a query (hereafter referred to as an "occlusion query") is to determine the visibility of an object. Typically, the
 * application will render the major occluders in the scene, then perform an occlusion query for each detail object in the scene. On subsequent frames,
 * the previous results of the occlusion queries can be used to decide whether to draw an object or not.</p>
 */
public class EXTOcclusionQueryBoolean {

    static { GLES.initialize(); }

    /** Accepted by the {@code target} parameter of BeginQueryEXT, EndQueryEXT, and GetQueryivEXT. */
    public static final int
        GL_ANY_SAMPLES_PASSED_EXT              = 0x8C2F,
        GL_ANY_SAMPLES_PASSED_CONSERVATIVE_EXT = 0x8D6A;

    /** Accepted by the {@code pname} parameter of GetQueryivEXT. */
    public static final int GL_CURRENT_QUERY_EXT = 0x8865;

    /** Accepted by the {@code pname} parameter of GetQueryObjectivEXT and GetQueryObjectuivEXT. */
    public static final int
        GL_QUERY_RESULT_EXT           = 0x8866,
        GL_QUERY_RESULT_AVAILABLE_EXT = 0x8867;

    protected EXTOcclusionQueryBoolean() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGenQueriesEXT ] ---

    public static native void nglGenQueriesEXT(int n, long ids);

    public static void glGenQueriesEXT(@NativeType("GLuint *") IntBuffer ids) {
        nglGenQueriesEXT(ids.remaining(), memAddress(ids));
    }

    @NativeType("void")
    public static int glGenQueriesEXT() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglGenQueriesEXT(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteQueriesEXT ] ---

    public static native void nglDeleteQueriesEXT(int n, long ids);

    public static void glDeleteQueriesEXT(@NativeType("GLuint const *") IntBuffer ids) {
        nglDeleteQueriesEXT(ids.remaining(), memAddress(ids));
    }

    public static void glDeleteQueriesEXT(@NativeType("GLuint const *") int id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDeleteQueriesEXT(1, memAddress(ids));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsQueryEXT ] ---

    @NativeType("GLboolean")
    public static native boolean glIsQueryEXT(@NativeType("GLuint") int id);

    // --- [ glBeginQueryEXT ] ---

    public static native void glBeginQueryEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int id);

    // --- [ glEndQueryEXT ] ---

    public static native void glEndQueryEXT(@NativeType("GLenum") int target);

    // --- [ glGetQueryivEXT ] ---

    public static native void nglGetQueryivEXT(int target, int pname, long params);

    public static void glGetQueryivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryivEXT(target, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetQueryiEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryivEXT(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectuivEXT ] ---

    public static native void nglGetQueryObjectuivEXT(int id, int pname, long params);

    public static void glGetQueryObjectuivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectuivEXT(id, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glGetQueryObjectuiEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryObjectuivEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glGenQueriesEXT GenQueriesEXT} */
    public static void glGenQueriesEXT(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GLES.getICD().glGenQueriesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** Array version of: {@link #glDeleteQueriesEXT DeleteQueriesEXT} */
    public static void glDeleteQueriesEXT(@NativeType("GLuint const *") int[] ids) {
        long __functionAddress = GLES.getICD().glDeleteQueriesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** Array version of: {@link #glGetQueryivEXT GetQueryivEXT} */
    public static void glGetQueryivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetQueryivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetQueryObjectuivEXT GetQueryObjectuivEXT} */
    public static void glGetQueryObjectuivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetQueryObjectuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

}