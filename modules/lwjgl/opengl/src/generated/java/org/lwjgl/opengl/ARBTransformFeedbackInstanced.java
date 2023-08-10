/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_transform_feedback_instanced.txt">ARB_transform_feedback_instanced</a> extension.
 * 
 * <p>Multiple instances of geometry may be specified to the GL by calling functions such as {@link GL31C#glDrawArraysInstanced DrawArraysInstanced} and {@link GL31C#glDrawElementsInstanced DrawElementsInstanced}.
 * Further, the results of a transform feedback operation may be returned to the GL by calling {@link GL40C#glDrawTransformFeedback DrawTransformFeedback}, or
 * {@link GL40C#glDrawTransformFeedbackStream DrawTransformFeedbackStream}. However, it is not presently possible to draw multiple instances of data transform feedback without using a query
 * and the resulting round trip from server to client.</p>
 * 
 * <p>This extension adds functionality to draw multiple instances of the result of a transform feedback operation.</p>
 * 
 * <p>Requires {@link GL40 OpenGL 4.0} or {@link ARBTransformFeedback2 ARB_transform_feedback2}. Requires {@link GL31 OpenGL 3.1} or {@link ARBDrawInstanced ARB_draw_instanced}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
 */
public class ARBTransformFeedbackInstanced {

    static { GL.initialize(); }

    protected ARBTransformFeedbackInstanced() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawTransformFeedbackInstanced ] ---

    /**
     * Renders multiple instances of primitives using a count derived from a transform feedback object.
     *
     * @param mode      what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param id        the name of a transform feedback object from which to retrieve a primitive count
     * @param primcount the number of instances of the geometry to render
     */
    public static void glDrawTransformFeedbackInstanced(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLsizei") int primcount) {
        GL42C.glDrawTransformFeedbackInstanced(mode, id, primcount);
    }

    // --- [ glDrawTransformFeedbackStreamInstanced ] ---

    /**
     * Renders multiple instances of primitives using a count derived from a specifed stream of a transform feedback object.
     *
     * @param mode      what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param id        the name of a transform feedback object from which to retrieve a primitive count
     * @param stream    the index of the transform feedback stream from which to retrieve a primitive count
     * @param primcount the number of instances of the geometry to render
     */
    public static void glDrawTransformFeedbackStreamInstanced(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLuint") int stream, @NativeType("GLsizei") int primcount) {
        GL42C.glDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount);
    }

}