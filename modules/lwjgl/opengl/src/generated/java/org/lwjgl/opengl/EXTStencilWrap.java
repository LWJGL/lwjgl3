/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_stencil_wrap.txt">EXT_stencil_wrap</a> extension.
 * 
 * <p>Various algorithms use the stencil buffer to "count" the number of surfaces that a ray passes through. As the ray passes into an object, the stencil
 * buffer is incremented. As the ray passes out of an object, the stencil buffer is decremented.</p>
 * 
 * <p>GL requires that the stencil increment operation clamps to its maximum value. For algorithms that depend on the difference between the sum of the
 * increments and the sum of the decrements, clamping causes an erroneous result.</p>
 * 
 * <p>This extension provides an enable for both maximum and minimum wrapping of stencil values. Instead, the stencil value wraps in both directions.</p>
 * 
 * <p>Two additional stencil operations are specified. These new operations are similiar to the existing INCR and DECR operations, but they wrap their result
 * instead of saturating it. This functionality matches the new stencil operations introduced by DirectX 6.</p>
 * 
 * <p>Promoted to core in {@link GL14 OpenGL 1.4}.</p>
 */
public final class EXTStencilWrap {

    /** Accepted by the {@code sfail}, {@code dpfail}, and {@code dppass} parameter of StencilOp. */
    public static final int
        GL_INCR_WRAP_EXT = 0x8507,
        GL_DECR_WRAP_EXT = 0x8508;

    private EXTStencilWrap() {}

}