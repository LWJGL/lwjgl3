/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * uint64_t (*) (
 *     YGNodeRef node,
 *     float width,
 *     YGMeasureMode widthMode,
 *     float height,
 *     YGMeasureMode heightMode
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("YGMeasureFunc")
public interface YGMeasureFuncI extends CallbackI.J {

    String SIGNATURE = "(pfifi)l";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgFloat(args),
            dcbArgInt(args),
            dcbArgFloat(args),
            dcbArgInt(args)
        );
    }

    /** Use {@link YGMeasureFunc#toLong toLong} to create the return value. */
    @NativeType("uint64_t") long invoke(@NativeType("YGNodeRef") long node, float width, @NativeType("YGMeasureMode") int widthMode, float height, @NativeType("YGMeasureMode") int heightMode);

}