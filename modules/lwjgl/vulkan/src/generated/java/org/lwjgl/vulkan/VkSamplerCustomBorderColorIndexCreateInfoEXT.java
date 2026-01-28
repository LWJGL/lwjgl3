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
 * struct VkSamplerCustomBorderColorIndexCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t index;
 * }}</pre>
 */
public class VkSamplerCustomBorderColorIndexCreateInfoEXT extends Struct<VkSamplerCustomBorderColorIndexCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INDEX;

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
        INDEX = layout.offsetof(2);
    }

    protected VkSamplerCustomBorderColorIndexCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSamplerCustomBorderColorIndexCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkSamplerCustomBorderColorIndexCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerCustomBorderColorIndexCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code index} field. */
    @NativeType("uint32_t")
    public int index() { return nindex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSamplerCustomBorderColorIndexCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_INDEX_CREATE_INFO_EXT STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_INDEX_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkSamplerCustomBorderColorIndexCreateInfoEXT sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_INDEX_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSamplerCustomBorderColorIndexCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code index} field. */
    public VkSamplerCustomBorderColorIndexCreateInfoEXT index(@NativeType("uint32_t") int value) { nindex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerCustomBorderColorIndexCreateInfoEXT set(
        int sType,
        long pNext,
        int index
    ) {
        sType(sType);
        pNext(pNext);
        index(index);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerCustomBorderColorIndexCreateInfoEXT set(VkSamplerCustomBorderColorIndexCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerCustomBorderColorIndexCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerCustomBorderColorIndexCreateInfoEXT malloc() {
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerCustomBorderColorIndexCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerCustomBorderColorIndexCreateInfoEXT calloc() {
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerCustomBorderColorIndexCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSamplerCustomBorderColorIndexCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerCustomBorderColorIndexCreateInfoEXT} instance for the specified memory address. */
    public static VkSamplerCustomBorderColorIndexCreateInfoEXT create(long address) {
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSamplerCustomBorderColorIndexCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkSamplerCustomBorderColorIndexCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSamplerCustomBorderColorIndexCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSamplerCustomBorderColorIndexCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerCustomBorderColorIndexCreateInfoEXT malloc(MemoryStack stack) {
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSamplerCustomBorderColorIndexCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerCustomBorderColorIndexCreateInfoEXT calloc(MemoryStack stack) {
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSamplerCustomBorderColorIndexCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerCustomBorderColorIndexCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #index}. */
    public static int nindex(long struct) { return memGetInt(struct + VkSamplerCustomBorderColorIndexCreateInfoEXT.INDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSamplerCustomBorderColorIndexCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerCustomBorderColorIndexCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #index(int) index}. */
    public static void nindex(long struct, int value) { memPutInt(struct + VkSamplerCustomBorderColorIndexCreateInfoEXT.INDEX, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerCustomBorderColorIndexCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSamplerCustomBorderColorIndexCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkSamplerCustomBorderColorIndexCreateInfoEXT ELEMENT_FACTORY = VkSamplerCustomBorderColorIndexCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerCustomBorderColorIndexCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSamplerCustomBorderColorIndexCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerCustomBorderColorIndexCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSamplerCustomBorderColorIndexCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code index} field. */
        @NativeType("uint32_t")
        public int index() { return VkSamplerCustomBorderColorIndexCreateInfoEXT.nindex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerCustomBorderColorIndexCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_INDEX_CREATE_INFO_EXT STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_INDEX_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_INDEX_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSamplerCustomBorderColorIndexCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code index} field. */
        public VkSamplerCustomBorderColorIndexCreateInfoEXT.Buffer index(@NativeType("uint32_t") int value) { VkSamplerCustomBorderColorIndexCreateInfoEXT.nindex(address(), value); return this; }

    }

}