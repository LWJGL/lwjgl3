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
 * Instances of this interface may be passed to the {@link ClangIndex#clang_visitChildren visitChildren} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * enum CXChildVisitResult (*) (
 *     CXCursor cursor,
 *     CXCursor parent,
 *     CXClientData client_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("enum CXChildVisitResult (*) (CXCursor, CXCursor, CXClientData)")
public interface CXCursorVisitorI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        apiCreateStruct(ffi_type_uint32, ffi_type_sint32, apiCreateArray(ffi_type_pointer, 3)), apiCreateStruct(ffi_type_uint32, ffi_type_sint32, apiCreateArray(ffi_type_pointer, 3)), ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            CXCursor.create(memGetAddress(args)),
            CXCursor.create(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * Visitor invoked for each cursor found by a traversal.
     * 
     * <p>This visitor function will be invoked for each cursor found by {@link ClangIndex#clang_visitChildren visitChildren}. Its first argument is the cursor being visited, its second
     * argument is the parent visitor for that cursor, and its third argument is the client data provided to {@code clang_visitChildren()}.</p>
     * 
     * <p>The visitor should return one of the {@code CXChildVisitResult} values to direct {@code clang_visitChildren()}.</p>
     */
    @NativeType("enum CXChildVisitResult") int invoke(CXCursor cursor, CXCursor parent, @NativeType("CXClientData") long client_data);

}