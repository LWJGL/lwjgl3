/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class NVPolygonMode {

    static { GLES.initialize(); }

    public static final int GL_POLYGON_MODE_NV = 0xB40;

    public static final int
        GL_POLYGON_OFFSET_POINT_NV = 0x2A01,
        GL_POLYGON_OFFSET_LINE_NV  = 0x2A02;

    public static final int
        GL_POINT_NV = 0x1B00,
        GL_LINE_NV  = 0x1B01,
        GL_FILL_NV  = 0x1B02;

    protected NVPolygonMode() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPolygonModeNV ] ---

    /** {@code void glPolygonModeNV(GLenum face, GLenum mode)} */
    public static native void glPolygonModeNV(@NativeType("GLenum") int face, @NativeType("GLenum") int mode);

}