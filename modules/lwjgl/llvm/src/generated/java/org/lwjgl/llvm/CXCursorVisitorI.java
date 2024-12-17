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

/** Callback function: {@link #invoke (* anonymous)} */
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

    /** {@code enum CXChildVisitResult (*) (CXCursor cursor, CXCursor parent, CXClientData client_data)} */
    @NativeType("enum CXChildVisitResult") int invoke(CXCursor cursor, CXCursor parent, @NativeType("CXClientData") long client_data);

}