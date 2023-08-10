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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_multitexture.txt">ARB_multitexture</a> extension.
 * 
 * <p>This extension allows application of multiple textures to a fragment in one rendering pass.</p>
 * 
 * <p>Promoted to core in {@link GL13 OpenGL 1.3}.</p>
 */
public class ARBMultitexture {

    static { GL.initialize(); }

    /** Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord. */
    public static final int
        GL_TEXTURE0_ARB  = 0x84C0,
        GL_TEXTURE1_ARB  = 0x84C1,
        GL_TEXTURE2_ARB  = 0x84C2,
        GL_TEXTURE3_ARB  = 0x84C3,
        GL_TEXTURE4_ARB  = 0x84C4,
        GL_TEXTURE5_ARB  = 0x84C5,
        GL_TEXTURE6_ARB  = 0x84C6,
        GL_TEXTURE7_ARB  = 0x84C7,
        GL_TEXTURE8_ARB  = 0x84C8,
        GL_TEXTURE9_ARB  = 0x84C9,
        GL_TEXTURE10_ARB = 0x84CA,
        GL_TEXTURE11_ARB = 0x84CB,
        GL_TEXTURE12_ARB = 0x84CC,
        GL_TEXTURE13_ARB = 0x84CD,
        GL_TEXTURE14_ARB = 0x84CE,
        GL_TEXTURE15_ARB = 0x84CF,
        GL_TEXTURE16_ARB = 0x84D0,
        GL_TEXTURE17_ARB = 0x84D1,
        GL_TEXTURE18_ARB = 0x84D2,
        GL_TEXTURE19_ARB = 0x84D3,
        GL_TEXTURE20_ARB = 0x84D4,
        GL_TEXTURE21_ARB = 0x84D5,
        GL_TEXTURE22_ARB = 0x84D6,
        GL_TEXTURE23_ARB = 0x84D7,
        GL_TEXTURE24_ARB = 0x84D8,
        GL_TEXTURE25_ARB = 0x84D9,
        GL_TEXTURE26_ARB = 0x84DA,
        GL_TEXTURE27_ARB = 0x84DB,
        GL_TEXTURE28_ARB = 0x84DC,
        GL_TEXTURE29_ARB = 0x84DD,
        GL_TEXTURE30_ARB = 0x84DE,
        GL_TEXTURE31_ARB = 0x84DF;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    public static final int
        GL_ACTIVE_TEXTURE_ARB        = 0x84E0,
        GL_CLIENT_ACTIVE_TEXTURE_ARB = 0x84E1,
        GL_MAX_TEXTURE_UNITS_ARB     = 0x84E2;

