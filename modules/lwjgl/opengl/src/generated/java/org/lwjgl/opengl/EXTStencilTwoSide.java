/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_stencil_two_side.txt">EXT_stencil_two_side</a> extension.
 * 
 * <p>This extension provides two-sided stencil testing where the stencil-related state (stencil operations, reference value, compare mask, and write mask)
 * may be different for front- and back-facing polygons. Two-sided stencil testing may improve the performance of stenciled shadow volume and Constructive
 * Solid Geometry (CSG) rendering algorithms.</p>
 */
public class EXTStencilTwoSide {

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    public static final int GL_STENCIL_TEST_TWO_SIDE_EXT = 0x8910;

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_ACTIVE_STENCIL_FACE_EXT = 0x8911;

    static { GL.initialize(); }

    protected EXTStencilTwoSide() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps) {
        return checkFunctions(
            caps.glActiveStencilFaceEXT
        );
    }

    // --- [ glActiveStencilFaceEXT ] ---

    public static native void glActiveStencilFaceEXT(@NativeType("GLenum") int face);

}