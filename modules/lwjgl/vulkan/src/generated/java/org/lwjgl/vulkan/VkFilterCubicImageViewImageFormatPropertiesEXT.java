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
 * struct VkFilterCubicImageViewImageFormatPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 filterCubic;
 *     VkBool32 filterCubicMinmax;
 * }}</pre>
 */
public class VkFilterCubicImageViewImageFormatPropertiesEXT extends Struct<VkFilterCubicImageViewImageFormatPropertiesEXT> implements NativeResource {

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

    protected VkFilterCubicImageViewImageFormatPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkFilterCubicImageViewImageFormatPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkFilterCubicImageViewImageFormatPropertiesEXT(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code filterCubic} field. */
    @NativeType("VkBool32")
    public boolean filterCubic() { return nfilterCubic(address()) != 0; }
    /** @return the value of the {@code filterCubicMinmax} field. */
    @NativeType("VkBool32")
    public boolean filterCubicMinmax() { return nfilterCubicMinmax(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkFilterCubicImageViewImageFormatPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFilterCubic#VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkFilterCubicImageViewImageFormatPropertiesEXT sType$Default() { return sType(EXTFilterCubic.VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
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
        return new VkFilterCubicImageViewImageFormatPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkFilterCubicImageViewImageFormatPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT calloc() {
        return new VkFilterCubicImageViewImageFormatPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkFilterCubicImageViewImageFormatPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFilterCubicImageViewImageFormatPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkFilterCubicImageViewImageFormatPropertiesEXT} instance for the specified memory address. */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT create(long address) {
        return new VkFilterCubicImageViewImageFormatPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkFilterCubicImageViewImageFormatPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkFilterCubicImageViewImageFormatPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
        return new VkFilterCubicImageViewImageFormatPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkFilterCubicImageViewImageFormatPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT calloc(MemoryStack stack) {
        return new VkFilterCubicImageViewImageFormatPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkFilterCubicImageViewImageFormatPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFilterCubicImageViewImageFormatPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #filterCubic}. */
    public static int nfilterCubic(long struct) { return memGetInt(struct + VkFilterCubicImageViewImageFormatPropertiesEXT.FILTERCUBIC); }
    /** Unsafe version of {@link #filterCubicMinmax}. */
    public static int nfilterCubicMinmax(long struct) { return memGetInt(struct + VkFilterCubicImageViewImageFormatPropertiesEXT.FILTERCUBICMINMAX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkFilterCubicImageViewImageFormatPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFilterCubicImageViewImageFormatPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkFilterCubicImageViewImageFormatPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkFilterCubicImageViewImageFormatPropertiesEXT, Buffer> implements NativeResource {

        private static final VkFilterCubicImageViewImageFormatPropertiesEXT ELEMENT_FACTORY = VkFilterCubicImageViewImageFormatPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFilterCubicImageViewImageFormatPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkFilterCubicImageViewImageFormatPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFilterCubicImageViewImageFormatPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkFilterCubicImageViewImageFormatPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code filterCubic} field. */
        @NativeType("VkBool32")
        public boolean filterCubic() { return VkFilterCubicImageViewImageFormatPropertiesEXT.nfilterCubic(address()) != 0; }
        /** @return the value of the {@code filterCubicMinmax} field. */
        @NativeType("VkBool32")
        public boolean filterCubicMinmax() { return VkFilterCubicImageViewImageFormatPropertiesEXT.nfilterCubicMinmax(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkFilterCubicImageViewImageFormatPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFilterCubic#VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer sType$Default() { return sType(EXTFilterCubic.VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkFilterCubicImageViewImageFormatPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkFilterCubicImageViewImageFormatPropertiesEXT.npNext(address(), value); return this; }

    }

}