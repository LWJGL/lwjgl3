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
 * Instances of this class may be passed to the {@link LLVMLLJIT#LLVMOrcLLJITBuilderSetObjectLinkingLayerCreator OrcLLJITBuilderSetObjectLinkingLayerCreator} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LLVMOrcObjectLayerRef (*{@link #invoke}) (
 *     void *Ctx,
 *     LLVMOrcExecutionSessionRef ES,
 *     char const *Triple
 * )</code></pre>
 */
public abstract class LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction extends Callback implements LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunctionI {

    /**
     * Creates a {@code LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction}
     */
    public static LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction create(long functionPointer) {
        LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction
            ? (LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction} instance that delegates to the specified {@code LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunctionI} instance. */
    public static LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction create(LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunctionI instance) {
        return instance instanceof LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction
            ? (LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction() {
        super(CIF);
    }

    LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction {

        private final LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunctionI delegate;

        Container(long functionPointer, LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long Ctx, long ES, long Triple) {
            return delegate.invoke(Ctx, ES, Triple);
        }

    }

}