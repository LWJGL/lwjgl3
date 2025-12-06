/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;

import static org.lwjgl.system.ffm.BCUtil.*;

/**
 * The binder class for upcall interfaces.
 *
 * <p>Upcall binder implementations can be created using {@link FFM#ffmUpcall ffmUpcall}.</p>
 */
public non-sealed interface UpcallBinder<T> extends Binder<T> {

    /**
     * The upcall function descriptor.
     *
     * @return the function descriptor
     */
    FunctionDescriptor descriptor();

    /**
     * The upcall method handle.
     *
     * @return the method handle
     */
    MethodHandle handle();

    /**
     * The memory layout to use when allocating storage for a struct or union returned by value.
     *
     * <p>This method is used for integration with LWJGL 3 callbacks. It should not be used for custom bindings.</p>
     *
     * @return the memory layout, or {@code null} if not applicable
     */
    // LWJGL 3 interop
    @Nullable MemoryLayout stack();

    /**
     * Allocates an FFM upcall stub for the specified upcall instance.
     *
     * @param arena  the arena to use for the allocation
     * @param upcall the upcall instance
     *
     * @return the upcall stub
     */
    default MemorySegment allocate(Arena arena, T upcall) {
        return allocate(arena, upcall, EMPTY_OPTIONS);
    }

    /**
     * Allocates an FFM upcall stub for the specified upcall instance.
     *
     * @param arena   the arena to use for the allocation
     * @param upcall  the upcall instance
     * @param options the linker options to apply
     *
     * @return the upcall stub
     */
    default MemorySegment allocate(Arena arena, T upcall, Linker.Option... options) {
        Objects.requireNonNull(upcall);

        var handle = handle()
            .bindTo(upcall);

        var stack = stack();
        if (stack != null) {
            handle = handle.bindTo(arena.allocate(stack));
        }

        return Linker.nativeLinker()
            .upcallStub(
                handle,
                descriptor(),
                arena,
                options
            );
    }

}
