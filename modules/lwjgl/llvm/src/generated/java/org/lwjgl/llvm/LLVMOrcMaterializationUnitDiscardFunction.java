/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LLVMOrcMaterializationUnitDiscardFunction} */
public abstract class LLVMOrcMaterializationUnitDiscardFunction extends Callback implements LLVMOrcMaterializationUnitDiscardFunctionI {

    /**
     * Creates a {@code LLVMOrcMaterializationUnitDiscardFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcMaterializationUnitDiscardFunction}
     */
    public static LLVMOrcMaterializationUnitDiscardFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMOrcMaterializationUnitDiscardFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMOrcMaterializationUnitDiscardFunction} instance that delegates to the specified {@code LLVMOrcMaterializationUnitDiscardFunctionI} instance. */
    public static LLVMOrcMaterializationUnitDiscardFunction create(LLVMOrcMaterializationUnitDiscardFunctionI instance) { return create(instance, instance.address()); }

    private static LLVMOrcMaterializationUnitDiscardFunction create(LLVMOrcMaterializationUnitDiscardFunctionI instance, long functionPointer) {
        return instance instanceof LLVMOrcMaterializationUnitDiscardFunction
            ? (LLVMOrcMaterializationUnitDiscardFunction)instance
            : new LLVMOrcMaterializationUnitDiscardFunction(functionPointer) {
                @Override public void invoke(long Ctx, long JD, long Symbol) {
                    instance.invoke(Ctx, JD, Symbol);
                }
            };
    }

    protected LLVMOrcMaterializationUnitDiscardFunction() {
        super(DESCRIPTOR);
    }

    LLVMOrcMaterializationUnitDiscardFunction(long functionPointer) {
        super(functionPointer);
    }

}