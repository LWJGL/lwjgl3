/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link LLVMOrc#LLVMOrcObjectTransformLayerSetTransform OrcObjectTransformLayerSetTransform} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LLVMErrorRef (*{@link #invoke}) (
 *     void *Ctx,
 *     LLVMMemoryBufferRef *ObjInOut
 * )</code></pre>
 */
public abstract class LLVMOrcObjectTransformLayerTransformFunction extends Callback implements LLVMOrcObjectTransformLayerTransformFunctionI {

    /**
     * Creates a {@code LLVMOrcObjectTransformLayerTransformFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcObjectTransformLayerTransformFunction}
     */
    public static LLVMOrcObjectTransformLayerTransformFunction create(long functionPointer) {
        LLVMOrcObjectTransformLayerTransformFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcObjectTransformLayerTransformFunction
            ? (LLVMOrcObjectTransformLayerTransformFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMOrcObjectTransformLayerTransformFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcObjectTransformLayerTransformFunction} instance that delegates to the specified {@code LLVMOrcObjectTransformLayerTransformFunctionI} instance. */
    public static LLVMOrcObjectTransformLayerTransformFunction create(LLVMOrcObjectTransformLayerTransformFunctionI instance) {
        return instance instanceof LLVMOrcObjectTransformLayerTransformFunction
            ? (LLVMOrcObjectTransformLayerTransformFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcObjectTransformLayerTransformFunction() {
        super(CIF);
    }

    LLVMOrcObjectTransformLayerTransformFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcObjectTransformLayerTransformFunction {

        private final LLVMOrcObjectTransformLayerTransformFunctionI delegate;

        Container(long functionPointer, LLVMOrcObjectTransformLayerTransformFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long Ctx, long ObjInOut) {
            return delegate.invoke(Ctx, ObjInOut);
        }

    }

}