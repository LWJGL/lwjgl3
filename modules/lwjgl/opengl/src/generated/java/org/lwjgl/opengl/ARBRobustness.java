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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_robustness.txt">ARB_robustness</a> extension.
 * 
 * <p>Several recent trends in how OpenGL integrates into modern computer systems have created new requirements for robustness and security for OpenGL
 * rendering contexts.</p>
 * 
 * <p>Additionally GPU architectures now support hardware fault detection; for example, video memory supporting ECC (error correcting codes) and error
 * detection. OpenGL contexts should be capable of recovering from hardware faults such as uncorrectable memory errors. Along with recovery from such
 * hardware faults, the recovery mechanism can also allow recovery from video memory access exceptions and system software failures. System software
 * failures can be due to device changes or driver failures.</p>
 * 
 * <p>Demands for increased software robustness and concerns about malware exploiting buffer overflows have lead API designers to provide additional "safe"
 * APIs that bound the amount of data returned by an API query. For example, the safer "snprintf" or "_snprintf" routines are prefered over "sprintf".</p>
 * 
 * <p>The OpenGL API has many such robustness perils. OpenGL queries return (write) some number of bytes to a buffer indicated by a pointer parameter. The
 * exact number of bytes written by existing OpenGL queries is not expressed directly by any specific parameter; instead the number of bytes returned is a
 * complex function of one or more query arguments, sometimes context state such as pixel store modes or the active texture selector, and the current state
 * of an object (such as a texture level's number of total texels). By the standards of modern API design, such queries are not "safe". Making these
 * queries safer involves introducing a new query API with an additional parameter that specifies the number of bytes in the buffer and never writing bytes
 * beyond that limit.</p>
 * 
 * <p>Multi-threaded use of OpenGL contexts in a "share group" allow sharing of objects such as textures and programs. Such sharing in conjunction with
 * concurrent OpenGL commands stream execution by two or more contexts introduces hazards whereby one context can change objects in ways that can cause
 * buffer overflows for another context's OpenGL queries.</p>
 * 
 * <p>The original {@link ARBVertexBufferObject ARB_vertex_buffer_object} extension includes an issue that explicitly states program termination is allowed when out-of-bounds
 * vertex buffer object fetches occur. Modern GPUs capable of DirectX 10 enforce the well-defined behavior of always returning zero values for indices or
 * non-fixed components in this case. Older GPUs may require extra checks to enforce well-defined (and termination free) behavior, but this expense is
 * warranted when processing potentially untrusted content.</p>
 * 
 * <p>The intent of this extension is to address some specific robustness goals:</p>
 * 
 * <ul>
 * <li>For all existing OpenGL queries, provide additional "safe" APIs that limit data written to user pointers to a buffer size in bytes that is an
 * explicit additional parameter of the query.</li>
 * <li>Provide a mechanism for an OpenGL application to learn about graphics resets that affect the context. When a graphics reset occurs, the OpenGL
 * context becomes unusable and the application must create a new context to continue operation. Detecting a graphics reset happens through an
 * inexpensive query.</li>
 * <li>Provide an enable to guarantee that out-of-bounds buffer object accesses by the GPU will have deterministic behavior and preclude application
 * instability or termination due to an incorrect buffer access. Such accesses include vertex buffer fetches of attributes and indices, and indexed
 * reads of uniforms or parameters from buffers.</li>
 * </ul>
 * 
 * <p>In one anticipated usage model, WebGL contexts may make use of these robust features to grant greater stability when using untrusted code. WebGL
 * contexts cannot call OpenGL commands directly but rather must route all OpenGL API calls through the web browser. It is then the web browser that
 * configures the context, using the commands in this extension, to enforce safe behavior. In this scenario, the WebGL content cannot specify or change the
 * use of this extension's features itself; the web browser enforces this policy.</p>
 * 
 * <p>There are other well-known robustness issues with the OpenGL API which this extension does not address. For example, selector-based OpenGL commands are
 * a well-known source of programming errors. Code to manipulate texture state may assume the active texture selector is set appropriately when an
 * intervening function call obscures a change to the active texture state resulting in incorrectly updated or queried state. The
 * {@link EXTDirectStateAccess EXT_direct_state_access} extension introduces selector-free OpenGL commands and queries to address that particular issue so this extension does
 * not.</p>
 * 
 * <p>The intent of this extension is NOT to deprecate any existing API and thereby introduce compatibility issues and coding burdens on existing code, but
 * rather to provide new APIs to ensure a level of robustness commensurate with the expectations of modern applications of OpenGL.</p>
 */
public class ARBRobustness {

    static { GL.initialize(); }

    /** Returned by GetGraphicsResetStatusARB. */
    public static final int
        GL_GUILTY_CONTEXT_RESET_ARB   = 0x8253,
        GL_INNOCENT_CONTEXT_RESET_ARB = 0x8254,
        GL_UNKNOWN_CONTEXT_RESET_ARB  = 0x8255;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;

    /** Returned by GetIntegerv and related simple queries when {@code value} is RESET_NOTIFICATION_STRATEGY_ARB. */
    public static final int
        GL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252,
        GL_NO_RESET_NOTIFICATION_ARB = 0x8261;

    /** Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS. */
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 0x4;

    protected ARBRobustness() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetGraphicsResetStatusARB ] ---

    /**
     * The symbolic constant returned indicates if the GL context has been in a reset state at any point since the last call to {@code GetGraphicsResetStatusARB}.
     * {@link GL11#GL_NO_ERROR NO_ERROR} indicates that the GL context has not been in a reset state since the last call. {@link #GL_GUILTY_CONTEXT_RESET_ARB GUILTY_CONTEXT_RESET_ARB} indicates that a reset has
     * been detected that is attributable to the current GL context. {@link #GL_INNOCENT_CONTEXT_RESET_ARB INNOCENT_CONTEXT_RESET_ARB} indicates a reset has been detected that is not attributable
     * to the current GL context. {@link #GL_UNKNOWN_CONTEXT_RESET_ARB UNKNOWN_CONTEXT_RESET_ARB} indicates a detected graphics reset whose cause is unknown.
     * 
     * <p>If a reset status other than NO_ERROR is returned and subsequent calls return NO_ERROR, the context reset was encountered and completed. If a reset
     * status is repeatedly returned, the context may be in the process of resetting.</p>
     * 
     * <p>Reset notification behavior is determined at context creation time, and may be queried by calling {@link GL11C#glGetIntegerv GetIntegerv} with the symbolic constant
     * {@link #GL_RESET_NOTIFICATION_STRATEGY_ARB RESET_NOTIFICATION_STRATEGY_ARB}.</p>
     * 
     * <p>If the reset notification behavior is {@link #GL_NO_RESET_NOTIFICATION_ARB NO_RESET_NOTIFICATION_ARB}, then the implementation will never deliver notification of reset events, and
     * {@code GetGraphicsResetStatusARB} will always return NO_ERROR.</p>
     * 
     * <p>If the behavior is {@link #GL_LOSE_CONTEXT_ON_RESET_ARB LOSE_CONTEXT_ON_RESET_ARB}, a graphics reset will result in the loss of all context state, requiring the recreation of all associated
     * objects. In this case {@code GetGraphicsResetStatusARB}. may return any of the values described above.</p>
     * 
     * <p>If a graphics reset notification occurs in a context, a notification must also occur in all other contexts which share objects with that context.</p>
     */
    @NativeType("GLenum")
    public static native int glGetGraphicsResetStatusARB();

    // --- [ glGetnMapdvARB ] ---

    /**
     * Unsafe version of: {@link #glGetnMapdvARB GetnMapdvARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code data}
     */
    public static native void nglGetnMapdvARB(int target, int query, int bufSize, long data);

    /**
     * Robust version of {@link GL11#glGetMapdv GetMapdv}
     *
     * @param target the evaluator map
     * @param query  the information to query
     * @param data   a buffer in which to place the returned data
     */
    public static void glGetnMapdvARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") DoubleBuffer data) {
        nglGetnMapdvARB(target, query, data.remaining(), memAddress(data));
    }

    /**
     * Robust version of {@link GL11#glGetMapdv GetMapdv}
     *
     * @param target the evaluator map
     * @param query  the information to query
     */
    @NativeType("void")
    public static double glGetnMapdARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer data = stack.callocDouble(1);
            nglGetnMapdvARB(target, query, 1, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnMapfvARB ] ---

    /**
     * Unsafe version of: {@link #glGetnMapfvARB GetnMapfvARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code data}
     */
    public static native void nglGetnMapfvARB(int target, int query, int bufSize, long data);

    /**
     * Robust version of {@link GL11#glGetMapfv GetMapfv}
     *
     * @param target the evaluator map
     * @param query  the information to query
     * @param data   a buffer in which to place the returned data
     */
    public static void glGetnMapfvARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLfloat *") FloatBuffer data) {
        nglGetnMapfvARB(target, query, data.remaining(), memAddress(data));
    }

    /**
     * Robust version of {@link GL11#glGetMapfv GetMapfv}
     *
     * @param target the evaluator map
     * @param query  the information to query
     */
    @NativeType("void")
    public static float glGetnMapfARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer data = stack.callocFloat(1);
            nglGetnMapfvARB(target, query, 1, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnMapivARB ] ---

    /**
     * Unsafe version of: {@link #glGetnMapivARB GetnMapivARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code data}
     */
    public static native void nglGetnMapivARB(int target, int query, int bufSize, long data);

    /**
     * Robust version of {@link GL11#glGetMapiv GetMapiv}
     *
     * @param target the evaluator target. One of:<br><table><tr><td>{@link GL11#GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link GL11#GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link GL11#GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link GL11#GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link GL11#GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td><td>{@link GL11#GL_MAP2_VERTEX_3 MAP2_VERTEX_3}</td><td>{@link GL11#GL_MAP2_VERTEX_4 MAP2_VERTEX_4}</td></tr><tr><td>{@link GL11#GL_MAP2_COLOR_4 MAP2_COLOR_4}</td><td>{@link GL11#GL_MAP2_NORMAL MAP2_NORMAL}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_1 MAP2_TEXTURE_COORD_1}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_2 MAP2_TEXTURE_COORD_2}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_3 MAP2_TEXTURE_COORD_3}</td></tr><tr><td>{@link GL11#GL_MAP2_TEXTURE_COORD_4 MAP2_TEXTURE_COORD_4}</td></tr></table>
     * @param query  the information to query. One of:<br><table><tr><td>{@link GL11#GL_ORDER ORDER}</td><td>{@link GL11#GL_COEFF COEFF}</td><td>{@link GL11#GL_DOMAIN DOMAIN}</td></tr></table>
     * @param data   a buffer in which to place the returned data
     */
    public static void glGetnMapivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLint *") IntBuffer data) {
        nglGetnMapivARB(target, query, data.remaining(), memAddress(data));
    }

    /**
     * Robust version of {@link GL11#glGetMapiv GetMapiv}
     *
     * @param target the evaluator target. One of:<br><table><tr><td>{@link GL11#GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link GL11#GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link GL11#GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link GL11#GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link GL11#GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td><td>{@link GL11#GL_MAP2_VERTEX_3 MAP2_VERTEX_3}</td><td>{@link GL11#GL_MAP2_VERTEX_4 MAP2_VERTEX_4}</td></tr><tr><td>{@link GL11#GL_MAP2_COLOR_4 MAP2_COLOR_4}</td><td>{@link GL11#GL_MAP2_NORMAL MAP2_NORMAL}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_1 MAP2_TEXTURE_COORD_1}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_2 MAP2_TEXTURE_COORD_2}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_3 MAP2_TEXTURE_COORD_3}</td></tr><tr><td>{@link GL11#GL_MAP2_TEXTURE_COORD_4 MAP2_TEXTURE_COORD_4}</td></tr></table>
     * @param query  the information to query. One of:<br><table><tr><td>{@link GL11#GL_ORDER ORDER}</td><td>{@link GL11#GL_COEFF COEFF}</td><td>{@link GL11#GL_DOMAIN DOMAIN}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetnMapiARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetnMapivARB(target, query, 1, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnPixelMapfvARB ] ---

    /**
     * Unsafe version of: {@link #glGetnPixelMapfvARB GetnPixelMapfvARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code data}
     */
    public static native void nglGetnPixelMapfvARB(int map, int bufSize, long data);

    /**
     * Robust version of {@link GL11#glGetPixelMapfv GetPixelMapfv}
     *
     * @param map  the pixel map parameter to query. One of:<br><table><tr><td>{@link GL11#GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link GL11#GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link GL11#GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link GL11#GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link GL11#GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link GL11#GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link GL11#GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link GL11#GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link GL11#GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link GL11#GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>
     * @param data a buffer in which to place the returned data
     */
    public static void glGetnPixelMapfvARB(@NativeType("GLenum") int map, @NativeType("GLfloat *") FloatBuffer data) {
        nglGetnPixelMapfvARB(map, data.remaining(), memAddress(data));
    }

    // --- [ glGetnPixelMapuivARB ] ---

    /**
     * Unsafe version of: {@link #glGetnPixelMapuivARB GetnPixelMapuivARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code data}
     */
    public static native void nglGetnPixelMapuivARB(int map, int bufSize, long data);

    /**
     * Robust version of {@link GL11#glGetPixelMapuiv GetPixelMapuiv}
     *
     * @param map  the pixel map parameter to query
     * @param data a buffer in which to place the returned data
     */
    public static void glGetnPixelMapuivARB(@NativeType("GLenum") int map, @NativeType("GLuint *") IntBuffer data) {
        nglGetnPixelMapuivARB(map, data.remaining(), memAddress(data));
    }

    // --- [ glGetnPixelMapusvARB ] ---

    /**
     * Unsafe version of: {@link #glGetnPixelMapusvARB GetnPixelMapusvARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code data}
     */
    public static native void nglGetnPixelMapusvARB(int map, int bufSize, long data);

    /**
     * Robust version of {@link GL11#glGetPixelMapusv GetPixelMapusv}
     *
     * @param map  the pixel map parameter to query
     * @param data a buffer in which to place the returned data
     */
    public static void glGetnPixelMapusvARB(@NativeType("GLenum") int map, @NativeType("GLushort *") ShortBuffer data) {
        nglGetnPixelMapusvARB(map, data.remaining(), memAddress(data));
    }

    // --- [ glGetnPolygonStippleARB ] ---

    /**
     * Unsafe version of: {@link #glGetnPolygonStippleARB GetnPolygonStippleARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code pattern}
     */
    public static native void nglGetnPolygonStippleARB(int bufSize, long pattern);

    /**
     * Robust version of {@link GL11#glGetPolygonStipple GetPolygonStipple}
     *
     * @param bufSize the maximum number of bytes to write into {@code pattern}
     * @param pattern a buffer in which to place the returned pattern
     */
    public static void glGetnPolygonStippleARB(@NativeType("GLsizei") int bufSize, @NativeType("GLubyte *") long pattern) {
        nglGetnPolygonStippleARB(bufSize, pattern);
    }

    /**
     * Robust version of {@link GL11#glGetPolygonStipple GetPolygonStipple}
     *
     * @param pattern a buffer in which to place the returned pattern
     */
    public static void glGetnPolygonStippleARB(@NativeType("GLubyte *") ByteBuffer pattern) {
        nglGetnPolygonStippleARB(pattern.remaining(), memAddress(pattern));
    }

    // --- [ glGetnTexImageARB ] ---

    /**
     * Unsafe version of: {@link #glGetnTexImageARB GetnTexImageARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code img}
     */
    public static native void nglGetnTexImageARB(int tex, int level, int format, int type, int bufSize, long img);

    /**
     * Robust version of {@link GL11C#glGetTexImage GetTexImage}
     *
     * @param tex     the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
     * @param level   the level-of-detail number
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param bufSize the maximum number of bytes to write into {@code img}
     * @param img     a buffer in which to place the returned data
     */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long img) {
        nglGetnTexImageARB(tex, level, format, type, bufSize, img);
    }

    /**
     * Robust version of {@link GL11C#glGetTexImage GetTexImage}
     *
     * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
     * @param level  the level-of-detail number
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param img    a buffer in which to place the returned data
     */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining(), memAddress(img));
    }

    /**
     * Robust version of {@link GL11C#glGetTexImage GetTexImage}
     *
     * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
     * @param level  the level-of-detail number
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param img    a buffer in which to place the returned data
     */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining() << 1, memAddress(img));
    }

    /**
     * Robust version of {@link GL11C#glGetTexImage GetTexImage}
     *
     * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
     * @param level  the level-of-detail number
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param img    a buffer in which to place the returned data
     */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining() << 2, memAddress(img));
    }

    /**
     * Robust version of {@link GL11C#glGetTexImage GetTexImage}
     *
     * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
     * @param level  the level-of-detail number
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param img    a buffer in which to place the returned data
     */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining() << 2, memAddress(img));
    }

    /**
     * Robust version of {@link GL11C#glGetTexImage GetTexImage}
     *
     * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
     * @param level  the level-of-detail number
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param img    a buffer in which to place the returned data
     */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer img) {
        nglGetnTexImageARB(tex, level, format, type, img.remaining() << 3, memAddress(img));
    }

    // --- [ glReadnPixelsARB ] ---

    /**
     * Unsafe version of: {@link #glReadnPixelsARB ReadnPixelsARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code data}
     */
    public static native void nglReadnPixelsARB(int x, int y, int width, int height, int format, int type, int bufSize, long data);

    /**
     * Robust version of {@link GL11C#glReadPixels ReadPixels}
     *
     * @param x       the left pixel coordinate
     * @param y       the lower pixel coordinate
     * @param width   the number of pixels to read in the x-dimension
     * @param height  the number of pixels to read in the y-dimension
     * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param bufSize the maximum number of bytes to write into {@code data}
     * @param data    a buffer in which to place the returned data
     */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long data) {
        nglReadnPixelsARB(x, y, width, height, format, type, bufSize, data);
    }

    /**
     * Robust version of {@link GL11C#glReadPixels ReadPixels}
     *
     * @param x      the left pixel coordinate
     * @param y      the lower pixel coordinate
     * @param width  the number of pixels to read in the x-dimension
     * @param height the number of pixels to read in the y-dimension
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param data   a buffer in which to place the returned data
     */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer data) {
        nglReadnPixelsARB(x, y, width, height, format, type, data.remaining(), memAddress(data));
    }

    /**
     * Robust version of {@link GL11C#glReadPixels ReadPixels}
     *
     * @param x      the left pixel coordinate
     * @param y      the lower pixel coordinate
     * @param width  the number of pixels to read in the x-dimension
     * @param height the number of pixels to read in the y-dimension
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param data   a buffer in which to place the returned data
     */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer data) {
        nglReadnPixelsARB(x, y, width, height, format, type, data.remaining() << 1, memAddress(data));
    }

    /**
     * Robust version of {@link GL11C#glReadPixels ReadPixels}
     *
     * @param x      the left pixel coordinate
     * @param y      the lower pixel coordinate
     * @param width  the number of pixels to read in the x-dimension
     * @param height the number of pixels to read in the y-dimension
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param data   a buffer in which to place the returned data
     */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer data) {
        nglReadnPixelsARB(x, y, width, height, format, type, data.remaining() << 2, memAddress(data));
    }

    /**
     * Robust version of {@link GL11C#glReadPixels ReadPixels}
     *
     * @param x      the left pixel coordinate
     * @param y      the lower pixel coordinate
     * @param width  the number of pixels to read in the x-dimension
     * @param height the number of pixels to read in the y-dimension
     * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
     * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
     * @param data   a buffer in which to place the returned data
     */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer data) {
        nglReadnPixelsARB(x, y, width, height, format, type, data.remaining() << 2, memAddress(data));
    }

    // --- [ glGetnColorTableARB ] ---

    /**
     * Unsafe version of: {@link #glGetnColorTableARB GetnColorTableARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code table}
     */
    public static native void nglGetnColorTableARB(int target, int format, int type, int bufSize, long table);

    /**
     * Robust version of {@link ARBImaging#glGetColorTable GetColorTable}
     *
     * @param target  the color table target. One of:<br><table><tr><td>{@link ARBImaging#GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param format  the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param bufSize the maximum number of bytes to write into {@code table}
     * @param table   a buffer in which to place the returned data
     */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long table) {
        nglGetnColorTableARB(target, format, type, bufSize, table);
    }

    /**
     * Robust version of {@link ARBImaging#glGetColorTable GetColorTable}
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link ARBImaging#GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table  a buffer in which to place the returned data
     */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer table) {
        nglGetnColorTableARB(target, format, type, table.remaining(), memAddress(table));
    }

    /**
     * Robust version of {@link ARBImaging#glGetColorTable GetColorTable}
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link ARBImaging#GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table  a buffer in which to place the returned data
     */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer table) {
        nglGetnColorTableARB(target, format, type, table.remaining() << 1, memAddress(table));
    }

    /**
     * Robust version of {@link ARBImaging#glGetColorTable GetColorTable}
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link ARBImaging#GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table  a buffer in which to place the returned data
     */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer table) {
        nglGetnColorTableARB(target, format, type, table.remaining() << 2, memAddress(table));
    }

    /**
     * Robust version of {@link ARBImaging#glGetColorTable GetColorTable}
     *
     * @param target the color table target. One of:<br><table><tr><td>{@link ARBImaging#GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
     * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param table  a buffer in which to place the returned data
     */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer table) {
        nglGetnColorTableARB(target, format, type, table.remaining() << 2, memAddress(table));
    }

    // --- [ glGetnConvolutionFilterARB ] ---

    /**
     * Unsafe version of: {@link #glGetnConvolutionFilterARB GetnConvolutionFilterARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code image}
     */
    public static native void nglGetnConvolutionFilterARB(int target, int format, int type, int bufSize, long image);

    /**
     * Robust version of {@link ARBImaging#glGetConvolutionFilter GetConvolutionFilter}
     *
     * @param target  the convolution target. One of:<br><table><tr><td>{@link ARBImaging#GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link ARBImaging#GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
     * @param format  the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param bufSize the maximum number of bytes to write into {@code image}
     * @param image   a buffer in which to place the returned data
     */
    public static void glGetnConvolutionFilterARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long image) {
        nglGetnConvolutionFilterARB(target, format, type, bufSize, image);
    }

    /**
     * Robust version of {@link ARBImaging#glGetConvolutionFilter GetConvolutionFilter}
     *
     * @param target the convolution target. One of:<br><table><tr><td>{@link ARBImaging#GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link ARBImaging#GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
     * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param image  a buffer in which to place the returned data
     */
    public static void glGetnConvolutionFilterARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer image) {
        nglGetnConvolutionFilterARB(target, format, type, image.remaining(), memAddress(image));
    }

    // --- [ glGetnSeparableFilterARB ] ---

    /**
     * Unsafe version of: {@link #glGetnSeparableFilterARB GetnSeparableFilterARB}
     *
     * @param rowBufSize    the maximum number of bytes to write into {@code row}
     * @param columnBufSize the maximum number of bytes to write into {@code column}
     */
    public static native void nglGetnSeparableFilterARB(int target, int format, int type, int rowBufSize, long row, int columnBufSize, long column, long span);

    /**
     * Robust version of {@link ARBImaging#glGetSeparableFilter GetSeparableFilter}
     *
     * @param target        the filter target. Must be:<br><table><tr><td>{@link ARBImaging#GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
     * @param format        the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type          the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param rowBufSize    the maximum number of bytes to write into {@code row}
     * @param row           a buffer in which to return the filter row
     * @param columnBufSize the maximum number of bytes to write into {@code column}
     * @param column        a buffer in which to return the filter column
     */
    public static void glGetnSeparableFilterARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int rowBufSize, @NativeType("void *") long row, @NativeType("GLsizei") int columnBufSize, @NativeType("void *") long column, @Nullable @NativeType("void *") ByteBuffer span) {
        nglGetnSeparableFilterARB(target, format, type, rowBufSize, row, columnBufSize, column, memAddressSafe(span));
    }

    /**
     * Robust version of {@link ARBImaging#glGetSeparableFilter GetSeparableFilter}
     *
     * @param target the filter target. Must be:<br><table><tr><td>{@link ARBImaging#GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
     * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param row    a buffer in which to return the filter row
     * @param column a buffer in which to return the filter column
     */
    public static void glGetnSeparableFilterARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer row, @NativeType("void *") ByteBuffer column, @Nullable @NativeType("void *") ByteBuffer span) {
        nglGetnSeparableFilterARB(target, format, type, row.remaining(), memAddress(row), column.remaining(), memAddress(column), memAddressSafe(span));
    }

    // --- [ glGetnHistogramARB ] ---

    /**
     * Unsafe version of: {@link #glGetnHistogramARB GetnHistogramARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code values}
     */
    public static native void nglGetnHistogramARB(int target, boolean reset, int format, int type, int bufSize, long values);

    /**
     * Robust version of {@link ARBImaging#glGetHistogram GetHistogram}
     *
     * @param target  the histogram target. Must be:<br><table><tr><td>{@link ARBImaging#GL_HISTOGRAM HISTOGRAM}</td></tr></table>
     * @param reset   if {@link GL11#GL_TRUE TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not.
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the pixel data types. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param bufSize the maximum number of bytes to write into {@code values}
     * @param values  a buffer in which to place the returned data
     */
    public static void glGetnHistogramARB(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long values) {
        nglGetnHistogramARB(target, reset, format, type, bufSize, values);
    }

    /**
     * Robust version of {@link ARBImaging#glGetHistogram GetHistogram}
     *
     * @param target the histogram target. Must be:<br><table><tr><td>{@link ARBImaging#GL_HISTOGRAM HISTOGRAM}</td></tr></table>
     * @param reset  if {@link GL11#GL_TRUE TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not.
     * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the pixel data types. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param values a buffer in which to place the returned data
     */
    public static void glGetnHistogramARB(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer values) {
        nglGetnHistogramARB(target, reset, format, type, values.remaining(), memAddress(values));
    }

    // --- [ glGetnMinmaxARB ] ---

    /**
     * Unsafe version of: {@link #glGetnMinmaxARB GetnMinmaxARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code values}
     */
    public static native void nglGetnMinmaxARB(int target, boolean reset, int format, int type, int bufSize, long values);

    /**
     * Robust version of {@link ARBImaging#glGetMinmax GetMinmax}
     *
     * @param target  the minmax target. Must be:<br><table><tr><td>{@link ARBImaging#GL_MINMAX MINMAX}</td></tr></table>
     * @param reset   If {@link GL11#GL_TRUE TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
     *                representable value. All values are reset, whether returned or not.
     * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param bufSize the maximum number of bytes to write into {@code values}
     * @param values  a buffer in which to place the returned data
     */
    public static void glGetnMinmaxARB(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long values) {
        nglGetnMinmaxARB(target, reset, format, type, bufSize, values);
    }

    /**
     * Robust version of {@link ARBImaging#glGetMinmax GetMinmax}
     *
     * @param target the minmax target. Must be:<br><table><tr><td>{@link ARBImaging#GL_MINMAX MINMAX}</td></tr></table>
     * @param reset  If {@link GL11#GL_TRUE TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
     *               representable value. All values are reset, whether returned or not.
     * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
     * @param type   the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param values a buffer in which to place the returned data
     */
    public static void glGetnMinmaxARB(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer values) {
        nglGetnMinmaxARB(target, reset, format, type, values.remaining(), memAddress(values));
    }

    // --- [ glGetnCompressedTexImageARB ] ---

    /**
     * Unsafe version of: {@link #glGetnCompressedTexImageARB GetnCompressedTexImageARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code img}
     */
    public static native void nglGetnCompressedTexImageARB(int target, int level, int bufSize, long img);

    /**
     * Robust version of {@link GL13C#glGetCompressedTexImage GetCompressedTexImage}
     *
     * @param target  the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
     * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param bufSize the maximum number of bytes to write into {@code img}
     * @param img     a buffer in which to place the returned data
     */
    public static void glGetnCompressedTexImageARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLsizei") int bufSize, @NativeType("void *") long img) {
        nglGetnCompressedTexImageARB(target, level, bufSize, img);
    }

    /**
     * Robust version of {@link GL13C#glGetCompressedTexImage GetCompressedTexImage}
     *
     * @param target the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
     * @param level  the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
     * @param img    a buffer in which to place the returned data
     */
    public static void glGetnCompressedTexImageARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer img) {
        if (CHECKS) {
            if (DEBUG) {
                check(img, GL11.glGetTexLevelParameteri(target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
            }
        }
        nglGetnCompressedTexImageARB(target, level, img.remaining(), memAddress(img));
    }

    // --- [ glGetnUniformfvARB ] ---

    /**
     * Unsafe version of: {@link #glGetnUniformfvARB GetnUniformfvARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code params}
     */
    public static native void nglGetnUniformfvARB(int program, int location, int bufSize, long params);

    /**
     * Robust version of {@link GL20C#glGetUniformfv GetUniformfv}
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   a buffer in which to place the returned data
     */
    public static void glGetnUniformfvARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformfvARB(program, location, params.remaining(), memAddress(params));
    }

    /**
     * Robust version of {@link GL20C#glGetUniformfv GetUniformfv}
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     */
    @NativeType("void")
    public static float glGetnUniformfARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformfvARB(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformivARB ] ---

    /**
     * Unsafe version of: {@link #glGetnUniformivARB GetnUniformivARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code params}
     */
    public static native void nglGetnUniformivARB(int program, int location, int bufSize, long params);

    /**
     * Robust version of {@link GL20C#glGetUniformiv GetUniformiv}
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   a buffer in which to place the returned data
     */
    public static void glGetnUniformivARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        nglGetnUniformivARB(program, location, params.remaining(), memAddress(params));
    }

    /**
     * Robust version of {@link GL20C#glGetUniformiv GetUniformiv}
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     */
    @NativeType("void")
    public static int glGetnUniformiARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetnUniformivARB(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformuivARB ] ---

    /**
     * Unsafe version of: {@link #glGetnUniformuivARB GetnUniformuivARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code params}
     */
    public static native void nglGetnUniformuivARB(int program, int location, int bufSize, long params);

    /**
     * Robust version of {@link GL30C#glGetUniformuiv GetUniformuiv}
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   a buffer in which to place the returned data
     */
    public static void glGetnUniformuivARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        nglGetnUniformuivARB(program, location, params.remaining(), memAddress(params));
    }

    /**
     * Robust version of {@link GL30C#glGetUniformuiv GetUniformuiv}
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     */
    @NativeType("void")
    public static int glGetnUniformuiARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetnUniformuivARB(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformdvARB ] ---

    /**
     * Unsafe version of: {@link #glGetnUniformdvARB GetnUniformdvARB}
     *
     * @param bufSize the maximum number of bytes to write into {@code params}
     */
    public static native void nglGetnUniformdvARB(int program, int location, int bufSize, long params);

    /**
     * Robust version of {@link GL40C#glGetUniformdv GetUniformdv}
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   a buffer in which to place the returned data
     */
    public static void glGetnUniformdvARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") DoubleBuffer params) {
        nglGetnUniformdvARB(program, location, params.remaining(), memAddress(params));
    }

    /**
     * Robust version of {@link GL40C#glGetUniformdv GetUniformdv}
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     */
    @NativeType("void")
    public static double glGetnUniformdARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetnUniformdvARB(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glGetnMapdvARB GetnMapdvARB} */
    public static void glGetnMapdvARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") double[] data) {
        long __functionAddress = GL.getICD().glGetnMapdvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, data.length, data, __functionAddress);
    }

    /** Array version of: {@link #glGetnMapfvARB GetnMapfvARB} */
    public static void glGetnMapfvARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GL.getICD().glGetnMapfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, data.length, data, __functionAddress);
    }

    /** Array version of: {@link #glGetnMapivARB GetnMapivARB} */
    public static void glGetnMapivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLint *") int[] data) {
        long __functionAddress = GL.getICD().glGetnMapivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, query, data.length, data, __functionAddress);
    }

    /** Array version of: {@link #glGetnPixelMapfvARB GetnPixelMapfvARB} */
    public static void glGetnPixelMapfvARB(@NativeType("GLenum") int map, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GL.getICD().glGetnPixelMapfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, data.length, data, __functionAddress);
    }

    /** Array version of: {@link #glGetnPixelMapuivARB GetnPixelMapuivARB} */
    public static void glGetnPixelMapuivARB(@NativeType("GLenum") int map, @NativeType("GLuint *") int[] data) {
        long __functionAddress = GL.getICD().glGetnPixelMapuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, data.length, data, __functionAddress);
    }

    /** Array version of: {@link #glGetnPixelMapusvARB GetnPixelMapusvARB} */
    public static void glGetnPixelMapusvARB(@NativeType("GLenum") int map, @NativeType("GLushort *") short[] data) {
        long __functionAddress = GL.getICD().glGetnPixelMapusvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, data.length, data, __functionAddress);
    }

    /** Array version of: {@link #glGetnTexImageARB GetnTexImageARB} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] img) {
        long __functionAddress = GL.getICD().glGetnTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 1, img, __functionAddress);
    }

    /** Array version of: {@link #glGetnTexImageARB GetnTexImageARB} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] img) {
        long __functionAddress = GL.getICD().glGetnTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 2, img, __functionAddress);
    }

    /** Array version of: {@link #glGetnTexImageARB GetnTexImageARB} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] img) {
        long __functionAddress = GL.getICD().glGetnTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 2, img, __functionAddress);
    }

    /** Array version of: {@link #glGetnTexImageARB GetnTexImageARB} */
    public static void glGetnTexImageARB(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] img) {
        long __functionAddress = GL.getICD().glGetnTexImageARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 3, img, __functionAddress);
    }

    /** Array version of: {@link #glReadnPixelsARB ReadnPixelsARB} */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] data) {
        long __functionAddress = GL.getICD().glReadnPixelsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, data.length << 1, data, __functionAddress);
    }

    /** Array version of: {@link #glReadnPixelsARB ReadnPixelsARB} */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] data) {
        long __functionAddress = GL.getICD().glReadnPixelsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, data.length << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glReadnPixelsARB ReadnPixelsARB} */
    public static void glReadnPixelsARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] data) {
        long __functionAddress = GL.getICD().glReadnPixelsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, data.length << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glGetnColorTableARB GetnColorTableARB} */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] table) {
        long __functionAddress = GL.getICD().glGetnColorTableARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, table.length << 1, table, __functionAddress);
    }

    /** Array version of: {@link #glGetnColorTableARB GetnColorTableARB} */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] table) {
        long __functionAddress = GL.getICD().glGetnColorTableARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, table.length << 2, table, __functionAddress);
    }

    /** Array version of: {@link #glGetnColorTableARB GetnColorTableARB} */
    public static void glGetnColorTableARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] table) {
        long __functionAddress = GL.getICD().glGetnColorTableARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, format, type, table.length << 2, table, __functionAddress);
    }

    /** Array version of: {@link #glGetnUniformfvARB GetnUniformfvARB} */
    public static void glGetnUniformfvARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetnUniformfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** Array version of: {@link #glGetnUniformivARB GetnUniformivARB} */
    public static void glGetnUniformivARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetnUniformivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** Array version of: {@link #glGetnUniformuivARB GetnUniformuivARB} */
    public static void glGetnUniformuivARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetnUniformuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** Array version of: {@link #glGetnUniformdvARB GetnUniformdvARB} */
    public static void glGetnUniformdvARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetnUniformdvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

}