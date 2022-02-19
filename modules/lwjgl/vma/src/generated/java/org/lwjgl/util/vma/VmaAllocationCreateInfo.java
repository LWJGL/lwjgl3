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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaAllocationCreateInfo {
 *     VmaAllocationCreateFlags {@link #flags};
 *     VmaMemoryUsage {@link #usage};
 *     VkMemoryPropertyFlags {@link #requiredFlags};
 *     VkMemoryPropertyFlags {@link #preferredFlags};
 *     uint32_t {@link #memoryTypeBits};
 *     VmaPool {@link #pool};
 *     void * {@link #pUserData};
 *     float {@link #priority};
 * }</code></pre>
 */
public class VmaAllocationCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        USAGE,
        REQUIREDFLAGS,
        PREFERREDFLAGS,
        MEMORYTYPEBITS,
        POOL,
        PUSERDATA,
        PRIORITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        USAGE = layout.offsetof(1);
        REQUIREDFLAGS = layout.offsetof(2);
        PREFERREDFLAGS = layout.offsetof(3);
        MEMORYTYPEBITS = layout.offsetof(4);
        POOL = layout.offsetof(5);
        PUSERDATA = layout.offsetof(6);
        PRIORITY = layout.offsetof(7);
    }

    /**
     * Creates a {@code VmaAllocationCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaAllocationCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** use {@code VmaAllocationCreateFlagBits} enum. One or more of:<br><table><tr><td>{@link Vma#VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT}</td><td>{@link Vma#VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT ALLOCATION_CREATE_NEVER_ALLOCATE_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATION_CREATE_MAPPED_BIT ALLOCATION_CREATE_MAPPED_BIT}</td><td>{@link Vma#VMA_ALLOCATION_CREATE_RESERVED_1_BIT ALLOCATION_CREATE_RESERVED_1_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATION_CREATE_RESERVED_2_BIT ALLOCATION_CREATE_RESERVED_2_BIT}</td><td>{@link Vma#VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT ALLOCATION_CREATE_UPPER_ADDRESS_BIT}</td><td>{@link Vma#VMA_ALLOCATION_CREATE_DONT_BIND_BIT ALLOCATION_CREATE_DONT_BIND_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT ALLOCATION_CREATE_WITHIN_BUDGET_BIT}</td><td>{@link Vma#VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT ALLOCATION_CREATE_CAN_ALIAS_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT}</td><td>{@link Vma#VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT}</td><td>{@link Vma#VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT}</td><td>{@link Vma#VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATION_CREATE_STRATEGY_MASK ALLOCATION_CREATE_STRATEGY_MASK}</td></tr></table> */
    @NativeType("VmaAllocationCreateFlags")
    public int flags() { return nflags(address()); }
    /**
     * intended usage of memory.
     * 
     * <p>You can leave {@link Vma#VMA_MEMORY_USAGE_UNKNOWN MEMORY_USAGE_UNKNOWN} if you specify memory requirements in other way. If {@code pool} is not null, this member is ignored. One of:<br></p><table><tr><td>{@link Vma#VMA_MEMORY_USAGE_UNKNOWN MEMORY_USAGE_UNKNOWN}</td><td>{@link Vma#VMA_MEMORY_USAGE_GPU_ONLY MEMORY_USAGE_GPU_ONLY}</td><td>{@link Vma#VMA_MEMORY_USAGE_CPU_ONLY MEMORY_USAGE_CPU_ONLY}</td></tr><tr><td>{@link Vma#VMA_MEMORY_USAGE_CPU_TO_GPU MEMORY_USAGE_CPU_TO_GPU}</td><td>{@link Vma#VMA_MEMORY_USAGE_GPU_TO_CPU MEMORY_USAGE_GPU_TO_CPU}</td><td>{@link Vma#VMA_MEMORY_USAGE_CPU_COPY MEMORY_USAGE_CPU_COPY}</td></tr><tr><td>{@link Vma#VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED MEMORY_USAGE_GPU_LAZILY_ALLOCATED}</td><td>{@link Vma#VMA_MEMORY_USAGE_AUTO MEMORY_USAGE_AUTO}</td><td>{@link Vma#VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE MEMORY_USAGE_AUTO_PREFER_DEVICE}</td></tr><tr><td>{@link Vma#VMA_MEMORY_USAGE_AUTO_PREFER_HOST MEMORY_USAGE_AUTO_PREFER_HOST}</td></tr></table>
     */
    @NativeType("VmaMemoryUsage")
    public int usage() { return nusage(address()); }
    /**
     * flags that must be set in a Memory Type chosen for an allocation.
     * 
     * <p>Leave 0 if you specify memory requirements in other way. If {@code pool} is not null, this member is ignored.</p>
     */
    @NativeType("VkMemoryPropertyFlags")
    public int requiredFlags() { return nrequiredFlags(address()); }
    /**
     * flags that preferably should be set in a memory type chosen for an allocation.
     * 
     * <p>Set to 0 if no additional flags are preferred. If {@code pool} is not null, this member is ignored.</p>
     */
    @NativeType("VkMemoryPropertyFlags")
    public int preferredFlags() { return npreferredFlags(address()); }
    /**
     * bitmask containing one bit set for every memory type acceptable for this allocation.
     * 
     * <p>Value 0 is equivalent to {@code UINT32_MAX} - it means any memory type is accepted if it meets other requirements specified by this structure, with no
     * further restrictions on memory type index. If {@code pool} is not null, this member is ignored.</p>
     */
    @NativeType("uint32_t")
    public int memoryTypeBits() { return nmemoryTypeBits(address()); }
    /**
     * pool that this allocation should be created in.
     * 
     * <p>Leave {@code VK_NULL_HANDLE} to allocate from default pool. If not null, members: {@code usage}, {@code requiredFlags}, {@code preferredFlags},
     * {@code memoryTypeBits} are ignored.</p>
     */
    @NativeType("VmaPool")
    public long pool() { return npool(address()); }
    /**
     * custom general-purpose pointer that will be stored in {@code VmaAllocation}, can be read as {@link VmaAllocationInfo}{@code ::pUserData} and changed using
     * {@link Vma#vmaSetAllocationUserData SetAllocationUserData}.
     * 
     * <p>If {@link Vma#VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT} is used, it must be either null or pointer to a null-terminated string. The string will be then copied
     * to internal buffer, so it doesn't need to be valid after allocation call.</p>
     */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }
    /**
     * A floating-point value between 0 and 1, indicating the priority of the allocation relative to other memory allocations.
     * 
     * <p>It is used only when {@link Vma#VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT} flag was used during creation of the {@code VmaAllocator} object and this allocation
     * ends up as dedicated or is explicitly forced as dedicated using {@link Vma#VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ALLOCATION_CREATE_DEDICATED_MEMORY_BIT}. Otherwise, it has the priority of a memory
     * block where it is placed and this variable is ignored.</p>
     */
    public float priority() { return npriority(address()); }

    /** Sets the specified value to the {@link #flags} field. */
    public VmaAllocationCreateInfo flags(@NativeType("VmaAllocationCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #usage} field. */
    public VmaAllocationCreateInfo usage(@NativeType("VmaMemoryUsage") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@link #requiredFlags} field. */
    public VmaAllocationCreateInfo requiredFlags(@NativeType("VkMemoryPropertyFlags") int value) { nrequiredFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #preferredFlags} field. */
    public VmaAllocationCreateInfo preferredFlags(@NativeType("VkMemoryPropertyFlags") int value) { npreferredFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryTypeBits} field. */
    public VmaAllocationCreateInfo memoryTypeBits(@NativeType("uint32_t") int value) { nmemoryTypeBits(address(), value); return this; }
    /** Sets the specified value to the {@link #pool} field. */
    public VmaAllocationCreateInfo pool(@NativeType("VmaPool") long value) { npool(address(), value); return this; }
    /** Sets the specified value to the {@link #pUserData} field. */
    public VmaAllocationCreateInfo pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }
    /** Sets the specified value to the {@link #priority} field. */
    public VmaAllocationCreateInfo priority(float value) { npriority(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaAllocationCreateInfo set(
        int flags,
        int usage,
        int requiredFlags,
        int preferredFlags,
        int memoryTypeBits,
        long pool,
        long pUserData,
        float priority
    ) {
        flags(flags);
        usage(usage);
        requiredFlags(requiredFlags);
        preferredFlags(preferredFlags);
        memoryTypeBits(memoryTypeBits);
        pool(pool);
        pUserData(pUserData);
        priority(priority);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaAllocationCreateInfo set(VmaAllocationCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaAllocationCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaAllocationCreateInfo malloc() {
        return wrap(VmaAllocationCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaAllocationCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaAllocationCreateInfo calloc() {
        return wrap(VmaAllocationCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaAllocationCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VmaAllocationCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaAllocationCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaAllocationCreateInfo} instance for the specified memory address. */
    public static VmaAllocationCreateInfo create(long address) {
        return wrap(VmaAllocationCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaAllocationCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VmaAllocationCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaAllocationCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaAllocationCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VmaAllocationCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocationCreateInfo malloc(MemoryStack stack) {
        return wrap(VmaAllocationCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaAllocationCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocationCreateInfo calloc(MemoryStack stack) {
        return wrap(VmaAllocationCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VmaAllocationCreateInfo.FLAGS); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return UNSAFE.getInt(null, struct + VmaAllocationCreateInfo.USAGE); }
    /** Unsafe version of {@link #requiredFlags}. */
    public static int nrequiredFlags(long struct) { return UNSAFE.getInt(null, struct + VmaAllocationCreateInfo.REQUIREDFLAGS); }
    /** Unsafe version of {@link #preferredFlags}. */
    public static int npreferredFlags(long struct) { return UNSAFE.getInt(null, struct + VmaAllocationCreateInfo.PREFERREDFLAGS); }
    /** Unsafe version of {@link #memoryTypeBits}. */
    public static int nmemoryTypeBits(long struct) { return UNSAFE.getInt(null, struct + VmaAllocationCreateInfo.MEMORYTYPEBITS); }
    /** Unsafe version of {@link #pool}. */
    public static long npool(long struct) { return memGetAddress(struct + VmaAllocationCreateInfo.POOL); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VmaAllocationCreateInfo.PUSERDATA); }
    /** Unsafe version of {@link #priority}. */
    public static float npriority(long struct) { return UNSAFE.getFloat(null, struct + VmaAllocationCreateInfo.PRIORITY); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VmaAllocationCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { UNSAFE.putInt(null, struct + VmaAllocationCreateInfo.USAGE, value); }
    /** Unsafe version of {@link #requiredFlags(int) requiredFlags}. */
    public static void nrequiredFlags(long struct, int value) { UNSAFE.putInt(null, struct + VmaAllocationCreateInfo.REQUIREDFLAGS, value); }
    /** Unsafe version of {@link #preferredFlags(int) preferredFlags}. */
    public static void npreferredFlags(long struct, int value) { UNSAFE.putInt(null, struct + VmaAllocationCreateInfo.PREFERREDFLAGS, value); }
    /** Unsafe version of {@link #memoryTypeBits(int) memoryTypeBits}. */
    public static void nmemoryTypeBits(long struct, int value) { UNSAFE.putInt(null, struct + VmaAllocationCreateInfo.MEMORYTYPEBITS, value); }
    /** Unsafe version of {@link #pool(long) pool}. */
    public static void npool(long struct, long value) { memPutAddress(struct + VmaAllocationCreateInfo.POOL, value); }
    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VmaAllocationCreateInfo.PUSERDATA, value); }
    /** Unsafe version of {@link #priority(float) priority}. */
    public static void npriority(long struct, float value) { UNSAFE.putFloat(null, struct + VmaAllocationCreateInfo.PRIORITY, value); }

    // -----------------------------------

    /** An array of {@link VmaAllocationCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VmaAllocationCreateInfo, Buffer> implements NativeResource {

        private static final VmaAllocationCreateInfo ELEMENT_FACTORY = VmaAllocationCreateInfo.create(-1L);

        /**
         * Creates a new {@code VmaAllocationCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaAllocationCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VmaAllocationCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VmaAllocationCreateInfo#flags} field. */
        @NativeType("VmaAllocationCreateFlags")
        public int flags() { return VmaAllocationCreateInfo.nflags(address()); }
        /** @return the value of the {@link VmaAllocationCreateInfo#usage} field. */
        @NativeType("VmaMemoryUsage")
        public int usage() { return VmaAllocationCreateInfo.nusage(address()); }
        /** @return the value of the {@link VmaAllocationCreateInfo#requiredFlags} field. */
        @NativeType("VkMemoryPropertyFlags")
        public int requiredFlags() { return VmaAllocationCreateInfo.nrequiredFlags(address()); }
        /** @return the value of the {@link VmaAllocationCreateInfo#preferredFlags} field. */
        @NativeType("VkMemoryPropertyFlags")
        public int preferredFlags() { return VmaAllocationCreateInfo.npreferredFlags(address()); }
        /** @return the value of the {@link VmaAllocationCreateInfo#memoryTypeBits} field. */
        @NativeType("uint32_t")
        public int memoryTypeBits() { return VmaAllocationCreateInfo.nmemoryTypeBits(address()); }
        /** @return the value of the {@link VmaAllocationCreateInfo#pool} field. */
        @NativeType("VmaPool")
        public long pool() { return VmaAllocationCreateInfo.npool(address()); }
        /** @return the value of the {@link VmaAllocationCreateInfo#pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VmaAllocationCreateInfo.npUserData(address()); }
        /** @return the value of the {@link VmaAllocationCreateInfo#priority} field. */
        public float priority() { return VmaAllocationCreateInfo.npriority(address()); }

        /** Sets the specified value to the {@link VmaAllocationCreateInfo#flags} field. */
        public VmaAllocationCreateInfo.Buffer flags(@NativeType("VmaAllocationCreateFlags") int value) { VmaAllocationCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VmaAllocationCreateInfo#usage} field. */
        public VmaAllocationCreateInfo.Buffer usage(@NativeType("VmaMemoryUsage") int value) { VmaAllocationCreateInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@link VmaAllocationCreateInfo#requiredFlags} field. */
        public VmaAllocationCreateInfo.Buffer requiredFlags(@NativeType("VkMemoryPropertyFlags") int value) { VmaAllocationCreateInfo.nrequiredFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VmaAllocationCreateInfo#preferredFlags} field. */
        public VmaAllocationCreateInfo.Buffer preferredFlags(@NativeType("VkMemoryPropertyFlags") int value) { VmaAllocationCreateInfo.npreferredFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VmaAllocationCreateInfo#memoryTypeBits} field. */
        public VmaAllocationCreateInfo.Buffer memoryTypeBits(@NativeType("uint32_t") int value) { VmaAllocationCreateInfo.nmemoryTypeBits(address(), value); return this; }
        /** Sets the specified value to the {@link VmaAllocationCreateInfo#pool} field. */
        public VmaAllocationCreateInfo.Buffer pool(@NativeType("VmaPool") long value) { VmaAllocationCreateInfo.npool(address(), value); return this; }
        /** Sets the specified value to the {@link VmaAllocationCreateInfo#pUserData} field. */
        public VmaAllocationCreateInfo.Buffer pUserData(@NativeType("void *") long value) { VmaAllocationCreateInfo.npUserData(address(), value); return this; }
        /** Sets the specified value to the {@link VmaAllocationCreateInfo#priority} field. */
        public VmaAllocationCreateInfo.Buffer priority(float value) { VmaAllocationCreateInfo.npriority(address(), value); return this; }

    }

}