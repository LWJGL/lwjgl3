/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL11C {

    static { GL.initialize(); }

    public static final int
        GL_NEVER    = 0x200,
        GL_LESS     = 0x201,
        GL_EQUAL    = 0x202,
        GL_LEQUAL   = 0x203,
        GL_GREATER  = 0x204,
        GL_NOTEQUAL = 0x205,
        GL_GEQUAL   = 0x206,
        GL_ALWAYS   = 0x207;

    public static final int
        GL_DEPTH_BUFFER_BIT   = 0x100,
        GL_STENCIL_BUFFER_BIT = 0x400,
        GL_COLOR_BUFFER_BIT   = 0x4000;

    public static final int
        GL_POINTS         = 0x0,
        GL_LINES          = 0x1,
        GL_LINE_LOOP      = 0x2,
        GL_LINE_STRIP     = 0x3,
        GL_TRIANGLES      = 0x4,
        GL_TRIANGLE_STRIP = 0x5,
        GL_TRIANGLE_FAN   = 0x6,
        GL_QUADS          = 0x7;

    public static final int
        GL_ZERO                = 0,
        GL_ONE                 = 1,
        GL_SRC_COLOR           = 0x300,
        GL_ONE_MINUS_SRC_COLOR = 0x301,
        GL_SRC_ALPHA           = 0x302,
        GL_ONE_MINUS_SRC_ALPHA = 0x303,
        GL_DST_ALPHA           = 0x304,
        GL_ONE_MINUS_DST_ALPHA = 0x305;

    public static final int
        GL_DST_COLOR           = 0x306,
        GL_ONE_MINUS_DST_COLOR = 0x307,
        GL_SRC_ALPHA_SATURATE  = 0x308;

    public static final int
        GL_TRUE  = 1,
        GL_FALSE = 0;

    public static final int
        GL_BYTE           = 0x1400,
        GL_UNSIGNED_BYTE  = 0x1401,
        GL_SHORT          = 0x1402,
        GL_UNSIGNED_SHORT = 0x1403,
        GL_INT            = 0x1404,
        GL_UNSIGNED_INT   = 0x1405,
        GL_FLOAT          = 0x1406,
        GL_DOUBLE         = 0x140A;

    public static final int
        GL_NONE           = 0,
        GL_FRONT_LEFT     = 0x400,
        GL_FRONT_RIGHT    = 0x401,
        GL_BACK_LEFT      = 0x402,
        GL_BACK_RIGHT     = 0x403,
        GL_FRONT          = 0x404,
        GL_BACK           = 0x405,
        GL_LEFT           = 0x406,
        GL_RIGHT          = 0x407,
        GL_FRONT_AND_BACK = 0x408;

    public static final int
        GL_NO_ERROR          = 0,
        GL_INVALID_ENUM      = 0x500,
        GL_INVALID_VALUE     = 0x501,
        GL_INVALID_OPERATION = 0x502,
        GL_STACK_OVERFLOW    = 0x503,
        GL_STACK_UNDERFLOW   = 0x504,
        GL_OUT_OF_MEMORY     = 0x505;

    public static final int
        GL_CW  = 0x900,
        GL_CCW = 0x901;

    public static final int
        GL_POINT_SIZE              = 0xB11,
        GL_POINT_SIZE_RANGE        = 0xB12,
        GL_POINT_SIZE_GRANULARITY  = 0xB13,
        GL_LINE_SMOOTH             = 0xB20,
        GL_LINE_WIDTH              = 0xB21,
        GL_LINE_WIDTH_RANGE        = 0xB22,
        GL_LINE_WIDTH_GRANULARITY  = 0xB23,
        GL_POLYGON_MODE            = 0xB40,
        GL_POLYGON_SMOOTH          = 0xB41,
        GL_CULL_FACE               = 0xB44,
        GL_CULL_FACE_MODE          = 0xB45,
        GL_FRONT_FACE              = 0xB46,
        GL_DEPTH_RANGE             = 0xB70,
        GL_DEPTH_TEST              = 0xB71,
        GL_DEPTH_WRITEMASK         = 0xB72,
        GL_DEPTH_CLEAR_VALUE       = 0xB73,
        GL_DEPTH_FUNC              = 0xB74,
        GL_STENCIL_TEST            = 0xB90,
        GL_STENCIL_CLEAR_VALUE     = 0xB91,
        GL_STENCIL_FUNC            = 0xB92,
        GL_STENCIL_VALUE_MASK      = 0xB93,
        GL_STENCIL_FAIL            = 0xB94,
        GL_STENCIL_PASS_DEPTH_FAIL = 0xB95,
        GL_STENCIL_PASS_DEPTH_PASS = 0xB96,
        GL_STENCIL_REF             = 0xB97,
        GL_STENCIL_WRITEMASK       = 0xB98,
        GL_VIEWPORT                = 0xBA2,
        GL_DITHER                  = 0xBD0,
        GL_BLEND_DST               = 0xBE0,
        GL_BLEND_SRC               = 0xBE1,
        GL_BLEND                   = 0xBE2,
        GL_LOGIC_OP_MODE           = 0xBF0,
        GL_COLOR_LOGIC_OP          = 0xBF2,
        GL_DRAW_BUFFER             = 0xC01,
        GL_READ_BUFFER             = 0xC02,
        GL_SCISSOR_BOX             = 0xC10,
        GL_SCISSOR_TEST            = 0xC11,
        GL_COLOR_CLEAR_VALUE       = 0xC22,
        GL_COLOR_WRITEMASK         = 0xC23,
        GL_DOUBLEBUFFER            = 0xC32,
        GL_STEREO                  = 0xC33,
        GL_LINE_SMOOTH_HINT        = 0xC52,
        GL_POLYGON_SMOOTH_HINT     = 0xC53,
        GL_UNPACK_SWAP_BYTES       = 0xCF0,
        GL_UNPACK_LSB_FIRST        = 0xCF1,
        GL_UNPACK_ROW_LENGTH       = 0xCF2,
        GL_UNPACK_SKIP_ROWS        = 0xCF3,
        GL_UNPACK_SKIP_PIXELS      = 0xCF4,
        GL_UNPACK_ALIGNMENT        = 0xCF5,
        GL_PACK_SWAP_BYTES         = 0xD00,
        GL_PACK_LSB_FIRST          = 0xD01,
        GL_PACK_ROW_LENGTH         = 0xD02,
        GL_PACK_SKIP_ROWS          = 0xD03,
        GL_PACK_SKIP_PIXELS        = 0xD04,
        GL_PACK_ALIGNMENT          = 0xD05,
        GL_MAX_TEXTURE_SIZE        = 0xD33,
        GL_MAX_VIEWPORT_DIMS       = 0xD3A,
        GL_SUBPIXEL_BITS           = 0xD50,
        GL_TEXTURE_1D              = 0xDE0,
        GL_TEXTURE_2D              = 0xDE1;

    public static final int
        GL_TEXTURE_WIDTH           = 0x1000,
        GL_TEXTURE_HEIGHT          = 0x1001,
        GL_TEXTURE_INTERNAL_FORMAT = 0x1003,
        GL_TEXTURE_BORDER_COLOR    = 0x1004;

    public static final int
        GL_DONT_CARE = 0x1100,
        GL_FASTEST   = 0x1101,
        GL_NICEST    = 0x1102;

    public static final int
        GL_CLEAR         = 0x1500,
        GL_AND           = 0x1501,
        GL_AND_REVERSE   = 0x1502,
        GL_COPY          = 0x1503,
        GL_AND_INVERTED  = 0x1504,
        GL_NOOP          = 0x1505,
        GL_XOR           = 0x1506,
        GL_OR            = 0x1507,
        GL_NOR           = 0x1508,
        GL_EQUIV         = 0x1509,
        GL_INVERT        = 0x150A,
        GL_OR_REVERSE    = 0x150B,
        GL_COPY_INVERTED = 0x150C,
        GL_OR_INVERTED   = 0x150D,
        GL_NAND          = 0x150E,
        GL_SET           = 0x150F;

    public static final int GL_TEXTURE = 0x1702;

    public static final int
        GL_COLOR   = 0x1800,
        GL_DEPTH   = 0x1801,
        GL_STENCIL = 0x1802;

    public static final int
        GL_STENCIL_INDEX   = 0x1901,
        GL_DEPTH_COMPONENT = 0x1902,
        GL_RED             = 0x1903,
        GL_GREEN           = 0x1904,
        GL_BLUE            = 0x1905,
        GL_ALPHA           = 0x1906,
        GL_RGB             = 0x1907,
        GL_RGBA            = 0x1908;

    public static final int
        GL_POINT = 0x1B00,
        GL_LINE  = 0x1B01,
        GL_FILL  = 0x1B02;

    public static final int
        GL_KEEP    = 0x1E00,
        GL_REPLACE = 0x1E01,
        GL_INCR    = 0x1E02,
        GL_DECR    = 0x1E03;

    public static final int
        GL_VENDOR     = 0x1F00,
        GL_RENDERER   = 0x1F01,
        GL_VERSION    = 0x1F02,
        GL_EXTENSIONS = 0x1F03;

    public static final int
        GL_NEAREST = 0x2600,
        GL_LINEAR  = 0x2601;

    public static final int
        GL_NEAREST_MIPMAP_NEAREST = 0x2700,
        GL_LINEAR_MIPMAP_NEAREST  = 0x2701,
        GL_NEAREST_MIPMAP_LINEAR  = 0x2702,
        GL_LINEAR_MIPMAP_LINEAR   = 0x2703;

    public static final int
        GL_TEXTURE_MAG_FILTER = 0x2800,
        GL_TEXTURE_MIN_FILTER = 0x2801,
        GL_TEXTURE_WRAP_S     = 0x2802,
        GL_TEXTURE_WRAP_T     = 0x2803;

    public static final int GL_REPEAT = 0x2901;

    public static final int
        GL_POLYGON_OFFSET_FACTOR = 0x8038,
        GL_POLYGON_OFFSET_UNITS  = 0x2A00,
        GL_POLYGON_OFFSET_POINT  = 0x2A01,
        GL_POLYGON_OFFSET_LINE   = 0x2A02,
        GL_POLYGON_OFFSET_FILL   = 0x8037;

    public static final int
        GL_R3_G3_B2           = 0x2A10,
        GL_RGB4               = 0x804F,
        GL_RGB5               = 0x8050,
        GL_RGB8               = 0x8051,
        GL_RGB10              = 0x8052,
        GL_RGB12              = 0x8053,
        GL_RGB16              = 0x8054,
        GL_RGBA2              = 0x8055,
        GL_RGBA4              = 0x8056,
        GL_RGB5_A1            = 0x8057,
        GL_RGBA8              = 0x8058,
        GL_RGB10_A2           = 0x8059,
        GL_RGBA12             = 0x805A,
        GL_RGBA16             = 0x805B,
        GL_TEXTURE_RED_SIZE   = 0x805C,
        GL_TEXTURE_GREEN_SIZE = 0x805D,
        GL_TEXTURE_BLUE_SIZE  = 0x805E,
        GL_TEXTURE_ALPHA_SIZE = 0x805F,
        GL_PROXY_TEXTURE_1D   = 0x8063,
        GL_PROXY_TEXTURE_2D   = 0x8064;

    public static final int
        GL_TEXTURE_BINDING_1D = 0x8068,
        GL_TEXTURE_BINDING_2D = 0x8069;

    public static final int GL_VERTEX_ARRAY = 0x8074;

    protected GL11C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glEnable ] ---

    /** {@code void glEnable(GLenum target)} */
    public static native void glEnable(@NativeType("GLenum") int target);

    // --- [ glDisable ] ---

    /** {@code void glDisable(GLenum target)} */
    public static native void glDisable(@NativeType("GLenum") int target);

    // --- [ glBindTexture ] ---

    /** {@code void glBindTexture(GLenum target, GLuint texture)} */
    public static native void glBindTexture(@NativeType("GLenum") int target, @NativeType("GLuint") int texture);

    // --- [ glBlendFunc ] ---

    /** {@code void glBlendFunc(GLenum sfactor, GLenum dfactor)} */
    public static native void glBlendFunc(@NativeType("GLenum") int sfactor, @NativeType("GLenum") int dfactor);

    // --- [ glClear ] ---

    /** {@code void glClear(GLbitfield mask)} */
    public static native void glClear(@NativeType("GLbitfield") int mask);

    // --- [ glClearColor ] ---

    /** {@code void glClearColor(GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha)} */
    public static native void glClearColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha);

    // --- [ glClearDepth ] ---

    /** {@code void glClearDepth(GLdouble depth)} */
    public static native void glClearDepth(@NativeType("GLdouble") double depth);

    // --- [ glClearStencil ] ---

    /** {@code void glClearStencil(GLint s)} */
    public static native void glClearStencil(@NativeType("GLint") int s);

    // --- [ glColorMask ] ---

    /** {@code void glColorMask(GLboolean red, GLboolean green, GLboolean blue, GLboolean alpha)} */
    public static native void glColorMask(@NativeType("GLboolean") boolean red, @NativeType("GLboolean") boolean green, @NativeType("GLboolean") boolean blue, @NativeType("GLboolean") boolean alpha);

    // --- [ glCullFace ] ---

    /** {@code void glCullFace(GLenum mode)} */
    public static native void glCullFace(@NativeType("GLenum") int mode);

    // --- [ glDepthFunc ] ---

    /** {@code void glDepthFunc(GLenum func)} */
    public static native void glDepthFunc(@NativeType("GLenum") int func);

    // --- [ glDepthMask ] ---

    /** {@code void glDepthMask(GLboolean flag)} */
    public static native void glDepthMask(@NativeType("GLboolean") boolean flag);

    // --- [ glDepthRange ] ---

    /** {@code void glDepthRange(GLdouble zNear, GLdouble zFar)} */
    public static native void glDepthRange(@NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar);

    // --- [ glDrawArrays ] ---

    /** {@code void glDrawArrays(GLenum mode, GLint first, GLsizei count)} */
    public static native void glDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count);

    // --- [ glDrawBuffer ] ---

    /** {@code void glDrawBuffer(GLenum buf)} */
    public static native void glDrawBuffer(@NativeType("GLenum") int buf);

    // --- [ glDrawElements ] ---

    /** {@code void glDrawElements(GLenum mode, GLsizei count, GLenum type, void const * indices)} */
    public static native void nglDrawElements(int mode, int count, int type, long indices);

    /** {@code void glDrawElements(GLenum mode, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices) {
        nglDrawElements(mode, count, type, indices);
    }

    /** {@code void glDrawElements(GLenum mode, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices) {
        nglDrawElements(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices));
    }

    /** {@code void glDrawElements(GLenum mode, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices) {
        nglDrawElements(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices));
    }

    /** {@code void glDrawElements(GLenum mode, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices) {
        nglDrawElements(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices));
    }

    /** {@code void glDrawElements(GLenum mode, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices) {
        nglDrawElements(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices));
    }

    // --- [ glFinish ] ---

    /** {@code void glFinish(void)} */
    public static native void glFinish();

    // --- [ glFlush ] ---

    /** {@code void glFlush(void)} */
    public static native void glFlush();

    // --- [ glFrontFace ] ---

    /** {@code void glFrontFace(GLenum dir)} */
    public static native void glFrontFace(@NativeType("GLenum") int dir);

    // --- [ glGenTextures ] ---

    /** {@code void glGenTextures(GLsizei n, GLuint * textures)} */
    public static native void nglGenTextures(int n, long textures);

    /** {@code void glGenTextures(GLsizei n, GLuint * textures)} */
    public static void glGenTextures(@NativeType("GLuint *") IntBuffer textures) {
        nglGenTextures(textures.remaining(), memAddress(textures));
    }

    /** {@code void glGenTextures(GLsizei n, GLuint * textures)} */
    @NativeType("void")
    public static int glGenTextures() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer textures = stack.callocInt(1);
            nglGenTextures(1, memAddress(textures));
            return textures.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteTextures ] ---

    /** {@code void glDeleteTextures(GLsizei n, GLuint const * textures)} */
    public static native void nglDeleteTextures(int n, long textures);

    /** {@code void glDeleteTextures(GLsizei n, GLuint const * textures)} */
    public static void glDeleteTextures(@NativeType("GLuint const *") IntBuffer textures) {
        nglDeleteTextures(textures.remaining(), memAddress(textures));
    }

    /** {@code void glDeleteTextures(GLsizei n, GLuint const * textures)} */
    public static void glDeleteTextures(@NativeType("GLuint const *") int texture) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer textures = stack.ints(texture);
            nglDeleteTextures(1, memAddress(textures));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetBooleanv ] ---

    /** {@code void glGetBooleanv(GLenum pname, GLboolean * params)} */
    public static native void nglGetBooleanv(int pname, long params);

    /** {@code void glGetBooleanv(GLenum pname, GLboolean * params)} */
    public static void glGetBooleanv(@NativeType("GLenum") int pname, @NativeType("GLboolean *") ByteBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBooleanv(pname, memAddress(params));
    }

    /** {@code void glGetBooleanv(GLenum pname, GLboolean * params)} */
    @NativeType("void")
    public static boolean glGetBoolean(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer params = stack.calloc(1);
            nglGetBooleanv(pname, memAddress(params));
            return params.get(0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFloatv ] ---

    /** {@code void glGetFloatv(GLenum pname, GLfloat * params)} */
    public static native void nglGetFloatv(int pname, long params);

    /** {@code void glGetFloatv(GLenum pname, GLfloat * params)} */
    public static void glGetFloatv(@NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFloatv(pname, memAddress(params));
    }

    /** {@code void glGetFloatv(GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetFloat(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetFloatv(pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetIntegerv ] ---

    /** {@code void glGetIntegerv(GLenum pname, GLint * params)} */
    public static native void nglGetIntegerv(int pname, long params);

    /** {@code void glGetIntegerv(GLenum pname, GLint * params)} */
    public static void glGetIntegerv(@NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetIntegerv(pname, memAddress(params));
    }

    /** {@code void glGetIntegerv(GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetInteger(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetIntegerv(pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetDoublev ] ---

    /** {@code void glGetDoublev(GLenum pname, GLdouble * params)} */
    public static native void nglGetDoublev(int pname, long params);

    /** {@code void glGetDoublev(GLenum pname, GLdouble * params)} */
    public static void glGetDoublev(@NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetDoublev(pname, memAddress(params));
    }

    /** {@code void glGetDoublev(GLenum pname, GLdouble * params)} */
    @NativeType("void")
    public static double glGetDouble(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetDoublev(pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetError ] ---

    /** {@code GLenum glGetError(void)} */
    @NativeType("GLenum")
    public static native int glGetError();

    // --- [ glGetPointerv ] ---

    /** {@code void glGetPointerv(GLenum pname, void ** params)} */
    public static native void nglGetPointerv(int pname, long params);

    /** {@code void glGetPointerv(GLenum pname, void ** params)} */
    public static void glGetPointerv(@NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetPointerv(pname, memAddress(params));
    }

    /** {@code void glGetPointerv(GLenum pname, void ** params)} */
    @NativeType("void")
    public static long glGetPointer(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetPointerv(pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetString ] ---

    /** {@code GLubyte const * glGetString(GLenum name)} */
    public static native long nglGetString(int name);

    /** {@code GLubyte const * glGetString(GLenum name)} */
    @NativeType("GLubyte const *")
    public static @Nullable String glGetString(@NativeType("GLenum") int name) {
        long __result = nglGetString(name);
        return memUTF8Safe(__result);
    }

    // --- [ glGetTexImage ] ---

    /** {@code void glGetTexImage(GLenum tex, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static native void nglGetTexImage(int tex, int level, int format, int type, long pixels);

    /** {@code void glGetTexImage(GLenum tex, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglGetTexImage(tex, level, format, type, memAddress(pixels));
    }

    /** {@code void glGetTexImage(GLenum tex, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long pixels) {
        nglGetTexImage(tex, level, format, type, pixels);
    }

    /** {@code void glGetTexImage(GLenum tex, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglGetTexImage(tex, level, format, type, memAddress(pixels));
    }

    /** {@code void glGetTexImage(GLenum tex, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglGetTexImage(tex, level, format, type, memAddress(pixels));
    }

    /** {@code void glGetTexImage(GLenum tex, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglGetTexImage(tex, level, format, type, memAddress(pixels));
    }

    /** {@code void glGetTexImage(GLenum tex, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        nglGetTexImage(tex, level, format, type, memAddress(pixels));
    }

    // --- [ glGetTexLevelParameteriv ] ---

    /** {@code void glGetTexLevelParameteriv(GLenum target, GLint level, GLenum pname, GLint * params)} */
    public static native void nglGetTexLevelParameteriv(int target, int level, int pname, long params);

    /** {@code void glGetTexLevelParameteriv(GLenum target, GLint level, GLenum pname, GLint * params)} */
    public static void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
    }

    /** {@code void glGetTexLevelParameteriv(GLenum target, GLint level, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTexLevelParameteri(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexLevelParameterfv ] ---

    /** {@code void glGetTexLevelParameterfv(GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    public static native void nglGetTexLevelParameterfv(int target, int level, int pname, long params);

    /** {@code void glGetTexLevelParameterfv(GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    public static void glGetTexLevelParameterfv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
    }

    /** {@code void glGetTexLevelParameterfv(GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetTexLevelParameterf(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameteriv ] ---

    /** {@code void glGetTexParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetTexParameteriv(int target, int pname, long params);

    /** {@code void glGetTexParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameteriv(target, pname, memAddress(params));
    }

    /** {@code void glGetTexParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTexParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameterfv ] ---

    /** {@code void glGetTexParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static native void nglGetTexParameterfv(int target, int pname, long params);

    /** {@code void glGetTexParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterfv(target, pname, memAddress(params));
    }

    /** {@code void glGetTexParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetTexParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTexParameterfv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glHint ] ---

    /** {@code void glHint(GLenum target, GLenum hint)} */
    public static native void glHint(@NativeType("GLenum") int target, @NativeType("GLenum") int hint);

    // --- [ glIsEnabled ] ---

    /** {@code GLboolean glIsEnabled(GLenum cap)} */
    @NativeType("GLboolean")
    public static native boolean glIsEnabled(@NativeType("GLenum") int cap);

    // --- [ glIsTexture ] ---

    /** {@code GLboolean glIsTexture(GLuint texture)} */
    @NativeType("GLboolean")
    public static native boolean glIsTexture(@NativeType("GLuint") int texture);

    // --- [ glLineWidth ] ---

    /** {@code void glLineWidth(GLfloat width)} */
    public static native void glLineWidth(@NativeType("GLfloat") float width);

    // --- [ glLogicOp ] ---

    /** {@code void glLogicOp(GLenum op)} */
    public static native void glLogicOp(@NativeType("GLenum") int op);

    // --- [ glPixelStorei ] ---

    /** {@code void glPixelStorei(GLenum pname, GLint param)} */
    public static native void glPixelStorei(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glPixelStoref ] ---

    /** {@code void glPixelStoref(GLenum pname, GLfloat param)} */
    public static native void glPixelStoref(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glPointSize ] ---

    /** {@code void glPointSize(GLfloat size)} */
    public static native void glPointSize(@NativeType("GLfloat") float size);

    // --- [ glPolygonMode ] ---

    /** {@code void glPolygonMode(GLenum face, GLenum mode)} */
    public static native void glPolygonMode(@NativeType("GLenum") int face, @NativeType("GLenum") int mode);

    // --- [ glPolygonOffset ] ---

    /** {@code void glPolygonOffset(GLfloat factor, GLfloat units)} */
    public static native void glPolygonOffset(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units);

    // --- [ glReadBuffer ] ---

    /** {@code void glReadBuffer(GLenum src)} */
    public static native void glReadBuffer(@NativeType("GLenum") int src);

    // --- [ glReadPixels ] ---

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static native void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels);

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long pixels) {
        nglReadPixels(x, y, width, height, format, type, pixels);
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
    }

    // --- [ glScissor ] ---

    /** {@code void glScissor(GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glScissor(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glStencilFunc ] ---

    /** {@code void glStencilFunc(GLenum func, GLint ref, GLuint mask)} */
    public static native void glStencilFunc(@NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask);

    // --- [ glStencilMask ] ---

    /** {@code void glStencilMask(GLuint mask)} */
    public static native void glStencilMask(@NativeType("GLuint") int mask);

    // --- [ glStencilOp ] ---

    /** {@code void glStencilOp(GLenum sfail, GLenum dpfail, GLenum dppass)} */
    public static native void glStencilOp(@NativeType("GLenum") int sfail, @NativeType("GLenum") int dpfail, @NativeType("GLenum") int dppass);

    // --- [ glTexImage1D ] ---

    /** {@code void glTexImage1D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

    /** {@code void glTexImage1D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer pixels) {
        nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage1D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    /** {@code void glTexImage1D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer pixels) {
        nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage1D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer pixels) {
        nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage1D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer pixels) {
        nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage1D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable DoubleBuffer pixels) {
        nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTexImage2D ] ---

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer pixels) {
        nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer pixels) {
        nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer pixels) {
        nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer pixels) {
        nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable DoubleBuffer pixels) {
        nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glCopyTexImage1D ] ---

    /** {@code void glCopyTexImage1D(GLenum target, GLint level, GLenum internalFormat, GLint x, GLint y, GLsizei width, GLint border)} */
    public static native void glCopyTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLint") int border);

    // --- [ glCopyTexImage2D ] ---

    /** {@code void glCopyTexImage2D(GLenum target, GLint level, GLenum internalFormat, GLint x, GLint y, GLsizei width, GLsizei height, GLint border)} */
    public static native void glCopyTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border);

    // --- [ glCopyTexSubImage1D ] ---

    /** {@code void glCopyTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLint x, GLint y, GLsizei width)} */
    public static native void glCopyTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

    // --- [ glCopyTexSubImage2D ] ---

    /** {@code void glCopyTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glCopyTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glTexParameteri ] ---

    /** {@code void glTexParameteri(GLenum target, GLenum pname, GLint param)} */
    public static native void glTexParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glTexParameteriv ] ---

    /** {@code void glTexParameteriv(GLenum target, GLenum pname, GLint const * params)} */
    public static native void nglTexParameteriv(int target, int pname, long params);

    /** {@code void glTexParameteriv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTexParameteriv(target, pname, memAddress(params));
    }

    // --- [ glTexParameterf ] ---

    /** {@code void glTexParameterf(GLenum target, GLenum pname, GLfloat param)} */
    public static native void glTexParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glTexParameterfv ] ---

    /** {@code void glTexParameterfv(GLenum target, GLenum pname, GLfloat const * params)} */
    public static native void nglTexParameterfv(int target, int pname, long params);

    /** {@code void glTexParameterfv(GLenum target, GLenum pname, GLfloat const * params)} */
    public static void glTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTexParameterfv(target, pname, memAddress(params));
    }

    // --- [ glTexSubImage1D ] ---

    /** {@code void glTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels);

    /** {@code void glTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
    }

    // --- [ glTexSubImage2D ] ---

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    // --- [ glViewport ] ---

    /** {@code void glViewport(GLint x, GLint y, GLsizei w, GLsizei h)} */
    public static native void glViewport(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int w, @NativeType("GLsizei") int h);

    /** {@code void glGenTextures(GLsizei n, GLuint * textures)} */
    public static void glGenTextures(@NativeType("GLuint *") int[] textures) {
        long __functionAddress = GL.getICD().glGenTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(textures.length, textures, __functionAddress);
    }

    /** {@code void glDeleteTextures(GLsizei n, GLuint const * textures)} */
    public static void glDeleteTextures(@NativeType("GLuint const *") int[] textures) {
        long __functionAddress = GL.getICD().glDeleteTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(textures.length, textures, __functionAddress);
    }

    /** {@code void glGetFloatv(GLenum pname, GLfloat * params)} */
    public static void glGetFloatv(@NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetFloatv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, params, __functionAddress);
    }

    /** {@code void glGetIntegerv(GLenum pname, GLint * params)} */
    public static void glGetIntegerv(@NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetIntegerv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, params, __functionAddress);
    }

    /** {@code void glGetDoublev(GLenum pname, GLdouble * params)} */
    public static void glGetDoublev(@NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetDoublev;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, params, __functionAddress);
    }

    /** {@code void glGetTexImage(GLenum tex, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glGetTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetTexImage(GLenum tex, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glGetTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetTexImage(GLenum tex, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glGetTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetTexImage(GLenum tex, GLint level, GLenum format, GLenum type, void * pixels)} */
    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        long __functionAddress = GL.getICD().glGetTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, pixels, __functionAddress);
    }

    /** {@code void glGetTexLevelParameteriv(GLenum target, GLint level, GLenum pname, GLint * params)} */
    public static void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTexLevelParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, level, pname, params, __functionAddress);
    }

    /** {@code void glGetTexLevelParameterfv(GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    public static void glGetTexLevelParameterfv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetTexLevelParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, level, pname, params, __functionAddress);
    }

    /** {@code void glGetTexParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTexParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetTexParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetTexParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glReadPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glReadPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glReadPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage1D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTexImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage1D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTexImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage1D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTexImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage1D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTexImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTexImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTexImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTexImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double @Nullable [] pixels) {
        long __functionAddress = GL.getICD().glTexImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexParameteriv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glTexParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glTexParameterfv(GLenum target, GLenum pname, GLfloat const * params)} */
    public static void glTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glTexParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTexSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTexSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTexSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTexSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTexSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTexSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTexSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTexSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

}