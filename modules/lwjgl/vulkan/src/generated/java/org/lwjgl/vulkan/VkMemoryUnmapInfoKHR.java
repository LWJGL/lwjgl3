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
 * Structure containing parameters of a memory unmap operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code memory} <b>must</b> be currently host mapped</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMapMemory2#VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR}</li>
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
 * <p>{@link KHRMapMemory2#vkUnmapMemory2KHR UnmapMemory2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryUnmapInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkMemoryUnmapFlagsKHR {@link #flags};
 *     VkDeviceMemory {@link #memory};
 * }</code></pre>
 */
public class VkMemoryUnmapInfoKHR extends Struct<VkMemoryUnmapInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MEMORY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
    }

    protected VkMemoryUnmapInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryUnmapInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryUnmapInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkMemoryUnmapInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryUnmapInfoKHR(ByteBuffer container) {
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
    @NativeType("VkMemoryUnmapFlagsKHR")
    public int flags() { return nflags(address()); }
    /** the {@code VkDeviceMemory} object to be unmapped. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMemoryUnmapInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMapMemory2#VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR} value to the {@link #sType} field. */
    public VkMemoryUnmapInfoKHR sType$Default() { return sType(KHRMapMemory2.VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryUnmapInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkMemoryUnmapInfoKHR flags(@NativeType("VkMemoryUnmapFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #memory} field. */
    public VkMemoryUnmapInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryUnmapInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long memory
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        memory(memory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryUnmapInfoKHR set(VkMemoryUnmapInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryUnmapInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryUnmapInfoKHR malloc() {
        return new VkMemoryUnmapInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryUnmapInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryUnmapInfoKHR calloc() {
        return new VkMemoryUnmapInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryUnmapInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryUnmapInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryUnmapInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryUnmapInfoKHR} instance for the specified memory address. */
    public static VkMemoryUnmapInfoKHR create(long address) {
        return new VkMemoryUnmapInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryUnmapInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkMemoryUnmapInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryUnmapInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryUnmapInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryUnmapInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryUnmapInfoKHR malloc(MemoryStack stack) {
        return new VkMemoryUnmapInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryUnmapInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryUnmapInfoKHR calloc(MemoryStack stack) {
        return new VkMemoryUnmapInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryUnmapInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryUnmapInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkMemoryUnmapInfoKHR.FLAGS); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkMemoryUnmapInfoKHR.MEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryUnmapInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryUnmapInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryUnmapInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryUnmapInfoKHR.MEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryUnmapInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkMemoryUnmapInfoKHR, Buffer> implements NativeResource {

        private static final VkMemoryUnmapInfoKHR ELEMENT_FACTORY = VkMemoryUnmapInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryUnmapInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryUnmapInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryUnmapInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryUnmapInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryUnmapInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkMemoryUnmapInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryUnmapInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkMemoryUnmapInfoKHR#flags} field. */
        @NativeType("VkMemoryUnmapFlagsKHR")
        public int flags() { return VkMemoryUnmapInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkMemoryUnmapInfoKHR#memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkMemoryUnmapInfoKHR.nmemory(address()); }

        /** Sets the specified value to the {@link VkMemoryUnmapInfoKHR#sType} field. */
        public VkMemoryUnmapInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryUnmapInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMapMemory2#VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR} value to the {@link VkMemoryUnmapInfoKHR#sType} field. */
        public VkMemoryUnmapInfoKHR.Buffer sType$Default() { return sType(KHRMapMemory2.VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR); }
        /** Sets the specified value to the {@link VkMemoryUnmapInfoKHR#pNext} field. */
        public VkMemoryUnmapInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryUnmapInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryUnmapInfoKHR#flags} field. */
        public VkMemoryUnmapInfoKHR.Buffer flags(@NativeType("VkMemoryUnmapFlagsKHR") int value) { VkMemoryUnmapInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryUnmapInfoKHR#memory} field. */
        public VkMemoryUnmapInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMemoryUnmapInfoKHR.nmemory(address(), value); return this; }

    }

}