/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package shaderc.templates

import shaderc.*
import org.lwjgl.generator.*

val SHADERC_SPVC_BINDING = simpleBinding(
    Module.SHADERC,
    libraryExpression = """Configuration.SHADERC_SPVC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("shaderc_spvc"))""",
    bundledWithLWJGL = true
)
val ShadercSpvc = "ShadercSpvc".nativeClass(Module.SHADERC, prefix = "shaderc_spvc_", prefixMethod = "shaderc_spvc_", binding = SHADERC_SPVC_BINDING) {
    documentation =
        "Native bindings to the libshaderc_spvc C API of the ${url("https://github.com/google/shaderc/", "shaderc")} library."

    EnumConstant(
        "",

        "msl_platform_ios".enum,
        "msl_platform_macos".enum
    )

    shaderc_spvc_compiler_t(
        "compiler_initialize",
        """
        Create a compiler.

        A return of #NULL indicates that there was an error. Any function operating on a {@code *_compiler_t} must offer the ${url(
            "http://herbsutter.com/2014/01/13/gotw-95-solution-thread-safety-and-synchronization/",
            "basic thread-safety guarantee"
        )}. That is: concurrent invocation of these functions on DIFFERENT objects needs no synchronization; concurrent invocation of these functions on the
        SAME object requires synchronization IF AND ONLY IF some of them take a non-const argument.
        """,

        void()
    )

    void(
        "compiler_release",
        """
        Release resources.

        After this the handle cannot be used.
        """,

        shaderc_spvc_compiler_t("compiler", "")
    )

    shaderc_spvc_compile_options_t(
        "compile_options_initialize",
        """
        Returns default compiler options.

        A return of #NULL indicates that there was an error initializing the options. Any function operating on {@code shaderc_spvc_compile_options_t} must
        offer the basic thread-safety guarantee.
        """,

        void()
    )

    shaderc_spvc_compile_options_t(
        "compile_options_clone",
        """
        Returns a copy of the given options.

        If #NULL is passed as the parameter the call is the same as #compile_options_initialize().
        """,

        nullable..shaderc_spvc_compile_options_t.const("options", "")
    )

    void(
        "compile_options_release",
        """
        Releases the compilation options.

        It is invalid to use the given option object in any future calls. It is safe to pass #NULL to this function, and doing such will have no effect.
        """,

        nullable..shaderc_spvc_compile_options_t("options", "")
    )

    void(
        "compile_options_set_entry_point",
        "Sets the entry point.",

        shaderc_spvc_compile_options_t("options", ""),
        charUTF8.const.p("entry_point", "")
    )

    void(
        "compile_options_set_remove_unused_variables",
        "If true, unused variables will not appear in the output.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_robust_buffer_access_pass",
        """
        If true, enable robust buffer access pass in the spirv-opt, meaning:
 
        Inject code to clamp indexed accesses to buffers and internal arrays, providing guarantees satisfying Vulkan's {@code robustBufferAccess} rules. This
        is useful when an implementation does not support robust-buffer access as a driver option.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_source_env",
        """
        Sets the source shader environment, affecting which warnings or errors will be issued during validation.

        Default value for environment is Vulkan 1.0.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        shaderc_target_env("env", ""),
        shaderc_env_version("version", "")
    )

    void(
        "compile_options_set_target_env",
        """
        Sets the target shader environment, if this is different from the source environment, then a transform between the environments will be performed if
        possible.
        
        Currently only WebGPU <-> Vulkan 1.1 are defined. Default value for environment is Vulkan 1.0.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        shaderc_target_env("env", ""),
        shaderc_env_version("version", "")
    )

    void(
        "compile_options_set_vulkan_semantics",
        "If true, Vulkan GLSL features are used instead of GL-compatible features.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_separate_shader_objects",
        """
        If true, {@code gl_PerVertex} is explicitly redeclared in vertex, geometry and tessellation shaders.

        The members of {@code gl_PerVertex} is determined by which built-ins are declared by the shader.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_flatten_ubo",
        "Flatten uniform or push constant variable into {@code (i|u)vec4} array.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_glsl_language_version",
        """
        Set GLSL language version.

        Default is 450 (i.e. 4.5).
        """,

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t("version", "")
    )

    //
    void(
        "compile_options_set_flatten_multidimensional_arrays",
        "If true, flatten multidimensional arrays, e.g. {@code foo[a][b][c] -> foo[a*b*c]}. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_es",
        "Force interpretion as ES, or not.  Default is to detect from source.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_glsl_emit_push_constant_as_ubo",
        "If true, emit push constants as uniform buffer objects.  Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_msl_language_version",
        """
        Set MSL language version.

        Default is 10200 (i.e. 1.2).
        """,

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t("version", "")
    )

    void(
        "compile_options_set_msl_swizzle_texture_samples",
        "If true, swizzle MSL texture samples.  Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_msl_platform",
        "Choose MSL platform.  Default is MacOS.",

        shaderc_spvc_compile_options_t("options", ""),
        shaderc_spvc_msl_platform("platform", "")
    )

    void(
        "compile_options_set_msl_pad_fragment_output",
        "If true, pad MSL fragment output. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_msl_capture",
        "If true, capture MSL output to buffer. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_msl_domain_lower_left",
        "If true, flip the Y-coord of the built-in {@code TessCoord}. Default is top left.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_msl_argument_buffers",
        "Enable use of MSL 2.0 indirect argument buffers. Default is not to use them.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_msl_discrete_descriptor_sets",
        """
        When using MSL argument buffers, force "classic" MSL 1.0 binding for the given descriptor sets. This corresponds to {@code VK_KHR_push_descriptor} in
        Vulkan.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t.const.p("descriptors", ""),
        AutoSize("descriptors")..size_t("num_descriptors", "")
    )

    void(
        "compile_options_set_hlsl_shader_model",
        """
        Set HLSL shader model.

        Default is 30.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t("model", "")
    )

    void(
        "compile_options_set_hlsl_point_size_compat",
        "If true, ignore {@code PointSize}. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_hlsl_point_coord_compat",
        "If true, ignore {@code PointCoord}. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_fixup_clipspace",
        """
        If true (default is false):
        ${ul(
            "GLSL: map depth from Vulkan/D3D style to GL style, i.e. {@code [ 0,w] -> [-w,w]}",
            "MSL : map depth from GL style to Vulkan/D3D style, i.e. {@code [-w,w] -> [ 0,w]}",
            "HLSL: map depth from GL style to Vulkan/D3D style, i.e. {@code [-w,w] -> [ 0,w]}"
        )}
        """,

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_flip_vert_y",
        """
        If true invert {@code gl_Position.y} or equivalent.

        Default is false.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_validate",
        "Set if validation should be performed. Default is true.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    size_t(
        "compile_options_set_for_fuzzing",
        "Fill options with given data.",

        shaderc_spvc_compile_options_t("options", ""),
        uint8_t.const.p("data", ""),
        AutoSize("data")..size_t("size", ""),

        returnDoc = "amount of data used, or zero if not enough data was given"
    )

    shaderc_spvc_compilation_result_t(
        "compile_into_glsl",
        "Takes SPIR-V as a sequence of 32-bit words, validates it, then compiles to GLSL.",

        shaderc_spvc_compiler_t.const("compiler", ""),
        uint32_t.const.p("source", ""),
        AutoSize("source")..size_t("source_len", ""),
        shaderc_spvc_compile_options_t("options", "")
    )

    shaderc_spvc_compilation_result_t(
        "compile_into_hlsl",
        "Takes SPIR-V as a sequence of 32-bit words, validates it, then compiles to HLSL.",

        shaderc_spvc_compiler_t.const("compiler", ""),
        uint32_t.const.p("source", ""),
        AutoSize("source")..size_t("source_len", ""),
        shaderc_spvc_compile_options_t("options", "")
    )

    shaderc_spvc_compilation_result_t(
        "compile_into_msl",
        "Takes SPIR-V as a sequence of 32-bit words, validates it, then compiles to MSL.",

        shaderc_spvc_compiler_t.const("compiler", ""),
        uint32_t.const.p("source", ""),
        AutoSize("source")..size_t("source_len", ""),
        shaderc_spvc_compile_options_t("options", "")
    )

    void(
        "result_release",
        """
        Releases the resources held by the result object.

        It is invalid to use the result object for any further operations.
        """,

        shaderc_spvc_compilation_result_t("result", "")
    )

    shaderc_compilation_status(
        "result_get_status",
        """
        Returns the compilation status, indicating whether the compilation succeeded, or failed due to some reasons, like invalid shader stage or compilation
        errors.
        """,

        shaderc_spvc_compilation_result_t.const("result", "")
    )

    charUTF8.const.p(
        "result_get_messages",
        "Get validation/compilation error or informational messages.",

        shaderc_spvc_compilation_result_t.const("result", "")
    )

    charUTF8.const.p(
        "result_get_output",
        "Get validation/compilation result as a string.",

        shaderc_spvc_compilation_result_t.const("result", "")
    )
}