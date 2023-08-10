/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_draw_buffers_blend.txt">ARB_draw_buffers_blend</a> extension.
 * 
 * <p>This extension builds upon the {@link ARBDrawBuffers ARB_draw_buffers} and {@link EXTDrawBuffers2 EXT_draw_buffers2} extensions. In ARB_draw_buffers (part of OpenGL 2.0), separate
 * values could be written to each color buffer. This was further enhanced by EXT_draw_buffers2 by adding in the ability to enable blending and to set
 * color write masks independently per color output.</p>
 * 
 * <p>This extension provides the ability to set individual blend equations and blend functions for each color output.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} and {@link EXTDrawBuffers2 EXT_draw_buffers2}. Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public class ARBDrawBuffersBlend {

    static { GL.initialize(); }

    protected ARBDrawBuffersBlend() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendEquationiARB ] ---

    /**
     * Provides a way to enable blending and set color write masks independently per color output.
     * 
     * <p>This call modifies the blend equations associated with an individual draw buffer.</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if the {@code buf} parameter is outside the range [0, {@link GL20#GL_MAX_DRAW_BUFFERS MAX_DRAW_BUFFERS} &ndash; 1].</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if {@code mode} is not one of {@link GL14#GL_FUNC_ADD FUNC_ADD}, {@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT},
     * {@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link GL14#GL_MAX MAX}, or {@link GL14#GL_MIN MIN}.</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if this method is executed between the execution of {@link GL11#glBegin Begin} and the corresponding execution
     * of {@link GL11#glEnd End}.</p>
     *
     * @param buf  an integer that indicates the {@link GL11#GL_DRAW_BUFFER DRAW_BUFFER} to modify.
     * @param mode determines both the RGB and alpha blend equations. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>
     */
    public static native void glBlendEquationiARB(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode);

    // --- [ glBlendEquationSeparateiARB ] ---

    /**
     * Provides a way to enable blending and set color write masks independently per color output.
     * 
     * <p>This call modifies the blend equations associated with an individual draw buffer.</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if the {@code buf} parameter is outside the range [0, {@link GL20#GL_MAX_DRAW_BUFFERS MAX_DRAW_BUFFERS} &ndash; 1].</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if either {@code modeRGB} or {@code modeAlpha} are not one of {@link GL14#GL_FUNC_ADD FUNC_ADD},
     * {@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}, {@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link GL14#GL_MAX MAX}, or {@link GL14#GL_MIN MIN}.</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if this method is executed between the execution of {@link GL11#glBegin Begin} and the corresponding execution
     * of {@link GL11#glEnd End}.</p>
     *
     * @param buf       an integer that indicates the {@link GL11#GL_DRAW_BUFFER DRAW_BUFFER} to modify.
     * @param modeRGB   the RGB blend equation. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>
     * @param modeAlpha the alpha blend equation. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>
     */
    public static native void glBlendEquationSeparateiARB(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

    // --- [ glBlendFunciARB ] ---

    /**
     * Provides a way to enable blending and set color write masks independently per color output.
     * 
     * <p>This call modifies the blend functions associated with an individual draw buffer.</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if the {@code buf} parameter is outside the range [0, {@link GL20#GL_MAX_DRAW_BUFFERS MAX_DRAW_BUFFERS} &ndash; 1].</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if either {@code src}, or {@code dst} is not an accepted value.</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if this method is executed between the execution of {@link GL11#glBegin Begin} and the corresponding execution
     * of {@link GL11#glEnd End}.</p>
     *
     * @param buf an integer that indicates the {@link GL11#GL_DRAW_BUFFER DRAW_BUFFER} to modify.
     * @param src determines both RGB and alpha source functions
     * @param dst determines both RGB and alpha destination functions
     */
    public static native void glBlendFunciARB(@NativeType("GLuint") int buf, @NativeType("GLenum") int src, @NativeType("GLenum") int dst);

    // --- [ glBlendFuncSeparateiARB ] ---

    /**
     * Provides a way to enable blending and set color write masks independently per color output.
     * 
     * <p>This call modifies the blend functions associated with an individual draw buffer.</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if the {@code buf} parameter is outside the range [0, {@link GL20#GL_MAX_DRAW_BUFFERS MAX_DRAW_BUFFERS} &ndash; 1].</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if either {@code srcRGB}, {@code dstRGB}, {@code srcAlpha}, or {@code dstAlpha} is not an accepted value.</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if this method is executed between the execution of {@link GL11#glBegin Begin} and the corresponding execution
     * of {@link GL11#glEnd End}.</p>
     *
     * @param buf      an integer that indicates the {@link GL11#GL_DRAW_BUFFER DRAW_BUFFER} to modify.
     * @param srcRGB   the source RGB blend function
     * @param dstRGB   the destination RGB blend function
     * @param srcAlpha the source alpha blend function
     * @param dstAlpha the destination alpha blend function
     */
    public static native void glBlendFuncSeparateiARB(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha);

}