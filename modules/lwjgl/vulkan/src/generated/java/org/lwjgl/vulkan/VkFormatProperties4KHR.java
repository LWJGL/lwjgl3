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
 * struct VkFormatProperties4KHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkFormatFeatureFlags4KHR linearTilingFeatures;
 *     VkFormatFeatureFlags4KHR optimalTilingFeatures;
 *     VkFormatFeatureFlags4KHR bufferFeatures;
 * }}</pre>
 */
public class VkFormatProperties4KHR extends Struct<VkFormatProperties4KHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LINEARTILINGFEATURES,
        OPTIMALTILINGFEATURES,
        BUFFERFEATURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LINEARTILINGFEATURES = layout.offsetof(2);
        OPTIMALTILINGFEATURES = layout.offsetof(3);
        BUFFERFEATURES = layout.offsetof(4);
    }

    protected VkFormatProperties4KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkFormatProperties4KHR create(long address, @Nullable ByteBuffer container) {
        return new VkFormatProperties4KHR(address, container);
    }

    /**
     * Creates a {@code VkFormatProperties4KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFormatProperties4KHR(ByteBuffer container) {
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
    /** @return the value of the {@code linearTilingFeatures} field. */
    @NativeType("VkFormatFeatureFlags4KHR")
    public long linearTilingFeatures() { return nlinearTilingFeatures(address()); }
    /** @return the value of the {@code optimalTilingFeatures} field. */
    @NativeType("VkFormatFeatureFlags4KHR")
    public long optimalTilingFeatures() { return noptimalTilingFeatures(address()); }
    /** @return the value of the {@code bufferFeatures} field. */
    @NativeType("VkFormatFeatureFlags4KHR")
    public long bufferFeatures() { return nbufferFeatures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkFormatProperties4KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExtendedFlags#VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_4_KHR STRUCTURE_TYPE_FORMAT_PROPERTIES_4_KHR} value to the {@code sType} field. */
    public VkFormatProperties4KHR sType$Default() { return sType(KHRExtendedFlags.VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_4_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkFormatProperties4KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFormatProperties4KHR set(
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
    public VkFormatProperties4KHR set(VkFormatProperties4KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFormatProperties4KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFormatProperties4KHR malloc() {
        return new VkFormatProperties4KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkFormatProperties4KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFormatProperties4KHR calloc() {
        return new VkFormatProperties4KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkFormatProperties4KHR} instance allocated with {@link BufferUtils}. */
    public static VkFormatProperties4KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFormatProperties4KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkFormatProperties4KHR} instance for the specified memory address. */
    public static VkFormatProperties4KHR create(long address) {
        return new VkFormatProperties4KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkFormatProperties4KHR createSafe(long address) {
        return address == NULL ? null : new VkFormatProperties4KHR(address, null);
    }

    /**
     * Returns a new {@link VkFormatProperties4KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties4KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties4KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties4KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties4KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties4KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkFormatProperties4KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties4KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkFormatProperties4KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkFormatProperties4KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFormatProperties4KHR malloc(MemoryStack stack) {
        return new VkFormatProperties4KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkFormatProperties4KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFormatProperties4KHR calloc(MemoryStack stack) {
        return new VkFormatProperties4KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkFormatProperties4KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties4KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties4KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties4KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkFormatProperties4KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFormatProperties4KHR.PNEXT); }
    /** Unsafe version of {@link #linearTilingFeatures}. */
    public static long nlinearTilingFeatures(long struct) { return memGetLong(struct + VkFormatProperties4KHR.LINEARTILINGFEATURES); }
    /** Unsafe version of {@link #optimalTilingFeatures}. */
    public static long noptimalTilingFeatures(long struct) { return memGetLong(struct + VkFormatProperties4KHR.OPTIMALTILINGFEATURES); }
    /** Unsafe version of {@link #bufferFeatures}. */
    public static long nbufferFeatures(long struct) { return memGetLong(struct + VkFormatProperties4KHR.BUFFERFEATURES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkFormatProperties4KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFormatProperties4KHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkFormatProperties4KHR} structs. */
    public static class Buffer extends StructBuffer<VkFormatProperties4KHR, Buffer> implements NativeResource {

        private static final VkFormatProperties4KHR ELEMENT_FACTORY = VkFormatProperties4KHR.create(-1L);

        /**
         * Creates a new {@code VkFormatProperties4KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFormatProperties4KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkFormatProperties4KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFormatProperties4KHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkFormatProperties4KHR.npNext(address()); }
        /** @return the value of the {@code linearTilingFeatures} field. */
        @NativeType("VkFormatFeatureFlags4KHR")
        public long linearTilingFeatures() { return VkFormatProperties4KHR.nlinearTilingFeatures(address()); }
        /** @return the value of the {@code optimalTilingFeatures} field. */
        @NativeType("VkFormatFeatureFlags4KHR")
        public long optimalTilingFeatures() { return VkFormatProperties4KHR.noptimalTilingFeatures(address()); }
        /** @return the value of the {@code bufferFeatures} field. */
        @NativeType("VkFormatFeatureFlags4KHR")
        public long bufferFeatures() { return VkFormatProperties4KHR.nbufferFeatures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkFormatProperties4KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkFormatProperties4KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExtendedFlags#VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_4_KHR STRUCTURE_TYPE_FORMAT_PROPERTIES_4_KHR} value to the {@code sType} field. */
        public VkFormatProperties4KHR.Buffer sType$Default() { return sType(KHRExtendedFlags.VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_4_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkFormatProperties4KHR.Buffer pNext(@NativeType("void *") long value) { VkFormatProperties4KHR.npNext(address(), value); return this; }

    }

}