/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * YGSize (*{@link #invoke}) (
 *     YGNodeConstRef node,
 *     float width,
 *     YGMeasureMode widthMode,
 *     float height,
 *     YGMeasureMode heightMode
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("YGMeasureFunc")
public interface YGMeasureFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        apiCreateStruct(ffi_type_float, ffi_type_float),
        ffi_type_pointer, ffi_type_float, ffi_type_uint32, ffi_type_float, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetFloat(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetFloat(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            YGSize.create(ret)
        );
    }

    /**
     * Returns the computed dimensions of the node, following the constraints of {@code widthMode} and {@code heightMode}:
     * 
     * <p>{@link Yoga#YGMeasureModeUndefined MeasureModeUndefined}: The parent has not imposed any constraint on the child. It can be whatever size it wants.</p>
     * 
     * <p>{@link Yoga#YGMeasureModeAtMost MeasureModeAtMost}: The child can be as large as it wants up to the specified size.</p>
     * 
     * <p>{@link Yoga#YGMeasureModeExactly MeasureModeExactly}: The parent has determined an exact size for the child. The child is going to be given those bounds regardless of how big it wants
     * to be.</p>
     */
    void invoke(@NativeType("YGNodeConstRef") long node, float width, @NativeType("YGMeasureMode") int widthMode, float height, @NativeType("YGMeasureMode") int heightMode, YGSize __result);

}