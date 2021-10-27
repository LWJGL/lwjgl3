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
 * Instances of this class may be passed to the {@link LLVMOrc#LLVMOrcIRTransformLayerSetTransform OrcIRTransformLayerSetTransform} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LLVMErrorRef (*{@link #invoke}) (
 *     void *Ctx,
 *     LLVMOrcThreadSafeModuleRef *ModInOut,
 *     LLVMOrcMaterializationResponsibilityRef MR
 * )</code></pre>
 */
public abstract class LLVMOrcIRTransformLayerTransformFunction extends Callback implements LLVMOrcIRTransformLayerTransformFunctionI {

    /**
     * Creates a {@code LLVMOrcIRTransformLayerTransformFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcIRTransformLayerTransformFunction}
     */
    public static LLVMOrcIRTransformLayerTransformFunction create(long functionPointer) {
        LLVMOrcIRTransformLayerTransformFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcIRTransformLayerTransformFunction
            ? (LLVMOrcIRTransformLayerTransformFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMOrcIRTransformLayerTransformFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcIRTransformLayerTransformFunction} instance that delegates to the specified {@code LLVMOrcIRTransformLayerTransformFunctionI} instance. */
    public static LLVMOrcIRTransformLayerTransformFunction create(LLVMOrcIRTransformLayerTransformFunctionI instance) {
        return instance instanceof LLVMOrcIRTransformLayerTransformFunction
            ? (LLVMOrcIRTransformLayerTransformFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcIRTransformLayerTransformFunction() {
        super(CIF);
    }

    LLVMOrcIRTransformLayerTransformFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcIRTransformLayerTransformFunction {

        private final LLVMOrcIRTransformLayerTransformFunctionI delegate;

        Container(long functionPointer, LLVMOrcIRTransformLayerTransformFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long Ctx, long ModInOut, long MR) {
            return delegate.invoke(Ctx, ModInOut, MR);
        }

    }

}