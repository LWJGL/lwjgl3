/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code startMarker} field of the {@link YGMarkerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*) (
 *     YGMarker marker,
 *     YGNodeRef node,
 *     void *data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void * (*) (YGMarker, YGNodeRef, void *)")
public interface StartMarkerCallbackI extends CallbackI.P {

    String SIGNATURE = "(ipp)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /** The start marker callback. */
    @NativeType("void *") long invoke(@NativeType("YGMarker") int marker, @NativeType("YGNodeRef") long node, @NativeType("void *") long data);

}