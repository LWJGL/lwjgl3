/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_vertex_program = "ARBVertexProgram".nativeClassGL("ARB_vertex_program", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Unextended OpenGL mandates a certain set of configurable per-vertex computations defining vertex transformation, texture coordinate generation and
        transformation, and lighting. Several extensions have added further per-vertex computations to OpenGL. For example, extensions have defined new texture
        coordinate generation modes (${ARB_texture_cube_map.link}, ${NV_texgen_reflection.link}, ${registryLinkTo("NV", "texgen_emboss")}), new vertex
        transformation modes (${ARB_vertex_blend.link}, ${registryLinkTo("EXT", "vertex_weighting")}), new lighting modes (OpenGL 1.2's separate specular and
        rescale normal functionality), several modes for fog distance generation (${NV_fog_distance.link}), and eye-distance point size attenuation
        (${ARB_point_parameters.link}).

        Each such extension adds a small set of relatively inflexible per-vertex computations.

        This inflexibility is in contrast to the typical flexibility provided by the underlying programmable floating point engines (whether micro-coded vertex
        engines, DSPs, or CPUs) that are traditionally used to implement OpenGL's per-vertex computations. The purpose of this extension is to expose to the
        OpenGL application writer a significant degree of per-vertex programmability for computing vertex parameters.

        For the purposes of discussing this extension, a vertex program is a sequence of floating-point 4-component vector operations that determines how a set
        of program parameters (defined outside of OpenGL's #Begin()/#End() pair) and an input set of per-vertex parameters are transformed to a set of
        per-vertex result parameters.

        The per-vertex computations for standard OpenGL given a particular set of lighting and texture coordinate generation modes (along with any state for
        extensions defining per-vertex computations) is, in essence, a vertex program. However, the sequence of operations is defined implicitly by the current
        OpenGL state settings rather than defined explicitly as a sequence of instructions.

        This extension provides an explicit mechanism for defining vertex program instruction sequences for application-defined vertex programs. In order to
        define such vertex programs, this extension defines a vertex programming model including a floating-point 4-component vector instruction set and a
        relatively large set of floating-point 4-component registers.

        The extension's vertex programming model is designed for efficient hardware implementation and to support a wide variety of vertex programs. By design,
        the entire set of existing vertex programs defined by existing OpenGL per-vertex computation extensions can be implemented using the extension's vertex
        programming model.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev, and by the {@code target} parameter of ProgramStringARB, BindProgramARB, ProgramEnvParameter4[df][v]ARB, ProgramLocalParameter4[df][v]ARB,
        GetProgramEnvParameter[df]vARB, GetProgramLocalParameter[df]vARB, GetProgramivARB, and GetProgramStringARB.
        """,

        "VERTEX_PROGRAM_ARB"..0x8620
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "VERTEX_PROGRAM_POINT_SIZE_ARB"..0x8642,
        "VERTEX_PROGRAM_TWO_SIDE_ARB"..0x8643,
        "COLOR_SUM_ARB"..0x8458
    )

    IntConstant(
        "Accepted by the {@code format} parameter of ProgramStringARB.",

        "PROGRAM_FORMAT_ASCII_ARB"..0x8875
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetVertexAttrib[dfi]vARB.",

        "VERTEX_ATTRIB_ARRAY_ENABLED_ARB"..0x8622,
        "VERTEX_ATTRIB_ARRAY_SIZE_ARB"..0x8623,
        "VERTEX_ATTRIB_ARRAY_STRIDE_ARB"..0x8624,
        "VERTEX_ATTRIB_ARRAY_TYPE_ARB"..0x8625,
        "VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB"..0x886A,
        "CURRENT_VERTEX_ATTRIB_ARB"..0x8626
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetVertexAttribPointervARB.",

        "VERTEX_ATTRIB_ARRAY_POINTER_ARB"..0x8645
    )

    val PARAMS = IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramivARB.",

        "PROGRAM_LENGTH_ARB"..0x8627,
        "PROGRAM_FORMAT_ARB"..0x8876,
        "PROGRAM_BINDING_ARB"..0x8677,
        "PROGRAM_INSTRUCTIONS_ARB"..0x88A0,
        "MAX_PROGRAM_INSTRUCTIONS_ARB"..0x88A1,
        "PROGRAM_NATIVE_INSTRUCTIONS_ARB"..0x88A2,
        "MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB"..0x88A3,
        "PROGRAM_TEMPORARIES_ARB"..0x88A4,
        "MAX_PROGRAM_TEMPORARIES_ARB"..0x88A5,
        "PROGRAM_NATIVE_TEMPORARIES_ARB"..0x88A6,
        "MAX_PROGRAM_NATIVE_TEMPORARIES_ARB"..0x88A7,
        "PROGRAM_PARAMETERS_ARB"..0x88A8,
        "MAX_PROGRAM_PARAMETERS_ARB"..0x88A9,
        "PROGRAM_NATIVE_PARAMETERS_ARB"..0x88AA,
        "MAX_PROGRAM_NATIVE_PARAMETERS_ARB"..0x88AB,
        "PROGRAM_ATTRIBS_ARB"..0x88AC,
        "MAX_PROGRAM_ATTRIBS_ARB"..0x88AD,
        "PROGRAM_NATIVE_ATTRIBS_ARB"..0x88AE,
        "MAX_PROGRAM_NATIVE_ATTRIBS_ARB"..0x88AF,
        "PROGRAM_ADDRESS_REGISTERS_ARB"..0x88B0,
        "MAX_PROGRAM_ADDRESS_REGISTERS_ARB"..0x88B1,
        "PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB"..0x88B2,
        "MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB"..0x88B3,
        "MAX_PROGRAM_LOCAL_PARAMETERS_ARB"..0x88B4,
        "MAX_PROGRAM_ENV_PARAMETERS_ARB"..0x88B5,
        "PROGRAM_UNDER_NATIVE_LIMITS_ARB"..0x88B6
    ).javaDocLinks

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramStringARB.",

        "PROGRAM_STRING_ARB"..0x8628
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "PROGRAM_ERROR_POSITION_ARB"..0x864B,
        "CURRENT_MATRIX_ARB"..0x8641,
        "TRANSPOSE_CURRENT_MATRIX_ARB"..0x88B7,
        "CURRENT_MATRIX_STACK_DEPTH_ARB"..0x8640,
        "MAX_VERTEX_ATTRIBS_ARB"..0x8869,
        "MAX_PROGRAM_MATRICES_ARB"..0x862F,
        "MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB"..0x862E
    )

    IntConstant(
        "Accepted by the {@code name} parameter of GetString.",

        "PROGRAM_ERROR_STRING_ARB"..0x8874
    )

    IntConstant(
        "Accepted by the {@code mode} parameter of MatrixMode.",

        "MATRIX0_ARB"..0x88C0,
        "MATRIX1_ARB"..0x88C1,
        "MATRIX2_ARB"..0x88C2,
        "MATRIX3_ARB"..0x88C3,
        "MATRIX4_ARB"..0x88C4,
        "MATRIX5_ARB"..0x88C5,
        "MATRIX6_ARB"..0x88C6,
        "MATRIX7_ARB"..0x88C7,
        "MATRIX8_ARB"..0x88C8,
        "MATRIX9_ARB"..0x88C9,
        "MATRIX10_ARB"..0x88CA,
        "MATRIX11_ARB"..0x88CB,
        "MATRIX12_ARB"..0x88CC,
        "MATRIX13_ARB"..0x88CD,
        "MATRIX14_ARB"..0x88CE,
        "MATRIX15_ARB"..0x88CF,
        "MATRIX16_ARB"..0x88D0,
        "MATRIX17_ARB"..0x88D1,
        "MATRIX18_ARB"..0x88D2,
        "MATRIX19_ARB"..0x88D3,
        "MATRIX20_ARB"..0x88D4,
        "MATRIX21_ARB"..0x88D5,
        "MATRIX22_ARB"..0x88D6,
        "MATRIX23_ARB"..0x88D7,
        "MATRIX24_ARB"..0x88D8,
        "MATRIX25_ARB"..0x88D9,
        "MATRIX26_ARB"..0x88DA,
        "MATRIX27_ARB"..0x88DB,
        "MATRIX28_ARB"..0x88DC,
        "MATRIX29_ARB"..0x88DD,
        "MATRIX30_ARB"..0x88DE,
        "MATRIX31_ARB"..0x88DF
    )

    ARB_vertex_shader reuse "VertexAttrib1sARB"
    ARB_vertex_shader reuse "VertexAttrib1fARB"
    ARB_vertex_shader reuse "VertexAttrib1dARB"

    ARB_vertex_shader reuse "VertexAttrib2sARB"
    ARB_vertex_shader reuse "VertexAttrib2fARB"
    ARB_vertex_shader reuse "VertexAttrib2dARB"

    ARB_vertex_shader reuse "VertexAttrib3sARB"
    ARB_vertex_shader reuse "VertexAttrib3fARB"
    ARB_vertex_shader reuse "VertexAttrib3dARB"

    ARB_vertex_shader reuse "VertexAttrib4sARB"
    ARB_vertex_shader reuse "VertexAttrib4fARB"
    ARB_vertex_shader reuse "VertexAttrib4dARB"
    ARB_vertex_shader reuse "VertexAttrib4NubARB"

    ARB_vertex_shader reuse "VertexAttrib1svARB"
    ARB_vertex_shader reuse "VertexAttrib1fvARB"
    ARB_vertex_shader reuse "VertexAttrib1dvARB"

    ARB_vertex_shader reuse "VertexAttrib2svARB"
    ARB_vertex_shader reuse "VertexAttrib2fvARB"
    ARB_vertex_shader reuse "VertexAttrib2dvARB"

    ARB_vertex_shader reuse "VertexAttrib3svARB"
    ARB_vertex_shader reuse "VertexAttrib3fvARB"
    ARB_vertex_shader reuse "VertexAttrib3dvARB"

    ARB_vertex_shader reuse "VertexAttrib4fvARB"
    ARB_vertex_shader reuse "VertexAttrib4bvARB"
    ARB_vertex_shader reuse "VertexAttrib4svARB"
    ARB_vertex_shader reuse "VertexAttrib4ivARB"
    ARB_vertex_shader reuse "VertexAttrib4ubvARB"
    ARB_vertex_shader reuse "VertexAttrib4usvARB"
    ARB_vertex_shader reuse "VertexAttrib4uivARB"
    ARB_vertex_shader reuse "VertexAttrib4dvARB"

    ARB_vertex_shader reuse "VertexAttrib4NbvARB"
    ARB_vertex_shader reuse "VertexAttrib4NsvARB"
    ARB_vertex_shader reuse "VertexAttrib4NivARB"

    ARB_vertex_shader reuse "VertexAttrib4NubvARB"
    ARB_vertex_shader reuse "VertexAttrib4NusvARB"
    ARB_vertex_shader reuse "VertexAttrib4NuivARB"

    ARB_vertex_shader reuse "VertexAttribPointerARB"

    ARB_vertex_shader reuse "EnableVertexAttribArrayARB"
    ARB_vertex_shader reuse "DisableVertexAttribArrayARB"

    val TARGET = GLenum("target", "the program target", "#VERTEX_PROGRAM_ARB #FRAGMENT_PROGRAM_ARB")

    void(
        "ProgramStringARB",
        """
        Updates the program string for the current program object for {@code target}.

        When a program string is loaded, it is interpreted according to syntactic and semantic rules corresponding to the program target specified by
        {@code target}. If a program violates the syntactic or semantic restrictions of the program target, ProgramStringARB generates the error
        #INVALID_OPERATION.

        Additionally, ProgramString will update the program error position (#PROGRAM_ERROR_POSITION_ARB) and error string (#PROGRAM_ERROR_STRING_ARB). If a
        program fails to load, the value of the program error position is set to the ubyte offset into the specified program string indicating where the first
        program error was detected. If the program fails to load because of a semantic restriction that is not detected until the program is fully scanned, the
        error position is set to the value of {@code len}. If a program loads successfully, the error position is set to the value negative one. The
        implementation-dependent program error string contains one or more error or warning messages.  If a program loads succesfully, the error string may
        either contain warning messages or be empty.
        """,

        TARGET,
        GLenum("format", "the format of the program string", "#PROGRAM_FORMAT_ASCII_ARB"),
        AutoSize("string")..GLsizei("len", "the length of the program string, excluding the null-terminator"),
        void.const.p("string", "an array of bytes representing the program string being loaded")
    )

    void(
        "BindProgramARB",
        """
        Creates a named program object by binding an unused program object name to a valid program target. Also can be used to bind an existing program object
        to a program target.
        """,

        TARGET,
        GLuint(
            "program",
            """
            the program object to bind. If {@code program} is zero, the default program object for {@code target} is bound.  If {@code program} is the name of
            an existing program object whose associated program target is {@code target}, the named program object is bound.
            """
        )
    )

    void(
        "DeleteProgramsARB",
        "Deletes program objects.",

        AutoSize("programs")..GLsizei("n", "the number of program object to delete"),
        GLuint.const.p("programs", "an array of {@code n} program objects to be deleted")
    )

    void(
        "GenProgramsARB",
        """
        Returns {@code n} currently unused program names in {@code programs}. These names are marked as used, for the purposes of GenProgramsARB only, but
        objects are created only when they are first bound using #BindProgramARB().
        """,

        AutoSize("programs")..GLsizei("n", "the number of program names to genereate"),
        ReturnParam..GLuint.p("programs", "an array in which to return the generated program names")
    )

    val VP_INDEX = GLuint("index", "the environment parameter index")
    val VP_X = "the {@code x} parameter component"
    val VP_Y = "the {@code y} parameter component"
    val VP_Z = "the {@code z} parameter component"
    val VP_W = "the {@code w} parameter component"

    val VP_V = "a buffer from which to read the parameter value"

    void("ProgramEnvParameter4dARB", "Double version of #ProgramEnvParameter4fARB().", TARGET, VP_INDEX, GLdouble("x", VP_X), GLdouble("y", VP_Y), GLdouble("z", VP_Z), GLdouble("w", VP_W))
    void("ProgramEnvParameter4dvARB", "Pointer version of #ProgramEnvParameter4dARB()", TARGET, VP_INDEX, Check(4)..GLdouble.const.p("params", VP_V))
    void(
        "ProgramEnvParameter4fARB",
        "Updates the values of the program environment parameter numbered {@code index} for the specified program target {@code target}.",

        TARGET,
        VP_INDEX,
        GLfloat("x", VP_X),
        GLfloat("y", VP_Y),
        GLfloat("z", VP_Z),
        GLfloat("w", VP_W)
    )
    void("ProgramEnvParameter4fvARB", "Pointer version of #ProgramEnvParameter4fARB().", TARGET, VP_INDEX, Check(4)..GLfloat.const.p("params", VP_V))

    void("ProgramLocalParameter4dARB", "Double version of #ProgramLocalParameter4fARB().", TARGET, VP_INDEX, GLdouble("x", VP_X), GLdouble("y", VP_Y), GLdouble("z", VP_Z), GLdouble("w", VP_W))
    void("ProgramLocalParameter4dvARB", "Pointer version of #ProgramLocalParameter4dARB().", TARGET, VP_INDEX, Check(4)..GLdouble.const.p("params", VP_V))
    void(
        "ProgramLocalParameter4fARB",
        "Updates the values of the program local parameter numbered {@code index} for the specified program target {@code target}.",

        TARGET,
        VP_INDEX,
        GLfloat("x", VP_X),
        GLfloat("y", VP_Y),
        GLfloat("z", VP_Z),
        GLfloat("w", VP_W)
    )
    void("ProgramLocalParameter4fvARB", "Pointer version of #ProgramLocalParameter4fARB().", TARGET, VP_INDEX, Check(4)..GLfloat.const.p("params", VP_V))

    void(
        "GetProgramEnvParameterfvARB",
        """
        Obtain the current value for the program environment parameter numbered {@code index} for the specified program target {@code target}, and places the
        information in the array {@code params}.
        """,

        TARGET,
        VP_INDEX,
        Check(4)..GLfloat.p("params", "a buffer in which to place the current parameter value")
    )

    void(
        "GetProgramEnvParameterdvARB",
        "Double version of #GetProgramEnvParameterfvARB().",

        TARGET,
        VP_INDEX,
        Check(4)..GLdouble.p("params", "a buffer in which to place the current parameter value")
    )

    void(
        "GetProgramLocalParameterfvARB",
        """
        Obtain the current value for the program local parameter numbered {@code index} for the specified program target {@code target}, and places the
        information in the array {@code params}.
        """,

        TARGET,
        VP_INDEX,
        Check(4)..GLfloat.p("params", "a buffer in which to place the current parameter value")
    )

    void(
        "GetProgramLocalParameterdvARB",
        "Double version of #GetProgramLocalParameterfvARB().",

        TARGET,
        VP_INDEX,
        Check(4)..GLdouble.p("params", "a buffer in which to place the current parameter value")
    )

    void(
        "GetProgramivARB",
        """
        Obtains program state for the program target {@code target}, writing the state into the array given by {@code params}. GetProgramivARB can be used to
        determine the properties of the currently bound program object or implementation limits for {@code target}.
        """,

        TARGET,
        GLenum("pname", "the parameter to query", PARAMS),
        ReturnParam..Check(1)..GLint.p("params", "an array in which to place the parameter value")
    )

    void(
        "GetProgramStringARB",
        """
        Obtains the program string for the program object bound to {@code target} and places the information in the array {@code string}.

        {@code n} ubytes are returned into the array program where {@code n} is the length of the program in ubytes, as returned by #GetProgramivARB() when
        {@code pname} is #PROGRAM_LENGTH_ARB. The program string is always returned using the format given when the program string was specified.
        """,

        TARGET,
        GLenum("pname", "the parameter to query", "#PROGRAM_STRING_ARB"),
        Check("glGetProgramiARB(target, GL_PROGRAM_LENGTH_ARB)", debug = true)..void.p("string", "an array in which to place the program string")
    )

    ARB_vertex_shader reuse "GetVertexAttribfvARB"
    ARB_vertex_shader reuse "GetVertexAttribdvARB"
    ARB_vertex_shader reuse "GetVertexAttribivARB"
    ARB_vertex_shader reuse "GetVertexAttribPointervARB"

    GLboolean(
        "IsProgramARB",
        """
        Returns #TRUE if {@code program} is the name of a program object. If {@code program} is zero or is a non-zero value that is not the name of a
        program object, or if an error condition occurs, IsProgramARB returns #FALSE. A name returned by #GenProgramsARB(), but not yet bound, is not the
        name of a program object.
        """,

        GLuint("program", "the program name")
    )

}