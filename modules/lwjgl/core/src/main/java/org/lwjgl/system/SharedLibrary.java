/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

/** A {@link FunctionProvider} implementation that opens a platform-specific shared library and returns functions pointers from it. */
public interface SharedLibrary extends FunctionProvider, NativeResource, Pointer {

    /** Returns the library name. */
    String getName();

    abstract class Default extends Pointer.Default implements SharedLibrary {

        private final String name;

        protected Default(long address, String name) {
            super(address);
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