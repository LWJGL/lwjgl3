/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code endMarker} field of the {@link YGMarkerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     YGMarker marker,
 *     YGNodeRef node,
 *     void *data,
 *     void *id
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (YGMarker, YGNodeRef, void *, void *)")
public interface EndMarkerCallbackI extends CallbackI.V {

    String SIGNATURE = "(ippp)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /** The end marker callback. */
    void invoke(@NativeType("YGMarker") int marker, @NativeType("YGNodeRef") long node, @NativeType("void *") long data, @NativeType("void *") long id);

}