/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_geometry_shader.txt">OES_geometry_shader</a> extension.
 * 
 * <p>OES_geometry_shader defines a new shader type available to be run on the GPU, called a geometry shader. Geometry shaders are run after vertices are
 * transformed, but prior to color clamping, flatshading and clipping.</p>
 * 
 * <p>A geometry shader begins with a single primitive (point, line, triangle). It can read the attributes of any of the vertices in the primitive and use
 * them to generate new primitives. A geometry shader has a fixed output primitive type (point, line strip, or triangle strip) and emits vertices to
 * define a new primitive. A geometry shader can emit multiple disconnected primitives. The primitives emitted by the geometry shader are clipped and then
 * processed like an equivalent primitive specified by the application.</p>
 * 
 * <p>Furthermore, OES_geometry_shader provides four additional primitive types: lines with adjacency, line strips with adjacency, separate triangles with
 * adjacency, and triangle strips with adjacency. Some of the vertices specified in these new primitive types are not part of the ordinary primitives,
 * instead they represent neighboring vertices that are adjacent to the two line segment end points (lines/strips) or the three triangle edges
 * (triangles/tstrips). These vertices can be accessed by geometry shaders and used to match up the vertices emitted by the geometry shader with those of
 * neighboring primitives.</p>
 * 
 * <p>Since geometry shaders expect a specific input primitive type, an error will occur if the application presents primitives of a different type. For
 * example, if a geometry shader expects points, an error will occur at drawing time if a primitive mode of TRIANGLES is specified.</p>
 * 
 * <p>This extension also adds the notion of layered framebuffer attachments and framebuffers that can be used in conjunction with geometry shaders to allow
 * programs to direct primitives to a face of a cube map or layer of a three-dimensional texture or two-dimensional array texture. The layer used for
 * rendering can be selected by the geometry shader at run time. The framebuffer layer count present in GL 4.x and removed from ES 3.1 is restored.</p>
 * 
 * <p>Not all geometry shader implementations have the ability to write the point size from a geometry shader. Thus a second extension string and shading
 * language enable are provided for implementations which do support geometry shader point size.</p>
 * 
 * <p>This extension relies on the OES_shader_io_blocks extension to provide the required functionality for declaring input and output blocks and interfacing
 * between shaders.</p>
 * 
 * <p>Requires {@link GLES31 GLES 3.1} and {@link GLESCapabilities#GL_OES_shader_io_blocks OES_shader_io_blocks} or {@link GLESCapabilities#GL_EXT_shader_io_blocks EXT_shader_io_blocks}.</p>
 */
public class OESGeometryShader {

    static { GLES.initialize(); }

    /**
     * Accepted by the {@code type} parameter of CreateShader and CreateShaderProgramv, by the {@code pname} parameter of GetProgramPipelineiv and returned in
     * the {@code params} parameter of GetShaderiv when {@code pname} is SHADER_TYPE.
     */
    public static final int GL_GEOMETRY_SHADER_OES = 0x8DD9;

    /** Accepted by the {@code stages} parameter of UseProgramStages. */
    public static final int GL_GEOMETRY_SHADER_BIT_OES = 0x4;

    /** Accepted by the {@code pname} parameter of GetProgramiv. */
    public static final int
        GL_GEOMETRY_LINKED_VERTICES_OUT_OES = 0x8916,
        GL_GEOMETRY_LINKED_INPUT_TYPE_OES   = 0x8917,
        GL_GEOMETRY_LINKED_OUTPUT_TYPE_OES  = 0x8918,
        GL_GEOMETRY_SHADER_INVOCATIONS_OES  = 0x887F;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v. */
    public static final int
        GL_LAYER_PROVOKING_VERTEX_OES                   = 0x825E,
        GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_OES          = 0x8DDF,
        GL_MAX_GEOMETRY_UNIFORM_BLOCKS_OES              = 0x8A2C,
        GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS_OES = 0x8A32,
        GL_MAX_GEOMETRY_INPUT_COMPONENTS_OES            = 0x9123,
        GL_MAX_GEOMETRY_OUTPUT_COMPONENTS_OES           = 0x9124,
        GL_MAX_GEOMETRY_OUTPUT_VERTICES_OES             = 0x8DE0,
        GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_OES     = 0x8DE1,
        GL_MAX_GEOMETRY_SHADER_INVOCATIONS_OES          = 0x8E5A,
        GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_OES         = 0x8C29,
        GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS_OES      = 0x92CF,
        GL_MAX_GEOMETRY_ATOMIC_COUNTERS_OES             = 0x92D5,
        GL_MAX_GEOMETRY_IMAGE_UNIFORMS_OES              = 0x90CD,
        GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS_OES       = 0x90D7;

    /** Returned in the {@code data} parameter from a Get query with a {@code pname} of LAYER_PROVOKING_VERTEX_OES. */
    public static final int
        GL_FIRST_VERTEX_CONVENTION_OES = 0x8E4D,
        GL_LAST_VERTEX_CONVENTION_OES  = 0x8E4E,
        GL_UNDEFINED_VERTEX_OES        = 0x8260;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, GetQueryiv, and GetQueryObjectuiv. */
    public static final int GL_PRIMITIVES_GENERATED_OES = 0x8C87;

    /** Accepted by the {@code mode} parameter of DrawArrays, DrawElements, and other commands which draw primitives. */
    public static final int
        GL_LINES_ADJACENCY_OES          = 0xA,
        GL_LINE_STRIP_ADJACENCY_OES     = 0xB,
        GL_TRIANGLES_ADJACENCY_OES      = 0xC,
        GL_TRIANGLE_STRIP_ADJACENCY_OES = 0xD;

    /** Accepted by the {@code pname} parameter of FramebufferParameteri, and GetFramebufferParameteriv. */
    public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS_OES = 0x9312;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, and GetFloatv. */
    public static final int GL_MAX_FRAMEBUFFER_LAYERS_OES = 0x9317;

    /** Returned by CheckFramebufferStatus. */
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_OES = 0x8DA8;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_OES = 0x8DA7;

    /** Accepted by the {@code props} parameter of GetProgramResourceiv. */
    public static final int GL_REFERENCED_BY_GEOMETRY_SHADER_OES = 0x9309;

    protected OESGeometryShader() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferTextureOES ] ---

    public static native void glFramebufferTextureOES(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

}