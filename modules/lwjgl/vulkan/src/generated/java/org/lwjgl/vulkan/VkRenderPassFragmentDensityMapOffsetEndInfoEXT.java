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
 * <pre>{@code
 * struct VkRenderPassFragmentDensityMapOffsetEndInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t fragmentDensityOffsetCount;
 *     {@link VkOffset2D VkOffset2D} const * pFragmentDensityOffsets;
 * }}</pre>
 */
public class VkRenderPassFragmentDensityMapOffsetEndInfoEXT extends Struct<VkRenderPassFragmentDensityMapOffsetEndInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTDENSITYOFFSETCOUNT,
        PFRAGMENTDENSITYOFFSETS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTDENSITYOFFSETCOUNT = layout.offsetof(2);
        PFRAGMENTDENSITYOFFSETS = layout.offsetof(3);
    }

    protected VkRenderPassFragmentDensityMapOffsetEndInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassFragmentDensityMapOffsetEndInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkRenderPassFragmentDensityMapOffsetEndInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code fragmentDensityOffsetCount} field. */
    @NativeType("uint32_t")
    public int fragmentDensityOffsetCount() { return nfragmentDensityOffsetCount(address()); }
    /** @return a {@link VkOffset2D.Buffer} view of the struct array pointed to by the {@code pFragmentDensityOffsets} field. */
    @NativeType("VkOffset2D const *")
    public VkOffset2D.@Nullable Buffer pFragmentDensityOffsets() { return npFragmentDensityOffsets(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFragmentDensityMapOffset#VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT} value to the {@code sType} field. */
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT sType$Default() { return sType(EXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkOffset2D.Buffer} to the {@code pFragmentDensityOffsets} field. */
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT pFragmentDensityOffsets(@NativeType("VkOffset2D const *") VkOffset2D.@Nullable Buffer value) { npFragmentDensityOffsets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT set(
        int sType,
        long pNext,
        VkOffset2D.@Nullable Buffer pFragmentDensityOffsets
    ) {
        sType(sType);
        pNext(pNext);
        pFragmentDensityOffsets(pFragmentDensityOffsets);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassFragmentDensityMapOffsetEndInfoEXT set(VkRenderPassFragmentDensityMapOffsetEndInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassFragmentDensityMapOffsetEndInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT malloc() {
        return new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassFragmentDensityMapOffsetEndInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT calloc() {
        return new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassFragmentDensityMapOffsetEndInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassFragmentDensityMapOffsetEndInfoEXT} instance for the specified memory address. */
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT create(long address) {
        return new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassFragmentDensityMapOffsetEndInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderPassFragmentDensityMapOffsetEndInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT malloc(MemoryStack stack) {
        return new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassFragmentDensityMapOffsetEndInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT calloc(MemoryStack stack) {
        return new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassFragmentDensityMapOffsetEndInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassFragmentDensityMapOffsetEndInfoEXT.PNEXT); }
    /** Unsafe version of {@link #fragmentDensityOffsetCount}. */
    public static int nfragmentDensityOffsetCount(long struct) { return memGetInt(struct + VkRenderPassFragmentDensityMapOffsetEndInfoEXT.FRAGMENTDENSITYOFFSETCOUNT); }
    /** Unsafe version of {@link #pFragmentDensityOffsets}. */
    public static VkOffset2D.@Nullable Buffer npFragmentDensityOffsets(long struct) { return VkOffset2D.createSafe(memGetAddress(struct + VkRenderPassFragmentDensityMapOffsetEndInfoEXT.PFRAGMENTDENSITYOFFSETS), nfragmentDensityOffsetCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassFragmentDensityMapOffsetEndInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassFragmentDensityMapOffsetEndInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code fragmentDensityOffsetCount} field of the specified {@code struct}. */
    public static void nfragmentDensityOffsetCount(long struct, int value) { memPutInt(struct + VkRenderPassFragmentDensityMapOffsetEndInfoEXT.FRAGMENTDENSITYOFFSETCOUNT, value); }
    /** Unsafe version of {@link #pFragmentDensityOffsets(VkOffset2D.Buffer) pFragmentDensityOffsets}. */
    public static void npFragmentDensityOffsets(long struct, VkOffset2D.@Nullable Buffer value) { memPutAddress(struct + VkRenderPassFragmentDensityMapOffsetEndInfoEXT.PFRAGMENTDENSITYOFFSETS, memAddressSafe(value)); nfragmentDensityOffsetCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nfragmentDensityOffsetCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassFragmentDensityMapOffsetEndInfoEXT.PFRAGMENTDENSITYOFFSETS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassFragmentDensityMapOffsetEndInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassFragmentDensityMapOffsetEndInfoEXT, Buffer> implements NativeResource {

        private static final VkRenderPassFragmentDensityMapOffsetEndInfoEXT ELEMENT_FACTORY = VkRenderPassFragmentDensityMapOffsetEndInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassFragmentDensityMapOffsetEndInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassFragmentDensityMapOffsetEndInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassFragmentDensityMapOffsetEndInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassFragmentDensityMapOffsetEndInfoEXT.npNext(address()); }
        /** @return the value of the {@code fragmentDensityOffsetCount} field. */
        @NativeType("uint32_t")
        public int fragmentDensityOffsetCount() { return VkRenderPassFragmentDensityMapOffsetEndInfoEXT.nfragmentDensityOffsetCount(address()); }
        /** @return a {@link VkOffset2D.Buffer} view of the struct array pointed to by the {@code pFragmentDensityOffsets} field. */
        @NativeType("VkOffset2D const *")
        public VkOffset2D.@Nullable Buffer pFragmentDensityOffsets() { return VkRenderPassFragmentDensityMapOffsetEndInfoEXT.npFragmentDensityOffsets(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassFragmentDensityMapOffsetEndInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFragmentDensityMapOffset#VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT} value to the {@code sType} field. */
        public VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer sType$Default() { return sType(EXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassFragmentDensityMapOffsetEndInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkOffset2D.Buffer} to the {@code pFragmentDensityOffsets} field. */
        public VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer pFragmentDensityOffsets(@NativeType("VkOffset2D const *") VkOffset2D.@Nullable Buffer value) { VkRenderPassFragmentDensityMapOffsetEndInfoEXT.npFragmentDensityOffsets(address(), value); return this; }

    }

}