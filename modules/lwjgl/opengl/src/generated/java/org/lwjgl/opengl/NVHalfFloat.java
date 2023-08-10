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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_half_float.txt">NV_half_float</a> extension.
 * 
 * <p>This extension introduces a new storage format and data type for half-precision (16-bit) floating-point quantities. The floating-point format is very
 * similar to the IEEE single-precision floating-point standard, except that it has only 5 exponent bits and 10 mantissa bits. Half-precision floats are
 * smaller than full precision floats and provide a larger dynamic range than similarly-sized normalized scalar data types.</p>
 * 
 * <p>This extension allows applications to use half-precision floating point data when specifying vertices or pixel data. It adds new commands to specify
 * vertex attributes using the new data type, and extends the existing vertex array and image specification commands to accept the new data type.</p>
 * 
 * <p>This storage format is also used to represent 16-bit components in the floating-point frame buffers, as defined in the NV_float_buffer extension.</p>
 */
public class NVHalfFloat {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, TexCoordPointer, FogCoordPointerEXT, SecondaryColorPointerEXT,
     * VertexWeightPointerEXT, VertexAttribPointerNV, DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D,
     * and GetTexImage.
     */
    public static final int GL_HALF_FLOAT_NV = 0x140B;

    protected NVHalfFloat() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertex2hNV ] ---

    public static native void glVertex2hNV(@NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y);

    // --- [ glVertex2hvNV ] ---

    public static native void nglVertex2hvNV(long v);

    public static void glVertex2hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertex2hvNV(memAddress(v));
    }

    // --- [ glVertex3hNV ] ---

    public static native void glVertex3hNV(@NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y, @NativeType("GLhalfNV") short z);

    // --- [ glVertex3hvNV ] ---

    public static native void nglVertex3hvNV(long v);

    public static void glVertex3hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertex3hvNV(memAddress(v));
    }

    // --- [ glVertex4hNV ] ---

    public static native void glVertex4hNV(@NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y, @NativeType("GLhalfNV") short z, @NativeType("GLhalfNV") short w);

    // --- [ glVertex4hvNV ] ---

    public static native void nglVertex4hvNV(long v);

    public static void glVertex4hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertex4hvNV(memAddress(v));
    }

    // --- [ glNormal3hNV ] ---

    public static native void glNormal3hNV(@NativeType("GLhalfNV") short nx, @NativeType("GLhalfNV") short ny, @NativeType("GLhalfNV") short nz);

    // --- [ glNormal3hvNV ] ---

    public static native void nglNormal3hvNV(long v);

    public static void glNormal3hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglNormal3hvNV(memAddress(v));
    }

    // --- [ glColor3hNV ] ---

    public static native void glColor3hNV(@NativeType("GLhalfNV") short red, @NativeType("GLhalfNV") short green, @NativeType("GLhalfNV") short blue);

    // --- [ glColor3hvNV ] ---

    public static native void nglColor3hvNV(long v);

    public static void glColor3hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglColor3hvNV(memAddress(v));
    }

    // --- [ glColor4hNV ] ---

    public static native void glColor4hNV(@NativeType("GLhalfNV") short red, @NativeType("GLhalfNV") short green, @NativeType("GLhalfNV") short blue, @NativeType("GLhalfNV") short alpha);

    // --- [ glColor4hvNV ] ---

    public static native void nglColor4hvNV(long v);

    public static void glColor4hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglColor4hvNV(memAddress(v));
    }

    // --- [ glTexCoord1hNV ] ---

    public static native void glTexCoord1hNV(@NativeType("GLhalfNV") short s);

    // --- [ glTexCoord1hvNV ] ---

    public static native void nglTexCoord1hvNV(long v);

    public static void glTexCoord1hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglTexCoord1hvNV(memAddress(v));
    }

    // --- [ glTexCoord2hNV ] ---

    public static native void glTexCoord2hNV(@NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t);

    // --- [ glTexCoord2hvNV ] ---

    public static native void nglTexCoord2hvNV(long v);

    public static void glTexCoord2hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglTexCoord2hvNV(memAddress(v));
    }

    // --- [ glTexCoord3hNV ] ---

    public static native void glTexCoord3hNV(@NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t, @NativeType("GLhalfNV") short r);

    // --- [ glTexCoord3hvNV ] ---

    public static native void nglTexCoord3hvNV(long v);

    public static void glTexCoord3hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglTexCoord3hvNV(memAddress(v));
    }

    // --- [ glTexCoord4hNV ] ---

    public static native void glTexCoord4hNV(@NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t, @NativeType("GLhalfNV") short r, @NativeType("GLhalfNV") short q);

    // --- [ glTexCoord4hvNV ] ---

    public static native void nglTexCoord4hvNV(long v);

    public static void glTexCoord4hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglTexCoord4hvNV(memAddress(v));
    }

    // --- [ glMultiTexCoord1hNV ] ---

    public static native void glMultiTexCoord1hNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV") short s);

    // --- [ glMultiTexCoord1hvNV ] ---

    public static native void nglMultiTexCoord1hvNV(int target, long v);

    public static void glMultiTexCoord1hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1hvNV(target, memAddress(v));
    }

    // --- [ glMultiTexCoord2hNV ] ---

    public static native void glMultiTexCoord2hNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t);

    // --- [ glMultiTexCoord2hvNV ] ---

    public static native void nglMultiTexCoord2hvNV(int target, long v);

    public static void glMultiTexCoord2hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2hvNV(target, memAddress(v));
    }

    // --- [ glMultiTexCoord3hNV ] ---

    public static native void glMultiTexCoord3hNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t, @NativeType("GLhalfNV") short r);

    // --- [ glMultiTexCoord3hvNV ] ---

    public static native void nglMultiTexCoord3hvNV(int target, long v);

    public static void glMultiTexCoord3hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3hvNV(target, memAddress(v));
    }

    // --- [ glMultiTexCoord4hNV ] ---

    public static native void glMultiTexCoord4hNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV") short s, @NativeType("GLhalfNV") short t, @NativeType("GLhalfNV") short r, @NativeType("GLhalfNV") short q);

    // --- [ glMultiTexCoord4hvNV ] ---

    public static native void nglMultiTexCoord4hvNV(int target, long v);

    public static void glMultiTexCoord4hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4hvNV(target, memAddress(v));
    }

    // --- [ glFogCoordhNV ] ---

    public static native void glFogCoordhNV(@NativeType("GLhalfNV") short fog);

    // --- [ glFogCoordhvNV ] ---

    public static native void nglFogCoordhvNV(long fog);

    public static void glFogCoordhvNV(@NativeType("GLhalfNV const *") ShortBuffer fog) {
        if (CHECKS) {
            check(fog, 1);
        }
        nglFogCoordhvNV(memAddress(fog));
    }

    // --- [ glSecondaryColor3hNV ] ---

    public static native void glSecondaryColor3hNV(@NativeType("GLhalfNV") short red, @NativeType("GLhalfNV") short green, @NativeType("GLhalfNV") short blue);

    // --- [ glSecondaryColor3hvNV ] ---

    public static native void nglSecondaryColor3hvNV(long v);

    public static void glSecondaryColor3hvNV(@NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3hvNV(memAddress(v));
    }

    // --- [ glVertexWeighthNV ] ---

    public static native void glVertexWeighthNV(@NativeType("GLhalfNV") short weight);

    // --- [ glVertexWeighthvNV ] ---

    public static native void nglVertexWeighthvNV(long weight);

    public static void glVertexWeighthvNV(@NativeType("GLhalfNV const *") ShortBuffer weight) {
        if (CHECKS) {
            check(weight, 1);
        }
        nglVertexWeighthvNV(memAddress(weight));
    }

    // --- [ glVertexAttrib1hNV ] ---

    public static native void glVertexAttrib1hNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV") short x);

    // --- [ glVertexAttrib1hvNV ] ---

    public static native void nglVertexAttrib1hvNV(int index, long v);

    public static void glVertexAttrib1hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttrib1hvNV(index, memAddress(v));
    }

    // --- [ glVertexAttrib2hNV ] ---

    public static native void glVertexAttrib2hNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y);

    // --- [ glVertexAttrib2hvNV ] ---

    public static native void nglVertexAttrib2hvNV(int index, long v);

    public static void glVertexAttrib2hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttrib2hvNV(index, memAddress(v));
    }

    // --- [ glVertexAttrib3hNV ] ---

    public static native void glVertexAttrib3hNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y, @NativeType("GLhalfNV") short z);

    // --- [ glVertexAttrib3hvNV ] ---

    public static native void nglVertexAttrib3hvNV(int index, long v);

    public static void glVertexAttrib3hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttrib3hvNV(index, memAddress(v));
    }

    // --- [ glVertexAttrib4hNV ] ---

    public static native void glVertexAttrib4hNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV") short x, @NativeType("GLhalfNV") short y, @NativeType("GLhalfNV") short z, @NativeType("GLhalfNV") short w);

    // --- [ glVertexAttrib4hvNV ] ---

    public static native void nglVertexAttrib4hvNV(int index, long v);

    public static void glVertexAttrib4hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4hvNV(index, memAddress(v));
    }

    // --- [ glVertexAttribs1hvNV ] ---

    public static native void nglVertexAttribs1hvNV(int index, int n, long v);

    public static void glVertexAttribs1hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        nglVertexAttribs1hvNV(index, v.remaining(), memAddress(v));
    }

    // --- [ glVertexAttribs2hvNV ] ---

    public static native void nglVertexAttribs2hvNV(int index, int n, long v);

    public static void glVertexAttribs2hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        nglVertexAttribs2hvNV(index, v.remaining() >> 1, memAddress(v));
    }

    // --- [ glVertexAttribs3hvNV ] ---

    public static native void nglVertexAttribs3hvNV(int index, int n, long v);

    public static void glVertexAttribs3hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        nglVertexAttribs3hvNV(index, v.remaining() / 3, memAddress(v));
    }

    // --- [ glVertexAttribs4hvNV ] ---

    public static native void nglVertexAttribs4hvNV(int index, int n, long v);

    public static void glVertexAttribs4hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") ShortBuffer v) {
        nglVertexAttribs4hvNV(index, v.remaining() >> 2, memAddress(v));
    }

    /** Array version of: {@link #glVertex2hvNV Vertex2hvNV} */
    public static void glVertex2hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertex2hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glVertex3hvNV Vertex3hvNV} */
    public static void glVertex3hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertex3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glVertex4hvNV Vertex4hvNV} */
    public static void glVertex4hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertex4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glNormal3hvNV Normal3hvNV} */
    public static void glNormal3hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glNormal3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glColor3hvNV Color3hvNV} */
    public static void glColor3hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glColor3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glColor4hvNV Color4hvNV} */
    public static void glColor4hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glColor4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glTexCoord1hvNV TexCoord1hvNV} */
    public static void glTexCoord1hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glTexCoord1hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glTexCoord2hvNV TexCoord2hvNV} */
    public static void glTexCoord2hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glTexCoord2hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glTexCoord3hvNV TexCoord3hvNV} */
    public static void glTexCoord3hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glTexCoord3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glTexCoord4hvNV TexCoord4hvNV} */
    public static void glTexCoord4hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glTexCoord4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord1hvNV MultiTexCoord1hvNV} */
    public static void glMultiTexCoord1hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(target, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord2hvNV MultiTexCoord2hvNV} */
    public static void glMultiTexCoord2hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(target, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord3hvNV MultiTexCoord3hvNV} */
    public static void glMultiTexCoord3hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(target, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord4hvNV MultiTexCoord4hvNV} */
    public static void glMultiTexCoord4hvNV(@NativeType("GLenum") int target, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(target, v, __functionAddress);
    }

    /** Array version of: {@link #glFogCoordhvNV FogCoordhvNV} */
    public static void glFogCoordhvNV(@NativeType("GLhalfNV const *") short[] fog) {
        long __functionAddress = GL.getICD().glFogCoordhvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(fog, 1);
        }
        callPV(fog, __functionAddress);
    }

    /** Array version of: {@link #glSecondaryColor3hvNV SecondaryColor3hvNV} */
    public static void glSecondaryColor3hvNV(@NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glVertexWeighthvNV VertexWeighthvNV} */
    public static void glVertexWeighthvNV(@NativeType("GLhalfNV const *") short[] weight) {
        long __functionAddress = GL.getICD().glVertexWeighthvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(weight, 1);
        }
        callPV(weight, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttrib1hvNV VertexAttrib1hvNV} */
    public static void glVertexAttrib1hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib1hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttrib2hvNV VertexAttrib2hvNV} */
    public static void glVertexAttrib2hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib2hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttrib3hvNV VertexAttrib3hvNV} */
    public static void glVertexAttrib3hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttrib4hvNV VertexAttrib4hvNV} */
    public static void glVertexAttrib4hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribs1hvNV VertexAttribs1hvNV} */
    public static void glVertexAttribs1hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribs1hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v.length, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribs2hvNV VertexAttribs2hvNV} */
    public static void glVertexAttribs2hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribs2hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v.length >> 1, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribs3hvNV VertexAttribs3hvNV} */
    public static void glVertexAttribs3hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribs3hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v.length / 3, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribs4hvNV VertexAttribs4hvNV} */
    public static void glVertexAttribs4hvNV(@NativeType("GLuint") int index, @NativeType("GLhalfNV const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribs4hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, v.length >> 2, v, __functionAddress);
    }

}