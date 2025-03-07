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
    public static LTODiagnosticHandler create(long functionPointer) {
        LTODiagnosticHandlerI instance = Callback.get(functionPointer);
        return instance instanceof LTODiagnosticHandler
            ? (LTODiagnosticHandler)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LTODiagnosticHandler createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LTODiagnosticHandler} instance that delegates to the specified {@code LTODiagnosticHandlerI} instance. */
    public static LTODiagnosticHandler create(LTODiagnosticHandlerI instance) {
        return instance instanceof LTODiagnosticHandler
            ? (LTODiagnosticHandler)instance
            : new Container(instance.address(), instance);
    }

    protected LTODiagnosticHandler() {
        super(CIF);
    }

    LTODiagnosticHandler(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LTODiagnosticHandler {

        private final LTODiagnosticHandlerI delegate;

        Container(long functionPointer, LTODiagnosticHandlerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int severity, long diag, long ctxt) {
            delegate.invoke(severity, diag, ctxt);
        }

    }

}