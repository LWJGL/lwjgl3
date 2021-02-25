/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be passed to the {@link ClangIndex#clang_Type_visitFields Type_visitFields} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * enum CXVisitorResult (*) (
 *     CXCursor C,
 *     CXClientData client_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("enum CXVisitorResult (*) (CXCursor, CXClientData)")
public interface CXFieldVisitorI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        apiCreateStruct(ffi_type_uint32, ffi_type_sint32, apiCreateArray(ffi_type_pointer, 3)), ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            CXCursor.create(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * Visitor invoked for each field found by a traversal.
     * 
     * <p>This visitor function will be invoked for each field found by {@link ClangIndex#clang_Type_visitFields Type_visitFields}. Its first argument is the cursor being visited, its second argument
     * is the client data provided to {@code clang_Type_visitFields}.</p>
     * 
     * <p>The visitor should return one of the {@code CXVisitorResult} values to direct {@code {@link ClangIndex#clang_Type_visitFields Type_visitFields}}.</p>
     */
    @NativeType("enum CXVisitorResult") int invoke(CXCursor C, @NativeType("CXClientData") long client_data);

}