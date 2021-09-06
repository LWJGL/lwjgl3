/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Deprecated. Optional configuration parameters to be passed to function {@link Vma#vmaDefragment Defragment}.
 * 
 * <p>This is a part of the old interface. It is recommended to use structure {@link VmaDefragmentationInfo2} and function {@link Vma#vmaDefragmentationBegin DefragmentationBegin} instead.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaDefragmentationInfo {
 *     VkDeviceSize {@link #maxBytesToMove};
 *     uint32_t {@link #maxAllocationsToMove};
 * }</code></pre>
 */
public class VmaDefragmentationInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAXBYTESTOMOVE,
        MAXALLOCATIONSTOMOVE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAXBYTESTOMOVE = layout.offsetof(0);
        MAXALLOCATIONSTOMOVE = layout.offsetof(1);
    }

    /**
     * Creates a {@code VmaDefragmentationInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaDefragmentationInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * maximum total numbers of bytes that can be copied while moving allocations to different places.
     * 
     * <p>Default is {@code VK_WHOLE_SIZ}E, which means no limit.</p>
     */
    @NativeType("VkDeviceSize")
    public long maxBytesToMove() { return nmaxBytesToMove(address()); }
    /**
     * maximum number of allocations that can be moved to different place.
     * 
     * <p>Default is {@code UINT32_MAX}, which means no limit.</p>
     */
    @NativeType("uint32_t")
    public int maxAllocationsToMove() { return nmaxAllocationsToMove(address()); }

    /** Sets the specified value to the {@link #maxBytesToMove} field. */
    public VmaDefragmentationInfo maxBytesToMove(@NativeType("VkDeviceSize") long value) { nmaxBytesToMove(address(), value); return this; }
    /** Sets the specified value to the {@link #maxAllocationsToMove} field. */
    public VmaDefragmentationInfo maxAllocationsToMove(@NativeType("uint32_t") int value) { nmaxAllocationsToMove(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaDefragmentationInfo set(
        long maxBytesToMove,
        int maxAllocationsToMove
    ) {
        maxBytesToMove(maxBytesToMove);
        maxAllocationsToMove(maxAllocationsToMove);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaDefragmentationInfo set(VmaDefragmentationInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaDefragmentationInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationInfo malloc() {
        return wrap(VmaDefragmentationInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaDefragmentationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationInfo calloc() {
        return wrap(VmaDefragmentationInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaDefragmentationInfo} instance allocated with {@link BufferUtils}. */
    public static VmaDefragmentationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaDefragmentationInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaDefragmentationInfo} instance for the specified memory address. */
    public static VmaDefragmentationInfo create(long address) {
        return wrap(VmaDefragmentationInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationInfo createSafe(long address) {
        return address == NULL ? null : wrap(VmaDefragmentationInfo.class, address);
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaDefragmentationInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VmaDefragmentationInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationInfo malloc(MemoryStack stack) {
        return wrap(VmaDefragmentationInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaDefragmentationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationInfo calloc(MemoryStack stack) {
        return wrap(VmaDefragmentationInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #maxBytesToMove}. */
    public static long nmaxBytesToMove(long struct) { return UNSAFE.getLong(null, struct + VmaDefragmentationInfo.MAXBYTESTOMOVE); }
    /** Unsafe version of {@link #maxAllocationsToMove}. */
    public static int nmaxAllocationsToMove(long struct) { return UNSAFE.getInt(null, struct + VmaDefragmentationInfo.MAXALLOCATIONSTOMOVE); }

    /** Unsafe version of {@link #maxBytesToMove(long) maxBytesToMove}. */
    public static void nmaxBytesToMove(long struct, long value) { UNSAFE.putLong(null, struct + VmaDefragmentationInfo.MAXBYTESTOMOVE, value); }
    /** Unsafe version of {@link #maxAllocationsToMove(int) maxAllocationsToMove}. */
    public static void nmaxAllocationsToMove(long struct, int value) { UNSAFE.putInt(null, struct + VmaDefragmentationInfo.MAXALLOCATIONSTOMOVE, value); }

    // -----------------------------------

    /** An array of {@link VmaDefragmentationInfo} structs. */
    public static class Buffer extends StructBuffer<VmaDefragmentationInfo, Buffer> implements NativeResource {

        private static final VmaDefragmentationInfo ELEMENT_FACTORY = VmaDefragmentationInfo.create(-1L);

        /**
         * Creates a new {@code VmaDefragmentationInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaDefragmentationInfo#SIZEOF}, and its mark will be undefined.
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
        protected VmaDefragmentationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VmaDefragmentationInfo#maxBytesToMove} field. */
        @NativeType("VkDeviceSize")
        public long maxBytesToMove() { return VmaDefragmentationInfo.nmaxBytesToMove(address()); }
        /** @return the value of the {@link VmaDefragmentationInfo#maxAllocationsToMove} field. */
        @NativeType("uint32_t")
        public int maxAllocationsToMove() { return VmaDefragmentationInfo.nmaxAllocationsToMove(address()); }

        /** Sets the specified value to the {@link VmaDefragmentationInfo#maxBytesToMove} field. */
        public VmaDefragmentationInfo.Buffer maxBytesToMove(@NativeType("VkDeviceSize") long value) { VmaDefragmentationInfo.nmaxBytesToMove(address(), value); return this; }
        /** Sets the specified value to the {@link VmaDefragmentationInfo#maxAllocationsToMove} field. */
        public VmaDefragmentationInfo.Buffer maxAllocationsToMove(@NativeType("uint32_t") int value) { VmaDefragmentationInfo.nmaxAllocationsToMove(address(), value); return this; }

    }

}