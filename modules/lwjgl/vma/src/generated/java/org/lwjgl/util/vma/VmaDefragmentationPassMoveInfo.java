/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaDefragmentationPassMoveInfo {
 *     VmaAllocation allocation;
 *     VkDeviceMemory memory;
 *     VkDeviceSize offset;
 * }</code></pre>
 */
public class VmaDefragmentationPassMoveInfo extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOCATION,
        MEMORY,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALLOCATION = layout.offsetof(0);
        MEMORY = layout.offsetof(1);
        OFFSET = layout.offsetof(2);
    }

    /**
     * Creates a {@code VmaDefragmentationPassMoveInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaDefragmentationPassMoveInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code allocation} field. */
    @NativeType("VmaAllocation")
    public long allocation() { return nallocation(address()); }
    /** @return the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaDefragmentationPassMoveInfo} instance for the specified memory address. */
    public static VmaDefragmentationPassMoveInfo create(long address) {
        return wrap(VmaDefragmentationPassMoveInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationPassMoveInfo createSafe(long address) {
        return address == NULL ? null : wrap(VmaDefragmentationPassMoveInfo.class, address);
    }

    /**
     * Create a {@link VmaDefragmentationPassMoveInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationPassMoveInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationPassMoveInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #allocation}. */
    public static long nallocation(long struct) { return memGetAddress(struct + VmaDefragmentationPassMoveInfo.ALLOCATION); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VmaDefragmentationPassMoveInfo.MEMORY); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return UNSAFE.getLong(null, struct + VmaDefragmentationPassMoveInfo.OFFSET); }

    // -----------------------------------

    /** An array of {@link VmaDefragmentationPassMoveInfo} structs. */
    public static class Buffer extends StructBuffer<VmaDefragmentationPassMoveInfo, Buffer> {

        private static final VmaDefragmentationPassMoveInfo ELEMENT_FACTORY = VmaDefragmentationPassMoveInfo.create(-1L);

        /**
         * Creates a new {@code VmaDefragmentationPassMoveInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaDefragmentationPassMoveInfo#SIZEOF}, and its mark will be undefined.
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
        protected VmaDefragmentationPassMoveInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code allocation} field. */
        @NativeType("VmaAllocation")
        public long allocation() { return VmaDefragmentationPassMoveInfo.nallocation(address()); }
        /** @return the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VmaDefragmentationPassMoveInfo.nmemory(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VmaDefragmentationPassMoveInfo.noffset(address()); }

    }

}