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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_secondary_color.txt">EXT_secondary_color</a> extension.
 * 
 * <p>This extension allows specifying the RGB components of the secondary color used in the Color Sum stage, instead of using the default (0,0,0,0) color.
 * It applies only in RGBA mode and when LIGHTING is disabled.</p>
 */
public class EXTSecondaryColor {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    public static final int GL_COLOR_SUM_EXT = 0x8458;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_CURRENT_SECONDARY_COLOR_EXT      = 0x8459,
        GL_SECONDARY_COLOR_ARRAY_SIZE_EXT   = 0x845A,
        GL_SECONDARY_COLOR_ARRAY_TYPE_EXT   = 0x845B,
        GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT = 0x845C;

    /** Accepted by the {@code pname} parameter of GetPointerv. */
    public static final int GL_SECONDARY_COLOR_ARRAY_POINTER_EXT = 0x845D;

    /** Accepted by the {@code array} parameter of EnableClientState and DisableClientState. */
    public static final int GL_SECONDARY_COLOR_ARRAY_EXT = 0x845E;

    protected EXTSecondaryColor() {
        throw new UnsupportedOperationException();
    }

    // --- [ glSecondaryColor3bEXT ] ---

    /**
     * Sets the R, G, and B components of the current secondary color.
     *
     * @param red   the red component of the current secondary color
     * @param green the green component of the current secondary color
     * @param blue  the blue component of the current secondary color
     */
    public static native void glSecondaryColor3bEXT(@NativeType("GLbyte") byte red, @NativeType("GLbyte") byte green, @NativeType("GLbyte") byte blue);

    // --- [ glSecondaryColor3sEXT ] ---

    /**
     * Short version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
     *
     * @param red   the red component of the current secondary color
     * @param green the green component of the current secondary color
     * @param blue  the blue component of the current secondary color
     */
    public static native void glSecondaryColor3sEXT(@NativeType("GLshort") short red, @NativeType("GLshort") short green, @NativeType("GLshort") short blue);

    // --- [ glSecondaryColor3iEXT ] ---

    /**
     * Integer version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
     *
     * @param red   the red component of the current secondary color
     * @param green the green component of the current secondary color
     * @param blue  the blue component of the current secondary color
     */
    public static native void glSecondaryColor3iEXT(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue);

    // --- [ glSecondaryColor3fEXT ] ---

    /**
     * Float version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
     *
     * @param red   the red component of the current secondary color
     * @param green the green component of the current secondary color
     * @param blue  the blue component of the current secondary color
     */
    public static native void glSecondaryColor3fEXT(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue);

    // --- [ glSecondaryColor3dEXT ] ---

    /**
     * Double version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
     *
     * @param red   the red component of the current secondary color
     * @param green the green component of the current secondary color
     * @param blue  the blue component of the current secondary color
     */
    public static native void glSecondaryColor3dEXT(@NativeType("GLdouble") double red, @NativeType("GLdouble") double green, @NativeType("GLdouble") double blue);

    // --- [ glSecondaryColor3ubEXT ] ---

    /**
     * Unsigned version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
     *
     * @param red   the red component of the current secondary color
     * @param green the green component of the current secondary color
     * @param blue  the blue component of the current secondary color
     */
    public static native void glSecondaryColor3ubEXT(@NativeType("GLubyte") byte red, @NativeType("GLubyte") byte green, @NativeType("GLubyte") byte blue);

    // --- [ glSecondaryColor3usEXT ] ---

    /**
     * Unsigned short version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
     *
     * @param red   the red component of the current secondary color
     * @param green the green component of the current secondary color
     * @param blue  the blue component of the current secondary color
     */
    public static native void glSecondaryColor3usEXT(@NativeType("GLushort") short red, @NativeType("GLushort") short green, @NativeType("GLushort") short blue);

    // --- [ glSecondaryColor3uiEXT ] ---

    /**
     * Unsigned int version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
     *
     * @param red   the red component of the current secondary color
     * @param green the green component of the current secondary color
     * @param blue  the blue component of the current secondary color
     */
    public static native void glSecondaryColor3uiEXT(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue);

    // --- [ glSecondaryColor3bvEXT ] ---

    /** Unsafe version of: {@link #glSecondaryColor3bvEXT SecondaryColor3bvEXT} */
    public static native void nglSecondaryColor3bvEXT(long v);

    /**
     * Pointer version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}.
     *
     * @param v the secondary color buffer
     */
    public static void glSecondaryColor3bvEXT(@NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3bvEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3svEXT ] ---

    /** Unsafe version of: {@link #glSecondaryColor3svEXT SecondaryColor3svEXT} */
    public static native void nglSecondaryColor3svEXT(long v);

    /**
     * Pointer version of {@link #glSecondaryColor3sEXT SecondaryColor3sEXT}.
     *
     * @param v the secondary color buffer
     */
    public static void glSecondaryColor3svEXT(@NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3svEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3ivEXT ] ---

