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
 * Structure specifying the image view for handle queries.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code descriptorType} <b>must</b> be {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}</li>
 * <li>{@code sampler} <b>must</b> be a valid {@code VkSampler} if {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}</li>
 * <li>If descriptorType is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, the image that {@code imageView} was created from <b>must</b> have been created with the {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} usage bit set</li>
 * <li>If descriptorType is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, the image that {@code imageView} was created from <b>must</b> have been created with the {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT} usage bit set</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXImageViewHandle#VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
 * <li>{@code descriptorType} <b>must</b> be a valid {@code VkDescriptorType} value</li>
 * <li>If {@code sampler} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code sampler} <b>must</b> be a valid {@code VkSampler} handle</li>
 * <li>Both of {@code imageView}, and {@code sampler} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVXImageViewHandle#vkGetImageViewHandleNVX GetImageViewHandleNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code imageView} &ndash; the image view to query.</li>
 * <li>{@code descriptorType} &ndash; the type of descriptor for which to query a handle.</li>
 * <li>{@code sampler} &ndash; the sampler to combine with the image view when generating the handle.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageViewHandleInfoNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageView imageView;
 *     VkDescriptorType descriptorType;
 *     VkSampler sampler;
 * }</code></pre>
 */
public class VkImageViewHandleInfoNVX extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code imageView} field. */
    @NativeType("VkImageView")
    public long imageView() { return nimageView(address()); }
    /** Returns the value of the {@code descriptorType} field. */
    @NativeType("VkDescriptorType")
    public int descriptorType() { return ndescriptorType(address()); }
    /** Returns the value of the {@code sampler} field. */
    @NativeType("VkSampler")
    public long sampler() { return nsampler(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageViewHandleInfoNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
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
        return wrap(VkImageViewHandleInfoNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageViewHandleInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageViewHandleInfoNVX calloc() {
        return wrap(VkImageViewHandleInfoNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageViewHandleInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkImageViewHandleInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageViewHandleInfoNVX.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageViewHandleInfoNVX} instance for the specified memory address. */
    public static VkImageViewHandleInfoNVX create(long address) {
        return wrap(VkImageViewHandleInfoNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewHandleInfoNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkImageViewHandleInfoNVX.class, address);
    }

    /**
     * Returns a new {@link VkImageViewHandleInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageViewHandleInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewHandleInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageViewHandleInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewHandleInfoNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkImageViewHandleInfoNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageViewHandleInfoNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkImageViewHandleInfoNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageViewHandleInfoNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkImageViewHandleInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewHandleInfoNVX mallocStack(MemoryStack stack) {
        return wrap(VkImageViewHandleInfoNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageViewHandleInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewHandleInfoNVX callocStack(MemoryStack stack) {
        return wrap(VkImageViewHandleInfoNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageViewHandleInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageViewHandleInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageViewHandleInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewHandleInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewHandleInfoNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageViewHandleInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageViewHandleInfoNVX.PNEXT); }
    /** Unsafe version of {@link #imageView}. */
    public static long nimageView(long struct) { return UNSAFE.getLong(null, struct + VkImageViewHandleInfoNVX.IMAGEVIEW); }
    /** Unsafe version of {@link #descriptorType}. */
    public static int ndescriptorType(long struct) { return UNSAFE.getInt(null, struct + VkImageViewHandleInfoNVX.DESCRIPTORTYPE); }
    /** Unsafe version of {@link #sampler}. */
    public static long nsampler(long struct) { return UNSAFE.getLong(null, struct + VkImageViewHandleInfoNVX.SAMPLER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewHandleInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewHandleInfoNVX.PNEXT, value); }
    /** Unsafe version of {@link #imageView(long) imageView}. */
    public static void nimageView(long struct, long value) { UNSAFE.putLong(null, struct + VkImageViewHandleInfoNVX.IMAGEVIEW, value); }
    /** Unsafe version of {@link #descriptorType(int) descriptorType}. */
    public static void ndescriptorType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewHandleInfoNVX.DESCRIPTORTYPE, value); }
    /** Unsafe version of {@link #sampler(long) sampler}. */
    public static void nsampler(long struct, long value) { UNSAFE.putLong(null, struct + VkImageViewHandleInfoNVX.SAMPLER, value); }

    // -----------------------------------

    /** An array of {@link VkImageViewHandleInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkImageViewHandleInfoNVX, Buffer> implements NativeResource {

        private static final VkImageViewHandleInfoNVX ELEMENT_FACTORY = VkImageViewHandleInfoNVX.create(-1L);

        /**
         * Creates a new {@code VkImageViewHandleInfoNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageViewHandleInfoNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkImageViewHandleInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewHandleInfoNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageViewHandleInfoNVX.npNext(address()); }
        /** Returns the value of the {@code imageView} field. */
        @NativeType("VkImageView")
        public long imageView() { return VkImageViewHandleInfoNVX.nimageView(address()); }
        /** Returns the value of the {@code descriptorType} field. */
        @NativeType("VkDescriptorType")
        public int descriptorType() { return VkImageViewHandleInfoNVX.ndescriptorType(address()); }
        /** Returns the value of the {@code sampler} field. */
        @NativeType("VkSampler")
        public long sampler() { return VkImageViewHandleInfoNVX.nsampler(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageViewHandleInfoNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewHandleInfoNVX.nsType(address(), value); return this; }
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