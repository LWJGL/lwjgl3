/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LLVMOrcGenericIRModuleOperationFunction} */
public abstract class LLVMOrcGenericIRModuleOperationFunction extends Callback implements LLVMOrcGenericIRModuleOperationFunctionI {

    /**
     * Creates a {@code LLVMOrcGenericIRModuleOperationFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcGenericIRModuleOperationFunction}
     */
    public static LLVMOrcGenericIRModuleOperationFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMOrcGenericIRModuleOperationFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMOrcGenericIRModuleOperationFunction} instance that delegates to the specified {@code LLVMOrcGenericIRModuleOperationFunctionI} instance. */
    public static LLVMOrcGenericIRModuleOperationFunction create(LLVMOrcGenericIRModuleOperationFunctionI instance) { return create(instance, instance.address()); }

    private static LLVMOrcGenericIRModuleOperationFunction create(LLVMOrcGenericIRModuleOperationFunctionI instance, long functionPointer) {
        return instance instanceof LLVMOrcGenericIRModuleOperationFunction
            ? (LLVMOrcGenericIRModuleOperationFunction)instance
            : new LLVMOrcGenericIRModuleOperationFunction(functionPointer) {
                @Override public long invoke(long Ctx, long M) {
                    return instance.invoke(Ctx, M);
                }
            };
    }

    protected LLVMOrcGenericIRModuleOperationFunction() {
        super(DESCRIPTOR);
    }

    LLVMOrcGenericIRModuleOperationFunction(long functionPointer) {
        super(functionPointer);
    }

}