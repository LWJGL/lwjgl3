/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;

public non-sealed interface UpcallBinder<T> extends Binder<T> {

    Linker.Option[] EMPTY_OPTIONS = new Linker.Option[0];

    FunctionDescriptor descriptor();
    MethodHandle handle();

    // LWJGL 3 interop
    @Nullable MemoryLayout stack();

    /*default MemorySegment allocate(T upcall) {
        return allocate(Arena.global(), upcall, EMPTY_OPTIONS);
    }

    default MemorySegment allocate(T upcall, Linker.Option... options) {
        return allocate(Arena.global(), upcall, options);
    }*/

    default MemorySegment allocate(Arena arena, T upcall) {
        return allocate(arena, upcall, EMPTY_OPTIONS);
    }

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
