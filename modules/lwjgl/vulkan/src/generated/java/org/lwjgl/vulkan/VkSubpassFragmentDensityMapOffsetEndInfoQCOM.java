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
 * struct VkSubpassFragmentDensityMapOffsetEndInfoQCOM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t fragmentDensityOffsetCount;
 *     {@link VkOffset2D VkOffset2D} const * pFragmentDensityOffsets;
 * }}</pre>
 */
public class VkSubpassFragmentDensityMapOffsetEndInfoQCOM extends Struct<VkSubpassFragmentDensityMapOffsetEndInfoQCOM> implements NativeResource {

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

    protected VkSubpassFragmentDensityMapOffsetEndInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubpassFragmentDensityMapOffsetEndInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM(ByteBuffer container) {
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
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMFragmentDensityMapOffset#VK_STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM} value to the {@code sType} field. */
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM sType$Default() { return sType(QCOMFragmentDensityMapOffset.VK_STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkOffset2D.Buffer} to the {@code pFragmentDensityOffsets} field. */
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pFragmentDensityOffsets(@NativeType("VkOffset2D const *") VkOffset2D.@Nullable Buffer value) { npFragmentDensityOffsets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM set(
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
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM set(VkSubpassFragmentDensityMapOffsetEndInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM malloc() {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM calloc() {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance for the specified memory address. */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM create(long address) {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubpassFragmentDensityMapOffsetEndInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM malloc(MemoryStack stack) {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM calloc(MemoryStack stack) {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #fragmentDensityOffsetCount}. */
    public static int nfragmentDensityOffsetCount(long struct) { return memGetInt(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.FRAGMENTDENSITYOFFSETCOUNT); }
    /** Unsafe version of {@link #pFragmentDensityOffsets}. */
    public static VkOffset2D.@Nullable Buffer npFragmentDensityOffsets(long struct) { return VkOffset2D.createSafe(memGetAddress(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.PFRAGMENTDENSITYOFFSETS), nfragmentDensityOffsetCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.PNEXT, value); }
    /** Sets the specified value to the {@code fragmentDensityOffsetCount} field of the specified {@code struct}. */
    public static void nfragmentDensityOffsetCount(long struct, int value) { memPutInt(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.FRAGMENTDENSITYOFFSETCOUNT, value); }
    /** Unsafe version of {@link #pFragmentDensityOffsets(VkOffset2D.Buffer) pFragmentDensityOffsets}. */
    public static void npFragmentDensityOffsets(long struct, VkOffset2D.@Nullable Buffer value) { memPutAddress(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.PFRAGMENTDENSITYOFFSETS, memAddressSafe(value)); nfragmentDensityOffsetCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nfragmentDensityOffsetCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassFragmentDensityMapOffsetEndInfoQCOM.PFRAGMENTDENSITYOFFSETS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkSubpassFragmentDensityMapOffsetEndInfoQCOM, Buffer> implements NativeResource {

        private static final VkSubpassFragmentDensityMapOffsetEndInfoQCOM ELEMENT_FACTORY = VkSubpassFragmentDensityMapOffsetEndInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubpassFragmentDensityMapOffsetEndInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.npNext(address()); }
        /** @return the value of the {@code fragmentDensityOffsetCount} field. */
        @NativeType("uint32_t")
        public int fragmentDensityOffsetCount() { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.nfragmentDensityOffsetCount(address()); }
        /** @return a {@link VkOffset2D.Buffer} view of the struct array pointed to by the {@code pFragmentDensityOffsets} field. */
        @NativeType("VkOffset2D const *")
        public VkOffset2D.@Nullable Buffer pFragmentDensityOffsets() { return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.npFragmentDensityOffsets(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMFragmentDensityMapOffset#VK_STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM} value to the {@code sType} field. */
        public VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer sType$Default() { return sType(QCOMFragmentDensityMapOffset.VK_STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkOffset2D.Buffer} to the {@code pFragmentDensityOffsets} field. */
        public VkSubpassFragmentDensityMapOffsetEndInfoQCOM.Buffer pFragmentDensityOffsets(@NativeType("VkOffset2D const *") VkOffset2D.@Nullable Buffer value) { VkSubpassFragmentDensityMapOffsetEndInfoQCOM.npFragmentDensityOffsets(address(), value); return this; }

    }

}