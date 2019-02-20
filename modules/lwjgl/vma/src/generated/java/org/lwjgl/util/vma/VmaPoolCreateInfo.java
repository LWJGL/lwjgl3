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
 * Describes parameter of created {@code VmaPool}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code memoryTypeIndex} &ndash; Vulkan memory type index to allocate this pool from</li>
 * <li>{@code flags} &ndash; Use combination of {@code VmaPoolCreateFlagBits}. One or more of:<br><table><tr><td>{@link Vma#VMA_POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT}</td><td>{@link Vma#VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT POOL_CREATE_LINEAR_ALGORITHM_BIT}</td></tr><tr><td>{@link Vma#VMA_POOL_CREATE_BUDDY_ALGORITHM_BIT POOL_CREATE_BUDDY_ALGORITHM_BIT}</td><td>{@link Vma#VMA_POOL_CREATE_ALGORITHM_MASK POOL_CREATE_ALGORITHM_MASK}</td></tr></table></li>
 * <li>{@code blockSize} &ndash; 
 * size of a single {@code VkDeviceMemory} block to be allocated as part of this pool, in bytes. Optional.
 * 
 * <p>Specify nonzero to set explicit, constant size of memory blocks used by this pool. Leave 0 to use default and let the library manage block sizes
 * automatically. Sizes of particular blocks may vary.</p></li>
 * <li>{@code minBlockCount} &ndash; 
 * minimum number of blocks to be always allocated in this pool, even if they stay empty.
 * 
 * <p>Set to 0 to have no preallocated blocks and allow the pool be completely empty.</p></li>
 * <li>{@code maxBlockCount} &ndash; 
 * maximum number of blocks that can be allocated in this pool. Optional.
 * 
 * <p>Set to 0 to use default, which is {@code SIZE_MAX}, which means no limit. Set to same value as {@link VmaPoolCreateInfo}{@code ::minBlockCount} to have fixed
 * amount of memory allocated throughout whole lifetime of this pool.</p></li>
 * <li>{@code frameInUseCount} &ndash; 
 * maximum number of additional frames that are in use at the same time as current frame.
 * 
 * <p>This value is used only when you make allocations with {@link Vma#VMA_ALLOCATION_CREATE_CAN_BECOME_LOST_BIT ALLOCATION_CREATE_CAN_BECOME_LOST_BIT} flag. Such allocation cannot become  lost if
 * {@code allocation.lastUseFrameIndex >= allocator.currentFrameIndex - frameInUseCount}.</p>
 * 
 * <p>For example, if you double-buffer your command buffers, so resources used for rendering in previous frame may still be in use by the GPU at the moment
 * you allocate resources needed for the current frame, set this value to 1.</p>
 * 
 * <p>If you want to allow any allocations other than used in the current frame to become lost, set this value to 0.</p></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaPoolCreateInfo {
 *     uint32_t memoryTypeIndex;
 *     VmaPoolCreateFlags flags;
 *     VkDeviceSize blockSize;
 *     size_t minBlockCount;
 *     size_t maxBlockCount;
 *     uint32_t frameInUseCount;
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
        FRAMEINUSECOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEMORYTYPEINDEX = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        BLOCKSIZE = layout.offsetof(2);
        MINBLOCKCOUNT = layout.offsetof(3);
        MAXBLOCKCOUNT = layout.offsetof(4);
        FRAMEINUSECOUNT = layout.offsetof(5);
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

    /** Returns the value of the {@code memoryTypeIndex} field. */
    @NativeType("uint32_t")
    public int memoryTypeIndex() { return nmemoryTypeIndex(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VmaPoolCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code blockSize} field. */
    @NativeType("VkDeviceSize")
    public long blockSize() { return nblockSize(address()); }
    /** Returns the value of the {@code minBlockCount} field. */
    @NativeType("size_t")
    public long minBlockCount() { return nminBlockCount(address()); }
    /** Returns the value of the {@code maxBlockCount} field. */
    @NativeType("size_t")
    public long maxBlockCount() { return nmaxBlockCount(address()); }
    /** Returns the value of the {@code frameInUseCount} field. */
    @NativeType("uint32_t")
    public int frameInUseCount() { return nframeInUseCount(address()); }

    /** Sets the specified value to the {@code memoryTypeIndex} field. */
    public VmaPoolCreateInfo memoryTypeIndex(@NativeType("uint32_t") int value) { nmemoryTypeIndex(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VmaPoolCreateInfo flags(@NativeType("VmaPoolCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code blockSize} field. */
    public VmaPoolCreateInfo blockSize(@NativeType("VkDeviceSize") long value) { nblockSize(address(), value); return this; }
    /** Sets the specified value to the {@code minBlockCount} field. */
    public VmaPoolCreateInfo minBlockCount(@NativeType("size_t") long value) { nminBlockCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxBlockCount} field. */
    public VmaPoolCreateInfo maxBlockCount(@NativeType("size_t") long value) { nmaxBlockCount(address(), value); return this; }
    /** Sets the specified value to the {@code frameInUseCount} field. */
    public VmaPoolCreateInfo frameInUseCount(@NativeType("uint32_t") int value) { nframeInUseCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaPoolCreateInfo set(
        int memoryTypeIndex,
        int flags,
        long blockSize,
        long minBlockCount,
        long maxBlockCount,
        int frameInUseCount
    ) {
        memoryTypeIndex(memoryTypeIndex);
        flags(flags);
        blockSize(blockSize);
        minBlockCount(minBlockCount);
        maxBlockCount(maxBlockCount);
        frameInUseCount(frameInUseCount);

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

    /** Returns a new {@code VmaPoolCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VmaPoolCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VmaPoolCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VmaPoolCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VmaPoolCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaPoolCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VmaPoolCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaPoolCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaPoolCreateInfo callocStack(MemoryStack stack) {
        return wrap(VmaPoolCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaPoolCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaPoolCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaPoolCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VmaPoolCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaPoolCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaPoolCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
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
    /** Unsafe version of {@link #frameInUseCount}. */
    public static int nframeInUseCount(long struct) { return UNSAFE.getInt(null, struct + VmaPoolCreateInfo.FRAMEINUSECOUNT); }

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
    /** Unsafe version of {@link #frameInUseCount(int) frameInUseCount}. */
    public static void nframeInUseCount(long struct, int value) { UNSAFE.putInt(null, struct + VmaPoolCreateInfo.FRAMEINUSECOUNT, value); }

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

        /** Returns the value of the {@code memoryTypeIndex} field. */
        @NativeType("uint32_t")
        public int memoryTypeIndex() { return VmaPoolCreateInfo.nmemoryTypeIndex(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VmaPoolCreateFlags")
        public int flags() { return VmaPoolCreateInfo.nflags(address()); }
        /** Returns the value of the {@code blockSize} field. */
        @NativeType("VkDeviceSize")
        public long blockSize() { return VmaPoolCreateInfo.nblockSize(address()); }
        /** Returns the value of the {@code minBlockCount} field. */
        @NativeType("size_t")
        public long minBlockCount() { return VmaPoolCreateInfo.nminBlockCount(address()); }
        /** Returns the value of the {@code maxBlockCount} field. */
        @NativeType("size_t")
        public long maxBlockCount() { return VmaPoolCreateInfo.nmaxBlockCount(address()); }
        /** Returns the value of the {@code frameInUseCount} field. */
        @NativeType("uint32_t")
        public int frameInUseCount() { return VmaPoolCreateInfo.nframeInUseCount(address()); }

        /** Sets the specified value to the {@code memoryTypeIndex} field. */
        public VmaPoolCreateInfo.Buffer memoryTypeIndex(@NativeType("uint32_t") int value) { VmaPoolCreateInfo.nmemoryTypeIndex(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VmaPoolCreateInfo.Buffer flags(@NativeType("VmaPoolCreateFlags") int value) { VmaPoolCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code blockSize} field. */
        public VmaPoolCreateInfo.Buffer blockSize(@NativeType("VkDeviceSize") long value) { VmaPoolCreateInfo.nblockSize(address(), value); return this; }
        /** Sets the specified value to the {@code minBlockCount} field. */
        public VmaPoolCreateInfo.Buffer minBlockCount(@NativeType("size_t") long value) { VmaPoolCreateInfo.nminBlockCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxBlockCount} field. */
        public VmaPoolCreateInfo.Buffer maxBlockCount(@NativeType("size_t") long value) { VmaPoolCreateInfo.nmaxBlockCount(address(), value); return this; }
        /** Sets the specified value to the {@code frameInUseCount} field. */
        public VmaPoolCreateInfo.Buffer frameInUseCount(@NativeType("uint32_t") int value) { VmaPoolCreateInfo.nframeInUseCount(address(), value); return this; }

    }

}