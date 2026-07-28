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
 * <pre><code>
 * struct VkDescriptorMappingSourceConstantOffsetEXT {
 *     uint32_t heapOffset;
 *     uint32_t heapArrayStride;
 *     {@link VkSamplerCreateInfo VkSamplerCreateInfo} const * pEmbeddedSampler;
 *     uint32_t samplerHeapOffset;
 *     uint32_t samplerHeapArrayStride;
 * }</code></pre>
 */
public class VkDescriptorMappingSourceConstantOffsetEXT extends Struct<VkDescriptorMappingSourceConstantOffsetEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEAPOFFSET,
        HEAPARRAYSTRIDE,
        PEMBEDDEDSAMPLER,
        SAMPLERHEAPOFFSET,
        SAMPLERHEAPARRAYSTRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAPOFFSET = layout.offsetof(0);
        HEAPARRAYSTRIDE = layout.offsetof(1);
        PEMBEDDEDSAMPLER = layout.offsetof(2);
        SAMPLERHEAPOFFSET = layout.offsetof(3);
        SAMPLERHEAPARRAYSTRIDE = layout.offsetof(4);
    }

    protected VkDescriptorMappingSourceConstantOffsetEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorMappingSourceConstantOffsetEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorMappingSourceConstantOffsetEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorMappingSourceConstantOffsetEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorMappingSourceConstantOffsetEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code heapOffset} field. */
    @NativeType("uint32_t")
    public int heapOffset() { return nheapOffset(address()); }
    /** @return the value of the {@code heapArrayStride} field. */
    @NativeType("uint32_t")
    public int heapArrayStride() { return nheapArrayStride(address()); }
    /** @return a {@link VkSamplerCreateInfo} view of the struct pointed to by the {@code pEmbeddedSampler} field. */
    @NativeType("VkSamplerCreateInfo const *")
    public @Nullable VkSamplerCreateInfo pEmbeddedSampler() { return npEmbeddedSampler(address()); }
    /** @return the value of the {@code samplerHeapOffset} field. */
    @NativeType("uint32_t")
    public int samplerHeapOffset() { return nsamplerHeapOffset(address()); }
    /** @return the value of the {@code samplerHeapArrayStride} field. */
    @NativeType("uint32_t")
    public int samplerHeapArrayStride() { return nsamplerHeapArrayStride(address()); }

    /** Sets the specified value to the {@code heapOffset} field. */
    public VkDescriptorMappingSourceConstantOffsetEXT heapOffset(@NativeType("uint32_t") int value) { nheapOffset(address(), value); return this; }
    /** Sets the specified value to the {@code heapArrayStride} field. */
    public VkDescriptorMappingSourceConstantOffsetEXT heapArrayStride(@NativeType("uint32_t") int value) { nheapArrayStride(address(), value); return this; }
    /** Sets the address of the specified {@link VkSamplerCreateInfo} to the {@code pEmbeddedSampler} field. */
    public VkDescriptorMappingSourceConstantOffsetEXT pEmbeddedSampler(@Nullable @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) { npEmbeddedSampler(address(), value); return this; }
    /** Sets the specified value to the {@code samplerHeapOffset} field. */
    public VkDescriptorMappingSourceConstantOffsetEXT samplerHeapOffset(@NativeType("uint32_t") int value) { nsamplerHeapOffset(address(), value); return this; }
    /** Sets the specified value to the {@code samplerHeapArrayStride} field. */
    public VkDescriptorMappingSourceConstantOffsetEXT samplerHeapArrayStride(@NativeType("uint32_t") int value) { nsamplerHeapArrayStride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorMappingSourceConstantOffsetEXT set(
        int heapOffset,
        int heapArrayStride,
        @Nullable VkSamplerCreateInfo pEmbeddedSampler,
        int samplerHeapOffset,
        int samplerHeapArrayStride
    ) {
        heapOffset(heapOffset);
        heapArrayStride(heapArrayStride);
        pEmbeddedSampler(pEmbeddedSampler);
        samplerHeapOffset(samplerHeapOffset);
        samplerHeapArrayStride(samplerHeapArrayStride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorMappingSourceConstantOffsetEXT set(VkDescriptorMappingSourceConstantOffsetEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorMappingSourceConstantOffsetEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceConstantOffsetEXT malloc() {
        return new VkDescriptorMappingSourceConstantOffsetEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceConstantOffsetEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceConstantOffsetEXT calloc() {
        return new VkDescriptorMappingSourceConstantOffsetEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceConstantOffsetEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorMappingSourceConstantOffsetEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceConstantOffsetEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorMappingSourceConstantOffsetEXT} instance for the specified memory address. */
    public static VkDescriptorMappingSourceConstantOffsetEXT create(long address) {
        return new VkDescriptorMappingSourceConstantOffsetEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorMappingSourceConstantOffsetEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorMappingSourceConstantOffsetEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceConstantOffsetEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceConstantOffsetEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceConstantOffsetEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceConstantOffsetEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceConstantOffsetEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceConstantOffsetEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorMappingSourceConstantOffsetEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceConstantOffsetEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorMappingSourceConstantOffsetEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceConstantOffsetEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceConstantOffsetEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceConstantOffsetEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceConstantOffsetEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceConstantOffsetEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceConstantOffsetEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceConstantOffsetEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceConstantOffsetEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceConstantOffsetEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceConstantOffsetEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #heapOffset}. */
    public static int nheapOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceConstantOffsetEXT.HEAPOFFSET); }
    /** Unsafe version of {@link #heapArrayStride}. */
    public static int nheapArrayStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourceConstantOffsetEXT.HEAPARRAYSTRIDE); }
    /** Unsafe version of {@link #pEmbeddedSampler}. */
    public static @Nullable VkSamplerCreateInfo npEmbeddedSampler(long struct) { return VkSamplerCreateInfo.createSafe(memGetAddress(struct + VkDescriptorMappingSourceConstantOffsetEXT.PEMBEDDEDSAMPLER)); }
    /** Unsafe version of {@link #samplerHeapOffset}. */
    public static int nsamplerHeapOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceConstantOffsetEXT.SAMPLERHEAPOFFSET); }
    /** Unsafe version of {@link #samplerHeapArrayStride}. */
    public static int nsamplerHeapArrayStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourceConstantOffsetEXT.SAMPLERHEAPARRAYSTRIDE); }

    /** Unsafe version of {@link #heapOffset(int) heapOffset}. */
    public static void nheapOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceConstantOffsetEXT.HEAPOFFSET, value); }
    /** Unsafe version of {@link #heapArrayStride(int) heapArrayStride}. */
    public static void nheapArrayStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceConstantOffsetEXT.HEAPARRAYSTRIDE, value); }
    /** Unsafe version of {@link #pEmbeddedSampler(VkSamplerCreateInfo) pEmbeddedSampler}. */
    public static void npEmbeddedSampler(long struct, @Nullable VkSamplerCreateInfo value) { memPutAddress(struct + VkDescriptorMappingSourceConstantOffsetEXT.PEMBEDDEDSAMPLER, memAddressSafe(value)); }
    /** Unsafe version of {@link #samplerHeapOffset(int) samplerHeapOffset}. */
    public static void nsamplerHeapOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceConstantOffsetEXT.SAMPLERHEAPOFFSET, value); }
    /** Unsafe version of {@link #samplerHeapArrayStride(int) samplerHeapArrayStride}. */
    public static void nsamplerHeapArrayStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceConstantOffsetEXT.SAMPLERHEAPARRAYSTRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorMappingSourceConstantOffsetEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceConstantOffsetEXT, Buffer> implements NativeResource {

        private static final VkDescriptorMappingSourceConstantOffsetEXT ELEMENT_FACTORY = VkDescriptorMappingSourceConstantOffsetEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorMappingSourceConstantOffsetEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorMappingSourceConstantOffsetEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorMappingSourceConstantOffsetEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code heapOffset} field. */
        @NativeType("uint32_t")
        public int heapOffset() { return VkDescriptorMappingSourceConstantOffsetEXT.nheapOffset(address()); }
        /** @return the value of the {@code heapArrayStride} field. */
        @NativeType("uint32_t")
        public int heapArrayStride() { return VkDescriptorMappingSourceConstantOffsetEXT.nheapArrayStride(address()); }
        /** @return a {@link VkSamplerCreateInfo} view of the struct pointed to by the {@code pEmbeddedSampler} field. */
        @NativeType("VkSamplerCreateInfo const *")
        public @Nullable VkSamplerCreateInfo pEmbeddedSampler() { return VkDescriptorMappingSourceConstantOffsetEXT.npEmbeddedSampler(address()); }
        /** @return the value of the {@code samplerHeapOffset} field. */
        @NativeType("uint32_t")
        public int samplerHeapOffset() { return VkDescriptorMappingSourceConstantOffsetEXT.nsamplerHeapOffset(address()); }
        /** @return the value of the {@code samplerHeapArrayStride} field. */
        @NativeType("uint32_t")
        public int samplerHeapArrayStride() { return VkDescriptorMappingSourceConstantOffsetEXT.nsamplerHeapArrayStride(address()); }

        /** Sets the specified value to the {@code heapOffset} field. */
        public VkDescriptorMappingSourceConstantOffsetEXT.Buffer heapOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceConstantOffsetEXT.nheapOffset(address(), value); return this; }
        /** Sets the specified value to the {@code heapArrayStride} field. */
        public VkDescriptorMappingSourceConstantOffsetEXT.Buffer heapArrayStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceConstantOffsetEXT.nheapArrayStride(address(), value); return this; }
        /** Sets the address of the specified {@link VkSamplerCreateInfo} to the {@code pEmbeddedSampler} field. */
        public VkDescriptorMappingSourceConstantOffsetEXT.Buffer pEmbeddedSampler(@Nullable @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) { VkDescriptorMappingSourceConstantOffsetEXT.npEmbeddedSampler(address(), value); return this; }
        /** Sets the specified value to the {@code samplerHeapOffset} field. */
        public VkDescriptorMappingSourceConstantOffsetEXT.Buffer samplerHeapOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceConstantOffsetEXT.nsamplerHeapOffset(address(), value); return this; }
        /** Sets the specified value to the {@code samplerHeapArrayStride} field. */
        public VkDescriptorMappingSourceConstantOffsetEXT.Buffer samplerHeapArrayStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceConstantOffsetEXT.nsamplerHeapArrayStride(address(), value); return this; }

    }

}