    protected ARBMultitexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glActiveTextureARB ] ---

    /**
     * Selects which texture unit subsequent texture state calls will affect. The number of texture units an implementation supports is implementation
     * dependent.
     *
     * @param texture which texture unit to make active. One of:<br><table><tr><td>{@link #GL_TEXTURE0_ARB TEXTURE0_ARB}</td><td>GL_TEXTURE[1-31]</td></tr></table>
     */
    public static native void glActiveTextureARB(@NativeType("GLenum") int texture);

    // --- [ glClientActiveTextureARB ] ---

    /**
     * Selects the vertex array client state parameters to be modified by the TexCoordPointer command and the array affected by EnableClientState and
     * DisableClientState with parameter TEXTURE_COORD_ARRAY.
     *
     * @param texture which texture coordinate array to make active. One of:<br><table><tr><td>{@link #GL_TEXTURE0_ARB TEXTURE0_ARB}</td><td>GL_TEXTURE[1-31]</td></tr></table>
     */
    public static native void glClientActiveTextureARB(@NativeType("GLenum") int texture);

    // --- [ glMultiTexCoord1fARB ] ---

    /**
     * Sets the current one-dimensional texture coordinate for the specified texture coordinate set. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     */
    public static native void glMultiTexCoord1fARB(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s);

    // --- [ glMultiTexCoord1sARB ] ---

    /**
     * Short version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     */
    public static native void glMultiTexCoord1sARB(@NativeType("GLenum") int texture, @NativeType("GLshort") short s);

    // --- [ glMultiTexCoord1iARB ] ---

    /**
     * Integer version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     */
    public static native void glMultiTexCoord1iARB(@NativeType("GLenum") int texture, @NativeType("GLint") int s);

    // --- [ glMultiTexCoord1dARB ] ---

    /**
     * Double version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     */
    public static native void glMultiTexCoord1dARB(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s);

    // --- [ glMultiTexCoord1fvARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord1fvARB MultiTexCoord1fvARB} */
    public static native void nglMultiTexCoord1fvARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord1fARB MultiTexCoord1fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord1fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1fvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord1svARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord1svARB MultiTexCoord1svARB} */
    public static native void nglMultiTexCoord1svARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord1sARB MultiTexCoord1sARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord1svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1svARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord1ivARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord1ivARB MultiTexCoord1ivARB} */
    public static native void nglMultiTexCoord1ivARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord1iARB MultiTexCoord1iARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord1ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1ivARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord1dvARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord1dvARB MultiTexCoord1dvARB} */
    public static native void nglMultiTexCoord1dvARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord1dARB MultiTexCoord1dARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord1dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1dvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord2fARB ] ---

    /**
     * Sets the current two-dimensional texture coordinate for the specified texture coordinate set. {@code r} is implicitly set to 0 and {@code q} to 1.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     * @param t       the t component of the current texture coordinates
     */
    public static native void glMultiTexCoord2fARB(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t);

    // --- [ glMultiTexCoord2sARB ] ---

    /**
     * Short version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     * @param t       the t component of the current texture coordinates
     */
    public static native void glMultiTexCoord2sARB(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t);

    // --- [ glMultiTexCoord2iARB ] ---

    /**
     * Integer version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     * @param t       the t component of the current texture coordinates
     */
    public static native void glMultiTexCoord2iARB(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t);

    // --- [ glMultiTexCoord2dARB ] ---

    /**
     * Double version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     * @param t       the t component of the current texture coordinates
     */
    public static native void glMultiTexCoord2dARB(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t);

    // --- [ glMultiTexCoord2fvARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord2fvARB MultiTexCoord2fvARB} */
    public static native void nglMultiTexCoord2fvARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord2fARB MultiTexCoord2fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord2fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2fvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord2svARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord2svARB MultiTexCoord2svARB} */
    public static native void nglMultiTexCoord2svARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord2sARB MultiTexCoord2sARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord2svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2svARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord2ivARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord2ivARB MultiTexCoord2ivARB} */
    public static native void nglMultiTexCoord2ivARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord2iARB MultiTexCoord2iARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord2ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2ivARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord2dvARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord2dvARB MultiTexCoord2dvARB} */
    public static native void nglMultiTexCoord2dvARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord2dARB MultiTexCoord2dARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord2dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2dvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord3fARB ] ---

    /**
     * Sets the current three-dimensional texture coordinate for the specified texture coordinate set. {@code q} is implicitly set to 1.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     * @param t       the t component of the current texture coordinates
     * @param r       the r component of the current texture coordinates
     */
    public static native void glMultiTexCoord3fARB(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r);

    // --- [ glMultiTexCoord3sARB ] ---

    /**
     * Short version of {@link #glMultiTexCoord3fARB MultiTexCoord3fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     * @param t       the t component of the current texture coordinates
     * @param r       the r component of the current texture coordinates
     */
    public static native void glMultiTexCoord3sARB(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r);

    // --- [ glMultiTexCoord3iARB ] ---

    /**
     * Integer version of {@link #glMultiTexCoord3fARB MultiTexCoord3fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     * @param t       the t component of the current texture coordinates
     * @param r       the r component of the current texture coordinates
     */
    public static native void glMultiTexCoord3iARB(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r);

    // --- [ glMultiTexCoord3dARB ] ---

    /**
     * Double version of {@link #glMultiTexCoord3fARB MultiTexCoord3fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     * @param t       the t component of the current texture coordinates
     * @param r       the r component of the current texture coordinates
     */
    public static native void glMultiTexCoord3dARB(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r);

    // --- [ glMultiTexCoord3fvARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord3fvARB MultiTexCoord3fvARB} */
    public static native void nglMultiTexCoord3fvARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord3fARB MultiTexCoord3fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord3fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3fvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord3svARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord3svARB MultiTexCoord3svARB} */
    public static native void nglMultiTexCoord3svARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord3sARB MultiTexCoord3sARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord3svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3svARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord3ivARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord3ivARB MultiTexCoord3ivARB} */
    public static native void nglMultiTexCoord3ivARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord3iARB MultiTexCoord3iARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord3ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3ivARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord3dvARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord3dvARB MultiTexCoord3dvARB} */
    public static native void nglMultiTexCoord3dvARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord3dARB MultiTexCoord3dARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord3dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3dvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord4fARB ] ---

    /**
     * Sets the current four-dimensional texture coordinate for the specified texture coordinate set.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     * @param t       the t component of the current texture coordinates
     * @param r       the r component of the current texture coordinates
     * @param q       the q component of the current texture coordinates
     */
    public static native void glMultiTexCoord4fARB(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r, @NativeType("GLfloat") float q);

    // --- [ glMultiTexCoord4sARB ] ---

    /**
     * Short version of {@link #glMultiTexCoord4fARB MultiTexCoord4fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     * @param t       the t component of the current texture coordinates
     * @param r       the r component of the current texture coordinates
     * @param q       the q component of the current texture coordinates
     */
    public static native void glMultiTexCoord4sARB(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r, @NativeType("GLshort") short q);

    // --- [ glMultiTexCoord4iARB ] ---

    /**
     * Integer version of {@link #glMultiTexCoord4fARB MultiTexCoord4fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     * @param t       the t component of the current texture coordinates
     * @param r       the r component of the current texture coordinates
     * @param q       the q component of the current texture coordinates
     */
    public static native void glMultiTexCoord4iARB(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r, @NativeType("GLint") int q);

    // --- [ glMultiTexCoord4dARB ] ---

    /**
     * Double version of {@link #glMultiTexCoord4fARB MultiTexCoord4fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param s       the s component of the current texture coordinates
     * @param t       the t component of the current texture coordinates
     * @param r       the r component of the current texture coordinates
     * @param q       the q component of the current texture coordinates
     */
    public static native void glMultiTexCoord4dARB(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r, @NativeType("GLdouble") double q);

    // --- [ glMultiTexCoord4fvARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord4fvARB MultiTexCoord4fvARB} */
    public static native void nglMultiTexCoord4fvARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord4fARB MultiTexCoord4fARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord4fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4fvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord4svARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord4svARB MultiTexCoord4svARB} */
    public static native void nglMultiTexCoord4svARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord4sARB MultiTexCoord4sARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord4svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4svARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord4ivARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord4ivARB MultiTexCoord4ivARB} */
    public static native void nglMultiTexCoord4ivARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord4iARB MultiTexCoord4iARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord4ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4ivARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord4dvARB ] ---

    /** Unsafe version of: {@link #glMultiTexCoord4dvARB MultiTexCoord4dvARB} */
    public static native void nglMultiTexCoord4dvARB(int texture, long v);

    /**
     * Pointer version of {@link #glMultiTexCoord4dARB MultiTexCoord4dARB}.
     *
     * @param texture the coordinate set to be modified
     * @param v       the texture coordinate buffer
     */
    public static void glMultiTexCoord4dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4dvARB(texture, memAddress(v));
    }

    /** Array version of: {@link #glMultiTexCoord1fvARB MultiTexCoord1fvARB} */
    public static void glMultiTexCoord1fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord1svARB MultiTexCoord1svARB} */
    public static void glMultiTexCoord1svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord1ivARB MultiTexCoord1ivARB} */
    public static void glMultiTexCoord1ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1ivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord1dvARB MultiTexCoord1dvARB} */
    public static void glMultiTexCoord1dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord2fvARB MultiTexCoord2fvARB} */
    public static void glMultiTexCoord2fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord2svARB MultiTexCoord2svARB} */
    public static void glMultiTexCoord2svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord2ivARB MultiTexCoord2ivARB} */
    public static void glMultiTexCoord2ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2ivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord2dvARB MultiTexCoord2dvARB} */
    public static void glMultiTexCoord2dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord3fvARB MultiTexCoord3fvARB} */
    public static void glMultiTexCoord3fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord3svARB MultiTexCoord3svARB} */
    public static void glMultiTexCoord3svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord3ivARB MultiTexCoord3ivARB} */
    public static void glMultiTexCoord3ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3ivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord3dvARB MultiTexCoord3dvARB} */
    public static void glMultiTexCoord3dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord4fvARB MultiTexCoord4fvARB} */
    public static void glMultiTexCoord4fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord4svARB MultiTexCoord4svARB} */
    public static void glMultiTexCoord4svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord4ivARB MultiTexCoord4ivARB} */
    public static void glMultiTexCoord4ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4ivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(texture, v, __functionAddress);
    }

    /** Array version of: {@link #glMultiTexCoord4dvARB MultiTexCoord4dvARB} */
    public static void glMultiTexCoord4dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(texture, v, __functionAddress);
    }

}