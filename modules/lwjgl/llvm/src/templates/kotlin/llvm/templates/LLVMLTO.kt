/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMLTO = "LLVMLTO".nativeClass(
    Module.LLVM,
    prefixConstant = "LTO",
    prefixMethod = "lto_",
    binding = LTO_BINDING
) {
    nativeDirective("""
typedef struct {
  const char *Buffer;
  size_t Size;
} LTOObjectBuffer;""")

    IntConstant("API_VERSION".."29")

    EnumConstant(
        "SYMBOL_ALIGNMENT_MASK".enum("0x0000001F"),
        "SYMBOL_PERMISSIONS_MASK".enum("0x000000E0"),
        "SYMBOL_PERMISSIONS_CODE".enum("0x000000A0"),
        "SYMBOL_PERMISSIONS_DATA".enum("0x000000C0"),
        "SYMBOL_PERMISSIONS_RODATA".enum("0x00000080"),
        "SYMBOL_DEFINITION_MASK".enum("0x00000700"),
        "SYMBOL_DEFINITION_REGULAR".enum("0x00000100"),
        "SYMBOL_DEFINITION_TENTATIVE".enum("0x00000200"),
        "SYMBOL_DEFINITION_WEAK".enum("0x00000300"),
        "SYMBOL_DEFINITION_UNDEFINED".enum("0x00000400"),
        "SYMBOL_DEFINITION_WEAKUNDEF".enum("0x00000500"),
        "SYMBOL_SCOPE_MASK".enum("0x00003800"),
        "SYMBOL_SCOPE_INTERNAL".enum("0x00000800"),
        "SYMBOL_SCOPE_HIDDEN".enum("0x00001000"),
        "SYMBOL_SCOPE_PROTECTED".enum("0x00002000"),
        "SYMBOL_SCOPE_DEFAULT".enum("0x00001800"),
        "SYMBOL_SCOPE_DEFAULT_CAN_BE_HIDDEN".enum("0x00002800"),
        "SYMBOL_COMDAT".enum("0x00004000"),
        "SYMBOL_ALIAS".enum("0x00008000")
    )

    EnumConstant(
        "DEBUG_MODEL_NONE".enum("0"),
        "DEBUG_MODEL_DWARF".enum
    )

    EnumConstant(
        "CODEGEN_PIC_MODEL_STATIC".enum("0"),
        "CODEGEN_PIC_MODEL_DYNAMIC".enum,
        "CODEGEN_PIC_MODEL_DYNAMIC_NO_PIC".enum,
        "CODEGEN_PIC_MODEL_DEFAULT".enum
    )

    EnumConstant(
        "DS_ERROR".enum("0"),
        "DS_WARNING".enum,
        "DS_REMARK".enum("3"),
        "DS_NOTE".enum("2")
    )

    Nonnull..charUTF8.const.p(
        "get_version",

        void()
    )

    charUTF8.const.p(
        "get_error_message",

        void()
    )

    lto_bool_t(
        "module_is_object_file",

        charUTF8.const.p("path")
    )

    lto_bool_t(
        "module_is_object_file_for_target",

        charUTF8.const.p("path"),
        charUTF8.const.p("target_triple_prefix")
    )

    lto_bool_t(
        "module_has_objc_category",

        void.const.p("mem"),
        AutoSize("mem")..size_t("length")
    )

    lto_bool_t(
        "module_is_object_file_in_memory",

        void.const.p("mem"),
        AutoSize("mem")..size_t("length")
    )

    lto_bool_t(
        "module_is_object_file_in_memory_for_target",

        void.const.p("mem"),
        AutoSize("mem")..size_t("length"),
        charUTF8.const.p("target_triple_prefix")
    )

    lto_module_t(
        "module_create",

        charUTF8.const.p("path")
    )

    lto_module_t(
        "module_create_from_memory",

        void.const.p("mem"),
        AutoSize("mem")..size_t("length")
    )

    lto_module_t(
        "module_create_from_memory_with_path",

        void.const.p("mem"),
        AutoSize("mem")..size_t("length"),
        charUTF8.const.p("path")
    )

    lto_module_t(
        "module_create_in_local_context",

        void.const.p("mem"),
        AutoSize("mem")..size_t("length"),
        charUTF8.const.p("path")
    )

    lto_module_t(
        "module_create_in_codegen_context",

        void.const.p("mem"),
        AutoSize("mem")..size_t("length"),
        charUTF8.const.p("path"),
        lto_code_gen_t("cg")
    )

    lto_module_t(
        "module_create_from_fd",

        int("fd"),
        charUTF8.const.p("path"),
        size_t("file_size")
    )

    lto_module_t(
        "module_create_from_fd_at_offset",

        int("fd"),
        charUTF8.const.p("path"),
        size_t("file_size"),
        size_t("map_size"),
        off_t("offset")
    )

    void(
        "module_dispose",

        lto_module_t("mod")
    )

    charUTF8.const.p(
        "module_get_target_triple",

        lto_module_t("mod")
    )

    void(
        "module_set_target_triple",

        lto_module_t("mod"),
        charUTF8.const.p("triple")
    )

    unsigned_int(
        "module_get_num_symbols",

        lto_module_t("mod")
    )

    charUTF8.const.p(
        "module_get_symbol_name",

        lto_module_t("mod"),
        unsigned_int("index")
    )

    lto_symbol_attributes(
        "module_get_symbol_attribute",

        lto_module_t("mod"),
        unsigned_int("index")
    )

    charUTF8.const.p(
        "module_get_linkeropts",

        lto_module_t("mod")
    )

    IgnoreMissing..lto_bool_t(
        "module_get_macho_cputype",

        lto_module_t("mod"),
        Check(1)..unsigned_int.p("out_cputype"),
        Check(1)..unsigned_int.p("out_cpusubtype")
    )

    IgnoreMissing..lto_bool_t(
        "module_has_ctor_dtor",

        lto_module_t("mod")
    )

    void(
        "codegen_set_diagnostic_handler",

        lto_code_gen_t("cg"),
        lto_diagnostic_handler_t("handler"),
        opaque_p("ctxt")
    )

    lto_code_gen_t(
        "codegen_create",

        void()
    )

    lto_code_gen_t(
        "codegen_create_in_local_context",

        void()
    )

    void(
        "codegen_dispose",

        lto_code_gen_t("cg")
    )

    lto_bool_t(
        "codegen_add_module",

        lto_code_gen_t("cg"),
        lto_module_t("mod")
    )

    void(
        "codegen_set_module",

        lto_code_gen_t("cg"),
        lto_module_t("mod")
    )

    lto_bool_t(
        "codegen_set_debug_model",

        lto_code_gen_t("cg"),
        lto_debug_model("model")
    )

    lto_bool_t(
        "codegen_set_pic_model",

        lto_code_gen_t("cg"),
        lto_codegen_model("model")
    )

    void(
        "codegen_set_cpu",

        lto_code_gen_t("cg"),
        charUTF8.const.p("cpu")
    )

    void(
        "codegen_set_assembler_path",

        lto_code_gen_t("cg"),
        charUTF8.const.p("path")
    )

    void(
        "codegen_set_assembler_args",

        lto_code_gen_t("cg"),
        charUTF8.const.p.p("args"),
        AutoSize("args")..int("nargs")
    )

    void(
        "codegen_add_must_preserve_symbol",

        lto_code_gen_t("cg"),
        charUTF8.const.p("symbol")
    )

    lto_bool_t(
        "codegen_write_merged_modules",

        lto_code_gen_t("cg"),
        charUTF8.const.p("path")
    )

    void.const.p(
        "codegen_compile",

        lto_code_gen_t("cg"),
        AutoSizeResult..size_t.p("length")
    )

    lto_bool_t(
        "codegen_compile_to_file",

        lto_code_gen_t("cg"),
        Check(1)..charUTF8.const.p.p("name")
    )

    lto_bool_t(
        "codegen_optimize",

        lto_code_gen_t("cg")
    )

    void.const.p(
        "codegen_compile_optimized",

        lto_code_gen_t("cg"),
        AutoSizeResult..size_t.p("length")
    )

    unsigned_int(
        "api_version",

        void()
    )

    IgnoreMissing..void(
        "set_debug_options",

        charUTF8.const.p.const.p("options"),
        AutoSize("options")..int("number")
    )

    void(
        "codegen_debug_options",

        lto_code_gen_t("cg"),
        charUTF8.const.p("options")
    )

    IgnoreMissing..void(
        "codegen_debug_options_array",

        lto_code_gen_t("cg"),
        charUTF8.const.p.const.p("options"),
        AutoSize("options")..int("number")
    )

    void(
        "initialize_disassembler",

        void()
    )

    void(
        "codegen_set_should_internalize",

        lto_code_gen_t("cg"),
        lto_bool_t("ShouldInternalize")
    )

    void(
        "codegen_set_should_embed_uselists",

        lto_code_gen_t("cg"),
        lto_bool_t("ShouldEmbedUselists")
    )

    IgnoreMissing..lto_input_t(
        "input_create",

        void.const.p("buffer"),
        AutoSize("buffer")..size_t("buffer_size"),
        charUTF8.const.p("path")
    )

    IgnoreMissing..void(
        "input_dispose",

        lto_input_t("input")
    )

    IgnoreMissing..unsigned(
        "input_get_num_dependent_libraries",

        lto_input_t("input")
    )

    IgnoreMissing..charUTF8.const.p(
        "input_get_dependent_library",

        lto_input_t("input"),
        size_t("index"),
        AutoSizeResult..Check(1)..size_t.p("size")
    )

    IgnoreMissing..charUTF8.const.p.const.p(
        "runtime_lib_symbols_list",

        AutoSizeResult..Check(1)..size_t.p("size")
    )

    thinlto_code_gen_t(
        "thinlto_create_codegen",

        void(),

        noPrefix = true
    )

    void(
        "thinlto_codegen_dispose",

        thinlto_code_gen_t("cg"),

        noPrefix = true
    )

    void(
        "thinlto_codegen_add_module",

        thinlto_code_gen_t("cg"),
        charUTF8.const.p("identifier"),
        char.const.p("data"),
        AutoSize("data")..int("length"),

        noPrefix = true
    )

    void(
        "thinlto_codegen_process",

        thinlto_code_gen_t("cg"),

        noPrefix = true
    )

    unsigned_int(
        "thinlto_module_get_num_objects",

        thinlto_code_gen_t("cg"),

        noPrefix = true
    )

    LTOObjectBuffer(
        "thinlto_module_get_object",

        thinlto_code_gen_t("cg"),
        unsigned_int("index"),

        noPrefix = true
    )

    unsigned_int(
        "thinlto_module_get_num_object_files",

        thinlto_code_gen_t("cg"),

        noPrefix = true
    )

    charUTF8.const.p(
        "thinlto_module_get_object_file",

        thinlto_code_gen_t("cg"),
        unsigned_int("index"),

        noPrefix = true
    )

    lto_bool_t(
        "thinlto_codegen_set_pic_model",

        thinlto_code_gen_t("cg"),
        lto_codegen_model("model"),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_savetemps_dir",

        thinlto_code_gen_t("cg"),
        charUTF8.const.p("save_temps_dir"),

        noPrefix = true
    )

    void(
        "thinlto_set_generated_objects_dir",

        thinlto_code_gen_t("cg"),
        charUTF8.const.p("save_temps_dir"),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_cpu",

        thinlto_code_gen_t("cg"),
        charUTF8.const.p("cpu"),

        noPrefix = true
    )

    void(
        "thinlto_codegen_disable_codegen",

        thinlto_code_gen_t("cg"),
        lto_bool_t("disable"),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_codegen_only",

        thinlto_code_gen_t("cg"),
        lto_bool_t("codegen_only"),

        noPrefix = true
    )

    void(
        "thinlto_debug_options",

        charUTF8.const.p.const.p("options"),
        AutoSize("options")..int("number"),

        noPrefix = true
    )

    lto_bool_t(
        "module_is_thinlto",

        lto_module_t("mod")
    )

    void(
        "thinlto_codegen_add_must_preserve_symbol",

        thinlto_code_gen_t("cg"),
        charUTF8.const.p("name"),
        AutoSize("name")..int("length"),

        noPrefix = true
    )

    void(
        "thinlto_codegen_add_cross_referenced_symbol",

        thinlto_code_gen_t("cg"),
        charUTF8.const.p("name"),
        AutoSize("name")..int("length"),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_cache_dir",

        thinlto_code_gen_t("cg"),
        charUTF8.const.p("cache_dir"),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_cache_pruning_interval",

        thinlto_code_gen_t("cg"),
        int("interval"),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_final_cache_size_relative_to_available_space",

        thinlto_code_gen_t("cg"),
        unsigned_int("percentage"),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_cache_entry_expiration",

        thinlto_code_gen_t("cg"),
        unsigned_int("expiration"),

        noPrefix = true
    )

    IgnoreMissing..void(
        "thinlto_codegen_set_cache_size_bytes",

        thinlto_code_gen_t("cg"),
        unsigned_int("max_size_bytes"),

        noPrefix = true
    )

    IgnoreMissing..void(
        "thinlto_codegen_set_cache_size_megabytes",

        thinlto_code_gen_t("cg"),
        unsigned_int("max_size_megabytes"),

        noPrefix = true
    )

    IgnoreMissing..void(
        "thinlto_codegen_set_cache_size_files",

        thinlto_code_gen_t("cg"),
        unsigned_int("max_size_files"),

        noPrefix = true
    )
}