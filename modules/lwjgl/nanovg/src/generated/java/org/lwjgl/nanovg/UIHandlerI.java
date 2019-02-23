/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link OUI#uiSetHandler SetHandler} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     int item,
 *     UIevent event
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("UIhandler")
public interface UIHandlerI extends CallbackI.V {

    String SIGNATURE = "(ii)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgInt(args),
            dcbArgInt(args)
        );
    }

    /** handler callback; event is one of UI_EVENT_* */
    void invoke(int item, @NativeType("UIevent") int event);

}