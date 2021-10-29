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

    documentation = ""

    IntConstant("", "API_VERSION".."28")

    EnumConstant(
        "{@code lto_symbol_attributes}",

        "SYMBOL_ALIGNMENT_MASK".enum("log2 of alignment", "0x0000001F"),
        "SYMBOL_PERMISSIONS_MASK".enum("", "0x000000E0"),
        "SYMBOL_PERMISSIONS_CODE".enum("", "0x000000A0"),
        "SYMBOL_PERMISSIONS_DATA".enum("", "0x000000C0"),
        "SYMBOL_PERMISSIONS_RODATA".enum("", "0x00000080"),
        "SYMBOL_DEFINITION_MASK".enum("", "0x00000700"),
        "SYMBOL_DEFINITION_REGULAR".enum("", "0x00000100"),
        "SYMBOL_DEFINITION_TENTATIVE".enum("", "0x00000200"),
        "SYMBOL_DEFINITION_WEAK".enum("", "0x00000300"),
        "SYMBOL_DEFINITION_UNDEFINED".enum("", "0x00000400"),
        "SYMBOL_DEFINITION_WEAKUNDEF".enum("", "0x00000500"),
        "SYMBOL_SCOPE_MASK".enum("", "0x00003800"),
        "SYMBOL_SCOPE_INTERNAL".enum("", "0x00000800"),
        "SYMBOL_SCOPE_HIDDEN".enum("", "0x00001000"),
        "SYMBOL_SCOPE_PROTECTED".enum("", "0x00002000"),
        "SYMBOL_SCOPE_DEFAULT".enum("", "0x00001800"),
        "SYMBOL_SCOPE_DEFAULT_CAN_BE_HIDDEN".enum("", "0x00002800"),
        "SYMBOL_COMDAT".enum("", "0x00004000"),
        "SYMBOL_ALIAS".enum("", "0x00008000")
    )

    EnumConstant(
        "{@code lto_debug_model}",

        "DEBUG_MODEL_NONE".enum("", "0"),
        "DEBUG_MODEL_DWARF".enum
    )

    EnumConstant(
        "{@code lto_codegen_model}",

        "CODEGEN_PIC_MODEL_STATIC".enum("", "0"),
        "CODEGEN_PIC_MODEL_DYNAMIC".enum,
        "CODEGEN_PIC_MODEL_DYNAMIC_NO_PIC".enum,
        "CODEGEN_PIC_MODEL_DEFAULT".enum
    )

    EnumConstant(
        """
        Diagnostic severity.

        ({@code lto_codegen_diagnostic_severity_t})
        """,

        "DS_ERROR".enum("", "0"),
        "DS_WARNING".enum,
        "DS_REMARK".enum("Added in LTO_API_VERSION=10.", "3"),
        "DS_NOTE".enum("", "2")
    )

    Nonnull..charUTF8.const.p(
        "get_version",
        "Returns a printable string.",

        void()
    )

    charUTF8.const.p(
        "get_error_message",
        "Returns the last error string or #NULL if last operation was successful.",

        void()
    )

    lto_bool_t(
        "module_is_object_file",
        "Checks if a file is a loadable object file.",

        charUTF8.const.p("path", "")
    )

    lto_bool_t(
        "module_is_object_file_for_target",
        "Checks if a file is a loadable object compiled for requested target.",

        charUTF8.const.p("path", ""),
        charUTF8.const.p("target_triple_prefix", "")
    )

    lto_bool_t(
        "module_has_objc_category",
        "Return true if {@code Buffer} contains a bitcode file with ObjC code (category or class) in it.",

        void.const.p("mem", ""),
        AutoSize("mem")..size_t("length", "")
    )

    lto_bool_t(
        "module_is_object_file_in_memory",
        "Checks if a buffer is a loadable object file.",

        void.const.p("mem", ""),
        AutoSize("mem")..size_t("length", "")
    )

    lto_bool_t(
        "module_is_object_file_in_memory_for_target",
        "Checks if a buffer is a loadable object compiled for requested target.",

        void.const.p("mem", ""),
        AutoSize("mem")..size_t("length", ""),
        charUTF8.const.p("target_triple_prefix", "")
    )

    lto_module_t(
        "module_create",
        "Loads an object file from disk. Returns #NULL on error (check #get_error_message() for details).",

        charUTF8.const.p("path", "")
    )

    lto_module_t(
        "module_create_from_memory",
        "Loads an object file from memory. Returns #NULL on error (check #get_error_message() for details).",

        void.const.p("mem", ""),
        AutoSize("mem")..size_t("length", "")
    )

    lto_module_t(
        "module_create_from_memory_with_path",
        "Loads an object file from memory with an extra path argument. Returns #NULL on error (check #get_error_message() for details).",

        void.const.p("mem", ""),
        AutoSize("mem")..size_t("length", ""),
        charUTF8.const.p("path", "")
    )

    lto_module_t(
        "module_create_in_local_context",
        """
        Loads an object file in its own context.

        Loads an object file in its own LLVMContext. This function call is thread-safe. However, modules created this way should not be merged into an
        {@code lto_code_gen_t} using #codegen_add_module().

        Returns #NULL on error (check #get_error_message() for details).
        """,

        void.const.p("mem", ""),
        AutoSize("mem")..size_t("length", ""),
        charUTF8.const.p("path", "")
    )

    lto_module_t(
        "module_create_in_codegen_context",
        """
        Loads an object file in the codegen context.

        Loads an object file into the same context as {@code cg}. The module is safe to add using #codegen_add_module().

        Returns #NULL on error (check #get_error_message() for details).
        """,

        void.const.p("mem", ""),
        AutoSize("mem")..size_t("length", ""),
        charUTF8.const.p("path", ""),
        lto_code_gen_t("cg", "")
    )

    lto_module_t(
        "module_create_from_fd",
        "Loads an object file from disk. The seek point of {@code fd} is not preserved. Returns #NULL on error (check #get_error_message() for details).",

        int("fd", ""),
        charUTF8.const.p("path", ""),
        size_t("file_size", "")
    )

    lto_module_t(
        "module_create_from_fd_at_offset",
        "Loads an object file from disk. The seek point of {@code fd} is not preserved. Returns #NULL on error (check #get_error_message() for details).",

        int("fd", ""),
        charUTF8.const.p("path", ""),
        size_t("file_size", ""),
        size_t("map_size", ""),
        off_t("offset", "")
    )

    void(
        "module_dispose",
        "Frees all memory internally allocated by the module. Upon return the {@code lto_module_t} is no longer valid.",

        lto_module_t("mod", "")
    )

    charUTF8.const.p(
        "module_get_target_triple",
        "Returns triple string which the object module was compiled under.",

        lto_module_t("mod", "")
    )

    void(
        "module_set_target_triple",
        "Sets triple string with which the object will be codegened.",

        lto_module_t("mod", ""),
        charUTF8.const.p("triple", "")
    )

    unsigned_int(
        "module_get_num_symbols",
        "Returns the number of symbols in the object module.",

        lto_module_t("mod", "")
    )

    charUTF8.const.p(
        "module_get_symbol_name",
        "Returns the name of the ith symbol in the object module.",

        lto_module_t("mod", ""),
        unsigned_int("index", "")
    )

    lto_symbol_attributes(
        "module_get_symbol_attribute",
        "Returns the attributes of the ith symbol in the object module.",

        lto_module_t("mod", ""),
        unsigned_int("index", "")
    )

    charUTF8.const.p(
        "module_get_linkeropts",
        """
        Returns the module's linker options.

        The linker options may consist of multiple flags. It is the linker's responsibility to split the flags using a platform-specific mechanism.
        """,

        lto_module_t("mod", "")
    )

    IgnoreMissing..lto_bool_t(
        "module_get_macho_cputype",
        """
        If targeting mach-o on darwin, this function gets the CPU type and subtype that will end up being encoded in the mach-o header. These are the values
        that can be found in {@code mach/machine.h}.
        """,

        lto_module_t("mod", ""),
        Check(1)..unsigned_int.p("out_cputype", "must be non-#NULL"),
        Check(1)..unsigned_int.p("out_cpusubtype", "must be non-#NULL"),

        returnDoc = "true on error (check #get_error_message() for details).",
        since = "11, {@code LTO_API_VERSION=27}"
    )

    void(
        "codegen_set_diagnostic_handler",
        """
        Set a diagnostic handler and the related context ({@code void *}). This is more general than #get_error_message(), as the diagnostic handler can be
        called at anytime within lto.
        """,

        lto_code_gen_t("cg", ""),
        lto_diagnostic_handler_t("handler", ""),
        opaque_p("ctxt", "")
    )

    lto_code_gen_t(
        "codegen_create",
        """
        Instantiates a code generator. Returns #NULL on error (check #get_error_message() for details).

        All modules added using #codegen_add_module() must have been created in the same context as the codegen.
        """,

        void()
    )

    lto_code_gen_t(
        "codegen_create_in_local_context",
        """
        Instantiate a code generator in its own context.

        Instantiates a code generator in its own context. Modules added via #codegen_add_module() must have all been created in the same context, using
        #module_create_in_codegen_context().
        """,

        void()
    )

    void(
        "codegen_dispose",
        """
        Frees all code generator and all memory it internally allocated. Upon return the {@code lto_code_gen_t} is no longer valid.
        """,

        lto_code_gen_t("cg", "")
    )

    lto_bool_t(
        "codegen_add_module",
        """
        Add an object module to the set of modules for which code will be generated. Returns true on error (check #get_error_message() for details).

        {@code cg} and {@code mod} must both be in the same context. See #codegen_create_in_local_context() and #module_create_in_codegen_context().
        """,

        lto_code_gen_t("cg", ""),
        lto_module_t("mod", "")
    )

    void(
        "codegen_set_module",
        """
        Sets the object module for code generation. This will transfer the ownership of the module to the code generator.

        {@code cg} and {@code mod} must both be in the same context.
        """,

        lto_code_gen_t("cg", ""),
        lto_module_t("mod", "")
    )

    lto_bool_t(
        "codegen_set_debug_model",
        "Sets if debug info should be generated. Returns true on error (check #get_error_message() for details).",

        lto_code_gen_t("cg", ""),
        lto_debug_model("model", "")
    )

    lto_bool_t(
        "codegen_set_pic_model",
        "Sets which PIC code model to generated. Returns true on error (check #get_error_message() for details).",

        lto_code_gen_t("cg", ""),
        lto_codegen_model("model", "")
    )

    void(
        "codegen_set_cpu",
        "Sets the cpu to generate code for.",

        lto_code_gen_t("cg", ""),
        charUTF8.const.p("cpu", "")
    )

    void(
        "codegen_set_assembler_path",
        "Sets the location of the assembler tool to run. If not set, libLTO will use gcc to invoke the assembler.",

        lto_code_gen_t("cg", ""),
        charUTF8.const.p("path", "")
    )

    void(
        "codegen_set_assembler_args",
        "Sets extra arguments that libLTO should pass to the assembler.",

        lto_code_gen_t("cg", ""),
        charUTF8.const.p.p("args", ""),
        AutoSize("args")..int("nargs", "")
    )

    void(
        "codegen_add_must_preserve_symbol",
        """
        Adds to a list of all global symbols that must exist in the final generated code. If a function is not listed there, it might be inlined into every
        usage and optimized away.
        """,

        lto_code_gen_t("cg", ""),
        charUTF8.const.p("symbol", "")
    )

    lto_bool_t(
        "codegen_write_merged_modules",
        """
        Writes a new object file at the specified path that contains the merged contents of all modules added so far. Returns true on error (check
        #get_error_message() for details).
        """,

        lto_code_gen_t("cg", ""),
        charUTF8.const.p("path", "")
    )

    void.const.p(
        "codegen_compile",
        """
        Generates code for all added modules into one native object file. This calls #codegen_optimize() then #codegen_compile_optimized().

        On success returns a pointer to a generated mach-o/ELF buffer and length set to the buffer size. The buffer is owned by the {@code lto_code_gen_t} and
        will be freed when #codegen_dispose() is called, or {@code lto_codegen_compile()} is called again. On failure, returns #NULL (check
        #get_error_message() for details).
        """,

        lto_code_gen_t("cg", ""),
        AutoSizeResult..size_t.p("length", "")
    )

    lto_bool_t(
        "codegen_compile_to_file",
        """
        Generates code for all added modules into one native object file. This calls #codegen_optimize() then #codegen_compile_optimized() (instead of
        returning a generated mach-o/ELF buffer, it writes to a file).

        The name of the file is written to name. Returns true on error.
        """,

        lto_code_gen_t("cg", ""),
        Check(1)..charUTF8.const.p.p("name", "")
    )

    lto_bool_t(
        "codegen_optimize",
        "Runs optimization for the merged module. Returns true on error.",

        lto_code_gen_t("cg", "")
    )

    void.const.p(
        "codegen_compile_optimized",
        """
        Generates code for the optimized merged module into one native object file. It will not run any IR optimizations on the merged module.

        On success returns a pointer to a generated mach-o/ELF buffer and length set to the buffer size. The buffer is owned by the {@code lto_code_gen_t} and
        will be freed when #codegen_dispose() is called, or {@code lto_codegen_compile_optimized()} is called again. On failure, returns #NULL (check
        #get_error_message() for details).
        """,

        lto_code_gen_t("cg", ""),
        AutoSizeResult..size_t.p("length", "")
    )

    unsigned_int(
        "api_version",
        "Returns the runtime API version.",

        void()
    )

    IgnoreMissing..void(
        "set_debug_options",
        """
        Parses options immediately, making them available as early as possible.

        For example during executing {@code codegen::InitTargetOptionsFromCodeGenFlags}. Since parsing shud only happen once, only one of
        #codegen_debug_options() or {@code lto_set_debug_options} should be called.
        """,

        charUTF8.const.p.const.p("options", ""),
        AutoSize("options")..int("number", ""),

        since = "13, {@code LTO_API_VERSION=28}"
    )

    void(
        "codegen_debug_options",
        """
        Sets options to help debug codegen bugs.

        Since parsing should only happen once, only one of {@code lto_codegen_debug_options} or #set_debug_options() should be called.

        This function takes one or more options separated by spaces. Warning: passing file paths through this function may confuse the argument parser if the
        paths contain spaces.
        """,

        lto_code_gen_t("cg", ""),
        charUTF8.const.p("options", "")
    )

    IgnoreMissing..void(
        "codegen_debug_options_array",
        "Same as #codegen_debug_options(), but takes every option separately through an array.",

        lto_code_gen_t("cg", ""),
        charUTF8.const.p.const.p("options", ""),
        AutoSize("options")..int("number", ""),

        since = "10, prior to {@code LTO_API_VERSION=26}"
    )

    void(
        "initialize_disassembler",
        "Initializes LLVM disassemblers.",

        void()
    )

    void(
        "codegen_set_should_internalize",
        "Sets if we should run internalize pass during optimization and code generation.",

        lto_code_gen_t("cg", ""),
        lto_bool_t("ShouldInternalize", "")
    )

    void(
        "codegen_set_should_embed_uselists",
        """
        Set whether to embed uselists in bitcode.

        Sets whether #codegen_write_merged_modules() should embed uselists in output bitcode. This should be turned on for all {@code -save-temps} output.

        """,

        lto_code_gen_t("cg", ""),
        lto_bool_t("ShouldEmbedUselists", "")
    )

    IgnoreMissing..lto_input_t(
        "input_create",
        """
        Creates an LTO input file from a buffer.

        The path argument is used for diagnotics as this function otherwise does not know which file the given buffer is associated with.
        """,

        void.const.p("buffer", ""),
        AutoSize("buffer")..size_t("buffer_size", ""),
        charUTF8.const.p("path", ""),

        since = "10, {@code LTO_API_VERSION=24}"
    )

    IgnoreMissing..void(
        "input_dispose",
        "Frees all memory internally allocated by the LTO input file. Upon return the {@code lto_module_t} is no longer valid.",

        lto_input_t("input", ""),

        since = "10, {@code LTO_API_VERSION=24}"
    )

    IgnoreMissing..unsigned(
        "input_get_num_dependent_libraries",
        "Returns the number of dependent library specifiers for the given LTO input file.",

        lto_input_t("input", ""),

        since = "10, {@code LTO_API_VERSION=24}"
    )

    IgnoreMissing..charUTF8.const.p(
        "input_get_dependent_library",
        "Returns the {@code ith} dependent library specifier for the given LTO input file. The returned string is not null-terminated.",

        lto_input_t("input", ""),
        size_t("index", ""),
        AutoSizeResult..Check(1)..size_t.p("size", ""),

        since = "10, {@code LTO_API_VERSION=24}"
    )

    IgnoreMissing..charUTF8.const.p.const.p(
        "runtime_lib_symbols_list",
        "Returns the list of {@code libcall} symbols that can be generated by LTO that might not be visible from the symbol table of bitcode files.",

        AutoSizeResult..Check(1)..size_t.p("size", ""),

        since = "10, {@code LTO_API_VERSION=25}"
    )

    thinlto_code_gen_t(
        "thinlto_create_codegen",
        """
        Instantiates a ThinLTO code generator. Returns #NULL on error (check lto_get_error_message() for details).

        The {@code ThinLTOCodeGenerator} is not intended to be reuse for multiple compilation: the model is that the client adds modules to the generator and
        ask to perform the ThinLTO optimizations / codegen, and finally destroys the codegenerator.
        """,

        void(),

        noPrefix = true
    )

    void(
        "thinlto_codegen_dispose",
        """
        Frees the generator and all memory it internally allocated. Upon return the {@code thinlto_code_gen_t} is no longer valid.
        """,

        thinlto_code_gen_t("cg", ""),

        noPrefix = true
    )

    void(
        "thinlto_codegen_add_module",
        """
        Add a module to a ThinLTO code generator. Identifier has to be unique among all the modules in a code generator. The data buffer stays owned by the
        client, and is expected to be available for the entire lifetime of the {@code thinlto_code_gen_t} it is added to.

        On failure, returns #NULL (check #get_error_message() for details).
        """,

        thinlto_code_gen_t("cg", ""),
        charUTF8.const.p("identifier", ""),
        char.const.p("data", ""),
        AutoSize("data")..int("length", ""),

        noPrefix = true
    )

    void(
        "thinlto_codegen_process",
        "Optimize and codegen all the modules added to the codegenerator using ThinLTO. Resulting objects are accessible using #thinlto_module_get_object().",

        thinlto_code_gen_t("cg", ""),

        noPrefix = true
    )

    unsigned_int(
        "thinlto_module_get_num_objects",
        """
        Returns the number of object files produced by the ThinLTO CodeGenerator.

        It usually matches the number of input files, but this is not a guarantee of the API and may change in future implementation, so the client should not
        assume it.
        """,

        thinlto_code_gen_t("cg", ""),

        noPrefix = true
    )

    LTOObjectBuffer(
        "thinlto_module_get_object",
        """
        Returns a reference to the ith object file produced by the ThinLTO CodeGenerator.

        Client should use #thinlto_module_get_num_objects() to get the number of available objects.
        """,

        thinlto_code_gen_t("cg", ""),
        unsigned_int("index", ""),

        noPrefix = true
    )

    unsigned_int(
        "thinlto_module_get_num_object_files",
        """
        Returns the number of object files produced by the ThinLTO CodeGenerator.

        It usually matches the number of input files, but this is not a guarantee of the API and may change in future implementation, so the client should not
        assume it.
        """,

        thinlto_code_gen_t("cg", ""),

        noPrefix = true
    )

    charUTF8.const.p(
        "thinlto_module_get_object_file",
        """
        Returns the path to the ith object file produced by the ThinLTO CodeGenerator.

        Client should use #thinlto_module_get_num_object_files() to get the number of available objects.
        """,

        thinlto_code_gen_t("cg", ""),
        unsigned_int("index", ""),

        noPrefix = true
    )

    lto_bool_t(
        "thinlto_codegen_set_pic_model",
        "Sets which PIC code model to generate. Returns true on error (check #get_error_message() for details).",

        thinlto_code_gen_t("cg", ""),
        lto_codegen_model("model", ""),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_savetemps_dir",
        """
        Sets the path to a directory to use as a storage for temporary bitcode files. The intention is to make the bitcode files available for debugging at
        various stage of the pipeline.
        """,

        thinlto_code_gen_t("cg", ""),
        charUTF8.const.p("save_temps_dir", ""),

        noPrefix = true
    )

    void(
        "thinlto_set_generated_objects_dir",
        """
        Set the path to a directory where to save generated object files. This path can be used by a linker to request on-disk files instead of in-memory
        buffers. When set, results are available through #thinlto_module_get_object_file() instead of #thinlto_module_get_object().
        """,

        thinlto_code_gen_t("cg", ""),
        charUTF8.const.p("save_temps_dir", ""),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_cpu",
        "Sets the cpu to generate code for.",

        thinlto_code_gen_t("cg", ""),
        charUTF8.const.p("cpu", ""),

        noPrefix = true
    )

    void(
        "thinlto_codegen_disable_codegen",
        "Disable CodeGen, only run the stages till codegen and stop. The output will be bitcode.",

        thinlto_code_gen_t("cg", ""),
        lto_bool_t("disable", ""),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_codegen_only",
        "Perform CodeGen only: disable all other stages.",

        thinlto_code_gen_t("cg", ""),
        lto_bool_t("codegen_only", ""),

        noPrefix = true
    )

    void(
        "thinlto_debug_options",
        "Parse {@code -mllvm} style debug options.",

        charUTF8.const.p.const.p("options", ""),
        AutoSize("options")..int("number", ""),

        noPrefix = true
    )

    lto_bool_t(
        "module_is_thinlto",
        "Test if a module has support for ThinLTO linking.",

        lto_module_t("mod", "")
    )

    void(
        "thinlto_codegen_add_must_preserve_symbol",
        """
        Adds a symbol to the list of global symbols that must exist in the final generated code. If a function is not listed there, it might be inlined into
        every usage and optimized away. For every single module, the functions referenced from code outside of the ThinLTO modules need to be added here.

        """,

        thinlto_code_gen_t("cg", ""),
        charUTF8.const.p("name", ""),
        AutoSize("name")..int("length", ""),

        noPrefix = true
    )

    void(
        "thinlto_codegen_add_cross_referenced_symbol",
        """
        Adds a symbol to the list of global symbols that are cross-referenced between ThinLTO files. If the ThinLTO CodeGenerator can ensure that every
        references from a ThinLTO module to this symbol is optimized away, then the symbol can be discarded.
        """,

        thinlto_code_gen_t("cg", ""),
        charUTF8.const.p("name", ""),
        AutoSize("name")..int("length", ""),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_cache_dir",
        "Sets the path to a directory to use as a cache storage for incremental build. Setting this activates caching.",

        thinlto_code_gen_t("cg", ""),
        charUTF8.const.p("cache_dir", ""),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_cache_pruning_interval",
        """
        Sets the cache pruning interval (in seconds). A negative value disables the pruning. An unspecified default value will be applied, and a value of 0
        will force prunning to occur.
        """,

        thinlto_code_gen_t("cg", ""),
        int("interval", ""),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_final_cache_size_relative_to_available_space",
        """
        Sets the maximum cache size that can be persistent across build, in terms of percentage of the available space on the disk. Set to 100 to indicate no
        limit, 50 to indicate that the cache size will not be left over half the available space. A value over 100 will be reduced to 100, a value of 0 will be
        ignored. An unspecified default value will be applied.

        The formula looks like: {@code AvailableSpace = FreeSpace + ExistingCacheSize NewCacheSize = AvailableSpace * P/100}
        """,

        thinlto_code_gen_t("cg", ""),
        unsigned_int("percentage", ""),

        noPrefix = true
    )

    void(
        "thinlto_codegen_set_cache_entry_expiration",
        "Sets the expiration (in seconds) for an entry in the cache. An unspecified default value will be applied. A value of 0 will be ignored.",

        thinlto_code_gen_t("cg", ""),
        unsigned_int("expiration", ""),

        noPrefix = true
    )

    IgnoreMissing..void(
        "thinlto_codegen_set_cache_size_bytes",
        """
        Sets the maximum size of the cache directory (in bytes). A value over the amount of available space on the disk will be reduced to the amount of
        available space. An unspecified default value will be applied. A value of 0 will be ignored.
        """,

        thinlto_code_gen_t("cg", ""),
        unsigned_int("max_size_bytes", ""),

        noPrefix = true
    )

    IgnoreMissing..void(
        "thinlto_codegen_set_cache_size_megabytes",
        "Same as #thinlto_codegen_set_cache_size_bytes(), except the maximum size is in megabytes (2<sup>20</sup> bytes).",

        thinlto_code_gen_t("cg", ""),
        unsigned_int("max_size_megabytes", ""),

        noPrefix = true
    )

    IgnoreMissing..void(
        "thinlto_codegen_set_cache_size_files",
        "Sets the maximum number of files in the cache directory. An unspecified default value will be applied. A value of 0 will be ignored.",

        thinlto_code_gen_t("cg", ""),
        unsigned_int("max_size_files", ""),

        noPrefix = true
    )
}