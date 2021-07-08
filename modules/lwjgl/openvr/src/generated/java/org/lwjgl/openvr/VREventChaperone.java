/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_Chaperone_t {
 *     uint64_t m_nPreviousUniverse;
 *     uint64_t m_nCurrentUniverse;
 * }</code></pre>
 */
@NativeType("struct VREvent_Chaperone_t")
public class VREventChaperone extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NPREVIOUSUNIVERSE,
        M_NCURRENTUNIVERSE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NPREVIOUSUNIVERSE = layout.offsetof(0);
        M_NCURRENTUNIVERSE = layout.offsetof(1);
    }

    /**
     * Creates a {@code VREventChaperone} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventChaperone(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code m_nPreviousUniverse} field. */
    @NativeType("uint64_t")
    public long m_nPreviousUniverse() { return nm_nPreviousUniverse(address()); }
    /** @return the value of the {@code m_nCurrentUniverse} field. */
    @NativeType("uint64_t")
    public long m_nCurrentUniverse() { return nm_nCurrentUniverse(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventChaperone} instance for the specified memory address. */
    public static VREventChaperone create(long address) {
        return wrap(VREventChaperone.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventChaperone createSafe(long address) {
        return address == NULL ? null : wrap(VREventChaperone.class, address);
    }

    /**
     * Create a {@link VREventChaperone.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventChaperone.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventChaperone.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_nPreviousUniverse}. */
    public static long nm_nPreviousUniverse(long struct) { return UNSAFE.getLong(null, struct + VREventChaperone.M_NPREVIOUSUNIVERSE); }
    /** Unsafe version of {@link #m_nCurrentUniverse}. */
    public static long nm_nCurrentUniverse(long struct) { return UNSAFE.getLong(null, struct + VREventChaperone.M_NCURRENTUNIVERSE); }

    // -----------------------------------

    /** An array of {@link VREventChaperone} structs. */
    public static class Buffer extends StructBuffer<VREventChaperone, Buffer> {

        private static final VREventChaperone ELEMENT_FACTORY = VREventChaperone.create(-1L);

        /**
         * Creates a new {@code VREventChaperone.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventChaperone#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VREventChaperone getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code m_nPreviousUniverse} field. */
        @NativeType("uint64_t")
        public long m_nPreviousUniverse() { return VREventChaperone.nm_nPreviousUniverse(address()); }
        /** @return the value of the {@code m_nCurrentUniverse} field. */
        @NativeType("uint64_t")
        public long m_nCurrentUniverse() { return VREventChaperone.nm_nCurrentUniverse(address()); }

    }

}