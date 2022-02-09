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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * Parameters for defragmentation.
 * 
 * <p>To be used with function {@link Vma#vmaDefragmentationBegin DefragmentationBegin}.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaDefragmentationInfo2 {
 *     VmaDefragmentationFlags {@link #flags};
 *     uint32_t {@link #allocationCount};
 *     VmaAllocation * {@link #pAllocations};
 *     VkBool32 * {@link #pAllocationsChanged};
 *     uint32_t {@link #poolCount};
 *     VmaPool const * {@link #pPools};
 *     VkDeviceSize {@link #maxCpuBytesToMove};
 *     uint32_t {@link #maxCpuAllocationsToMove};
 *     VkDeviceSize {@link #maxGpuBytesToMove};
 *     uint32_t {@link #maxGpuAllocationsToMove};
 *     VkCommandBuffer {@link #commandBuffer};
 * }</code></pre>
 */
public class VmaDefragmentationInfo2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        ALLOCATIONCOUNT,
        PALLOCATIONS,
        PALLOCATIONSCHANGED,
        POOLCOUNT,
        PPOOLS,
        MAXCPUBYTESTOMOVE,
        MAXCPUALLOCATIONSTOMOVE,
        MAXGPUBYTESTOMOVE,
        MAXGPUALLOCATIONSTOMOVE,
        COMMANDBUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        ALLOCATIONCOUNT = layout.offsetof(1);
        PALLOCATIONS = layout.offsetof(2);
        PALLOCATIONSCHANGED = layout.offsetof(3);
        POOLCOUNT = layout.offsetof(4);
        PPOOLS = layout.offsetof(5);
        MAXCPUBYTESTOMOVE = layout.offsetof(6);
        MAXCPUALLOCATIONSTOMOVE = layout.offsetof(7);
        MAXGPUBYTESTOMOVE = layout.offsetof(8);
        MAXGPUALLOCATIONSTOMOVE = layout.offsetof(9);
        COMMANDBUFFER = layout.offsetof(10);
    }

    /**
     * Creates a {@code VmaDefragmentationInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaDefragmentationInfo2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** reserved for future use. Should be 0. */
    @NativeType("VmaDefragmentationFlags")
    public int flags() { return nflags(address()); }
    /** number of allocations in {@code pAllocations} array */
    @NativeType("uint32_t")
    public int allocationCount() { return nallocationCount(address()); }
    /**
     * pointer to array of allocations that can be defragmented.
     * 
     * <p>The array should have {@code allocationCount} elements. The array should not contain nulls. Elements in the array should be unique - same allocation
     * cannot occur twice. All allocations not present in this array are considered non-moveable during this defragmentation.</p>
     */
    @NativeType("VmaAllocation *")
    public PointerBuffer pAllocations() { return npAllocations(address()); }
    /**
     * Optional, output. Pointer to array that will be filled with information whether the allocation at certain index has been changed during defragmentation.
     * 
     * <p>The array should have {@code allocationCount} elements. You can pass null if you are not interested in this information.</p>
     */
    @Nullable
    @NativeType("VkBool32 *")
    public IntBuffer pAllocationsChanged() { return npAllocationsChanged(address()); }
    /** number of pools in {@code pPools} array */
    @NativeType("uint32_t")
    public int poolCount() { return npoolCount(address()); }
    /**
     * Either null or pointer to array of pools to be defragmented.
     * 
     * <p>All the allocations in the specified pools can be moved during defragmentation and there is no way to check if they were really moved as in
     * {@code pAllocationsChanged}, so you must query all the allocations in all these pools for new {@code VkDeviceMemory} and offset using
     * {@link Vma#vmaGetAllocationInfo GetAllocationInfo} if you might need to recreate buffers and images bound to them.</p>
     * 
     * <p>The array should have {@code poolCount} elements. The array should not contain nulls. Elements in the array should be unique - same pool cannot occur
     * twice.</p>
     * 
     * <p>Using this array is equivalent to specifying all allocations from the pools in {@code pAllocations}. It might be more efficient.</p>
     */
    @Nullable
    @NativeType("VmaPool const *")
    public PointerBuffer pPools() { return npPools(address()); }
    /**
     * maximum total numbers of bytes that can be copied while moving allocations to different places using transfers on CPU side, like {@code memcpy()},
     * {@code memmove()}.
     * 
     * <p>{@code VK_WHOLE_SIZE} means no limit.</p>
     */
    @NativeType("VkDeviceSize")
    public long maxCpuBytesToMove() { return nmaxCpuBytesToMove(address()); }
    /**
     * maximum number of allocations that can be moved to a different place using transfers on CPU side, like {@code memcpy()}, {@code memmove()}.
     * 
     * <p>{@code UINT32_MAX} means no limit.</p>
     */
    @NativeType("uint32_t")
    public int maxCpuAllocationsToMove() { return nmaxCpuAllocationsToMove(address()); }
    /**
     * maximum total numbers of bytes that can be copied while moving allocations to different places using transfers on GPU side, posted to
     * {@code commandBuffer}.
     * 
     * <p>{@code VK_WHOLE_SIZE} means no limit.</p>
     */
    @NativeType("VkDeviceSize")
    public long maxGpuBytesToMove() { return nmaxGpuBytesToMove(address()); }
    /**
     * maximum number of allocations that can be moved to a different place using transfers on GPU side, posted to {@code commandBuffer}.
     * 
     * <p>{@code UINT32_MAX} means no limit.</p>
     */
    @NativeType("uint32_t")
    public int maxGpuAllocationsToMove() { return nmaxGpuAllocationsToMove(address()); }
    /**
     * command buffer where GPU copy commands will be posted. Optional.
     * 
     * <p>If not null, it must be a valid command buffer handle that supports Transfer queue type. It must be in the recording state and outside of a render pass
     * instance. You need to submit it and make sure it finished execution before calling {@link Vma#vmaDefragmentationEnd DefragmentationEnd}.</p>
     * 
     * <p>Passing null means that only CPU defragmentation will be performed.</p>
     */
    @Nullable
    @NativeType("VkCommandBuffer")
    public long commandBuffer() { return ncommandBuffer(address()); }

    /** Sets the specified value to the {@link #flags} field. */
    public VmaDefragmentationInfo2 flags(@NativeType("VmaDefragmentationFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #allocationCount} field. */
    public VmaDefragmentationInfo2 allocationCount(@NativeType("uint32_t") int value) { nallocationCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #pAllocations} field. */
    public VmaDefragmentationInfo2 pAllocations(@NativeType("VmaAllocation *") PointerBuffer value) { npAllocations(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pAllocationsChanged} field. */
    public VmaDefragmentationInfo2 pAllocationsChanged(@Nullable @NativeType("VkBool32 *") IntBuffer value) { npAllocationsChanged(address(), value); return this; }
    /** Sets the specified value to the {@link #poolCount} field. */
    public VmaDefragmentationInfo2 poolCount(@NativeType("uint32_t") int value) { npoolCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #pPools} field. */
    public VmaDefragmentationInfo2 pPools(@Nullable @NativeType("VmaPool const *") PointerBuffer value) { npPools(address(), value); return this; }
    /** Sets the specified value to the {@link #maxCpuBytesToMove} field. */
    public VmaDefragmentationInfo2 maxCpuBytesToMove(@NativeType("VkDeviceSize") long value) { nmaxCpuBytesToMove(address(), value); return this; }
    /** Sets the specified value to the {@link #maxCpuAllocationsToMove} field. */
    public VmaDefragmentationInfo2 maxCpuAllocationsToMove(@NativeType("uint32_t") int value) { nmaxCpuAllocationsToMove(address(), value); return this; }
    /** Sets the specified value to the {@link #maxGpuBytesToMove} field. */
    public VmaDefragmentationInfo2 maxGpuBytesToMove(@NativeType("VkDeviceSize") long value) { nmaxGpuBytesToMove(address(), value); return this; }
    /** Sets the specified value to the {@link #maxGpuAllocationsToMove} field. */
    public VmaDefragmentationInfo2 maxGpuAllocationsToMove(@NativeType("uint32_t") int value) { nmaxGpuAllocationsToMove(address(), value); return this; }
    /** Sets the specified value to the {@link #commandBuffer} field. */
    public VmaDefragmentationInfo2 commandBuffer(@Nullable VkCommandBuffer value) { ncommandBuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaDefragmentationInfo2 set(
        int flags,
        int allocationCount,
        PointerBuffer pAllocations,
        @Nullable IntBuffer pAllocationsChanged,
        int poolCount,
        @Nullable PointerBuffer pPools,
        long maxCpuBytesToMove,
        int maxCpuAllocationsToMove,
        long maxGpuBytesToMove,
        int maxGpuAllocationsToMove,
        @Nullable VkCommandBuffer commandBuffer
    ) {
        flags(flags);
        allocationCount(allocationCount);
        pAllocations(pAllocations);
        pAllocationsChanged(pAllocationsChanged);
        poolCount(poolCount);
        pPools(pPools);
        maxCpuBytesToMove(maxCpuBytesToMove);
        maxCpuAllocationsToMove(maxCpuAllocationsToMove);
        maxGpuBytesToMove(maxGpuBytesToMove);
        maxGpuAllocationsToMove(maxGpuAllocationsToMove);
        commandBuffer(commandBuffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaDefragmentationInfo2 set(VmaDefragmentationInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaDefragmentationInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationInfo2 malloc() {
        return wrap(VmaDefragmentationInfo2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaDefragmentationInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationInfo2 calloc() {
        return wrap(VmaDefragmentationInfo2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaDefragmentationInfo2} instance allocated with {@link BufferUtils}. */
    public static VmaDefragmentationInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaDefragmentationInfo2.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaDefragmentationInfo2} instance for the specified memory address. */
    public static VmaDefragmentationInfo2 create(long address) {
        return wrap(VmaDefragmentationInfo2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationInfo2 createSafe(long address) {
        return address == NULL ? null : wrap(VmaDefragmentationInfo2.class, address);
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaDefragmentationInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationInfo2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VmaDefragmentationInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationInfo2 malloc(MemoryStack stack) {
        return wrap(VmaDefragmentationInfo2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaDefragmentationInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationInfo2 calloc(MemoryStack stack) {
        return wrap(VmaDefragmentationInfo2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VmaDefragmentationInfo2.FLAGS); }
    /** Unsafe version of {@link #allocationCount}. */
    public static int nallocationCount(long struct) { return UNSAFE.getInt(null, struct + VmaDefragmentationInfo2.ALLOCATIONCOUNT); }
    /** Unsafe version of {@link #pAllocations() pAllocations}. */
    public static PointerBuffer npAllocations(long struct) { return memPointerBuffer(memGetAddress(struct + VmaDefragmentationInfo2.PALLOCATIONS), nallocationCount(struct)); }
    /** Unsafe version of {@link #pAllocationsChanged() pAllocationsChanged}. */
    @Nullable public static IntBuffer npAllocationsChanged(long struct) { return memIntBufferSafe(memGetAddress(struct + VmaDefragmentationInfo2.PALLOCATIONSCHANGED), nallocationCount(struct)); }
    /** Unsafe version of {@link #poolCount}. */
    public static int npoolCount(long struct) { return UNSAFE.getInt(null, struct + VmaDefragmentationInfo2.POOLCOUNT); }
    /** Unsafe version of {@link #pPools() pPools}. */
    @Nullable public static PointerBuffer npPools(long struct) { return memPointerBufferSafe(memGetAddress(struct + VmaDefragmentationInfo2.PPOOLS), npoolCount(struct)); }
    /** Unsafe version of {@link #maxCpuBytesToMove}. */
    public static long nmaxCpuBytesToMove(long struct) { return UNSAFE.getLong(null, struct + VmaDefragmentationInfo2.MAXCPUBYTESTOMOVE); }
    /** Unsafe version of {@link #maxCpuAllocationsToMove}. */
    public static int nmaxCpuAllocationsToMove(long struct) { return UNSAFE.getInt(null, struct + VmaDefragmentationInfo2.MAXCPUALLOCATIONSTOMOVE); }
    /** Unsafe version of {@link #maxGpuBytesToMove}. */
    public static long nmaxGpuBytesToMove(long struct) { return UNSAFE.getLong(null, struct + VmaDefragmentationInfo2.MAXGPUBYTESTOMOVE); }
    /** Unsafe version of {@link #maxGpuAllocationsToMove}. */
    public static int nmaxGpuAllocationsToMove(long struct) { return UNSAFE.getInt(null, struct + VmaDefragmentationInfo2.MAXGPUALLOCATIONSTOMOVE); }
    /** Unsafe version of {@link #commandBuffer}. */
    public static long ncommandBuffer(long struct) { return memGetAddress(struct + VmaDefragmentationInfo2.COMMANDBUFFER); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VmaDefragmentationInfo2.FLAGS, value); }
    /** Sets the specified value to the {@code allocationCount} field of the specified {@code struct}. */
    public static void nallocationCount(long struct, int value) { UNSAFE.putInt(null, struct + VmaDefragmentationInfo2.ALLOCATIONCOUNT, value); }
    /** Unsafe version of {@link #pAllocations(PointerBuffer) pAllocations}. */
    public static void npAllocations(long struct, PointerBuffer value) { memPutAddress(struct + VmaDefragmentationInfo2.PALLOCATIONS, memAddress(value)); }
    /** Unsafe version of {@link #pAllocationsChanged(IntBuffer) pAllocationsChanged}. */
    public static void npAllocationsChanged(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VmaDefragmentationInfo2.PALLOCATIONSCHANGED, memAddressSafe(value)); }
    /** Sets the specified value to the {@code poolCount} field of the specified {@code struct}. */
    public static void npoolCount(long struct, int value) { UNSAFE.putInt(null, struct + VmaDefragmentationInfo2.POOLCOUNT, value); }
    /** Unsafe version of {@link #pPools(PointerBuffer) pPools}. */
    public static void npPools(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VmaDefragmentationInfo2.PPOOLS, memAddressSafe(value)); npoolCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #maxCpuBytesToMove(long) maxCpuBytesToMove}. */
    public static void nmaxCpuBytesToMove(long struct, long value) { UNSAFE.putLong(null, struct + VmaDefragmentationInfo2.MAXCPUBYTESTOMOVE, value); }
    /** Unsafe version of {@link #maxCpuAllocationsToMove(int) maxCpuAllocationsToMove}. */
    public static void nmaxCpuAllocationsToMove(long struct, int value) { UNSAFE.putInt(null, struct + VmaDefragmentationInfo2.MAXCPUALLOCATIONSTOMOVE, value); }
    /** Unsafe version of {@link #maxGpuBytesToMove(long) maxGpuBytesToMove}. */
    public static void nmaxGpuBytesToMove(long struct, long value) { UNSAFE.putLong(null, struct + VmaDefragmentationInfo2.MAXGPUBYTESTOMOVE, value); }
    /** Unsafe version of {@link #maxGpuAllocationsToMove(int) maxGpuAllocationsToMove}. */
    public static void nmaxGpuAllocationsToMove(long struct, int value) { UNSAFE.putInt(null, struct + VmaDefragmentationInfo2.MAXGPUALLOCATIONSTOMOVE, value); }
    /** Unsafe version of {@link #commandBuffer(VkCommandBuffer) commandBuffer}. */
    public static void ncommandBuffer(long struct, @Nullable VkCommandBuffer value) { memPutAddress(struct + VmaDefragmentationInfo2.COMMANDBUFFER, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VmaDefragmentationInfo2.PALLOCATIONS));
    }

    // -----------------------------------

    /** An array of {@link VmaDefragmentationInfo2} structs. */
    public static class Buffer extends StructBuffer<VmaDefragmentationInfo2, Buffer> implements NativeResource {

        private static final VmaDefragmentationInfo2 ELEMENT_FACTORY = VmaDefragmentationInfo2.create(-1L);

        /**
         * Creates a new {@code VmaDefragmentationInfo2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaDefragmentationInfo2#SIZEOF}, and its mark will be undefined.
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
        protected VmaDefragmentationInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VmaDefragmentationInfo2#flags} field. */
        @NativeType("VmaDefragmentationFlags")
        public int flags() { return VmaDefragmentationInfo2.nflags(address()); }
        /** @return the value of the {@link VmaDefragmentationInfo2#allocationCount} field. */
        @NativeType("uint32_t")
        public int allocationCount() { return VmaDefragmentationInfo2.nallocationCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link VmaDefragmentationInfo2#pAllocations} field. */
        @NativeType("VmaAllocation *")
        public PointerBuffer pAllocations() { return VmaDefragmentationInfo2.npAllocations(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VmaDefragmentationInfo2#pAllocationsChanged} field. */
        @Nullable
        @NativeType("VkBool32 *")
        public IntBuffer pAllocationsChanged() { return VmaDefragmentationInfo2.npAllocationsChanged(address()); }
        /** @return the value of the {@link VmaDefragmentationInfo2#poolCount} field. */
        @NativeType("uint32_t")
        public int poolCount() { return VmaDefragmentationInfo2.npoolCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link VmaDefragmentationInfo2#pPools} field. */
        @Nullable
        @NativeType("VmaPool const *")
        public PointerBuffer pPools() { return VmaDefragmentationInfo2.npPools(address()); }
        /** @return the value of the {@link VmaDefragmentationInfo2#maxCpuBytesToMove} field. */
        @NativeType("VkDeviceSize")
        public long maxCpuBytesToMove() { return VmaDefragmentationInfo2.nmaxCpuBytesToMove(address()); }
        /** @return the value of the {@link VmaDefragmentationInfo2#maxCpuAllocationsToMove} field. */
        @NativeType("uint32_t")
        public int maxCpuAllocationsToMove() { return VmaDefragmentationInfo2.nmaxCpuAllocationsToMove(address()); }
        /** @return the value of the {@link VmaDefragmentationInfo2#maxGpuBytesToMove} field. */
        @NativeType("VkDeviceSize")
        public long maxGpuBytesToMove() { return VmaDefragmentationInfo2.nmaxGpuBytesToMove(address()); }
        /** @return the value of the {@link VmaDefragmentationInfo2#maxGpuAllocationsToMove} field. */
        @NativeType("uint32_t")
        public int maxGpuAllocationsToMove() { return VmaDefragmentationInfo2.nmaxGpuAllocationsToMove(address()); }
        /** @return the value of the {@link VmaDefragmentationInfo2#commandBuffer} field. */
        @Nullable
        @NativeType("VkCommandBuffer")
        public long commandBuffer() { return VmaDefragmentationInfo2.ncommandBuffer(address()); }

        /** Sets the specified value to the {@link VmaDefragmentationInfo2#flags} field. */
        public VmaDefragmentationInfo2.Buffer flags(@NativeType("VmaDefragmentationFlags") int value) { VmaDefragmentationInfo2.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VmaDefragmentationInfo2#allocationCount} field. */
        public VmaDefragmentationInfo2.Buffer allocationCount(@NativeType("uint32_t") int value) { VmaDefragmentationInfo2.nallocationCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VmaDefragmentationInfo2#pAllocations} field. */
        public VmaDefragmentationInfo2.Buffer pAllocations(@NativeType("VmaAllocation *") PointerBuffer value) { VmaDefragmentationInfo2.npAllocations(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VmaDefragmentationInfo2#pAllocationsChanged} field. */
        public VmaDefragmentationInfo2.Buffer pAllocationsChanged(@Nullable @NativeType("VkBool32 *") IntBuffer value) { VmaDefragmentationInfo2.npAllocationsChanged(address(), value); return this; }
        /** Sets the specified value to the {@link VmaDefragmentationInfo2#poolCount} field. */
        public VmaDefragmentationInfo2.Buffer poolCount(@NativeType("uint32_t") int value) { VmaDefragmentationInfo2.npoolCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VmaDefragmentationInfo2#pPools} field. */
        public VmaDefragmentationInfo2.Buffer pPools(@Nullable @NativeType("VmaPool const *") PointerBuffer value) { VmaDefragmentationInfo2.npPools(address(), value); return this; }
        /** Sets the specified value to the {@link VmaDefragmentationInfo2#maxCpuBytesToMove} field. */
        public VmaDefragmentationInfo2.Buffer maxCpuBytesToMove(@NativeType("VkDeviceSize") long value) { VmaDefragmentationInfo2.nmaxCpuBytesToMove(address(), value); return this; }
        /** Sets the specified value to the {@link VmaDefragmentationInfo2#maxCpuAllocationsToMove} field. */
        public VmaDefragmentationInfo2.Buffer maxCpuAllocationsToMove(@NativeType("uint32_t") int value) { VmaDefragmentationInfo2.nmaxCpuAllocationsToMove(address(), value); return this; }
        /** Sets the specified value to the {@link VmaDefragmentationInfo2#maxGpuBytesToMove} field. */
        public VmaDefragmentationInfo2.Buffer maxGpuBytesToMove(@NativeType("VkDeviceSize") long value) { VmaDefragmentationInfo2.nmaxGpuBytesToMove(address(), value); return this; }
        /** Sets the specified value to the {@link VmaDefragmentationInfo2#maxGpuAllocationsToMove} field. */
        public VmaDefragmentationInfo2.Buffer maxGpuAllocationsToMove(@NativeType("uint32_t") int value) { VmaDefragmentationInfo2.nmaxGpuAllocationsToMove(address(), value); return this; }
        /** Sets the specified value to the {@link VmaDefragmentationInfo2#commandBuffer} field. */
        public VmaDefragmentationInfo2.Buffer commandBuffer(@Nullable VkCommandBuffer value) { VmaDefragmentationInfo2.ncommandBuffer(address(), value); return this; }

    }

}