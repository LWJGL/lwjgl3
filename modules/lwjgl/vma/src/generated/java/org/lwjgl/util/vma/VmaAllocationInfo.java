/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Parameters of {@code VmaAllocation} objects, that can be retrieved using function {@link Vma#vmaGetAllocationInfo GetAllocationInfo}.
 * 
 * <p>There is also an extended version of this structure that carries additional parameters: {@link VmaAllocationInfo2}.</p>
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
 *     char const * {@link #pName};
 * }</code></pre>
 */
public class VmaAllocationInfo extends Struct<VmaAllocationInfo> implements NativeResource {

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
        PUSERDATA,
        PNAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
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
        PNAME = layout.offsetof(6);
    }

    protected VmaAllocationInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VmaAllocationInfo create(long address, @Nullable ByteBuffer container) {
        return new VmaAllocationInfo(address, container);
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
     * <p>It can change after the allocation is moved during defragmentation.</p>
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
     * <p>It can change after the allocation is moved during defragmentation.</p>
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
     * <p>It can change after call to {@link Vma#vmaMapMemory MapMemory}, {@link Vma#vmaUnmapMemory UnmapMemory}. It can also change after the allocation is moved during defragmentation.</p>
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
    /**
     * Custom allocation name that was set with {@link Vma#vmaSetAllocationName SetAllocationName}.
     * 
     * <p>It can change after call to {@code vmaSetAllocationName()} for this allocation.</p>
     * 
     * <p>Another way to set custom name is to pass it in {@link VmaAllocationCreateInfo}{@code ::pUserData} with additional flag
     * {@link Vma#VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT} set (DEPRECATED).</p>
     */
    @NativeType("char const *")
    public @Nullable ByteBuffer pName() { return npName(address()); }
    /**
     * Custom allocation name that was set with {@link Vma#vmaSetAllocationName SetAllocationName}.
     * 
     * <p>It can change after call to {@code vmaSetAllocationName()} for this allocation.</p>
     * 
     * <p>Another way to set custom name is to pass it in {@link VmaAllocationCreateInfo}{@code ::pUserData} with additional flag
     * {@link Vma#VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT} set (DEPRECATED).</p>
     */
    @NativeType("char const *")
    public @Nullable String pNameString() { return npNameString(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaAllocationInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaAllocationInfo malloc() {
        return new VmaAllocationInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VmaAllocationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaAllocationInfo calloc() {
        return new VmaAllocationInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VmaAllocationInfo} instance allocated with {@link BufferUtils}. */
    public static VmaAllocationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaAllocationInfo(memAddress(container), container);
    }

    /** Returns a new {@code VmaAllocationInfo} instance for the specified memory address. */
    public static VmaAllocationInfo create(long address) {
        return new VmaAllocationInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VmaAllocationInfo createSafe(long address) {
        return address == NULL ? null : new VmaAllocationInfo(address, null);
    }

    /**
     * Returns a new {@link VmaAllocationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VmaAllocationInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VmaAllocationInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
        return new VmaAllocationInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VmaAllocationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocationInfo calloc(MemoryStack stack) {
        return new VmaAllocationInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VmaAllocationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #memoryType}. */
    public static int nmemoryType(long struct) { return memGetInt(struct + VmaAllocationInfo.MEMORYTYPE); }
    /** Unsafe version of {@link #deviceMemory}. */
    public static long ndeviceMemory(long struct) { return memGetLong(struct + VmaAllocationInfo.DEVICEMEMORY); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VmaAllocationInfo.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VmaAllocationInfo.SIZE); }
    /** Unsafe version of {@link #pMappedData}. */
    public static long npMappedData(long struct) { return memGetAddress(struct + VmaAllocationInfo.PMAPPEDDATA); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VmaAllocationInfo.PUSERDATA); }
    /** Unsafe version of {@link #pName}. */
    public static @Nullable ByteBuffer npName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VmaAllocationInfo.PNAME)); }
    /** Unsafe version of {@link #pNameString}. */
    public static @Nullable String npNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VmaAllocationInfo.PNAME)); }

    // -----------------------------------

    /** An array of {@link VmaAllocationInfo} structs. */
    public static class Buffer extends StructBuffer<VmaAllocationInfo, Buffer> implements NativeResource {

        private static final VmaAllocationInfo ELEMENT_FACTORY = VmaAllocationInfo.create(-1L);

        /**
         * Creates a new {@code VmaAllocationInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaAllocationInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
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
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VmaAllocationInfo#pName} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer pName() { return VmaAllocationInfo.npName(address()); }
        /** @return the null-terminated string pointed to by the {@link VmaAllocationInfo#pName} field. */
        @NativeType("char const *")
        public @Nullable String pNameString() { return VmaAllocationInfo.npNameString(address()); }

    }

}