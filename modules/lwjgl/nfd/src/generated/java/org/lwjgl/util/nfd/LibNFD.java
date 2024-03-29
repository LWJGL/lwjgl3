/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.nfd;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Initializes the nfd shared library. */
final class LibNFD {

    static {
        String libName = Platform.mapLibraryNameBundled((Platform.get() == Platform.FREEBSD || Platform.get() == Platform.LINUX) && Configuration.NFD_LINUX_PORTAL.get(false) ? "lwjgl_nfd_portal" : "lwjgl_nfd");
        Library.loadSystem(System::load, System::loadLibrary, LibNFD.class, "org.lwjgl.nfd", libName);

        MemoryAllocator allocator = getAllocator(Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.get(true));
        setupMalloc(
            allocator.getMalloc(),
            allocator.getCalloc(),
            allocator.getRealloc(),
            allocator.getFree(),
            allocator.getAlignedAlloc(),
            allocator.getAlignedFree()
        );
    }

    private LibNFD() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

    private static native void setupMalloc(
        long malloc,
        long calloc,
        long realloc,
        long free,
        long aligned_alloc,
        long aligned_free
    );

}