    /** Unsafe version of: {@link #glSecondaryColor3ivEXT SecondaryColor3ivEXT} */
    public static native void nglSecondaryColor3ivEXT(long v);

    /**
     * Pointer version of {@link #glSecondaryColor3iEXT SecondaryColor3iEXT}.
     *
     * @param v the secondary color buffer
     */
    public static void glSecondaryColor3ivEXT(@NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3ivEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3fvEXT ] ---

    /** Unsafe version of: {@link #glSecondaryColor3fvEXT SecondaryColor3fvEXT} */
    public static native void nglSecondaryColor3fvEXT(long v);

    /**
     * Pointer version of {@link #glSecondaryColor3fEXT SecondaryColor3fEXT}.
     *
     * @param v the secondary color buffer
     */
    public static void glSecondaryColor3fvEXT(@NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3fvEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3dvEXT ] ---

    /** Unsafe version of: {@link #glSecondaryColor3dvEXT SecondaryColor3dvEXT} */
    public static native void nglSecondaryColor3dvEXT(long v);

    /**
     * Pointer version of {@link #glSecondaryColor3dEXT SecondaryColor3dEXT}.
     *
     * @param v the secondary color buffer
     */
    public static void glSecondaryColor3dvEXT(@NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3dvEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3ubvEXT ] ---

    /** Unsafe version of: {@link #glSecondaryColor3ubvEXT SecondaryColor3ubvEXT} */
    public static native void nglSecondaryColor3ubvEXT(long v);

    /**
     * Pointer version of {@link #glSecondaryColor3ubEXT SecondaryColor3ubEXT}.
     *
     * @param v the secondary color buffer
     */
    public static void glSecondaryColor3ubvEXT(@NativeType("GLubyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3ubvEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3usvEXT ] ---

    /** Unsafe version of: {@link #glSecondaryColor3usvEXT SecondaryColor3usvEXT} */
    public static native void nglSecondaryColor3usvEXT(long v);

    /**
     * Pointer version of {@link #glSecondaryColor3usEXT SecondaryColor3usEXT}.
     *
     * @param v the secondary color buffer
     */
    public static void glSecondaryColor3usvEXT(@NativeType("GLushort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3usvEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3uivEXT ] ---

    /** Unsafe version of: {@link #glSecondaryColor3uivEXT SecondaryColor3uivEXT} */
    public static native void nglSecondaryColor3uivEXT(long v);

    /**
     * Pointer version of {@link #glSecondaryColor3uiEXT SecondaryColor3uiEXT}.
     *
     * @param v the secondary color buffer
     */
    public static void glSecondaryColor3uivEXT(@NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3uivEXT(memAddress(v));
    }

    // --- [ glSecondaryColorPointerEXT ] ---

    /** Unsafe version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
    public static native void nglSecondaryColorPointerEXT(int size, int type, int stride, long pointer);

    /**
     * Specifies the location and organization of a secondary color array.
     *
     * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>
     * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the secondary color array data
     */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglSecondaryColorPointerEXT(size, type, stride, memAddress(pointer));
    }

    /**
     * Specifies the location and organization of a secondary color array.
     *
     * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>
     * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the secondary color array data
     */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglSecondaryColorPointerEXT(size, type, stride, pointer);
    }

    /**
     * Specifies the location and organization of a secondary color array.
     *
     * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>
     * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the secondary color array data
     */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglSecondaryColorPointerEXT(size, type, stride, memAddress(pointer));
    }

    /**
     * Specifies the location and organization of a secondary color array.
     *
     * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>
     * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the secondary color array data
     */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglSecondaryColorPointerEXT(size, type, stride, memAddress(pointer));
    }

    /**
     * Specifies the location and organization of a secondary color array.
     *
     * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>
     * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the secondary color array data
     */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglSecondaryColorPointerEXT(size, type, stride, memAddress(pointer));
    }

    /** Array version of: {@link #glSecondaryColor3svEXT SecondaryColor3svEXT} */
    public static void glSecondaryColor3svEXT(@NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3svEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glSecondaryColor3ivEXT SecondaryColor3ivEXT} */
    public static void glSecondaryColor3ivEXT(@NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3ivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glSecondaryColor3fvEXT SecondaryColor3fvEXT} */
    public static void glSecondaryColor3fvEXT(@NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glSecondaryColor3dvEXT SecondaryColor3dvEXT} */
    public static void glSecondaryColor3dvEXT(@NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glSecondaryColor3usvEXT SecondaryColor3usvEXT} */
    public static void glSecondaryColor3usvEXT(@NativeType("GLushort const *") short[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3usvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glSecondaryColor3uivEXT SecondaryColor3uivEXT} */
    public static void glSecondaryColor3uivEXT(@NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** Array version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        long __functionAddress = GL.getICD().glSecondaryColorPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }

    /** Array version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        long __functionAddress = GL.getICD().glSecondaryColorPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }

    /** Array version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") float[] pointer) {
        long __functionAddress = GL.getICD().glSecondaryColorPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }

}