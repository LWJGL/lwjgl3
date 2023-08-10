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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_framebuffer_no_attachments.txt">ARB_framebuffer_no_attachments</a> extension.
 * 
 * <p>Framebuffer objects as introduced by {@link ARBFramebufferObject ARB_framebuffer_object} and OpenGL 3.0 provide a generalized mechanism for rendering to off-screen surfaces.
 * Each framebuffer object may have depth, stencil and zero or more color attachments that can be written to by the GL. The size of the framebuffer (width,
 * height, layer count, sample count) is derived from the attachments of that framebuffer. In unextended OpenGL 4.2, it is not legal to render into a
 * framebuffer object that has no attachments. Such a framebuffer would be considered incomplete with the {@link GL30#GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT}
 * status.</p>
 * 
 * <p>With OpenGL 4.2 and {@link ARBShaderImageLoadStore ARB_shader_image_load_store}, fragment shaders are capable of doing random access writes to buffer and texture memory via
 * image loads, stores, and atomics. This ability enables algorithms using the conventional rasterizer to generate a collection of fragments, where each
 * fragment shader invocation will write its outputs to buffer or texture memory using image stores or atomics. Such algorithms may have no need to write
 * color or depth values to a conventional framebuffer. However, a framebuffer with no attachments will be considered incomplete and no rasterization or
 * fragment shader exectuion will occur. To avoid such errors, an application may be required to create an otherwise unnecessary "dummy" texture and attach
 * it to the framebuffer (possibly with color writes masked off). If the algorithm requires the rasterizer to operate over a large number of pixels, this
 * dummy texture will needlessly consume a significant amount of memory.</p>
 * 
 * <p>This extension enables the algorithms described above to work even with a framebuffer with no attachments. Applications can specify default width,
 * height, layer count, and sample count parameters for a framebuffer object. When a framebuffer with no attachments is bound, it will be considered
 * complete as long as the application has specified non-zero default width and height parameters. For the purposes of rasterization, the framebuffer will
 * be considered to have a width, height, layer count, and sample count derived from its default parameters. Framebuffers with one or more attachments are
 * not affected by these default parameters; the size of the framebuffer will still be derived from the sizes of the attachments in that case.</p>
 * 
 * <p>Additionally, this extension provides queryable implementation-dependent maximums for framebuffer width, height, layer count, and sample count, which
 * may differ from similar limits on textures and renderbuffers. These maximums will be used to error-check the default framebuffer parameters and also
 * permit implementations to expose the ability to rasterize to an attachment-less framebuffer larger than the maximum supported texture size.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0} or {@link ARBFramebufferObject ARB_framebuffer_object}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public class ARBFramebufferNoAttachments {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv, NamedFramebufferParameteriEXT, and
     * GetNamedFramebufferParameterivEXT.
     */
    public static final int
        GL_FRAMEBUFFER_DEFAULT_WIDTH                  = 0x9310,
        GL_FRAMEBUFFER_DEFAULT_HEIGHT                 = 0x9311,
        GL_FRAMEBUFFER_DEFAULT_LAYERS                 = 0x9312,
        GL_FRAMEBUFFER_DEFAULT_SAMPLES                = 0x9313,
        GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int
        GL_MAX_FRAMEBUFFER_WIDTH   = 0x9315,
        GL_MAX_FRAMEBUFFER_HEIGHT  = 0x9316,
        GL_MAX_FRAMEBUFFER_LAYERS  = 0x9317,
        GL_MAX_FRAMEBUFFER_SAMPLES = 0x9318;

    protected ARBFramebufferNoAttachments() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferParameteri ] ---

    /**
     * Sets a named parameter of a framebuffer.
     *
     * @param target target of the operation. One of:<br><table><tr><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td></tr></table>
     * @param pname  a token indicating the parameter to be modified. One of:<br><table><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
     * @param param  the new value for the parameter named {@code pname}
     */
    public static void glFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        GL43C.glFramebufferParameteri(target, pname, param);
    }

    // --- [ glGetFramebufferParameteriv ] ---

    /** Unsafe version of: {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
    public static void nglGetFramebufferParameteriv(int target, int pname, long params) {
        GL43C.nglGetFramebufferParameteriv(target, pname, params);
    }

    /**
     * Retrieves a named parameter from a framebuffer.
     *
     * @param target target of the operation. One of:<br><table><tr><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td></tr></table>
     * @param pname  a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
     * @param params a variable to receive the value of the parameter named {@code pname}
     */
    public static void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL43C.glGetFramebufferParameteriv(target, pname, params);
    }

    /**
     * Retrieves a named parameter from a framebuffer.
     *
     * @param target target of the operation. One of:<br><table><tr><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td></tr></table>
     * @param pname  a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43C#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL43C.glGetFramebufferParameteri(target, pname);
    }

    // --- [ glNamedFramebufferParameteriEXT ] ---

    /**
     * DSA version of {@link #glFramebufferParameteri FramebufferParameteri}.
     *
     * @param framebuffer the framebuffer object
     * @param pname       a token indicating the parameter to be modified. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link #GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link #GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
     * @param param       the new value for the parameter named {@code pname}
     */
    public static native void glNamedFramebufferParameteriEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glGetNamedFramebufferParameterivEXT ] ---

    /** Unsafe version of: {@link #glGetNamedFramebufferParameterivEXT GetNamedFramebufferParameterivEXT} */
    public static native void nglGetNamedFramebufferParameterivEXT(int framebuffer, int pname, long params);

    /**
     * DSA version of {@link #glGetFramebufferParameteriv GetFramebufferParameteriv}.
     *
     * @param framebuffer the framebuffer object
     * @param pname       a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link #GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link #GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
     * @param params      a variable to receive the value of the parameter named {@code pname}
     */
    public static void glGetNamedFramebufferParameterivEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedFramebufferParameterivEXT(framebuffer, pname, memAddress(params));
    }

    /**
     * DSA version of {@link #glGetFramebufferParameteriv GetFramebufferParameteriv}.
     *
     * @param framebuffer the framebuffer object
     * @param pname       a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link #GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link #GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link #GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link #GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetNamedFramebufferParameteriEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedFramebufferParameterivEXT(framebuffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
    public static void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL43C.glGetFramebufferParameteriv(target, pname, params);
    }

    /** Array version of: {@link #glGetNamedFramebufferParameterivEXT GetNamedFramebufferParameterivEXT} */
    public static void glGetNamedFramebufferParameterivEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedFramebufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(framebuffer, pname, params, __functionAddress);
    }

}