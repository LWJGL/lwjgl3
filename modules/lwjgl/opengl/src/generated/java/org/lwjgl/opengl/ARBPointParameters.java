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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_point_parameters.txt">ARB_point_parameters</a> extension.
 * 
 * <p>This extension supports additional geometric characteristics of points. It can be used to render particles or tiny light sources, commonly referred to
 * as "Light points".</p>
 * 
 * <p>The raster brightness of a point is a function of the point area, point color, point transparency, and the response of the display's electron gun and
 * phosphor. The point area and the point transparency are derived from the point size, currently provided with the {@code size} parameter of
 * {@link GL11C#glPointSize PointSize}.</p>
 * 
 * <p>The primary motivation is to allow the size of a point to be affected by distance attenuation. When distance attenuation has an effect, the final point
 * size decreases as the distance of the point from the eye increases.</p>
 * 
 * <p>The secondary motivation is a mean to control the mapping from the point size to the raster point area and point transparency. This is done in order to
 * increase the dynamic range of the raster brightness of points. In other words, the alpha component of a point may be decreased (and its transparency
 * increased) as its area shrinks below a defined threshold.</p>
 * 
 * <p>Promoted to core in {@link GL14 OpenGL 1.4}.</p>
 */
public class ARBPointParameters {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of PointParameterfvARB, and the {@code pname} of Get. */
    public static final int
        GL_POINT_SIZE_MIN_ARB             = 0x8126,
        GL_POINT_SIZE_MAX_ARB             = 0x8127,
        GL_POINT_FADE_THRESHOLD_SIZE_ARB  = 0x8128,
        GL_POINT_DISTANCE_ATTENUATION_ARB = 0x8129;

    protected ARBPointParameters() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPointParameterfARB ] ---

    /**
     * Sets the float value of a pointer parameter.
     *
     * @param pname the parameter to set. One of:<br><table><tr><td>{@link #GL_POINT_SIZE_MIN_ARB POINT_SIZE_MIN_ARB}</td><td>{@link #GL_POINT_SIZE_MAX_ARB POINT_SIZE_MAX_ARB}</td><td>{@link #GL_POINT_FADE_THRESHOLD_SIZE_ARB POINT_FADE_THRESHOLD_SIZE_ARB}</td></tr></table>
     * @param param the parameter value
     */
    public static native void glPointParameterfARB(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glPointParameterfvARB ] ---

    /** Unsafe version of: {@link #glPointParameterfvARB PointParameterfvARB} */
    public static native void nglPointParameterfvARB(int pname, long params);

    /**
     * Pointer version of {@link #glPointParameterfARB PointParameterfARB}.
     *
     * @param pname  the parameter to set. Must be:<br><table><tr><td>{@link #GL_POINT_DISTANCE_ATTENUATION_ARB POINT_DISTANCE_ATTENUATION_ARB}</td></tr></table>
     * @param params the parameter value
     */
    public static void glPointParameterfvARB(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 3);
        }
        nglPointParameterfvARB(pname, memAddress(params));
    }

    /** Array version of: {@link #glPointParameterfvARB PointParameterfvARB} */
    public static void glPointParameterfvARB(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glPointParameterfvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 3);
        }
        callPV(pname, params, __functionAddress);
    }

}