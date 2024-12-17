/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction} */
public abstract class LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction extends Callback implements LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunctionI {

    /**
     * Creates a {@code LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction}
     */
    public static LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction create(long functionPointer) {
        LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction
            ? (LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction} instance that delegates to the specified {@code LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunctionI} instance. */
    public static LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction create(LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunctionI instance) {
        return instance instanceof LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction
            ? (LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction() {
        super(CIF);
    }

    LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction {

        private final LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunctionI delegate;

        Container(long functionPointer, LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long GeneratorObj, long Ctx, long LookupState, int Kind, long JD, int JDLookupFlags, long LookupSet, long LookupSetSize) {
            return delegate.invoke(GeneratorObj, Ctx, LookupState, Kind, JD, JDLookupFlags, LookupSet, LookupSetSize);
        }

    }

}