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
 * struct VkDescriptorSetLayoutBinding {
 *     uint32_t binding;
 *     VkDescriptorType descriptorType;
 *     uint32_t descriptorCount;
 *     VkShaderStageFlags stageFlags;
 *     VkSampler const * pImmutableSamplers;
 * }}</pre>
 */
public class VkDescriptorSetLayoutBinding extends Struct<VkDescriptorSetLayoutBinding> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BINDING,
        DESCRIPTORTYPE,
        DESCRIPTORCOUNT,
        STAGEFLAGS,
        PIMMUTABLESAMPLERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BINDING = layout.offsetof(0);
        DESCRIPTORTYPE = layout.offsetof(1);
        DESCRIPTORCOUNT = layout.offsetof(2);
        STAGEFLAGS = layout.offsetof(3);
        PIMMUTABLESAMPLERS = layout.offsetof(4);
    }

    protected VkDescriptorSetLayoutBinding(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorSetLayoutBinding create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorSetLayoutBinding(address, container);
    }

    /**
     * Creates a {@code VkDescriptorSetLayoutBinding} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetLayoutBinding(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code binding} field. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** @return the value of the {@code descriptorType} field. */
    @NativeType("VkDescriptorType")
    public int descriptorType() { return ndescriptorType(address()); }
    /** @return the value of the {@code descriptorCount} field. */
    @NativeType("uint32_t")
    public int descriptorCount() { return ndescriptorCount(address()); }
    /** @return the value of the {@code stageFlags} field. */
    @NativeType("VkShaderStageFlags")
    public int stageFlags() { return nstageFlags(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pImmutableSamplers} field. */
    @NativeType("VkSampler const *")
    public @Nullable LongBuffer pImmutableSamplers() { return npImmutableSamplers(address()); }

    /** Sets the specified value to the {@code binding} field. */
    public VkDescriptorSetLayoutBinding binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorType} field. */
    public VkDescriptorSetLayoutBinding descriptorType(@NativeType("VkDescriptorType") int value) { ndescriptorType(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorCount} field. */
    public VkDescriptorSetLayoutBinding descriptorCount(@NativeType("uint32_t") int value) { ndescriptorCount(address(), value); return this; }
    /** Sets the specified value to the {@code stageFlags} field. */
    public VkDescriptorSetLayoutBinding stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pImmutableSamplers} field. */
    public VkDescriptorSetLayoutBinding pImmutableSamplers(@Nullable @NativeType("VkSampler const *") LongBuffer value) { npImmutableSamplers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetLayoutBinding set(
        int binding,
        int descriptorType,
        int descriptorCount,
        int stageFlags,
        @Nullable LongBuffer pImmutableSamplers
    ) {
        binding(binding);
        descriptorType(descriptorType);
        descriptorCount(descriptorCount);
        stageFlags(stageFlags);
        pImmutableSamplers(pImmutableSamplers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetLayoutBinding set(VkDescriptorSetLayoutBinding src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetLayoutBinding} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutBinding malloc() {
        return new VkDescriptorSetLayoutBinding(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetLayoutBinding} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutBinding calloc() {
        return new VkDescriptorSetLayoutBinding(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetLayoutBinding} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetLayoutBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetLayoutBinding(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetLayoutBinding} instance for the specified memory address. */
    public static VkDescriptorSetLayoutBinding create(long address) {
        return new VkDescriptorSetLayoutBinding(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorSetLayoutBinding createSafe(long address) {
        return address == NULL ? null : new VkDescriptorSetLayoutBinding(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBinding.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBinding.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBinding.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorSetLayoutBinding.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBinding.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorSetLayoutBinding.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorSetLayoutBinding} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutBinding malloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutBinding(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorSetLayoutBinding} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutBinding calloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutBinding(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBinding.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBinding.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBinding.BINDING); }
    /** Unsafe version of {@link #descriptorType}. */
    public static int ndescriptorType(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBinding.DESCRIPTORTYPE); }
    /** Unsafe version of {@link #descriptorCount}. */
    public static int ndescriptorCount(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBinding.DESCRIPTORCOUNT); }
    /** Unsafe version of {@link #stageFlags}. */
    public static int nstageFlags(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBinding.STAGEFLAGS); }
    /** Unsafe version of {@link #pImmutableSamplers() pImmutableSamplers}. */
    public static @Nullable LongBuffer npImmutableSamplers(long struct) { return memLongBufferSafe(memGetAddress(struct + VkDescriptorSetLayoutBinding.PIMMUTABLESAMPLERS), ndescriptorCount(struct)); }

    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBinding.BINDING, value); }
    /** Unsafe version of {@link #descriptorType(int) descriptorType}. */
    public static void ndescriptorType(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBinding.DESCRIPTORTYPE, value); }
    /** Sets the specified value to the {@code descriptorCount} field of the specified {@code struct}. */
    public static void ndescriptorCount(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBinding.DESCRIPTORCOUNT, value); }
    /** Unsafe version of {@link #stageFlags(int) stageFlags}. */
    public static void nstageFlags(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBinding.STAGEFLAGS, value); }
    /** Unsafe version of {@link #pImmutableSamplers(LongBuffer) pImmutableSamplers}. */
    public static void npImmutableSamplers(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkDescriptorSetLayoutBinding.PIMMUTABLESAMPLERS, memAddressSafe(value)); if (value != null) { ndescriptorCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetLayoutBinding} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetLayoutBinding, Buffer> implements NativeResource {

        private static final VkDescriptorSetLayoutBinding ELEMENT_FACTORY = VkDescriptorSetLayoutBinding.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetLayoutBinding.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetLayoutBinding#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorSetLayoutBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code binding} field. */
        @NativeType("uint32_t")
        public int binding() { return VkDescriptorSetLayoutBinding.nbinding(address()); }
        /** @return the value of the {@code descriptorType} field. */
        @NativeType("VkDescriptorType")
        public int descriptorType() { return VkDescriptorSetLayoutBinding.ndescriptorType(address()); }
        /** @return the value of the {@code descriptorCount} field. */
        @NativeType("uint32_t")
        public int descriptorCount() { return VkDescriptorSetLayoutBinding.ndescriptorCount(address()); }
        /** @return the value of the {@code stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkDescriptorSetLayoutBinding.nstageFlags(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pImmutableSamplers} field. */
        @NativeType("VkSampler const *")
        public @Nullable LongBuffer pImmutableSamplers() { return VkDescriptorSetLayoutBinding.npImmutableSamplers(address()); }

        /** Sets the specified value to the {@code binding} field. */
        public VkDescriptorSetLayoutBinding.Buffer binding(@NativeType("uint32_t") int value) { VkDescriptorSetLayoutBinding.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorType} field. */
        public VkDescriptorSetLayoutBinding.Buffer descriptorType(@NativeType("VkDescriptorType") int value) { VkDescriptorSetLayoutBinding.ndescriptorType(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorCount} field. */
        public VkDescriptorSetLayoutBinding.Buffer descriptorCount(@NativeType("uint32_t") int value) { VkDescriptorSetLayoutBinding.ndescriptorCount(address(), value); return this; }
        /** Sets the specified value to the {@code stageFlags} field. */
        public VkDescriptorSetLayoutBinding.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkDescriptorSetLayoutBinding.nstageFlags(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pImmutableSamplers} field. */
        public VkDescriptorSetLayoutBinding.Buffer pImmutableSamplers(@Nullable @NativeType("VkSampler const *") LongBuffer value) { VkDescriptorSetLayoutBinding.npImmutableSamplers(address(), value); return this; }

    }

}