/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link CoreGraphics#CGEventTapCreate EventTapCreate} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * CGEventRef (*{@link #invoke}) (
 *     CGEventTapProxy proxy,
 *     CGEventType type,
 *     CGEventRef event,
 *     void *userInfo
 * )</code></pre>
 */
public abstract class CGEventTapCallBack extends Callback implements CGEventTapCallBackI {

    /**
     * Creates a {@code CGEventTapCallBack} instance from the specified function pointer.
     *
     * @return the new {@code CGEventTapCallBack}
     */
    public static CGEventTapCallBack create(long functionPointer) {
        CGEventTapCallBackI instance = Callback.get(functionPointer);
        return instance instanceof CGEventTapCallBack
            ? (CGEventTapCallBack)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static CGEventTapCallBack createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CGEventTapCallBack} instance that delegates to the specified {@code CGEventTapCallBackI} instance. */
    public static CGEventTapCallBack create(CGEventTapCallBackI instance) {
        return instance instanceof CGEventTapCallBack
            ? (CGEventTapCallBack)instance
            : new Container(instance.address(), instance);
    }

    protected CGEventTapCallBack() {
        super(CIF);
    }

    CGEventTapCallBack(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CGEventTapCallBack {

        private final CGEventTapCallBackI delegate;

        Container(long functionPointer, CGEventTapCallBackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long proxy, int type, long event, long userInfo) {
            return delegate.invoke(proxy, type, event, userInfo);
        }

    }

}