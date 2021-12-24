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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying dependency information for a synchronization command.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure defines a set of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-memory">memory dependencies</a>, as well as <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-queue-transfers">queue family transfer operations</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transitions</a>.</p>
 * 
 * <p>Each member of {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, and {@code pImageMemoryBarriers} defines a separate <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-memory">memory dependency</a>.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSynchronization2#VK_STRUCTURE_TYPE_DEPENDENCY_INFO_KHR STRUCTURE_TYPE_DEPENDENCY_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code dependencyFlags} <b>must</b> be a valid combination of {@code VkDependencyFlagBits} values</li>
 * <li>If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code memoryBarrierCount} valid {@link VkMemoryBarrier2KHR} structures</li>
 * <li>If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code bufferMemoryBarrierCount} valid {@link VkBufferMemoryBarrier2KHR} structures</li>
 * <li>If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code imageMemoryBarrierCount} valid {@link VkImageMemoryBarrier2KHR} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkBufferMemoryBarrier2KHR}, {@link VkImageMemoryBarrier2KHR}, {@link VkMemoryBarrier2KHR}, {@link KHRSynchronization2#vkCmdPipelineBarrier2KHR CmdPipelineBarrier2KHR}, {@link KHRSynchronization2#vkCmdSetEvent2KHR CmdSetEvent2KHR}, {@link KHRSynchronization2#vkCmdWaitEvents2KHR CmdWaitEvents2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDependencyInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDependencyFlags {@link #dependencyFlags};
 *     uint32_t {@link #memoryBarrierCount};
 *     {@link VkMemoryBarrier2KHR VkMemoryBarrier2KHR} const * {@link #pMemoryBarriers};
 *     uint32_t {@link #bufferMemoryBarrierCount};
 *     {@link VkBufferMemoryBarrier2KHR VkBufferMemoryBarrier2KHR} const * {@link #pBufferMemoryBarriers};
 *     uint32_t {@link #imageMemoryBarrierCount};
 *     {@link VkImageMemoryBarrier2KHR VkImageMemoryBarrier2KHR} const * {@link #pImageMemoryBarriers};
 * }</code></pre>
 */
public class VkDependencyInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPENDENCYFLAGS,
        MEMORYBARRIERCOUNT,
        PMEMORYBARRIERS,
        BUFFERMEMORYBARRIERCOUNT,
        PBUFFERMEMORYBARRIERS,
        IMAGEMEMORYBARRIERCOUNT,
        PIMAGEMEMORYBARRIERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPENDENCYFLAGS = layout.offsetof(2);
        MEMORYBARRIERCOUNT = layout.offsetof(3);
        PMEMORYBARRIERS = layout.offsetof(4);
        BUFFERMEMORYBARRIERCOUNT = layout.offsetof(5);
        PBUFFERMEMORYBARRIERS = layout.offsetof(6);
        IMAGEMEMORYBARRIERCOUNT = layout.offsetof(7);
        PIMAGEMEMORYBARRIERS = layout.offsetof(8);
    }

    /**
     * Creates a {@code VkDependencyInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDependencyInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkDependencyFlagBits} specifying how execution and memory dependencies are formed. */
    @NativeType("VkDependencyFlags")
    public int dependencyFlags() { return ndependencyFlags(address()); }
    /** the length of the {@code pMemoryBarriers} array. */
    @NativeType("uint32_t")
    public int memoryBarrierCount() { return nmemoryBarrierCount(address()); }
    /** a pointer to an array of {@link VkMemoryBarrier2KHR} structures defining memory dependencies between any memory accesses. */
    @Nullable
    @NativeType("VkMemoryBarrier2KHR const *")
    public VkMemoryBarrier2KHR.Buffer pMemoryBarriers() { return npMemoryBarriers(address()); }
    /** the length of the {@code pBufferMemoryBarriers} array. */
    @NativeType("uint32_t")
    public int bufferMemoryBarrierCount() { return nbufferMemoryBarrierCount(address()); }
    /** a pointer to an array of {@link VkBufferMemoryBarrier2KHR} structures defining memory dependencies between buffer ranges. */
    @Nullable
    @NativeType("VkBufferMemoryBarrier2KHR const *")
    public VkBufferMemoryBarrier2KHR.Buffer pBufferMemoryBarriers() { return npBufferMemoryBarriers(address()); }
    /** the length of the {@code pImageMemoryBarriers} array. */
    @NativeType("uint32_t")
    public int imageMemoryBarrierCount() { return nimageMemoryBarrierCount(address()); }
    /** a pointer to an array of {@link VkImageMemoryBarrier2KHR} structures defining memory dependencies between image subresources. */
    @Nullable
    @NativeType("VkImageMemoryBarrier2KHR const *")
    public VkImageMemoryBarrier2KHR.Buffer pImageMemoryBarriers() { return npImageMemoryBarriers(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDependencyInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSynchronization2#VK_STRUCTURE_TYPE_DEPENDENCY_INFO_KHR STRUCTURE_TYPE_DEPENDENCY_INFO_KHR} value to the {@link #sType} field. */
    public VkDependencyInfoKHR sType$Default() { return sType(KHRSynchronization2.VK_STRUCTURE_TYPE_DEPENDENCY_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDependencyInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #dependencyFlags} field. */
    public VkDependencyInfoKHR dependencyFlags(@NativeType("VkDependencyFlags") int value) { ndependencyFlags(address(), value); return this; }
    /** Sets the address of the specified {@link VkMemoryBarrier2KHR.Buffer} to the {@link #pMemoryBarriers} field. */
    public VkDependencyInfoKHR pMemoryBarriers(@Nullable @NativeType("VkMemoryBarrier2KHR const *") VkMemoryBarrier2KHR.Buffer value) { npMemoryBarriers(address(), value); return this; }
    /** Sets the address of the specified {@link VkBufferMemoryBarrier2KHR.Buffer} to the {@link #pBufferMemoryBarriers} field. */
    public VkDependencyInfoKHR pBufferMemoryBarriers(@Nullable @NativeType("VkBufferMemoryBarrier2KHR const *") VkBufferMemoryBarrier2KHR.Buffer value) { npBufferMemoryBarriers(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageMemoryBarrier2KHR.Buffer} to the {@link #pImageMemoryBarriers} field. */
    public VkDependencyInfoKHR pImageMemoryBarriers(@Nullable @NativeType("VkImageMemoryBarrier2KHR const *") VkImageMemoryBarrier2KHR.Buffer value) { npImageMemoryBarriers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDependencyInfoKHR set(
        int sType,
        long pNext,
        int dependencyFlags,
        @Nullable VkMemoryBarrier2KHR.Buffer pMemoryBarriers,
        @Nullable VkBufferMemoryBarrier2KHR.Buffer pBufferMemoryBarriers,
        @Nullable VkImageMemoryBarrier2KHR.Buffer pImageMemoryBarriers
    ) {
        sType(sType);
        pNext(pNext);
        dependencyFlags(dependencyFlags);
        pMemoryBarriers(pMemoryBarriers);
        pBufferMemoryBarriers(pBufferMemoryBarriers);
        pImageMemoryBarriers(pImageMemoryBarriers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDependencyInfoKHR set(VkDependencyInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDependencyInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDependencyInfoKHR malloc() {
        return wrap(VkDependencyInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDependencyInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDependencyInfoKHR calloc() {
        return wrap(VkDependencyInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDependencyInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDependencyInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDependencyInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDependencyInfoKHR} instance for the specified memory address. */
    public static VkDependencyInfoKHR create(long address) {
        return wrap(VkDependencyInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDependencyInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDependencyInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkDependencyInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDependencyInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDependencyInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDependencyInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDependencyInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkDependencyInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDependencyInfoKHR malloc(MemoryStack stack) {
        return wrap(VkDependencyInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDependencyInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDependencyInfoKHR calloc(MemoryStack stack) {
        return wrap(VkDependencyInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDependencyInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDependencyInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDependencyInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDependencyInfoKHR.PNEXT); }
    /** Unsafe version of {@link #dependencyFlags}. */
    public static int ndependencyFlags(long struct) { return UNSAFE.getInt(null, struct + VkDependencyInfoKHR.DEPENDENCYFLAGS); }
    /** Unsafe version of {@link #memoryBarrierCount}. */
    public static int nmemoryBarrierCount(long struct) { return UNSAFE.getInt(null, struct + VkDependencyInfoKHR.MEMORYBARRIERCOUNT); }
    /** Unsafe version of {@link #pMemoryBarriers}. */
    @Nullable public static VkMemoryBarrier2KHR.Buffer npMemoryBarriers(long struct) { return VkMemoryBarrier2KHR.createSafe(memGetAddress(struct + VkDependencyInfoKHR.PMEMORYBARRIERS), nmemoryBarrierCount(struct)); }
    /** Unsafe version of {@link #bufferMemoryBarrierCount}. */
    public static int nbufferMemoryBarrierCount(long struct) { return UNSAFE.getInt(null, struct + VkDependencyInfoKHR.BUFFERMEMORYBARRIERCOUNT); }
    /** Unsafe version of {@link #pBufferMemoryBarriers}. */
    @Nullable public static VkBufferMemoryBarrier2KHR.Buffer npBufferMemoryBarriers(long struct) { return VkBufferMemoryBarrier2KHR.createSafe(memGetAddress(struct + VkDependencyInfoKHR.PBUFFERMEMORYBARRIERS), nbufferMemoryBarrierCount(struct)); }
    /** Unsafe version of {@link #imageMemoryBarrierCount}. */
    public static int nimageMemoryBarrierCount(long struct) { return UNSAFE.getInt(null, struct + VkDependencyInfoKHR.IMAGEMEMORYBARRIERCOUNT); }
    /** Unsafe version of {@link #pImageMemoryBarriers}. */
    @Nullable public static VkImageMemoryBarrier2KHR.Buffer npImageMemoryBarriers(long struct) { return VkImageMemoryBarrier2KHR.createSafe(memGetAddress(struct + VkDependencyInfoKHR.PIMAGEMEMORYBARRIERS), nimageMemoryBarrierCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDependencyInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDependencyInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #dependencyFlags(int) dependencyFlags}. */
    public static void ndependencyFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkDependencyInfoKHR.DEPENDENCYFLAGS, value); }
    /** Sets the specified value to the {@code memoryBarrierCount} field of the specified {@code struct}. */
    public static void nmemoryBarrierCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDependencyInfoKHR.MEMORYBARRIERCOUNT, value); }
    /** Unsafe version of {@link #pMemoryBarriers(VkMemoryBarrier2KHR.Buffer) pMemoryBarriers}. */
    public static void npMemoryBarriers(long struct, @Nullable VkMemoryBarrier2KHR.Buffer value) { memPutAddress(struct + VkDependencyInfoKHR.PMEMORYBARRIERS, memAddressSafe(value)); nmemoryBarrierCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code bufferMemoryBarrierCount} field of the specified {@code struct}. */
    public static void nbufferMemoryBarrierCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDependencyInfoKHR.BUFFERMEMORYBARRIERCOUNT, value); }
    /** Unsafe version of {@link #pBufferMemoryBarriers(VkBufferMemoryBarrier2KHR.Buffer) pBufferMemoryBarriers}. */
    public static void npBufferMemoryBarriers(long struct, @Nullable VkBufferMemoryBarrier2KHR.Buffer value) { memPutAddress(struct + VkDependencyInfoKHR.PBUFFERMEMORYBARRIERS, memAddressSafe(value)); nbufferMemoryBarrierCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code imageMemoryBarrierCount} field of the specified {@code struct}. */
    public static void nimageMemoryBarrierCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDependencyInfoKHR.IMAGEMEMORYBARRIERCOUNT, value); }
    /** Unsafe version of {@link #pImageMemoryBarriers(VkImageMemoryBarrier2KHR.Buffer) pImageMemoryBarriers}. */
    public static void npImageMemoryBarriers(long struct, @Nullable VkImageMemoryBarrier2KHR.Buffer value) { memPutAddress(struct + VkDependencyInfoKHR.PIMAGEMEMORYBARRIERS, memAddressSafe(value)); nimageMemoryBarrierCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nmemoryBarrierCount(struct) != 0) {
            check(memGetAddress(struct + VkDependencyInfoKHR.PMEMORYBARRIERS));
        }
        if (nbufferMemoryBarrierCount(struct) != 0) {
            check(memGetAddress(struct + VkDependencyInfoKHR.PBUFFERMEMORYBARRIERS));
        }
        if (nimageMemoryBarrierCount(struct) != 0) {
            check(memGetAddress(struct + VkDependencyInfoKHR.PIMAGEMEMORYBARRIERS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDependencyInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDependencyInfoKHR, Buffer> implements NativeResource {

        private static final VkDependencyInfoKHR ELEMENT_FACTORY = VkDependencyInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDependencyInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDependencyInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDependencyInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDependencyInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDependencyInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkDependencyInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDependencyInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkDependencyInfoKHR#dependencyFlags} field. */
        @NativeType("VkDependencyFlags")
        public int dependencyFlags() { return VkDependencyInfoKHR.ndependencyFlags(address()); }
        /** @return the value of the {@link VkDependencyInfoKHR#memoryBarrierCount} field. */
        @NativeType("uint32_t")
        public int memoryBarrierCount() { return VkDependencyInfoKHR.nmemoryBarrierCount(address()); }
        /** @return a {@link VkMemoryBarrier2KHR.Buffer} view of the struct array pointed to by the {@link VkDependencyInfoKHR#pMemoryBarriers} field. */
        @Nullable
        @NativeType("VkMemoryBarrier2KHR const *")
        public VkMemoryBarrier2KHR.Buffer pMemoryBarriers() { return VkDependencyInfoKHR.npMemoryBarriers(address()); }
        /** @return the value of the {@link VkDependencyInfoKHR#bufferMemoryBarrierCount} field. */
        @NativeType("uint32_t")
        public int bufferMemoryBarrierCount() { return VkDependencyInfoKHR.nbufferMemoryBarrierCount(address()); }
        /** @return a {@link VkBufferMemoryBarrier2KHR.Buffer} view of the struct array pointed to by the {@link VkDependencyInfoKHR#pBufferMemoryBarriers} field. */
        @Nullable
        @NativeType("VkBufferMemoryBarrier2KHR const *")
        public VkBufferMemoryBarrier2KHR.Buffer pBufferMemoryBarriers() { return VkDependencyInfoKHR.npBufferMemoryBarriers(address()); }
        /** @return the value of the {@link VkDependencyInfoKHR#imageMemoryBarrierCount} field. */
        @NativeType("uint32_t")
        public int imageMemoryBarrierCount() { return VkDependencyInfoKHR.nimageMemoryBarrierCount(address()); }
        /** @return a {@link VkImageMemoryBarrier2KHR.Buffer} view of the struct array pointed to by the {@link VkDependencyInfoKHR#pImageMemoryBarriers} field. */
        @Nullable
        @NativeType("VkImageMemoryBarrier2KHR const *")
        public VkImageMemoryBarrier2KHR.Buffer pImageMemoryBarriers() { return VkDependencyInfoKHR.npImageMemoryBarriers(address()); }

        /** Sets the specified value to the {@link VkDependencyInfoKHR#sType} field. */
        public VkDependencyInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDependencyInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSynchronization2#VK_STRUCTURE_TYPE_DEPENDENCY_INFO_KHR STRUCTURE_TYPE_DEPENDENCY_INFO_KHR} value to the {@link VkDependencyInfoKHR#sType} field. */
        public VkDependencyInfoKHR.Buffer sType$Default() { return sType(KHRSynchronization2.VK_STRUCTURE_TYPE_DEPENDENCY_INFO_KHR); }
        /** Sets the specified value to the {@link VkDependencyInfoKHR#pNext} field. */
        public VkDependencyInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDependencyInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDependencyInfoKHR#dependencyFlags} field. */
        public VkDependencyInfoKHR.Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) { VkDependencyInfoKHR.ndependencyFlags(address(), value); return this; }
        /** Sets the address of the specified {@link VkMemoryBarrier2KHR.Buffer} to the {@link VkDependencyInfoKHR#pMemoryBarriers} field. */
        public VkDependencyInfoKHR.Buffer pMemoryBarriers(@Nullable @NativeType("VkMemoryBarrier2KHR const *") VkMemoryBarrier2KHR.Buffer value) { VkDependencyInfoKHR.npMemoryBarriers(address(), value); return this; }
        /** Sets the address of the specified {@link VkBufferMemoryBarrier2KHR.Buffer} to the {@link VkDependencyInfoKHR#pBufferMemoryBarriers} field. */
        public VkDependencyInfoKHR.Buffer pBufferMemoryBarriers(@Nullable @NativeType("VkBufferMemoryBarrier2KHR const *") VkBufferMemoryBarrier2KHR.Buffer value) { VkDependencyInfoKHR.npBufferMemoryBarriers(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageMemoryBarrier2KHR.Buffer} to the {@link VkDependencyInfoKHR#pImageMemoryBarriers} field. */
        public VkDependencyInfoKHR.Buffer pImageMemoryBarriers(@Nullable @NativeType("VkImageMemoryBarrier2KHR const *") VkImageMemoryBarrier2KHR.Buffer value) { VkDependencyInfoKHR.npImageMemoryBarriers(address(), value); return this; }

    }

}