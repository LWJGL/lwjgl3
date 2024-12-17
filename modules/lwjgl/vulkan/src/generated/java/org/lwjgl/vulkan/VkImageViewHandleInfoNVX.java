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
 * struct VkImageViewHandleInfoNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageView imageView;
 *     VkDescriptorType descriptorType;
 *     VkSampler sampler;
 * }}</pre>
 */
public class VkImageViewHandleInfoNVX extends Struct<VkImageViewHandleInfoNVX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEVIEW,
        DESCRIPTORTYPE,
        SAMPLER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEVIEW = layout.offsetof(2);
        DESCRIPTORTYPE = layout.offsetof(3);
        SAMPLER = layout.offsetof(4);
    }

    protected VkImageViewHandleInfoNVX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageViewHandleInfoNVX create(long address, @Nullable ByteBuffer container) {
        return new VkImageViewHandleInfoNVX(address, container);
    }

    /**
     * Creates a {@code VkImageViewHandleInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageViewHandleInfoNVX(ByteBuffer container) {
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
    /** @return the value of the {@code imageView} field. */
    @NativeType("VkImageView")
    public long imageView() { return nimageView(address()); }
    /** @return the value of the {@code descriptorType} field. */
    @NativeType("VkDescriptorType")
    public int descriptorType() { return ndescriptorType(address()); }
    /** @return the value of the {@code sampler} field. */
    @NativeType("VkSampler")
    public long sampler() { return nsampler(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageViewHandleInfoNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVXImageViewHandle#VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX} value to the {@code sType} field. */
    public VkImageViewHandleInfoNVX sType$Default() { return sType(NVXImageViewHandle.VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageViewHandleInfoNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code imageView} field. */
    public VkImageViewHandleInfoNVX imageView(@NativeType("VkImageView") long value) { nimageView(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorType} field. */
    public VkImageViewHandleInfoNVX descriptorType(@NativeType("VkDescriptorType") int value) { ndescriptorType(address(), value); return this; }
    /** Sets the specified value to the {@code sampler} field. */
    public VkImageViewHandleInfoNVX sampler(@NativeType("VkSampler") long value) { nsampler(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageViewHandleInfoNVX set(
        int sType,
        long pNext,
        long imageView,
        int descriptorType,
        long sampler
    ) {
        sType(sType);
        pNext(pNext);
        imageView(imageView);
        descriptorType(descriptorType);
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
    public VkImageViewHandleInfoNVX set(VkImageViewHandleInfoNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageViewHandleInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageViewHandleInfoNVX malloc() {
        return new VkImageViewHandleInfoNVX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewHandleInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageViewHandleInfoNVX calloc() {
        return new VkImageViewHandleInfoNVX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewHandleInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkImageViewHandleInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewHandleInfoNVX(memAddress(container), container);
    }

    /** Returns a new {@code VkImageViewHandleInfoNVX} instance for the specified memory address. */
    public static VkImageViewHandleInfoNVX create(long address) {
        return new VkImageViewHandleInfoNVX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageViewHandleInfoNVX createSafe(long address) {
        return address == NULL ? null : new VkImageViewHandleInfoNVX(address, null);
    }

    /**
     * Returns a new {@link VkImageViewHandleInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageViewHandleInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewHandleInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageViewHandleInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageViewHandleInfoNVX.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewHandleInfoNVX mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewHandleInfoNVX callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewHandleInfoNVX mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewHandleInfoNVX callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewHandleInfoNVX.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewHandleInfoNVX.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewHandleInfoNVX.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewHandleInfoNVX.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageViewHandleInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewHandleInfoNVX malloc(MemoryStack stack) {
        return new VkImageViewHandleInfoNVX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageViewHandleInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewHandleInfoNVX calloc(MemoryStack stack) {
        return new VkImageViewHandleInfoNVX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageViewHandleInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewHandleInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageViewHandleInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageViewHandleInfoNVX.PNEXT); }
    /** Unsafe version of {@link #imageView}. */
    public static long nimageView(long struct) { return memGetLong(struct + VkImageViewHandleInfoNVX.IMAGEVIEW); }
    /** Unsafe version of {@link #descriptorType}. */
    public static int ndescriptorType(long struct) { return memGetInt(struct + VkImageViewHandleInfoNVX.DESCRIPTORTYPE); }
    /** Unsafe version of {@link #sampler}. */
    public static long nsampler(long struct) { return memGetLong(struct + VkImageViewHandleInfoNVX.SAMPLER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageViewHandleInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewHandleInfoNVX.PNEXT, value); }
    /** Unsafe version of {@link #imageView(long) imageView}. */
    public static void nimageView(long struct, long value) { memPutLong(struct + VkImageViewHandleInfoNVX.IMAGEVIEW, value); }
    /** Unsafe version of {@link #descriptorType(int) descriptorType}. */
    public static void ndescriptorType(long struct, int value) { memPutInt(struct + VkImageViewHandleInfoNVX.DESCRIPTORTYPE, value); }
    /** Unsafe version of {@link #sampler(long) sampler}. */
    public static void nsampler(long struct, long value) { memPutLong(struct + VkImageViewHandleInfoNVX.SAMPLER, value); }

    // -----------------------------------

    /** An array of {@link VkImageViewHandleInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkImageViewHandleInfoNVX, Buffer> implements NativeResource {

        private static final VkImageViewHandleInfoNVX ELEMENT_FACTORY = VkImageViewHandleInfoNVX.create(-1L);

        /**
         * Creates a new {@code VkImageViewHandleInfoNVX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageViewHandleInfoNVX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageViewHandleInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewHandleInfoNVX.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageViewHandleInfoNVX.npNext(address()); }
        /** @return the value of the {@code imageView} field. */
        @NativeType("VkImageView")
        public long imageView() { return VkImageViewHandleInfoNVX.nimageView(address()); }
        /** @return the value of the {@code descriptorType} field. */
        @NativeType("VkDescriptorType")
        public int descriptorType() { return VkImageViewHandleInfoNVX.ndescriptorType(address()); }
        /** @return the value of the {@code sampler} field. */
        @NativeType("VkSampler")
        public long sampler() { return VkImageViewHandleInfoNVX.nsampler(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageViewHandleInfoNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewHandleInfoNVX.nsType(address(), value); return this; }
        /** Sets the {@link NVXImageViewHandle#VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX} value to the {@code sType} field. */
        public VkImageViewHandleInfoNVX.Buffer sType$Default() { return sType(NVXImageViewHandle.VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageViewHandleInfoNVX.Buffer pNext(@NativeType("void const *") long value) { VkImageViewHandleInfoNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code imageView} field. */
        public VkImageViewHandleInfoNVX.Buffer imageView(@NativeType("VkImageView") long value) { VkImageViewHandleInfoNVX.nimageView(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorType} field. */
        public VkImageViewHandleInfoNVX.Buffer descriptorType(@NativeType("VkDescriptorType") int value) { VkImageViewHandleInfoNVX.ndescriptorType(address(), value); return this; }
        /** Sets the specified value to the {@code sampler} field. */
        public VkImageViewHandleInfoNVX.Buffer sampler(@NativeType("VkSampler") long value) { VkImageViewHandleInfoNVX.nsampler(address(), value); return this; }

    }

}