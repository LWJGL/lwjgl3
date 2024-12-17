/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LLVMOrcExecutionSessionLookupHandleResultFunction} */
public abstract class LLVMOrcExecutionSessionLookupHandleResultFunction extends Callback implements LLVMOrcExecutionSessionLookupHandleResultFunctionI {

    /**
     * Creates a {@code LLVMOrcExecutionSessionLookupHandleResultFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcExecutionSessionLookupHandleResultFunction}
     */
    public static LLVMOrcExecutionSessionLookupHandleResultFunction create(long functionPointer) {
        LLVMOrcExecutionSessionLookupHandleResultFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcExecutionSessionLookupHandleResultFunction
            ? (LLVMOrcExecutionSessionLookupHandleResultFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMOrcExecutionSessionLookupHandleResultFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcExecutionSessionLookupHandleResultFunction} instance that delegates to the specified {@code LLVMOrcExecutionSessionLookupHandleResultFunctionI} instance. */
    public static LLVMOrcExecutionSessionLookupHandleResultFunction create(LLVMOrcExecutionSessionLookupHandleResultFunctionI instance) {
        return instance instanceof LLVMOrcExecutionSessionLookupHandleResultFunction
            ? (LLVMOrcExecutionSessionLookupHandleResultFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcExecutionSessionLookupHandleResultFunction() {
        super(CIF);
    }

    LLVMOrcExecutionSessionLookupHandleResultFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcExecutionSessionLookupHandleResultFunction {

        private final LLVMOrcExecutionSessionLookupHandleResultFunctionI delegate;

        Container(long functionPointer, LLVMOrcExecutionSessionLookupHandleResultFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long Err, long Result, long NumPairs, long Ctx) {
            delegate.invoke(Err, Result, NumPairs, Ctx);
        }

    }

}