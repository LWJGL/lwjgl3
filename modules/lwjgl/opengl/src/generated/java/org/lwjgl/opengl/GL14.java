/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL14 extends GL13 {

    static { GL.initialize(); }

    public static final int GL_GENERATE_MIPMAP = 0x8191;

    public static final int GL_GENERATE_MIPMAP_HINT = 0x8192;

    public static final int
        GL_CONSTANT_COLOR           = 0x8001,
        GL_ONE_MINUS_CONSTANT_COLOR = 0x8002,
        GL_CONSTANT_ALPHA           = 0x8003,
        GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;

    public static final int GL_BLEND_COLOR = 0x8005;

    public static final int
        GL_FUNC_ADD = 0x8006,
        GL_MIN      = 0x8007,
        GL_MAX      = 0x8008;

    public static final int GL_BLEND_EQUATION = 0x8009;

    public static final int
        GL_FUNC_SUBTRACT         = 0x800A,
        GL_FUNC_REVERSE_SUBTRACT = 0x800B;

    public static final int
        GL_DEPTH_COMPONENT16 = 0x81A5,
        GL_DEPTH_COMPONENT24 = 0x81A6,
        GL_DEPTH_COMPONENT32 = 0x81A7;

    public static final int GL_TEXTURE_DEPTH_SIZE = 0x884A;

    public static final int GL_DEPTH_TEXTURE_MODE = 0x884B;

    public static final int
        GL_TEXTURE_COMPARE_MODE = 0x884C,
        GL_TEXTURE_COMPARE_FUNC = 0x884D;

    public static final int GL_COMPARE_R_TO_TEXTURE = 0x884E;

    public static final int GL_FOG_COORDINATE_SOURCE = 0x8450;

    public static final int
        GL_FOG_COORDINATE = 0x8451,
        GL_FRAGMENT_DEPTH = 0x8452;

    public static final int
        GL_CURRENT_FOG_COORDINATE      = 0x8453,
        GL_FOG_COORDINATE_ARRAY_TYPE   = 0x8454,
        GL_FOG_COORDINATE_ARRAY_STRIDE = 0x8455;

    public static final int GL_FOG_COORDINATE_ARRAY_POINTER = 0x8456;

    public static final int GL_FOG_COORDINATE_ARRAY = 0x8457;

    public static final int
        GL_POINT_SIZE_MIN             = 0x8126,
        GL_POINT_SIZE_MAX             = 0x8127,
        GL_POINT_FADE_THRESHOLD_SIZE  = 0x8128,
        GL_POINT_DISTANCE_ATTENUATION = 0x8129;

    public static final int GL_COLOR_SUM = 0x8458;

    public static final int
        GL_CURRENT_SECONDARY_COLOR      = 0x8459,
        GL_SECONDARY_COLOR_ARRAY_SIZE   = 0x845A,
        GL_SECONDARY_COLOR_ARRAY_TYPE   = 0x845B,
        GL_SECONDARY_COLOR_ARRAY_STRIDE = 0x845C;

    public static final int GL_SECONDARY_COLOR_ARRAY_POINTER = 0x845D;

    public static final int GL_SECONDARY_COLOR_ARRAY = 0x845E;

    public static final int
        GL_BLEND_DST_RGB   = 0x80C8,
        GL_BLEND_SRC_RGB   = 0x80C9,
        GL_BLEND_DST_ALPHA = 0x80CA,
        GL_BLEND_SRC_ALPHA = 0x80CB;

    public static final int
        GL_INCR_WRAP = 0x8507,
        GL_DECR_WRAP = 0x8508;

    public static final int GL_TEXTURE_FILTER_CONTROL = 0x8500;

    public static final int GL_TEXTURE_LOD_BIAS = 0x8501;

    public static final int GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;

    public static final int GL_MIRRORED_REPEAT = 0x8370;

    protected GL14() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendColor ] ---

    /** {@code void glBlendColor(GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha)} */
    public static void glBlendColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        GL14C.glBlendColor(red, green, blue, alpha);
    }

    // --- [ glBlendEquation ] ---

    /** {@code void glBlendEquation(GLenum mode)} */
    public static void glBlendEquation(@NativeType("GLenum") int mode) {
        GL14C.glBlendEquation(mode);
    }

    // --- [ glFogCoordf ] ---

    /** {@code void glFogCoordf(GLfloat coord)} */
    public static native void glFogCoordf(@NativeType("GLfloat") float coord);

    // --- [ glFogCoordd ] ---

    /** {@code void glFogCoordd(GLdouble coord)} */
    public static native void glFogCoordd(@NativeType("GLdouble") double coord);

    // --- [ glFogCoordfv ] ---

    /** {@code void glFogCoordfv(GLfloat const * coord)} */
    public static native void nglFogCoordfv(long coord);

    /** {@code void glFogCoordfv(GLfloat const * coord)} */
    public static void glFogCoordfv(@NativeType("GLfloat const *") FloatBuffer coord) {
        if (CHECKS) {
            check(coord, 1);
        }
        nglFogCoordfv(memAddress(coord));
    }

    // --- [ glFogCoorddv ] ---

    /** {@code void glFogCoorddv(GLdouble const * coord)} */
    public static native void nglFogCoorddv(long coord);

    /** {@code void glFogCoorddv(GLdouble const * coord)} */
    public static void glFogCoorddv(@NativeType("GLdouble const *") DoubleBuffer coord) {
        if (CHECKS) {
            check(coord, 1);
        }
        nglFogCoorddv(memAddress(coord));
    }

    // --- [ glFogCoordPointer ] ---

    /** {@code void glFogCoordPointer(GLenum type, GLsizei stride, void const * pointer)} */
    public static native void nglFogCoordPointer(int type, int stride, long pointer);

    /** {@code void glFogCoordPointer(GLenum type, GLsizei stride, void const * pointer)} */
    public static void glFogCoordPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglFogCoordPointer(type, stride, memAddress(pointer));
    }

    /** {@code void glFogCoordPointer(GLenum type, GLsizei stride, void const * pointer)} */
    public static void glFogCoordPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglFogCoordPointer(type, stride, pointer);
    }

    /** {@code void glFogCoordPointer(GLenum type, GLsizei stride, void const * pointer)} */
    public static void glFogCoordPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglFogCoordPointer(type, stride, memAddress(pointer));
    }

    /** {@code void glFogCoordPointer(GLenum type, GLsizei stride, void const * pointer)} */
    public static void glFogCoordPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglFogCoordPointer(type, stride, memAddress(pointer));
    }

    // --- [ glMultiDrawArrays ] ---

    /** {@code void glMultiDrawArrays(GLenum mode, GLint const * first, GLsizei const * count, GLsizei drawcount)} */
    public static void nglMultiDrawArrays(int mode, long first, long count, int drawcount) {
        GL14C.nglMultiDrawArrays(mode, first, count, drawcount);
    }

    /** {@code void glMultiDrawArrays(GLenum mode, GLint const * first, GLsizei const * count, GLsizei drawcount)} */
    public static void glMultiDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint const *") IntBuffer first, @NativeType("GLsizei const *") IntBuffer count) {
        GL14C.glMultiDrawArrays(mode, first, count);
    }

    // --- [ glMultiDrawElements ] ---

    /** {@code void glMultiDrawElements(GLenum mode, GLsizei * count, GLenum type, void const ** indices, GLsizei drawcount)} */
    public static void nglMultiDrawElements(int mode, long count, int type, long indices, int drawcount) {
        GL14C.nglMultiDrawElements(mode, count, type, indices, drawcount);
    }

    /** {@code void glMultiDrawElements(GLenum mode, GLsizei * count, GLenum type, void const ** indices, GLsizei drawcount)} */
    public static void glMultiDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei *") IntBuffer count, @NativeType("GLenum") int type, @NativeType("void const **") PointerBuffer indices) {
        GL14C.glMultiDrawElements(mode, count, type, indices);
    }

    // --- [ glPointParameterf ] ---

    /** {@code void glPointParameterf(GLenum pname, GLfloat param)} */
    public static void glPointParameterf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        GL14C.glPointParameterf(pname, param);
    }

    // --- [ glPointParameteri ] ---

    /** {@code void glPointParameteri(GLenum pname, GLint param)} */
    public static void glPointParameteri(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        GL14C.glPointParameteri(pname, param);
    }

    // --- [ glPointParameterfv ] ---

    /** {@code void glPointParameterfv(GLenum pname, GLfloat const * params)} */
    public static void nglPointParameterfv(int pname, long params) {
        GL14C.nglPointParameterfv(pname, params);
    }

    /** {@code void glPointParameterfv(GLenum pname, GLfloat const * params)} */
    public static void glPointParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        GL14C.glPointParameterfv(pname, params);
    }

    // --- [ glPointParameteriv ] ---

    /** {@code void glPointParameteriv(GLenum pname, GLint const * params)} */
    public static void nglPointParameteriv(int pname, long params) {
        GL14C.nglPointParameteriv(pname, params);
    }

    /** {@code void glPointParameteriv(GLenum pname, GLint const * params)} */
    public static void glPointParameteriv(@NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        GL14C.glPointParameteriv(pname, params);
    }

    // --- [ glSecondaryColor3b ] ---

    /** {@code void glSecondaryColor3b(GLbyte red, GLbyte green, GLbyte blue)} */
    public static native void glSecondaryColor3b(@NativeType("GLbyte") byte red, @NativeType("GLbyte") byte green, @NativeType("GLbyte") byte blue);

    // --- [ glSecondaryColor3s ] ---

    /** {@code void glSecondaryColor3s(GLshort red, GLshort green, GLshort blue)} */
    public static native void glSecondaryColor3s(@NativeType("GLshort") short red, @NativeType("GLshort") short green, @NativeType("GLshort") short blue);

    // --- [ glSecondaryColor3i ] ---

    /** {@code void glSecondaryColor3i(GLint red, GLint green, GLint blue)} */
    public static native void glSecondaryColor3i(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue);

    // --- [ glSecondaryColor3f ] ---

    /** {@code void glSecondaryColor3f(GLfloat red, GLfloat green, GLfloat blue)} */
    public static native void glSecondaryColor3f(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue);

    // --- [ glSecondaryColor3d ] ---

    /** {@code void glSecondaryColor3d(GLdouble red, GLdouble green, GLdouble blue)} */
    public static native void glSecondaryColor3d(@NativeType("GLdouble") double red, @NativeType("GLdouble") double green, @NativeType("GLdouble") double blue);

    // --- [ glSecondaryColor3ub ] ---

    /** {@code void glSecondaryColor3ub(GLubyte red, GLubyte green, GLubyte blue)} */
    public static native void glSecondaryColor3ub(@NativeType("GLubyte") byte red, @NativeType("GLubyte") byte green, @NativeType("GLubyte") byte blue);

    // --- [ glSecondaryColor3us ] ---

    /** {@code void glSecondaryColor3us(GLushort red, GLushort green, GLushort blue)} */
    public static native void glSecondaryColor3us(@NativeType("GLushort") short red, @NativeType("GLushort") short green, @NativeType("GLushort") short blue);

    // --- [ glSecondaryColor3ui ] ---

    /** {@code void glSecondaryColor3ui(GLint red, GLint green, GLint blue)} */
    public static native void glSecondaryColor3ui(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue);

    // --- [ glSecondaryColor3bv ] ---

    /** {@code void glSecondaryColor3bv(GLbyte const * v)} */
    public static native void nglSecondaryColor3bv(long v);

    /** {@code void glSecondaryColor3bv(GLbyte const * v)} */
    public static void glSecondaryColor3bv(@NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3bv(memAddress(v));
    }

    // --- [ glSecondaryColor3sv ] ---

    /** {@code void glSecondaryColor3sv(GLshort const * v)} */
    public static native void nglSecondaryColor3sv(long v);

    /** {@code void glSecondaryColor3sv(GLshort const * v)} */
    public static void glSecondaryColor3sv(@NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3sv(memAddress(v));
    }

    // --- [ glSecondaryColor3iv ] ---

    /** {@code void glSecondaryColor3iv(GLint const * v)} */
    public static native void nglSecondaryColor3iv(long v);

    /** {@code void glSecondaryColor3iv(GLint const * v)} */
    public static void glSecondaryColor3iv(@NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3iv(memAddress(v));
    }

    // --- [ glSecondaryColor3fv ] ---

    /** {@code void glSecondaryColor3fv(GLfloat const * v)} */
    public static native void nglSecondaryColor3fv(long v);

    /** {@code void glSecondaryColor3fv(GLfloat const * v)} */
    public static void glSecondaryColor3fv(@NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3fv(memAddress(v));
    }

    // --- [ glSecondaryColor3dv ] ---

    /** {@code void glSecondaryColor3dv(GLdouble const * v)} */
    public static native void nglSecondaryColor3dv(long v);

    /** {@code void glSecondaryColor3dv(GLdouble const * v)} */
    public static void glSecondaryColor3dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3dv(memAddress(v));
    }

    // --- [ glSecondaryColor3ubv ] ---

    /** {@code void glSecondaryColor3ubv(GLubyte const * v)} */
    public static native void nglSecondaryColor3ubv(long v);

    /** {@code void glSecondaryColor3ubv(GLubyte const * v)} */
    public static void glSecondaryColor3ubv(@NativeType("GLubyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3ubv(memAddress(v));
    }

    // --- [ glSecondaryColor3usv ] ---

    /** {@code void glSecondaryColor3usv(GLushort const * v)} */
    public static native void nglSecondaryColor3usv(long v);

    /** {@code void glSecondaryColor3usv(GLushort const * v)} */
    public static void glSecondaryColor3usv(@NativeType("GLushort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3usv(memAddress(v));
    }

    // --- [ glSecondaryColor3uiv ] ---

    /** {@code void glSecondaryColor3uiv(GLuint const * v)} */
    public static native void nglSecondaryColor3uiv(long v);

    /** {@code void glSecondaryColor3uiv(GLuint const * v)} */
    public static void glSecondaryColor3uiv(@NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3uiv(memAddress(v));
    }

    // --- [ glSecondaryColorPointer ] ---

    /** {@code void glSecondaryColorPointer(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static native void nglSecondaryColorPointer(int size, int type, int stride, long pointer);

    /** {@code void glSecondaryColorPointer(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glSecondaryColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglSecondaryColorPointer(size, type, stride, memAddress(pointer));
    }

    /** {@code void glSecondaryColorPointer(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glSecondaryColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglSecondaryColorPointer(size, type, stride, pointer);
    }

    /** {@code void glSecondaryColorPointer(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glSecondaryColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglSecondaryColorPointer(size, type, stride, memAddress(pointer));
    }

    /** {@code void glSecondaryColorPointer(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glSecondaryColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglSecondaryColorPointer(size, type, stride, memAddress(pointer));
    }

    /** {@code void glSecondaryColorPointer(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glSecondaryColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglSecondaryColorPointer(size, type, stride, memAddress(pointer));
    }

    // --- [ glBlendFuncSeparate ] ---

    /** {@code void glBlendFuncSeparate(GLenum sfactorRGB, GLenum dfactorRGB, GLenum sfactorAlpha, GLenum dfactorAlpha)} */
    public static void glBlendFuncSeparate(@NativeType("GLenum") int sfactorRGB, @NativeType("GLenum") int dfactorRGB, @NativeType("GLenum") int sfactorAlpha, @NativeType("GLenum") int dfactorAlpha) {
        GL14C.glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
    }

    // --- [ glWindowPos2i ] ---

    /** {@code void glWindowPos2i(GLint x, GLint y)} */
    public static native void glWindowPos2i(@NativeType("GLint") int x, @NativeType("GLint") int y);

    // --- [ glWindowPos2s ] ---

    /** {@code void glWindowPos2s(GLshort x, GLshort y)} */
    public static native void glWindowPos2s(@NativeType("GLshort") short x, @NativeType("GLshort") short y);

    // --- [ glWindowPos2f ] ---

    /** {@code void glWindowPos2f(GLfloat x, GLfloat y)} */
    public static native void glWindowPos2f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y);

    // --- [ glWindowPos2d ] ---

    /** {@code void glWindowPos2d(GLdouble x, GLdouble y)} */
    public static native void glWindowPos2d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    // --- [ glWindowPos2iv ] ---

    /** {@code void glWindowPos2iv(GLint const * p)} */
    public static native void nglWindowPos2iv(long p);

    /** {@code void glWindowPos2iv(GLint const * p)} */
    public static void glWindowPos2iv(@NativeType("GLint const *") IntBuffer p) {
        if (CHECKS) {
            check(p, 2);
        }
        nglWindowPos2iv(memAddress(p));
    }

    // --- [ glWindowPos2sv ] ---

    /** {@code void glWindowPos2sv(GLshort const * p)} */
    public static native void nglWindowPos2sv(long p);

    /** {@code void glWindowPos2sv(GLshort const * p)} */
    public static void glWindowPos2sv(@NativeType("GLshort const *") ShortBuffer p) {
        if (CHECKS) {
            check(p, 2);
        }
        nglWindowPos2sv(memAddress(p));
    }

    // --- [ glWindowPos2fv ] ---

    /** {@code void glWindowPos2fv(GLfloat const * p)} */
    public static native void nglWindowPos2fv(long p);

    /** {@code void glWindowPos2fv(GLfloat const * p)} */
    public static void glWindowPos2fv(@NativeType("GLfloat const *") FloatBuffer p) {
        if (CHECKS) {
            check(p, 2);
        }
        nglWindowPos2fv(memAddress(p));
    }

    // --- [ glWindowPos2dv ] ---

    /** {@code void glWindowPos2dv(GLdouble const * p)} */
    public static native void nglWindowPos2dv(long p);

    /** {@code void glWindowPos2dv(GLdouble const * p)} */
    public static void glWindowPos2dv(@NativeType("GLdouble const *") DoubleBuffer p) {
        if (CHECKS) {
            check(p, 2);
        }
        nglWindowPos2dv(memAddress(p));
    }

    // --- [ glWindowPos3i ] ---

    /** {@code void glWindowPos3i(GLint x, GLint y, GLint z)} */
    public static native void glWindowPos3i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    // --- [ glWindowPos3s ] ---

    /** {@code void glWindowPos3s(GLshort x, GLshort y, GLshort z)} */
    public static native void glWindowPos3s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z);

    // --- [ glWindowPos3f ] ---

    /** {@code void glWindowPos3f(GLfloat x, GLfloat y, GLfloat z)} */
    public static native void glWindowPos3f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    // --- [ glWindowPos3d ] ---

    /** {@code void glWindowPos3d(GLdouble x, GLdouble y, GLdouble z)} */
    public static native void glWindowPos3d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glWindowPos3iv ] ---

    /** {@code void glWindowPos3iv(GLint const * p)} */
    public static native void nglWindowPos3iv(long p);

    /** {@code void glWindowPos3iv(GLint const * p)} */
    public static void glWindowPos3iv(@NativeType("GLint const *") IntBuffer p) {
        if (CHECKS) {
            check(p, 3);
        }
        nglWindowPos3iv(memAddress(p));
    }

    // --- [ glWindowPos3sv ] ---

    /** {@code void glWindowPos3sv(GLshort const * p)} */
    public static native void nglWindowPos3sv(long p);

    /** {@code void glWindowPos3sv(GLshort const * p)} */
    public static void glWindowPos3sv(@NativeType("GLshort const *") ShortBuffer p) {
        if (CHECKS) {
            check(p, 3);
        }
        nglWindowPos3sv(memAddress(p));
    }

    // --- [ glWindowPos3fv ] ---

    /** {@code void glWindowPos3fv(GLfloat const * p)} */
    public static native void nglWindowPos3fv(long p);

    /** {@code void glWindowPos3fv(GLfloat const * p)} */
    public static void glWindowPos3fv(@NativeType("GLfloat const *") FloatBuffer p) {
        if (CHECKS) {
            check(p, 3);
        }
        nglWindowPos3fv(memAddress(p));
    }

    // --- [ glWindowPos3dv ] ---

    /** {@code void glWindowPos3dv(GLdouble const * p)} */
    public static native void nglWindowPos3dv(long p);

    /** {@code void glWindowPos3dv(GLdouble const * p)} */
    public static void glWindowPos3dv(@NativeType("GLdouble const *") DoubleBuffer p) {
        if (CHECKS) {
            check(p, 3);
        }
        nglWindowPos3dv(memAddress(p));
    }

    /** {@code void glFogCoordfv(GLfloat const * coord)} */
    public static void glFogCoordfv(@NativeType("GLfloat const *") float[] coord) {
        long __functionAddress = GL.getICD().glFogCoordfv;
        if (CHECKS) {
            check(__functionAddress);
            check(coord, 1);
        }
        callPV(coord, __functionAddress);
    }

    /** {@code void glFogCoorddv(GLdouble const * coord)} */
    public static void glFogCoorddv(@NativeType("GLdouble const *") double[] coord) {
        long __functionAddress = GL.getICD().glFogCoorddv;
        if (CHECKS) {
            check(__functionAddress);
            check(coord, 1);
        }
        callPV(coord, __functionAddress);
    }

    /** {@code void glMultiDrawArrays(GLenum mode, GLint const * first, GLsizei const * count, GLsizei drawcount)} */
    public static void glMultiDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint const *") int[] first, @NativeType("GLsizei const *") int[] count) {
        GL14C.glMultiDrawArrays(mode, first, count);
    }

    /** {@code void glMultiDrawElements(GLenum mode, GLsizei * count, GLenum type, void const ** indices, GLsizei drawcount)} */
    public static void glMultiDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei *") int[] count, @NativeType("GLenum") int type, @NativeType("void const **") PointerBuffer indices) {
        GL14C.glMultiDrawElements(mode, count, type, indices);
    }

    /** {@code void glPointParameterfv(GLenum pname, GLfloat const * params)} */
    public static void glPointParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        GL14C.glPointParameterfv(pname, params);
    }

    /** {@code void glPointParameteriv(GLenum pname, GLint const * params)} */
    public static void glPointParameteriv(@NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL14C.glPointParameteriv(pname, params);
    }

    /** {@code void glSecondaryColor3sv(GLshort const * v)} */
    public static void glSecondaryColor3sv(@NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glSecondaryColor3iv(GLint const * v)} */
    public static void glSecondaryColor3iv(@NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glSecondaryColor3fv(GLfloat const * v)} */
    public static void glSecondaryColor3fv(@NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glSecondaryColor3dv(GLdouble const * v)} */
    public static void glSecondaryColor3dv(@NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glSecondaryColor3usv(GLushort const * v)} */
    public static void glSecondaryColor3usv(@NativeType("GLushort const *") short[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3usv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glSecondaryColor3uiv(GLuint const * v)} */
    public static void glSecondaryColor3uiv(@NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glWindowPos2iv(GLint const * p)} */
    public static void glWindowPos2iv(@NativeType("GLint const *") int[] p) {
        long __functionAddress = GL.getICD().glWindowPos2iv;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 2);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos2sv(GLshort const * p)} */
    public static void glWindowPos2sv(@NativeType("GLshort const *") short[] p) {
        long __functionAddress = GL.getICD().glWindowPos2sv;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 2);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos2fv(GLfloat const * p)} */
    public static void glWindowPos2fv(@NativeType("GLfloat const *") float[] p) {
        long __functionAddress = GL.getICD().glWindowPos2fv;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 2);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos2dv(GLdouble const * p)} */
    public static void glWindowPos2dv(@NativeType("GLdouble const *") double[] p) {
        long __functionAddress = GL.getICD().glWindowPos2dv;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 2);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos3iv(GLint const * p)} */
    public static void glWindowPos3iv(@NativeType("GLint const *") int[] p) {
        long __functionAddress = GL.getICD().glWindowPos3iv;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 3);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos3sv(GLshort const * p)} */
    public static void glWindowPos3sv(@NativeType("GLshort const *") short[] p) {
        long __functionAddress = GL.getICD().glWindowPos3sv;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 3);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos3fv(GLfloat const * p)} */
    public static void glWindowPos3fv(@NativeType("GLfloat const *") float[] p) {
        long __functionAddress = GL.getICD().glWindowPos3fv;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 3);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos3dv(GLdouble const * p)} */
    public static void glWindowPos3dv(@NativeType("GLdouble const *") double[] p) {
        long __functionAddress = GL.getICD().glWindowPos3dv;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 3);
        }
        callPV(p, __functionAddress);
    }

}