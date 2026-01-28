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
 * struct VkSubsampledImageFormatPropertiesEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t subsampledImageDescriptorCount;
 * }}</pre>
 */
public class VkSubsampledImageFormatPropertiesEXT extends Struct<VkSubsampledImageFormatPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUBSAMPLEDIMAGEDESCRIPTORCOUNT;

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
        SUBSAMPLEDIMAGEDESCRIPTORCOUNT = layout.offsetof(2);
    }

    protected VkSubsampledImageFormatPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubsampledImageFormatPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSubsampledImageFormatPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkSubsampledImageFormatPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubsampledImageFormatPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code subsampledImageDescriptorCount} field. */
    @NativeType("uint32_t")
    public int subsampledImageDescriptorCount() { return nsubsampledImageDescriptorCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubsampledImageFormatPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_SUBSAMPLED_IMAGE_FORMAT_PROPERTIES_EXT STRUCTURE_TYPE_SUBSAMPLED_IMAGE_FORMAT_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkSubsampledImageFormatPropertiesEXT sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_SUBSAMPLED_IMAGE_FORMAT_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubsampledImageFormatPropertiesEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code subsampledImageDescriptorCount} field. */
    public VkSubsampledImageFormatPropertiesEXT subsampledImageDescriptorCount(@NativeType("uint32_t") int value) { nsubsampledImageDescriptorCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubsampledImageFormatPropertiesEXT set(
        int sType,
        long pNext,
        int subsampledImageDescriptorCount
    ) {
        sType(sType);
        pNext(pNext);
        subsampledImageDescriptorCount(subsampledImageDescriptorCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubsampledImageFormatPropertiesEXT set(VkSubsampledImageFormatPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubsampledImageFormatPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubsampledImageFormatPropertiesEXT malloc() {
        return new VkSubsampledImageFormatPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubsampledImageFormatPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubsampledImageFormatPropertiesEXT calloc() {
        return new VkSubsampledImageFormatPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubsampledImageFormatPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkSubsampledImageFormatPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubsampledImageFormatPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSubsampledImageFormatPropertiesEXT} instance for the specified memory address. */
    public static VkSubsampledImageFormatPropertiesEXT create(long address) {
        return new VkSubsampledImageFormatPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubsampledImageFormatPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkSubsampledImageFormatPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkSubsampledImageFormatPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubsampledImageFormatPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubsampledImageFormatPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubsampledImageFormatPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubsampledImageFormatPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubsampledImageFormatPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubsampledImageFormatPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubsampledImageFormatPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubsampledImageFormatPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubsampledImageFormatPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubsampledImageFormatPropertiesEXT malloc(MemoryStack stack) {
        return new VkSubsampledImageFormatPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubsampledImageFormatPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubsampledImageFormatPropertiesEXT calloc(MemoryStack stack) {
        return new VkSubsampledImageFormatPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubsampledImageFormatPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubsampledImageFormatPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubsampledImageFormatPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubsampledImageFormatPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubsampledImageFormatPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubsampledImageFormatPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #subsampledImageDescriptorCount}. */
    public static int nsubsampledImageDescriptorCount(long struct) { return memGetInt(struct + VkSubsampledImageFormatPropertiesEXT.SUBSAMPLEDIMAGEDESCRIPTORCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubsampledImageFormatPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubsampledImageFormatPropertiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #subsampledImageDescriptorCount(int) subsampledImageDescriptorCount}. */
    public static void nsubsampledImageDescriptorCount(long struct, int value) { memPutInt(struct + VkSubsampledImageFormatPropertiesEXT.SUBSAMPLEDIMAGEDESCRIPTORCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkSubsampledImageFormatPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkSubsampledImageFormatPropertiesEXT, Buffer> implements NativeResource {

        private static final VkSubsampledImageFormatPropertiesEXT ELEMENT_FACTORY = VkSubsampledImageFormatPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkSubsampledImageFormatPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubsampledImageFormatPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubsampledImageFormatPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubsampledImageFormatPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubsampledImageFormatPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code subsampledImageDescriptorCount} field. */
        @NativeType("uint32_t")
        public int subsampledImageDescriptorCount() { return VkSubsampledImageFormatPropertiesEXT.nsubsampledImageDescriptorCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubsampledImageFormatPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSubsampledImageFormatPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_SUBSAMPLED_IMAGE_FORMAT_PROPERTIES_EXT STRUCTURE_TYPE_SUBSAMPLED_IMAGE_FORMAT_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkSubsampledImageFormatPropertiesEXT.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_SUBSAMPLED_IMAGE_FORMAT_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubsampledImageFormatPropertiesEXT.Buffer pNext(@NativeType("void const *") long value) { VkSubsampledImageFormatPropertiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code subsampledImageDescriptorCount} field. */
        public VkSubsampledImageFormatPropertiesEXT.Buffer subsampledImageDescriptorCount(@NativeType("uint32_t") int value) { VkSubsampledImageFormatPropertiesEXT.nsubsampledImageDescriptorCount(address(), value); return this; }

    }

}