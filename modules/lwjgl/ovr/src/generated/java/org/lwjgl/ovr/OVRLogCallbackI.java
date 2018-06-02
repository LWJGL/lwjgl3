/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@code LogCallback} member of the {@link OVRInitParams} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     uintptr_t userData,
 *     int level,
 *     char const *message
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ovrLogCallback")
public interface OVRLogCallbackI extends CallbackI.V {

    String SIGNATURE = "(pip)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgPointer(args)
        );
    }

    /**
     * The logging callback.
     *
     * @param userData an arbitrary value specified by the user of ovrInitParams
     * @param level    one of the {@code ovrLogLevel} constants
     * @param message  a UTF8-encoded null-terminated string
     */
    void invoke(@NativeType("uintptr_t") long userData, int level, @NativeType("char const *") long message);

}