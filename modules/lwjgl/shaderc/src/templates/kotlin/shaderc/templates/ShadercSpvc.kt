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
        "compile_options_set_shader_model",
        """
        Set HLSL shader model.

        Default is 30.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t("model", "")
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