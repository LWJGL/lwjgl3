/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;

/**
 * Pointer interface.
 *
 * <p>LWJGL can run on both 32bit and 64bit architectures. Since LWJGL applications deal with native memory directly, this interface provides necessary
 * information about the underlying architecture of the running JVM process.</p>
 *
 * <p>When interacting with native functions, pointer values are mapped to Java {@code long}. LWJGL automatically converts long values to the correct pointer
 * addresses when used in native code. Native functions sometimes require arrays of pointer values; the {@link PointerBuffer} class may be used for that
 * purpose. It has an API similar to a {@link java.nio.LongBuffer} but handles pointer casts automatically.</p>
 */
public interface Pointer {

    /** The pointer size in bytes. Will be 4 on a 32bit JVM and 8 on a 64bit one. */
    int POINTER_SIZE = MemoryAccessJNI.getPointerSize();

    /** The pointer size power-of-two. Will be 2 on a 32bit JVM and 3 on a 64bit one. */
    int POINTER_SHIFT = POINTER_SIZE == 8 ? 3 : 2;

    /** Will be true on a 32bit JVM. */
    boolean BITS32 = POINTER_SIZE * 8 == 32;

    /** Will be true on a 64bit JVM. */
    boolean BITS64 = POINTER_SIZE * 8 == 64;

    /**
     * Returns the raw pointer address as a {@code long} value.
     *
     * @return the pointer address
     */
    long address();

    /** Default {@link Pointer} implementation. */
    abstract class Default implements Pointer {

        // Removed final due to JDK-8139758. TODO: Restore if the fix is backported to JDK 8.
        private long address;

        protected Default(long address) {
            this.address = address;
        }

        @Override
        public long address() {
            return address;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Pointer)) {
                return false;
            }

            Pointer that = (Pointer)o;

            return address == that.address();
        }

        public int hashCode() {
            return (int)(address ^ (address >>> 32));
        }

        @Override
        public String toString() {
            return String.format("%s pointer [0x%X]", getClass().getSimpleName(), address);
        }

    }

}