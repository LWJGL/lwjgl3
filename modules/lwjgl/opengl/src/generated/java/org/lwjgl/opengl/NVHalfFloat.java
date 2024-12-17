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

public class NVHalfFloat {

    static { GL.initialize(); }

    public static final int GL_HALF_FLOAT_NV = 0x140B;

    protected NVHalfFloat() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertex2hNV ] ---

    /** {@code void glVertex2hNV(GLhalfNV x, GLhalfNV y)} */
    public static native void glVertex2hNV(@NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y);

    // --- [ glVertex2hvNV ] ---

    /** {@code void glVertex2hvNV(GLhalfNV const * v)} */
    public static native void nglVertex2hvNV(long v);

    /** {@code void glVertex2hvNV(GLhalfNV const * v)} */
    public static void glVertex2hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertex2hvNV(memAddress(v));
    }

    // --- [ glVertex3hNV ] ---

    /** {@code void glVertex3hNV(GLhalfNV x, GLhalfNV y, GLhalfNV z)} */
    public static native void glVertex3hNV(@NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y, @NativeType("GLhalfNV") short z);

    // --- [ glVertex3hvNV ] ---

    /** {@code void glVertex3hvNV(GLhalfNV const * v)} */
    public static native void nglVertex3hvNV(long v);

    /** {@code void glVertex3hvNV(GLhalfNV const * v)} */
    public static void glVertex3hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertex3hvNV(memAddress(v));
    }

    // --- [ glVertex4hNV ] ---

    /** {@code void glVertex4hNV(GLhalfNV x, GLhalfNV y, GLhalfNV z, GLhalfNV w)} */
    public static native void glVertex4hNV(@NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y, @NativeType("GLhalfNV") short z, @NativeType("GLhalfNV") short w);

    // --- [ glVertex4hvNV ] ---

    /** {@code void glVertex4hvNV(GLhalfNV const * v)} */
    public static native void nglVertex4hvNV(long v);

    /** {@code void glVertex4hvNV(GLhalfNV const * v)} */
    public static void glVertex4hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertex4hvNV(memAddress(v));
    }

    // --- [ glNormal3hNV ] ---

    /** {@code void glNormal3hNV(GLhalfNV nx, GLhalfNV ny, GLhalfNV nz)} */
    public static native void glNormal3hNV(@NativeType("GLhalfNV") short nx, @NativeType("GLhalfNV") short ny, @NativeType("GLhalfNV") short nz);

    // --- [ glNormal3hvNV ] ---

    /** {@code void glNormal3hvNV(GLhalfNV const * v)} */
    public static native void nglNormal3hvNV(long v);

    /** {@code void glNormal3hvNV(GLhalfNV const * v)} */
    public static void glNormal3hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglNormal3hvNV(memAddress(v));
    }

    // --- [ glColor3hNV ] ---

    /** {@code void glColor3hNV(GLhalfNV red, GLhalfNV green, GLhalfNV blue)} */
    public static native void glColor3hNV(@NativeType("GLhalfNV") short red, @NativeType("GLhalfNV") short green, @NativeType("GLhalfNV") short blue);

    // --- [ glColor3hvNV ] ---

    /** {@code void glColor3hvNV(GLhalfNV const * v)} */
    public static native void nglColor3hvNV(long v);

    /** {@code void glColor3hvNV(GLhalfNV const * v)} */
    public static void glColor3hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglColor3hvNV(memAddress(v));
    }

    // --- [ glColor4hNV ] ---

    /** {@code void glColor4hNV(GLhalfNV red, GLhalfNV green, GLhalfNV blue, GLhalfNV alpha)} */
    public static native void glColor4hNV(@NativeType("GLhalfNV") short red, @NativeType("GLhalfNV") short green, @NativeType("GLhalfNV") short blue, @NativeType("GLhalfNV") short alpha);

    // --- [ glColor4hvNV ] ---

    /** {@code void glColor4hvNV(GLhalfNV const * v)} */
    public static native void nglColor4hvNV(long v);

    /** {@code void glColor4hvNV(GLhalfNV const * v)} */
    public static void glColor4hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglColor4hvNV(memAddress(v));
    }

    // --- [ glTexCoord1hNV ] ---

    /** {@code void glTexCoord1hNV(GLhalfNV s)} */
    public static native void glTexCoord1hNV(@NativeType("GLhalfNV") short s);

    // --- [ glTexCoord1hvNV ] ---

    /** {@code void glTexCoord1hvNV(GLhalfNV const * v)} */
    public static native void nglTexCoord1hvNV(long v);

    /** {@code void glTexCoord1hvNV(GLhalfNV const * v)} */
    public static void glTexCoord1hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglTexCoord1hvNV(memAddress(v));
    }

    // --- [ glTexCoord2hNV ] ---

    /** {@code void glTexCoord2hNV(GLhalfNV s, GLhalfNV t)} */
    public static native void glTexCoord2hNV(@NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t);

    // --- [ glTexCoord2hvNV ] ---

    /** {@code void glTexCoord2hvNV(GLhalfNV const * v)} */
    public static native void nglTexCoord2hvNV(long v);

    /** {@code void glTexCoord2hvNV(GLhalfNV const * v)} */
    public static void glTexCoord2hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglTexCoord2hvNV(memAddress(v));
    }

    // --- [ glTexCoord3hNV ] ---

    /** {@code void glTexCoord3hNV(GLhalfNV s, GLhalfNV t, GLhalfNV r)} */
    public static native void glTexCoord3hNV(@NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t, @NativeType("GLhalfNV") short r);

    // --- [ glTexCoord3hvNV ] ---

    /** {@code void glTexCoord3hvNV(GLhalfNV const * v)} */
    public static native void nglTexCoord3hvNV(long v);

    /** {@code void glTexCoord3hvNV(GLhalfNV const * v)} */
    public static void glTexCoord3hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglTexCoord3hvNV(memAddress(v));
    }

    // --- [ glTexCoord4hNV ] ---

    /** {@code void glTexCoord4hNV(GLhalfNV s, GLhalfNV t, GLhalfNV r, GLhalfNV q)} */
    public static native void glTexCoord4hNV(@NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t, @NativeType("GLhalfNV") short r, @NativeType("GLhalfNV") short q);

    // --- [ glTexCoord4hvNV ] ---

    /** {@code void glTexCoord4hvNV(GLhalfNV const * v)} */
    public static native void nglTexCoord4hvNV(long v);

    /** {@code void glTexCoord4hvNV(GLhalfNV const * v)} */
    public static void glTexCoord4hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglTexCoord4hvNV(memAddress(v));
    }

    // --- [ glMultiTexCoord1hNV ] ---

    /** {@code void glMultiTexCoord1hNV(GLenum target, GLhalfNV s)} */
    public static native void glMultiTexCoord1hNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV") short s);

    // --- [ glMultiTexCoord1hvNV ] ---

    /** {@code void glMultiTexCoord1hvNV(GLenum target, GLhalfNV const * v)} */
    public static native void nglMultiTexCoord1hvNV(int target, long v);

    /** {@code void glMultiTexCoord1hvNV(GLenum target, GLhalfNV const * v)} */
    public static void glMultiTexCoord1hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1hvNV(target, memAddress(v));
    }

    // --- [ glMultiTexCoord2hNV ] ---

    /** {@code void glMultiTexCoord2hNV(GLenum target, GLhalfNV s, GLhalfNV t)} */
    public static native void glMultiTexCoord2hNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t);

    // --- [ glMultiTexCoord2hvNV ] ---

    /** {@code void glMultiTexCoord2hvNV(GLenum target, GLhalfNV const * v)} */
    public static native void nglMultiTexCoord2hvNV(int target, long v);

    /** {@code void glMultiTexCoord2hvNV(GLenum target, GLhalfNV const * v)} */
    public static void glMultiTexCoord2hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2hvNV(target, memAddress(v));
    }

    // --- [ glMultiTexCoord3hNV ] ---

    /** {@code void glMultiTexCoord3hNV(GLenum target, GLhalfNV s, GLhalfNV t, GLhalfNV r)} */
    public static native void glMultiTexCoord3hNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t, @NativeType("GLhalfNV") short r);

    // --- [ glMultiTexCoord3hvNV ] ---

    /** {@code void glMultiTexCoord3hvNV(GLenum target, GLhalfNV const * v)} */
    public static native void nglMultiTexCoord3hvNV(int target, long v);

    /** {@code void glMultiTexCoord3hvNV(GLenum target, GLhalfNV const * v)} */
    public static void glMultiTexCoord3hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3hvNV(target, memAddress(v));
    }

    // --- [ glMultiTexCoord4hNV ] ---

    /** {@code void glMultiTexCoord4hNV(GLenum target, GLhalfNV s, GLhalfNV t, GLhalfNV r, GLhalfNV q)} */
    public static native void glMultiTexCoord4hNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t, @NativeType("GLhalfNV") short r, @NativeType("GLhalfNV") short q);

    // --- [ glMultiTexCoord4hvNV ] ---

    /** {@code void glMultiTexCoord4hvNV(GLenum target, GLhalfNV const * v)} */
    public static native void nglMultiTexCoord4hvNV(int target, long v);

    /** {@code void glMultiTexCoord4hvNV(GLenum target, GLhalfNV const * v)} */
    public static void glMultiTexCoord4hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4hvNV(target, memAddress(v));
    }

    // --- [ glFogCoordhNV ] ---

    /** {@code void glFogCoordhNV(GLhalfNV fog)} */
    public static native void glFogCoordhNV(@NativeType("GLhalfNV") short fog);

    // --- [ glFogCoordhvNV ] ---

    /** {@code void glFogCoordhvNV(GLhalfNV const * fog)} */
    public static native void nglFogCoordhvNV(long fog);

    /** {@code void glFogCoordhvNV(GLhalfNV const * fog)} */
    public static void glFogCoordhvNV(@NativeType("GLhalfNV const *") ShortBuffer fog) {
        if (CHECKS) {
            check(fog, 1);
        }
        nglFogCoordhvNV(memAddress(fog));
    }

    // --- [ glSecondaryColor3hNV ] ---

    /** {@code void glSecondaryColor3hNV(GLhalfNV red, GLhalfNV green, GLhalfNV blue)} */
    public static native void glSecondaryColor3hNV(@NativeType("GLhalfNV") short red, @NativeType("GLhalfNV") short green, @NativeType("GLhalfNV") short blue);

    // --- [ glSecondaryColor3hvNV ] ---

    /** {@code void glSecondaryColor3hvNV(GLhalfNV const * v)} */
    public static native void nglSecondaryColor3hvNV(long v);

    /** {@code void glSecondaryColor3hvNV(GLhalfNV const * v)} */
    public static void glSecondaryColor3hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3hvNV(memAddress(v));
    }

    // --- [ glVertexWeighthNV ] ---

    /** {@code void glVertexWeighthNV(GLhalfNV weight)} */
    public static native void glVertexWeighthNV(@NativeType("GLhalfNV") short weight);

    // --- [ glVertexWeighthvNV ] ---

    /** {@code void glVertexWeighthvNV(GLhalfNV const * weight)} */
    public static native void nglVertexWeighthvNV(long weight);

    /** {@code void glVertexWeighthvNV(GLhalfNV const * weight)} */
    public static void glVertexWeighthvNV(@NativeType("GLhalfNV const *") ShortBuffer weight) {
        if (CHECKS) {
            check(weight, 1);
        }
        nglVertexWeighthvNV(memAddress(weight));
    }

    // --- [ glVertexAttrib1hNV ] ---

    /** {@code void glVertexAttrib1hNV(GLuint index, GLhalfNV x)} */
    public static native void glVertexAttrib1hNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV") short x);

    // --- [ glVertexAttrib1hvNV ] ---

    /** {@code void glVertexAttrib1hvNV(GLuint index, GLhalfNV const * v)} */
    public static native void nglVertexAttrib1hvNV(int index, long v);

    /** {@code void glVertexAttrib1hvNV(GLuint index, GLhalfNV const * v)} */
    public static void glVertexAttrib1hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttrib1hvNV(index, memAddress(v));
    }

    // --- [ glVertexAttrib2hNV ] ---

    /** {@code void glVertexAttrib2hNV(GLuint index, GLhalfNV x, GLhalfNV y)} */
    public static native void glVertexAttrib2hNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y);

    // --- [ glVertexAttrib2hvNV ] ---

    /** {@code void glVertexAttrib2hvNV(GLuint index, GLhalfNV const * v)} */
    public static native void nglVertexAttrib2hvNV(int index, long v);

    /** {@code void glVertexAttrib2hvNV(GLuint index, GLhalfNV const * v)} */
    public static void glVertexAttrib2hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttrib2hvNV(index, memAddress(v));
    }

    // --- [ glVertexAttrib3hNV ] ---

    /** {@code void glVertexAttrib3hNV(GLuint index, GLhalfNV x, GLhalfNV y, GLhalfNV z)} */
    public static native void glVertexAttrib3hNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y, @NativeType("GLhalfNV") short z);

    // --- [ glVertexAttrib3hvNV ] ---

    /** {@code void glVertexAttrib3hvNV(GLuint index, GLhalfNV const * v)} */
    public static native void nglVertexAttrib3hvNV(int index, long v);

    /** {@code void glVertexAttrib3hvNV(GLuint index, GLhalfNV const * v)} */
    public static void glVertexAttrib3hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttrib3hvNV(index, memAddress(v));
    }

    // --- [ glVertexAttrib4hNV ] ---

    /** {@code void glVertexAttrib4hNV(GLuint index, GLhalfNV x, GLhalfNV y, GLhalfNV z, GLhalfNV w)} */
    public static native void glVertexAttrib4hNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y, @NativeType("GLhalfNV") short z, @NativeType("GLhalfNV") short w);

    // --- [ glVertexAttrib4hvNV ] ---

    /** {@code void glVertexAttrib4hvNV(GLuint index, GLhalfNV const * v)} */
    public static native void nglVertexAttrib4hvNV(int index, long v);

    /** {@code void glVertexAttrib4hvNV(GLuint index, GLhalfNV const * v)} */
    public static void glVertexAttrib4hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4hvNV(index, memAddress(v));
    }

    // --- [ glVertexAttribs1hvNV ] ---

    /** {@code void glVertexAttribs1hvNV(GLuint index, GLsizei n, GLhalfNV const * v)} */
    public static native void nglVertexAttribs1hvNV(int index, int n, long v);

    /** {@code void glVertexAttribs1hvNV(GLuint index, GLsizei n, GLhalfNV const * v)} */
    public static void glVertexAttribs1hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        nglVertexAttribs1hvNV(index, v.remaining(), memAddress(v));
    }

    // --- [ glVertexAttribs2hvNV ] ---

    /** {@code void glVertexAttribs2hvNV(GLuint index, GLsizei n, GLhalfNV const * v)} */
    public static native void nglVertexAttribs2hvNV(int index, int n, long v);

    /** {@code void glVertexAttribs2hvNV(GLuint index, GLsizei n, GLhalfNV const * v)} */
    public static void glVertexAttribs2hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        nglVertexAttribs2hvNV(index, v.remaining() >> 1, memAddress(v));
    }

    // --- [ glVertexAttribs3hvNV ] ---

    /** {@code void glVertexAttribs3hvNV(GLuint index, GLsizei n, GLhalfNV const * v)} */
    public static native void nglVertexAttribs3hvNV(int index, int n, long v);

    /** {@code void glVertexAttribs3hvNV(GLuint index, GLsizei n, GLhalfNV const * v)} */
    public static void glVertexAttribs3hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        nglVertexAttribs3hvNV(index, v.remaining() / 3, memAddress(v));
    }

    // --- [ glVertexAttribs4hvNV ] ---

    /** {@code void glVertexAttribs4hvNV(GLuint index, GLsizei n, GLhalfNV const * v)} */
    public static native void nglVertexAttribs4hvNV(int index, int n, long v);

    /** {@code void glVertexAttribs4hvNV(GLuint index, GLsizei n, GLhalfNV const * v)} */
    public static void glVertexAttribs4hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        nglVertexAttribs4hvNV(index, v.remaining() >> 2, memAddress(v));
    }

    /** {@code void glVertex2hvNV(GLhalfNV const * v)} */
    public static void glVertex2hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertex2hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glVertex3hvNV(GLhalfNV const * v)} */
    public static void glVertex3hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertex3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glVertex4hvNV(GLhalfNV const * v)} */
    public static void glVertex4hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertex4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glNormal3hvNV(GLhalfNV const * v)} */
    public static void glNormal3hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glNormal3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glColor3hvNV(GLhalfNV const * v)} */
    public static void glColor3hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glColor3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glColor4hvNV(GLhalfNV const * v)} */
    public static void glColor4hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glColor4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glTexCoord1hvNV(GLhalfNV const * v)} */
    public static void glTexCoord1hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glTexCoord1hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glTexCoord2hvNV(GLhalfNV const * v)} */
    public static void glTexCoord2hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glTexCoord2hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glTexCoord3hvNV(GLhalfNV const * v)} */
    public static void glTexCoord3hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glTexCoord3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glTexCoord4hvNV(GLhalfNV const * v)} */
    public static void glTexCoord4hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glTexCoord4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glMultiTexCoord1hvNV(GLenum target, GLhalfNV const * v)} */
    public static void glMultiTexCoord1hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(target, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord2hvNV(GLenum target, GLhalfNV const * v)} */
    public static void glMultiTexCoord2hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(target, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord3hvNV(GLenum target, GLhalfNV const * v)} */
    public static void glMultiTexCoord3hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(target, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord4hvNV(GLenum target, GLhalfNV const * v)} */
    public static void glMultiTexCoord4hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(target, v, __functionAddress);
    }

    /** {@code void glFogCoordhvNV(GLhalfNV const * fog)} */
    public static void glFogCoordhvNV(@NativeType("GLhalfNV const *") short[] fog) {
        long __functionAddress = GL.getICD().glFogCoordhvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(fog, 1);
        }
        callPV(fog, __functionAddress);
    }

    /** {@code void glSecondaryColor3hvNV(GLhalfNV const * v)} */
    public static void glSecondaryColor3hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glVertexWeighthvNV(GLhalfNV const * weight)} */
    public static void glVertexWeighthvNV(@NativeType("GLhalfNV const *") short[] weight) {
        long __functionAddress = GL.getICD().glVertexWeighthvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(weight, 1);
        }
        callPV(weight, __functionAddress);
    }

    /** {@code void glVertexAttrib1hvNV(GLuint index, GLhalfNV const * v)} */
    public static void glVertexAttrib1hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib1hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib2hvNV(GLuint index, GLhalfNV const * v)} */
    public static void glVertexAttrib2hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib2hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib3hvNV(GLuint index, GLhalfNV const * v)} */
    public static void glVertexAttrib3hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4hvNV(GLuint index, GLhalfNV const * v)} */
    public static void glVertexAttrib4hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribs1hvNV(GLuint index, GLsizei n, GLhalfNV const * v)} */
    public static void glVertexAttribs1hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribs1hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v.length, v, __functionAddress);
    }

    /** {@code void glVertexAttribs2hvNV(GLuint index, GLsizei n, GLhalfNV const * v)} */
    public static void glVertexAttribs2hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribs2hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v.length >> 1, v, __functionAddress);
    }

    /** {@code void glVertexAttribs3hvNV(GLuint index, GLsizei n, GLhalfNV const * v)} */
    public static void glVertexAttribs3hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribs3hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v.length / 3, v, __functionAddress);
    }

    /** {@code void glVertexAttribs4hvNV(GLuint index, GLsizei n, GLhalfNV const * v)} */
    public static void glVertexAttribs4hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribs4hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v.length >> 2, v, __functionAddress);
    }

}