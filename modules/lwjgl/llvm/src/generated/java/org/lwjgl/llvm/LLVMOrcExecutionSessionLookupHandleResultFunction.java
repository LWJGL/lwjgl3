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
    public static LLVMOrcExecutionSessionLookupHandleResultFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMOrcExecutionSessionLookupHandleResultFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMOrcExecutionSessionLookupHandleResultFunction} instance that delegates to the specified {@code LLVMOrcExecutionSessionLookupHandleResultFunctionI} instance. */
    public static LLVMOrcExecutionSessionLookupHandleResultFunction create(LLVMOrcExecutionSessionLookupHandleResultFunctionI instance) { return create(instance, instance.address()); }

    private static LLVMOrcExecutionSessionLookupHandleResultFunction create(LLVMOrcExecutionSessionLookupHandleResultFunctionI instance, long functionPointer) {
        return instance instanceof LLVMOrcExecutionSessionLookupHandleResultFunction
            ? (LLVMOrcExecutionSessionLookupHandleResultFunction)instance
            : new LLVMOrcExecutionSessionLookupHandleResultFunction(functionPointer) {
                @Override public void invoke(long Err, long Result, long NumPairs, long Ctx) {
                    instance.invoke(Err, Result, NumPairs, Ctx);
                }
            };
    }

    protected LLVMOrcExecutionSessionLookupHandleResultFunction() {
        super(DESCRIPTOR);
    }

    LLVMOrcExecutionSessionLookupHandleResultFunction(long functionPointer) {
        super(functionPointer);
    }

}