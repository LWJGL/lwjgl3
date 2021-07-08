/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import javax.annotation.*;

/** A {@link FunctionProvider} implementation that opens a platform-specific shared library and returns functions pointers from it. */
public interface SharedLibrary extends FunctionProvider, NativeResource, Pointer {

    /** Returns the library name. */
    String getName();

    /**
     * Returns the library path, if available.
     *
     * @return the library path, or {@code null} if the path is not available.
     */
    @Nullable
    String getPath();

    abstract class Default extends Pointer.Default implements SharedLibrary {

        private final String name;

        protected Default(String name, long handle) {
            super(handle);
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }

    }

    abstract class Delegate implements SharedLibrary {

        protected final SharedLibrary library;

        protected Delegate(SharedLibrary library) {
            this.library = library;
        }

        @Override
        public String getName() {
            return library.getName();
        }

        @Nullable
        @Override public String getPath() {
            return library.getPath();
        }

        @Override
        public long address() {
            return library.address();
        }

        @Override
        public void free() {
            library.free();
        }

    }

}