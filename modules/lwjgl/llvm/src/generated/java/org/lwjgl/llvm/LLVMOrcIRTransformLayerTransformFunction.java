/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LLVMOrcIRTransformLayerTransformFunction} */
public abstract class LLVMOrcIRTransformLayerTransformFunction extends Callback implements LLVMOrcIRTransformLayerTransformFunctionI {

    /**
     * Creates a {@code LLVMOrcIRTransformLayerTransformFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcIRTransformLayerTransformFunction}
     */
    public static LLVMOrcIRTransformLayerTransformFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMOrcIRTransformLayerTransformFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMOrcIRTransformLayerTransformFunction} instance that delegates to the specified {@code LLVMOrcIRTransformLayerTransformFunctionI} instance. */
    public static LLVMOrcIRTransformLayerTransformFunction create(LLVMOrcIRTransformLayerTransformFunctionI instance) { return create(instance, instance.address()); }

    private static LLVMOrcIRTransformLayerTransformFunction create(LLVMOrcIRTransformLayerTransformFunctionI instance, long functionPointer) {
        return instance instanceof LLVMOrcIRTransformLayerTransformFunction
            ? (LLVMOrcIRTransformLayerTransformFunction)instance
            : new LLVMOrcIRTransformLayerTransformFunction(functionPointer) {
                @Override public long invoke(long Ctx, long ModInOut, long MR) {
                    return instance.invoke(Ctx, ModInOut, MR);
                }
            };
    }

    protected LLVMOrcIRTransformLayerTransformFunction() {
        super(DESCRIPTOR);
    }

    LLVMOrcIRTransformLayerTransformFunction(long functionPointer) {
        super(functionPointer);
    }

}