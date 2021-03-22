/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXTUResourceUsageEntry {
 *     enum CXTUResourceUsageKind {@link #kind};
 *     unsigned long {@link #amount};
 * }</code></pre>
 */
public class CXTUResourceUsageEntry extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        KIND,
        AMOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        KIND = layout.offsetof(0);
        AMOUNT = layout.offsetof(1);
    }

    /**
     * Creates a {@code CXTUResourceUsageEntry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXTUResourceUsageEntry(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the memory usage category */
    @NativeType("enum CXTUResourceUsageKind")
    public int kind() { return nkind(address()); }
    /** amount of resources used. The units will depend on the resource kind. */
    @NativeType("unsigned long")
    public long amount() { return namount(address()); }

    // -----------------------------------

    /** Returns a new {@code CXTUResourceUsageEntry} instance for the specified memory address. */
    public static CXTUResourceUsageEntry create(long address) {
        return wrap(CXTUResourceUsageEntry.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXTUResourceUsageEntry createSafe(long address) {
        return address == NULL ? null : wrap(CXTUResourceUsageEntry.class, address);
    }

    /**
     * Create a {@link CXTUResourceUsageEntry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXTUResourceUsageEntry.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXTUResourceUsageEntry.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #kind}. */
    public static int nkind(long struct) { return UNSAFE.getInt(null, struct + CXTUResourceUsageEntry.KIND); }
    /** Unsafe version of {@link #amount}. */
    public static long namount(long struct) { return memGetCLong(struct + CXTUResourceUsageEntry.AMOUNT); }

    // -----------------------------------

    /** An array of {@link CXTUResourceUsageEntry} structs. */
    public static class Buffer extends StructBuffer<CXTUResourceUsageEntry, Buffer> {

        private static final CXTUResourceUsageEntry ELEMENT_FACTORY = CXTUResourceUsageEntry.create(-1L);

        /**
         * Creates a new {@code CXTUResourceUsageEntry.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXTUResourceUsageEntry#SIZEOF}, and its mark will be undefined.
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
        protected CXTUResourceUsageEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CXTUResourceUsageEntry#kind} field. */
        @NativeType("enum CXTUResourceUsageKind")
        public int kind() { return CXTUResourceUsageEntry.nkind(address()); }
        /** @return the value of the {@link CXTUResourceUsageEntry#amount} field. */
        @NativeType("unsigned long")
        public long amount() { return CXTUResourceUsageEntry.namount(address()); }

    }

}