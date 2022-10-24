/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * FMOD_RESULT (*{@link #invoke}) (
 *     struct FMOD_CODEC_STATE *codec_state,
 *     FMOD_TAGTYPE tagtype,
 *     char *name,
 *     void *data,
 *     unsigned int datalen,
 *     FMOD_TAGDATATYPE datatype,
 *     int unique
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("FMOD_CODEC_METADATA_FUNC")
public interface FMOD_CODEC_METADATA_FUNCI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_uint32, ffi_type_sint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 6 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** Codec functions */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("struct FMOD_CODEC_STATE *") long codec_state, @NativeType("FMOD_TAGTYPE") int tagtype, @NativeType("char *") long name, @NativeType("void *") long data, @NativeType("unsigned int") int datalen, @NativeType("FMOD_TAGDATATYPE") int datatype, int unique);

}