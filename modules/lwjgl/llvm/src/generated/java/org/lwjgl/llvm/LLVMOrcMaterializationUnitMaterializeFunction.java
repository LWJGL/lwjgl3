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
 *     void *Ctx,
 *     LLVMOrcMaterializationResponsibilityRef MR
 * )</code></pre>
 */
public abstract class LLVMOrcMaterializationUnitMaterializeFunction extends Callback implements LLVMOrcMaterializationUnitMaterializeFunctionI {

    /**
     * Creates a {@code LLVMOrcMaterializationUnitMaterializeFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcMaterializationUnitMaterializeFunction}
     */
    public static LLVMOrcMaterializationUnitMaterializeFunction create(long functionPointer) {
        LLVMOrcMaterializationUnitMaterializeFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcMaterializationUnitMaterializeFunction
            ? (LLVMOrcMaterializationUnitMaterializeFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMOrcMaterializationUnitMaterializeFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcMaterializationUnitMaterializeFunction} instance that delegates to the specified {@code LLVMOrcMaterializationUnitMaterializeFunctionI} instance. */
    public static LLVMOrcMaterializationUnitMaterializeFunction create(LLVMOrcMaterializationUnitMaterializeFunctionI instance) {
        return instance instanceof LLVMOrcMaterializationUnitMaterializeFunction
            ? (LLVMOrcMaterializationUnitMaterializeFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcMaterializationUnitMaterializeFunction() {
        super(CIF);
    }

    LLVMOrcMaterializationUnitMaterializeFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcMaterializationUnitMaterializeFunction {

        private final LLVMOrcMaterializationUnitMaterializeFunctionI delegate;

        Container(long functionPointer, LLVMOrcMaterializationUnitMaterializeFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long Ctx, long MR) {
            delegate.invoke(Ctx, MR);
        }

    }

}