/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*{@link #invoke}) (
 *     ALvoid *userptr,
 *     ALvoid *sampledata,
 *     ALsizei numbytes
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ALBUFFERCALLBACKTYPESOFT")
public interface SOFTCallbackBufferTypeI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_sint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * @param userptr    the same pointer provided to {@link SOFTCallbackBuffer#alBufferCallbackSOFT BufferCallbackSOFT}
     * @param sampledata a pointer to the sample data buffer that should be filled in by the function
     * @param numbytes   the number of bytes needed to fill the sample data buffer for this invocation.
     *                   
     *                   <p>Guaranteed to be greater than 0 and a multiple of the frame size for the format.</p>
     *
     * @return the number of bytes actually written, which must be equal to or less than {@code numbytes}.
     *         
     *         <p>If the return value is less than {@code numbytes}, it's treated as the end of the buffer and the source will play any complete samples before stopping.</p>
     */
    @NativeType("void *") long invoke(@NativeType("ALvoid *") long userptr, @NativeType("ALvoid *") long sampledata, @NativeType("ALsizei") int numbytes);

}