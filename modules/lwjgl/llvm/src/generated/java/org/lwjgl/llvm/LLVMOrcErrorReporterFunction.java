/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LLVMOrcErrorReporterFunction} */
public abstract class LLVMOrcErrorReporterFunction extends Callback implements LLVMOrcErrorReporterFunctionI {

    /**
     * Creates a {@code LLVMOrcErrorReporterFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcErrorReporterFunction}
     */
    public static LLVMOrcErrorReporterFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMOrcErrorReporterFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMOrcErrorReporterFunction} instance that delegates to the specified {@code LLVMOrcErrorReporterFunctionI} instance. */
    public static LLVMOrcErrorReporterFunction create(LLVMOrcErrorReporterFunctionI instance) { return create(instance, instance.address()); }

    private static LLVMOrcErrorReporterFunction create(LLVMOrcErrorReporterFunctionI instance, long functionPointer) {
        return instance instanceof LLVMOrcErrorReporterFunction
            ? (LLVMOrcErrorReporterFunction)instance
            : new LLVMOrcErrorReporterFunction(functionPointer) {
                @Override public void invoke(long Ctx, long Err) {
                    instance.invoke(Ctx, Err);
                }
            };
    }

    protected LLVMOrcErrorReporterFunction() {
        super(DESCRIPTOR);
    }

    LLVMOrcErrorReporterFunction(long functionPointer) {
        super(functionPointer);
    }

}