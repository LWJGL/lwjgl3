/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@link VmaDefragmentationInfo} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * VkBool32 (*{@link #invoke}) (
 *     void *pUserData
 * )</code></pre>
 */
public abstract class VmaCheckDefragmentationBreakFunction extends Callback implements VmaCheckDefragmentationBreakFunctionI {

    /**
     * Creates a {@code VmaCheckDefragmentationBreakFunction} instance from the specified function pointer.
     *
     * @return the new {@code VmaCheckDefragmentationBreakFunction}
     */
    public static VmaCheckDefragmentationBreakFunction create(long functionPointer) {
        VmaCheckDefragmentationBreakFunctionI instance = Callback.get(functionPointer);
        return instance instanceof VmaCheckDefragmentationBreakFunction
            ? (VmaCheckDefragmentationBreakFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static VmaCheckDefragmentationBreakFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VmaCheckDefragmentationBreakFunction} instance that delegates to the specified {@code VmaCheckDefragmentationBreakFunctionI} instance. */
    public static VmaCheckDefragmentationBreakFunction create(VmaCheckDefragmentationBreakFunctionI instance) {
        return instance instanceof VmaCheckDefragmentationBreakFunction
            ? (VmaCheckDefragmentationBreakFunction)instance
            : new Container(instance.address(), instance);
    }

    protected VmaCheckDefragmentationBreakFunction() {
        super(CIF);
    }

    VmaCheckDefragmentationBreakFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VmaCheckDefragmentationBreakFunction {

        private final VmaCheckDefragmentationBreakFunctionI delegate;

        Container(long functionPointer, VmaCheckDefragmentationBreakFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long pUserData) {
            return delegate.invoke(pUserData);
        }

    }

}