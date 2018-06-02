/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Profiler region begin.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     bgfx_callback_interface_t *_this,
 *     char const *_name,
 *     uint32_t _abgr,
 *     char const *_filePath,
 *     uint16_t _line
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint32_t, char const *, uint16_t)")
public interface BGFXProfilerBeginI extends CallbackI.V {

    String SIGNATURE = "(ppips)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgShort(args)
        );
    }

    /**
     * Will be called when a profiler region begins.
     * 
     * <p>Not thread safe and it can be called from any thread.</p>
     *
     * @param _this     the callback interface
     * @param _name     region name, contains dynamic string
     * @param _abgr     color of profiler region
     * @param _filePath file path where {@code profiler_begin} was called
     * @param _line     line where {@code profiler_begin} was called
     */
    void invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("char const *") long _name, @NativeType("uint32_t") int _abgr, @NativeType("char const *") long _filePath, @NativeType("uint16_t") short _line);

}