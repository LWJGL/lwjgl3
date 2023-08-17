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
 * Structure containing parameters of a memory map operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code memory} <b>must</b> not be currently host mapped</li>
 * <li>{@code offset} <b>must</b> be less than the size of {@code memory}</li>
 * <li>If {@code size} is not equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be greater than 0</li>
 * <li>If {@code size} is not equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be less than or equal to the size of the {@code memory} minus {@code offset}</li>
 * <li>{@code memory} <b>must</b> have been created with a memory type that reports {@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT}</li>
 * <li>{@code memory} <b>must</b> not have been allocated with multiple instances</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMapMemory2#VK_STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * </ul>
 * 
 * <h5>Host Synchronization</h5>
 * 
 * <ul>
 * <li>Host access to {@code memory} <b>must</b> be externally synchronized</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRMapMemory2#vkMapMemory2KHR MapMemory2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryMapInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkMemoryMapFlags {@link #flags};
 *     VkDeviceMemory {@link #memory};
 *     VkDeviceSize {@link #offset};
 *     VkDeviceSize {@link #size};
 * }</code></pre>
 */
public class VkMemoryMapInfoKHR extends Struct<VkMemoryMapInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MEMORY,
        OFFSET,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        SIZE = layout.offsetof(5);
    }

    protected VkMemoryMapInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryMapInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryMapInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkMemoryMapInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryMapInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** reserved for future use. */
    @NativeType("VkMemoryMapFlags")
    public int flags() { return nflags(address()); }
    /** the {@code VkDeviceMemory} object to be mapped. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** a zero-based byte offset from the beginning of the memory object. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** the size of the memory range to map, or {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE} to map from {@code offset} to the end of the allocation. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMemoryMapInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMapMemory2#VK_STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR} value to the {@link #sType} field. */
    public VkMemoryMapInfoKHR sType$Default() { return sType(KHRMapMemory2.VK_STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryMapInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkMemoryMapInfoKHR flags(@NativeType("VkMemoryMapFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #memory} field. */
    public VkMemoryMapInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
    public VkMemoryMapInfoKHR offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkMemoryMapInfoKHR size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryMapInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long memory,
        long offset,
        long size
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
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
    public VkMemoryMapInfoKHR set(VkMemoryMapInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryMapInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryMapInfoKHR malloc() {
        return new VkMemoryMapInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryMapInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryMapInfoKHR calloc() {
        return new VkMemoryMapInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryMapInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryMapInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryMapInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryMapInfoKHR} instance for the specified memory address. */
    public static VkMemoryMapInfoKHR create(long address) {
        return new VkMemoryMapInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryMapInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkMemoryMapInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkMemoryMapInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMapInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMapInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryMapInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryMapInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryMapInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryMapInfoKHR malloc(MemoryStack stack) {
        return new VkMemoryMapInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryMapInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryMapInfoKHR calloc(MemoryStack stack) {
        return new VkMemoryMapInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryMapInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMapInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryMapInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryMapInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryMapInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkMemoryMapInfoKHR.FLAGS); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkMemoryMapInfoKHR.MEMORY); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return UNSAFE.getLong(null, struct + VkMemoryMapInfoKHR.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkMemoryMapInfoKHR.SIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryMapInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryMapInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryMapInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryMapInfoKHR.MEMORY, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryMapInfoKHR.OFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryMapInfoKHR.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryMapInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkMemoryMapInfoKHR, Buffer> implements NativeResource {

        private static final VkMemoryMapInfoKHR ELEMENT_FACTORY = VkMemoryMapInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryMapInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryMapInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryMapInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryMapInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryMapInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkMemoryMapInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryMapInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkMemoryMapInfoKHR#flags} field. */
        @NativeType("VkMemoryMapFlags")
        public int flags() { return VkMemoryMapInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkMemoryMapInfoKHR#memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkMemoryMapInfoKHR.nmemory(address()); }
        /** @return the value of the {@link VkMemoryMapInfoKHR#offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkMemoryMapInfoKHR.noffset(address()); }
        /** @return the value of the {@link VkMemoryMapInfoKHR#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkMemoryMapInfoKHR.nsize(address()); }

        /** Sets the specified value to the {@link VkMemoryMapInfoKHR#sType} field. */
        public VkMemoryMapInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryMapInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMapMemory2#VK_STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR} value to the {@link VkMemoryMapInfoKHR#sType} field. */
        public VkMemoryMapInfoKHR.Buffer sType$Default() { return sType(KHRMapMemory2.VK_STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR); }
        /** Sets the specified value to the {@link VkMemoryMapInfoKHR#pNext} field. */
        public VkMemoryMapInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryMapInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryMapInfoKHR#flags} field. */
        public VkMemoryMapInfoKHR.Buffer flags(@NativeType("VkMemoryMapFlags") int value) { VkMemoryMapInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryMapInfoKHR#memory} field. */
        public VkMemoryMapInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMemoryMapInfoKHR.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryMapInfoKHR#offset} field. */
        public VkMemoryMapInfoKHR.Buffer offset(@NativeType("VkDeviceSize") long value) { VkMemoryMapInfoKHR.noffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryMapInfoKHR#size} field. */
        public VkMemoryMapInfoKHR.Buffer size(@NativeType("VkDeviceSize") long value) { VkMemoryMapInfoKHR.nsize(address(), value); return this; }

    }

}