/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke EnumerationMutationHandler} */
public abstract class EnumerationMutationHandler extends Callback implements EnumerationMutationHandlerI {

    /**
     * Creates a {@code EnumerationMutationHandler} instance from the specified function pointer.
     *
     * @return the new {@code EnumerationMutationHandler}
     */
    public static EnumerationMutationHandler create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable EnumerationMutationHandler createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code EnumerationMutationHandler} instance that delegates to the specified {@code EnumerationMutationHandlerI} instance. */
    public static EnumerationMutationHandler create(EnumerationMutationHandlerI instance) { return create(instance, instance.address()); }

    private static EnumerationMutationHandler create(EnumerationMutationHandlerI instance, long functionPointer) {
        return instance instanceof EnumerationMutationHandler
            ? (EnumerationMutationHandler)instance
            : new EnumerationMutationHandler(functionPointer) {
                @Override public void invoke(long id) {
                    instance.invoke(id);
                }
            };
    }

    protected EnumerationMutationHandler() {
        super(DESCRIPTOR);
    }

    EnumerationMutationHandler(long functionPointer) {
        super(functionPointer);
    }

}