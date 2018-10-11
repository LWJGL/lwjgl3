/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * If fatal code is not {@link BGFX#BGFX_FATAL_DEBUG_CHECK FATAL_DEBUG_CHECK} this callback is called on unrecoverable error. It's not safe to continue, inform user and terminate
 * application from this call.
 * 
 * <p>Not thread safe and it can be called from any thread.</p>
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     bgfx_callback_interface_t *_this,
 *     char const *_filePath,
 *     uint16_t _line,
 *     bgfx_fatal_t _code,
 *     char const *_str
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint16_t, bgfx_fatal_t, char const *)")
public interface BGFXFatalCallbackI extends CallbackI.V {

    String SIGNATURE = "(ppsip)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgShort(args),
            dcbArgInt(args),
            dcbArgPointer(args)
        );
    }

    /**
     * This callback is called on unrecoverable errors.
     *
     * @param _this     the callback interface
     * @param _filePath file path where fatal message was generated
     * @param _line     line where fatal message was generated
     * @param _code     the error code
     * @param _str      the error message
     */
    void invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("char const *") long _filePath, @NativeType("uint16_t") short _line, @NativeType("bgfx_fatal_t") int _code, @NativeType("char const *") long _str);

}