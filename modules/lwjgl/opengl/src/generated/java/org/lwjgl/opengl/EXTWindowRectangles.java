/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_window_rectangles.txt">EXT_window_rectangles</a> extension.
 * 
 * <p>This extension provides additional orthogonally aligned "window rectangles" specified in window-space coordinates that restrict rasterization of all
 * primitive types (geometry, images, paths) and framebuffer clears.</p>
 * 
 * <p>When rendering to the framebuffer of an on-screen window, these window rectangles are ignored so these window rectangles apply to rendering to non-zero
 * framebuffer objects only.</p>
 * 
 * <p>From zero to an implementation-dependent limit (specified by {@link #GL_MAX_WINDOW_RECTANGLES_EXT MAX_WINDOW_RECTANGLES_EXT}) number of window rectangles can be operational at once. When
 * one or more window rectangles are active, rasterized fragments can either survive if the fragment is within any of the operational window rectangles
 * ({@link #GL_INCLUSIVE_EXT INCLUSIVE_EXT} mode) or be rejected if the fragment is within any of the operational window rectangles ({@link #GL_EXCLUSIVE_EXT EXCLUSIVE_EXT} mode).</p>
 * 
 * <p>These window rectangles operate orthogonally to the existing scissor test functionality.</p>
 * 
 * <p>This extension has specification language for both OpenGL and ES so {@code EXT_window_rectangles} can be implemented and advertised for either or both
 * API contexts.</p>
 * 
 * <p>Requires {@link GL30 GL30} or {@link EXTDrawBuffers2 EXT_draw_buffers2}.</p>
 */
public class EXTWindowRectangles {

    static { GL.initialize(); }

    /** Accepted by the {@code mode} parameter of {@link #glWindowRectanglesEXT WindowRectanglesEXT}. */
    public static final int
        GL_INCLUSIVE_EXT = 0x8F10,
        GL_EXCLUSIVE_EXT = 0x8F11;

    /**
     * Accepted by the {@code pname} parameter of GetIntegeri_v, GetInteger64i_v, GetBooleani_v, GetFloati_v, GetDoublei_v, GetIntegerIndexedvEXT,
     * GetFloatIndexedvEXT, GetDoubleIndexedvEXT, GetBooleanIndexedvEXT, and GetIntegeri_vEXT.
     */
    public static final int GL_WINDOW_RECTANGLE_EXT = 0x8F12;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int
        GL_WINDOW_RECTANGLE_MODE_EXT = 0x8F13,
        GL_MAX_WINDOW_RECTANGLES_EXT = 0x8F14,
        GL_NUM_WINDOW_RECTANGLES_EXT = 0x8F15;

    protected EXTWindowRectangles() {
        throw new UnsupportedOperationException();
    }

    // --- [ glWindowRectanglesEXT ] ---

    /**
     * Unsafe version of: {@link #glWindowRectanglesEXT WindowRectanglesEXT}
     *
     * @param count the number of active window rectangles. Must be between zero and the value of {@link #GL_MAX_WINDOW_RECTANGLES_EXT MAX_WINDOW_RECTANGLES_EXT}.
     */
    public static native void nglWindowRectanglesEXT(int mode, int count, long box);

    /**
     * Sets the active window rectangles.
     * 
     * <p>When the {@code WindowRectanglesEXT} command is processed without error, the i<sup>th</sup> window rectangle box is set to the corresponding four
     * parameters for values of {@code i} less then {@code n}. For values of {@code i} greater than {@code n}, each window rectangle box is set to (0,0,0,0).</p>
     * 
     * <p>Each four elements corresponds to the i<sup>th</sup> window rectangle indicating a box of pixels specified with window-space coordinates. Each window
     * rectangle box {@code i} has a lower-left origin at {@code (x_i,y_i)} and upper-right corner at {@code (x_i+w_i,y_i+h_i)}.</p>
     * 
     * <p>The {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if any element {@code w_i} or {@code h_i}, corresponding to each box's respective width and height, is negative.</p>
     * 
     * <p>Each rasterized or cleared fragment with a window-space position {@code (xw,yw)} is within the i<sup>th</sup> window rectangle box when both of these
     * equations are satisfied for all {@code i} less than {@code n}:</p>
     * 
     * <pre><code>
     * x_i &le; xw &lt; x_i+w_i
     * y_i &le; yw &lt; y_i+h_i</code></pre>
     * 
     * <p>When the window rectangles mode is {@link #GL_INCLUSIVE_EXT INCLUSIVE_EXT} mode and the bound framebuffer object is non-zero, a fragment passes the window rectangles test if
     * the fragment's window-space position is within at least one of the current {@code n} active window rectangles; otherwise the window rectangles test
     * fails and the fragment is discarded.</p>
     * 
     * <p>When the window rectangles mode is {@link #GL_EXCLUSIVE_EXT EXCLUSIVE_EXT} mode and the bound framebuffer object is non-zero, a fragment fails the window rectangles test and is
     * discarded if the fragment's window-space position is within at least one of the current {@code n} active window rectangles; otherwise the window
     * rectangles test passes and the fragment passes the window rectangles test.</p>
     * 
     * <p>When the bound framebuffer object is zero, the window rectangles test always passes.</p>
     *
     * @param mode the rectangle mode. One of:<br><table><tr><td>{@link #GL_INCLUSIVE_EXT INCLUSIVE_EXT}</td><td>{@link #GL_EXCLUSIVE_EXT EXCLUSIVE_EXT}</td></tr></table>
     * @param box  an array of {@code 4*count} window rectangle coordinates
     */
    public static void glWindowRectanglesEXT(@NativeType("GLenum") int mode, @Nullable @NativeType("GLint const *") IntBuffer box) {
        nglWindowRectanglesEXT(mode, remainingSafe(box) >> 2, memAddressSafe(box));
    }

    /** Array version of: {@link #glWindowRectanglesEXT WindowRectanglesEXT} */
    public static void glWindowRectanglesEXT(@NativeType("GLenum") int mode, @Nullable @NativeType("GLint const *") int[] box) {
        long __functionAddress = GL.getICD().glWindowRectanglesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, lengthSafe(box) >> 2, box, __functionAddress);
    }

}