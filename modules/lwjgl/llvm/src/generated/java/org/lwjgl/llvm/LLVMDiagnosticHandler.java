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
public abstract class LLVMDiagnosticHandler extends Callback implements LLVMDiagnosticHandlerI {

    /**
     * Creates a {@code LLVMDiagnosticHandler} instance from the specified function pointer.
     *
     * @return the new {@code LLVMDiagnosticHandler}
     */
    public static LLVMDiagnosticHandler create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMDiagnosticHandler createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMDiagnosticHandler} instance that delegates to the specified {@code LLVMDiagnosticHandlerI} instance. */
    public static LLVMDiagnosticHandler create(LLVMDiagnosticHandlerI instance) { return create(instance, instance.address()); }

    private static LLVMDiagnosticHandler create(LLVMDiagnosticHandlerI instance, long functionPointer) {
        return instance instanceof LLVMDiagnosticHandler
            ? (LLVMDiagnosticHandler)instance
            : new LLVMDiagnosticHandler(functionPointer) {
                @Override public void invoke(long DiagnosticInfo, long DiagnosticContext) {
                    instance.invoke(DiagnosticInfo, DiagnosticContext);
                }
            };
    }

    protected LLVMDiagnosticHandler() {
        super(DESCRIPTOR);
    }

    LLVMDiagnosticHandler(long functionPointer) {
        super(functionPointer);
    }

}