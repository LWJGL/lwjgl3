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
 * Structure for querying cubic filtering capabilities of an image view type.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTFilterCubic#VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@code pNext} chain of the {@link VkImageFormatProperties2} structure includes a {@link VkFilterCubicImageViewImageFormatPropertiesEXT} structure, the {@code pNext} chain of the {@link VkPhysicalDeviceImageFormatInfo2} structure <b>must</b> include a {@link VkPhysicalDeviceImageViewImageFormatInfoEXT} structure with an {@code imageViewType} that is compatible with {@code imageType}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFilterCubicImageViewImageFormatPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #filterCubic};
 *     VkBool32 {@link #filterCubicMinmax};
 * }</code></pre>
 */
public class VkFilterCubicImageViewImageFormatPropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FILTERCUBIC,
        FILTERCUBICMINMAX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FILTERCUBIC = layout.offsetof(2);
        FILTERCUBICMINMAX = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkFilterCubicImageViewImageFormatPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFilterCubicImageViewImageFormatPropertiesEXT(ByteBuffer container) {
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
    /** tells if image format, image type and image view type <b>can</b> be used with cubic filtering. This field is set by the implementation. User-specified value is ignored. */
    @NativeType("VkBool32")
    public boolean filterCubic() { return nfilterCubic(address()) != 0; }
    /** tells if image format, image type and image view type <b>can</b> be used with cubic filtering and minmax filtering. This field is set by the implementation. User-specified value is ignored. */
    @NativeType("VkBool32")
    public boolean filterCubicMinmax() { return nfilterCubicMinmax(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkFilterCubicImageViewImageFormatPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFilterCubic#VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkFilterCubicImageViewImageFormatPropertiesEXT sType$Default() { return sType(EXTFilterCubic.VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkFilterCubicImageViewImageFormatPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFilterCubicImageViewImageFormatPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFilterCubicImageViewImageFormatPropertiesEXT set(VkFilterCubicImageViewImageFormatPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFilterCubicImageViewImageFormatPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT malloc() {
        return wrap(VkFilterCubicImageViewImageFormatPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFilterCubicImageViewImageFormatPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT calloc() {
        return wrap(VkFilterCubicImageViewImageFormatPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFilterCubicImageViewImageFormatPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFilterCubicImageViewImageFormatPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFilterCubicImageViewImageFormatPropertiesEXT} instance for the specified memory address. */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT create(long address) {
        return wrap(VkFilterCubicImageViewImageFormatPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFilterCubicImageViewImageFormatPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkFilterCubicImageViewImageFormatPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFilterCubicImageViewImageFormatPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFilterCubicImageViewImageFormatPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFilterCubicImageViewImageFormatPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFilterCubicImageViewImageFormatPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkFilterCubicImageViewImageFormatPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT malloc(MemoryStack stack) {
        return wrap(VkFilterCubicImageViewImageFormatPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFilterCubicImageViewImageFormatPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT calloc(MemoryStack stack) {
        return wrap(VkFilterCubicImageViewImageFormatPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkFilterCubicImageViewImageFormatPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFilterCubicImageViewImageFormatPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #filterCubic}. */
    public static int nfilterCubic(long struct) { return UNSAFE.getInt(null, struct + VkFilterCubicImageViewImageFormatPropertiesEXT.FILTERCUBIC); }
    /** Unsafe version of {@link #filterCubicMinmax}. */
    public static int nfilterCubicMinmax(long struct) { return UNSAFE.getInt(null, struct + VkFilterCubicImageViewImageFormatPropertiesEXT.FILTERCUBICMINMAX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkFilterCubicImageViewImageFormatPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFilterCubicImageViewImageFormatPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkFilterCubicImageViewImageFormatPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkFilterCubicImageViewImageFormatPropertiesEXT, Buffer> implements NativeResource {

        private static final VkFilterCubicImageViewImageFormatPropertiesEXT ELEMENT_FACTORY = VkFilterCubicImageViewImageFormatPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFilterCubicImageViewImageFormatPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkFilterCubicImageViewImageFormatPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkFilterCubicImageViewImageFormatPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFilterCubicImageViewImageFormatPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkFilterCubicImageViewImageFormatPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkFilterCubicImageViewImageFormatPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkFilterCubicImageViewImageFormatPropertiesEXT#filterCubic} field. */
        @NativeType("VkBool32")
        public boolean filterCubic() { return VkFilterCubicImageViewImageFormatPropertiesEXT.nfilterCubic(address()) != 0; }
        /** @return the value of the {@link VkFilterCubicImageViewImageFormatPropertiesEXT#filterCubicMinmax} field. */
        @NativeType("VkBool32")
        public boolean filterCubicMinmax() { return VkFilterCubicImageViewImageFormatPropertiesEXT.nfilterCubicMinmax(address()) != 0; }

        /** Sets the specified value to the {@link VkFilterCubicImageViewImageFormatPropertiesEXT#sType} field. */
        public VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkFilterCubicImageViewImageFormatPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFilterCubic#VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT} value to the {@link VkFilterCubicImageViewImageFormatPropertiesEXT#sType} field. */
        public VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer sType$Default() { return sType(EXTFilterCubic.VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkFilterCubicImageViewImageFormatPropertiesEXT#pNext} field. */
        public VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkFilterCubicImageViewImageFormatPropertiesEXT.npNext(address(), value); return this; }

    }

}