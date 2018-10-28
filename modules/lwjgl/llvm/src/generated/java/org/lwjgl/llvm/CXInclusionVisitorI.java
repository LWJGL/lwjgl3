/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link ClangIndex#clang_getInclusions getInclusions} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     CXFile included_file,
 *     CXSourceLocation *inclusion_stack,
 *     unsigned include_len,
 *     CXClientData client_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (CXFile, CXSourceLocation *, unsigned, CXClientData)")
public interface CXInclusionVisitorI extends CallbackI.V {

    String SIGNATURE = "(ppip)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgPointer(args)
        );
    }

    /**
     * Visitor invoked for each file in a translation unit (used with {@link ClangIndex#clang_getInclusions getInclusions}).
     * 
     * <p>This visitor function will be invoked by {@code clang_getInclusions()} for each file included (either at the top-level or by #include directives)
     * within a translation unit. The first argument is the file being included, and the second and third arguments provide the inclusion stack. The array is
     * sorted in order of immediate inclusion. For example, the first element refers to the location that included {@code included_file}.</p>
     */
    void invoke(@NativeType("CXFile") long included_file, @NativeType("CXSourceLocation *") long inclusion_stack, @NativeType("unsigned") int include_len, @NativeType("CXClientData") long client_data);

}