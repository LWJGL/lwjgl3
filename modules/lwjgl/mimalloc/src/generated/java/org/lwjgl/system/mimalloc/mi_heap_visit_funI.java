/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.mimalloc;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke mi_heap_visit_fun} */
@FunctionalInterface
@NativeType("mi_heap_visit_fun")
public interface mi_heap_visit_funI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        mi_heap_visit_funI.class,
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_uint8,
            ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code bool (* mi_heap_visit_fun) (mi_heap_t * heap, void * arg)} */
    @NativeType("bool") boolean invoke(@NativeType("mi_heap_t *") long heap, @NativeType("void *") long arg);

}