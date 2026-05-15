/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LLVMOrcObjectTransformLayerTransformFunction} */
public abstract class LLVMOrcObjectTransformLayerTransformFunction extends Callback implements LLVMOrcObjectTransformLayerTransformFunctionI {

    /**
     * Creates a {@code LLVMOrcObjectTransformLayerTransformFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcObjectTransformLayerTransformFunction}
     */
    public static LLVMOrcObjectTransformLayerTransformFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMOrcObjectTransformLayerTransformFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMOrcObjectTransformLayerTransformFunction} instance that delegates to the specified {@code LLVMOrcObjectTransformLayerTransformFunctionI} instance. */
    public static LLVMOrcObjectTransformLayerTransformFunction create(LLVMOrcObjectTransformLayerTransformFunctionI instance) { return create(instance, instance.address()); }

    private static LLVMOrcObjectTransformLayerTransformFunction create(LLVMOrcObjectTransformLayerTransformFunctionI instance, long functionPointer) {
        return instance instanceof LLVMOrcObjectTransformLayerTransformFunction
            ? (LLVMOrcObjectTransformLayerTransformFunction)instance
            : new LLVMOrcObjectTransformLayerTransformFunction(functionPointer) {
                @Override public long invoke(long Ctx, long ObjInOut) {
                    return instance.invoke(Ctx, ObjInOut);
                }
            };
    }

    protected LLVMOrcObjectTransformLayerTransformFunction() {
        super(DESCRIPTOR);
    }

    LLVMOrcObjectTransformLayerTransformFunction(long functionPointer) {
        super(functionPointer);
    }

}