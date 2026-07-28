/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class LTODiagnosticHandler extends Callback implements LTODiagnosticHandlerI {

    /**
     * Creates a {@code LTODiagnosticHandler} instance from the specified function pointer.
     *
     * @return the new {@code LTODiagnosticHandler}
     */
    public static LTODiagnosticHandler create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LTODiagnosticHandler createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LTODiagnosticHandler} instance that delegates to the specified {@code LTODiagnosticHandlerI} instance. */
    public static LTODiagnosticHandler create(LTODiagnosticHandlerI instance) { return create(instance, instance.address()); }

    private static LTODiagnosticHandler create(LTODiagnosticHandlerI instance, long functionPointer) {
        return instance instanceof LTODiagnosticHandler
            ? (LTODiagnosticHandler)instance
            : new LTODiagnosticHandler(functionPointer) {
                @Override public void invoke(int severity, long diag, long ctxt) {
                    instance.invoke(severity, diag, ctxt);
                }
            };
    }

    protected LTODiagnosticHandler() {
        super(DESCRIPTOR);
    }

    LTODiagnosticHandler(long functionPointer) {
        super(functionPointer);
    }

}