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
 * Structure specifying memory bindings for a video session object.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
 * <li>{@code memorySize} <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRVideoQueue#vkBindVideoSessionMemoryKHR BindVideoSessionMemoryKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindVideoSessionMemoryInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #memoryBindIndex};
 *     VkDeviceMemory {@link #memory};
 *     VkDeviceSize {@link #memoryOffset};
 *     VkDeviceSize {@link #memorySize};
 * }</code></pre>
 */
public class VkBindVideoSessionMemoryInfoKHR extends Struct<VkBindVideoSessionMemoryInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYBINDINDEX,
        MEMORY,
        MEMORYOFFSET,
        MEMORYSIZE;

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
        MEMORYBINDINDEX = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
        MEMORYSIZE = layout.offsetof(5);
    }

    protected VkBindVideoSessionMemoryInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindVideoSessionMemoryInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkBindVideoSessionMemoryInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkBindVideoSessionMemoryInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindVideoSessionMemoryInfoKHR(ByteBuffer container) {
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
    /** the memory binding index to bind memory to. */
    @NativeType("uint32_t")
    public int memoryBindIndex() { return nmemoryBindIndex(address()); }
    /** the allocated device memory to be bound to the video session’s memory binding with index {@code memoryBindIndex}. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** the start offset of the region of {@code memory} which is to be bound. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }
    /** the size in bytes of the region of {@code memory}, starting from {@code memoryOffset} bytes, to be bound. */
    @NativeType("VkDeviceSize")
    public long memorySize() { return nmemorySize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBindVideoSessionMemoryInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR} value to the {@link #sType} field. */
    public VkBindVideoSessionMemoryInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBindVideoSessionMemoryInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryBindIndex} field. */
    public VkBindVideoSessionMemoryInfoKHR memoryBindIndex(@NativeType("uint32_t") int value) { nmemoryBindIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #memory} field. */
    public VkBindVideoSessionMemoryInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryOffset} field. */
    public VkBindVideoSessionMemoryInfoKHR memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #memorySize} field. */
    public VkBindVideoSessionMemoryInfoKHR memorySize(@NativeType("VkDeviceSize") long value) { nmemorySize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindVideoSessionMemoryInfoKHR set(
        int sType,
        long pNext,
        int memoryBindIndex,
        long memory,
        long memoryOffset,
        long memorySize
    ) {
        sType(sType);
        pNext(pNext);
        memoryBindIndex(memoryBindIndex);
        memory(memory);
        memoryOffset(memoryOffset);
        memorySize(memorySize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindVideoSessionMemoryInfoKHR set(VkBindVideoSessionMemoryInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindVideoSessionMemoryInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindVideoSessionMemoryInfoKHR malloc() {
        return new VkBindVideoSessionMemoryInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindVideoSessionMemoryInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindVideoSessionMemoryInfoKHR calloc() {
        return new VkBindVideoSessionMemoryInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindVideoSessionMemoryInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindVideoSessionMemoryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindVideoSessionMemoryInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkBindVideoSessionMemoryInfoKHR} instance for the specified memory address. */
    public static VkBindVideoSessionMemoryInfoKHR create(long address) {
        return new VkBindVideoSessionMemoryInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindVideoSessionMemoryInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkBindVideoSessionMemoryInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkBindVideoSessionMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindVideoSessionMemoryInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindVideoSessionMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindVideoSessionMemoryInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindVideoSessionMemoryInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindVideoSessionMemoryInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindVideoSessionMemoryInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindVideoSessionMemoryInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindVideoSessionMemoryInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindVideoSessionMemoryInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindVideoSessionMemoryInfoKHR malloc(MemoryStack stack) {
        return new VkBindVideoSessionMemoryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindVideoSessionMemoryInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindVideoSessionMemoryInfoKHR calloc(MemoryStack stack) {
        return new VkBindVideoSessionMemoryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindVideoSessionMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindVideoSessionMemoryInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindVideoSessionMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindVideoSessionMemoryInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBindVideoSessionMemoryInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindVideoSessionMemoryInfoKHR.PNEXT); }
    /** Unsafe version of {@link #memoryBindIndex}. */
    public static int nmemoryBindIndex(long struct) { return UNSAFE.getInt(null, struct + VkBindVideoSessionMemoryInfoKHR.MEMORYBINDINDEX); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkBindVideoSessionMemoryInfoKHR.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return UNSAFE.getLong(null, struct + VkBindVideoSessionMemoryInfoKHR.MEMORYOFFSET); }
    /** Unsafe version of {@link #memorySize}. */
    public static long nmemorySize(long struct) { return UNSAFE.getLong(null, struct + VkBindVideoSessionMemoryInfoKHR.MEMORYSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBindVideoSessionMemoryInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindVideoSessionMemoryInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #memoryBindIndex(int) memoryBindIndex}. */
    public static void nmemoryBindIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkBindVideoSessionMemoryInfoKHR.MEMORYBINDINDEX, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkBindVideoSessionMemoryInfoKHR.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBindVideoSessionMemoryInfoKHR.MEMORYOFFSET, value); }
    /** Unsafe version of {@link #memorySize(long) memorySize}. */
    public static void nmemorySize(long struct, long value) { UNSAFE.putLong(null, struct + VkBindVideoSessionMemoryInfoKHR.MEMORYSIZE, value); }

    // -----------------------------------

    /** An array of {@link VkBindVideoSessionMemoryInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkBindVideoSessionMemoryInfoKHR, Buffer> implements NativeResource {

        private static final VkBindVideoSessionMemoryInfoKHR ELEMENT_FACTORY = VkBindVideoSessionMemoryInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBindVideoSessionMemoryInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindVideoSessionMemoryInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindVideoSessionMemoryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBindVideoSessionMemoryInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindVideoSessionMemoryInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkBindVideoSessionMemoryInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindVideoSessionMemoryInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkBindVideoSessionMemoryInfoKHR#memoryBindIndex} field. */
        @NativeType("uint32_t")
        public int memoryBindIndex() { return VkBindVideoSessionMemoryInfoKHR.nmemoryBindIndex(address()); }
        /** @return the value of the {@link VkBindVideoSessionMemoryInfoKHR#memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkBindVideoSessionMemoryInfoKHR.nmemory(address()); }
        /** @return the value of the {@link VkBindVideoSessionMemoryInfoKHR#memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkBindVideoSessionMemoryInfoKHR.nmemoryOffset(address()); }
        /** @return the value of the {@link VkBindVideoSessionMemoryInfoKHR#memorySize} field. */
        @NativeType("VkDeviceSize")
        public long memorySize() { return VkBindVideoSessionMemoryInfoKHR.nmemorySize(address()); }

        /** Sets the specified value to the {@link VkBindVideoSessionMemoryInfoKHR#sType} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindVideoSessionMemoryInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR} value to the {@link VkBindVideoSessionMemoryInfoKHR#sType} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR); }
        /** Sets the specified value to the {@link VkBindVideoSessionMemoryInfoKHR#pNext} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindVideoSessionMemoryInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkBindVideoSessionMemoryInfoKHR#memoryBindIndex} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer memoryBindIndex(@NativeType("uint32_t") int value) { VkBindVideoSessionMemoryInfoKHR.nmemoryBindIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkBindVideoSessionMemoryInfoKHR#memory} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkBindVideoSessionMemoryInfoKHR.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@link VkBindVideoSessionMemoryInfoKHR#memoryOffset} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkBindVideoSessionMemoryInfoKHR.nmemoryOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkBindVideoSessionMemoryInfoKHR#memorySize} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer memorySize(@NativeType("VkDeviceSize") long value) { VkBindVideoSessionMemoryInfoKHR.nmemorySize(address(), value); return this; }

    }

}