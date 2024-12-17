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
 * struct VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 ycbcr2plane444Formats;
 * }}</pre>
 */
public class VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT extends Struct<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        YCBCR2PLANE444FORMATS;

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
        YCBCR2PLANE444FORMATS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code ycbcr2plane444Formats} field. */
    @NativeType("VkBool32")
    public boolean ycbcr2plane444Formats() { return nycbcr2plane444Formats(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTYcbcr2plane444Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT sType$Default() { return sType(EXTYcbcr2plane444Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code ycbcr2plane444Formats} field. */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ycbcr2plane444Formats(@NativeType("VkBool32") boolean value) { nycbcr2plane444Formats(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT set(
        int sType,
        long pNext,
        boolean ycbcr2plane444Formats
    ) {
        sType(sType);
        pNext(pNext);
        ycbcr2plane444Formats(ycbcr2plane444Formats);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT set(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT malloc() {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT calloc() {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT create(long address) {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #ycbcr2plane444Formats}. */
    public static int nycbcr2plane444Formats(long struct) { return memGetInt(struct + VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.YCBCR2PLANE444FORMATS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #ycbcr2plane444Formats(boolean) ycbcr2plane444Formats}. */
    public static void nycbcr2plane444Formats(long struct, int value) { memPutInt(struct + VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.YCBCR2PLANE444FORMATS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code ycbcr2plane444Formats} field. */
        @NativeType("VkBool32")
        public boolean ycbcr2plane444Formats() { return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.nycbcr2plane444Formats(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTYcbcr2plane444Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer sType$Default() { return sType(EXTYcbcr2plane444Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code ycbcr2plane444Formats} field. */
        public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.Buffer ycbcr2plane444Formats(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.nycbcr2plane444Formats(address(), value ? 1 : 0); return this; }

    }

}