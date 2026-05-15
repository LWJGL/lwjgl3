/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class IndexerStartedTranslationUnit extends Callback implements IndexerStartedTranslationUnitI {

    /**
     * Creates a {@code IndexerStartedTranslationUnit} instance from the specified function pointer.
     *
     * @return the new {@code IndexerStartedTranslationUnit}
     */
    public static IndexerStartedTranslationUnit create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable IndexerStartedTranslationUnit createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code IndexerStartedTranslationUnit} instance that delegates to the specified {@code IndexerStartedTranslationUnitI} instance. */
    public static IndexerStartedTranslationUnit create(IndexerStartedTranslationUnitI instance) { return create(instance, instance.address()); }

    private static IndexerStartedTranslationUnit create(IndexerStartedTranslationUnitI instance, long functionPointer) {
        return instance instanceof IndexerStartedTranslationUnit
            ? (IndexerStartedTranslationUnit)instance
            : new IndexerStartedTranslationUnit(functionPointer) {
                @Override public long invoke(long client_data, long reserved) {
                    return instance.invoke(client_data, reserved);
                }
            };
    }

    protected IndexerStartedTranslationUnit() {
        super(DESCRIPTOR);
    }

    IndexerStartedTranslationUnit(long functionPointer) {
        super(functionPointer);
    }

}