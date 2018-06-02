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
 * float (*) (
 *     YGNodeRef node,
 *     float width,
 *     float height
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("YGBaselineFunc")
public interface YGBaselineFuncI extends CallbackI.F {

    String SIGNATURE = "(pff)f";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default float callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgFloat(args),
            dcbArgFloat(args)
        );
    }

    float invoke(@NativeType("YGNodeRef") long node, float width, float height);

}