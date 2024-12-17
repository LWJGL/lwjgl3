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
 * struct VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 formatRgba10x6WithoutYCbCrSampler;
 * }}</pre>
 */
public class VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT extends Struct<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMATRGBA10X6WITHOUTYCBCRSAMPLER;

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
        FORMATRGBA10X6WITHOUTYCBCRSAMPLER = layout.offsetof(2);
    }

    protected VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code formatRgba10x6WithoutYCbCrSampler} field. */
    @NativeType("VkBool32")
    public boolean formatRgba10x6WithoutYCbCrSampler() { return nformatRgba10x6WithoutYCbCrSampler(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTRgba10x6Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT sType$Default() { return sType(EXTRgba10x6Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code formatRgba10x6WithoutYCbCrSampler} field. */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT formatRgba10x6WithoutYCbCrSampler(@NativeType("VkBool32") boolean value) { nformatRgba10x6WithoutYCbCrSampler(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT set(
        int sType,
        long pNext,
        boolean formatRgba10x6WithoutYCbCrSampler
    ) {
        sType(sType);
        pNext(pNext);
        formatRgba10x6WithoutYCbCrSampler(formatRgba10x6WithoutYCbCrSampler);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT set(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT malloc() {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT calloc() {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT create(long address) {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #formatRgba10x6WithoutYCbCrSampler}. */
    public static int nformatRgba10x6WithoutYCbCrSampler(long struct) { return memGetInt(struct + VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.FORMATRGBA10X6WITHOUTYCBCRSAMPLER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #formatRgba10x6WithoutYCbCrSampler(boolean) formatRgba10x6WithoutYCbCrSampler}. */
    public static void nformatRgba10x6WithoutYCbCrSampler(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.FORMATRGBA10X6WITHOUTYCBCRSAMPLER, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code formatRgba10x6WithoutYCbCrSampler} field. */
        @NativeType("VkBool32")
        public boolean formatRgba10x6WithoutYCbCrSampler() { return VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.nformatRgba10x6WithoutYCbCrSampler(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTRgba10x6Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer sType$Default() { return sType(EXTRgba10x6Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code formatRgba10x6WithoutYCbCrSampler} field. */
        public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.Buffer formatRgba10x6WithoutYCbCrSampler(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.nformatRgba10x6WithoutYCbCrSampler(address(), value ? 1 : 0); return this; }

    }

}