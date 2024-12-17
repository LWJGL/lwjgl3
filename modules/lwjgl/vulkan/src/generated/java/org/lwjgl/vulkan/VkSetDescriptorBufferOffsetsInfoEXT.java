/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkSetDescriptorBufferOffsetsInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkShaderStageFlags stageFlags;
 *     VkPipelineLayout layout;
 *     uint32_t firstSet;
 *     uint32_t setCount;
 *     uint32_t const * pBufferIndices;
 *     VkDeviceSize const * pOffsets;
 * }}</pre>
 */
public class VkSetDescriptorBufferOffsetsInfoEXT extends Struct<VkSetDescriptorBufferOffsetsInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STAGEFLAGS,
        LAYOUT,
        FIRSTSET,
        SETCOUNT,
        PBUFFERINDICES,
        POFFSETS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGEFLAGS = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        FIRSTSET = layout.offsetof(4);
        SETCOUNT = layout.offsetof(5);
        PBUFFERINDICES = layout.offsetof(6);
        POFFSETS = layout.offsetof(7);
    }

    protected VkSetDescriptorBufferOffsetsInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSetDescriptorBufferOffsetsInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkSetDescriptorBufferOffsetsInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSetDescriptorBufferOffsetsInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code stageFlags} field. */
    @NativeType("VkShaderStageFlags")
    public int stageFlags() { return nstageFlags(address()); }
    /** @return the value of the {@code layout} field. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** @return the value of the {@code firstSet} field. */
    @NativeType("uint32_t")
    public int firstSet() { return nfirstSet(address()); }
    /** @return the value of the {@code setCount} field. */
    @NativeType("uint32_t")
    public int setCount() { return nsetCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pBufferIndices} field. */
    @NativeType("uint32_t const *")
    public IntBuffer pBufferIndices() { return npBufferIndices(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pOffsets} field. */
    @NativeType("VkDeviceSize const *")
    public LongBuffer pOffsets() { return npOffsets(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT} value to the {@code sType} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
    public VkSetDescriptorBufferOffsetsInfoEXT pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code stageFlags} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code firstSet} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT firstSet(@NativeType("uint32_t") int value) { nfirstSet(address(), value); return this; }
    /** Sets the specified value to the {@code setCount} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT setCount(@NativeType("uint32_t") int value) { nsetCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pBufferIndices} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT pBufferIndices(@NativeType("uint32_t const *") IntBuffer value) { npBufferIndices(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pOffsets} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT pOffsets(@NativeType("VkDeviceSize const *") LongBuffer value) { npOffsets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSetDescriptorBufferOffsetsInfoEXT set(
        int sType,
        long pNext,
        int stageFlags,
        long layout,
        int firstSet,
        int setCount,
        IntBuffer pBufferIndices,
        LongBuffer pOffsets
    ) {
        sType(sType);
        pNext(pNext);
        stageFlags(stageFlags);
        layout(layout);
        firstSet(firstSet);
        setCount(setCount);
        pBufferIndices(pBufferIndices);
        pOffsets(pOffsets);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSetDescriptorBufferOffsetsInfoEXT set(VkSetDescriptorBufferOffsetsInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSetDescriptorBufferOffsetsInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSetDescriptorBufferOffsetsInfoEXT malloc() {
        return new VkSetDescriptorBufferOffsetsInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSetDescriptorBufferOffsetsInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSetDescriptorBufferOffsetsInfoEXT calloc() {
        return new VkSetDescriptorBufferOffsetsInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSetDescriptorBufferOffsetsInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSetDescriptorBufferOffsetsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSetDescriptorBufferOffsetsInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSetDescriptorBufferOffsetsInfoEXT} instance for the specified memory address. */
    public static VkSetDescriptorBufferOffsetsInfoEXT create(long address) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSetDescriptorBufferOffsetsInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkSetDescriptorBufferOffsetsInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSetDescriptorBufferOffsetsInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSetDescriptorBufferOffsetsInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT malloc(MemoryStack stack) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSetDescriptorBufferOffsetsInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT calloc(MemoryStack stack) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.PNEXT); }
    /** Unsafe version of {@link #stageFlags}. */
    public static int nstageFlags(long struct) { return memGetInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.STAGEFLAGS); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkSetDescriptorBufferOffsetsInfoEXT.LAYOUT); }
    /** Unsafe version of {@link #firstSet}. */
    public static int nfirstSet(long struct) { return memGetInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.FIRSTSET); }
    /** Unsafe version of {@link #setCount}. */
    public static int nsetCount(long struct) { return memGetInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.SETCOUNT); }
    /** Unsafe version of {@link #pBufferIndices() pBufferIndices}. */
    public static IntBuffer npBufferIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.PBUFFERINDICES), nsetCount(struct)); }
    /** Unsafe version of {@link #pOffsets() pOffsets}. */
    public static LongBuffer npOffsets(long struct) { return memLongBuffer(memGetAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.POFFSETS), nsetCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #stageFlags(int) stageFlags}. */
    public static void nstageFlags(long struct, int value) { memPutInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.STAGEFLAGS, value); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkSetDescriptorBufferOffsetsInfoEXT.LAYOUT, value); }
    /** Unsafe version of {@link #firstSet(int) firstSet}. */
    public static void nfirstSet(long struct, int value) { memPutInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.FIRSTSET, value); }
    /** Sets the specified value to the {@code setCount} field of the specified {@code struct}. */
    public static void nsetCount(long struct, int value) { memPutInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.SETCOUNT, value); }
    /** Unsafe version of {@link #pBufferIndices(IntBuffer) pBufferIndices}. */
    public static void npBufferIndices(long struct, IntBuffer value) { memPutAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.PBUFFERINDICES, memAddress(value)); }
    /** Unsafe version of {@link #pOffsets(LongBuffer) pOffsets}. */
    public static void npOffsets(long struct, LongBuffer value) { memPutAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.POFFSETS, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.PBUFFERINDICES));
        check(memGetAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.POFFSETS));
    }

    // -----------------------------------

    /** An array of {@link VkSetDescriptorBufferOffsetsInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSetDescriptorBufferOffsetsInfoEXT, Buffer> implements NativeResource {

        private static final VkSetDescriptorBufferOffsetsInfoEXT ELEMENT_FACTORY = VkSetDescriptorBufferOffsetsInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSetDescriptorBufferOffsetsInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSetDescriptorBufferOffsetsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSetDescriptorBufferOffsetsInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSetDescriptorBufferOffsetsInfoEXT.npNext(address()); }
        /** @return the value of the {@code stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkSetDescriptorBufferOffsetsInfoEXT.nstageFlags(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkSetDescriptorBufferOffsetsInfoEXT.nlayout(address()); }
        /** @return the value of the {@code firstSet} field. */
        @NativeType("uint32_t")
        public int firstSet() { return VkSetDescriptorBufferOffsetsInfoEXT.nfirstSet(address()); }
        /** @return the value of the {@code setCount} field. */
        @NativeType("uint32_t")
        public int setCount() { return VkSetDescriptorBufferOffsetsInfoEXT.nsetCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pBufferIndices} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pBufferIndices() { return VkSetDescriptorBufferOffsetsInfoEXT.npBufferIndices(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pOffsets} field. */
        @NativeType("VkDeviceSize const *")
        public LongBuffer pOffsets() { return VkSetDescriptorBufferOffsetsInfoEXT.npOffsets(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSetDescriptorBufferOffsetsInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT} value to the {@code sType} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSetDescriptorBufferOffsetsInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code stageFlags} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkSetDescriptorBufferOffsetsInfoEXT.nstageFlags(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkSetDescriptorBufferOffsetsInfoEXT.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code firstSet} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer firstSet(@NativeType("uint32_t") int value) { VkSetDescriptorBufferOffsetsInfoEXT.nfirstSet(address(), value); return this; }
        /** Sets the specified value to the {@code setCount} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer setCount(@NativeType("uint32_t") int value) { VkSetDescriptorBufferOffsetsInfoEXT.nsetCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pBufferIndices} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer pBufferIndices(@NativeType("uint32_t const *") IntBuffer value) { VkSetDescriptorBufferOffsetsInfoEXT.npBufferIndices(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pOffsets} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer pOffsets(@NativeType("VkDeviceSize const *") LongBuffer value) { VkSetDescriptorBufferOffsetsInfoEXT.npOffsets(address(), value); return this; }

    }

}