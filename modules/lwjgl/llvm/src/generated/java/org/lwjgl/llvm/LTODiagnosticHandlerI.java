/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

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
public interface LTODiagnosticHandlerI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetInt(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
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