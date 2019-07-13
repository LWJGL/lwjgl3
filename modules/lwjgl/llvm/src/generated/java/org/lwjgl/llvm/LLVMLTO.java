/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LLVMLTO {

    public static final int LTOAPI_VERSION = 23;

    /**
     * {@code lto_symbol_attributes}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LTOSYMBOL_ALIGNMENT_MASK SYMBOL_ALIGNMENT_MASK} - log2 of alignment</li>
     * <li>{@link #LTOSYMBOL_PERMISSIONS_MASK SYMBOL_PERMISSIONS_MASK}</li>
     * <li>{@link #LTOSYMBOL_PERMISSIONS_CODE SYMBOL_PERMISSIONS_CODE}</li>
     * <li>{@link #LTOSYMBOL_PERMISSIONS_DATA SYMBOL_PERMISSIONS_DATA}</li>
     * <li>{@link #LTOSYMBOL_PERMISSIONS_RODATA SYMBOL_PERMISSIONS_RODATA}</li>
     * <li>{@link #LTOSYMBOL_DEFINITION_MASK SYMBOL_DEFINITION_MASK}</li>
     * <li>{@link #LTOSYMBOL_DEFINITION_REGULAR SYMBOL_DEFINITION_REGULAR}</li>
     * <li>{@link #LTOSYMBOL_DEFINITION_TENTATIVE SYMBOL_DEFINITION_TENTATIVE}</li>
     * <li>{@link #LTOSYMBOL_DEFINITION_WEAK SYMBOL_DEFINITION_WEAK}</li>
     * <li>{@link #LTOSYMBOL_DEFINITION_UNDEFINED SYMBOL_DEFINITION_UNDEFINED}</li>
     * <li>{@link #LTOSYMBOL_DEFINITION_WEAKUNDEF SYMBOL_DEFINITION_WEAKUNDEF}</li>
     * <li>{@link #LTOSYMBOL_SCOPE_MASK SYMBOL_SCOPE_MASK}</li>
     * <li>{@link #LTOSYMBOL_SCOPE_INTERNAL SYMBOL_SCOPE_INTERNAL}</li>
     * <li>{@link #LTOSYMBOL_SCOPE_HIDDEN SYMBOL_SCOPE_HIDDEN}</li>
     * <li>{@link #LTOSYMBOL_SCOPE_PROTECTED SYMBOL_SCOPE_PROTECTED}</li>
     * <li>{@link #LTOSYMBOL_SCOPE_DEFAULT SYMBOL_SCOPE_DEFAULT}</li>
     * <li>{@link #LTOSYMBOL_SCOPE_DEFAULT_CAN_BE_HIDDEN SYMBOL_SCOPE_DEFAULT_CAN_BE_HIDDEN}</li>
     * <li>{@link #LTOSYMBOL_COMDAT SYMBOL_COMDAT}</li>
     * <li>{@link #LTOSYMBOL_ALIAS SYMBOL_ALIAS}</li>
     * </ul>
     */
    public static final int
        LTOSYMBOL_ALIGNMENT_MASK              = 0x0000001F,
        LTOSYMBOL_PERMISSIONS_MASK            = 0x000000E0,
        LTOSYMBOL_PERMISSIONS_CODE            = 0x000000A0,
        LTOSYMBOL_PERMISSIONS_DATA            = 0x000000C0,
        LTOSYMBOL_PERMISSIONS_RODATA          = 0x00000080,
        LTOSYMBOL_DEFINITION_MASK             = 0x00000700,
        LTOSYMBOL_DEFINITION_REGULAR          = 0x00000100,
        LTOSYMBOL_DEFINITION_TENTATIVE        = 0x00000200,
        LTOSYMBOL_DEFINITION_WEAK             = 0x00000300,
        LTOSYMBOL_DEFINITION_UNDEFINED        = 0x00000400,
        LTOSYMBOL_DEFINITION_WEAKUNDEF        = 0x00000500,
        LTOSYMBOL_SCOPE_MASK                  = 0x00003800,
        LTOSYMBOL_SCOPE_INTERNAL              = 0x00000800,
        LTOSYMBOL_SCOPE_HIDDEN                = 0x00001000,
        LTOSYMBOL_SCOPE_PROTECTED             = 0x00002000,
        LTOSYMBOL_SCOPE_DEFAULT               = 0x00001800,
        LTOSYMBOL_SCOPE_DEFAULT_CAN_BE_HIDDEN = 0x00002800,
        LTOSYMBOL_COMDAT                      = 0x00004000,
        LTOSYMBOL_ALIAS                       = 0x00008000;

    /**
     * {@code lto_debug_model}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LTODEBUG_MODEL_NONE DEBUG_MODEL_NONE}</li>
     * <li>{@link #LTODEBUG_MODEL_DWARF DEBUG_MODEL_DWARF}</li>
     * </ul>
     */
    public static final int
        LTODEBUG_MODEL_NONE  = 0,
        LTODEBUG_MODEL_DWARF = 1;

    /**
     * {@code lto_codegen_model}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LTOCODEGEN_PIC_MODEL_STATIC CODEGEN_PIC_MODEL_STATIC}</li>
     * <li>{@link #LTOCODEGEN_PIC_MODEL_DYNAMIC CODEGEN_PIC_MODEL_DYNAMIC}</li>
     * <li>{@link #LTOCODEGEN_PIC_MODEL_DYNAMIC_NO_PIC CODEGEN_PIC_MODEL_DYNAMIC_NO_PIC}</li>
     * <li>{@link #LTOCODEGEN_PIC_MODEL_DEFAULT CODEGEN_PIC_MODEL_DEFAULT}</li>
     * </ul>
     */
    public static final int
        LTOCODEGEN_PIC_MODEL_STATIC         = 0,
        LTOCODEGEN_PIC_MODEL_DYNAMIC        = 1,
        LTOCODEGEN_PIC_MODEL_DYNAMIC_NO_PIC = 2,
        LTOCODEGEN_PIC_MODEL_DEFAULT        = 3;

    /**
     * Diagnostic severity.
     * 
     * <p>({@code lto_codegen_diagnostic_severity_t})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LTODS_ERROR DS_ERROR}</li>
     * <li>{@link #LTODS_WARNING DS_WARNING}</li>
     * <li>{@link #LTODS_REMARK DS_REMARK} - Added in LTO_API_VERSION=10.</li>
     * <li>{@link #LTODS_NOTE DS_NOTE}</li>
     * </ul>
     */
    public static final int
        LTODS_ERROR   = 0,
        LTODS_WARNING = 1,
        LTODS_REMARK  = 3,
        LTODS_NOTE    = 2;

    static { LibLLVM.initialize(); }

    protected LLVMLTO() {
        throw new UnsupportedOperationException();
    }

    private static final SharedLibrary LTO = Library.loadNative(LLVMLTO.class, "org.lwjgl.llvm", Configuration.LLVM_LTO_LIBRARY_NAME, "libLTO");

    /** Contains the function pointers loaded from the LTO {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            get_version                                                      = apiGetFunctionAddress(LTO, "lto_get_version"),
            get_error_message                                                = apiGetFunctionAddress(LTO, "lto_get_error_message"),
            module_is_object_file                                            = apiGetFunctionAddress(LTO, "lto_module_is_object_file"),
            module_is_object_file_for_target                                 = apiGetFunctionAddress(LTO, "lto_module_is_object_file_for_target"),
            module_has_objc_category                                         = apiGetFunctionAddress(LTO, "lto_module_has_objc_category"),
            module_is_object_file_in_memory                                  = apiGetFunctionAddress(LTO, "lto_module_is_object_file_in_memory"),
            module_is_object_file_in_memory_for_target                       = apiGetFunctionAddress(LTO, "lto_module_is_object_file_in_memory_for_target"),
            module_create                                                    = apiGetFunctionAddress(LTO, "lto_module_create"),
            module_create_from_memory                                        = apiGetFunctionAddress(LTO, "lto_module_create_from_memory"),
            module_create_from_memory_with_path                              = apiGetFunctionAddress(LTO, "lto_module_create_from_memory_with_path"),
            module_create_in_local_context                                   = apiGetFunctionAddress(LTO, "lto_module_create_in_local_context"),
            module_create_in_codegen_context                                 = apiGetFunctionAddress(LTO, "lto_module_create_in_codegen_context"),
            module_create_from_fd                                            = apiGetFunctionAddress(LTO, "lto_module_create_from_fd"),
            module_create_from_fd_at_offset                                  = apiGetFunctionAddress(LTO, "lto_module_create_from_fd_at_offset"),
            module_dispose                                                   = apiGetFunctionAddress(LTO, "lto_module_dispose"),
            module_get_target_triple                                         = apiGetFunctionAddress(LTO, "lto_module_get_target_triple"),
            module_set_target_triple                                         = apiGetFunctionAddress(LTO, "lto_module_set_target_triple"),
            module_get_num_symbols                                           = apiGetFunctionAddress(LTO, "lto_module_get_num_symbols"),
            module_get_symbol_name                                           = apiGetFunctionAddress(LTO, "lto_module_get_symbol_name"),
            module_get_symbol_attribute                                      = apiGetFunctionAddress(LTO, "lto_module_get_symbol_attribute"),
            module_get_linkeropts                                            = apiGetFunctionAddress(LTO, "lto_module_get_linkeropts"),
            codegen_set_diagnostic_handler                                   = apiGetFunctionAddress(LTO, "lto_codegen_set_diagnostic_handler"),
            codegen_create                                                   = apiGetFunctionAddress(LTO, "lto_codegen_create"),
            codegen_create_in_local_context                                  = apiGetFunctionAddress(LTO, "lto_codegen_create_in_local_context"),
            codegen_dispose                                                  = apiGetFunctionAddress(LTO, "lto_codegen_dispose"),
            codegen_add_module                                               = apiGetFunctionAddress(LTO, "lto_codegen_add_module"),
            codegen_set_module                                               = apiGetFunctionAddress(LTO, "lto_codegen_set_module"),
            codegen_set_debug_model                                          = apiGetFunctionAddress(LTO, "lto_codegen_set_debug_model"),
            codegen_set_pic_model                                            = apiGetFunctionAddress(LTO, "lto_codegen_set_pic_model"),
            codegen_set_cpu                                                  = apiGetFunctionAddress(LTO, "lto_codegen_set_cpu"),
            codegen_set_assembler_path                                       = apiGetFunctionAddress(LTO, "lto_codegen_set_assembler_path"),
            codegen_set_assembler_args                                       = apiGetFunctionAddress(LTO, "lto_codegen_set_assembler_args"),
            codegen_add_must_preserve_symbol                                 = apiGetFunctionAddress(LTO, "lto_codegen_add_must_preserve_symbol"),
            codegen_write_merged_modules                                     = apiGetFunctionAddress(LTO, "lto_codegen_write_merged_modules"),
            codegen_compile                                                  = apiGetFunctionAddress(LTO, "lto_codegen_compile"),
            codegen_compile_to_file                                          = apiGetFunctionAddress(LTO, "lto_codegen_compile_to_file"),
            codegen_optimize                                                 = apiGetFunctionAddress(LTO, "lto_codegen_optimize"),
            codegen_compile_optimized                                        = apiGetFunctionAddress(LTO, "lto_codegen_compile_optimized"),
            api_version                                                      = apiGetFunctionAddress(LTO, "lto_api_version"),
            codegen_debug_options                                            = apiGetFunctionAddress(LTO, "lto_codegen_debug_options"),
            initialize_disassembler                                          = apiGetFunctionAddress(LTO, "lto_initialize_disassembler"),
            codegen_set_should_internalize                                   = apiGetFunctionAddress(LTO, "lto_codegen_set_should_internalize"),
            codegen_set_should_embed_uselists                                = apiGetFunctionAddress(LTO, "lto_codegen_set_should_embed_uselists"),
            thinlto_create_codegen                                           = apiGetFunctionAddress(LTO, "thinlto_create_codegen"),
            thinlto_codegen_dispose                                          = apiGetFunctionAddress(LTO, "thinlto_codegen_dispose"),
            thinlto_codegen_add_module                                       = apiGetFunctionAddress(LTO, "thinlto_codegen_add_module"),
            thinlto_codegen_process                                          = apiGetFunctionAddress(LTO, "thinlto_codegen_process"),
            thinlto_module_get_num_objects                                   = apiGetFunctionAddress(LTO, "thinlto_module_get_num_objects"),
            thinlto_module_get_object                                        = apiGetFunctionAddress(LTO, "thinlto_module_get_object"),
            thinlto_module_get_num_object_files                              = apiGetFunctionAddress(LTO, "thinlto_module_get_num_object_files"),
            thinlto_module_get_object_file                                   = apiGetFunctionAddress(LTO, "thinlto_module_get_object_file"),
            thinlto_codegen_set_pic_model                                    = apiGetFunctionAddress(LTO, "thinlto_codegen_set_pic_model"),
            thinlto_codegen_set_savetemps_dir                                = apiGetFunctionAddress(LTO, "thinlto_codegen_set_savetemps_dir"),
            thinlto_set_generated_objects_dir                                = apiGetFunctionAddress(LTO, "thinlto_set_generated_objects_dir"),
            thinlto_codegen_set_cpu                                          = apiGetFunctionAddress(LTO, "thinlto_codegen_set_cpu"),
            thinlto_codegen_disable_codegen                                  = apiGetFunctionAddress(LTO, "thinlto_codegen_disable_codegen"),
            thinlto_codegen_set_codegen_only                                 = apiGetFunctionAddress(LTO, "thinlto_codegen_set_codegen_only"),
            thinlto_debug_options                                            = apiGetFunctionAddress(LTO, "thinlto_debug_options"),
            module_is_thinlto                                                = apiGetFunctionAddress(LTO, "lto_module_is_thinlto"),
            thinlto_codegen_add_must_preserve_symbol                         = apiGetFunctionAddress(LTO, "thinlto_codegen_add_must_preserve_symbol"),
            thinlto_codegen_add_cross_referenced_symbol                      = apiGetFunctionAddress(LTO, "thinlto_codegen_add_cross_referenced_symbol"),
            thinlto_codegen_set_cache_dir                                    = apiGetFunctionAddress(LTO, "thinlto_codegen_set_cache_dir"),
            thinlto_codegen_set_cache_pruning_interval                       = apiGetFunctionAddress(LTO, "thinlto_codegen_set_cache_pruning_interval"),
            thinlto_codegen_set_final_cache_size_relative_to_available_space = apiGetFunctionAddress(LTO, "thinlto_codegen_set_final_cache_size_relative_to_available_space"),
            thinlto_codegen_set_cache_entry_expiration                       = apiGetFunctionAddress(LTO, "thinlto_codegen_set_cache_entry_expiration"),
            thinlto_codegen_set_cache_size_bytes                             = LTO.getFunctionAddress("thinlto_codegen_set_cache_size_bytes"),
            thinlto_codegen_set_cache_size_megabytes                         = LTO.getFunctionAddress("thinlto_codegen_set_cache_size_megabytes"),
            thinlto_codegen_set_cache_size_files                             = LTO.getFunctionAddress("thinlto_codegen_set_cache_size_files");

    }

    /** Returns the LTO {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return LTO;
    }

    // --- [ lto_get_version ] ---

    /** Unsafe version of: {@link #lto_get_version get_version} */
    public static long nlto_get_version() {
        long __functionAddress = Functions.get_version;
        return invokeP(__functionAddress);
    }

    /** Returns a printable string. */
    @NativeType("char const *")
    public static String lto_get_version() {
        long __result = nlto_get_version();
        return memUTF8(__result);
    }

    // --- [ lto_get_error_message ] ---

    /** Unsafe version of: {@link #lto_get_error_message get_error_message} */
    public static long nlto_get_error_message() {
        long __functionAddress = Functions.get_error_message;
        return invokeP(__functionAddress);
    }

    /** Returns the last error string or {@code NULL} if last operation was successful. */
    @Nullable
    @NativeType("char const *")
    public static String lto_get_error_message() {
        long __result = nlto_get_error_message();
        return memUTF8Safe(__result);
    }

    // --- [ lto_module_is_object_file ] ---

    /** Unsafe version of: {@link #lto_module_is_object_file module_is_object_file} */
    public static boolean nlto_module_is_object_file(long path) {
        long __functionAddress = Functions.module_is_object_file;
        return invokePZ(path, __functionAddress);
    }

    /** Checks if a file is a loadable object file. */
    @NativeType("lto_bool_t")
    public static boolean lto_module_is_object_file(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_is_object_file(memAddress(path));
    }

    /** Checks if a file is a loadable object file. */
    @NativeType("lto_bool_t")
    public static boolean lto_module_is_object_file(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nlto_module_is_object_file(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_module_is_object_file_for_target ] ---

    /** Unsafe version of: {@link #lto_module_is_object_file_for_target module_is_object_file_for_target} */
    public static boolean nlto_module_is_object_file_for_target(long path, long target_triple_prefix) {
        long __functionAddress = Functions.module_is_object_file_for_target;
        return invokePPZ(path, target_triple_prefix, __functionAddress);
    }

    /** Checks if a file is a loadable object compiled for requested target. */
    @NativeType("lto_bool_t")
    public static boolean lto_module_is_object_file_for_target(@NativeType("char const *") ByteBuffer path, @NativeType("char const *") ByteBuffer target_triple_prefix) {
        if (CHECKS) {
            checkNT1(path);
            checkNT1(target_triple_prefix);
        }
        return nlto_module_is_object_file_for_target(memAddress(path), memAddress(target_triple_prefix));
    }

    /** Checks if a file is a loadable object compiled for requested target. */
    @NativeType("lto_bool_t")
    public static boolean lto_module_is_object_file_for_target(@NativeType("char const *") CharSequence path, @NativeType("char const *") CharSequence target_triple_prefix) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            stack.nUTF8(target_triple_prefix, true);
            long target_triple_prefixEncoded = stack.getPointerAddress();
            return nlto_module_is_object_file_for_target(pathEncoded, target_triple_prefixEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_module_has_objc_category ] ---

    /** Unsafe version of: {@link #lto_module_has_objc_category module_has_objc_category} */
    public static boolean nlto_module_has_objc_category(long mem, long length) {
        long __functionAddress = Functions.module_has_objc_category;
        return invokePPZ(mem, length, __functionAddress);
    }

    /** Return true if {@code Buffer} contains a bitcode file with ObjC code (category or class) in it. */
    @NativeType("lto_bool_t")
    public static boolean lto_module_has_objc_category(@NativeType("void const *") ByteBuffer mem) {
        return nlto_module_has_objc_category(memAddress(mem), mem.remaining());
    }

    // --- [ lto_module_is_object_file_in_memory ] ---

    /** Unsafe version of: {@link #lto_module_is_object_file_in_memory module_is_object_file_in_memory} */
    public static boolean nlto_module_is_object_file_in_memory(long mem, long length) {
        long __functionAddress = Functions.module_is_object_file_in_memory;
        return invokePPZ(mem, length, __functionAddress);
    }

    /** Checks if a buffer is a loadable object file. */
    @NativeType("lto_bool_t")
    public static boolean lto_module_is_object_file_in_memory(@NativeType("void const *") ByteBuffer mem) {
        return nlto_module_is_object_file_in_memory(memAddress(mem), mem.remaining());
    }

    // --- [ lto_module_is_object_file_in_memory_for_target ] ---

    /** Unsafe version of: {@link #lto_module_is_object_file_in_memory_for_target module_is_object_file_in_memory_for_target} */
    public static boolean nlto_module_is_object_file_in_memory_for_target(long mem, long length, long target_triple_prefix) {
        long __functionAddress = Functions.module_is_object_file_in_memory_for_target;
        return invokePPPZ(mem, length, target_triple_prefix, __functionAddress);
    }

    /** Checks if a buffer is a loadable object compiled for requested target. */
    @NativeType("lto_bool_t")
    public static boolean lto_module_is_object_file_in_memory_for_target(@NativeType("void const *") ByteBuffer mem, @NativeType("char const *") ByteBuffer target_triple_prefix) {
        if (CHECKS) {
            checkNT1(target_triple_prefix);
        }
        return nlto_module_is_object_file_in_memory_for_target(memAddress(mem), mem.remaining(), memAddress(target_triple_prefix));
    }

    /** Checks if a buffer is a loadable object compiled for requested target. */
    @NativeType("lto_bool_t")
    public static boolean lto_module_is_object_file_in_memory_for_target(@NativeType("void const *") ByteBuffer mem, @NativeType("char const *") CharSequence target_triple_prefix) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(target_triple_prefix, true);
            long target_triple_prefixEncoded = stack.getPointerAddress();
            return nlto_module_is_object_file_in_memory_for_target(memAddress(mem), mem.remaining(), target_triple_prefixEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_module_create ] ---

    /** Unsafe version of: {@link #lto_module_create module_create} */
    public static long nlto_module_create(long path) {
        long __functionAddress = Functions.module_create;
        return invokePP(path, __functionAddress);
    }

    /** Loads an object file from disk. Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details). */
    @NativeType("lto_module_t")
    public static long lto_module_create(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_create(memAddress(path));
    }

    /** Loads an object file from disk. Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details). */
    @NativeType("lto_module_t")
    public static long lto_module_create(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nlto_module_create(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_module_create_from_memory ] ---

    /** Unsafe version of: {@link #lto_module_create_from_memory module_create_from_memory} */
    public static long nlto_module_create_from_memory(long mem, long length) {
        long __functionAddress = Functions.module_create_from_memory;
        return invokePPP(mem, length, __functionAddress);
    }

    /** Loads an object file from memory. Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details). */
    @NativeType("lto_module_t")
    public static long lto_module_create_from_memory(@NativeType("void const *") ByteBuffer mem) {
        return nlto_module_create_from_memory(memAddress(mem), mem.remaining());
    }

    // --- [ lto_module_create_from_memory_with_path ] ---

    /** Unsafe version of: {@link #lto_module_create_from_memory_with_path module_create_from_memory_with_path} */
    public static long nlto_module_create_from_memory_with_path(long mem, long length, long path) {
        long __functionAddress = Functions.module_create_from_memory_with_path;
        return invokePPPP(mem, length, path, __functionAddress);
    }

    /** Loads an object file from memory with an extra path argument. Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details). */
    @NativeType("lto_module_t")
    public static long lto_module_create_from_memory_with_path(@NativeType("void const *") ByteBuffer mem, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_create_from_memory_with_path(memAddress(mem), mem.remaining(), memAddress(path));
    }

    /** Loads an object file from memory with an extra path argument. Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details). */
    @NativeType("lto_module_t")
    public static long lto_module_create_from_memory_with_path(@NativeType("void const *") ByteBuffer mem, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nlto_module_create_from_memory_with_path(memAddress(mem), mem.remaining(), pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_module_create_in_local_context ] ---

    /** Unsafe version of: {@link #lto_module_create_in_local_context module_create_in_local_context} */
    public static long nlto_module_create_in_local_context(long mem, long length, long path) {
        long __functionAddress = Functions.module_create_in_local_context;
        return invokePPPP(mem, length, path, __functionAddress);
    }

    /**
     * Loads an object file in its own context.
     * 
     * <p>Loads an object file in its own LLVMContext. This function call is thread-safe. However, modules created this way should not be merged into an
     * {@code lto_code_gen_t} using {@link #lto_codegen_add_module codegen_add_module}.</p>
     * 
     * <p>Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details).</p>
     */
    @NativeType("lto_module_t")
    public static long lto_module_create_in_local_context(@NativeType("void const *") ByteBuffer mem, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_create_in_local_context(memAddress(mem), mem.remaining(), memAddress(path));
    }

    /**
     * Loads an object file in its own context.
     * 
     * <p>Loads an object file in its own LLVMContext. This function call is thread-safe. However, modules created this way should not be merged into an
     * {@code lto_code_gen_t} using {@link #lto_codegen_add_module codegen_add_module}.</p>
     * 
     * <p>Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details).</p>
     */
    @NativeType("lto_module_t")
    public static long lto_module_create_in_local_context(@NativeType("void const *") ByteBuffer mem, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nlto_module_create_in_local_context(memAddress(mem), mem.remaining(), pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_module_create_in_codegen_context ] ---

    /** Unsafe version of: {@link #lto_module_create_in_codegen_context module_create_in_codegen_context} */
    public static long nlto_module_create_in_codegen_context(long mem, long length, long path, long cg) {
        long __functionAddress = Functions.module_create_in_codegen_context;
        if (CHECKS) {
            check(cg);
        }
        return invokePPPPP(mem, length, path, cg, __functionAddress);
    }

    /**
     * Loads an object file in the codegen context.
     * 
     * <p>Loads an object file into the same context as {@code cg}. The module is safe to add using {@link #lto_codegen_add_module codegen_add_module}.</p>
     * 
     * <p>Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details).</p>
     */
    @NativeType("lto_module_t")
    public static long lto_module_create_in_codegen_context(@NativeType("void const *") ByteBuffer mem, @NativeType("char const *") ByteBuffer path, @NativeType("lto_code_gen_t") long cg) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_create_in_codegen_context(memAddress(mem), mem.remaining(), memAddress(path), cg);
    }

    /**
     * Loads an object file in the codegen context.
     * 
     * <p>Loads an object file into the same context as {@code cg}. The module is safe to add using {@link #lto_codegen_add_module codegen_add_module}.</p>
     * 
     * <p>Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details).</p>
     */
    @NativeType("lto_module_t")
    public static long lto_module_create_in_codegen_context(@NativeType("void const *") ByteBuffer mem, @NativeType("char const *") CharSequence path, @NativeType("lto_code_gen_t") long cg) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nlto_module_create_in_codegen_context(memAddress(mem), mem.remaining(), pathEncoded, cg);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_module_create_from_fd ] ---

    /** Unsafe version of: {@link #lto_module_create_from_fd module_create_from_fd} */
    public static long nlto_module_create_from_fd(int fd, long path, long file_size) {
        long __functionAddress = Functions.module_create_from_fd;
        return invokePPP(fd, path, file_size, __functionAddress);
    }

    /** Loads an object file from disk. The seek point of {@code fd} is not preserved. Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details). */
    @NativeType("lto_module_t")
    public static long lto_module_create_from_fd(int fd, @NativeType("char const *") ByteBuffer path, @NativeType("size_t") long file_size) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_create_from_fd(fd, memAddress(path), file_size);
    }

    /** Loads an object file from disk. The seek point of {@code fd} is not preserved. Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details). */
    @NativeType("lto_module_t")
    public static long lto_module_create_from_fd(int fd, @NativeType("char const *") CharSequence path, @NativeType("size_t") long file_size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nlto_module_create_from_fd(fd, pathEncoded, file_size);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_module_create_from_fd_at_offset ] ---

    /** Unsafe version of: {@link #lto_module_create_from_fd_at_offset module_create_from_fd_at_offset} */
    public static long nlto_module_create_from_fd_at_offset(int fd, long path, long file_size, long map_size, long offset) {
        long __functionAddress = Functions.module_create_from_fd_at_offset;
        return invokePPPJP(fd, path, file_size, map_size, offset, __functionAddress);
    }

    /** Loads an object file from disk. The seek point of {@code fd} is not preserved. Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details). */
    @NativeType("lto_module_t")
    public static long lto_module_create_from_fd_at_offset(int fd, @NativeType("char const *") ByteBuffer path, @NativeType("size_t") long file_size, @NativeType("size_t") long map_size, @NativeType("off_t") long offset) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_create_from_fd_at_offset(fd, memAddress(path), file_size, map_size, offset);
    }

    /** Loads an object file from disk. The seek point of {@code fd} is not preserved. Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details). */
    @NativeType("lto_module_t")
    public static long lto_module_create_from_fd_at_offset(int fd, @NativeType("char const *") CharSequence path, @NativeType("size_t") long file_size, @NativeType("size_t") long map_size, @NativeType("off_t") long offset) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nlto_module_create_from_fd_at_offset(fd, pathEncoded, file_size, map_size, offset);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_module_dispose ] ---

    /** Frees all memory internally allocated by the module. Upon return the {@code lto_module_t} is no longer valid. */
    public static void lto_module_dispose(@NativeType("lto_module_t") long mod) {
        long __functionAddress = Functions.module_dispose;
        if (CHECKS) {
            check(mod);
        }
        invokePV(mod, __functionAddress);
    }

    // --- [ lto_module_get_target_triple ] ---

    /** Unsafe version of: {@link #lto_module_get_target_triple module_get_target_triple} */
    public static long nlto_module_get_target_triple(long mod) {
        long __functionAddress = Functions.module_get_target_triple;
        if (CHECKS) {
            check(mod);
        }
        return invokePP(mod, __functionAddress);
    }

    /** Returns triple string which the object module was compiled under. */
    @Nullable
    @NativeType("char const *")
    public static String lto_module_get_target_triple(@NativeType("lto_module_t") long mod) {
        long __result = nlto_module_get_target_triple(mod);
        return memUTF8Safe(__result);
    }

    // --- [ lto_module_set_target_triple ] ---

    /** Unsafe version of: {@link #lto_module_set_target_triple module_set_target_triple} */
    public static void nlto_module_set_target_triple(long mod, long triple) {
        long __functionAddress = Functions.module_set_target_triple;
        if (CHECKS) {
            check(mod);
        }
        invokePPV(mod, triple, __functionAddress);
    }

    /** Sets triple string with which the object will be codegened. */
    public static void lto_module_set_target_triple(@NativeType("lto_module_t") long mod, @NativeType("char const *") ByteBuffer triple) {
        if (CHECKS) {
            checkNT1(triple);
        }
        nlto_module_set_target_triple(mod, memAddress(triple));
    }

    /** Sets triple string with which the object will be codegened. */
    public static void lto_module_set_target_triple(@NativeType("lto_module_t") long mod, @NativeType("char const *") CharSequence triple) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(triple, true);
            long tripleEncoded = stack.getPointerAddress();
            nlto_module_set_target_triple(mod, tripleEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_module_get_num_symbols ] ---

    /** Returns the number of symbols in the object module. */
    @NativeType("unsigned int")
    public static int lto_module_get_num_symbols(@NativeType("lto_module_t") long mod) {
        long __functionAddress = Functions.module_get_num_symbols;
        if (CHECKS) {
            check(mod);
        }
        return invokePI(mod, __functionAddress);
    }

    // --- [ lto_module_get_symbol_name ] ---

    /** Unsafe version of: {@link #lto_module_get_symbol_name module_get_symbol_name} */
    public static long nlto_module_get_symbol_name(long mod, int index) {
        long __functionAddress = Functions.module_get_symbol_name;
        if (CHECKS) {
            check(mod);
        }
        return invokePP(mod, index, __functionAddress);
    }

    /** Returns the name of the ith symbol in the object module. */
    @Nullable
    @NativeType("char const *")
    public static String lto_module_get_symbol_name(@NativeType("lto_module_t") long mod, @NativeType("unsigned int") int index) {
        long __result = nlto_module_get_symbol_name(mod, index);
        return memUTF8Safe(__result);
    }

    // --- [ lto_module_get_symbol_attribute ] ---

    /** Returns the attributes of the ith symbol in the object module. */
    @NativeType("lto_symbol_attributes")
    public static int lto_module_get_symbol_attribute(@NativeType("lto_module_t") long mod, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.module_get_symbol_attribute;
        if (CHECKS) {
            check(mod);
        }
        return invokePI(mod, index, __functionAddress);
    }

    // --- [ lto_module_get_linkeropts ] ---

    /** Unsafe version of: {@link #lto_module_get_linkeropts module_get_linkeropts} */
    public static long nlto_module_get_linkeropts(long mod) {
        long __functionAddress = Functions.module_get_linkeropts;
        if (CHECKS) {
            check(mod);
        }
        return invokePP(mod, __functionAddress);
    }

    /**
     * Returns the module's linker options.
     * 
     * <p>The linker options may consist of multiple flags. It is the linker's responsibility to split the flags using a platform-specific mechanism.</p>
     */
    @Nullable
    @NativeType("char const *")
    public static String lto_module_get_linkeropts(@NativeType("lto_module_t") long mod) {
        long __result = nlto_module_get_linkeropts(mod);
        return memUTF8Safe(__result);
    }

    // --- [ lto_codegen_set_diagnostic_handler ] ---

    /** Unsafe version of: {@link #lto_codegen_set_diagnostic_handler codegen_set_diagnostic_handler} */
    public static void nlto_codegen_set_diagnostic_handler(long cg, long handler, long ctxt) {
        long __functionAddress = Functions.codegen_set_diagnostic_handler;
        if (CHECKS) {
            check(cg);
            check(ctxt);
        }
        invokePPPV(cg, handler, ctxt, __functionAddress);
    }

    /**
     * Set a diagnostic handler and the related context ({@code void *}). This is more general than {@link #lto_get_error_message get_error_message}, as the diagnostic handler can be
     * called at anytime within lto.
     */
    public static void lto_codegen_set_diagnostic_handler(@NativeType("lto_code_gen_t") long cg, @NativeType("void (*) (lto_codegen_diagnostic_severity_t, char const *, void *)") LTODiagnosticHandlerI handler, @NativeType("void *") long ctxt) {
        nlto_codegen_set_diagnostic_handler(cg, handler.address(), ctxt);
    }

    // --- [ lto_codegen_create ] ---

    /**
     * Instantiates a code generator. Returns {@code NULL} on error (check {@link #lto_get_error_message get_error_message} for details).
     * 
     * <p>All modules added using {@link #lto_codegen_add_module codegen_add_module} must have been created in the same context as the codegen.</p>
     */
    @NativeType("lto_code_gen_t")
    public static long lto_codegen_create() {
        long __functionAddress = Functions.codegen_create;
        return invokeP(__functionAddress);
    }

    // --- [ lto_codegen_create_in_local_context ] ---

    /**
     * Instantiate a code generator in its own context.
     * 
     * <p>Instantiates a code generator in its own context. Modules added via {@link #lto_codegen_add_module codegen_add_module} must have all been created in the same context, using
     * {@link #lto_module_create_in_codegen_context module_create_in_codegen_context}.</p>
     */
    @NativeType("lto_code_gen_t")
    public static long lto_codegen_create_in_local_context() {
        long __functionAddress = Functions.codegen_create_in_local_context;
        return invokeP(__functionAddress);
    }

    // --- [ lto_codegen_dispose ] ---

    /** Frees all code generator and all memory it internally allocated. Upon return the {@code lto_code_gen_t} is no longer valid. */
    public static void lto_codegen_dispose(@NativeType("lto_code_gen_t") long cg) {
        long __functionAddress = Functions.codegen_dispose;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, __functionAddress);
    }

    // --- [ lto_codegen_add_module ] ---

    /**
     * Add an object module to the set of modules for which code will be generated. Returns true on error (check {@link #lto_get_error_message get_error_message} for details).
     * 
     * <p>{@code cg} and {@code mod} must both be in the same context. See {@link #lto_codegen_create_in_local_context codegen_create_in_local_context} and {@link #lto_module_create_in_codegen_context module_create_in_codegen_context}.</p>
     */
    @NativeType("lto_bool_t")
    public static boolean lto_codegen_add_module(@NativeType("lto_code_gen_t") long cg, @NativeType("lto_module_t") long mod) {
        long __functionAddress = Functions.codegen_add_module;
        if (CHECKS) {
            check(cg);
            check(mod);
        }
        return invokePPZ(cg, mod, __functionAddress);
    }

    // --- [ lto_codegen_set_module ] ---

    /**
     * Sets the object module for code generation. This will transfer the ownership of the module to the code generator.
     * 
     * <p>{@code cg} and {@code mod} must both be in the same context.</p>
     */
    public static void lto_codegen_set_module(@NativeType("lto_code_gen_t") long cg, @NativeType("lto_module_t") long mod) {
        long __functionAddress = Functions.codegen_set_module;
        if (CHECKS) {
            check(cg);
            check(mod);
        }
        invokePPV(cg, mod, __functionAddress);
    }

    // --- [ lto_codegen_set_debug_model ] ---

    /** Sets if debug info should be generated. Returns true on error (check {@link #lto_get_error_message get_error_message} for details). */
    @NativeType("lto_bool_t")
    public static boolean lto_codegen_set_debug_model(@NativeType("lto_code_gen_t") long cg, @NativeType("lto_debug_model") int model) {
        long __functionAddress = Functions.codegen_set_debug_model;
        if (CHECKS) {
            check(cg);
        }
        return invokePZ(cg, model, __functionAddress);
    }

    // --- [ lto_codegen_set_pic_model ] ---

    /** Sets which PIC code model to generated. Returns true on error (check {@link #lto_get_error_message get_error_message} for details). */
    @NativeType("lto_bool_t")
    public static boolean lto_codegen_set_pic_model(@NativeType("lto_code_gen_t") long cg, @NativeType("lto_codegen_model") int model) {
        long __functionAddress = Functions.codegen_set_pic_model;
        if (CHECKS) {
            check(cg);
        }
        return invokePZ(cg, model, __functionAddress);
    }

    // --- [ lto_codegen_set_cpu ] ---

    /** Unsafe version of: {@link #lto_codegen_set_cpu codegen_set_cpu} */
    public static void nlto_codegen_set_cpu(long cg, long cpu) {
        long __functionAddress = Functions.codegen_set_cpu;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, cpu, __functionAddress);
    }

    /** Sets the cpu to generate code for. */
    public static void lto_codegen_set_cpu(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer cpu) {
        if (CHECKS) {
            checkNT1(cpu);
        }
        nlto_codegen_set_cpu(cg, memAddress(cpu));
    }

    /** Sets the cpu to generate code for. */
    public static void lto_codegen_set_cpu(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") CharSequence cpu) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(cpu, true);
            long cpuEncoded = stack.getPointerAddress();
            nlto_codegen_set_cpu(cg, cpuEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_codegen_set_assembler_path ] ---

    /** Unsafe version of: {@link #lto_codegen_set_assembler_path codegen_set_assembler_path} */
    public static void nlto_codegen_set_assembler_path(long cg, long path) {
        long __functionAddress = Functions.codegen_set_assembler_path;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, path, __functionAddress);
    }

    /** Sets the location of the assembler tool to run. If not set, libLTO will use gcc to invoke the assembler. */
    public static void lto_codegen_set_assembler_path(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        nlto_codegen_set_assembler_path(cg, memAddress(path));
    }

    /** Sets the location of the assembler tool to run. If not set, libLTO will use gcc to invoke the assembler. */
    public static void lto_codegen_set_assembler_path(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nlto_codegen_set_assembler_path(cg, pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_codegen_set_assembler_args ] ---

    /** Unsafe version of: {@link #lto_codegen_set_assembler_args codegen_set_assembler_args} */
    public static void nlto_codegen_set_assembler_args(long cg, long args, int nargs) {
        long __functionAddress = Functions.codegen_set_assembler_args;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, args, nargs, __functionAddress);
    }

    /** Sets extra arguments that libLTO should pass to the assembler. */
    public static void lto_codegen_set_assembler_args(@NativeType("lto_code_gen_t") long cg, @NativeType("char const **") PointerBuffer args) {
        nlto_codegen_set_assembler_args(cg, memAddress(args), args.remaining());
    }

    // --- [ lto_codegen_add_must_preserve_symbol ] ---

    /** Unsafe version of: {@link #lto_codegen_add_must_preserve_symbol codegen_add_must_preserve_symbol} */
    public static void nlto_codegen_add_must_preserve_symbol(long cg, long symbol) {
        long __functionAddress = Functions.codegen_add_must_preserve_symbol;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, symbol, __functionAddress);
    }

    /**
     * Adds to a list of all global symbols that must exist in the final generated code. If a function is not listed there, it might be inlined into every
     * usage and optimized away.
     */
    public static void lto_codegen_add_must_preserve_symbol(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer symbol) {
        if (CHECKS) {
            checkNT1(symbol);
        }
        nlto_codegen_add_must_preserve_symbol(cg, memAddress(symbol));
    }

    /**
     * Adds to a list of all global symbols that must exist in the final generated code. If a function is not listed there, it might be inlined into every
     * usage and optimized away.
     */
    public static void lto_codegen_add_must_preserve_symbol(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") CharSequence symbol) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(symbol, true);
            long symbolEncoded = stack.getPointerAddress();
            nlto_codegen_add_must_preserve_symbol(cg, symbolEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_codegen_write_merged_modules ] ---

    /** Unsafe version of: {@link #lto_codegen_write_merged_modules codegen_write_merged_modules} */
    public static boolean nlto_codegen_write_merged_modules(long cg, long path) {
        long __functionAddress = Functions.codegen_write_merged_modules;
        if (CHECKS) {
            check(cg);
        }
        return invokePPZ(cg, path, __functionAddress);
    }

    /**
     * Writes a new object file at the specified path that contains the merged contents of all modules added so far. Returns true on error (check
     * {@link #lto_get_error_message get_error_message} for details).
     */
    @NativeType("lto_bool_t")
    public static boolean lto_codegen_write_merged_modules(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_codegen_write_merged_modules(cg, memAddress(path));
    }

    /**
     * Writes a new object file at the specified path that contains the merged contents of all modules added so far. Returns true on error (check
     * {@link #lto_get_error_message get_error_message} for details).
     */
    @NativeType("lto_bool_t")
    public static boolean lto_codegen_write_merged_modules(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nlto_codegen_write_merged_modules(cg, pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_codegen_compile ] ---

    /** Unsafe version of: {@link #lto_codegen_compile codegen_compile} */
    public static long nlto_codegen_compile(long cg, long length) {
        long __functionAddress = Functions.codegen_compile;
        if (CHECKS) {
            check(cg);
        }
        return invokePPP(cg, length, __functionAddress);
    }

    /**
     * Generates code for all added modules into one native object file. This calls {@link #lto_codegen_optimize codegen_optimize} then {@link #lto_codegen_compile_optimized codegen_compile_optimized}.
     * 
     * <p>On success returns a pointer to a generated mach-o/ELF buffer and length set to the buffer size. The buffer is owned by the {@code lto_code_gen_t} and
     * will be freed when {@link #lto_codegen_dispose codegen_dispose} is called, or {@code lto_codegen_compile()} is called again. On failure, returns {@code NULL} (check
     * {@link #lto_get_error_message get_error_message} for details).</p>
     */
    @Nullable
    @NativeType("void const *")
    public static ByteBuffer lto_codegen_compile(@NativeType("lto_code_gen_t") long cg) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer length = stack.callocPointer(1);
        try {
            long __result = nlto_codegen_compile(cg, memAddress(length));
            return memByteBufferSafe(__result, (int)length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_codegen_compile_to_file ] ---

    /** Unsafe version of: {@link #lto_codegen_compile_to_file codegen_compile_to_file} */
    public static boolean nlto_codegen_compile_to_file(long cg, long name) {
        long __functionAddress = Functions.codegen_compile_to_file;
        if (CHECKS) {
            check(cg);
        }
        return invokePPZ(cg, name, __functionAddress);
    }

    /**
     * Generates code for all added modules into one native object file. This calls {@link #lto_codegen_optimize codegen_optimize} then {@link #lto_codegen_compile_optimized codegen_compile_optimized} (instead of
     * returning a generated mach-o/ELF buffer, it writes to a file).
     * 
     * <p>The name of the file is written to name. Returns true on error.</p>
     */
    @NativeType("lto_bool_t")
    public static boolean lto_codegen_compile_to_file(@NativeType("lto_code_gen_t") long cg, @NativeType("char const **") PointerBuffer name) {
        if (CHECKS) {
            check(name, 1);
        }
        return nlto_codegen_compile_to_file(cg, memAddress(name));
    }

    // --- [ lto_codegen_optimize ] ---

    /** Runs optimization for the merged module. Returns true on error. */
    @NativeType("lto_bool_t")
    public static boolean lto_codegen_optimize(@NativeType("lto_code_gen_t") long cg) {
        long __functionAddress = Functions.codegen_optimize;
        if (CHECKS) {
            check(cg);
        }
        return invokePZ(cg, __functionAddress);
    }

    // --- [ lto_codegen_compile_optimized ] ---

    /** Unsafe version of: {@link #lto_codegen_compile_optimized codegen_compile_optimized} */
    public static long nlto_codegen_compile_optimized(long cg, long length) {
        long __functionAddress = Functions.codegen_compile_optimized;
        if (CHECKS) {
            check(cg);
        }
        return invokePPP(cg, length, __functionAddress);
    }

    /**
     * Generates code for the optimized merged module into one native object file. It will not run any IR optimizations on the merged module.
     * 
     * <p>On success returns a pointer to a generated mach-o/ELF buffer and length set to the buffer size. The buffer is owned by the {@code lto_code_gen_t} and
     * will be freed when {@link #lto_codegen_dispose codegen_dispose} is called, or {@code lto_codegen_compile_optimized()} is called again. On failure, returns {@code NULL} (check
     * {@link #lto_get_error_message get_error_message} for details).</p>
     */
    @Nullable
    @NativeType("void const *")
    public static ByteBuffer lto_codegen_compile_optimized(@NativeType("lto_code_gen_t") long cg) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer length = stack.callocPointer(1);
        try {
            long __result = nlto_codegen_compile_optimized(cg, memAddress(length));
            return memByteBufferSafe(__result, (int)length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_api_version ] ---

    /** Returns the runtime API version. */
    @NativeType("unsigned int")
    public static int lto_api_version() {
        long __functionAddress = Functions.api_version;
        return invokeI(__functionAddress);
    }

    // --- [ lto_codegen_debug_options ] ---

    /** Unsafe version of: {@link #lto_codegen_debug_options codegen_debug_options} */
    public static void nlto_codegen_debug_options(long cg, long options) {
        long __functionAddress = Functions.codegen_debug_options;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, options, __functionAddress);
    }

    /** Sets options to help debug codegen bugs. */
    public static void lto_codegen_debug_options(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer options) {
        if (CHECKS) {
            checkNT1(options);
        }
        nlto_codegen_debug_options(cg, memAddress(options));
    }

    /** Sets options to help debug codegen bugs. */
    public static void lto_codegen_debug_options(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") CharSequence options) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(options, true);
            long optionsEncoded = stack.getPointerAddress();
            nlto_codegen_debug_options(cg, optionsEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_initialize_disassembler ] ---

    /** Initializes LLVM disassemblers. */
    public static void lto_initialize_disassembler() {
        long __functionAddress = Functions.initialize_disassembler;
        invokeV(__functionAddress);
    }

    // --- [ lto_codegen_set_should_internalize ] ---

    /** Sets if we should run internalize pass during optimization and code generation. */
    public static void lto_codegen_set_should_internalize(@NativeType("lto_code_gen_t") long cg, @NativeType("lto_bool_t") boolean ShouldInternalize) {
        long __functionAddress = Functions.codegen_set_should_internalize;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, ShouldInternalize, __functionAddress);
    }

    // --- [ lto_codegen_set_should_embed_uselists ] ---

    /**
     * Set whether to embed uselists in bitcode.
     * 
     * <p>Sets whether {@link #lto_codegen_write_merged_modules codegen_write_merged_modules} should embed uselists in output bitcode. This should be turned on for all {@code -save-temps} output.</p>
     */
    public static void lto_codegen_set_should_embed_uselists(@NativeType("lto_code_gen_t") long cg, @NativeType("lto_bool_t") boolean ShouldEmbedUselists) {
        long __functionAddress = Functions.codegen_set_should_embed_uselists;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, ShouldEmbedUselists, __functionAddress);
    }

    // --- [ thinlto_create_codegen ] ---

    /**
     * Instantiates a ThinLTO code generator. Returns {@code NULL} on error (check lto_get_error_message() for details).
     * 
     * <p>The {@code ThinLTOCodeGenerator} is not intended to be reuse for multiple compilation: the model is that the client adds modules to the generator and
     * ask to perform the ThinLTO optimizations / codegen, and finally destroys the codegenerator.</p>
     */
    @NativeType("thinlto_code_gen_t")
    public static long thinlto_create_codegen() {
        long __functionAddress = Functions.thinlto_create_codegen;
        return invokeP(__functionAddress);
    }

    // --- [ thinlto_codegen_dispose ] ---

    /** Frees the generator and all memory it internally allocated. Upon return the {@code thinlto_code_gen_t} is no longer valid. */
    public static void thinlto_codegen_dispose(@NativeType("thinlto_code_gen_t") long cg) {
        long __functionAddress = Functions.thinlto_codegen_dispose;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, __functionAddress);
    }

    // --- [ thinlto_codegen_add_module ] ---

    /** Unsafe version of: {@link #thinlto_codegen_add_module} */
    public static void nthinlto_codegen_add_module(long cg, long identifier, long data, int length) {
        long __functionAddress = Functions.thinlto_codegen_add_module;
        if (CHECKS) {
            check(cg);
        }
        invokePPPV(cg, identifier, data, length, __functionAddress);
    }

    /**
     * Add a module to a ThinLTO code generator. Identifier has to be unique among all the modules in a code generator. The data buffer stays owned by the
     * client, and is expected to be available for the entire lifetime of the {@code thinlto_code_gen_t} it is added to.
     * 
     * <p>On failure, returns {@code NULL} (check {@link #lto_get_error_message get_error_message} for details).</p>
     */
    public static void thinlto_codegen_add_module(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer identifier, @NativeType("char const *") ByteBuffer data) {
        if (CHECKS) {
            checkNT1(identifier);
        }
        nthinlto_codegen_add_module(cg, memAddress(identifier), memAddress(data), data.remaining());
    }

    /**
     * Add a module to a ThinLTO code generator. Identifier has to be unique among all the modules in a code generator. The data buffer stays owned by the
     * client, and is expected to be available for the entire lifetime of the {@code thinlto_code_gen_t} it is added to.
     * 
     * <p>On failure, returns {@code NULL} (check {@link #lto_get_error_message get_error_message} for details).</p>
     */
    public static void thinlto_codegen_add_module(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") CharSequence identifier, @NativeType("char const *") ByteBuffer data) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(identifier, true);
            long identifierEncoded = stack.getPointerAddress();
            nthinlto_codegen_add_module(cg, identifierEncoded, memAddress(data), data.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ thinlto_codegen_process ] ---

    /** Optimize and codegen all the modules added to the codegenerator using ThinLTO. Resulting objects are accessible using {@link #thinlto_module_get_object}. */
    public static void thinlto_codegen_process(@NativeType("thinlto_code_gen_t") long cg) {
        long __functionAddress = Functions.thinlto_codegen_process;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, __functionAddress);
    }

    // --- [ thinlto_module_get_num_objects ] ---

    /**
     * Returns the number of object files produced by the ThinLTO CodeGenerator.
     * 
     * <p>It usually matches the number of input files, but this is not a guarantee of the API and may change in future implementation, so the client should not
     * assume it.</p>
     */
    @NativeType("unsigned int")
    public static int thinlto_module_get_num_objects(@NativeType("thinlto_code_gen_t") long cg) {
        long __functionAddress = Functions.thinlto_module_get_num_objects;
        if (CHECKS) {
            check(cg);
        }
        return invokePI(cg, __functionAddress);
    }

    // --- [ thinlto_module_get_object ] ---

    /** Unsafe version of: {@link #thinlto_module_get_object} */
    public static native void nthinlto_module_get_object(long cg, int index, long __functionAddress, long __result);

    /** Unsafe version of: {@link #thinlto_module_get_object} */
    public static void nthinlto_module_get_object(long cg, int index, long __result) {
        long __functionAddress = Functions.thinlto_module_get_object;
        if (CHECKS) {
            check(cg);
        }
        nthinlto_module_get_object(cg, index, __functionAddress, __result);
    }

    /**
     * Returns a reference to the ith object file produced by the ThinLTO CodeGenerator.
     * 
     * <p>Client should use {@link #thinlto_module_get_num_objects} to get the number of available objects.</p>
     */
    public static LTOObjectBuffer thinlto_module_get_object(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int index, LTOObjectBuffer __result) {
        nthinlto_module_get_object(cg, index, __result.address());
        return __result;
    }

    // --- [ thinlto_module_get_num_object_files ] ---

    /**
     * Returns the number of object files produced by the ThinLTO CodeGenerator.
     * 
     * <p>It usually matches the number of input files, but this is not a guarantee of the API and may change in future implementation, so the client should not
     * assume it.</p>
     */
    @NativeType("unsigned int")
    public static int thinlto_module_get_num_object_files(@NativeType("thinlto_code_gen_t") long cg) {
        long __functionAddress = Functions.thinlto_module_get_num_object_files;
        if (CHECKS) {
            check(cg);
        }
        return invokePI(cg, __functionAddress);
    }

    // --- [ thinlto_module_get_object_file ] ---

    /** Unsafe version of: {@link #thinlto_module_get_object_file} */
    public static long nthinlto_module_get_object_file(long cg, int index) {
        long __functionAddress = Functions.thinlto_module_get_object_file;
        if (CHECKS) {
            check(cg);
        }
        return invokePP(cg, index, __functionAddress);
    }

    /**
     * Returns the path to the ith object file produced by the ThinLTO CodeGenerator.
     * 
     * <p>Client should use {@link #thinlto_module_get_num_object_files} to get the number of available objects.</p>
     */
    @Nullable
    @NativeType("char const *")
    public static String thinlto_module_get_object_file(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int index) {
        long __result = nthinlto_module_get_object_file(cg, index);
        return memUTF8Safe(__result);
    }

    // --- [ thinlto_codegen_set_pic_model ] ---

    /** Sets which PIC code model to generate. Returns true on error (check {@link #lto_get_error_message get_error_message} for details). */
    @NativeType("lto_bool_t")
    public static boolean thinlto_codegen_set_pic_model(@NativeType("thinlto_code_gen_t") long cg, @NativeType("lto_codegen_model") int model) {
        long __functionAddress = Functions.thinlto_codegen_set_pic_model;
        if (CHECKS) {
            check(cg);
        }
        return invokePZ(cg, model, __functionAddress);
    }

    // --- [ thinlto_codegen_set_savetemps_dir ] ---

    /** Unsafe version of: {@link #thinlto_codegen_set_savetemps_dir} */
    public static void nthinlto_codegen_set_savetemps_dir(long cg, long save_temps_dir) {
        long __functionAddress = Functions.thinlto_codegen_set_savetemps_dir;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, save_temps_dir, __functionAddress);
    }

    /**
     * Sets the path to a directory to use as a storage for temporary bitcode files. The intention is to make the bitcode files available for debugging at
     * various stage of the pipeline.
     */
    public static void thinlto_codegen_set_savetemps_dir(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer save_temps_dir) {
        if (CHECKS) {
            checkNT1(save_temps_dir);
        }
        nthinlto_codegen_set_savetemps_dir(cg, memAddress(save_temps_dir));
    }

    /**
     * Sets the path to a directory to use as a storage for temporary bitcode files. The intention is to make the bitcode files available for debugging at
     * various stage of the pipeline.
     */
    public static void thinlto_codegen_set_savetemps_dir(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") CharSequence save_temps_dir) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(save_temps_dir, true);
            long save_temps_dirEncoded = stack.getPointerAddress();
            nthinlto_codegen_set_savetemps_dir(cg, save_temps_dirEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ thinlto_set_generated_objects_dir ] ---

    /** Unsafe version of: {@link #thinlto_set_generated_objects_dir} */
    public static void nthinlto_set_generated_objects_dir(long cg, long save_temps_dir) {
        long __functionAddress = Functions.thinlto_set_generated_objects_dir;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, save_temps_dir, __functionAddress);
    }

    /**
     * Set the path to a directory where to save generated object files. This path can be used by a linker to request on-disk files instead of in-memory
     * buffers. When set, results are available through {@link #thinlto_module_get_object_file} instead of {@link #thinlto_module_get_object}.
     */
    public static void thinlto_set_generated_objects_dir(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer save_temps_dir) {
        if (CHECKS) {
            checkNT1(save_temps_dir);
        }
        nthinlto_set_generated_objects_dir(cg, memAddress(save_temps_dir));
    }

    /**
     * Set the path to a directory where to save generated object files. This path can be used by a linker to request on-disk files instead of in-memory
     * buffers. When set, results are available through {@link #thinlto_module_get_object_file} instead of {@link #thinlto_module_get_object}.
     */
    public static void thinlto_set_generated_objects_dir(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") CharSequence save_temps_dir) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(save_temps_dir, true);
            long save_temps_dirEncoded = stack.getPointerAddress();
            nthinlto_set_generated_objects_dir(cg, save_temps_dirEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ thinlto_codegen_set_cpu ] ---

    /** Unsafe version of: {@link #thinlto_codegen_set_cpu} */
    public static void nthinlto_codegen_set_cpu(long cg, long cpu) {
        long __functionAddress = Functions.thinlto_codegen_set_cpu;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, cpu, __functionAddress);
    }

    /** Sets the cpu to generate code for. */
    public static void thinlto_codegen_set_cpu(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer cpu) {
        if (CHECKS) {
            checkNT1(cpu);
        }
        nthinlto_codegen_set_cpu(cg, memAddress(cpu));
    }

    /** Sets the cpu to generate code for. */
    public static void thinlto_codegen_set_cpu(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") CharSequence cpu) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(cpu, true);
            long cpuEncoded = stack.getPointerAddress();
            nthinlto_codegen_set_cpu(cg, cpuEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ thinlto_codegen_disable_codegen ] ---

    /** Disable CodeGen, only run the stages till codegen and stop. The output will be bitcode. */
    public static void thinlto_codegen_disable_codegen(@NativeType("thinlto_code_gen_t") long cg, @NativeType("lto_bool_t") boolean disable) {
        long __functionAddress = Functions.thinlto_codegen_disable_codegen;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, disable, __functionAddress);
    }

    // --- [ thinlto_codegen_set_codegen_only ] ---

    /** Perform CodeGen only: disable all other stages. */
    public static void thinlto_codegen_set_codegen_only(@NativeType("thinlto_code_gen_t") long cg, @NativeType("lto_bool_t") boolean codegen_only) {
        long __functionAddress = Functions.thinlto_codegen_set_codegen_only;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, codegen_only, __functionAddress);
    }

    // --- [ thinlto_debug_options ] ---

    /** Unsafe version of: {@link #thinlto_debug_options} */
    public static void nthinlto_debug_options(long options, int number) {
        long __functionAddress = Functions.thinlto_debug_options;
        invokePV(options, number, __functionAddress);
    }

    /** Parse {@code -mllvm} style debug options. */
    public static void thinlto_debug_options(@NativeType("char const * const *") PointerBuffer options) {
        nthinlto_debug_options(memAddress(options), options.remaining());
    }

    // --- [ lto_module_is_thinlto ] ---

    /** Test if a module has support for ThinLTO linking. */
    @NativeType("lto_bool_t")
    public static boolean lto_module_is_thinlto(@NativeType("lto_module_t") long mod) {
        long __functionAddress = Functions.module_is_thinlto;
        if (CHECKS) {
            check(mod);
        }
        return invokePZ(mod, __functionAddress);
    }

    // --- [ thinlto_codegen_add_must_preserve_symbol ] ---

    /** Unsafe version of: {@link #thinlto_codegen_add_must_preserve_symbol} */
    public static void nthinlto_codegen_add_must_preserve_symbol(long cg, long name, int length) {
        long __functionAddress = Functions.thinlto_codegen_add_must_preserve_symbol;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, name, length, __functionAddress);
    }

    /**
     * Adds a symbol to the list of global symbols that must exist in the final generated code. If a function is not listed there, it might be inlined into
     * every usage and optimized away. For every single module, the functions referenced from code outside of the ThinLTO modules need to be added here.
     */
    public static void thinlto_codegen_add_must_preserve_symbol(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer name) {
        nthinlto_codegen_add_must_preserve_symbol(cg, memAddress(name), name.remaining());
    }

    /**
     * Adds a symbol to the list of global symbols that must exist in the final generated code. If a function is not listed there, it might be inlined into
     * every usage and optimized away. For every single module, the functions referenced from code outside of the ThinLTO modules need to be added here.
     */
    public static void thinlto_codegen_add_must_preserve_symbol(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nUTF8(name, false);
            long nameEncoded = stack.getPointerAddress();
            nthinlto_codegen_add_must_preserve_symbol(cg, nameEncoded, nameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ thinlto_codegen_add_cross_referenced_symbol ] ---

    /** Unsafe version of: {@link #thinlto_codegen_add_cross_referenced_symbol} */
    public static void nthinlto_codegen_add_cross_referenced_symbol(long cg, long name, int length) {
        long __functionAddress = Functions.thinlto_codegen_add_cross_referenced_symbol;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, name, length, __functionAddress);
    }

    /**
     * Adds a symbol to the list of global symbols that are cross-referenced between ThinLTO files. If the ThinLTO CodeGenerator can ensure that every
     * references from a ThinLTO module to this symbol is optimized away, then the symbol can be discarded.
     */
    public static void thinlto_codegen_add_cross_referenced_symbol(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer name) {
        nthinlto_codegen_add_cross_referenced_symbol(cg, memAddress(name), name.remaining());
    }

    /**
     * Adds a symbol to the list of global symbols that are cross-referenced between ThinLTO files. If the ThinLTO CodeGenerator can ensure that every
     * references from a ThinLTO module to this symbol is optimized away, then the symbol can be discarded.
     */
    public static void thinlto_codegen_add_cross_referenced_symbol(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nUTF8(name, false);
            long nameEncoded = stack.getPointerAddress();
            nthinlto_codegen_add_cross_referenced_symbol(cg, nameEncoded, nameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ thinlto_codegen_set_cache_dir ] ---

    /** Unsafe version of: {@link #thinlto_codegen_set_cache_dir} */
    public static void nthinlto_codegen_set_cache_dir(long cg, long cache_dir) {
        long __functionAddress = Functions.thinlto_codegen_set_cache_dir;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, cache_dir, __functionAddress);
    }

    /** Sets the path to a directory to use as a cache storage for incremental build. Setting this activates caching. */
    public static void thinlto_codegen_set_cache_dir(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer cache_dir) {
        if (CHECKS) {
            checkNT1(cache_dir);
        }
        nthinlto_codegen_set_cache_dir(cg, memAddress(cache_dir));
    }

    /** Sets the path to a directory to use as a cache storage for incremental build. Setting this activates caching. */
    public static void thinlto_codegen_set_cache_dir(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") CharSequence cache_dir) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(cache_dir, true);
            long cache_dirEncoded = stack.getPointerAddress();
            nthinlto_codegen_set_cache_dir(cg, cache_dirEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ thinlto_codegen_set_cache_pruning_interval ] ---

    /**
     * Sets the cache pruning interval (in seconds). A negative value disables the pruning. An unspecified default value will be applied, and a value of 0
     * will force prunning to occur.
     */
    public static void thinlto_codegen_set_cache_pruning_interval(@NativeType("thinlto_code_gen_t") long cg, int interval) {
        long __functionAddress = Functions.thinlto_codegen_set_cache_pruning_interval;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, interval, __functionAddress);
    }

    // --- [ thinlto_codegen_set_final_cache_size_relative_to_available_space ] ---

    /**
     * Sets the maximum cache size that can be persistent across build, in terms of percentage of the available space on the disk. Set to 100 to indicate no
     * limit, 50 to indicate that the cache size will not be left over half the available space. A value over 100 will be reduced to 100, a value of 0 will be
     * ignored. An unspecified default value will be applied.
     * 
     * <p>The formula looks like: {@code AvailableSpace = FreeSpace + ExistingCacheSize NewCacheSize = AvailableSpace * P/100}</p>
     */
    public static void thinlto_codegen_set_final_cache_size_relative_to_available_space(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int percentage) {
        long __functionAddress = Functions.thinlto_codegen_set_final_cache_size_relative_to_available_space;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, percentage, __functionAddress);
    }

    // --- [ thinlto_codegen_set_cache_entry_expiration ] ---

    /** Sets the expiration (in seconds) for an entry in the cache. An unspecified default value will be applied. A value of 0 will be ignored. */
    public static void thinlto_codegen_set_cache_entry_expiration(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int expiration) {
        long __functionAddress = Functions.thinlto_codegen_set_cache_entry_expiration;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, expiration, __functionAddress);
    }

    // --- [ thinlto_codegen_set_cache_size_bytes ] ---

    /**
     * Sets the maximum size of the cache directory (in bytes). A value over the amount of available space on the disk will be reduced to the amount of
     * available space. An unspecified default value will be applied. A value of 0 will be ignored.
     */
    public static void thinlto_codegen_set_cache_size_bytes(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int max_size_bytes) {
        long __functionAddress = Functions.thinlto_codegen_set_cache_size_bytes;
        if (CHECKS) {
            check(__functionAddress);
            check(cg);
        }
        invokePV(cg, max_size_bytes, __functionAddress);
    }

    // --- [ thinlto_codegen_set_cache_size_megabytes ] ---

    /** Same as {@link #thinlto_codegen_set_cache_size_bytes}, except the maximum size is in megabytes (2<sup>20</sup> bytes). */
    public static void thinlto_codegen_set_cache_size_megabytes(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int max_size_megabytes) {
        long __functionAddress = Functions.thinlto_codegen_set_cache_size_megabytes;
        if (CHECKS) {
            check(__functionAddress);
            check(cg);
        }
        invokePV(cg, max_size_megabytes, __functionAddress);
    }

    // --- [ thinlto_codegen_set_cache_size_files ] ---

    /** Sets the maximum number of files in the cache directory. An unspecified default value will be applied. A value of 0 will be ignored. */
    public static void thinlto_codegen_set_cache_size_files(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int max_size_files) {
        long __functionAddress = Functions.thinlto_codegen_set_cache_size_files;
        if (CHECKS) {
            check(__functionAddress);
            check(cg);
        }
        invokePV(cg, max_size_files, __functionAddress);
    }

}