/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.foreign.*;
import java.lang.invoke.*;

public non-sealed interface UpcallBinder<T> extends Binder<T> {

    Linker.Option[] EMPTY_OPTIONS = new Linker.Option[0];

    FunctionDescriptor descriptor();
    MethodHandle handle();

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
        return Linker.nativeLinker()
            .upcallStub(
                handle().bindTo(upcall),
                descriptor(),
                arena,
                options
            );
    }

}
