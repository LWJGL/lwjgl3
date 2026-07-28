/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LLVMOrcMaterializationUnitMaterializeFunction} */
public abstract class LLVMOrcMaterializationUnitMaterializeFunction extends Callback implements LLVMOrcMaterializationUnitMaterializeFunctionI {

    /**
     * Creates a {@code LLVMOrcMaterializationUnitMaterializeFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcMaterializationUnitMaterializeFunction}
     */
    public static LLVMOrcMaterializationUnitMaterializeFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMOrcMaterializationUnitMaterializeFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMOrcMaterializationUnitMaterializeFunction} instance that delegates to the specified {@code LLVMOrcMaterializationUnitMaterializeFunctionI} instance. */
    public static LLVMOrcMaterializationUnitMaterializeFunction create(LLVMOrcMaterializationUnitMaterializeFunctionI instance) { return create(instance, instance.address()); }

    private static LLVMOrcMaterializationUnitMaterializeFunction create(LLVMOrcMaterializationUnitMaterializeFunctionI instance, long functionPointer) {
        return instance instanceof LLVMOrcMaterializationUnitMaterializeFunction
            ? (LLVMOrcMaterializationUnitMaterializeFunction)instance
            : new LLVMOrcMaterializationUnitMaterializeFunction(functionPointer) {
                @Override public void invoke(long Ctx, long MR) {
                    instance.invoke(Ctx, MR);
                }
            };
    }

    protected LLVMOrcMaterializationUnitMaterializeFunction() {
        super(DESCRIPTOR);
    }

    LLVMOrcMaterializationUnitMaterializeFunction(long functionPointer) {
        super(functionPointer);
    }

}