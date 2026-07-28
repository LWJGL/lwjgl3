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
 * struct VkDescriptorMappingSourcePushIndexEXT {
 *     uint32_t heapOffset;
 *     uint32_t pushOffset;
 *     uint32_t heapIndexStride;
 *     uint32_t heapArrayStride;
 *     {@link VkSamplerCreateInfo VkSamplerCreateInfo} const * pEmbeddedSampler;
 *     VkBool32 useCombinedImageSamplerIndex;
 *     uint32_t samplerHeapOffset;
 *     uint32_t samplerPushOffset;
 *     uint32_t samplerHeapIndexStride;
 *     uint32_t samplerHeapArrayStride;
 * }</code></pre>
 */
public class VkDescriptorMappingSourcePushIndexEXT extends Struct<VkDescriptorMappingSourcePushIndexEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEAPOFFSET,
        PUSHOFFSET,
        HEAPINDEXSTRIDE,
        HEAPARRAYSTRIDE,
        PEMBEDDEDSAMPLER,
        USECOMBINEDIMAGESAMPLERINDEX,
        SAMPLERHEAPOFFSET,
        SAMPLERPUSHOFFSET,
        SAMPLERHEAPINDEXSTRIDE,
        SAMPLERHEAPARRAYSTRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
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

        HEAPOFFSET = layout.offsetof(0);
        PUSHOFFSET = layout.offsetof(1);
        HEAPINDEXSTRIDE = layout.offsetof(2);
        HEAPARRAYSTRIDE = layout.offsetof(3);
        PEMBEDDEDSAMPLER = layout.offsetof(4);
        USECOMBINEDIMAGESAMPLERINDEX = layout.offsetof(5);
        SAMPLERHEAPOFFSET = layout.offsetof(6);
        SAMPLERPUSHOFFSET = layout.offsetof(7);
        SAMPLERHEAPINDEXSTRIDE = layout.offsetof(8);
        SAMPLERHEAPARRAYSTRIDE = layout.offsetof(9);
    }

    protected VkDescriptorMappingSourcePushIndexEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorMappingSourcePushIndexEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorMappingSourcePushIndexEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorMappingSourcePushIndexEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorMappingSourcePushIndexEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code heapOffset} field. */
    @NativeType("uint32_t")
    public int heapOffset() { return nheapOffset(address()); }
    /** @return the value of the {@code pushOffset} field. */
    @NativeType("uint32_t")
    public int pushOffset() { return npushOffset(address()); }
    /** @return the value of the {@code heapIndexStride} field. */
    @NativeType("uint32_t")
    public int heapIndexStride() { return nheapIndexStride(address()); }
    /** @return the value of the {@code heapArrayStride} field. */
    @NativeType("uint32_t")
    public int heapArrayStride() { return nheapArrayStride(address()); }
    /** @return a {@link VkSamplerCreateInfo} view of the struct pointed to by the {@code pEmbeddedSampler} field. */
    @NativeType("VkSamplerCreateInfo const *")
    public @Nullable VkSamplerCreateInfo pEmbeddedSampler() { return npEmbeddedSampler(address()); }
    /** @return the value of the {@code useCombinedImageSamplerIndex} field. */
    @NativeType("VkBool32")
    public boolean useCombinedImageSamplerIndex() { return nuseCombinedImageSamplerIndex(address()) != 0; }
    /** @return the value of the {@code samplerHeapOffset} field. */
    @NativeType("uint32_t")
    public int samplerHeapOffset() { return nsamplerHeapOffset(address()); }
    /** @return the value of the {@code samplerPushOffset} field. */
    @NativeType("uint32_t")
    public int samplerPushOffset() { return nsamplerPushOffset(address()); }
    /** @return the value of the {@code samplerHeapIndexStride} field. */
    @NativeType("uint32_t")
    public int samplerHeapIndexStride() { return nsamplerHeapIndexStride(address()); }
    /** @return the value of the {@code samplerHeapArrayStride} field. */
    @NativeType("uint32_t")
    public int samplerHeapArrayStride() { return nsamplerHeapArrayStride(address()); }

    /** Sets the specified value to the {@code heapOffset} field. */
    public VkDescriptorMappingSourcePushIndexEXT heapOffset(@NativeType("uint32_t") int value) { nheapOffset(address(), value); return this; }
    /** Sets the specified value to the {@code pushOffset} field. */
    public VkDescriptorMappingSourcePushIndexEXT pushOffset(@NativeType("uint32_t") int value) { npushOffset(address(), value); return this; }
    /** Sets the specified value to the {@code heapIndexStride} field. */
    public VkDescriptorMappingSourcePushIndexEXT heapIndexStride(@NativeType("uint32_t") int value) { nheapIndexStride(address(), value); return this; }
    /** Sets the specified value to the {@code heapArrayStride} field. */
    public VkDescriptorMappingSourcePushIndexEXT heapArrayStride(@NativeType("uint32_t") int value) { nheapArrayStride(address(), value); return this; }
    /** Sets the address of the specified {@link VkSamplerCreateInfo} to the {@code pEmbeddedSampler} field. */
    public VkDescriptorMappingSourcePushIndexEXT pEmbeddedSampler(@Nullable @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) { npEmbeddedSampler(address(), value); return this; }
    /** Sets the specified value to the {@code useCombinedImageSamplerIndex} field. */
    public VkDescriptorMappingSourcePushIndexEXT useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) { nuseCombinedImageSamplerIndex(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code samplerHeapOffset} field. */
    public VkDescriptorMappingSourcePushIndexEXT samplerHeapOffset(@NativeType("uint32_t") int value) { nsamplerHeapOffset(address(), value); return this; }
    /** Sets the specified value to the {@code samplerPushOffset} field. */
    public VkDescriptorMappingSourcePushIndexEXT samplerPushOffset(@NativeType("uint32_t") int value) { nsamplerPushOffset(address(), value); return this; }
    /** Sets the specified value to the {@code samplerHeapIndexStride} field. */
    public VkDescriptorMappingSourcePushIndexEXT samplerHeapIndexStride(@NativeType("uint32_t") int value) { nsamplerHeapIndexStride(address(), value); return this; }
    /** Sets the specified value to the {@code samplerHeapArrayStride} field. */
    public VkDescriptorMappingSourcePushIndexEXT samplerHeapArrayStride(@NativeType("uint32_t") int value) { nsamplerHeapArrayStride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorMappingSourcePushIndexEXT set(
        int heapOffset,
        int pushOffset,
        int heapIndexStride,
        int heapArrayStride,
        @Nullable VkSamplerCreateInfo pEmbeddedSampler,
        boolean useCombinedImageSamplerIndex,
        int samplerHeapOffset,
        int samplerPushOffset,
        int samplerHeapIndexStride,
        int samplerHeapArrayStride
    ) {
        heapOffset(heapOffset);
        pushOffset(pushOffset);
        heapIndexStride(heapIndexStride);
        heapArrayStride(heapArrayStride);
        pEmbeddedSampler(pEmbeddedSampler);
        useCombinedImageSamplerIndex(useCombinedImageSamplerIndex);
        samplerHeapOffset(samplerHeapOffset);
        samplerPushOffset(samplerPushOffset);
        samplerHeapIndexStride(samplerHeapIndexStride);
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
    public VkDescriptorMappingSourcePushIndexEXT set(VkDescriptorMappingSourcePushIndexEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorMappingSourcePushIndexEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourcePushIndexEXT malloc() {
        return new VkDescriptorMappingSourcePushIndexEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourcePushIndexEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourcePushIndexEXT calloc() {
        return new VkDescriptorMappingSourcePushIndexEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourcePushIndexEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorMappingSourcePushIndexEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourcePushIndexEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorMappingSourcePushIndexEXT} instance for the specified memory address. */
    public static VkDescriptorMappingSourcePushIndexEXT create(long address) {
        return new VkDescriptorMappingSourcePushIndexEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorMappingSourcePushIndexEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorMappingSourcePushIndexEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourcePushIndexEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourcePushIndexEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourcePushIndexEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourcePushIndexEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourcePushIndexEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourcePushIndexEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorMappingSourcePushIndexEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourcePushIndexEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorMappingSourcePushIndexEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourcePushIndexEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourcePushIndexEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourcePushIndexEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourcePushIndexEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourcePushIndexEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourcePushIndexEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourcePushIndexEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourcePushIndexEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourcePushIndexEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourcePushIndexEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #heapOffset}. */
    public static int nheapOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourcePushIndexEXT.HEAPOFFSET); }
    /** Unsafe version of {@link #pushOffset}. */
    public static int npushOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourcePushIndexEXT.PUSHOFFSET); }
    /** Unsafe version of {@link #heapIndexStride}. */
    public static int nheapIndexStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourcePushIndexEXT.HEAPINDEXSTRIDE); }
    /** Unsafe version of {@link #heapArrayStride}. */
    public static int nheapArrayStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourcePushIndexEXT.HEAPARRAYSTRIDE); }
    /** Unsafe version of {@link #pEmbeddedSampler}. */
    public static @Nullable VkSamplerCreateInfo npEmbeddedSampler(long struct) { return VkSamplerCreateInfo.createSafe(memGetAddress(struct + VkDescriptorMappingSourcePushIndexEXT.PEMBEDDEDSAMPLER)); }
    /** Unsafe version of {@link #useCombinedImageSamplerIndex}. */
    public static int nuseCombinedImageSamplerIndex(long struct) { return memGetInt(struct + VkDescriptorMappingSourcePushIndexEXT.USECOMBINEDIMAGESAMPLERINDEX); }
    /** Unsafe version of {@link #samplerHeapOffset}. */
    public static int nsamplerHeapOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPOFFSET); }
    /** Unsafe version of {@link #samplerPushOffset}. */
    public static int nsamplerPushOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourcePushIndexEXT.SAMPLERPUSHOFFSET); }
    /** Unsafe version of {@link #samplerHeapIndexStride}. */
    public static int nsamplerHeapIndexStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPINDEXSTRIDE); }
    /** Unsafe version of {@link #samplerHeapArrayStride}. */
    public static int nsamplerHeapArrayStride(long struct) { return memGetInt(struct + VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPARRAYSTRIDE); }

    /** Unsafe version of {@link #heapOffset(int) heapOffset}. */
    public static void nheapOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourcePushIndexEXT.HEAPOFFSET, value); }
    /** Unsafe version of {@link #pushOffset(int) pushOffset}. */
    public static void npushOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourcePushIndexEXT.PUSHOFFSET, value); }
    /** Unsafe version of {@link #heapIndexStride(int) heapIndexStride}. */
    public static void nheapIndexStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourcePushIndexEXT.HEAPINDEXSTRIDE, value); }
    /** Unsafe version of {@link #heapArrayStride(int) heapArrayStride}. */
    public static void nheapArrayStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourcePushIndexEXT.HEAPARRAYSTRIDE, value); }
    /** Unsafe version of {@link #pEmbeddedSampler(VkSamplerCreateInfo) pEmbeddedSampler}. */
    public static void npEmbeddedSampler(long struct, @Nullable VkSamplerCreateInfo value) { memPutAddress(struct + VkDescriptorMappingSourcePushIndexEXT.PEMBEDDEDSAMPLER, memAddressSafe(value)); }
    /** Unsafe version of {@link #useCombinedImageSamplerIndex(boolean) useCombinedImageSamplerIndex}. */
    public static void nuseCombinedImageSamplerIndex(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourcePushIndexEXT.USECOMBINEDIMAGESAMPLERINDEX, value); }
    /** Unsafe version of {@link #samplerHeapOffset(int) samplerHeapOffset}. */
    public static void nsamplerHeapOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPOFFSET, value); }
    /** Unsafe version of {@link #samplerPushOffset(int) samplerPushOffset}. */
    public static void nsamplerPushOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourcePushIndexEXT.SAMPLERPUSHOFFSET, value); }
    /** Unsafe version of {@link #samplerHeapIndexStride(int) samplerHeapIndexStride}. */
    public static void nsamplerHeapIndexStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPINDEXSTRIDE, value); }
    /** Unsafe version of {@link #samplerHeapArrayStride(int) samplerHeapArrayStride}. */
    public static void nsamplerHeapArrayStride(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPARRAYSTRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorMappingSourcePushIndexEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourcePushIndexEXT, Buffer> implements NativeResource {

        private static final VkDescriptorMappingSourcePushIndexEXT ELEMENT_FACTORY = VkDescriptorMappingSourcePushIndexEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorMappingSourcePushIndexEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorMappingSourcePushIndexEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorMappingSourcePushIndexEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code heapOffset} field. */
        @NativeType("uint32_t")
        public int heapOffset() { return VkDescriptorMappingSourcePushIndexEXT.nheapOffset(address()); }
        /** @return the value of the {@code pushOffset} field. */
        @NativeType("uint32_t")
        public int pushOffset() { return VkDescriptorMappingSourcePushIndexEXT.npushOffset(address()); }
        /** @return the value of the {@code heapIndexStride} field. */
        @NativeType("uint32_t")
        public int heapIndexStride() { return VkDescriptorMappingSourcePushIndexEXT.nheapIndexStride(address()); }
        /** @return the value of the {@code heapArrayStride} field. */
        @NativeType("uint32_t")
        public int heapArrayStride() { return VkDescriptorMappingSourcePushIndexEXT.nheapArrayStride(address()); }
        /** @return a {@link VkSamplerCreateInfo} view of the struct pointed to by the {@code pEmbeddedSampler} field. */
        @NativeType("VkSamplerCreateInfo const *")
        public @Nullable VkSamplerCreateInfo pEmbeddedSampler() { return VkDescriptorMappingSourcePushIndexEXT.npEmbeddedSampler(address()); }
        /** @return the value of the {@code useCombinedImageSamplerIndex} field. */
        @NativeType("VkBool32")
        public boolean useCombinedImageSamplerIndex() { return VkDescriptorMappingSourcePushIndexEXT.nuseCombinedImageSamplerIndex(address()) != 0; }
        /** @return the value of the {@code samplerHeapOffset} field. */
        @NativeType("uint32_t")
        public int samplerHeapOffset() { return VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapOffset(address()); }
        /** @return the value of the {@code samplerPushOffset} field. */
        @NativeType("uint32_t")
        public int samplerPushOffset() { return VkDescriptorMappingSourcePushIndexEXT.nsamplerPushOffset(address()); }
        /** @return the value of the {@code samplerHeapIndexStride} field. */
        @NativeType("uint32_t")
        public int samplerHeapIndexStride() { return VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapIndexStride(address()); }
        /** @return the value of the {@code samplerHeapArrayStride} field. */
        @NativeType("uint32_t")
        public int samplerHeapArrayStride() { return VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapArrayStride(address()); }

        /** Sets the specified value to the {@code heapOffset} field. */
        public VkDescriptorMappingSourcePushIndexEXT.Buffer heapOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourcePushIndexEXT.nheapOffset(address(), value); return this; }
        /** Sets the specified value to the {@code pushOffset} field. */
        public VkDescriptorMappingSourcePushIndexEXT.Buffer pushOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourcePushIndexEXT.npushOffset(address(), value); return this; }
        /** Sets the specified value to the {@code heapIndexStride} field. */
        public VkDescriptorMappingSourcePushIndexEXT.Buffer heapIndexStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourcePushIndexEXT.nheapIndexStride(address(), value); return this; }
        /** Sets the specified value to the {@code heapArrayStride} field. */
        public VkDescriptorMappingSourcePushIndexEXT.Buffer heapArrayStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourcePushIndexEXT.nheapArrayStride(address(), value); return this; }
        /** Sets the address of the specified {@link VkSamplerCreateInfo} to the {@code pEmbeddedSampler} field. */
        public VkDescriptorMappingSourcePushIndexEXT.Buffer pEmbeddedSampler(@Nullable @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo value) { VkDescriptorMappingSourcePushIndexEXT.npEmbeddedSampler(address(), value); return this; }
        /** Sets the specified value to the {@code useCombinedImageSamplerIndex} field. */
        public VkDescriptorMappingSourcePushIndexEXT.Buffer useCombinedImageSamplerIndex(@NativeType("VkBool32") boolean value) { VkDescriptorMappingSourcePushIndexEXT.nuseCombinedImageSamplerIndex(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code samplerHeapOffset} field. */
        public VkDescriptorMappingSourcePushIndexEXT.Buffer samplerHeapOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapOffset(address(), value); return this; }
        /** Sets the specified value to the {@code samplerPushOffset} field. */
        public VkDescriptorMappingSourcePushIndexEXT.Buffer samplerPushOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourcePushIndexEXT.nsamplerPushOffset(address(), value); return this; }
        /** Sets the specified value to the {@code samplerHeapIndexStride} field. */
        public VkDescriptorMappingSourcePushIndexEXT.Buffer samplerHeapIndexStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapIndexStride(address(), value); return this; }
        /** Sets the specified value to the {@code samplerHeapArrayStride} field. */
        public VkDescriptorMappingSourcePushIndexEXT.Buffer samplerHeapArrayStride(@NativeType("uint32_t") int value) { VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapArrayStride(address(), value); return this; }

    }

}