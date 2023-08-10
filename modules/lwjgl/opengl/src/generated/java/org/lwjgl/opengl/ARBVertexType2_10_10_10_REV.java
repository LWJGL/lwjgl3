/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_vertex_type_2_10_10_10_rev.txt">ARB_vertex_type_2_10_10_10_rev</a> extension.
 * 
 * <p>This extension adds two new vertex attribute data formats: a signed 2.10.10.10 and an unsigned 2.10.10.10 vertex data format. These vertex data formats
 * describe a 4 component stream which can be used to store normals or other attributes in a quantized form. Normals, tangents, binormals and other vertex
 * attributes can often be specified at reduced precision without introducing noticeable artifacts, reducing the amount of memory and memory bandwidth they consume.</p>
 * 
 * <p>Promoted to core in {@link GL33 OpenGL 3.3}.</p>
 */
public class ARBVertexType2_10_10_10_REV {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code type} parameter of VertexAttribPointer, VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, TexCoordPointer,
     * VertexAttribP{1234}ui, VertexP*, TexCoordP*, MultiTexCoordP*, NormalP3ui, ColorP*, SecondaryColorP and VertexAttribP*.
     */
    public static final int GL_INT_2_10_10_10_REV = 0x8D9F;

    protected ARBVertexType2_10_10_10_REV() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexP2ui ] ---

    /**
     * Packed component version of {@link GL11#glVertex2f Vertex2f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     */
    public static void glVertexP2ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value) {
        GL33.glVertexP2ui(type, value);
    }

    // --- [ glVertexP3ui ] ---

    /**
     * Packed component version of {@link GL11#glVertex3f Vertex3f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     */
    public static void glVertexP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value) {
        GL33.glVertexP3ui(type, value);
    }

    // --- [ glVertexP4ui ] ---

    /**
     * Packed component version of {@link GL11#glVertex4f Vertex4f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     */
    public static void glVertexP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value) {
        GL33.glVertexP4ui(type, value);
    }

    // --- [ glVertexP2uiv ] ---

    /** Unsafe version of: {@link #glVertexP2uiv VertexP2uiv} */
    public static void nglVertexP2uiv(int type, long value) {
        GL33.nglVertexP2uiv(type, value);
    }

    /**
     * Pointer version of {@link #glVertexP2ui VertexP2ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     */
    public static void glVertexP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer value) {
        GL33.glVertexP2uiv(type, value);
    }

    // --- [ glVertexP3uiv ] ---

    /** Unsafe version of: {@link #glVertexP3uiv VertexP3uiv} */
    public static void nglVertexP3uiv(int type, long value) {
        GL33.nglVertexP3uiv(type, value);
    }

    /**
     * Pointer version of {@link #glVertexP3ui VertexP3ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     */
    public static void glVertexP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer value) {
        GL33.glVertexP3uiv(type, value);
    }

    // --- [ glVertexP4uiv ] ---

    /** Unsafe version of: {@link #glVertexP4uiv VertexP4uiv} */
    public static void nglVertexP4uiv(int type, long value) {
        GL33.nglVertexP4uiv(type, value);
    }

    /**
     * Pointer version of {@link #glVertexP4ui VertexP4ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     */
    public static void glVertexP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer value) {
        GL33.glVertexP4uiv(type, value);
    }

    // --- [ glTexCoordP1ui ] ---

    /**
     * Packed component version of {@link GL11#glTexCoord1f TexCoord1f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glTexCoordP1ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        GL33.glTexCoordP1ui(type, coords);
    }

    // --- [ glTexCoordP2ui ] ---

    /**
     * Packed component version of {@link GL11#glTexCoord2f TexCoord2f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glTexCoordP2ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        GL33.glTexCoordP2ui(type, coords);
    }

    // --- [ glTexCoordP3ui ] ---

    /**
     * Packed component version of {@link GL11#glTexCoord3f TexCoord3f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glTexCoordP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        GL33.glTexCoordP3ui(type, coords);
    }

    // --- [ glTexCoordP4ui ] ---

    /**
     * Packed component version of {@link GL11#glTexCoord4f TexCoord4f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glTexCoordP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        GL33.glTexCoordP4ui(type, coords);
    }

    // --- [ glTexCoordP1uiv ] ---

    /** Unsafe version of: {@link #glTexCoordP1uiv TexCoordP1uiv} */
    public static void nglTexCoordP1uiv(int type, long coords) {
        GL33.nglTexCoordP1uiv(type, coords);
    }

    /**
     * Pointer version of {@link #glTexCoordP1ui TexCoordP1ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glTexCoordP1uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        GL33.glTexCoordP1uiv(type, coords);
    }

    // --- [ glTexCoordP2uiv ] ---

    /** Unsafe version of: {@link #glTexCoordP2uiv TexCoordP2uiv} */
    public static void nglTexCoordP2uiv(int type, long coords) {
        GL33.nglTexCoordP2uiv(type, coords);
    }

    /**
     * Pointer version of {@link #glTexCoordP2ui TexCoordP2ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glTexCoordP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        GL33.glTexCoordP2uiv(type, coords);
    }

    // --- [ glTexCoordP3uiv ] ---

    /** Unsafe version of: {@link #glTexCoordP3uiv TexCoordP3uiv} */
    public static void nglTexCoordP3uiv(int type, long coords) {
        GL33.nglTexCoordP3uiv(type, coords);
    }

    /**
     * Pointer version of {@link #glTexCoordP3ui TexCoordP3ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glTexCoordP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        GL33.glTexCoordP3uiv(type, coords);
    }

    // --- [ glTexCoordP4uiv ] ---

    /** Unsafe version of: {@link #glTexCoordP4uiv TexCoordP4uiv} */
    public static void nglTexCoordP4uiv(int type, long coords) {
        GL33.nglTexCoordP4uiv(type, coords);
    }

    /**
     * Pointer version of {@link #glTexCoordP4ui TexCoordP4ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glTexCoordP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        GL33.glTexCoordP4uiv(type, coords);
    }

    // --- [ glMultiTexCoordP1ui ] ---

    /**
     * Packed component version of {@link GL13#glMultiTexCoord1f MultiTexCoord1f}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
     * @param coords  the packed value
     */
    public static void glMultiTexCoordP1ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        GL33.glMultiTexCoordP1ui(texture, type, coords);
    }

    // --- [ glMultiTexCoordP2ui ] ---

    /**
     * Packed component version of {@link GL13#glMultiTexCoord2f MultiTexCoord2f}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
     * @param coords  the packed value
     */
    public static void glMultiTexCoordP2ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        GL33.glMultiTexCoordP2ui(texture, type, coords);
    }

    // --- [ glMultiTexCoordP3ui ] ---

    /**
     * Packed component version of {@link GL13#glMultiTexCoord3f MultiTexCoord3f}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
     * @param coords  the packed value
     */
    public static void glMultiTexCoordP3ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        GL33.glMultiTexCoordP3ui(texture, type, coords);
    }

    // --- [ glMultiTexCoordP4ui ] ---

    /**
     * Packed component version of {@link GL13#glMultiTexCoord4f MultiTexCoord4f}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
     * @param coords  the packed value
     */
    public static void glMultiTexCoordP4ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        GL33.glMultiTexCoordP4ui(texture, type, coords);
    }

    // --- [ glMultiTexCoordP1uiv ] ---

    /** Unsafe version of: {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv} */
    public static void nglMultiTexCoordP1uiv(int texture, int type, long coords) {
        GL33.nglMultiTexCoordP1uiv(texture, type, coords);
    }

    /**
     * Pointer version of {@link #glMultiTexCoordP1ui MultiTexCoordP1ui}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords  the packed value
     */
    public static void glMultiTexCoordP1uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        GL33.glMultiTexCoordP1uiv(texture, type, coords);
    }

    // --- [ glMultiTexCoordP2uiv ] ---

    /** Unsafe version of: {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv} */
    public static void nglMultiTexCoordP2uiv(int texture, int type, long coords) {
        GL33.nglMultiTexCoordP2uiv(texture, type, coords);
    }

    /**
     * Pointer version of {@link #glMultiTexCoordP2ui MultiTexCoordP2ui}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords  the packed value
     */
    public static void glMultiTexCoordP2uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        GL33.glMultiTexCoordP2uiv(texture, type, coords);
    }

    // --- [ glMultiTexCoordP3uiv ] ---

    /** Unsafe version of: {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv} */
    public static void nglMultiTexCoordP3uiv(int texture, int type, long coords) {
        GL33.nglMultiTexCoordP3uiv(texture, type, coords);
    }

    /**
     * Pointer version of {@link #glMultiTexCoordP3ui MultiTexCoordP3ui}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords  the packed value
     */
    public static void glMultiTexCoordP3uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        GL33.glMultiTexCoordP3uiv(texture, type, coords);
    }

    // --- [ glMultiTexCoordP4uiv ] ---

    /** Unsafe version of: {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv} */
    public static void nglMultiTexCoordP4uiv(int texture, int type, long coords) {
        GL33.nglMultiTexCoordP4uiv(texture, type, coords);
    }

    /**
     * Pointer version of {@link #glMultiTexCoordP4ui MultiTexCoordP4ui}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords  the packed value
     */
    public static void glMultiTexCoordP4uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        GL33.glMultiTexCoordP4uiv(texture, type, coords);
    }

    // --- [ glNormalP3ui ] ---

    /**
     * Packed component version of {@link GL11#glNormal3f Normal3f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glNormalP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        GL33.glNormalP3ui(type, coords);
    }

    // --- [ glNormalP3uiv ] ---

    /** Unsafe version of: {@link #glNormalP3uiv NormalP3uiv} */
    public static void nglNormalP3uiv(int type, long coords) {
        GL33.nglNormalP3uiv(type, coords);
    }

    /**
     * Pointer version {@link #glNormalP3ui NormalP3ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     */
    public static void glNormalP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        GL33.glNormalP3uiv(type, coords);
    }

    // --- [ glColorP3ui ] ---

    /**
     * Packed component version of {@link GL11#glColor3f Color3f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     */
    public static void glColorP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color) {
        GL33.glColorP3ui(type, color);
    }

    // --- [ glColorP4ui ] ---

    /**
     * Packed component version of {@link GL11#glColor4f Color4f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     */
    public static void glColorP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color) {
        GL33.glColorP4ui(type, color);
    }

    // --- [ glColorP3uiv ] ---

    /** Unsafe version of: {@link #glColorP3uiv ColorP3uiv} */
    public static void nglColorP3uiv(int type, long color) {
        GL33.nglColorP3uiv(type, color);
    }

    /**
     * Pointer version of {@link #glColorP3ui ColorP3ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     */
    public static void glColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer color) {
        GL33.glColorP3uiv(type, color);
    }

    // --- [ glColorP4uiv ] ---

    /** Unsafe version of: {@link #glColorP4uiv ColorP4uiv} */
    public static void nglColorP4uiv(int type, long color) {
        GL33.nglColorP4uiv(type, color);
    }

    /**
     * Pointer version of {@link #glColorP4ui ColorP4ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     */
    public static void glColorP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer color) {
        GL33.glColorP4uiv(type, color);
    }

    // --- [ glSecondaryColorP3ui ] ---

    /**
     * Packed component version of {@link GL14#glSecondaryColor3f SecondaryColor3f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     */
    public static void glSecondaryColorP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color) {
        GL33.glSecondaryColorP3ui(type, color);
    }

    // --- [ glSecondaryColorP3uiv ] ---

    /** Unsafe version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv} */
    public static void nglSecondaryColorP3uiv(int type, long color) {
        GL33.nglSecondaryColorP3uiv(type, color);
    }

    /**
     * Pointer version of {@link #glSecondaryColorP3ui SecondaryColorP3ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     */
    public static void glSecondaryColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer color) {
        GL33.glSecondaryColorP3uiv(type, color);
    }

    // --- [ glVertexAttribP1ui ] ---

    /**
     * Packed component version of {@link GL20C#glVertexAttrib1f VertexAttrib1f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static void glVertexAttribP1ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        GL33C.glVertexAttribP1ui(index, type, normalized, value);
    }

    // --- [ glVertexAttribP2ui ] ---

    /**
     * Packed component version of {@link GL20C#glVertexAttrib2f VertexAttrib2f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static void glVertexAttribP2ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        GL33C.glVertexAttribP2ui(index, type, normalized, value);
    }

    // --- [ glVertexAttribP3ui ] ---

    /**
     * Packed component version of {@link GL20C#glVertexAttrib3f VertexAttrib3f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static void glVertexAttribP3ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        GL33C.glVertexAttribP3ui(index, type, normalized, value);
    }

    // --- [ glVertexAttribP4ui ] ---

    /**
     * Packed component version of {@link GL20C#glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static void glVertexAttribP4ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        GL33C.glVertexAttribP4ui(index, type, normalized, value);
    }

    // --- [ glVertexAttribP1uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv} */
    public static void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value) {
        GL33C.nglVertexAttribP1uiv(index, type, normalized, value);
    }

    /**
     * Pointer version of {@link #glVertexAttribP1ui VertexAttribP1ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        GL33C.glVertexAttribP1uiv(index, type, normalized, value);
    }

    // --- [ glVertexAttribP2uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv} */
    public static void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value) {
        GL33C.nglVertexAttribP2uiv(index, type, normalized, value);
    }

    /**
     * Pointer version of {@link #glVertexAttribP2ui VertexAttribP2ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        GL33C.glVertexAttribP2uiv(index, type, normalized, value);
    }

    // --- [ glVertexAttribP3uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv} */
    public static void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value) {
        GL33C.nglVertexAttribP3uiv(index, type, normalized, value);
    }

    /**
     * Pointer version of {@link #glVertexAttribP3ui VertexAttribP3ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        GL33C.glVertexAttribP3uiv(index, type, normalized, value);
    }

    // --- [ glVertexAttribP4uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv} */
    public static void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value) {
        GL33C.nglVertexAttribP4uiv(index, type, normalized, value);
    }

    /**
     * Pointer version of {@link #glVertexAttribP4ui VertexAttribP4ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     */
    public static void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        GL33C.glVertexAttribP4uiv(index, type, normalized, value);
    }

    /** Array version of: {@link #glVertexP2uiv VertexP2uiv} */
    public static void glVertexP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] value) {
        GL33.glVertexP2uiv(type, value);
    }

    /** Array version of: {@link #glVertexP3uiv VertexP3uiv} */
    public static void glVertexP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] value) {
        GL33.glVertexP3uiv(type, value);
    }

    /** Array version of: {@link #glVertexP4uiv VertexP4uiv} */
    public static void glVertexP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] value) {
        GL33.glVertexP4uiv(type, value);
    }

    /** Array version of: {@link #glTexCoordP1uiv TexCoordP1uiv} */
    public static void glTexCoordP1uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        GL33.glTexCoordP1uiv(type, coords);
    }

    /** Array version of: {@link #glTexCoordP2uiv TexCoordP2uiv} */
    public static void glTexCoordP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        GL33.glTexCoordP2uiv(type, coords);
    }

    /** Array version of: {@link #glTexCoordP3uiv TexCoordP3uiv} */
    public static void glTexCoordP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        GL33.glTexCoordP3uiv(type, coords);
    }

    /** Array version of: {@link #glTexCoordP4uiv TexCoordP4uiv} */
    public static void glTexCoordP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        GL33.glTexCoordP4uiv(type, coords);
    }

    /** Array version of: {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv} */
    public static void glMultiTexCoordP1uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        GL33.glMultiTexCoordP1uiv(texture, type, coords);
    }

    /** Array version of: {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv} */
    public static void glMultiTexCoordP2uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        GL33.glMultiTexCoordP2uiv(texture, type, coords);
    }

    /** Array version of: {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv} */
    public static void glMultiTexCoordP3uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        GL33.glMultiTexCoordP3uiv(texture, type, coords);
    }

    /** Array version of: {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv} */
    public static void glMultiTexCoordP4uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        GL33.glMultiTexCoordP4uiv(texture, type, coords);
    }

    /** Array version of: {@link #glNormalP3uiv NormalP3uiv} */
    public static void glNormalP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        GL33.glNormalP3uiv(type, coords);
    }

    /** Array version of: {@link #glColorP3uiv ColorP3uiv} */
    public static void glColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] color) {
        GL33.glColorP3uiv(type, color);
    }

    /** Array version of: {@link #glColorP4uiv ColorP4uiv} */
    public static void glColorP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] color) {
        GL33.glColorP4uiv(type, color);
    }

    /** Array version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv} */
    public static void glSecondaryColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] color) {
        GL33.glSecondaryColorP3uiv(type, color);
    }

    /** Array version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv} */
    public static void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        GL33C.glVertexAttribP1uiv(index, type, normalized, value);
    }

    /** Array version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv} */
    public static void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        GL33C.glVertexAttribP2uiv(index, type, normalized, value);
    }

    /** Array version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv} */
    public static void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        GL33C.glVertexAttribP3uiv(index, type, normalized, value);
    }

    /** Array version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv} */
    public static void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        GL33C.glVertexAttribP4uiv(index, type, normalized, value);
    }

}