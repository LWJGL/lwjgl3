/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code visit} field of the {@link CXCursorAndRangeVisitor} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * enum CXVisitorResult (*) (
 *     void *context,
 *     CXCursor cursor,
 *     CXSourceRange range
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("enum CXVisitorResult (*) (void *, CXCursor, CXSourceRange)")
public interface CXCursorAndRangeVisitI extends CallbackI.I {

    String SIGNATURE = "(pp)i";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            CXCursor.create(dcbArgPointer(args)),
            CXSourceRange.create(dcbArgPointer(args))
        );
    }

    @NativeType("enum CXVisitorResult") int invoke(CXCursor cursor, CXSourceRange range);

}