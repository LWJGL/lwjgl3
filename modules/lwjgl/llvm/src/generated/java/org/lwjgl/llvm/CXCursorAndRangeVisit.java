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
 * Instances of this class may be set to the {@code visit} field of the {@link CXCursorAndRangeVisitor} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * enum CXVisitorResult (*) (
 *     void *context,
 *     CXCursor cursor,
 *     CXSourceRange range
 * )</code></pre>
 */
public abstract class CXCursorAndRangeVisit extends Callback implements CXCursorAndRangeVisitI {

    /**
     * Creates a {@code CXCursorAndRangeVisit} instance from the specified function pointer.
     *
     * @return the new {@code CXCursorAndRangeVisit}
     */
    public static CXCursorAndRangeVisit create(long functionPointer) {
        CXCursorAndRangeVisitI instance = Callback.get(functionPointer);
        return instance instanceof CXCursorAndRangeVisit
            ? (CXCursorAndRangeVisit)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static CXCursorAndRangeVisit createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CXCursorAndRangeVisit} instance that delegates to the specified {@code CXCursorAndRangeVisitI} instance. */
    public static CXCursorAndRangeVisit create(CXCursorAndRangeVisitI instance) {
        return instance instanceof CXCursorAndRangeVisit
            ? (CXCursorAndRangeVisit)instance
            : new Container(instance.address(), instance);
    }

    protected CXCursorAndRangeVisit() {
        super(CIF);
    }

    CXCursorAndRangeVisit(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CXCursorAndRangeVisit {

        private final CXCursorAndRangeVisitI delegate;

        Container(long functionPointer, CXCursorAndRangeVisitI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long context, CXCursor cursor, CXSourceRange range) {
            return delegate.invoke(context, cursor, range);
        }

    }

}