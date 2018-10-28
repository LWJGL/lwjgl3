/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link LLVMLTO#lto_codegen_set_diagnostic_handler codegen_set_diagnostic_handler} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     lto_codegen_diagnostic_severity_t severity,
 *     char const *diag,
 *     void *ctxt
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (lto_codegen_diagnostic_severity_t, char const *, void *)")
public interface LTODiagnosticHandlerI extends CallbackI.V {

    String SIGNATURE = "(ipp)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /**
     * Diagnostic handler type.
     *
     * @param severity the severity
     * @param diag     the actual diagnostic. The diagnostic is not prefixed by any of severity keyword, e.g., 'error: '.
     * @param ctxt     used to pass the context set with the diagnostic handler
     */
    void invoke(@NativeType("lto_codegen_diagnostic_severity_t") int severity, @NativeType("char const *") long diag, @NativeType("void *") long ctxt);

}