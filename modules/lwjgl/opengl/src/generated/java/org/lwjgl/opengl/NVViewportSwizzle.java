/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_viewport_swizzle.txt">NV_viewport_swizzle</a> extension.
 * 
 * <p>This extension provides a new per-viewport swizzle that can modify the position of primitives sent to each viewport. New viewport swizzle state is
 * added for each viewport, and a new position vector is computed for each vertex by selecting from and optionally negating any of the four components of
 * the original position vector.</p>
 * 
 * <p>This new viewport swizzle is useful for a number of algorithms, including single-pass cubemap rendering (broadcasting a primitive to multiple faces and
 * reorienting the vertex position for each face) and voxel rasterization. The per-viewport component remapping and negation provided by the swizzle
 * allows application code to re-orient three-dimensional geometry with a view along any of the X, Y, or Z axes. If a perspective projection and depth
 * buffering is required, 1/W buffering should be used, as described in the single-pass cubemap rendering example in the "Issues" section below.</p>
 */
public class NVViewportSwizzle {

    static { GL.initialize(); }

    /** Accepted by the {@code swizzlex}, {@code swizzley}, {@code swizzlez}, and {@code swizzlew} parameters of ViewportSwizzleNV. */
    public static final int
        GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV = 0x9350,
        GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV = 0x9351,
        GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV = 0x9352,
        GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV = 0x9353,
        GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV = 0x9354,
        GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV = 0x9355,
        GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV = 0x9356,
        GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV = 0x9357;

    /** Accepted by the {@code pname} parameter of GetBooleani_v, GetDoublei_v, GetIntegeri_v, GetFloati_v, and GetInteger64i_v. */
    public static final int
        GL_VIEWPORT_SWIZZLE_X_NV = 0x9358,
        GL_VIEWPORT_SWIZZLE_Y_NV = 0x9359,
        GL_VIEWPORT_SWIZZLE_Z_NV = 0x935A,
        GL_VIEWPORT_SWIZZLE_W_NV = 0x935B;

    protected NVViewportSwizzle() {
        throw new UnsupportedOperationException();
    }

    // --- [ glViewportSwizzleNV ] ---

    /**
     * Sets the swizzle state for the specified viewport.
     *
     * @param index    the viewport index
     * @param swizzlex the x swizzle state. One of:<br><table><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV VIEWPORT_SWIZZLE_POSITIVE_X_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV VIEWPORT_SWIZZLE_NEGATIVE_X_NV}</td></tr><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV VIEWPORT_SWIZZLE_POSITIVE_Y_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV VIEWPORT_SWIZZLE_NEGATIVE_Y_NV}</td></tr><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV VIEWPORT_SWIZZLE_POSITIVE_Z_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV VIEWPORT_SWIZZLE_NEGATIVE_Z_NV}</td></tr><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV VIEWPORT_SWIZZLE_POSITIVE_W_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV VIEWPORT_SWIZZLE_NEGATIVE_W_NV}</td></tr></table>
     * @param swizzley the y swizzle state. One of:<br><table><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV VIEWPORT_SWIZZLE_POSITIVE_X_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV VIEWPORT_SWIZZLE_NEGATIVE_X_NV}</td></tr><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV VIEWPORT_SWIZZLE_POSITIVE_Y_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV VIEWPORT_SWIZZLE_NEGATIVE_Y_NV}</td></tr><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV VIEWPORT_SWIZZLE_POSITIVE_Z_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV VIEWPORT_SWIZZLE_NEGATIVE_Z_NV}</td></tr><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV VIEWPORT_SWIZZLE_POSITIVE_W_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV VIEWPORT_SWIZZLE_NEGATIVE_W_NV}</td></tr></table>
     * @param swizzlez the z swizzle state. One of:<br><table><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV VIEWPORT_SWIZZLE_POSITIVE_X_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV VIEWPORT_SWIZZLE_NEGATIVE_X_NV}</td></tr><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV VIEWPORT_SWIZZLE_POSITIVE_Y_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV VIEWPORT_SWIZZLE_NEGATIVE_Y_NV}</td></tr><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV VIEWPORT_SWIZZLE_POSITIVE_Z_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV VIEWPORT_SWIZZLE_NEGATIVE_Z_NV}</td></tr><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV VIEWPORT_SWIZZLE_POSITIVE_W_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV VIEWPORT_SWIZZLE_NEGATIVE_W_NV}</td></tr></table>
     * @param swizzlew the w swizzle state. One of:<br><table><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV VIEWPORT_SWIZZLE_POSITIVE_X_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV VIEWPORT_SWIZZLE_NEGATIVE_X_NV}</td></tr><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV VIEWPORT_SWIZZLE_POSITIVE_Y_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV VIEWPORT_SWIZZLE_NEGATIVE_Y_NV}</td></tr><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV VIEWPORT_SWIZZLE_POSITIVE_Z_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV VIEWPORT_SWIZZLE_NEGATIVE_Z_NV}</td></tr><tr><td>{@link #GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV VIEWPORT_SWIZZLE_POSITIVE_W_NV}</td><td>{@link #GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV VIEWPORT_SWIZZLE_NEGATIVE_W_NV}</td></tr></table>
     */
    public static native void glViewportSwizzleNV(@NativeType("GLuint") int index, @NativeType("GLenum") int swizzlex, @NativeType("GLenum") int swizzley, @NativeType("GLenum") int swizzlez, @NativeType("GLenum") int swizzlew);

}