/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_sample_positions.txt">AMD_sample_positions</a> extension.
 * 
 * <p>This extension provides a mechanism to explicitly set sample positions for a FBO with multi-sampled attachments. The FBO will use identical sample
 * locations for all pixels in each attachment. This forces TEXTURE_FIXED_SAMPLE_LOCATIONS to TRUE if a multi-sampled texture is specified using
 * TexImage2DMultisample or TexImage3DMultisample. That is, using GetTexLevelParameter to query TEXTURE_FIXED_SAMPLE_LOCATIONS will always return TRUE if
 * the mechanism is explicitly used to set the sample positions.</p>
 * 
 * <p>Requires {@link GL32 OpenGL 3.2} or {@link EXTFramebufferMultisample EXT_framebuffer_multisample}.</p>
 */
public class AMDSamplePositions {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetFloatv. */
    public static final int GL_SUBSAMPLE_DISTANCE_AMD = 0x883F;

    protected AMDSamplePositions() {
        throw new UnsupportedOperationException();
    }

    // --- [ glSetMultisamplefvAMD ] ---

    public static native void nglSetMultisamplefvAMD(int pname, int index, long val);

    public static void glSetMultisamplefvAMD(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer val) {
        if (CHECKS) {
            check(val, 2);
        }
        nglSetMultisamplefvAMD(pname, index, memAddress(val));
    }

    /** Array version of: {@link #glSetMultisamplefvAMD SetMultisamplefvAMD} */
    public static void glSetMultisamplefvAMD(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] val) {
        long __functionAddress = GL.getICD().glSetMultisamplefvAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(val, 2);
        }
        callPV(pname, index, val, __functionAddress);
    }

}