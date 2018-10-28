/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link ClangIndex#clang_Type_visitFields Type_visitFields} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * enum CXVisitorResult (*) (
 *     CXCursor C,
 *     CXClientData client_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("enum CXVisitorResult (*) (CXCursor, CXClientData)")
public interface CXFieldVisitorI extends CallbackI.I {

    String SIGNATURE = "(p)i";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            CXCursor.create(dcbArgPointer(args))
        );
    }

    /**
     * Visitor invoked for each field found by a traversal.
     * 
     * <p>This visitor function will be invoked for each field found by {@link ClangIndex#clang_Type_visitFields Type_visitFields}. Its first argument is the cursor being visited, its second argument
     * is the client data provided to {@code clang_Type_visitFields}.</p>
     * 
     * <p>The visitor should return one of the {@code CXVisitorResult} values to direct {@code {@link ClangIndex#clang_Type_visitFields Type_visitFields}}.</p>
     */
    @NativeType("enum CXVisitorResult") int invoke(CXCursor C);

}