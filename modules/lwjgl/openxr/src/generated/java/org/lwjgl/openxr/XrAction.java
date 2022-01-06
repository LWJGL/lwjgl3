/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** Wraps an {@code XrAction} handle. */
public class XrAction extends DispatchableHandle {

    private final XrActionSet actionSet;

    /**
     * Creates an {@code XrAction} using the specified native handle and {@code XrActionSet}.
     *
     * @param handle    the native {@code XrAction} handle
     * @param actionSet the {@code XrActionSet} from which {@code handle} was created
     */
    public XrAction(long handle, XrActionSet actionSet) {
        super(handle, actionSet.getCapabilities());
        this.actionSet = actionSet;
    }

    /** Returns the {@code XrActionSet} from which this handle was created. */
    public XrActionSet getActionSet() {
        return actionSet;
    }

}
