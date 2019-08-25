/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link CoreGraphics#CGEventTapCreate EventTapCreate} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * CGEventRef (*) (
 *     CGEventTapProxy proxy,
 *     CGEventType type,
 *     CGEventRef event,
 *     void *userInfo
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("CGEventRef (*) (CGEventTapProxy, CGEventType, CGEventRef, void *)")
public interface CGEventTapCallBackI extends CallbackI.P {

    String SIGNATURE = "(pipp)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /**
     * A client-supplied callback function that’s invoked whenever an associated event tap receives a Quartz event.
     * 
     * <p>The callback is passed a proxy for the tap, the event type, the incoming event, and the user-defined data specified when the event tap was created. The
     * function should return the (possibly modified) passed-in event, a newly constructed event, or {@code NULL} if the event is to be deleted. The event passed to
     * the callback is retained by the calling code, and is released after the callback returns and the data is passed back to the event system. If a
     * different event is returned by the callback function, then that event will be released by the calling code along with the original event, after the
     * event data has been passed back to the event system.</p>
     */
    @NativeType("CGEventRef") long invoke(@NativeType("CGEventTapProxy") long proxy, @NativeType("CGEventType") int type, @NativeType("CGEventRef") long event, @NativeType("void *") long userInfo);

}