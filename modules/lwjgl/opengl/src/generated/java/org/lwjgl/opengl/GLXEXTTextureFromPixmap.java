/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GLXEXTTextureFromPixmap {

    public static final int
        GLX_BIND_TO_TEXTURE_RGB_EXT     = 0x20D0,
        GLX_BIND_TO_TEXTURE_RGBA_EXT    = 0x20D1,
        GLX_BIND_TO_MIPMAP_TEXTURE_EXT  = 0x20D2,
        GLX_BIND_TO_TEXTURE_TARGETS_EXT = 0x20D3,
        GLX_Y_INVERTED_EXT              = 0x20D4;

    public static final int
        GLX_TEXTURE_FORMAT_EXT = 0x20D5,
        GLX_TEXTURE_TARGET_EXT = 0x20D6,
        GLX_MIPMAP_TEXTURE_EXT = 0x20D7;

    public static final int
        GLX_TEXTURE_FORMAT_NONE_EXT = 0x20D8,
        GLX_TEXTURE_FORMAT_RGB_EXT  = 0x20D9,
        GLX_TEXTURE_FORMAT_RGBA_EXT = 0x20DA;

    public static final int
        GLX_TEXTURE_1D_BIT_EXT        = 0x1,
        GLX_TEXTURE_2D_BIT_EXT        = 0x2,
        GLX_TEXTURE_RECTANGLE_BIT_EXT = 0x4;

    public static final int
        GLX_TEXTURE_1D_EXT        = 0x20DB,
        GLX_TEXTURE_2D_EXT        = 0x20DC,
        GLX_TEXTURE_RECTANGLE_EXT = 0x20DD;

    public static final int
        GLX_FRONT_LEFT_EXT  = 0x20DE,
        GLX_FRONT_RIGHT_EXT = 0x20DF,
        GLX_BACK_LEFT_EXT   = 0x20E0,
        GLX_BACK_RIGHT_EXT  = 0x20E1,
        GLX_FRONT_EXT       = GLX_FRONT_LEFT_EXT,
        GLX_BACK_EXT        = GLX_BACK_LEFT_EXT,
        GLX_AUX0_EXT        = 0x20E2,
        GLX_AUX1_EXT        = 0x20E3,
        GLX_AUX2_EXT        = 0x20E4,
        GLX_AUX3_EXT        = 0x20E5,
        GLX_AUX4_EXT        = 0x20E6,
        GLX_AUX5_EXT        = 0x20E7,
        GLX_AUX6_EXT        = 0x20E8,
        GLX_AUX7_EXT        = 0x20E9,
        GLX_AUX8_EXT        = 0x20EA,
        GLX_AUX9_EXT        = 0x20EB;

    protected GLXEXTTextureFromPixmap() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXBindTexImageEXT ] ---

    /** {@code void glXBindTexImageEXT(Display * display, GLXDrawable drawable, int buffer, int const * attrib_list)} */
    public static void nglXBindTexImageEXT(long display, long drawable, int buffer, long attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXBindTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
        }
        callPPPV(display, drawable, buffer, attrib_list, __functionAddress);
    }

    /** {@code void glXBindTexImageEXT(Display * display, GLXDrawable drawable, int buffer, int const * attrib_list)} */
    public static void glXBindTexImageEXT(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, int buffer, @NativeType("int const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        nglXBindTexImageEXT(display, drawable, buffer, memAddressSafe(attrib_list));
    }

    // --- [ glXReleaseTexImageEXT ] ---

    /** {@code void glXReleaseTexImageEXT(Display * display, GLXDrawable drawable, int buffer)} */
    public static void glXReleaseTexImageEXT(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, int buffer) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXReleaseTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
        }
        callPPV(display, drawable, buffer, __functionAddress);
    }

    /** {@code void glXBindTexImageEXT(Display * display, GLXDrawable drawable, int buffer, int const * attrib_list)} */
    public static void glXBindTexImageEXT(@NativeType("Display *") long display, @NativeType("GLXDrawable") long drawable, int buffer, @NativeType("int const *") int @Nullable [] attrib_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXBindTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(drawable);
            checkNTSafe(attrib_list);
        }
        callPPPV(display, drawable, buffer, attrib_list, __functionAddress);
    }

}