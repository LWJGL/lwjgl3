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
 * Structure for providing image view type.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTFilterCubic#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT}</li>
 * <li>{@code imageViewType} <b>must</b> be a valid {@code VkImageViewType} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceImageViewImageFormatInfoEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkImageViewType {@link #imageViewType};
 * }</code></pre>
 */
public class VkPhysicalDeviceImageViewImageFormatInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEVIEWTYPE;

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
        IMAGEVIEWTYPE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageViewImageFormatInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageViewImageFormatInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkImageViewType} value specifying the type of the image view. */
    @NativeType("VkImageViewType")
    public int imageViewType() { return nimageViewType(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceImageViewImageFormatInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFilterCubic#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceImageViewImageFormatInfoEXT sType$Default() { return sType(EXTFilterCubic.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceImageViewImageFormatInfoEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #imageViewType} field. */
    public VkPhysicalDeviceImageViewImageFormatInfoEXT imageViewType(@NativeType("VkImageViewType") int value) { nimageViewType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageViewImageFormatInfoEXT set(
        int sType,
        long pNext,
        int imageViewType
    ) {
        sType(sType);
        pNext(pNext);
        imageViewType(imageViewType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageViewImageFormatInfoEXT set(VkPhysicalDeviceImageViewImageFormatInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageViewImageFormatInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT malloc() {
        return wrap(VkPhysicalDeviceImageViewImageFormatInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceImageViewImageFormatInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT calloc() {
        return wrap(VkPhysicalDeviceImageViewImageFormatInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceImageViewImageFormatInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceImageViewImageFormatInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageViewImageFormatInfoEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT create(long address) {
        return wrap(VkPhysicalDeviceImageViewImageFormatInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceImageViewImageFormatInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageViewImageFormatInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageViewImageFormatInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageViewImageFormatInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageViewImageFormatInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceImageViewImageFormatInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceImageViewImageFormatInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageViewImageFormatInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceImageViewImageFormatInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageViewImageFormatInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageViewImageFormatInfoEXT.PNEXT); }
    /** Unsafe version of {@link #imageViewType}. */
    public static int nimageViewType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageViewImageFormatInfoEXT.IMAGEVIEWTYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageViewImageFormatInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageViewImageFormatInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #imageViewType(int) imageViewType}. */
    public static void nimageViewType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageViewImageFormatInfoEXT.IMAGEVIEWTYPE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageViewImageFormatInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageViewImageFormatInfoEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageViewImageFormatInfoEXT ELEMENT_FACTORY = VkPhysicalDeviceImageViewImageFormatInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageViewImageFormatInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceImageViewImageFormatInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceImageViewImageFormatInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageViewImageFormatInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageViewImageFormatInfoEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageViewImageFormatInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageViewImageFormatInfoEXT#imageViewType} field. */
        @NativeType("VkImageViewType")
        public int imageViewType() { return VkPhysicalDeviceImageViewImageFormatInfoEXT.nimageViewType(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceImageViewImageFormatInfoEXT#sType} field. */
        public VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageViewImageFormatInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFilterCubic#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT} value to the {@link VkPhysicalDeviceImageViewImageFormatInfoEXT#sType} field. */
        public VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer sType$Default() { return sType(EXTFilterCubic.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageViewImageFormatInfoEXT#pNext} field. */
        public VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageViewImageFormatInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageViewImageFormatInfoEXT#imageViewType} field. */
        public VkPhysicalDeviceImageViewImageFormatInfoEXT.Buffer imageViewType(@NativeType("VkImageViewType") int value) { VkPhysicalDeviceImageViewImageFormatInfoEXT.nimageViewType(address(), value); return this; }

    }

}