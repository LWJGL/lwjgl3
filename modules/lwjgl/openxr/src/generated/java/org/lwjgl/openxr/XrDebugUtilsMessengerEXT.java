/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** Wraps an {@code XrDebugUtilsMessengerEXT} handle. */
public class XrDebugUtilsMessengerEXT extends DispatchableHandle {

    private final XrInstance instance;

    /**
     * Creates an {@code XrDebugUtilsMessengerEXT} using the specified native handle and {@code XrInstance}.
     *
     * @param handle   the native {@code XrDebugUtilsMessengerEXT} handle
     * @param instance the {@code XrInstance} from which {@code handle} was created
     */
    public XrDebugUtilsMessengerEXT(long handle, XrInstance instance) {
        super(handle, instance.getCapabilities());
        this.instance = instance;
    }

    /** Returns the {@code XrInstance} from which this handle was created. */
    public XrInstance getInstance() {
        return instance;
    }

}
