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
 * Structure specifying parameters of a buffer copy command.
 * 
 * <h5>Description</h5>
 * 
 * <p>Members defined by this structure with the same name as parameters in {@link VK10#vkCmdCopyBuffer CmdCopyBuffer} have the identical effect to those parameters; the child structure {@link VkBufferCopy2} is a variant of {@link VkBufferCopy} which includes {@code sType} and {@code pNext} parameters, allowing it to be extended.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code srcOffset} member of each element of {@code pRegions} <b>must</b> be less than the size of {@code srcBuffer}</li>
 * <li>The {@code dstOffset} member of each element of {@code pRegions} <b>must</b> be less than the size of {@code dstBuffer}</li>
 * <li>The {@code size} member of each element of {@code pRegions} <b>must</b> be less than or equal to the size of {@code srcBuffer} minus {@code srcOffset}</li>
 * <li>The {@code size} member of each element of {@code pRegions} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}</li>
 * <li>The union of the source regions, and the union of the destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
 * <li>{@code srcBuffer} <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_TRANSFER_SRC_BIT BUFFER_USAGE_TRANSFER_SRC_BIT} usage flag</li>
 * <li>If {@code srcBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code dstBuffer} <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
 * <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_INFO_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid {@link VkBufferCopy2} structures</li>
 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
 * <li>Both of {@code dstBuffer}, and {@code srcBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkBufferCopy2}, {@link VK13#vkCmdCopyBuffer2 CmdCopyBuffer2}, {@link KHRCopyCommands2#vkCmdCopyBuffer2KHR CmdCopyBuffer2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyBufferInfo2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBuffer {@link #srcBuffer};
 *     VkBuffer {@link #dstBuffer};
 *     uint32_t {@link #regionCount};
 *     {@link VkBufferCopy2 VkBufferCopy2} const * {@link #pRegions};
 * }</code></pre>
 */
public class VkCopyBufferInfo2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCBUFFER,
        DSTBUFFER,
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCBUFFER = layout.offsetof(2);
        DSTBUFFER = layout.offsetof(3);
        REGIONCOUNT = layout.offsetof(4);
        PREGIONS = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkCopyBufferInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyBufferInfo2(ByteBuffer container) {
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
    /** the source buffer. */
    @NativeType("VkBuffer")
    public long srcBuffer() { return nsrcBuffer(address()); }
    /** the destination buffer. */
    @NativeType("VkBuffer")
    public long dstBuffer() { return ndstBuffer(address()); }
    /** the number of regions to copy. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** a pointer to an array of {@link VkBufferCopy2} structures specifying the regions to copy. */
    @NativeType("VkBufferCopy2 const *")
    public VkBufferCopy2.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyBufferInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_INFO_2} value to the {@link #sType} field. */
    public VkCopyBufferInfo2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyBufferInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcBuffer} field. */
    public VkCopyBufferInfo2 srcBuffer(@NativeType("VkBuffer") long value) { nsrcBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #dstBuffer} field. */
    public VkCopyBufferInfo2 dstBuffer(@NativeType("VkBuffer") long value) { ndstBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkBufferCopy2.Buffer} to the {@link #pRegions} field. */
    public VkCopyBufferInfo2 pRegions(@NativeType("VkBufferCopy2 const *") VkBufferCopy2.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyBufferInfo2 set(
        int sType,
        long pNext,
        long srcBuffer,
        long dstBuffer,
        VkBufferCopy2.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        srcBuffer(srcBuffer);
        dstBuffer(dstBuffer);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyBufferInfo2 set(VkCopyBufferInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyBufferInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyBufferInfo2 malloc() {
        return wrap(VkCopyBufferInfo2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCopyBufferInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyBufferInfo2 calloc() {
        return wrap(VkCopyBufferInfo2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCopyBufferInfo2} instance allocated with {@link BufferUtils}. */
    public static VkCopyBufferInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCopyBufferInfo2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCopyBufferInfo2} instance for the specified memory address. */
    public static VkCopyBufferInfo2 create(long address) {
        return wrap(VkCopyBufferInfo2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyBufferInfo2 createSafe(long address) {
        return address == NULL ? null : wrap(VkCopyBufferInfo2.class, address);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCopyBufferInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyBufferInfo2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkCopyBufferInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyBufferInfo2 malloc(MemoryStack stack) {
        return wrap(VkCopyBufferInfo2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCopyBufferInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyBufferInfo2 calloc(MemoryStack stack) {
        return wrap(VkCopyBufferInfo2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCopyBufferInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyBufferInfo2.PNEXT); }
    /** Unsafe version of {@link #srcBuffer}. */
    public static long nsrcBuffer(long struct) { return UNSAFE.getLong(null, struct + VkCopyBufferInfo2.SRCBUFFER); }
    /** Unsafe version of {@link #dstBuffer}. */
    public static long ndstBuffer(long struct) { return UNSAFE.getLong(null, struct + VkCopyBufferInfo2.DSTBUFFER); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return UNSAFE.getInt(null, struct + VkCopyBufferInfo2.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkBufferCopy2.Buffer npRegions(long struct) { return VkBufferCopy2.create(memGetAddress(struct + VkCopyBufferInfo2.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyBufferInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyBufferInfo2.PNEXT, value); }
    /** Unsafe version of {@link #srcBuffer(long) srcBuffer}. */
    public static void nsrcBuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyBufferInfo2.SRCBUFFER, value); }
    /** Unsafe version of {@link #dstBuffer(long) dstBuffer}. */
    public static void ndstBuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyBufferInfo2.DSTBUFFER, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyBufferInfo2.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkBufferCopy2.Buffer) pRegions}. */
    public static void npRegions(long struct, VkBufferCopy2.Buffer value) { memPutAddress(struct + VkCopyBufferInfo2.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCopyBufferInfo2.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkCopyBufferInfo2} structs. */
    public static class Buffer extends StructBuffer<VkCopyBufferInfo2, Buffer> implements NativeResource {

        private static final VkCopyBufferInfo2 ELEMENT_FACTORY = VkCopyBufferInfo2.create(-1L);

        /**
         * Creates a new {@code VkCopyBufferInfo2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyBufferInfo2#SIZEOF}, and its mark will be undefined.
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
        protected VkCopyBufferInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyBufferInfo2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyBufferInfo2.nsType(address()); }
        /** @return the value of the {@link VkCopyBufferInfo2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyBufferInfo2.npNext(address()); }
        /** @return the value of the {@link VkCopyBufferInfo2#srcBuffer} field. */
        @NativeType("VkBuffer")
        public long srcBuffer() { return VkCopyBufferInfo2.nsrcBuffer(address()); }
        /** @return the value of the {@link VkCopyBufferInfo2#dstBuffer} field. */
        @NativeType("VkBuffer")
        public long dstBuffer() { return VkCopyBufferInfo2.ndstBuffer(address()); }
        /** @return the value of the {@link VkCopyBufferInfo2#regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyBufferInfo2.nregionCount(address()); }
        /** @return a {@link VkBufferCopy2.Buffer} view of the struct array pointed to by the {@link VkCopyBufferInfo2#pRegions} field. */
        @NativeType("VkBufferCopy2 const *")
        public VkBufferCopy2.Buffer pRegions() { return VkCopyBufferInfo2.npRegions(address()); }

        /** Sets the specified value to the {@link VkCopyBufferInfo2#sType} field. */
        public VkCopyBufferInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyBufferInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_INFO_2} value to the {@link VkCopyBufferInfo2#sType} field. */
        public VkCopyBufferInfo2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2); }
        /** Sets the specified value to the {@link VkCopyBufferInfo2#pNext} field. */
        public VkCopyBufferInfo2.Buffer pNext(@NativeType("void const *") long value) { VkCopyBufferInfo2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyBufferInfo2#srcBuffer} field. */
        public VkCopyBufferInfo2.Buffer srcBuffer(@NativeType("VkBuffer") long value) { VkCopyBufferInfo2.nsrcBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyBufferInfo2#dstBuffer} field. */
        public VkCopyBufferInfo2.Buffer dstBuffer(@NativeType("VkBuffer") long value) { VkCopyBufferInfo2.ndstBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkBufferCopy2.Buffer} to the {@link VkCopyBufferInfo2#pRegions} field. */
        public VkCopyBufferInfo2.Buffer pRegions(@NativeType("VkBufferCopy2 const *") VkBufferCopy2.Buffer value) { VkCopyBufferInfo2.npRegions(address(), value); return this; }

    }

}