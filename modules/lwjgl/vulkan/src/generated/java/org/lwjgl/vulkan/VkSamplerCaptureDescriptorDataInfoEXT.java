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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a sampler for descriptor capture.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sampler} <b>must</b> have been created with {@link EXTDescriptorBuffer#VK_SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT} set in {@link VkSamplerCreateInfo}{@code ::flags}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code sampler} <b>must</b> be a valid {@code VkSampler} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDescriptorBuffer#vkGetSamplerOpaqueCaptureDescriptorDataEXT GetSamplerOpaqueCaptureDescriptorDataEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSamplerCaptureDescriptorDataInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSampler {@link #sampler};
 * }</code></pre>
 */
public class VkSamplerCaptureDescriptorDataInfoEXT extends Struct<VkSamplerCaptureDescriptorDataInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLER = layout.offsetof(2);
    }

    protected VkSamplerCaptureDescriptorDataInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSamplerCaptureDescriptorDataInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSamplerCaptureDescriptorDataInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkSamplerCaptureDescriptorDataInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerCaptureDescriptorDataInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the {@code VkSampler} handle of the sampler to get opaque capture data for. */
    @NativeType("VkSampler")
    public long sampler() { return nsampler(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSamplerCaptureDescriptorDataInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT} value to the {@link #sType} field. */
    public VkSamplerCaptureDescriptorDataInfoEXT sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSamplerCaptureDescriptorDataInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #sampler} field. */
    public VkSamplerCaptureDescriptorDataInfoEXT sampler(@NativeType("VkSampler") long value) { nsampler(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerCaptureDescriptorDataInfoEXT set(
        int sType,
        long pNext,
        long sampler
    ) {
        sType(sType);
        pNext(pNext);
        sampler(sampler);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerCaptureDescriptorDataInfoEXT set(VkSamplerCaptureDescriptorDataInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerCaptureDescriptorDataInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerCaptureDescriptorDataInfoEXT malloc() {
        return new VkSamplerCaptureDescriptorDataInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerCaptureDescriptorDataInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerCaptureDescriptorDataInfoEXT calloc() {
        return new VkSamplerCaptureDescriptorDataInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerCaptureDescriptorDataInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSamplerCaptureDescriptorDataInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerCaptureDescriptorDataInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerCaptureDescriptorDataInfoEXT} instance for the specified memory address. */
    public static VkSamplerCaptureDescriptorDataInfoEXT create(long address) {
        return new VkSamplerCaptureDescriptorDataInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerCaptureDescriptorDataInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkSamplerCaptureDescriptorDataInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkSamplerCaptureDescriptorDataInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCaptureDescriptorDataInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCaptureDescriptorDataInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCaptureDescriptorDataInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCaptureDescriptorDataInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCaptureDescriptorDataInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSamplerCaptureDescriptorDataInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerCaptureDescriptorDataInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerCaptureDescriptorDataInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSamplerCaptureDescriptorDataInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerCaptureDescriptorDataInfoEXT malloc(MemoryStack stack) {
        return new VkSamplerCaptureDescriptorDataInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSamplerCaptureDescriptorDataInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerCaptureDescriptorDataInfoEXT calloc(MemoryStack stack) {
        return new VkSamplerCaptureDescriptorDataInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSamplerCaptureDescriptorDataInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerCaptureDescriptorDataInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCaptureDescriptorDataInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerCaptureDescriptorDataInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCaptureDescriptorDataInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerCaptureDescriptorDataInfoEXT.PNEXT); }
    /** Unsafe version of {@link #sampler}. */
    public static long nsampler(long struct) { return UNSAFE.getLong(null, struct + VkSamplerCaptureDescriptorDataInfoEXT.SAMPLER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCaptureDescriptorDataInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerCaptureDescriptorDataInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #sampler(long) sampler}. */
    public static void nsampler(long struct, long value) { UNSAFE.putLong(null, struct + VkSamplerCaptureDescriptorDataInfoEXT.SAMPLER, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerCaptureDescriptorDataInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSamplerCaptureDescriptorDataInfoEXT, Buffer> implements NativeResource {

        private static final VkSamplerCaptureDescriptorDataInfoEXT ELEMENT_FACTORY = VkSamplerCaptureDescriptorDataInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSamplerCaptureDescriptorDataInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerCaptureDescriptorDataInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSamplerCaptureDescriptorDataInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSamplerCaptureDescriptorDataInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerCaptureDescriptorDataInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkSamplerCaptureDescriptorDataInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSamplerCaptureDescriptorDataInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkSamplerCaptureDescriptorDataInfoEXT#sampler} field. */
        @NativeType("VkSampler")
        public long sampler() { return VkSamplerCaptureDescriptorDataInfoEXT.nsampler(address()); }

        /** Sets the specified value to the {@link VkSamplerCaptureDescriptorDataInfoEXT#sType} field. */
        public VkSamplerCaptureDescriptorDataInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerCaptureDescriptorDataInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT} value to the {@link VkSamplerCaptureDescriptorDataInfoEXT#sType} field. */
        public VkSamplerCaptureDescriptorDataInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT); }
        /** Sets the specified value to the {@link VkSamplerCaptureDescriptorDataInfoEXT#pNext} field. */
        public VkSamplerCaptureDescriptorDataInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSamplerCaptureDescriptorDataInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCaptureDescriptorDataInfoEXT#sampler} field. */
        public VkSamplerCaptureDescriptorDataInfoEXT.Buffer sampler(@NativeType("VkSampler") long value) { VkSamplerCaptureDescriptorDataInfoEXT.nsampler(address(), value); return this; }

    }

}