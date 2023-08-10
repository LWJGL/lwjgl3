/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_fragment_program.txt">ARB_fragment_program</a> extension.
 * 
 * <p>Unextended OpenGL mandates a certain set of configurable per- fragment computations defining texture application, texture environment, color sum, and
 * fog operations. Several extensions have added further per-fragment computations to OpenGL. For example, extensions have defined new texture environment
 * capabilities (ARB_texture_env_add, {@link ARBTextureEnvCombine ARB_texture_env_combine}, {@link ARBTextureEnvDot3 ARB_texture_env_dot3}, ARB_texture_env_crossbar), per-fragment depth
 * comparisons ({@link ARBDepthTexture ARB_depth_texture}, {@link ARBShadow ARB_shadow}, {@link ARBShadowAmbient ARB_shadow_ambient}, <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shadow_funcs.txt">EXT_shadow_funcs</a>), per-fragment lighting
 * (<a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_fragment_lighting.txt">EXT_fragment_lighting</a>, <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_light_texture.txt">EXT_light_texture</a>), and environment mapped bump mapping
 * (<a href="https://www.khronos.org/registry/OpenGL/extensions/ATI/ATI_envmap_bumpmap.txt">ATI_envmap_bumpmap</a>).</p>
 * 
 * <p>Each such extension adds a small set of relatively inflexible per-fragment computations.</p>
 * 
 * <p>This inflexibility is in contrast to the typical flexibility provided by the underlying programmable floating point engines (whether micro-coded
 * fragment engines, DSPs, or CPUs) that are traditionally used to implement OpenGL's texturing computations. The purpose of this extension is to expose to
 * the OpenGL application writer a significant degree of per-fragment programmability for computing fragment parameters.</p>
 * 
 * <p>For the purposes of discussing this extension, a fragment program is a sequence of floating-point 4-component vector operations that determines how a
 * set of program parameters (not specific to an individual fragment) and an input set of per-fragment parameters are transformed to a set of per-fragment
 * result parameters.</p>
 * 
 * <p>The per-fragment computations for standard OpenGL given a particular set of texture and fog application modes (along with any state for extensions
 * defining per-fragment computations) is, in essence, a fragment program. However, the sequence of operations is defined implicitly by the current OpenGL
 * state settings rather than defined explicitly as a sequence of instructions.</p>
 * 
 * <p>This extension provides an explicit mechanism for defining fragment program instruction sequences for application-defined fragment programs. In order to
 * define such fragment programs, this extension defines a fragment programming model including a floating-point 4-component vector instruction set and a
 * relatively large set of floating-point 4-component registers.</p>
 * 
 * <p>The extension's fragment programming model is designed for efficient hardware implementation and to support a wide variety of fragment programs. By
 * design, the entire set of existing fragment programs defined by existing OpenGL per-fragment computation extensions can be implemented using the
 * extension's fragment programming model.</p>
 * 
 * <p><b>LWJGL</b>: This extension defines many functions and tokens that are also defined in {@link ARBVertexProgram ARB_vertex_program}. Since these two extensions are often
 * used together, the common functionality has only been exposed by {@link ARBVertexProgram ARB_vertex_program}, to avoid static import conflicts.</p>
 */
public final class ARBFragmentProgram {

    /**
     * Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev, and by the {@code target} parameter of ProgramStringARB, BindProgramARB, ProgramEnvParameter4[df][v]ARB, ProgramLocalParameter4[df][v]ARB,
     * GetProgramEnvParameter[df]vARB, GetProgramLocalParameter[df]vARB, GetProgramivARB and GetProgramStringARB.
     */
    public static final int GL_FRAGMENT_PROGRAM_ARB = 0x8804;

    /** Accepted by the {@code pname} parameter of GetProgramivARB. */
    public static final int
        GL_PROGRAM_ALU_INSTRUCTIONS_ARB            = 0x8805,
        GL_PROGRAM_TEX_INSTRUCTIONS_ARB            = 0x8806,
        GL_PROGRAM_TEX_INDIRECTIONS_ARB            = 0x8807,
        GL_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB     = 0x8808,
        GL_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB     = 0x8809,
        GL_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB     = 0x880A,
        GL_MAX_PROGRAM_ALU_INSTRUCTIONS_ARB        = 0x880B,
        GL_MAX_PROGRAM_TEX_INSTRUCTIONS_ARB        = 0x880C,
        GL_MAX_PROGRAM_TEX_INDIRECTIONS_ARB        = 0x880D,
        GL_MAX_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB = 0x880E,
        GL_MAX_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB = 0x880F,
        GL_MAX_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB = 0x8810;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_MAX_TEXTURE_COORDS_ARB      = 0x8871,
        GL_MAX_TEXTURE_IMAGE_UNITS_ARB = 0x8872;

    private ARBFragmentProgram() {}

}