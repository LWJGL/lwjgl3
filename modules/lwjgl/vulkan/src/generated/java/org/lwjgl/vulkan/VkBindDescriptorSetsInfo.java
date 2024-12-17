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
 * struct VkBindDescriptorSetsInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkShaderStageFlags stageFlags;
 *     VkPipelineLayout layout;
 *     uint32_t firstSet;
 *     uint32_t descriptorSetCount;
 *     VkDescriptorSet const * pDescriptorSets;
 *     uint32_t dynamicOffsetCount;
 *     uint32_t const * pDynamicOffsets;
 * }}</pre>
 */
public class VkBindDescriptorSetsInfo extends Struct<VkBindDescriptorSetsInfo> implements NativeResource {

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
        DESCRIPTORSETCOUNT,
        PDESCRIPTORSETS,
        DYNAMICOFFSETCOUNT,
        PDYNAMICOFFSETS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGEFLAGS = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        FIRSTSET = layout.offsetof(4);
        DESCRIPTORSETCOUNT = layout.offsetof(5);
        PDESCRIPTORSETS = layout.offsetof(6);
        DYNAMICOFFSETCOUNT = layout.offsetof(7);
        PDYNAMICOFFSETS = layout.offsetof(8);
    }

    protected VkBindDescriptorSetsInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindDescriptorSetsInfo create(long address, @Nullable ByteBuffer container) {
        return new VkBindDescriptorSetsInfo(address, container);
    }

    /**
     * Creates a {@code VkBindDescriptorSetsInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindDescriptorSetsInfo(ByteBuffer container) {
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
    /** @return the value of the {@code descriptorSetCount} field. */
    @NativeType("uint32_t")
    public int descriptorSetCount() { return ndescriptorSetCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pDescriptorSets} field. */
    @NativeType("VkDescriptorSet const *")
    public LongBuffer pDescriptorSets() { return npDescriptorSets(address()); }
    /** @return the value of the {@code dynamicOffsetCount} field. */
    @NativeType("uint32_t")
    public int dynamicOffsetCount() { return ndynamicOffsetCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDynamicOffsets} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pDynamicOffsets() { return npDynamicOffsets(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindDescriptorSetsInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO} value to the {@code sType} field. */
    public VkBindDescriptorSetsInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindDescriptorSetsInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
    public VkBindDescriptorSetsInfo pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code stageFlags} field. */
    public VkBindDescriptorSetsInfo stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkBindDescriptorSetsInfo layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code firstSet} field. */
    public VkBindDescriptorSetsInfo firstSet(@NativeType("uint32_t") int value) { nfirstSet(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pDescriptorSets} field. */
    public VkBindDescriptorSetsInfo pDescriptorSets(@NativeType("VkDescriptorSet const *") LongBuffer value) { npDescriptorSets(address(), value); return this; }
    /** Sets the specified value to the {@code dynamicOffsetCount} field. */
    public VkBindDescriptorSetsInfo dynamicOffsetCount(@NativeType("uint32_t") int value) { ndynamicOffsetCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDynamicOffsets} field. */
    public VkBindDescriptorSetsInfo pDynamicOffsets(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDynamicOffsets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindDescriptorSetsInfo set(
        int sType,
        long pNext,
        int stageFlags,
        long layout,
        int firstSet,
        LongBuffer pDescriptorSets,
        int dynamicOffsetCount,
        @Nullable IntBuffer pDynamicOffsets
    ) {
        sType(sType);
        pNext(pNext);
        stageFlags(stageFlags);
        layout(layout);
        firstSet(firstSet);
        pDescriptorSets(pDescriptorSets);
        dynamicOffsetCount(dynamicOffsetCount);
        pDynamicOffsets(pDynamicOffsets);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindDescriptorSetsInfo set(VkBindDescriptorSetsInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindDescriptorSetsInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindDescriptorSetsInfo malloc() {
        return new VkBindDescriptorSetsInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindDescriptorSetsInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindDescriptorSetsInfo calloc() {
        return new VkBindDescriptorSetsInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindDescriptorSetsInfo} instance allocated with {@link BufferUtils}. */
    public static VkBindDescriptorSetsInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindDescriptorSetsInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkBindDescriptorSetsInfo} instance for the specified memory address. */
    public static VkBindDescriptorSetsInfo create(long address) {
        return new VkBindDescriptorSetsInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindDescriptorSetsInfo createSafe(long address) {
        return address == NULL ? null : new VkBindDescriptorSetsInfo(address, null);
    }

    /**
     * Returns a new {@link VkBindDescriptorSetsInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorSetsInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindDescriptorSetsInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorSetsInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindDescriptorSetsInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorSetsInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindDescriptorSetsInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorSetsInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindDescriptorSetsInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindDescriptorSetsInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindDescriptorSetsInfo malloc(MemoryStack stack) {
        return new VkBindDescriptorSetsInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindDescriptorSetsInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindDescriptorSetsInfo calloc(MemoryStack stack) {
        return new VkBindDescriptorSetsInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindDescriptorSetsInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorSetsInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindDescriptorSetsInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorSetsInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindDescriptorSetsInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindDescriptorSetsInfo.PNEXT); }
    /** Unsafe version of {@link #stageFlags}. */
    public static int nstageFlags(long struct) { return memGetInt(struct + VkBindDescriptorSetsInfo.STAGEFLAGS); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkBindDescriptorSetsInfo.LAYOUT); }
    /** Unsafe version of {@link #firstSet}. */
    public static int nfirstSet(long struct) { return memGetInt(struct + VkBindDescriptorSetsInfo.FIRSTSET); }
    /** Unsafe version of {@link #descriptorSetCount}. */
    public static int ndescriptorSetCount(long struct) { return memGetInt(struct + VkBindDescriptorSetsInfo.DESCRIPTORSETCOUNT); }
    /** Unsafe version of {@link #pDescriptorSets() pDescriptorSets}. */
    public static LongBuffer npDescriptorSets(long struct) { return memLongBuffer(memGetAddress(struct + VkBindDescriptorSetsInfo.PDESCRIPTORSETS), ndescriptorSetCount(struct)); }
    /** Unsafe version of {@link #dynamicOffsetCount}. */
    public static int ndynamicOffsetCount(long struct) { return memGetInt(struct + VkBindDescriptorSetsInfo.DYNAMICOFFSETCOUNT); }
    /** Unsafe version of {@link #pDynamicOffsets() pDynamicOffsets}. */
    public static @Nullable IntBuffer npDynamicOffsets(long struct) { return memIntBufferSafe(memGetAddress(struct + VkBindDescriptorSetsInfo.PDYNAMICOFFSETS), ndynamicOffsetCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindDescriptorSetsInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindDescriptorSetsInfo.PNEXT, value); }
    /** Unsafe version of {@link #stageFlags(int) stageFlags}. */
    public static void nstageFlags(long struct, int value) { memPutInt(struct + VkBindDescriptorSetsInfo.STAGEFLAGS, value); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkBindDescriptorSetsInfo.LAYOUT, value); }
    /** Unsafe version of {@link #firstSet(int) firstSet}. */
    public static void nfirstSet(long struct, int value) { memPutInt(struct + VkBindDescriptorSetsInfo.FIRSTSET, value); }
    /** Sets the specified value to the {@code descriptorSetCount} field of the specified {@code struct}. */
    public static void ndescriptorSetCount(long struct, int value) { memPutInt(struct + VkBindDescriptorSetsInfo.DESCRIPTORSETCOUNT, value); }
    /** Unsafe version of {@link #pDescriptorSets(LongBuffer) pDescriptorSets}. */
    public static void npDescriptorSets(long struct, LongBuffer value) { memPutAddress(struct + VkBindDescriptorSetsInfo.PDESCRIPTORSETS, memAddress(value)); ndescriptorSetCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code dynamicOffsetCount} field of the specified {@code struct}. */
    public static void ndynamicOffsetCount(long struct, int value) { memPutInt(struct + VkBindDescriptorSetsInfo.DYNAMICOFFSETCOUNT, value); }
    /** Unsafe version of {@link #pDynamicOffsets(IntBuffer) pDynamicOffsets}. */
    public static void npDynamicOffsets(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkBindDescriptorSetsInfo.PDYNAMICOFFSETS, memAddressSafe(value)); if (value != null) { ndynamicOffsetCount(struct, value.remaining()); } }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkBindDescriptorSetsInfo.PDESCRIPTORSETS));
    }

    // -----------------------------------

    /** An array of {@link VkBindDescriptorSetsInfo} structs. */
    public static class Buffer extends StructBuffer<VkBindDescriptorSetsInfo, Buffer> implements NativeResource {

        private static final VkBindDescriptorSetsInfo ELEMENT_FACTORY = VkBindDescriptorSetsInfo.create(-1L);

        /**
         * Creates a new {@code VkBindDescriptorSetsInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindDescriptorSetsInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindDescriptorSetsInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindDescriptorSetsInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindDescriptorSetsInfo.npNext(address()); }
        /** @return the value of the {@code stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkBindDescriptorSetsInfo.nstageFlags(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkBindDescriptorSetsInfo.nlayout(address()); }
        /** @return the value of the {@code firstSet} field. */
        @NativeType("uint32_t")
        public int firstSet() { return VkBindDescriptorSetsInfo.nfirstSet(address()); }
        /** @return the value of the {@code descriptorSetCount} field. */
        @NativeType("uint32_t")
        public int descriptorSetCount() { return VkBindDescriptorSetsInfo.ndescriptorSetCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pDescriptorSets} field. */
        @NativeType("VkDescriptorSet const *")
        public LongBuffer pDescriptorSets() { return VkBindDescriptorSetsInfo.npDescriptorSets(address()); }
        /** @return the value of the {@code dynamicOffsetCount} field. */
        @NativeType("uint32_t")
        public int dynamicOffsetCount() { return VkBindDescriptorSetsInfo.ndynamicOffsetCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDynamicOffsets} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pDynamicOffsets() { return VkBindDescriptorSetsInfo.npDynamicOffsets(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindDescriptorSetsInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBindDescriptorSetsInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO} value to the {@code sType} field. */
        public VkBindDescriptorSetsInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindDescriptorSetsInfo.Buffer pNext(@NativeType("void const *") long value) { VkBindDescriptorSetsInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
        public VkBindDescriptorSetsInfo.Buffer pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code stageFlags} field. */
        public VkBindDescriptorSetsInfo.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkBindDescriptorSetsInfo.nstageFlags(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkBindDescriptorSetsInfo.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkBindDescriptorSetsInfo.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code firstSet} field. */
        public VkBindDescriptorSetsInfo.Buffer firstSet(@NativeType("uint32_t") int value) { VkBindDescriptorSetsInfo.nfirstSet(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pDescriptorSets} field. */
        public VkBindDescriptorSetsInfo.Buffer pDescriptorSets(@NativeType("VkDescriptorSet const *") LongBuffer value) { VkBindDescriptorSetsInfo.npDescriptorSets(address(), value); return this; }
        /** Sets the specified value to the {@code dynamicOffsetCount} field. */
        public VkBindDescriptorSetsInfo.Buffer dynamicOffsetCount(@NativeType("uint32_t") int value) { VkBindDescriptorSetsInfo.ndynamicOffsetCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDynamicOffsets} field. */
        public VkBindDescriptorSetsInfo.Buffer pDynamicOffsets(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBindDescriptorSetsInfo.npDynamicOffsets(address(), value); return this; }

    }

}