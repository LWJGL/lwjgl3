/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.hwloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class topology_set_userdata_export_callback extends Callback implements topology_set_userdata_export_callbackI {

    /**
     * Creates a {@code topology_set_userdata_export_callback} instance from the specified function pointer.
     *
     * @return the new {@code topology_set_userdata_export_callback}
     */
    public static topology_set_userdata_export_callback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable topology_set_userdata_export_callback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code topology_set_userdata_export_callback} instance that delegates to the specified {@code topology_set_userdata_export_callbackI} instance. */
    public static topology_set_userdata_export_callback create(topology_set_userdata_export_callbackI instance) { return create(instance, instance.address()); }

    private static topology_set_userdata_export_callback create(topology_set_userdata_export_callbackI instance, long functionPointer) {
        return instance instanceof topology_set_userdata_export_callback
            ? (topology_set_userdata_export_callback)instance
            : new topology_set_userdata_export_callback(functionPointer) {
                @Override public void invoke(long reserved, long topology, long obj) {
                    instance.invoke(reserved, topology, obj);
                }
            };
    }

    protected topology_set_userdata_export_callback() {
        super(DESCRIPTOR);
    }

    topology_set_userdata_export_callback(long functionPointer) {
        super(functionPointer);
    }

}