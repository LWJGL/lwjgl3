/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_base_instance.txt">ARB_base_instance</a> extension.
 * 
 * <p>This extension allows the offset within buffer objects used for instanced rendering to be specified. This is congruent with the {@code first} parameter
 * in {@link GL11C#glDrawArrays DrawArrays} and the {@code basevertex} parameter in {@link GL11C#glDrawElements DrawElements}. When instanced rendering is performed (for example, through
 * {@link GL31C#glDrawArraysInstanced DrawArraysInstanced}), instanced vertex attributes whose vertex attribute divisors are non-zero are fetched from enabled vertex arrays
 * per-instance rather than per-vertex. However, in unextended OpenGL, there is no way to define the offset into those arrays from which the attributes are
 * fetched. This extension adds that offset in the form of a {@code <baseinstance>} parameter to several new procedures.</p>
 * 
 * <p>The {@code baseinstance} parameter is added to the index of the array element, after division by the vertex attribute divisor. This allows several sets
 * of instanced vertex attribute data to be stored in a single vertex array, and the base offset of that data to be specified for each draw. Further, this
 * extension exposes the {@code <baseinstance>} parameter as the final and previously undefined structure member of the draw-indirect data structure.</p>
 * 
 * <p>Requires {@link GL31 OpenGL 3.1} or {@link ARBDrawInstanced ARB_draw_instanced}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
 */
public class ARBBaseInstance {

    static { GL.initialize(); }

    protected ARBBaseInstance() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstancedBaseInstance ] ---

    /**
     * Draws multiple instances of a range of elements with an offset applied to instanced attributes.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param first        the starting index in the enabled arrays
     * @param count        the number of indices to be rendered
     * @param primcount    the number of instances of the specified range of indices to be rendered
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     */
    public static void glDrawArraysInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance);
    }

    // --- [ glDrawElementsInstancedBaseInstance ] ---

    /**
     * Unsafe version of: {@link #glDrawElementsInstancedBaseInstance DrawElementsInstancedBaseInstance}
     *
     * @param count the number of elements to be rendered
     * @param type  the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     */
    public static void nglDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance) {
        GL42C.nglDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
    }

    /**
     * Draws multiple instances of a set of elements with an offset applied to instanced attributes
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param count        the number of elements to be rendered
     * @param type         the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the specified range of indices to be rendered
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
    }

    /**
     * Draws multiple instances of a set of elements with an offset applied to instanced attributes
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type         the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the specified range of indices to be rendered
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, type, indices, primcount, baseinstance);
    }

    /**
     * Draws multiple instances of a set of elements with an offset applied to instanced attributes
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the specified range of indices to be rendered
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    /**
     * Draws multiple instances of a set of elements with an offset applied to instanced attributes
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the specified range of indices to be rendered
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    /**
     * Draws multiple instances of a set of elements with an offset applied to instanced attributes
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the specified range of indices to be rendered
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    // --- [ glDrawElementsInstancedBaseVertexBaseInstance ] ---

    /**
     * Unsafe version of: {@link #glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance}
     *
     * @param count the number of elements to be rendered
     * @param type  the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     */
    public static void nglDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance) {
        GL42C.nglDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
    }

    /**
     * Renders multiple instances of a set of primitives from array data with a per-element offset.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param count        the number of elements to be rendered
     * @param type         the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the indexed geometry that should be drawn
     * @param basevertex   a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
    }

    /**
     * Renders multiple instances of a set of primitives from array data with a per-element offset.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type         the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the indexed geometry that should be drawn
     * @param basevertex   a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, type, indices, primcount, basevertex, baseinstance);
    }

    /**
     * Renders multiple instances of a set of primitives from array data with a per-element offset.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the indexed geometry that should be drawn
     * @param basevertex   a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    /**
     * Renders multiple instances of a set of primitives from array data with a per-element offset.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the indexed geometry that should be drawn
     * @param basevertex   a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    /**
     * Renders multiple instances of a set of primitives from array data with a per-element offset.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indices      a pointer to the location where the indices are stored
     * @param primcount    the number of instances of the indexed geometry that should be drawn
     * @param basevertex   a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays
     * @param baseinstance the base instance for use in fetching instanced vertex attributes
     */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

}