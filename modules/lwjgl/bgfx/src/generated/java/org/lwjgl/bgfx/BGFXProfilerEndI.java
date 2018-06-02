/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Profiler region end.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     bgfx_callback_interface_t *_this
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (bgfx_callback_interface_t *)")
public interface BGFXProfilerEndI extends CallbackI.V {

    String SIGNATURE = "(p)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args)
        );
    }

    /**
     * Will be called when a profiler region ends.
     * 
     * <p>Not thread safe and it can be called from any thread.</p>
     *
     * @param _this the callback interface
     */
    void invoke(@NativeType("bgfx_callback_interface_t *") long _this);

}