/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LLVMLTO {

    static { LibLLVM.initialize(); }

    private static final SharedLibrary LTO = Library.loadNative(LLVMLTO.class, "org.lwjgl.llvm", Configuration.LLVM_LTO_LIBRARY_NAME, "LTO");

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
            module_get_macho_cputype                                         = apiGetFunctionAddressOptional(LTO, "lto_module_get_macho_cputype"),
            module_has_ctor_dtor                                             = apiGetFunctionAddressOptional(LTO, "lto_module_has_ctor_dtor"),
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
            set_debug_options                                                = apiGetFunctionAddressOptional(LTO, "lto_set_debug_options"),
            codegen_debug_options                                            = apiGetFunctionAddress(LTO, "lto_codegen_debug_options"),
            codegen_debug_options_array                                      = apiGetFunctionAddressOptional(LTO, "lto_codegen_debug_options_array"),
            initialize_disassembler                                          = apiGetFunctionAddress(LTO, "lto_initialize_disassembler"),
            codegen_set_should_internalize                                   = apiGetFunctionAddress(LTO, "lto_codegen_set_should_internalize"),
            codegen_set_should_embed_uselists                                = apiGetFunctionAddress(LTO, "lto_codegen_set_should_embed_uselists"),
            input_create                                                     = apiGetFunctionAddressOptional(LTO, "lto_input_create"),
            input_dispose                                                    = apiGetFunctionAddressOptional(LTO, "lto_input_dispose"),
            input_get_num_dependent_libraries                                = apiGetFunctionAddressOptional(LTO, "lto_input_get_num_dependent_libraries"),
            input_get_dependent_library                                      = apiGetFunctionAddressOptional(LTO, "lto_input_get_dependent_library"),
            runtime_lib_symbols_list                                         = apiGetFunctionAddressOptional(LTO, "lto_runtime_lib_symbols_list"),
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
            thinlto_codegen_set_cache_size_bytes                             = apiGetFunctionAddressOptional(LTO, "thinlto_codegen_set_cache_size_bytes"),
            thinlto_codegen_set_cache_size_megabytes                         = apiGetFunctionAddressOptional(LTO, "thinlto_codegen_set_cache_size_megabytes"),
            thinlto_codegen_set_cache_size_files                             = apiGetFunctionAddressOptional(LTO, "thinlto_codegen_set_cache_size_files");

    }

    /** Returns the LTO {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return LTO;
    }

    public static final int LTOAPI_VERSION = 29;

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

    public static final int
        LTODEBUG_MODEL_NONE  = 0,
        LTODEBUG_MODEL_DWARF = 1;

    public static final int
        LTOCODEGEN_PIC_MODEL_STATIC         = 0,
        LTOCODEGEN_PIC_MODEL_DYNAMIC        = 1,
        LTOCODEGEN_PIC_MODEL_DYNAMIC_NO_PIC = 2,
        LTOCODEGEN_PIC_MODEL_DEFAULT        = 3;

    public static final int
        LTODS_ERROR   = 0,
        LTODS_WARNING = 1,
        LTODS_REMARK  = 3,
        LTODS_NOTE    = 2;

    protected LLVMLTO() {
        throw new UnsupportedOperationException();
    }

    // --- [ lto_get_version ] ---

    /** {@code char const * lto_get_version(void)} */
    public static long nlto_get_version() {
        long __functionAddress = Functions.get_version;
        return invokeP(__functionAddress);
    }

    /** {@code char const * lto_get_version(void)} */
    @NativeType("char const *")
    public static String lto_get_version() {
        long __result = nlto_get_version();
        return memUTF8(__result);
    }

    // --- [ lto_get_error_message ] ---

    /** {@code char const * lto_get_error_message(void)} */
    public static long nlto_get_error_message() {
        long __functionAddress = Functions.get_error_message;
        return invokeP(__functionAddress);
    }

    /** {@code char const * lto_get_error_message(void)} */
    @NativeType("char const *")
    public static @Nullable String lto_get_error_message() {
        long __result = nlto_get_error_message();
        return memUTF8Safe(__result);
    }

    // --- [ lto_module_is_object_file ] ---

    /** {@code lto_bool_t lto_module_is_object_file(char const * path)} */
    public static boolean nlto_module_is_object_file(long path) {
        long __functionAddress = Functions.module_is_object_file;
        return invokePZ(path, __functionAddress);
    }

    /** {@code lto_bool_t lto_module_is_object_file(char const * path)} */
    @NativeType("lto_bool_t")
    public static boolean lto_module_is_object_file(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_is_object_file(memAddress(path));
    }

    /** {@code lto_bool_t lto_module_is_object_file(char const * path)} */
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

    /** {@code lto_bool_t lto_module_is_object_file_for_target(char const * path, char const * target_triple_prefix)} */
    public static boolean nlto_module_is_object_file_for_target(long path, long target_triple_prefix) {
        long __functionAddress = Functions.module_is_object_file_for_target;
        return invokePPZ(path, target_triple_prefix, __functionAddress);
    }

    /** {@code lto_bool_t lto_module_is_object_file_for_target(char const * path, char const * target_triple_prefix)} */
    @NativeType("lto_bool_t")
    public static boolean lto_module_is_object_file_for_target(@NativeType("char const *") ByteBuffer path, @NativeType("char const *") ByteBuffer target_triple_prefix) {
        if (CHECKS) {
            checkNT1(path);
            checkNT1(target_triple_prefix);
        }
        return nlto_module_is_object_file_for_target(memAddress(path), memAddress(target_triple_prefix));
    }

    /** {@code lto_bool_t lto_module_is_object_file_for_target(char const * path, char const * target_triple_prefix)} */
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

    /** {@code lto_bool_t lto_module_has_objc_category(void const * mem, size_t length)} */
    public static boolean nlto_module_has_objc_category(long mem, long length) {
        long __functionAddress = Functions.module_has_objc_category;
        return invokePPZ(mem, length, __functionAddress);
    }

    /** {@code lto_bool_t lto_module_has_objc_category(void const * mem, size_t length)} */
    @NativeType("lto_bool_t")
    public static boolean lto_module_has_objc_category(@NativeType("void const *") ByteBuffer mem) {
        return nlto_module_has_objc_category(memAddress(mem), mem.remaining());
    }

    // --- [ lto_module_is_object_file_in_memory ] ---

    /** {@code lto_bool_t lto_module_is_object_file_in_memory(void const * mem, size_t length)} */
    public static boolean nlto_module_is_object_file_in_memory(long mem, long length) {
        long __functionAddress = Functions.module_is_object_file_in_memory;
        return invokePPZ(mem, length, __functionAddress);
    }

    /** {@code lto_bool_t lto_module_is_object_file_in_memory(void const * mem, size_t length)} */
    @NativeType("lto_bool_t")
    public static boolean lto_module_is_object_file_in_memory(@NativeType("void const *") ByteBuffer mem) {
        return nlto_module_is_object_file_in_memory(memAddress(mem), mem.remaining());
    }

    // --- [ lto_module_is_object_file_in_memory_for_target ] ---

    /** {@code lto_bool_t lto_module_is_object_file_in_memory_for_target(void const * mem, size_t length, char const * target_triple_prefix)} */
    public static boolean nlto_module_is_object_file_in_memory_for_target(long mem, long length, long target_triple_prefix) {
        long __functionAddress = Functions.module_is_object_file_in_memory_for_target;
        return invokePPPZ(mem, length, target_triple_prefix, __functionAddress);
    }

    /** {@code lto_bool_t lto_module_is_object_file_in_memory_for_target(void const * mem, size_t length, char const * target_triple_prefix)} */
    @NativeType("lto_bool_t")
    public static boolean lto_module_is_object_file_in_memory_for_target(@NativeType("void const *") ByteBuffer mem, @NativeType("char const *") ByteBuffer target_triple_prefix) {
        if (CHECKS) {
            checkNT1(target_triple_prefix);
        }
        return nlto_module_is_object_file_in_memory_for_target(memAddress(mem), mem.remaining(), memAddress(target_triple_prefix));
    }

    /** {@code lto_bool_t lto_module_is_object_file_in_memory_for_target(void const * mem, size_t length, char const * target_triple_prefix)} */
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

    /** {@code lto_module_t lto_module_create(char const * path)} */
    public static long nlto_module_create(long path) {
        long __functionAddress = Functions.module_create;
        return invokePP(path, __functionAddress);
    }

    /** {@code lto_module_t lto_module_create(char const * path)} */
    @NativeType("lto_module_t")
    public static long lto_module_create(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_create(memAddress(path));
    }

    /** {@code lto_module_t lto_module_create(char const * path)} */
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

    /** {@code lto_module_t lto_module_create_from_memory(void const * mem, size_t length)} */
    public static long nlto_module_create_from_memory(long mem, long length) {
        long __functionAddress = Functions.module_create_from_memory;
        return invokePPP(mem, length, __functionAddress);
    }

    /** {@code lto_module_t lto_module_create_from_memory(void const * mem, size_t length)} */
    @NativeType("lto_module_t")
    public static long lto_module_create_from_memory(@NativeType("void const *") ByteBuffer mem) {
        return nlto_module_create_from_memory(memAddress(mem), mem.remaining());
    }

    // --- [ lto_module_create_from_memory_with_path ] ---

    /** {@code lto_module_t lto_module_create_from_memory_with_path(void const * mem, size_t length, char const * path)} */
    public static long nlto_module_create_from_memory_with_path(long mem, long length, long path) {
        long __functionAddress = Functions.module_create_from_memory_with_path;
        return invokePPPP(mem, length, path, __functionAddress);
    }

    /** {@code lto_module_t lto_module_create_from_memory_with_path(void const * mem, size_t length, char const * path)} */
    @NativeType("lto_module_t")
    public static long lto_module_create_from_memory_with_path(@NativeType("void const *") ByteBuffer mem, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_create_from_memory_with_path(memAddress(mem), mem.remaining(), memAddress(path));
    }

    /** {@code lto_module_t lto_module_create_from_memory_with_path(void const * mem, size_t length, char const * path)} */
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

    /** {@code lto_module_t lto_module_create_in_local_context(void const * mem, size_t length, char const * path)} */
    public static long nlto_module_create_in_local_context(long mem, long length, long path) {
        long __functionAddress = Functions.module_create_in_local_context;
        return invokePPPP(mem, length, path, __functionAddress);
    }

    /** {@code lto_module_t lto_module_create_in_local_context(void const * mem, size_t length, char const * path)} */
    @NativeType("lto_module_t")
    public static long lto_module_create_in_local_context(@NativeType("void const *") ByteBuffer mem, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_create_in_local_context(memAddress(mem), mem.remaining(), memAddress(path));
    }

    /** {@code lto_module_t lto_module_create_in_local_context(void const * mem, size_t length, char const * path)} */
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

    /** {@code lto_module_t lto_module_create_in_codegen_context(void const * mem, size_t length, char const * path, lto_code_gen_t cg)} */
    public static long nlto_module_create_in_codegen_context(long mem, long length, long path, long cg) {
        long __functionAddress = Functions.module_create_in_codegen_context;
        if (CHECKS) {
            check(cg);
        }
        return invokePPPPP(mem, length, path, cg, __functionAddress);
    }

    /** {@code lto_module_t lto_module_create_in_codegen_context(void const * mem, size_t length, char const * path, lto_code_gen_t cg)} */
    @NativeType("lto_module_t")
    public static long lto_module_create_in_codegen_context(@NativeType("void const *") ByteBuffer mem, @NativeType("char const *") ByteBuffer path, @NativeType("lto_code_gen_t") long cg) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_create_in_codegen_context(memAddress(mem), mem.remaining(), memAddress(path), cg);
    }

    /** {@code lto_module_t lto_module_create_in_codegen_context(void const * mem, size_t length, char const * path, lto_code_gen_t cg)} */
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

    /** {@code lto_module_t lto_module_create_from_fd(int fd, char const * path, size_t file_size)} */
    public static long nlto_module_create_from_fd(int fd, long path, long file_size) {
        long __functionAddress = Functions.module_create_from_fd;
        return invokePPP(fd, path, file_size, __functionAddress);
    }

    /** {@code lto_module_t lto_module_create_from_fd(int fd, char const * path, size_t file_size)} */
    @NativeType("lto_module_t")
    public static long lto_module_create_from_fd(int fd, @NativeType("char const *") ByteBuffer path, @NativeType("size_t") long file_size) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_create_from_fd(fd, memAddress(path), file_size);
    }

    /** {@code lto_module_t lto_module_create_from_fd(int fd, char const * path, size_t file_size)} */
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

    /** {@code lto_module_t lto_module_create_from_fd_at_offset(int fd, char const * path, size_t file_size, size_t map_size, off_t offset)} */
    public static long nlto_module_create_from_fd_at_offset(int fd, long path, long file_size, long map_size, long offset) {
        long __functionAddress = Functions.module_create_from_fd_at_offset;
        return invokePPPJP(fd, path, file_size, map_size, offset, __functionAddress);
    }

    /** {@code lto_module_t lto_module_create_from_fd_at_offset(int fd, char const * path, size_t file_size, size_t map_size, off_t offset)} */
    @NativeType("lto_module_t")
    public static long lto_module_create_from_fd_at_offset(int fd, @NativeType("char const *") ByteBuffer path, @NativeType("size_t") long file_size, @NativeType("size_t") long map_size, @NativeType("off_t") long offset) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_module_create_from_fd_at_offset(fd, memAddress(path), file_size, map_size, offset);
    }

    /** {@code lto_module_t lto_module_create_from_fd_at_offset(int fd, char const * path, size_t file_size, size_t map_size, off_t offset)} */
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

    /** {@code void lto_module_dispose(lto_module_t mod)} */
    public static void lto_module_dispose(@NativeType("lto_module_t") long mod) {
        long __functionAddress = Functions.module_dispose;
        if (CHECKS) {
            check(mod);
        }
        invokePV(mod, __functionAddress);
    }

    // --- [ lto_module_get_target_triple ] ---

    /** {@code char const * lto_module_get_target_triple(lto_module_t mod)} */
    public static long nlto_module_get_target_triple(long mod) {
        long __functionAddress = Functions.module_get_target_triple;
        if (CHECKS) {
            check(mod);
        }
        return invokePP(mod, __functionAddress);
    }

    /** {@code char const * lto_module_get_target_triple(lto_module_t mod)} */
    @NativeType("char const *")
    public static @Nullable String lto_module_get_target_triple(@NativeType("lto_module_t") long mod) {
        long __result = nlto_module_get_target_triple(mod);
        return memUTF8Safe(__result);
    }

    // --- [ lto_module_set_target_triple ] ---

    /** {@code void lto_module_set_target_triple(lto_module_t mod, char const * triple)} */
    public static void nlto_module_set_target_triple(long mod, long triple) {
        long __functionAddress = Functions.module_set_target_triple;
        if (CHECKS) {
            check(mod);
        }
        invokePPV(mod, triple, __functionAddress);
    }

    /** {@code void lto_module_set_target_triple(lto_module_t mod, char const * triple)} */
    public static void lto_module_set_target_triple(@NativeType("lto_module_t") long mod, @NativeType("char const *") ByteBuffer triple) {
        if (CHECKS) {
            checkNT1(triple);
        }
        nlto_module_set_target_triple(mod, memAddress(triple));
    }

    /** {@code void lto_module_set_target_triple(lto_module_t mod, char const * triple)} */
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

    /** {@code unsigned int lto_module_get_num_symbols(lto_module_t mod)} */
    @NativeType("unsigned int")
    public static int lto_module_get_num_symbols(@NativeType("lto_module_t") long mod) {
        long __functionAddress = Functions.module_get_num_symbols;
        if (CHECKS) {
            check(mod);
        }
        return invokePI(mod, __functionAddress);
    }

    // --- [ lto_module_get_symbol_name ] ---

    /** {@code char const * lto_module_get_symbol_name(lto_module_t mod, unsigned int index)} */
    public static long nlto_module_get_symbol_name(long mod, int index) {
        long __functionAddress = Functions.module_get_symbol_name;
        if (CHECKS) {
            check(mod);
        }
        return invokePP(mod, index, __functionAddress);
    }

    /** {@code char const * lto_module_get_symbol_name(lto_module_t mod, unsigned int index)} */
    @NativeType("char const *")
    public static @Nullable String lto_module_get_symbol_name(@NativeType("lto_module_t") long mod, @NativeType("unsigned int") int index) {
        long __result = nlto_module_get_symbol_name(mod, index);
        return memUTF8Safe(__result);
    }

    // --- [ lto_module_get_symbol_attribute ] ---

    /** {@code lto_symbol_attributes lto_module_get_symbol_attribute(lto_module_t mod, unsigned int index)} */
    @NativeType("lto_symbol_attributes")
    public static int lto_module_get_symbol_attribute(@NativeType("lto_module_t") long mod, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.module_get_symbol_attribute;
        if (CHECKS) {
            check(mod);
        }
        return invokePI(mod, index, __functionAddress);
    }

    // --- [ lto_module_get_linkeropts ] ---

    /** {@code char const * lto_module_get_linkeropts(lto_module_t mod)} */
    public static long nlto_module_get_linkeropts(long mod) {
        long __functionAddress = Functions.module_get_linkeropts;
        if (CHECKS) {
            check(mod);
        }
        return invokePP(mod, __functionAddress);
    }

    /** {@code char const * lto_module_get_linkeropts(lto_module_t mod)} */
    @NativeType("char const *")
    public static @Nullable String lto_module_get_linkeropts(@NativeType("lto_module_t") long mod) {
        long __result = nlto_module_get_linkeropts(mod);
        return memUTF8Safe(__result);
    }

    // --- [ lto_module_get_macho_cputype ] ---

    /** {@code lto_bool_t lto_module_get_macho_cputype(lto_module_t mod, unsigned int * out_cputype, unsigned int * out_cpusubtype)} */
    public static boolean nlto_module_get_macho_cputype(long mod, long out_cputype, long out_cpusubtype) {
        long __functionAddress = Functions.module_get_macho_cputype;
        if (CHECKS) {
            check(__functionAddress);
            check(mod);
        }
        return invokePPPZ(mod, out_cputype, out_cpusubtype, __functionAddress);
    }

    /** {@code lto_bool_t lto_module_get_macho_cputype(lto_module_t mod, unsigned int * out_cputype, unsigned int * out_cpusubtype)} */
    @NativeType("lto_bool_t")
    public static boolean lto_module_get_macho_cputype(@NativeType("lto_module_t") long mod, @NativeType("unsigned int *") IntBuffer out_cputype, @NativeType("unsigned int *") IntBuffer out_cpusubtype) {
        if (CHECKS) {
            check(out_cputype, 1);
            check(out_cpusubtype, 1);
        }
        return nlto_module_get_macho_cputype(mod, memAddress(out_cputype), memAddress(out_cpusubtype));
    }

    // --- [ lto_module_has_ctor_dtor ] ---

    /** {@code lto_bool_t lto_module_has_ctor_dtor(lto_module_t mod)} */
    @NativeType("lto_bool_t")
    public static boolean lto_module_has_ctor_dtor(@NativeType("lto_module_t") long mod) {
        long __functionAddress = Functions.module_has_ctor_dtor;
        if (CHECKS) {
            check(__functionAddress);
            check(mod);
        }
        return invokePZ(mod, __functionAddress);
    }

    // --- [ lto_codegen_set_diagnostic_handler ] ---

    /** {@code void lto_codegen_set_diagnostic_handler(lto_code_gen_t cg, void (*) (lto_codegen_diagnostic_severity_t, char const *, void *) handler, void * ctxt)} */
    public static void nlto_codegen_set_diagnostic_handler(long cg, long handler, long ctxt) {
        long __functionAddress = Functions.codegen_set_diagnostic_handler;
        if (CHECKS) {
            check(cg);
            check(ctxt);
        }
        invokePPPV(cg, handler, ctxt, __functionAddress);
    }

    /** {@code void lto_codegen_set_diagnostic_handler(lto_code_gen_t cg, void (*) (lto_codegen_diagnostic_severity_t, char const *, void *) handler, void * ctxt)} */
    public static void lto_codegen_set_diagnostic_handler(@NativeType("lto_code_gen_t") long cg, @NativeType("void (*) (lto_codegen_diagnostic_severity_t, char const *, void *)") LTODiagnosticHandlerI handler, @NativeType("void *") long ctxt) {
        nlto_codegen_set_diagnostic_handler(cg, handler.address(), ctxt);
    }

    // --- [ lto_codegen_create ] ---

    /** {@code lto_code_gen_t lto_codegen_create(void)} */
    @NativeType("lto_code_gen_t")
    public static long lto_codegen_create() {
        long __functionAddress = Functions.codegen_create;
        return invokeP(__functionAddress);
    }

    // --- [ lto_codegen_create_in_local_context ] ---

    /** {@code lto_code_gen_t lto_codegen_create_in_local_context(void)} */
    @NativeType("lto_code_gen_t")
    public static long lto_codegen_create_in_local_context() {
        long __functionAddress = Functions.codegen_create_in_local_context;
        return invokeP(__functionAddress);
    }

    // --- [ lto_codegen_dispose ] ---

    /** {@code void lto_codegen_dispose(lto_code_gen_t cg)} */
    public static void lto_codegen_dispose(@NativeType("lto_code_gen_t") long cg) {
        long __functionAddress = Functions.codegen_dispose;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, __functionAddress);
    }

    // --- [ lto_codegen_add_module ] ---

    /** {@code lto_bool_t lto_codegen_add_module(lto_code_gen_t cg, lto_module_t mod)} */
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

    /** {@code void lto_codegen_set_module(lto_code_gen_t cg, lto_module_t mod)} */
    public static void lto_codegen_set_module(@NativeType("lto_code_gen_t") long cg, @NativeType("lto_module_t") long mod) {
        long __functionAddress = Functions.codegen_set_module;
        if (CHECKS) {
            check(cg);
            check(mod);
        }
        invokePPV(cg, mod, __functionAddress);
    }

    // --- [ lto_codegen_set_debug_model ] ---

    /** {@code lto_bool_t lto_codegen_set_debug_model(lto_code_gen_t cg, lto_debug_model model)} */
    @NativeType("lto_bool_t")
    public static boolean lto_codegen_set_debug_model(@NativeType("lto_code_gen_t") long cg, @NativeType("lto_debug_model") int model) {
        long __functionAddress = Functions.codegen_set_debug_model;
        if (CHECKS) {
            check(cg);
        }
        return invokePZ(cg, model, __functionAddress);
    }

    // --- [ lto_codegen_set_pic_model ] ---

    /** {@code lto_bool_t lto_codegen_set_pic_model(lto_code_gen_t cg, lto_codegen_model model)} */
    @NativeType("lto_bool_t")
    public static boolean lto_codegen_set_pic_model(@NativeType("lto_code_gen_t") long cg, @NativeType("lto_codegen_model") int model) {
        long __functionAddress = Functions.codegen_set_pic_model;
        if (CHECKS) {
            check(cg);
        }
        return invokePZ(cg, model, __functionAddress);
    }

    // --- [ lto_codegen_set_cpu ] ---

    /** {@code void lto_codegen_set_cpu(lto_code_gen_t cg, char const * cpu)} */
    public static void nlto_codegen_set_cpu(long cg, long cpu) {
        long __functionAddress = Functions.codegen_set_cpu;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, cpu, __functionAddress);
    }

    /** {@code void lto_codegen_set_cpu(lto_code_gen_t cg, char const * cpu)} */
    public static void lto_codegen_set_cpu(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer cpu) {
        if (CHECKS) {
            checkNT1(cpu);
        }
        nlto_codegen_set_cpu(cg, memAddress(cpu));
    }

    /** {@code void lto_codegen_set_cpu(lto_code_gen_t cg, char const * cpu)} */
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

    /** {@code void lto_codegen_set_assembler_path(lto_code_gen_t cg, char const * path)} */
    public static void nlto_codegen_set_assembler_path(long cg, long path) {
        long __functionAddress = Functions.codegen_set_assembler_path;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, path, __functionAddress);
    }

    /** {@code void lto_codegen_set_assembler_path(lto_code_gen_t cg, char const * path)} */
    public static void lto_codegen_set_assembler_path(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        nlto_codegen_set_assembler_path(cg, memAddress(path));
    }

    /** {@code void lto_codegen_set_assembler_path(lto_code_gen_t cg, char const * path)} */
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

    /** {@code void lto_codegen_set_assembler_args(lto_code_gen_t cg, char const ** args, int nargs)} */
    public static void nlto_codegen_set_assembler_args(long cg, long args, int nargs) {
        long __functionAddress = Functions.codegen_set_assembler_args;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, args, nargs, __functionAddress);
    }

    /** {@code void lto_codegen_set_assembler_args(lto_code_gen_t cg, char const ** args, int nargs)} */
    public static void lto_codegen_set_assembler_args(@NativeType("lto_code_gen_t") long cg, @NativeType("char const **") PointerBuffer args) {
        nlto_codegen_set_assembler_args(cg, memAddress(args), args.remaining());
    }

    // --- [ lto_codegen_add_must_preserve_symbol ] ---

    /** {@code void lto_codegen_add_must_preserve_symbol(lto_code_gen_t cg, char const * symbol)} */
    public static void nlto_codegen_add_must_preserve_symbol(long cg, long symbol) {
        long __functionAddress = Functions.codegen_add_must_preserve_symbol;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, symbol, __functionAddress);
    }

    /** {@code void lto_codegen_add_must_preserve_symbol(lto_code_gen_t cg, char const * symbol)} */
    public static void lto_codegen_add_must_preserve_symbol(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer symbol) {
        if (CHECKS) {
            checkNT1(symbol);
        }
        nlto_codegen_add_must_preserve_symbol(cg, memAddress(symbol));
    }

    /** {@code void lto_codegen_add_must_preserve_symbol(lto_code_gen_t cg, char const * symbol)} */
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

    /** {@code lto_bool_t lto_codegen_write_merged_modules(lto_code_gen_t cg, char const * path)} */
    public static boolean nlto_codegen_write_merged_modules(long cg, long path) {
        long __functionAddress = Functions.codegen_write_merged_modules;
        if (CHECKS) {
            check(cg);
        }
        return invokePPZ(cg, path, __functionAddress);
    }

    /** {@code lto_bool_t lto_codegen_write_merged_modules(lto_code_gen_t cg, char const * path)} */
    @NativeType("lto_bool_t")
    public static boolean lto_codegen_write_merged_modules(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_codegen_write_merged_modules(cg, memAddress(path));
    }

    /** {@code lto_bool_t lto_codegen_write_merged_modules(lto_code_gen_t cg, char const * path)} */
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

    /** {@code void const * lto_codegen_compile(lto_code_gen_t cg, size_t * length)} */
    public static long nlto_codegen_compile(long cg, long length) {
        long __functionAddress = Functions.codegen_compile;
        if (CHECKS) {
            check(cg);
        }
        return invokePPP(cg, length, __functionAddress);
    }

    /** {@code void const * lto_codegen_compile(lto_code_gen_t cg, size_t * length)} */
    @NativeType("void const *")
    public static @Nullable ByteBuffer lto_codegen_compile(@NativeType("lto_code_gen_t") long cg) {
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

    /** {@code lto_bool_t lto_codegen_compile_to_file(lto_code_gen_t cg, char const ** name)} */
    public static boolean nlto_codegen_compile_to_file(long cg, long name) {
        long __functionAddress = Functions.codegen_compile_to_file;
        if (CHECKS) {
            check(cg);
        }
        return invokePPZ(cg, name, __functionAddress);
    }

    /** {@code lto_bool_t lto_codegen_compile_to_file(lto_code_gen_t cg, char const ** name)} */
    @NativeType("lto_bool_t")
    public static boolean lto_codegen_compile_to_file(@NativeType("lto_code_gen_t") long cg, @NativeType("char const **") PointerBuffer name) {
        if (CHECKS) {
            check(name, 1);
        }
        return nlto_codegen_compile_to_file(cg, memAddress(name));
    }

    // --- [ lto_codegen_optimize ] ---

    /** {@code lto_bool_t lto_codegen_optimize(lto_code_gen_t cg)} */
    @NativeType("lto_bool_t")
    public static boolean lto_codegen_optimize(@NativeType("lto_code_gen_t") long cg) {
        long __functionAddress = Functions.codegen_optimize;
        if (CHECKS) {
            check(cg);
        }
        return invokePZ(cg, __functionAddress);
    }

    // --- [ lto_codegen_compile_optimized ] ---

    /** {@code void const * lto_codegen_compile_optimized(lto_code_gen_t cg, size_t * length)} */
    public static long nlto_codegen_compile_optimized(long cg, long length) {
        long __functionAddress = Functions.codegen_compile_optimized;
        if (CHECKS) {
            check(cg);
        }
        return invokePPP(cg, length, __functionAddress);
    }

    /** {@code void const * lto_codegen_compile_optimized(lto_code_gen_t cg, size_t * length)} */
    @NativeType("void const *")
    public static @Nullable ByteBuffer lto_codegen_compile_optimized(@NativeType("lto_code_gen_t") long cg) {
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

    /** {@code unsigned int lto_api_version(void)} */
    @NativeType("unsigned int")
    public static int lto_api_version() {
        long __functionAddress = Functions.api_version;
        return invokeI(__functionAddress);
    }

    // --- [ lto_set_debug_options ] ---

    /** {@code void lto_set_debug_options(char const * const * options, int number)} */
    public static void nlto_set_debug_options(long options, int number) {
        long __functionAddress = Functions.set_debug_options;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(options, number, __functionAddress);
    }

    /** {@code void lto_set_debug_options(char const * const * options, int number)} */
    public static void lto_set_debug_options(@NativeType("char const * const *") PointerBuffer options) {
        nlto_set_debug_options(memAddress(options), options.remaining());
    }

    // --- [ lto_codegen_debug_options ] ---

    /** {@code void lto_codegen_debug_options(lto_code_gen_t cg, char const * options)} */
    public static void nlto_codegen_debug_options(long cg, long options) {
        long __functionAddress = Functions.codegen_debug_options;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, options, __functionAddress);
    }

    /** {@code void lto_codegen_debug_options(lto_code_gen_t cg, char const * options)} */
    public static void lto_codegen_debug_options(@NativeType("lto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer options) {
        if (CHECKS) {
            checkNT1(options);
        }
        nlto_codegen_debug_options(cg, memAddress(options));
    }

    /** {@code void lto_codegen_debug_options(lto_code_gen_t cg, char const * options)} */
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

    // --- [ lto_codegen_debug_options_array ] ---

    /** {@code void lto_codegen_debug_options_array(lto_code_gen_t cg, char const * const * options, int number)} */
    public static void nlto_codegen_debug_options_array(long cg, long options, int number) {
        long __functionAddress = Functions.codegen_debug_options_array;
        if (CHECKS) {
            check(__functionAddress);
            check(cg);
        }
        invokePPV(cg, options, number, __functionAddress);
    }

    /** {@code void lto_codegen_debug_options_array(lto_code_gen_t cg, char const * const * options, int number)} */
    public static void lto_codegen_debug_options_array(@NativeType("lto_code_gen_t") long cg, @NativeType("char const * const *") PointerBuffer options) {
        nlto_codegen_debug_options_array(cg, memAddress(options), options.remaining());
    }

    // --- [ lto_initialize_disassembler ] ---

    /** {@code void lto_initialize_disassembler(void)} */
    public static void lto_initialize_disassembler() {
        long __functionAddress = Functions.initialize_disassembler;
        invokeV(__functionAddress);
    }

    // --- [ lto_codegen_set_should_internalize ] ---

    /** {@code void lto_codegen_set_should_internalize(lto_code_gen_t cg, lto_bool_t ShouldInternalize)} */
    public static void lto_codegen_set_should_internalize(@NativeType("lto_code_gen_t") long cg, @NativeType("lto_bool_t") boolean ShouldInternalize) {
        long __functionAddress = Functions.codegen_set_should_internalize;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, ShouldInternalize, __functionAddress);
    }

    // --- [ lto_codegen_set_should_embed_uselists ] ---

    /** {@code void lto_codegen_set_should_embed_uselists(lto_code_gen_t cg, lto_bool_t ShouldEmbedUselists)} */
    public static void lto_codegen_set_should_embed_uselists(@NativeType("lto_code_gen_t") long cg, @NativeType("lto_bool_t") boolean ShouldEmbedUselists) {
        long __functionAddress = Functions.codegen_set_should_embed_uselists;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, ShouldEmbedUselists, __functionAddress);
    }

    // --- [ lto_input_create ] ---

    /** {@code lto_input_t lto_input_create(void const * buffer, size_t buffer_size, char const * path)} */
    public static long nlto_input_create(long buffer, long buffer_size, long path) {
        long __functionAddress = Functions.input_create;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPPP(buffer, buffer_size, path, __functionAddress);
    }

    /** {@code lto_input_t lto_input_create(void const * buffer, size_t buffer_size, char const * path)} */
    @NativeType("lto_input_t")
    public static long lto_input_create(@NativeType("void const *") ByteBuffer buffer, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nlto_input_create(memAddress(buffer), buffer.remaining(), memAddress(path));
    }

    /** {@code lto_input_t lto_input_create(void const * buffer, size_t buffer_size, char const * path)} */
    @NativeType("lto_input_t")
    public static long lto_input_create(@NativeType("void const *") ByteBuffer buffer, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nlto_input_create(memAddress(buffer), buffer.remaining(), pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_input_dispose ] ---

    /** {@code void lto_input_dispose(lto_input_t input)} */
    public static void lto_input_dispose(@NativeType("lto_input_t") long input) {
        long __functionAddress = Functions.input_dispose;
        if (CHECKS) {
            check(__functionAddress);
            check(input);
        }
        invokePV(input, __functionAddress);
    }

    // --- [ lto_input_get_num_dependent_libraries ] ---

    /** {@code unsigned lto_input_get_num_dependent_libraries(lto_input_t input)} */
    @NativeType("unsigned")
    public static int lto_input_get_num_dependent_libraries(@NativeType("lto_input_t") long input) {
        long __functionAddress = Functions.input_get_num_dependent_libraries;
        if (CHECKS) {
            check(__functionAddress);
            check(input);
        }
        return invokePI(input, __functionAddress);
    }

    // --- [ lto_input_get_dependent_library ] ---

    /** {@code char const * lto_input_get_dependent_library(lto_input_t input, size_t index, size_t * size)} */
    public static long nlto_input_get_dependent_library(long input, long index, long size) {
        long __functionAddress = Functions.input_get_dependent_library;
        if (CHECKS) {
            check(__functionAddress);
            check(input);
        }
        return invokePPPP(input, index, size, __functionAddress);
    }

    /** {@code char const * lto_input_get_dependent_library(lto_input_t input, size_t index, size_t * size)} */
    @NativeType("char const *")
    public static @Nullable String lto_input_get_dependent_library(@NativeType("lto_input_t") long input, @NativeType("size_t") long index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer size = stack.callocPointer(1);
            long __result = nlto_input_get_dependent_library(input, index, memAddress(size));
            return memUTF8Safe(__result, (int)size.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ lto_runtime_lib_symbols_list ] ---

    /** {@code char const * const * lto_runtime_lib_symbols_list(size_t * size)} */
    public static long nlto_runtime_lib_symbols_list(long size) {
        long __functionAddress = Functions.runtime_lib_symbols_list;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(size, __functionAddress);
    }

    /** {@code char const * const * lto_runtime_lib_symbols_list(size_t * size)} */
    @NativeType("char const * const *")
    public static @Nullable PointerBuffer lto_runtime_lib_symbols_list() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer size = stack.callocPointer(1);
        try {
            long __result = nlto_runtime_lib_symbols_list(memAddress(size));
            return memPointerBufferSafe(__result, (int)size.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ thinlto_create_codegen ] ---

    /** {@code thinlto_code_gen_t thinlto_create_codegen(void)} */
    @NativeType("thinlto_code_gen_t")
    public static long thinlto_create_codegen() {
        long __functionAddress = Functions.thinlto_create_codegen;
        return invokeP(__functionAddress);
    }

    // --- [ thinlto_codegen_dispose ] ---

    /** {@code void thinlto_codegen_dispose(thinlto_code_gen_t cg)} */
    public static void thinlto_codegen_dispose(@NativeType("thinlto_code_gen_t") long cg) {
        long __functionAddress = Functions.thinlto_codegen_dispose;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, __functionAddress);
    }

    // --- [ thinlto_codegen_add_module ] ---

    /** {@code void thinlto_codegen_add_module(thinlto_code_gen_t cg, char const * identifier, char const * data, int length)} */
    public static void nthinlto_codegen_add_module(long cg, long identifier, long data, int length) {
        long __functionAddress = Functions.thinlto_codegen_add_module;
        if (CHECKS) {
            check(cg);
        }
        invokePPPV(cg, identifier, data, length, __functionAddress);
    }

    /** {@code void thinlto_codegen_add_module(thinlto_code_gen_t cg, char const * identifier, char const * data, int length)} */
    public static void thinlto_codegen_add_module(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer identifier, @NativeType("char const *") ByteBuffer data) {
        if (CHECKS) {
            checkNT1(identifier);
        }
        nthinlto_codegen_add_module(cg, memAddress(identifier), memAddress(data), data.remaining());
    }

    /** {@code void thinlto_codegen_add_module(thinlto_code_gen_t cg, char const * identifier, char const * data, int length)} */
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

    /** {@code void thinlto_codegen_process(thinlto_code_gen_t cg)} */
    public static void thinlto_codegen_process(@NativeType("thinlto_code_gen_t") long cg) {
        long __functionAddress = Functions.thinlto_codegen_process;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, __functionAddress);
    }

    // --- [ thinlto_module_get_num_objects ] ---

    /** {@code unsigned int thinlto_module_get_num_objects(thinlto_code_gen_t cg)} */
    @NativeType("unsigned int")
    public static int thinlto_module_get_num_objects(@NativeType("thinlto_code_gen_t") long cg) {
        long __functionAddress = Functions.thinlto_module_get_num_objects;
        if (CHECKS) {
            check(cg);
        }
        return invokePI(cg, __functionAddress);
    }

    // --- [ thinlto_module_get_object ] ---

    /** {@code LTOObjectBuffer thinlto_module_get_object(thinlto_code_gen_t cg, unsigned int index)} */
    public static native void nthinlto_module_get_object(long cg, int index, long __functionAddress, long __result);

    /** {@code LTOObjectBuffer thinlto_module_get_object(thinlto_code_gen_t cg, unsigned int index)} */
    public static void nthinlto_module_get_object(long cg, int index, long __result) {
        long __functionAddress = Functions.thinlto_module_get_object;
        if (CHECKS) {
            check(cg);
        }
        nthinlto_module_get_object(cg, index, __functionAddress, __result);
    }

    /** {@code LTOObjectBuffer thinlto_module_get_object(thinlto_code_gen_t cg, unsigned int index)} */
    public static LTOObjectBuffer thinlto_module_get_object(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int index, LTOObjectBuffer __result) {
        nthinlto_module_get_object(cg, index, __result.address());
        return __result;
    }

    // --- [ thinlto_module_get_num_object_files ] ---

    /** {@code unsigned int thinlto_module_get_num_object_files(thinlto_code_gen_t cg)} */
    @NativeType("unsigned int")
    public static int thinlto_module_get_num_object_files(@NativeType("thinlto_code_gen_t") long cg) {
        long __functionAddress = Functions.thinlto_module_get_num_object_files;
        if (CHECKS) {
            check(cg);
        }
        return invokePI(cg, __functionAddress);
    }

    // --- [ thinlto_module_get_object_file ] ---

    /** {@code char const * thinlto_module_get_object_file(thinlto_code_gen_t cg, unsigned int index)} */
    public static long nthinlto_module_get_object_file(long cg, int index) {
        long __functionAddress = Functions.thinlto_module_get_object_file;
        if (CHECKS) {
            check(cg);
        }
        return invokePP(cg, index, __functionAddress);
    }

    /** {@code char const * thinlto_module_get_object_file(thinlto_code_gen_t cg, unsigned int index)} */
    @NativeType("char const *")
    public static @Nullable String thinlto_module_get_object_file(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int index) {
        long __result = nthinlto_module_get_object_file(cg, index);
        return memUTF8Safe(__result);
    }

    // --- [ thinlto_codegen_set_pic_model ] ---

    /** {@code lto_bool_t thinlto_codegen_set_pic_model(thinlto_code_gen_t cg, lto_codegen_model model)} */
    @NativeType("lto_bool_t")
    public static boolean thinlto_codegen_set_pic_model(@NativeType("thinlto_code_gen_t") long cg, @NativeType("lto_codegen_model") int model) {
        long __functionAddress = Functions.thinlto_codegen_set_pic_model;
        if (CHECKS) {
            check(cg);
        }
        return invokePZ(cg, model, __functionAddress);
    }

    // --- [ thinlto_codegen_set_savetemps_dir ] ---

    /** {@code void thinlto_codegen_set_savetemps_dir(thinlto_code_gen_t cg, char const * save_temps_dir)} */
    public static void nthinlto_codegen_set_savetemps_dir(long cg, long save_temps_dir) {
        long __functionAddress = Functions.thinlto_codegen_set_savetemps_dir;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, save_temps_dir, __functionAddress);
    }

    /** {@code void thinlto_codegen_set_savetemps_dir(thinlto_code_gen_t cg, char const * save_temps_dir)} */
    public static void thinlto_codegen_set_savetemps_dir(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer save_temps_dir) {
        if (CHECKS) {
            checkNT1(save_temps_dir);
        }
        nthinlto_codegen_set_savetemps_dir(cg, memAddress(save_temps_dir));
    }

    /** {@code void thinlto_codegen_set_savetemps_dir(thinlto_code_gen_t cg, char const * save_temps_dir)} */
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

    /** {@code void thinlto_set_generated_objects_dir(thinlto_code_gen_t cg, char const * save_temps_dir)} */
    public static void nthinlto_set_generated_objects_dir(long cg, long save_temps_dir) {
        long __functionAddress = Functions.thinlto_set_generated_objects_dir;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, save_temps_dir, __functionAddress);
    }

    /** {@code void thinlto_set_generated_objects_dir(thinlto_code_gen_t cg, char const * save_temps_dir)} */
    public static void thinlto_set_generated_objects_dir(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer save_temps_dir) {
        if (CHECKS) {
            checkNT1(save_temps_dir);
        }
        nthinlto_set_generated_objects_dir(cg, memAddress(save_temps_dir));
    }

    /** {@code void thinlto_set_generated_objects_dir(thinlto_code_gen_t cg, char const * save_temps_dir)} */
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

    /** {@code void thinlto_codegen_set_cpu(thinlto_code_gen_t cg, char const * cpu)} */
    public static void nthinlto_codegen_set_cpu(long cg, long cpu) {
        long __functionAddress = Functions.thinlto_codegen_set_cpu;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, cpu, __functionAddress);
    }

    /** {@code void thinlto_codegen_set_cpu(thinlto_code_gen_t cg, char const * cpu)} */
    public static void thinlto_codegen_set_cpu(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer cpu) {
        if (CHECKS) {
            checkNT1(cpu);
        }
        nthinlto_codegen_set_cpu(cg, memAddress(cpu));
    }

    /** {@code void thinlto_codegen_set_cpu(thinlto_code_gen_t cg, char const * cpu)} */
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

    /** {@code void thinlto_codegen_disable_codegen(thinlto_code_gen_t cg, lto_bool_t disable)} */
    public static void thinlto_codegen_disable_codegen(@NativeType("thinlto_code_gen_t") long cg, @NativeType("lto_bool_t") boolean disable) {
        long __functionAddress = Functions.thinlto_codegen_disable_codegen;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, disable, __functionAddress);
    }

    // --- [ thinlto_codegen_set_codegen_only ] ---

    /** {@code void thinlto_codegen_set_codegen_only(thinlto_code_gen_t cg, lto_bool_t codegen_only)} */
    public static void thinlto_codegen_set_codegen_only(@NativeType("thinlto_code_gen_t") long cg, @NativeType("lto_bool_t") boolean codegen_only) {
        long __functionAddress = Functions.thinlto_codegen_set_codegen_only;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, codegen_only, __functionAddress);
    }

    // --- [ thinlto_debug_options ] ---

    /** {@code void thinlto_debug_options(char const * const * options, int number)} */
    public static void nthinlto_debug_options(long options, int number) {
        long __functionAddress = Functions.thinlto_debug_options;
        invokePV(options, number, __functionAddress);
    }

    /** {@code void thinlto_debug_options(char const * const * options, int number)} */
    public static void thinlto_debug_options(@NativeType("char const * const *") PointerBuffer options) {
        nthinlto_debug_options(memAddress(options), options.remaining());
    }

    // --- [ lto_module_is_thinlto ] ---

    /** {@code lto_bool_t lto_module_is_thinlto(lto_module_t mod)} */
    @NativeType("lto_bool_t")
    public static boolean lto_module_is_thinlto(@NativeType("lto_module_t") long mod) {
        long __functionAddress = Functions.module_is_thinlto;
        if (CHECKS) {
            check(mod);
        }
        return invokePZ(mod, __functionAddress);
    }

    // --- [ thinlto_codegen_add_must_preserve_symbol ] ---

    /** {@code void thinlto_codegen_add_must_preserve_symbol(thinlto_code_gen_t cg, char const * name, int length)} */
    public static void nthinlto_codegen_add_must_preserve_symbol(long cg, long name, int length) {
        long __functionAddress = Functions.thinlto_codegen_add_must_preserve_symbol;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, name, length, __functionAddress);
    }

    /** {@code void thinlto_codegen_add_must_preserve_symbol(thinlto_code_gen_t cg, char const * name, int length)} */
    public static void thinlto_codegen_add_must_preserve_symbol(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer name) {
        nthinlto_codegen_add_must_preserve_symbol(cg, memAddress(name), name.remaining());
    }

    /** {@code void thinlto_codegen_add_must_preserve_symbol(thinlto_code_gen_t cg, char const * name, int length)} */
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

    /** {@code void thinlto_codegen_add_cross_referenced_symbol(thinlto_code_gen_t cg, char const * name, int length)} */
    public static void nthinlto_codegen_add_cross_referenced_symbol(long cg, long name, int length) {
        long __functionAddress = Functions.thinlto_codegen_add_cross_referenced_symbol;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, name, length, __functionAddress);
    }

    /** {@code void thinlto_codegen_add_cross_referenced_symbol(thinlto_code_gen_t cg, char const * name, int length)} */
    public static void thinlto_codegen_add_cross_referenced_symbol(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer name) {
        nthinlto_codegen_add_cross_referenced_symbol(cg, memAddress(name), name.remaining());
    }

    /** {@code void thinlto_codegen_add_cross_referenced_symbol(thinlto_code_gen_t cg, char const * name, int length)} */
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

    /** {@code void thinlto_codegen_set_cache_dir(thinlto_code_gen_t cg, char const * cache_dir)} */
    public static void nthinlto_codegen_set_cache_dir(long cg, long cache_dir) {
        long __functionAddress = Functions.thinlto_codegen_set_cache_dir;
        if (CHECKS) {
            check(cg);
        }
        invokePPV(cg, cache_dir, __functionAddress);
    }

    /** {@code void thinlto_codegen_set_cache_dir(thinlto_code_gen_t cg, char const * cache_dir)} */
    public static void thinlto_codegen_set_cache_dir(@NativeType("thinlto_code_gen_t") long cg, @NativeType("char const *") ByteBuffer cache_dir) {
        if (CHECKS) {
            checkNT1(cache_dir);
        }
        nthinlto_codegen_set_cache_dir(cg, memAddress(cache_dir));
    }

    /** {@code void thinlto_codegen_set_cache_dir(thinlto_code_gen_t cg, char const * cache_dir)} */
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

    /** {@code void thinlto_codegen_set_cache_pruning_interval(thinlto_code_gen_t cg, int interval)} */
    public static void thinlto_codegen_set_cache_pruning_interval(@NativeType("thinlto_code_gen_t") long cg, int interval) {
        long __functionAddress = Functions.thinlto_codegen_set_cache_pruning_interval;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, interval, __functionAddress);
    }

    // --- [ thinlto_codegen_set_final_cache_size_relative_to_available_space ] ---

    /** {@code void thinlto_codegen_set_final_cache_size_relative_to_available_space(thinlto_code_gen_t cg, unsigned int percentage)} */
    public static void thinlto_codegen_set_final_cache_size_relative_to_available_space(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int percentage) {
        long __functionAddress = Functions.thinlto_codegen_set_final_cache_size_relative_to_available_space;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, percentage, __functionAddress);
    }

    // --- [ thinlto_codegen_set_cache_entry_expiration ] ---

    /** {@code void thinlto_codegen_set_cache_entry_expiration(thinlto_code_gen_t cg, unsigned int expiration)} */
    public static void thinlto_codegen_set_cache_entry_expiration(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int expiration) {
        long __functionAddress = Functions.thinlto_codegen_set_cache_entry_expiration;
        if (CHECKS) {
            check(cg);
        }
        invokePV(cg, expiration, __functionAddress);
    }

    // --- [ thinlto_codegen_set_cache_size_bytes ] ---

    /** {@code void thinlto_codegen_set_cache_size_bytes(thinlto_code_gen_t cg, unsigned int max_size_bytes)} */
    public static void thinlto_codegen_set_cache_size_bytes(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int max_size_bytes) {
        long __functionAddress = Functions.thinlto_codegen_set_cache_size_bytes;
        if (CHECKS) {
            check(__functionAddress);
            check(cg);
        }
        invokePV(cg, max_size_bytes, __functionAddress);
    }

    // --- [ thinlto_codegen_set_cache_size_megabytes ] ---

    /** {@code void thinlto_codegen_set_cache_size_megabytes(thinlto_code_gen_t cg, unsigned int max_size_megabytes)} */
    public static void thinlto_codegen_set_cache_size_megabytes(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int max_size_megabytes) {
        long __functionAddress = Functions.thinlto_codegen_set_cache_size_megabytes;
        if (CHECKS) {
            check(__functionAddress);
            check(cg);
        }
        invokePV(cg, max_size_megabytes, __functionAddress);
    }

    // --- [ thinlto_codegen_set_cache_size_files ] ---

    /** {@code void thinlto_codegen_set_cache_size_files(thinlto_code_gen_t cg, unsigned int max_size_files)} */
    public static void thinlto_codegen_set_cache_size_files(@NativeType("thinlto_code_gen_t") long cg, @NativeType("unsigned int") int max_size_files) {
        long __functionAddress = Functions.thinlto_codegen_set_cache_size_files;
        if (CHECKS) {
            check(__functionAddress);
            check(cg);
        }
        invokePV(cg, max_size_files, __functionAddress);
    }

}