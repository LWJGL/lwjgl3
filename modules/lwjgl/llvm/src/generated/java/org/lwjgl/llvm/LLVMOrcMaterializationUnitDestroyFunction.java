/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LLVMOrcMaterializationUnitDestroyFunction} */
public abstract class LLVMOrcMaterializationUnitDestroyFunction extends Callback implements LLVMOrcMaterializationUnitDestroyFunctionI {

    /**
     * Creates a {@code LLVMOrcMaterializationUnitDestroyFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcMaterializationUnitDestroyFunction}
     */
    public static LLVMOrcMaterializationUnitDestroyFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMOrcMaterializationUnitDestroyFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMOrcMaterializationUnitDestroyFunction} instance that delegates to the specified {@code LLVMOrcMaterializationUnitDestroyFunctionI} instance. */
    public static LLVMOrcMaterializationUnitDestroyFunction create(LLVMOrcMaterializationUnitDestroyFunctionI instance) { return create(instance, instance.address()); }

    private static LLVMOrcMaterializationUnitDestroyFunction create(LLVMOrcMaterializationUnitDestroyFunctionI instance, long functionPointer) {
        return instance instanceof LLVMOrcMaterializationUnitDestroyFunction
            ? (LLVMOrcMaterializationUnitDestroyFunction)instance
            : new LLVMOrcMaterializationUnitDestroyFunction(functionPointer) {
                @Override public void invoke(long Ctx) {
                    instance.invoke(Ctx);
                }
            };
    }

    protected LLVMOrcMaterializationUnitDestroyFunction() {
        super(DESCRIPTOR);
    }

    LLVMOrcMaterializationUnitDestroyFunction(long functionPointer) {
        super(functionPointer);
    }

}