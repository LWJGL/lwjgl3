/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a mapped memory range.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code memory} <b>must</b> be currently host mapped</li>
 * <li>If {@code size} is not equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, {@code offset} and {@code size} <b>must</b> specify a range contained within the currently mapped range of {@code memory}</li>
 * <li>If {@code size} is equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, {@code offset} <b>must</b> be within the currently mapped range of {@code memory}</li>
 * <li>If {@code size} is equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, the end of the current mapping of {@code memory} <b>must</b> be a multiple of {@link VkPhysicalDeviceLimits}{@code ::nonCoherentAtomSize} bytes from the beginning of the memory object.</li>
 * <li>{@code offset} <b>must</b> be a multiple of {@link VkPhysicalDeviceLimits}{@code ::nonCoherentAtomSize}</li>
 * <li>If {@code size} is not equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> either be a multiple of {@link VkPhysicalDeviceLimits}{@code ::nonCoherentAtomSize}, or {@code offset} plus {@code size} <b>must</b> equal the size of {@code memory}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE STRUCTURE_TYPE_MAPPED_MEMORY_RANGE}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkFlushMappedMemoryRanges FlushMappedMemoryRanges}, {@link VK10#vkInvalidateMappedMemoryRanges InvalidateMappedMemoryRanges}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code memory} &ndash; the memory object to which this range belongs.</li>
 * <li>{@code offset} &ndash; the zero-based byte offset from the beginning of the memory object.</li>
 * <li>{@code size} &ndash; either the size of range, or {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE} to affect the range from {@code offset} to the end of the current mapping of the allocation.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMappedMemoryRange {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceMemory memory;
 *     VkDeviceSize offset;
 *     VkDeviceSize size;
 * }</code></pre>
 */
public class VkMappedMemoryRange extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORY,
        OFFSET,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
        OFFSET = layout.offsetof(3);
        SIZE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkMappedMemoryRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMappedMemoryRange(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** Returns the value of the {@code offset} field. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** Returns the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMappedMemoryRange sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMappedMemoryRange pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkMappedMemoryRange memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkMappedMemoryRange offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkMappedMemoryRange size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMappedMemoryRange set(
        int sType,
        long pNext,
        long memory,
        long offset,
        long size
    ) {
        sType(sType);
        pNext(pNext);
        memory(memory);
        offset(offset);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMappedMemoryRange set(VkMappedMemoryRange src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMappedMemoryRange} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMappedMemoryRange malloc() {
        return wrap(VkMappedMemoryRange.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMappedMemoryRange} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMappedMemoryRange calloc() {
        return wrap(VkMappedMemoryRange.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMappedMemoryRange} instance allocated with {@link BufferUtils}. */
    public static VkMappedMemoryRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMappedMemoryRange.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMappedMemoryRange} instance for the specified memory address. */
    public static VkMappedMemoryRange create(long address) {
        return wrap(VkMappedMemoryRange.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMappedMemoryRange createSafe(long address) {
        return address == NULL ? null : wrap(VkMappedMemoryRange.class, address);
    }

    /**
     * Returns a new {@link VkMappedMemoryRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMappedMemoryRange.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMappedMemoryRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMappedMemoryRange.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMappedMemoryRange.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMappedMemoryRange.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMappedMemoryRange.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMappedMemoryRange.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMappedMemoryRange.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkMappedMemoryRange} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkMappedMemoryRange mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkMappedMemoryRange} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkMappedMemoryRange callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkMappedMemoryRange} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMappedMemoryRange mallocStack(MemoryStack stack) {
        return wrap(VkMappedMemoryRange.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMappedMemoryRange} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMappedMemoryRange callocStack(MemoryStack stack) {
        return wrap(VkMappedMemoryRange.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMappedMemoryRange.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMappedMemoryRange.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMappedMemoryRange.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkMappedMemoryRange.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMappedMemoryRange.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMappedMemoryRange.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMappedMemoryRange.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMappedMemoryRange.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMappedMemoryRange.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMappedMemoryRange.PNEXT); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkMappedMemoryRange.MEMORY); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return UNSAFE.getLong(null, struct + VkMappedMemoryRange.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkMappedMemoryRange.SIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMappedMemoryRange.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMappedMemoryRange.PNEXT, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkMappedMemoryRange.MEMORY, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { UNSAFE.putLong(null, struct + VkMappedMemoryRange.OFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { UNSAFE.putLong(null, struct + VkMappedMemoryRange.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkMappedMemoryRange} structs. */
    public static class Buffer extends StructBuffer<VkMappedMemoryRange, Buffer> implements NativeResource {

        private static final VkMappedMemoryRange ELEMENT_FACTORY = VkMappedMemoryRange.create(-1L);

        /**
         * Creates a new {@code VkMappedMemoryRange.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMappedMemoryRange#SIZEOF}, and its mark will be undefined.
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
        protected VkMappedMemoryRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMappedMemoryRange.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMappedMemoryRange.npNext(address()); }
        /** Returns the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkMappedMemoryRange.nmemory(address()); }
        /** Returns the value of the {@code offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkMappedMemoryRange.noffset(address()); }
        /** Returns the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkMappedMemoryRange.nsize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMappedMemoryRange.Buffer sType(@NativeType("VkStructureType") int value) { VkMappedMemoryRange.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMappedMemoryRange.Buffer pNext(@NativeType("void const *") long value) { VkMappedMemoryRange.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkMappedMemoryRange.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMappedMemoryRange.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkMappedMemoryRange.Buffer offset(@NativeType("VkDeviceSize") long value) { VkMappedMemoryRange.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkMappedMemoryRange.Buffer size(@NativeType("VkDeviceSize") long value) { VkMappedMemoryRange.nsize(address(), value); return this; }

    }

}