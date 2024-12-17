/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class EXTClipControl {

    static { GLES.initialize(); }

    public static final int
        GL_LOWER_LEFT_EXT = 0x8CA1,
        GL_UPPER_LEFT_EXT = 0x8CA2;

    public static final int
        GL_NEGATIVE_ONE_TO_ONE_EXT = 0x935E,
        GL_ZERO_TO_ONE_EXT         = 0x935F;

    public static final int
        GL_CLIP_ORIGIN_EXT     = 0x935C,
        GL_CLIP_DEPTH_MODE_EXT = 0x935D;

    protected EXTClipControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClipControlEXT ] ---

    /** {@code void glClipControlEXT(GLenum origin, GLenum depth)} */
    public static native void glClipControlEXT(@NativeType("GLenum") int origin, @NativeType("GLenum") int depth);

}