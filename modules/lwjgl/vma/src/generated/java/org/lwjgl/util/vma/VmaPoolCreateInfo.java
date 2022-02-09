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

import org.lwjgl.vulkan.*;

/**
 * Describes parameter of created {@code VmaPool}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaPoolCreateInfo {
 *     uint32_t {@link #memoryTypeIndex};
 *     VmaPoolCreateFlags {@link #flags};
 *     VkDeviceSize {@link #blockSize};
 *     size_t {@link #minBlockCount};
 *     size_t {@link #maxBlockCount};
 *     float {@link #priority};
 *     VkDeviceSize {@link #minAllocationAlignment};
 *     void * {@link #pMemoryAllocateNext};
 * }</code></pre>
 */
public class VmaPoolCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEMORYTYPEINDEX,
        FLAGS,
        BLOCKSIZE,
        MINBLOCKCOUNT,
        MAXBLOCKCOUNT,
        PRIORITY,
        MINALLOCATIONALIGNMENT,
        PMEMORYALLOCATENEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEMORYTYPEINDEX = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        BLOCKSIZE = layout.offsetof(2);
        MINBLOCKCOUNT = layout.offsetof(3);
        MAXBLOCKCOUNT = layout.offsetof(4);
        PRIORITY = layout.offsetof(5);
        MINALLOCATIONALIGNMENT = layout.offsetof(6);
        PMEMORYALLOCATENEXT = layout.offsetof(7);
    }

    /**
     * Creates a {@code VmaPoolCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaPoolCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Vulkan memory type index to allocate this pool from */
    @NativeType("uint32_t")
    public int memoryTypeIndex() { return nmemoryTypeIndex(address()); }
    /** Use combination of {@code VmaPoolCreateFlagBits}. One or more of:<br><table><tr><td>{@link Vma#VMA_POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT}</td><td>{@link Vma#VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT POOL_CREATE_LINEAR_ALGORITHM_BIT}</td></tr><tr><td>{@link Vma#VMA_POOL_CREATE_BUDDY_ALGORITHM_BIT POOL_CREATE_BUDDY_ALGORITHM_BIT}</td><td>{@link Vma#VMA_POOL_CREATE_TLSF_ALGORITHM_BIT POOL_CREATE_TLSF_ALGORITHM_BIT}</td></tr><tr><td>{@link Vma#VMA_POOL_CREATE_ALGORITHM_MASK POOL_CREATE_ALGORITHM_MASK}</td></tr></table> */
    @NativeType("VmaPoolCreateFlags")
    public int flags() { return nflags(address()); }
    /**
     * size of a single {@code VkDeviceMemory} block to be allocated as part of this pool, in bytes. Optional.
     * 
     * <p>Specify nonzero to set explicit, constant size of memory blocks used by this pool. Leave 0 to use default and let the library manage block sizes
     * automatically. Sizes of particular blocks may vary. In this case, the pool will also support dedicated allocations.</p>
     */
    @NativeType("VkDeviceSize")
    public long blockSize() { return nblockSize(address()); }
    /**
     * minimum number of blocks to be always allocated in this pool, even if they stay empty.
     * 
     * <p>Set to 0 to have no preallocated blocks and allow the pool be completely empty.</p>
     */
    @NativeType("size_t")
    public long minBlockCount() { return nminBlockCount(address()); }
    /**
     * maximum number of blocks that can be allocated in this pool. Optional.
     * 
     * <p>Set to 0 to use default, which is {@code SIZE_MAX}, which means no limit. Set to same value as {@link VmaPoolCreateInfo}{@code ::minBlockCount} to have fixed
     * amount of memory allocated throughout whole lifetime of this pool.</p>
     */
    @NativeType("size_t")
    public long maxBlockCount() { return nmaxBlockCount(address()); }
    /**
     * A floating-point value between 0 and 1, indicating the priority of the allocations in this pool relative to other memory allocations.
     * 
     * <p>It is used only when {@link Vma#VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT} flag was used during creation of the {@code VmaAllocator} object. Otherwise, this
     * variable is ignored.</p>
     */
    public float priority() { return npriority(address()); }
    /**
     * Additional minimum alignment to be used for all allocations created from this pool. Can be 0.
     * 
     * <p>Leave 0 (default) not to impose any additional alignment. If not 0, it must be a power of two. It can be useful in cases where alignment returned by
     * Vulkan by functions like {@code vkGetBufferMemoryRequirements} is not enough, e.g. when doing interop with OpenGL.</p>
     */
    @NativeType("VkDeviceSize")
    public long minAllocationAlignment() { return nminAllocationAlignment(address()); }
    /**
     * Additional {@code pNext} chain to be attached to {@code VkMemoryAllocateInfo} used for every allocation made by this pool. Optional.
     * 
     * <p>Optional, can be null. If not null, it must point to a {@code pNext} chain of structures that can be attached to {@code VkMemoryAllocateInfo}. It can
     * be useful for special needs such as adding {@code VkExportMemoryAllocateInfoKHR}. Structures pointed by this member must remain alive and unchanged for
     * the whole lifetime of the custom pool.</p>
     * 
     * <p>Please note that some structures, e.g. {@code VkMemoryPriorityAllocateInfoEXT}, {@code VkMemoryDedicatedAllocateInfoKHR}, can be attached automatically
     * by this library when using other, more convenient of its features.</p>
     */
    @NativeType("void *")
    public long pMemoryAllocateNext() { return npMemoryAllocateNext(address()); }

    /** Sets the specified value to the {@link #memoryTypeIndex} field. */
    public VmaPoolCreateInfo memoryTypeIndex(@NativeType("uint32_t") int value) { nmemoryTypeIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VmaPoolCreateInfo flags(@NativeType("VmaPoolCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #blockSize} field. */
    public VmaPoolCreateInfo blockSize(@NativeType("VkDeviceSize") long value) { nblockSize(address(), value); return this; }
    /** Sets the specified value to the {@link #minBlockCount} field. */
    public VmaPoolCreateInfo minBlockCount(@NativeType("size_t") long value) { nminBlockCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxBlockCount} field. */
    public VmaPoolCreateInfo maxBlockCount(@NativeType("size_t") long value) { nmaxBlockCount(address(), value); return this; }
    /** Sets the specified value to the {@link #priority} field. */
    public VmaPoolCreateInfo priority(float value) { npriority(address(), value); return this; }
    /** Sets the specified value to the {@link #minAllocationAlignment} field. */
    public VmaPoolCreateInfo minAllocationAlignment(@NativeType("VkDeviceSize") long value) { nminAllocationAlignment(address(), value); return this; }
    /** Sets the specified value to the {@link #pMemoryAllocateNext} field. */
    public VmaPoolCreateInfo pMemoryAllocateNext(@NativeType("void *") long value) { npMemoryAllocateNext(address(), value); return this; }
    /** Prepends the specified {@link VkDedicatedAllocationMemoryAllocateInfoNV} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkDedicatedAllocationMemoryAllocateInfoNV value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryAllocateInfo} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkExportMemoryAllocateInfo value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryAllocateInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkExportMemoryAllocateInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryAllocateInfoNV} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkExportMemoryAllocateInfoNV value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryWin32HandleInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkExportMemoryWin32HandleInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkExportMemoryWin32HandleInfoNV} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkExportMemoryWin32HandleInfoNV value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkImportMemoryFdInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkImportMemoryFdInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkImportMemoryHostPointerInfoEXT} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkImportMemoryHostPointerInfoEXT value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkImportMemoryWin32HandleInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkImportMemoryWin32HandleInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkImportMemoryWin32HandleInfoNV} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkImportMemoryWin32HandleInfoNV value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkMemoryAllocateFlagsInfo} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryAllocateFlagsInfo value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkMemoryAllocateFlagsInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryAllocateFlagsInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkMemoryDedicatedAllocateInfo} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryDedicatedAllocateInfo value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkMemoryDedicatedAllocateInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryDedicatedAllocateInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkMemoryOpaqueCaptureAddressAllocateInfo} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryOpaqueCaptureAddressAllocateInfo value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryOpaqueCaptureAddressAllocateInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
    /** Prepends the specified {@link VkMemoryPriorityAllocateInfoEXT} value to the {@code pMemoryAllocateNext} chain. */
    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryPriorityAllocateInfoEXT value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VmaPoolCreateInfo set(
        int memoryTypeIndex,
        int flags,
        long blockSize,
        long minBlockCount,
        long maxBlockCount,
        float priority,
        long minAllocationAlignment,
        long pMemoryAllocateNext
    ) {
        memoryTypeIndex(memoryTypeIndex);
        flags(flags);
        blockSize(blockSize);
        minBlockCount(minBlockCount);
        maxBlockCount(maxBlockCount);
        priority(priority);
        minAllocationAlignment(minAllocationAlignment);
        pMemoryAllocateNext(pMemoryAllocateNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaPoolCreateInfo set(VmaPoolCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaPoolCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaPoolCreateInfo malloc() {
        return wrap(VmaPoolCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaPoolCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaPoolCreateInfo calloc() {
        return wrap(VmaPoolCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaPoolCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VmaPoolCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaPoolCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaPoolCreateInfo} instance for the specified memory address. */
    public static VmaPoolCreateInfo create(long address) {
        return wrap(VmaPoolCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaPoolCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VmaPoolCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VmaPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaPoolCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaPoolCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaPoolCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaPoolCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaPoolCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaPoolCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaPoolCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaPoolCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaPoolCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaPoolCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaPoolCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaPoolCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaPoolCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaPoolCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaPoolCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VmaPoolCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaPoolCreateInfo malloc(MemoryStack stack) {
        return wrap(VmaPoolCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaPoolCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaPoolCreateInfo calloc(MemoryStack stack) {
        return wrap(VmaPoolCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaPoolCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaPoolCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #memoryTypeIndex}. */
    public static int nmemoryTypeIndex(long struct) { return UNSAFE.getInt(null, struct + VmaPoolCreateInfo.MEMORYTYPEINDEX); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VmaPoolCreateInfo.FLAGS); }
    /** Unsafe version of {@link #blockSize}. */
    public static long nblockSize(long struct) { return UNSAFE.getLong(null, struct + VmaPoolCreateInfo.BLOCKSIZE); }
    /** Unsafe version of {@link #minBlockCount}. */
    public static long nminBlockCount(long struct) { return memGetAddress(struct + VmaPoolCreateInfo.MINBLOCKCOUNT); }
    /** Unsafe version of {@link #maxBlockCount}. */
    public static long nmaxBlockCount(long struct) { return memGetAddress(struct + VmaPoolCreateInfo.MAXBLOCKCOUNT); }
    /** Unsafe version of {@link #priority}. */
    public static float npriority(long struct) { return UNSAFE.getFloat(null, struct + VmaPoolCreateInfo.PRIORITY); }
    /** Unsafe version of {@link #minAllocationAlignment}. */
    public static long nminAllocationAlignment(long struct) { return UNSAFE.getLong(null, struct + VmaPoolCreateInfo.MINALLOCATIONALIGNMENT); }
    /** Unsafe version of {@link #pMemoryAllocateNext}. */
    public static long npMemoryAllocateNext(long struct) { return memGetAddress(struct + VmaPoolCreateInfo.PMEMORYALLOCATENEXT); }

    /** Unsafe version of {@link #memoryTypeIndex(int) memoryTypeIndex}. */
    public static void nmemoryTypeIndex(long struct, int value) { UNSAFE.putInt(null, struct + VmaPoolCreateInfo.MEMORYTYPEINDEX, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VmaPoolCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #blockSize(long) blockSize}. */
    public static void nblockSize(long struct, long value) { UNSAFE.putLong(null, struct + VmaPoolCreateInfo.BLOCKSIZE, value); }
    /** Unsafe version of {@link #minBlockCount(long) minBlockCount}. */
    public static void nminBlockCount(long struct, long value) { memPutAddress(struct + VmaPoolCreateInfo.MINBLOCKCOUNT, value); }
    /** Unsafe version of {@link #maxBlockCount(long) maxBlockCount}. */
    public static void nmaxBlockCount(long struct, long value) { memPutAddress(struct + VmaPoolCreateInfo.MAXBLOCKCOUNT, value); }
    /** Unsafe version of {@link #priority(float) priority}. */
    public static void npriority(long struct, float value) { UNSAFE.putFloat(null, struct + VmaPoolCreateInfo.PRIORITY, value); }
    /** Unsafe version of {@link #minAllocationAlignment(long) minAllocationAlignment}. */
    public static void nminAllocationAlignment(long struct, long value) { UNSAFE.putLong(null, struct + VmaPoolCreateInfo.MINALLOCATIONALIGNMENT, value); }
    /** Unsafe version of {@link #pMemoryAllocateNext(long) pMemoryAllocateNext}. */
    public static void npMemoryAllocateNext(long struct, long value) { memPutAddress(struct + VmaPoolCreateInfo.PMEMORYALLOCATENEXT, value); }

    // -----------------------------------

    /** An array of {@link VmaPoolCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VmaPoolCreateInfo, Buffer> implements NativeResource {

        private static final VmaPoolCreateInfo ELEMENT_FACTORY = VmaPoolCreateInfo.create(-1L);

        /**
         * Creates a new {@code VmaPoolCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaPoolCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VmaPoolCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VmaPoolCreateInfo#memoryTypeIndex} field. */
        @NativeType("uint32_t")
        public int memoryTypeIndex() { return VmaPoolCreateInfo.nmemoryTypeIndex(address()); }
        /** @return the value of the {@link VmaPoolCreateInfo#flags} field. */
        @NativeType("VmaPoolCreateFlags")
        public int flags() { return VmaPoolCreateInfo.nflags(address()); }
        /** @return the value of the {@link VmaPoolCreateInfo#blockSize} field. */
        @NativeType("VkDeviceSize")
        public long blockSize() { return VmaPoolCreateInfo.nblockSize(address()); }
        /** @return the value of the {@link VmaPoolCreateInfo#minBlockCount} field. */
        @NativeType("size_t")
        public long minBlockCount() { return VmaPoolCreateInfo.nminBlockCount(address()); }
        /** @return the value of the {@link VmaPoolCreateInfo#maxBlockCount} field. */
        @NativeType("size_t")
        public long maxBlockCount() { return VmaPoolCreateInfo.nmaxBlockCount(address()); }
        /** @return the value of the {@link VmaPoolCreateInfo#priority} field. */
        public float priority() { return VmaPoolCreateInfo.npriority(address()); }
        /** @return the value of the {@link VmaPoolCreateInfo#minAllocationAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minAllocationAlignment() { return VmaPoolCreateInfo.nminAllocationAlignment(address()); }
        /** @return the value of the {@link VmaPoolCreateInfo#pMemoryAllocateNext} field. */
        @NativeType("void *")
        public long pMemoryAllocateNext() { return VmaPoolCreateInfo.npMemoryAllocateNext(address()); }

        /** Sets the specified value to the {@link VmaPoolCreateInfo#memoryTypeIndex} field. */
        public VmaPoolCreateInfo.Buffer memoryTypeIndex(@NativeType("uint32_t") int value) { VmaPoolCreateInfo.nmemoryTypeIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VmaPoolCreateInfo#flags} field. */
        public VmaPoolCreateInfo.Buffer flags(@NativeType("VmaPoolCreateFlags") int value) { VmaPoolCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VmaPoolCreateInfo#blockSize} field. */
        public VmaPoolCreateInfo.Buffer blockSize(@NativeType("VkDeviceSize") long value) { VmaPoolCreateInfo.nblockSize(address(), value); return this; }
        /** Sets the specified value to the {@link VmaPoolCreateInfo#minBlockCount} field. */
        public VmaPoolCreateInfo.Buffer minBlockCount(@NativeType("size_t") long value) { VmaPoolCreateInfo.nminBlockCount(address(), value); return this; }
        /** Sets the specified value to the {@link VmaPoolCreateInfo#maxBlockCount} field. */
        public VmaPoolCreateInfo.Buffer maxBlockCount(@NativeType("size_t") long value) { VmaPoolCreateInfo.nmaxBlockCount(address(), value); return this; }
        /** Sets the specified value to the {@link VmaPoolCreateInfo#priority} field. */
        public VmaPoolCreateInfo.Buffer priority(float value) { VmaPoolCreateInfo.npriority(address(), value); return this; }
        /** Sets the specified value to the {@link VmaPoolCreateInfo#minAllocationAlignment} field. */
        public VmaPoolCreateInfo.Buffer minAllocationAlignment(@NativeType("VkDeviceSize") long value) { VmaPoolCreateInfo.nminAllocationAlignment(address(), value); return this; }
        /** Sets the specified value to the {@link VmaPoolCreateInfo#pMemoryAllocateNext} field. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(@NativeType("void *") long value) { VmaPoolCreateInfo.npMemoryAllocateNext(address(), value); return this; }
        /** Prepends the specified {@link VkDedicatedAllocationMemoryAllocateInfoNV} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkDedicatedAllocationMemoryAllocateInfoNV value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryAllocateInfo} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkExportMemoryAllocateInfo value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryAllocateInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkExportMemoryAllocateInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryAllocateInfoNV} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkExportMemoryAllocateInfoNV value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryWin32HandleInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkExportMemoryWin32HandleInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkExportMemoryWin32HandleInfoNV} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkExportMemoryWin32HandleInfoNV value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkImportMemoryFdInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkImportMemoryFdInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkImportMemoryHostPointerInfoEXT} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkImportMemoryHostPointerInfoEXT value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkImportMemoryWin32HandleInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkImportMemoryWin32HandleInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkImportMemoryWin32HandleInfoNV} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkImportMemoryWin32HandleInfoNV value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkMemoryAllocateFlagsInfo} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkMemoryAllocateFlagsInfo value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkMemoryAllocateFlagsInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkMemoryAllocateFlagsInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkMemoryDedicatedAllocateInfo} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkMemoryDedicatedAllocateInfo value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkMemoryDedicatedAllocateInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkMemoryDedicatedAllocateInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkMemoryOpaqueCaptureAddressAllocateInfo} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkMemoryOpaqueCaptureAddressAllocateInfo value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkMemoryOpaqueCaptureAddressAllocateInfoKHR value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }
        /** Prepends the specified {@link VkMemoryPriorityAllocateInfoEXT} value to the {@code pMemoryAllocateNext} chain. */
        public VmaPoolCreateInfo.Buffer pMemoryAllocateNext(VkMemoryPriorityAllocateInfoEXT value) { return this.pMemoryAllocateNext(value.pNext(this.pMemoryAllocateNext()).address()); }

    }

}