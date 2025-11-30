/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;
import org.lwjgl.system.libffi.*;

import java.lang.invoke.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Upcalls.*;

/**
 * Base class for dynamically created native functions that call into Java code.
 *
 * <p>Callback instances use native resources and must be explicitly freed when no longer used by calling the {@link #free} method.</p>
 */
public abstract class Callback implements Pointer, NativeResource {

    private long address;

    /**
     * Creates a callback instance using the specified libffi CIF.
     *
     * @param descriptor the callback descriptor
     */
    @SuppressWarnings("this-escape")
    protected Callback(Descriptor descriptor) {
        this.address = upcallCreate(descriptor, this);
    }

    /**
     * Creates a callback instance using the specified function address
     *
     * @param address the function address
     */
    protected Callback(long address) {
        if (CHECKS) {
            check(address);
        }
        this.address = address;
    }

    @Override
    public long address() {
        return address;
    }

    @Override
    public void free() {
        free(address());
    }

    /**
     * Converts the specified function pointer to the {@code CallbackI} instance associated with it.
     *
     * @param functionPointer a function pointer
     * @param <T>             the {@code CallbackI} instance type
     *
     * @return the {@code CallbackI} instance
     */
    public static <T extends CallbackI> T get(long functionPointer) {
        return upcallGet(functionPointer);
    }

    /** Like {@link #get}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static <T extends CallbackI> @Nullable T getSafe(long functionPointer) {
        return functionPointer == NULL ? null : get(functionPointer);
    }

    /**
     * Frees any resources held by the specified function pointer.
     *
     * @param functionPointer the function pointer
     */
    public static void free(long functionPointer) {
        upcallFree(functionPointer);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Callback)) {
            return false;
        }

        Callback that = (Callback)o;

        return address == that.address();
    }

    public int hashCode() {
        return (int)(address ^ (address >>> 32));
    }

    @Override
    public String toString() {
        return String.format("%s pointer [0x%X]", getClass().getSimpleName(), address);
    }

    /** An upcall descriptor. [INTERNAL API] */
    public static final class Descriptor {

        final MethodHandles.Lookup lookup;

        final FFICIF cif;

        public Descriptor(MethodHandles.Lookup lookup, FFICIF cif) {
            this.lookup = lookup;
            this.cif = cif;
        }

    }

}
