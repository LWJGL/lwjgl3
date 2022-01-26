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
 * <p>This structure defines a set of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-memory">memory dependencies</a>, as well as <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family transfer operations</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transitions</a>.</p>
 * 
 * <p>Each member of {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, and {@code pImageMemoryBarriers} defines a separate <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-memory">memory dependency</a>.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_DEPENDENCY_INFO STRUCTURE_TYPE_DEPENDENCY_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code dependencyFlags} <b>must</b> be a valid combination of {@code VkDependencyFlagBits} values</li>
 * <li>If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code memoryBarrierCount} valid {@link VkMemoryBarrier2} structures</li>
 * <li>If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code bufferMemoryBarrierCount} valid {@link VkBufferMemoryBarrier2} structures</li>
 * <li>If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} <b>must</b> be a valid pointer to an array of {@code imageMemoryBarrierCount} valid {@link VkImageMemoryBarrier2} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkBufferMemoryBarrier2}, {@link VkImageMemoryBarrier2}, {@link VkMemoryBarrier2}, {@link VK13#vkCmdPipelineBarrier2 CmdPipelineBarrier2}, {@link KHRSynchronization2#vkCmdPipelineBarrier2KHR CmdPipelineBarrier2KHR}, {@link VK13#vkCmdSetEvent2 CmdSetEvent2}, {@link KHRSynchronization2#vkCmdSetEvent2KHR CmdSetEvent2KHR}, {@link VK13#vkCmdWaitEvents2 CmdWaitEvents2}, {@link KHRSynchronization2#vkCmdWaitEvents2KHR CmdWaitEvents2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDependencyInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDependencyFlags {@link #dependencyFlags};
 *     uint32_t {@link #memoryBarrierCount};
 *     {@link VkMemoryBarrier2 VkMemoryBarrier2} const * {@link #pMemoryBarriers};
 *     uint32_t {@link #bufferMemoryBarrierCount};
 *     {@link VkBufferMemoryBarrier2 VkBufferMemoryBarrier2} const * {@link #pBufferMemoryBarriers};
 *     uint32_t {@link #imageMemoryBarrierCount};
 *     {@link VkImageMemoryBarrier2 VkImageMemoryBarrier2} const * {@link #pImageMemoryBarriers};
 * }</code></pre>
 */
public class VkDependencyInfo extends Struct implements NativeResource {

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
     * Creates a {@code VkDependencyInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDependencyInfo(ByteBuffer container) {
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
    /** a pointer to an array of {@link VkMemoryBarrier2} structures defining memory dependencies between any memory accesses. */
    @Nullable
    @NativeType("VkMemoryBarrier2 const *")
    public VkMemoryBarrier2.Buffer pMemoryBarriers() { return npMemoryBarriers(address()); }
    /** the length of the {@code pBufferMemoryBarriers} array. */
    @NativeType("uint32_t")
    public int bufferMemoryBarrierCount() { return nbufferMemoryBarrierCount(address()); }
    /** a pointer to an array of {@link VkBufferMemoryBarrier2} structures defining memory dependencies between buffer ranges. */
    @Nullable
    @NativeType("VkBufferMemoryBarrier2 const *")
    public VkBufferMemoryBarrier2.Buffer pBufferMemoryBarriers() { return npBufferMemoryBarriers(address()); }
    /** the length of the {@code pImageMemoryBarriers} array. */
    @NativeType("uint32_t")
    public int imageMemoryBarrierCount() { return nimageMemoryBarrierCount(address()); }
    /** a pointer to an array of {@link VkImageMemoryBarrier2} structures defining memory dependencies between image subresources. */
    @Nullable
    @NativeType("VkImageMemoryBarrier2 const *")
    public VkImageMemoryBarrier2.Buffer pImageMemoryBarriers() { return npImageMemoryBarriers(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDependencyInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEPENDENCY_INFO STRUCTURE_TYPE_DEPENDENCY_INFO} value to the {@link #sType} field. */
    public VkDependencyInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEPENDENCY_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDependencyInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #dependencyFlags} field. */
    public VkDependencyInfo dependencyFlags(@NativeType("VkDependencyFlags") int value) { ndependencyFlags(address(), value); return this; }
    /** Sets the address of the specified {@link VkMemoryBarrier2.Buffer} to the {@link #pMemoryBarriers} field. */
    public VkDependencyInfo pMemoryBarriers(@Nullable @NativeType("VkMemoryBarrier2 const *") VkMemoryBarrier2.Buffer value) { npMemoryBarriers(address(), value); return this; }
    /** Sets the address of the specified {@link VkBufferMemoryBarrier2.Buffer} to the {@link #pBufferMemoryBarriers} field. */
    public VkDependencyInfo pBufferMemoryBarriers(@Nullable @NativeType("VkBufferMemoryBarrier2 const *") VkBufferMemoryBarrier2.Buffer value) { npBufferMemoryBarriers(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageMemoryBarrier2.Buffer} to the {@link #pImageMemoryBarriers} field. */
    public VkDependencyInfo pImageMemoryBarriers(@Nullable @NativeType("VkImageMemoryBarrier2 const *") VkImageMemoryBarrier2.Buffer value) { npImageMemoryBarriers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDependencyInfo set(
        int sType,
        long pNext,
        int dependencyFlags,
        @Nullable VkMemoryBarrier2.Buffer pMemoryBarriers,
        @Nullable VkBufferMemoryBarrier2.Buffer pBufferMemoryBarriers,
        @Nullable VkImageMemoryBarrier2.Buffer pImageMemoryBarriers
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
    public VkDependencyInfo set(VkDependencyInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDependencyInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDependencyInfo malloc() {
        return wrap(VkDependencyInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDependencyInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDependencyInfo calloc() {
        return wrap(VkDependencyInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDependencyInfo} instance allocated with {@link BufferUtils}. */
    public static VkDependencyInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDependencyInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDependencyInfo} instance for the specified memory address. */
    public static VkDependencyInfo create(long address) {
        return wrap(VkDependencyInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDependencyInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDependencyInfo.class, address);
    }

    /**
     * Returns a new {@link VkDependencyInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDependencyInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDependencyInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDependencyInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDependencyInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDependencyInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDependencyInfo malloc(MemoryStack stack) {
        return wrap(VkDependencyInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDependencyInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDependencyInfo calloc(MemoryStack stack) {
        return wrap(VkDependencyInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDependencyInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDependencyInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDependencyInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDependencyInfo.PNEXT); }
    /** Unsafe version of {@link #dependencyFlags}. */
    public static int ndependencyFlags(long struct) { return UNSAFE.getInt(null, struct + VkDependencyInfo.DEPENDENCYFLAGS); }
    /** Unsafe version of {@link #memoryBarrierCount}. */
    public static int nmemoryBarrierCount(long struct) { return UNSAFE.getInt(null, struct + VkDependencyInfo.MEMORYBARRIERCOUNT); }
    /** Unsafe version of {@link #pMemoryBarriers}. */
    @Nullable public static VkMemoryBarrier2.Buffer npMemoryBarriers(long struct) { return VkMemoryBarrier2.createSafe(memGetAddress(struct + VkDependencyInfo.PMEMORYBARRIERS), nmemoryBarrierCount(struct)); }
    /** Unsafe version of {@link #bufferMemoryBarrierCount}. */
    public static int nbufferMemoryBarrierCount(long struct) { return UNSAFE.getInt(null, struct + VkDependencyInfo.BUFFERMEMORYBARRIERCOUNT); }
    /** Unsafe version of {@link #pBufferMemoryBarriers}. */
    @Nullable public static VkBufferMemoryBarrier2.Buffer npBufferMemoryBarriers(long struct) { return VkBufferMemoryBarrier2.createSafe(memGetAddress(struct + VkDependencyInfo.PBUFFERMEMORYBARRIERS), nbufferMemoryBarrierCount(struct)); }
    /** Unsafe version of {@link #imageMemoryBarrierCount}. */
    public static int nimageMemoryBarrierCount(long struct) { return UNSAFE.getInt(null, struct + VkDependencyInfo.IMAGEMEMORYBARRIERCOUNT); }
    /** Unsafe version of {@link #pImageMemoryBarriers}. */
    @Nullable public static VkImageMemoryBarrier2.Buffer npImageMemoryBarriers(long struct) { return VkImageMemoryBarrier2.createSafe(memGetAddress(struct + VkDependencyInfo.PIMAGEMEMORYBARRIERS), nimageMemoryBarrierCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDependencyInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDependencyInfo.PNEXT, value); }
    /** Unsafe version of {@link #dependencyFlags(int) dependencyFlags}. */
    public static void ndependencyFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkDependencyInfo.DEPENDENCYFLAGS, value); }
    /** Sets the specified value to the {@code memoryBarrierCount} field of the specified {@code struct}. */
    public static void nmemoryBarrierCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDependencyInfo.MEMORYBARRIERCOUNT, value); }
    /** Unsafe version of {@link #pMemoryBarriers(VkMemoryBarrier2.Buffer) pMemoryBarriers}. */
    public static void npMemoryBarriers(long struct, @Nullable VkMemoryBarrier2.Buffer value) { memPutAddress(struct + VkDependencyInfo.PMEMORYBARRIERS, memAddressSafe(value)); nmemoryBarrierCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code bufferMemoryBarrierCount} field of the specified {@code struct}. */
    public static void nbufferMemoryBarrierCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDependencyInfo.BUFFERMEMORYBARRIERCOUNT, value); }
    /** Unsafe version of {@link #pBufferMemoryBarriers(VkBufferMemoryBarrier2.Buffer) pBufferMemoryBarriers}. */
    public static void npBufferMemoryBarriers(long struct, @Nullable VkBufferMemoryBarrier2.Buffer value) { memPutAddress(struct + VkDependencyInfo.PBUFFERMEMORYBARRIERS, memAddressSafe(value)); nbufferMemoryBarrierCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code imageMemoryBarrierCount} field of the specified {@code struct}. */
    public static void nimageMemoryBarrierCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDependencyInfo.IMAGEMEMORYBARRIERCOUNT, value); }
    /** Unsafe version of {@link #pImageMemoryBarriers(VkImageMemoryBarrier2.Buffer) pImageMemoryBarriers}. */
    public static void npImageMemoryBarriers(long struct, @Nullable VkImageMemoryBarrier2.Buffer value) { memPutAddress(struct + VkDependencyInfo.PIMAGEMEMORYBARRIERS, memAddressSafe(value)); nimageMemoryBarrierCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nmemoryBarrierCount(struct) != 0) {
            check(memGetAddress(struct + VkDependencyInfo.PMEMORYBARRIERS));
        }
        if (nbufferMemoryBarrierCount(struct) != 0) {
            check(memGetAddress(struct + VkDependencyInfo.PBUFFERMEMORYBARRIERS));
        }
        if (nimageMemoryBarrierCount(struct) != 0) {
            check(memGetAddress(struct + VkDependencyInfo.PIMAGEMEMORYBARRIERS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDependencyInfo} structs. */
    public static class Buffer extends StructBuffer<VkDependencyInfo, Buffer> implements NativeResource {

        private static final VkDependencyInfo ELEMENT_FACTORY = VkDependencyInfo.create(-1L);

        /**
         * Creates a new {@code VkDependencyInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDependencyInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDependencyInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDependencyInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDependencyInfo.nsType(address()); }
        /** @return the value of the {@link VkDependencyInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDependencyInfo.npNext(address()); }
        /** @return the value of the {@link VkDependencyInfo#dependencyFlags} field. */
        @NativeType("VkDependencyFlags")
        public int dependencyFlags() { return VkDependencyInfo.ndependencyFlags(address()); }
        /** @return the value of the {@link VkDependencyInfo#memoryBarrierCount} field. */
        @NativeType("uint32_t")
        public int memoryBarrierCount() { return VkDependencyInfo.nmemoryBarrierCount(address()); }
        /** @return a {@link VkMemoryBarrier2.Buffer} view of the struct array pointed to by the {@link VkDependencyInfo#pMemoryBarriers} field. */
        @Nullable
        @NativeType("VkMemoryBarrier2 const *")
        public VkMemoryBarrier2.Buffer pMemoryBarriers() { return VkDependencyInfo.npMemoryBarriers(address()); }
        /** @return the value of the {@link VkDependencyInfo#bufferMemoryBarrierCount} field. */
        @NativeType("uint32_t")
        public int bufferMemoryBarrierCount() { return VkDependencyInfo.nbufferMemoryBarrierCount(address()); }
        /** @return a {@link VkBufferMemoryBarrier2.Buffer} view of the struct array pointed to by the {@link VkDependencyInfo#pBufferMemoryBarriers} field. */
        @Nullable
        @NativeType("VkBufferMemoryBarrier2 const *")
        public VkBufferMemoryBarrier2.Buffer pBufferMemoryBarriers() { return VkDependencyInfo.npBufferMemoryBarriers(address()); }
        /** @return the value of the {@link VkDependencyInfo#imageMemoryBarrierCount} field. */
        @NativeType("uint32_t")
        public int imageMemoryBarrierCount() { return VkDependencyInfo.nimageMemoryBarrierCount(address()); }
        /** @return a {@link VkImageMemoryBarrier2.Buffer} view of the struct array pointed to by the {@link VkDependencyInfo#pImageMemoryBarriers} field. */
        @Nullable
        @NativeType("VkImageMemoryBarrier2 const *")
        public VkImageMemoryBarrier2.Buffer pImageMemoryBarriers() { return VkDependencyInfo.npImageMemoryBarriers(address()); }

        /** Sets the specified value to the {@link VkDependencyInfo#sType} field. */
        public VkDependencyInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDependencyInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEPENDENCY_INFO STRUCTURE_TYPE_DEPENDENCY_INFO} value to the {@link VkDependencyInfo#sType} field. */
        public VkDependencyInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEPENDENCY_INFO); }
        /** Sets the specified value to the {@link VkDependencyInfo#pNext} field. */
        public VkDependencyInfo.Buffer pNext(@NativeType("void const *") long value) { VkDependencyInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDependencyInfo#dependencyFlags} field. */
        public VkDependencyInfo.Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) { VkDependencyInfo.ndependencyFlags(address(), value); return this; }
        /** Sets the address of the specified {@link VkMemoryBarrier2.Buffer} to the {@link VkDependencyInfo#pMemoryBarriers} field. */
        public VkDependencyInfo.Buffer pMemoryBarriers(@Nullable @NativeType("VkMemoryBarrier2 const *") VkMemoryBarrier2.Buffer value) { VkDependencyInfo.npMemoryBarriers(address(), value); return this; }
        /** Sets the address of the specified {@link VkBufferMemoryBarrier2.Buffer} to the {@link VkDependencyInfo#pBufferMemoryBarriers} field. */
        public VkDependencyInfo.Buffer pBufferMemoryBarriers(@Nullable @NativeType("VkBufferMemoryBarrier2 const *") VkBufferMemoryBarrier2.Buffer value) { VkDependencyInfo.npBufferMemoryBarriers(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageMemoryBarrier2.Buffer} to the {@link VkDependencyInfo#pImageMemoryBarriers} field. */
        public VkDependencyInfo.Buffer pImageMemoryBarriers(@Nullable @NativeType("VkImageMemoryBarrier2 const *") VkImageMemoryBarrier2.Buffer value) { VkDependencyInfo.npImageMemoryBarriers(address(), value); return this; }

    }

}