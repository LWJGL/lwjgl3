/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be passed to the {@link CoreGraphics#CGEventTapCreate EventTapCreate} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * CGEventRef (*{@link #invoke}) (
 *     CGEventTapProxy proxy,
 *     CGEventType type,
 *     CGEventRef event,
 *     void *userInfo
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("CGEventRef (*) (CGEventTapProxy, CGEventType, CGEventRef, void *)")
public interface CGEventTapCallBackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * A client-supplied callback function that’s invoked whenever an associated event tap receives a Quartz event.
     * 
     * <p>The callback is passed a proxy for the tap, the event type, the incoming event, and the user-defined data specified when the event tap was created. The
     * function should return the (possibly modified) passed-in event, a newly constructed event, or {@code NULL} if the event is to be deleted. The event passed to
     * the callback is retained by the calling code, and is released after the callback returns and the data is passed back to the event system. If a
     * different event is returned by the callback function, then that event will be released by the calling code along with the original event, after the
     * event data has been passed back to the event system.</p>
     */
    @NativeType("CGEventRef") long invoke(@NativeType("CGEventTapProxy") long proxy, @NativeType("CGEventType") int type, @NativeType("CGEventRef") long event, @NativeType("void *") long userInfo);

}