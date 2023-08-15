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
 * Structure specifying an image view for descriptor capture.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code imageView} <b>must</b> have been created with {@link EXTDescriptorBuffer#VK_IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT} set in {@link VkImageViewCreateInfo}{@code ::flags}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDescriptorBuffer#vkGetImageViewOpaqueCaptureDescriptorDataEXT GetImageViewOpaqueCaptureDescriptorDataEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageViewCaptureDescriptorDataInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImageView {@link #imageView};
 * }</code></pre>
 */
public class VkImageViewCaptureDescriptorDataInfoEXT extends Struct<VkImageViewCaptureDescriptorDataInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEVIEW;

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
        IMAGEVIEW = layout.offsetof(2);
    }

    protected VkImageViewCaptureDescriptorDataInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageViewCaptureDescriptorDataInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImageViewCaptureDescriptorDataInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkImageViewCaptureDescriptorDataInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageViewCaptureDescriptorDataInfoEXT(ByteBuffer container) {
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
    /** the {@code VkImageView} handle of the image view to get opaque capture data for. */
    @NativeType("VkImageView")
    public long imageView() { return nimageView(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageViewCaptureDescriptorDataInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT} value to the {@link #sType} field. */
    public VkImageViewCaptureDescriptorDataInfoEXT sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageViewCaptureDescriptorDataInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #imageView} field. */
    public VkImageViewCaptureDescriptorDataInfoEXT imageView(@NativeType("VkImageView") long value) { nimageView(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageViewCaptureDescriptorDataInfoEXT set(
        int sType,
        long pNext,
        long imageView
    ) {
        sType(sType);
        pNext(pNext);
        imageView(imageView);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageViewCaptureDescriptorDataInfoEXT set(VkImageViewCaptureDescriptorDataInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageViewCaptureDescriptorDataInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageViewCaptureDescriptorDataInfoEXT malloc() {
        return new VkImageViewCaptureDescriptorDataInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewCaptureDescriptorDataInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageViewCaptureDescriptorDataInfoEXT calloc() {
        return new VkImageViewCaptureDescriptorDataInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewCaptureDescriptorDataInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageViewCaptureDescriptorDataInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewCaptureDescriptorDataInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImageViewCaptureDescriptorDataInfoEXT} instance for the specified memory address. */
    public static VkImageViewCaptureDescriptorDataInfoEXT create(long address) {
        return new VkImageViewCaptureDescriptorDataInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewCaptureDescriptorDataInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkImageViewCaptureDescriptorDataInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkImageViewCaptureDescriptorDataInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewCaptureDescriptorDataInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageViewCaptureDescriptorDataInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewCaptureDescriptorDataInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewCaptureDescriptorDataInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewCaptureDescriptorDataInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageViewCaptureDescriptorDataInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageViewCaptureDescriptorDataInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewCaptureDescriptorDataInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageViewCaptureDescriptorDataInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewCaptureDescriptorDataInfoEXT malloc(MemoryStack stack) {
        return new VkImageViewCaptureDescriptorDataInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageViewCaptureDescriptorDataInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewCaptureDescriptorDataInfoEXT calloc(MemoryStack stack) {
        return new VkImageViewCaptureDescriptorDataInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageViewCaptureDescriptorDataInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewCaptureDescriptorDataInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewCaptureDescriptorDataInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewCaptureDescriptorDataInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageViewCaptureDescriptorDataInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageViewCaptureDescriptorDataInfoEXT.PNEXT); }
    /** Unsafe version of {@link #imageView}. */
    public static long nimageView(long struct) { return UNSAFE.getLong(null, struct + VkImageViewCaptureDescriptorDataInfoEXT.IMAGEVIEW); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewCaptureDescriptorDataInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewCaptureDescriptorDataInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #imageView(long) imageView}. */
    public static void nimageView(long struct, long value) { UNSAFE.putLong(null, struct + VkImageViewCaptureDescriptorDataInfoEXT.IMAGEVIEW, value); }

    // -----------------------------------

    /** An array of {@link VkImageViewCaptureDescriptorDataInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageViewCaptureDescriptorDataInfoEXT, Buffer> implements NativeResource {

        private static final VkImageViewCaptureDescriptorDataInfoEXT ELEMENT_FACTORY = VkImageViewCaptureDescriptorDataInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImageViewCaptureDescriptorDataInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageViewCaptureDescriptorDataInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageViewCaptureDescriptorDataInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageViewCaptureDescriptorDataInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewCaptureDescriptorDataInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkImageViewCaptureDescriptorDataInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageViewCaptureDescriptorDataInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkImageViewCaptureDescriptorDataInfoEXT#imageView} field. */
        @NativeType("VkImageView")
        public long imageView() { return VkImageViewCaptureDescriptorDataInfoEXT.nimageView(address()); }

        /** Sets the specified value to the {@link VkImageViewCaptureDescriptorDataInfoEXT#sType} field. */
        public VkImageViewCaptureDescriptorDataInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewCaptureDescriptorDataInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT} value to the {@link VkImageViewCaptureDescriptorDataInfoEXT#sType} field. */
        public VkImageViewCaptureDescriptorDataInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT); }
        /** Sets the specified value to the {@link VkImageViewCaptureDescriptorDataInfoEXT#pNext} field. */
        public VkImageViewCaptureDescriptorDataInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageViewCaptureDescriptorDataInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageViewCaptureDescriptorDataInfoEXT#imageView} field. */
        public VkImageViewCaptureDescriptorDataInfoEXT.Buffer imageView(@NativeType("VkImageView") long value) { VkImageViewCaptureDescriptorDataInfoEXT.nimageView(address(), value); return this; }

    }

}