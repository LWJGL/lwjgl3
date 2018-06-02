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
 * YGNodeRef (*) (
 *     YGNodeRef oldNode,
 *     YGNodeRef owner,
 *     int childIndex
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("YGCloneNodeFunc")
public interface YGCloneNodeFuncI extends CallbackI.P {

    String SIGNATURE = "(ppi)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    @NativeType("YGNodeRef") long invoke(@NativeType("YGNodeRef") long oldNode, @NativeType("YGNodeRef") long owner, int childIndex);

}