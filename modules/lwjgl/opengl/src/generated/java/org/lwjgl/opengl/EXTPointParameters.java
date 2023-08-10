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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_point_parameters.txt">EXT_point_parameters</a> extension.
 * 
 * <p>This extension supports additional geometric characteristics of points. It can be used to render particles or tiny light sources, commonly referred as
 * "Light points".</p>
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
 * <p>This extension defines a derived point size to be closely related to point brightness. The brightness of a point is given by:</p>
 * 
 * <pre><code>
 *                         1
 * dist_atten(d) = -------------------
 *                 a + b * d + c * d^2
 * 
 * brightness(Pe) = Brightness * dist_atten(|Pe|)</code></pre>
 * 
 * <p>where 'Pe' is the point in eye coordinates, and 'Brightness' is some initial value proportional to the square of the size provided with glPointSize.
 * Here we simplify the raster brightness to be a function of the rasterized point area and point transparency.</p>
 * 
 * <pre><code>
 *             brightness(Pe)      brightness(Pe) &ge; Threshold_Area
 * area(Pe) =
 *             Threshold_Area      Otherwise
 * 
 * factor(Pe) = brightness(Pe)/Threshold_Area
 * 
 * alpha(Pe) = Alpha * factor(Pe)</code></pre>
 * 
 * <p>where 'Alpha' comes with the point color (possibly modified by lighting).</p>
 * 
 * <p>'Threshold_Area' above is in area units. Thus, it is proportional to the square of the threshold provided by the programmer through this extension.</p>
 * 
 * <p>The new point size derivation method applies to all points, while the threshold applies to multisample points only.</p>
 */
public class EXTPointParameters {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of glPointParameterfvEXT, and the {@code pname} of glGet. */
    public static final int
        GL_POINT_SIZE_MIN_EXT            = 0x8126,
        GL_POINT_SIZE_MAX_EXT            = 0x8127,
        GL_POINT_FADE_THRESHOLD_SIZE_EXT = 0x8128,
        GL_DISTANCE_ATTENUATION_EXT      = 0x8129;

    protected EXTPointParameters() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPointParameterfEXT ] ---

    public static native void glPointParameterfEXT(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glPointParameterfvEXT ] ---

    public static native void nglPointParameterfvEXT(int pname, long params);

    public static void glPointParameterfvEXT(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglPointParameterfvEXT(pname, memAddress(params));
    }

    /** Array version of: {@link #glPointParameterfvEXT PointParameterfvEXT} */
    public static void glPointParameterfvEXT(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glPointParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, params, __functionAddress);
    }

}