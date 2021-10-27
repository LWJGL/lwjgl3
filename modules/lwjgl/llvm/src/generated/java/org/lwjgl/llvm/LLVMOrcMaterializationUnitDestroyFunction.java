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
 * Instances of this class may be passed to the {@link LLVMOrc#LLVMOrcCreateCustomMaterializationUnit OrcCreateCustomMaterializationUnit} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     void *Ctx
 * )</code></pre>
 */
public abstract class LLVMOrcMaterializationUnitDestroyFunction extends Callback implements LLVMOrcMaterializationUnitDestroyFunctionI {

    /**
     * Creates a {@code LLVMOrcMaterializationUnitDestroyFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcMaterializationUnitDestroyFunction}
     */
    public static LLVMOrcMaterializationUnitDestroyFunction create(long functionPointer) {
        LLVMOrcMaterializationUnitDestroyFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcMaterializationUnitDestroyFunction
            ? (LLVMOrcMaterializationUnitDestroyFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMOrcMaterializationUnitDestroyFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcMaterializationUnitDestroyFunction} instance that delegates to the specified {@code LLVMOrcMaterializationUnitDestroyFunctionI} instance. */
    public static LLVMOrcMaterializationUnitDestroyFunction create(LLVMOrcMaterializationUnitDestroyFunctionI instance) {
        return instance instanceof LLVMOrcMaterializationUnitDestroyFunction
            ? (LLVMOrcMaterializationUnitDestroyFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcMaterializationUnitDestroyFunction() {
        super(CIF);
    }

    LLVMOrcMaterializationUnitDestroyFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcMaterializationUnitDestroyFunction {

        private final LLVMOrcMaterializationUnitDestroyFunctionI delegate;

        Container(long functionPointer, LLVMOrcMaterializationUnitDestroyFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long Ctx) {
            delegate.invoke(Ctx);
        }

    }

}