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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_sample_locations.txt">ARB_sample_locations</a> extension.
 * 
 * <p>This extension allows an application to modify the locations of samples within a pixel used in multisample rasterization. Additionally, it allows
 * applications to specify different sample locations for each pixel in a group of adjacent pixels, which may increase antialiasing quality (particularly
 * if a custom resolve shader is used that takes advantage of these different locations).</p>
 * 
 * <p>It is common for implementations to optimize the storage of depth values by storing values that can be used to reconstruct depth at each sample
 * location, rather than storing separate depth values for each sample. For example, the depth values from a single triangle can be represented using
 * plane equations. When the depth value for a sample is needed, it is automatically evaluated at the sample location. Modifying the sample locations
 * causes the reconstruction to no longer evaluate the same depth values as when the samples were originally generated. This extension provides a command
 * to "evaluate" and store per-sample depth values using the currently programmed sample locations, which allows the application to manage this issue
 * if/when necessary.</p>
 * 
 * <p>The programmable sample locations are used during rasterization and for evaluation of depth functions during normal geometric rendering. The
 * programmable locations are associated with a framebuffer object rather than an individual depth buffer, so if the depth buffer is used as a texture the
 * texture sampling may be done at the standard sample locations. Additionally, commands that do not render geometric primitives (e.g. ReadPixels,
 * BlitFramebuffer, CopyTexSubImage2D, etc.) may use the standard sample locations to evaluate depth functions rather than the programmable locations. If
 * a single depth buffer is used at different times with different sample locations, the depth functions may be interpreted using the current sample
 * locations.</p>
 */
public class ARBSampleLocations {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int
        GL_SAMPLE_LOCATION_SUBPIXEL_BITS_ARB           = 0x933D,
        GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB        = 0x933E,
        GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB       = 0x933F,
        GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB = 0x9340;

    /**
     * // Alias of SAMPLE_POSITION. Before NV_expms, the spec used "location". SAMPLE_LOCATION_ARB 0x8E50 PROGRAMMABLE_SAMPLE_LOCATION_ARB 0x9341 Accepted by
     * the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv.
     */
    public static final int
        GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB = 0x9342,
        GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB    = 0x9343;

    protected ARBSampleLocations() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferSampleLocationsfvARB ] ---

    /**
     * Unsafe version of: {@link #glFramebufferSampleLocationsfvARB FramebufferSampleLocationsfvARB}
     *
     * @param count the number of sample locations to update
     */
    public static native void nglFramebufferSampleLocationsfvARB(int target, int start, int count, long v);

    /**
     * Controls the programmable sample locations for the framebuffer bound to the specified {@code target}.
     * 
     * <p>There are {@code N} pairs of programmable sample locations values in a framebuffer, where {@code N} is the value of
     * {@link #GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB}. Each programmable sample location is specified as a pair of floating point values in the range
     * {@code [0,1]}, corresponding to the x and y locations respectively in GL pixel space. {@code (0.5, 0.5)} thus corresponds to the pixel center. Sample
     * locations outside of {@code [0,1]} result in undefined behavior.</p>
     *
     * @param target the framebuffer target. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td></tr></table>
     * @param start  the first sample location to update
     * @param v      a pair of values for each sample location to update
     */
    public static void glFramebufferSampleLocationsfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int start, @NativeType("GLfloat const *") FloatBuffer v) {
        nglFramebufferSampleLocationsfvARB(target, start, v.remaining() >> 1, memAddress(v));
    }

    // --- [ glNamedFramebufferSampleLocationsfvARB ] ---

    /**
     * Unsafe version of: {@link #glNamedFramebufferSampleLocationsfvARB NamedFramebufferSampleLocationsfvARB}
     *
     * @param count the number of sample locations to update
     */
    public static native void nglNamedFramebufferSampleLocationsfvARB(int framebuffer, int start, int count, long v);

    /**
     * DSA version of {@link #glFramebufferSampleLocationsfvARB FramebufferSampleLocationsfvARB}.
     *
     * @param framebuffer the framebuffer object to update
     * @param start       the first sample location to update
     * @param v           a pair of values for each sample location to update
     */
    public static void glNamedFramebufferSampleLocationsfvARB(@NativeType("GLuint") int framebuffer, @NativeType("GLuint") int start, @NativeType("GLfloat const *") FloatBuffer v) {
        nglNamedFramebufferSampleLocationsfvARB(framebuffer, start, v.remaining() >> 1, memAddress(v));
    }

    // --- [ glEvaluateDepthValuesARB ] ---

    /**
     * Evaluates depth values for all samples in the current depth buffer (subject to the pixel ownership and scissor tests) and stores each value in the
     * depth buffer. This can be used to ensure that later accesses will use depth values consistent with the sample locations used when the samples were
     * generated. If the current framebuffer has no depth buffer, EvaluateDepthValuesARB will have no effect.
     */
    public static native void glEvaluateDepthValuesARB();

    /** Array version of: {@link #glFramebufferSampleLocationsfvARB FramebufferSampleLocationsfvARB} */
    public static void glFramebufferSampleLocationsfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int start, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glFramebufferSampleLocationsfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, start, v.length >> 1, v, __functionAddress);
    }

    /** Array version of: {@link #glNamedFramebufferSampleLocationsfvARB NamedFramebufferSampleLocationsfvARB} */
    public static void glNamedFramebufferSampleLocationsfvARB(@NativeType("GLuint") int framebuffer, @NativeType("GLuint") int start, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glNamedFramebufferSampleLocationsfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, start, v.length >> 1, v, __functionAddress);
    }

}