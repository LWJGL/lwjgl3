/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.hwloc;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link HWLoc#hwloc_topology_set_userdata_import_callback topology_set_userdata_import_callback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     hwloc_topology_t topology,
 *     hwloc_obj_t obj,
 *     char const *name,
 *     void const *buffer,
 *     size_t length
 * )</code></pre>
 */
public abstract class topology_set_userdata_import_callback extends Callback implements topology_set_userdata_import_callbackI {

    /**
     * Creates a {@code topology_set_userdata_import_callback} instance from the specified function pointer.
     *
     * @return the new {@code topology_set_userdata_import_callback}
     */
    public static topology_set_userdata_import_callback create(long functionPointer) {
        topology_set_userdata_import_callbackI instance = Callback.get(functionPointer);
        return instance instanceof topology_set_userdata_import_callback
            ? (topology_set_userdata_import_callback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static topology_set_userdata_import_callback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code topology_set_userdata_import_callback} instance that delegates to the specified {@code topology_set_userdata_import_callbackI} instance. */
    public static topology_set_userdata_import_callback create(topology_set_userdata_import_callbackI instance) {
        return instance instanceof topology_set_userdata_import_callback
            ? (topology_set_userdata_import_callback)instance
            : new Container(instance.address(), instance);
    }

    protected topology_set_userdata_import_callback() {
        super(CIF);
    }

    topology_set_userdata_import_callback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends topology_set_userdata_import_callback {

        private final topology_set_userdata_import_callbackI delegate;

        Container(long functionPointer, topology_set_userdata_import_callbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long topology, long obj, long name, long buffer, long length) {
            delegate.invoke(topology, obj, name, buffer, length);
        }

    }

}