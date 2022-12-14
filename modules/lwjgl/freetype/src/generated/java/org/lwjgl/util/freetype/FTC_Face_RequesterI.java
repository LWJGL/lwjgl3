/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * FT_Error (*{@link #invoke}) (
 *     FTC_FaceID face_id,
 *     FT_Library library,
 *     FT_Pointer req_data,
 *     FT_Face *aface
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("FTC_Face_Requester")
public interface FTC_Face_RequesterI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * A callback function provided by client applications. It is used by the cache manager to translate a given FTC _FaceID into a new valid {@code FT_Face}
     * object, on demand.
     */
    @NativeType("FT_Error") int invoke(@NativeType("FTC_FaceID") long face_id, @NativeType("FT_Library") long library, @NativeType("FT_Pointer") long req_data, @NativeType("FT_Face *") long aface);

}