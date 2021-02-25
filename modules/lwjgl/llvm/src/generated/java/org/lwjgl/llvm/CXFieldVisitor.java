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
 * Instances of this class may be passed to the {@link ClangIndex#clang_Type_visitFields Type_visitFields} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * enum CXVisitorResult (*) (
 *     CXCursor C,
 *     CXClientData client_data
 * )</code></pre>
 */
public abstract class CXFieldVisitor extends Callback implements CXFieldVisitorI {

    /**
     * Creates a {@code CXFieldVisitor} instance from the specified function pointer.
     *
     * @return the new {@code CXFieldVisitor}
     */
    public static CXFieldVisitor create(long functionPointer) {
        CXFieldVisitorI instance = Callback.get(functionPointer);
        return instance instanceof CXFieldVisitor
            ? (CXFieldVisitor)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static CXFieldVisitor createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CXFieldVisitor} instance that delegates to the specified {@code CXFieldVisitorI} instance. */
    public static CXFieldVisitor create(CXFieldVisitorI instance) {
        return instance instanceof CXFieldVisitor
            ? (CXFieldVisitor)instance
            : new Container(instance.address(), instance);
    }

    protected CXFieldVisitor() {
        super(CIF);
    }

    CXFieldVisitor(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CXFieldVisitor {

        private final CXFieldVisitorI delegate;

        Container(long functionPointer, CXFieldVisitorI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(CXCursor C, long client_data) {
            return delegate.invoke(C, client_data);
        }

    }

}