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
public abstract class CXCursorAndRangeVisit extends Callback implements CXCursorAndRangeVisitI {

    /**
     * Creates a {@code CXCursorAndRangeVisit} instance from the specified function pointer.
     *
     * @return the new {@code CXCursorAndRangeVisit}
     */
    public static CXCursorAndRangeVisit create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CXCursorAndRangeVisit createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CXCursorAndRangeVisit} instance that delegates to the specified {@code CXCursorAndRangeVisitI} instance. */
    public static CXCursorAndRangeVisit create(CXCursorAndRangeVisitI instance) { return create(instance, instance.address()); }

    private static CXCursorAndRangeVisit create(CXCursorAndRangeVisitI instance, long functionPointer) {
        return instance instanceof CXCursorAndRangeVisit
            ? (CXCursorAndRangeVisit)instance
            : new CXCursorAndRangeVisit(functionPointer) {
                @Override public int invoke(long context, CXCursor cursor, CXSourceRange range) {
                    return instance.invoke(context, cursor, range);
                }
            };
    }

    protected CXCursorAndRangeVisit() {
        super(DESCRIPTOR);
    }

    CXCursorAndRangeVisit(long functionPointer) {
        super(functionPointer);
    }

}