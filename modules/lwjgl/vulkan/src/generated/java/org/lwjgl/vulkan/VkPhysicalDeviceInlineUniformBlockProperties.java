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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceInlineUniformBlockProperties {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxInlineUniformBlockSize;
 *     uint32_t maxPerStageDescriptorInlineUniformBlocks;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
 *     uint32_t maxDescriptorSetInlineUniformBlocks;
 *     uint32_t maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
 * }}</pre>
 */
public class VkPhysicalDeviceInlineUniformBlockProperties extends Struct<VkPhysicalDeviceInlineUniformBlockProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXINLINEUNIFORMBLOCKSIZE,
        MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS,
        MAXDESCRIPTORSETINLINEUNIFORMBLOCKS,
        MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXINLINEUNIFORMBLOCKSIZE = layout.offsetof(2);
        MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS = layout.offsetof(3);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS = layout.offsetof(4);
        MAXDESCRIPTORSETINLINEUNIFORMBLOCKS = layout.offsetof(5);
        MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS = layout.offsetof(6);
    }

    protected VkPhysicalDeviceInlineUniformBlockProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceInlineUniformBlockProperties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceInlineUniformBlockProperties(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceInlineUniformBlockProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceInlineUniformBlockProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code maxInlineUniformBlockSize} field. */
    @NativeType("uint32_t")
    public int maxInlineUniformBlockSize() { return nmaxInlineUniformBlockSize(address()); }
    /** @return the value of the {@code maxPerStageDescriptorInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorInlineUniformBlocks() { return nmaxPerStageDescriptorInlineUniformBlocks(address()); }
    /** @return the value of the {@code maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(address()); }
    /** @return the value of the {@code maxDescriptorSetInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetInlineUniformBlocks() { return nmaxDescriptorSetInlineUniformBlocks(address()); }
    /** @return the value of the {@code maxDescriptorSetUpdateAfterBindInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceInlineUniformBlockProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES} value to the {@code sType} field. */
    public VkPhysicalDeviceInlineUniformBlockProperties sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceInlineUniformBlockProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceInlineUniformBlockProperties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceInlineUniformBlockProperties set(VkPhysicalDeviceInlineUniformBlockProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInlineUniformBlockProperties malloc() {
        return new VkPhysicalDeviceInlineUniformBlockProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInlineUniformBlockProperties calloc() {
        return new VkPhysicalDeviceInlineUniformBlockProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceInlineUniformBlockProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceInlineUniformBlockProperties(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceInlineUniformBlockProperties create(long address) {
        return new VkPhysicalDeviceInlineUniformBlockProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceInlineUniformBlockProperties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceInlineUniformBlockProperties(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceInlineUniformBlockProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInlineUniformBlockProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceInlineUniformBlockProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInlineUniformBlockProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceInlineUniformBlockProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceInlineUniformBlockProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceInlineUniformBlockProperties.PNEXT); }
    /** Unsafe version of {@link #maxInlineUniformBlockSize}. */
    public static int nmaxInlineUniformBlockSize(long struct) { return memGetInt(struct + VkPhysicalDeviceInlineUniformBlockProperties.MAXINLINEUNIFORMBLOCKSIZE); }
    /** Unsafe version of {@link #maxPerStageDescriptorInlineUniformBlocks}. */
    public static int nmaxPerStageDescriptorInlineUniformBlocks(long struct) { return memGetInt(struct + VkPhysicalDeviceInlineUniformBlockProperties.MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(long struct) { return memGetInt(struct + VkPhysicalDeviceInlineUniformBlockProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxDescriptorSetInlineUniformBlocks}. */
    public static int nmaxDescriptorSetInlineUniformBlocks(long struct) { return memGetInt(struct + VkPhysicalDeviceInlineUniformBlockProperties.MAXDESCRIPTORSETINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindInlineUniformBlocks}. */
    public static int nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(long struct) { return memGetInt(struct + VkPhysicalDeviceInlineUniformBlockProperties.MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceInlineUniformBlockProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceInlineUniformBlockProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceInlineUniformBlockProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceInlineUniformBlockProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceInlineUniformBlockProperties ELEMENT_FACTORY = VkPhysicalDeviceInlineUniformBlockProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceInlineUniformBlockProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceInlineUniformBlockProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceInlineUniformBlockProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceInlineUniformBlockProperties.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceInlineUniformBlockProperties.npNext(address()); }
        /** @return the value of the {@code maxInlineUniformBlockSize} field. */
        @NativeType("uint32_t")
        public int maxInlineUniformBlockSize() { return VkPhysicalDeviceInlineUniformBlockProperties.nmaxInlineUniformBlockSize(address()); }
        /** @return the value of the {@code maxPerStageDescriptorInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockProperties.nmaxPerStageDescriptorInlineUniformBlocks(address()); }
        /** @return the value of the {@code maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockProperties.nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(address()); }
        /** @return the value of the {@code maxDescriptorSetInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockProperties.nmaxDescriptorSetInlineUniformBlocks(address()); }
        /** @return the value of the {@code maxDescriptorSetUpdateAfterBindInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceInlineUniformBlockProperties.nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceInlineUniformBlockProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceInlineUniformBlockProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES} value to the {@code sType} field. */
        public VkPhysicalDeviceInlineUniformBlockProperties.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceInlineUniformBlockProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceInlineUniformBlockProperties.npNext(address(), value); return this; }

    }

}