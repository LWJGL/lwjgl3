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
 *     LLVMOrcJITDylibRef JD,
 *     LLVMOrcSymbolStringPoolEntryRef Symbol
 * )</code></pre>
 */
public abstract class LLVMOrcMaterializationUnitDiscardFunction extends Callback implements LLVMOrcMaterializationUnitDiscardFunctionI {

    /**
     * Creates a {@code LLVMOrcMaterializationUnitDiscardFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcMaterializationUnitDiscardFunction}
     */
    public static LLVMOrcMaterializationUnitDiscardFunction create(long functionPointer) {
        LLVMOrcMaterializationUnitDiscardFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcMaterializationUnitDiscardFunction
            ? (LLVMOrcMaterializationUnitDiscardFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMOrcMaterializationUnitDiscardFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcMaterializationUnitDiscardFunction} instance that delegates to the specified {@code LLVMOrcMaterializationUnitDiscardFunctionI} instance. */
    public static LLVMOrcMaterializationUnitDiscardFunction create(LLVMOrcMaterializationUnitDiscardFunctionI instance) {
        return instance instanceof LLVMOrcMaterializationUnitDiscardFunction
            ? (LLVMOrcMaterializationUnitDiscardFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcMaterializationUnitDiscardFunction() {
        super(CIF);
    }

    LLVMOrcMaterializationUnitDiscardFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcMaterializationUnitDiscardFunction {

        private final LLVMOrcMaterializationUnitDiscardFunctionI delegate;

        Container(long functionPointer, LLVMOrcMaterializationUnitDiscardFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long Ctx, long JD, long Symbol) {
            delegate.invoke(Ctx, JD, Symbol);
        }

    }

}