/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke PFN_vmaCheckDefragmentationBreakFunction} */
public abstract class VmaCheckDefragmentationBreakFunction extends Callback implements VmaCheckDefragmentationBreakFunctionI {

    /**
     * Creates a {@code VmaCheckDefragmentationBreakFunction} instance from the specified function pointer.
     *
     * @return the new {@code VmaCheckDefragmentationBreakFunction}
     */
    public static VmaCheckDefragmentationBreakFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VmaCheckDefragmentationBreakFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code VmaCheckDefragmentationBreakFunction} instance that delegates to the specified {@code VmaCheckDefragmentationBreakFunctionI} instance. */
    public static VmaCheckDefragmentationBreakFunction create(VmaCheckDefragmentationBreakFunctionI instance) { return create(instance, instance.address()); }

    private static VmaCheckDefragmentationBreakFunction create(VmaCheckDefragmentationBreakFunctionI instance, long functionPointer) {
        return instance instanceof VmaCheckDefragmentationBreakFunction
            ? (VmaCheckDefragmentationBreakFunction)instance
            : new VmaCheckDefragmentationBreakFunction(functionPointer) {
                @Override public int invoke(long pUserData) {
                    return instance.invoke(pUserData);
                }
            };
    }

    protected VmaCheckDefragmentationBreakFunction() {
        super(DESCRIPTOR);
    }

    VmaCheckDefragmentationBreakFunction(long functionPointer) {
        super(functionPointer);
    }

}