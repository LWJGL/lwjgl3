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
 * Instances of this class may be passed to the {@link LLVMOrc#LLVMOrcThreadSafeModuleWithModuleDo OrcThreadSafeModuleWithModuleDo} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LLVMErrorRef (*{@link #invoke}) (
 *     void *Ctx,
 *     LLVMModuleRef M
 * )</code></pre>
 */
public abstract class LLVMOrcGenericIRModuleOperationFunction extends Callback implements LLVMOrcGenericIRModuleOperationFunctionI {

    /**
     * Creates a {@code LLVMOrcGenericIRModuleOperationFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcGenericIRModuleOperationFunction}
     */
    public static LLVMOrcGenericIRModuleOperationFunction create(long functionPointer) {
        LLVMOrcGenericIRModuleOperationFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcGenericIRModuleOperationFunction
            ? (LLVMOrcGenericIRModuleOperationFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMOrcGenericIRModuleOperationFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcGenericIRModuleOperationFunction} instance that delegates to the specified {@code LLVMOrcGenericIRModuleOperationFunctionI} instance. */
    public static LLVMOrcGenericIRModuleOperationFunction create(LLVMOrcGenericIRModuleOperationFunctionI instance) {
        return instance instanceof LLVMOrcGenericIRModuleOperationFunction
            ? (LLVMOrcGenericIRModuleOperationFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcGenericIRModuleOperationFunction() {
        super(CIF);
    }

    LLVMOrcGenericIRModuleOperationFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcGenericIRModuleOperationFunction {

        private final LLVMOrcGenericIRModuleOperationFunctionI delegate;

        Container(long functionPointer, LLVMOrcGenericIRModuleOperationFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long Ctx, long M) {
            return delegate.invoke(Ctx, M);
        }

    }

}