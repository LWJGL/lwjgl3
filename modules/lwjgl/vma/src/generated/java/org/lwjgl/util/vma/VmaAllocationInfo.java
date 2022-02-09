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
 * Parameters of {@code VmaAllocation} objects, that can be retrieved using function {@link Vma#vmaGetAllocationInfo GetAllocationInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaAllocationInfo {
 *     uint32_t {@link #memoryType};
 *     VkDeviceMemory {@link #deviceMemory};
 *     VkDeviceSize {@link #offset};
 *     VkDeviceSize {@link #size};
 *     void * {@link #pMappedData};
 *     void * {@link #pUserData};
 * }</code></pre>
 */
public class VmaAllocationInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEMORYTYPE,
        DEVICEMEMORY,
        OFFSET,
        SIZE,
        PMAPPEDDATA,
        PUSERDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEMORYTYPE = layout.offsetof(0);
        DEVICEMEMORY = layout.offsetof(1);
        OFFSET = layout.offsetof(2);
        SIZE = layout.offsetof(3);
        PMAPPEDDATA = layout.offsetof(4);
        PUSERDATA = layout.offsetof(5);
    }

    /**
     * Creates a {@code VmaAllocationInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaAllocationInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * memory type index that this allocation was allocated from.
     * 
     * <p>It never changes.</p>
     */
    @NativeType("uint32_t")
    public int memoryType() { return nmemoryType(address()); }
    /**
     * handle to Vulkan memory object.
     * 
     * <p>Same memory object can be shared by multiple allocations.</p>
     * 
     * <p>It can change after call to {@link Vma#vmaDefragment Defragment} if this allocation is passed to the function.</p>
     */
    @NativeType("VkDeviceMemory")
    public long deviceMemory() { return ndeviceMemory(address()); }
    /**
     * offset in {@code VkDeviceMemory} object to the beginning of this allocation, in bytes. {@code (deviceMemory, offset)} pair is unique to this allocation.
     * 
     * <p>You usually don't need to use this offset. If you create a buffer or an image together with the allocation using e.g. function {@link Vma#vmaCreateBuffer CreateBuffer},
     * {@link Vma#vmaCreateImage CreateImage}, functions that operate on these resources refer to the beginning of the buffer or image, not entire device memory block. Functions like
     * {@link Vma#vmaMapMemory MapMemory}, {@link Vma#vmaBindBufferMemory BindBufferMemory} also refer to the beginning of the allocation and apply this offset automatically.</p>
     * 
     * <p>It can change after call to {@link Vma#vmaDefragment Defragment} if this allocation is passed to the function.</p>
     */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /**
     * size of this allocation, in bytes.
     * 
     * <p>It never changes.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Allocation size returned in this variable may be greater than the size requested for the resource e.g. as {@code VkBufferCreateInfo::size}. Whole size
     * of the allocation is accessible for operations on memory e.g. using a pointer after mapping with {@link Vma#vmaMapMemory MapMemory}, but operations on the resource e.g.
     * using {@code vkCmdCopyBuffer} must be limited to the size of the resource.</p></div>
     */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /**
     * pointer to the beginning of this allocation as mapped data.
     * 
     * <p>If the allocation hasn't been mapped using {@link Vma#vmaMapMemory MapMemory} and hasn't been created with {@link Vma#VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT} flag, this value is null.</p>
     * 
     * <p>It can change after call to {@link Vma#vmaMapMemory MapMemory}, {@link Vma#vmaUnmapMemory UnmapMemory}. It can also change after call to {@link Vma#vmaDefragment Defragment} if this allocation is passed to the function.</p>
     */
    @NativeType("void *")
    public long pMappedData() { return npMappedData(address()); }
    /**
     * custom general-purpose pointer that was passed as {@link VmaAllocationCreateInfo}{@code ::pUserData} or set using {@link Vma#vmaSetAllocationUserData SetAllocationUserData}.
     * 
     * <p>It can change after call to {@link Vma#vmaSetAllocationUserData SetAllocationUserData} for this allocation.</p>
     */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaAllocationInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaAllocationInfo malloc() {
        return wrap(VmaAllocationInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaAllocationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaAllocationInfo calloc() {
        return wrap(VmaAllocationInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaAllocationInfo} instance allocated with {@link BufferUtils}. */
    public static VmaAllocationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaAllocationInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaAllocationInfo} instance for the specified memory address. */
    public static VmaAllocationInfo create(long address) {
        return wrap(VmaAllocationInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaAllocationInfo createSafe(long address) {
        return address == NULL ? null : wrap(VmaAllocationInfo.class, address);
    }

    /**
     * Returns a new {@link VmaAllocationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaAllocationInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaAllocationInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocationInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocationInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocationInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocationInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaAllocationInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaAllocationInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaAllocationInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaAllocationInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VmaAllocationInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocationInfo malloc(MemoryStack stack) {
        return wrap(VmaAllocationInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaAllocationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocationInfo calloc(MemoryStack stack) {
        return wrap(VmaAllocationInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaAllocationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #memoryType}. */
    public static int nmemoryType(long struct) { return UNSAFE.getInt(null, struct + VmaAllocationInfo.MEMORYTYPE); }
    /** Unsafe version of {@link #deviceMemory}. */
    public static long ndeviceMemory(long struct) { return UNSAFE.getLong(null, struct + VmaAllocationInfo.DEVICEMEMORY); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return UNSAFE.getLong(null, struct + VmaAllocationInfo.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VmaAllocationInfo.SIZE); }
    /** Unsafe version of {@link #pMappedData}. */
    public static long npMappedData(long struct) { return memGetAddress(struct + VmaAllocationInfo.PMAPPEDDATA); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VmaAllocationInfo.PUSERDATA); }

    // -----------------------------------

    /** An array of {@link VmaAllocationInfo} structs. */
    public static class Buffer extends StructBuffer<VmaAllocationInfo, Buffer> implements NativeResource {

        private static final VmaAllocationInfo ELEMENT_FACTORY = VmaAllocationInfo.create(-1L);

        /**
         * Creates a new {@code VmaAllocationInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaAllocationInfo#SIZEOF}, and its mark will be undefined.
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
        protected VmaAllocationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VmaAllocationInfo#memoryType} field. */
        @NativeType("uint32_t")
        public int memoryType() { return VmaAllocationInfo.nmemoryType(address()); }
        /** @return the value of the {@link VmaAllocationInfo#deviceMemory} field. */
        @NativeType("VkDeviceMemory")
        public long deviceMemory() { return VmaAllocationInfo.ndeviceMemory(address()); }
        /** @return the value of the {@link VmaAllocationInfo#offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VmaAllocationInfo.noffset(address()); }
        /** @return the value of the {@link VmaAllocationInfo#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VmaAllocationInfo.nsize(address()); }
        /** @return the value of the {@link VmaAllocationInfo#pMappedData} field. */
        @NativeType("void *")
        public long pMappedData() { return VmaAllocationInfo.npMappedData(address()); }
        /** @return the value of the {@link VmaAllocationInfo#pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VmaAllocationInfo.npUserData(address()); }

    }

}