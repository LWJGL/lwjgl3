/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * hb_bool_t (*{@link #invoke}) (
 *     hb_buffer_t *buffer,
 *     hb_font_t *font,
 *     char const *message,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("hb_buffer_message_func_t")
public interface hb_buffer_message_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
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
     * A callback method for {@code hb_buffer_t}. The method gets called with the {@code hb_buffer_t} it was set on, the {@code hb_font_t} the buffer is
     * shaped with and a message describing what step of the shaping process will be performed. Returning {@code false} from this method will skip this
     * shaping step and move to the next one.
     * 
     * <p>Return value: {@code true} to perform the shaping step, {@code false} to skip it.</p>
     *
     * @param buffer  an {@code hb_buffer_t} to work upon
     * @param font    the {@code hb_font_t} the {@code buffer} is shaped with
     * @param message {@code NULL}-terminated message passed to the function
     */
    @NativeType("hb_bool_t") int invoke(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_font_t *") long font, @NativeType("char const *") long message, @NativeType("void *") long user_data);

}