/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LLVMOrcDisposeCAPIDefinitionGeneratorFunction} */
public abstract class LLVMOrcDisposeCAPIDefinitionGeneratorFunction extends Callback implements LLVMOrcDisposeCAPIDefinitionGeneratorFunctionI {

    /**
     * Creates a {@code LLVMOrcDisposeCAPIDefinitionGeneratorFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcDisposeCAPIDefinitionGeneratorFunction}
     */
    public static LLVMOrcDisposeCAPIDefinitionGeneratorFunction create(long functionPointer) {
        LLVMOrcDisposeCAPIDefinitionGeneratorFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcDisposeCAPIDefinitionGeneratorFunction
            ? (LLVMOrcDisposeCAPIDefinitionGeneratorFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMOrcDisposeCAPIDefinitionGeneratorFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcDisposeCAPIDefinitionGeneratorFunction} instance that delegates to the specified {@code LLVMOrcDisposeCAPIDefinitionGeneratorFunctionI} instance. */
    public static LLVMOrcDisposeCAPIDefinitionGeneratorFunction create(LLVMOrcDisposeCAPIDefinitionGeneratorFunctionI instance) {
        return instance instanceof LLVMOrcDisposeCAPIDefinitionGeneratorFunction
            ? (LLVMOrcDisposeCAPIDefinitionGeneratorFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcDisposeCAPIDefinitionGeneratorFunction() {
        super(CIF);
    }

    LLVMOrcDisposeCAPIDefinitionGeneratorFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcDisposeCAPIDefinitionGeneratorFunction {

        private final LLVMOrcDisposeCAPIDefinitionGeneratorFunctionI delegate;

        Container(long functionPointer, LLVMOrcDisposeCAPIDefinitionGeneratorFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long Ctx) {
            delegate.invoke(Ctx);
        }

    }

}