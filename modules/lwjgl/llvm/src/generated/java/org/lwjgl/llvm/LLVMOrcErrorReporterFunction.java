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
 * Instances of this class may be passed to the {@link LLVMOrc#LLVMOrcExecutionSessionSetErrorReporter OrcExecutionSessionSetErrorReporter} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     void *Ctx,
 *     LLVMErrorRef Err
 * )</code></pre>
 */
public abstract class LLVMOrcErrorReporterFunction extends Callback implements LLVMOrcErrorReporterFunctionI {

    /**
     * Creates a {@code LLVMOrcErrorReporterFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcErrorReporterFunction}
     */
    public static LLVMOrcErrorReporterFunction create(long functionPointer) {
        LLVMOrcErrorReporterFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcErrorReporterFunction
            ? (LLVMOrcErrorReporterFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMOrcErrorReporterFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcErrorReporterFunction} instance that delegates to the specified {@code LLVMOrcErrorReporterFunctionI} instance. */
    public static LLVMOrcErrorReporterFunction create(LLVMOrcErrorReporterFunctionI instance) {
        return instance instanceof LLVMOrcErrorReporterFunction
            ? (LLVMOrcErrorReporterFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcErrorReporterFunction() {
        super(CIF);
    }

    LLVMOrcErrorReporterFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcErrorReporterFunction {

        private final LLVMOrcErrorReporterFunctionI delegate;

        Container(long functionPointer, LLVMOrcErrorReporterFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long Ctx, long Err) {
            delegate.invoke(Ctx, Err);
        }

    }

}