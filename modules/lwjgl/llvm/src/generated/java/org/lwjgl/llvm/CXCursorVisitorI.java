/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link ClangIndex#clang_visitChildren visitChildren} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * enum CXChildVisitResult (*) (
 *     CXCursor cursor,
 *     CXCursor parent,
 *     CXClientData client_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("enum CXChildVisitResult (*) (CXCursor, CXCursor, CXClientData)")
public interface CXCursorVisitorI extends CallbackI.I {

    String SIGNATURE = "(pp)i";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            CXCursor.create(dcbArgPointer(args)),
            CXCursor.create(dcbArgPointer(args))
        );
    }

    /**
     * Visitor invoked for each cursor found by a traversal.
     * 
     * <p>This visitor function will be invoked for each cursor found by {@link ClangIndex#clang_visitChildren visitChildren}. Its first argument is the cursor being visited, its second
     * argument is the parent visitor for that cursor, and its third argument is the client data provided to {@code clang_visitChildren()}.</p>
     * 
     * <p>The visitor should return one of the {@code CXChildVisitResult} values to direct {@code clang_visitChildren()}.</p>
     */
    @NativeType("enum CXChildVisitResult") int invoke(CXCursor cursor, CXCursor parent);

}