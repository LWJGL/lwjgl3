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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_pixel_local_storage2.txt">EXT_shader_pixel_local_storage2</a> extension.
 * 
 * <p>This extension builds on {@link EXTShaderPixelLocalStorage EXT_shader_pixel_local_storage} by lifting the restriction that pixel local storage is not supported when rendering to
 * multiple draw buffers.</p>
 * 
 * <p>Moreover, pixel local storage values are no longer lost when writing to user-defined fragment outputs, and, correspondingly, framebuffer pixel values
 * do not always become undefined when the shader writes to pixel local storage.</p>
 * 
 * <p>This extension adds the following capabilities:</p>
 * 
 * <ul>
 * <li>support for pixel local storage in combination with multiple user-defined fragment outputs</li>
 * <li>support for clearing pixel local storage variables</li>
 * <li>support for multi-word pixel local storage variables</li>
 * </ul>
 */
public class EXTShaderPixelLocalStorage2 {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetInteger64v, or GetFloatv. */
    public static final int
        GL_MAX_SHADER_COMBINED_LOCAL_STORAGE_FAST_SIZE_EXT = 0x9650,
        GL_MAX_SHADER_COMBINED_LOCAL_STORAGE_SIZE_EXT      = 0x9651;

    /** Returned by CheckFramebufferStatus. */
    public static final int GL_FRAMEBUFFER_INCOMPLETE_INSUFFICIENT_SHADER_COMBINED_LOCAL_STORAGE_EXT = 0x9652;

    protected EXTShaderPixelLocalStorage2() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferPixelLocalStorageSizeEXT ] ---

    public static native void glFramebufferPixelLocalStorageSizeEXT(@NativeType("GLuint") int target, @NativeType("GLsizei") int size);

    // --- [ glGetFramebufferPixelLocalStorageSizeEXT ] ---

    @NativeType("GLsizei")
    public static native int glGetFramebufferPixelLocalStorageSizeEXT(@NativeType("GLuint") int target);

    // --- [ glClearPixelLocalStorageuiEXT ] ---

    public static native void nglClearPixelLocalStorageuiEXT(int offset, int n, long values);

    public static void glClearPixelLocalStorageuiEXT(@NativeType("GLsizei") int offset, @NativeType("GLuint const *") IntBuffer values) {
        nglClearPixelLocalStorageuiEXT(offset, values.remaining(), memAddress(values));
    }

    /** Array version of: {@link #glClearPixelLocalStorageuiEXT ClearPixelLocalStorageuiEXT} */
    public static void glClearPixelLocalStorageuiEXT(@NativeType("GLsizei") int offset, @NativeType("GLuint const *") int[] values) {
        long __functionAddress = GLES.getICD().glClearPixelLocalStorageuiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(offset, values.length, values, __functionAddress);
    }

}