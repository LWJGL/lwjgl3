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
 * struct VkDescriptorPoolInlineUniformBlockCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t maxInlineUniformBlockBindings;
 * }}</pre>
 */
public class VkDescriptorPoolInlineUniformBlockCreateInfo extends Struct<VkDescriptorPoolInlineUniformBlockCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXINLINEUNIFORMBLOCKBINDINGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXINLINEUNIFORMBLOCKBINDINGS = layout.offsetof(2);
    }

    protected VkDescriptorPoolInlineUniformBlockCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorPoolInlineUniformBlockCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorPoolInlineUniformBlockCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code maxInlineUniformBlockBindings} field. */
    @NativeType("uint32_t")
    public int maxInlineUniformBlockBindings() { return nmaxInlineUniformBlockBindings(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorPoolInlineUniformBlockCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO} value to the {@code sType} field. */
    public VkDescriptorPoolInlineUniformBlockCreateInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorPoolInlineUniformBlockCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code maxInlineUniformBlockBindings} field. */
    public VkDescriptorPoolInlineUniformBlockCreateInfo maxInlineUniformBlockBindings(@NativeType("uint32_t") int value) { nmaxInlineUniformBlockBindings(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorPoolInlineUniformBlockCreateInfo set(
        int sType,
        long pNext,
        int maxInlineUniformBlockBindings
    ) {
        sType(sType);
        pNext(pNext);
        maxInlineUniformBlockBindings(maxInlineUniformBlockBindings);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorPoolInlineUniformBlockCreateInfo set(VkDescriptorPoolInlineUniformBlockCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo malloc() {
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo calloc() {
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance for the specified memory address. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo create(long address) {
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorPoolInlineUniformBlockCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkDescriptorPoolInlineUniformBlockCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo malloc(MemoryStack stack) {
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo calloc(MemoryStack stack) {
        return new VkDescriptorPoolInlineUniformBlockCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDescriptorPoolInlineUniformBlockCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorPoolInlineUniformBlockCreateInfo.PNEXT); }
    /** Unsafe version of {@link #maxInlineUniformBlockBindings}. */
    public static int nmaxInlineUniformBlockBindings(long struct) { return memGetInt(struct + VkDescriptorPoolInlineUniformBlockCreateInfo.MAXINLINEUNIFORMBLOCKBINDINGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorPoolInlineUniformBlockCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorPoolInlineUniformBlockCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #maxInlineUniformBlockBindings(int) maxInlineUniformBlockBindings}. */
    public static void nmaxInlineUniformBlockBindings(long struct, int value) { memPutInt(struct + VkDescriptorPoolInlineUniformBlockCreateInfo.MAXINLINEUNIFORMBLOCKBINDINGS, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorPoolInlineUniformBlockCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorPoolInlineUniformBlockCreateInfo, Buffer> implements NativeResource {

        private static final VkDescriptorPoolInlineUniformBlockCreateInfo ELEMENT_FACTORY = VkDescriptorPoolInlineUniformBlockCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorPoolInlineUniformBlockCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorPoolInlineUniformBlockCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorPoolInlineUniformBlockCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorPoolInlineUniformBlockCreateInfo.npNext(address()); }
        /** @return the value of the {@code maxInlineUniformBlockBindings} field. */
        @NativeType("uint32_t")
        public int maxInlineUniformBlockBindings() { return VkDescriptorPoolInlineUniformBlockCreateInfo.nmaxInlineUniformBlockBindings(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorPoolInlineUniformBlockCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO} value to the {@code sType} field. */
        public VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorPoolInlineUniformBlockCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code maxInlineUniformBlockBindings} field. */
        public VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer maxInlineUniformBlockBindings(@NativeType("uint32_t") int value) { VkDescriptorPoolInlineUniformBlockCreateInfo.nmaxInlineUniformBlockBindings(address(), value); return this; }

    }

}