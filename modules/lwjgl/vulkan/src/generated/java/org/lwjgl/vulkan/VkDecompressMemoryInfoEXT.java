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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkDecompressMemoryInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkMemoryDecompressionMethodFlagsEXT decompressionMethod;
 *     uint32_t regionCount;
 *     {@link VkDecompressMemoryRegionEXT VkDecompressMemoryRegionEXT} const * pRegions;
 * }</code></pre>
 */
public class VkDecompressMemoryInfoEXT extends Struct<VkDecompressMemoryInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DECOMPRESSIONMETHOD,
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DECOMPRESSIONMETHOD = layout.offsetof(2);
        REGIONCOUNT = layout.offsetof(3);
        PREGIONS = layout.offsetof(4);
    }

    protected VkDecompressMemoryInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDecompressMemoryInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDecompressMemoryInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDecompressMemoryInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDecompressMemoryInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code decompressionMethod} field. */
    @NativeType("VkMemoryDecompressionMethodFlagsEXT")
    public long decompressionMethod() { return ndecompressionMethod(address()); }
    /** @return the value of the {@code regionCount} field. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** @return a {@link VkDecompressMemoryRegionEXT.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
    @NativeType("VkDecompressMemoryRegionEXT const *")
    public VkDecompressMemoryRegionEXT.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDecompressMemoryInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMemoryDecompression#VK_STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT} value to the {@code sType} field. */
    public VkDecompressMemoryInfoEXT sType$Default() { return sType(EXTMemoryDecompression.VK_STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDecompressMemoryInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code decompressionMethod} field. */
    public VkDecompressMemoryInfoEXT decompressionMethod(@NativeType("VkMemoryDecompressionMethodFlagsEXT") long value) { ndecompressionMethod(address(), value); return this; }
    /** Sets the address of the specified {@link VkDecompressMemoryRegionEXT.Buffer} to the {@code pRegions} field. */
    public VkDecompressMemoryInfoEXT pRegions(@NativeType("VkDecompressMemoryRegionEXT const *") VkDecompressMemoryRegionEXT.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDecompressMemoryInfoEXT set(
        int sType,
        long pNext,
        long decompressionMethod,
        VkDecompressMemoryRegionEXT.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        decompressionMethod(decompressionMethod);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDecompressMemoryInfoEXT set(VkDecompressMemoryInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDecompressMemoryInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDecompressMemoryInfoEXT malloc() {
        return new VkDecompressMemoryInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDecompressMemoryInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDecompressMemoryInfoEXT calloc() {
        return new VkDecompressMemoryInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDecompressMemoryInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDecompressMemoryInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDecompressMemoryInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDecompressMemoryInfoEXT} instance for the specified memory address. */
    public static VkDecompressMemoryInfoEXT create(long address) {
        return new VkDecompressMemoryInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDecompressMemoryInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDecompressMemoryInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDecompressMemoryInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDecompressMemoryInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDecompressMemoryInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDecompressMemoryInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDecompressMemoryInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDecompressMemoryInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDecompressMemoryInfoEXT malloc(MemoryStack stack) {
        return new VkDecompressMemoryInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDecompressMemoryInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDecompressMemoryInfoEXT calloc(MemoryStack stack) {
        return new VkDecompressMemoryInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDecompressMemoryInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDecompressMemoryInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDecompressMemoryInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDecompressMemoryInfoEXT.PNEXT); }
    /** Unsafe version of {@link #decompressionMethod}. */
    public static long ndecompressionMethod(long struct) { return memGetLong(struct + VkDecompressMemoryInfoEXT.DECOMPRESSIONMETHOD); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return memGetInt(struct + VkDecompressMemoryInfoEXT.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkDecompressMemoryRegionEXT.Buffer npRegions(long struct) { return VkDecompressMemoryRegionEXT.create(memGetAddress(struct + VkDecompressMemoryInfoEXT.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDecompressMemoryInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDecompressMemoryInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #decompressionMethod(long) decompressionMethod}. */
    public static void ndecompressionMethod(long struct, long value) { memPutLong(struct + VkDecompressMemoryInfoEXT.DECOMPRESSIONMETHOD, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { memPutInt(struct + VkDecompressMemoryInfoEXT.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkDecompressMemoryRegionEXT.Buffer) pRegions}. */
    public static void npRegions(long struct, VkDecompressMemoryRegionEXT.Buffer value) { memPutAddress(struct + VkDecompressMemoryInfoEXT.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDecompressMemoryInfoEXT.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkDecompressMemoryInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDecompressMemoryInfoEXT, Buffer> implements NativeResource {

        private static final VkDecompressMemoryInfoEXT ELEMENT_FACTORY = VkDecompressMemoryInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDecompressMemoryInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDecompressMemoryInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDecompressMemoryInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDecompressMemoryInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDecompressMemoryInfoEXT.npNext(address()); }
        /** @return the value of the {@code decompressionMethod} field. */
        @NativeType("VkMemoryDecompressionMethodFlagsEXT")
        public long decompressionMethod() { return VkDecompressMemoryInfoEXT.ndecompressionMethod(address()); }
        /** @return the value of the {@code regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkDecompressMemoryInfoEXT.nregionCount(address()); }
        /** @return a {@link VkDecompressMemoryRegionEXT.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
        @NativeType("VkDecompressMemoryRegionEXT const *")
        public VkDecompressMemoryRegionEXT.Buffer pRegions() { return VkDecompressMemoryInfoEXT.npRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDecompressMemoryInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDecompressMemoryInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMemoryDecompression#VK_STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT} value to the {@code sType} field. */
        public VkDecompressMemoryInfoEXT.Buffer sType$Default() { return sType(EXTMemoryDecompression.VK_STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDecompressMemoryInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDecompressMemoryInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code decompressionMethod} field. */
        public VkDecompressMemoryInfoEXT.Buffer decompressionMethod(@NativeType("VkMemoryDecompressionMethodFlagsEXT") long value) { VkDecompressMemoryInfoEXT.ndecompressionMethod(address(), value); return this; }
        /** Sets the address of the specified {@link VkDecompressMemoryRegionEXT.Buffer} to the {@code pRegions} field. */
        public VkDecompressMemoryInfoEXT.Buffer pRegions(@NativeType("VkDecompressMemoryRegionEXT const *") VkDecompressMemoryRegionEXT.Buffer value) { VkDecompressMemoryInfoEXT.npRegions(address(), value); return this; }

    }

}