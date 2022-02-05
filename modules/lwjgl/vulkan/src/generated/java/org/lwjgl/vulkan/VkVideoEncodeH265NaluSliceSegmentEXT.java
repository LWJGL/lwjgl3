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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifies H.265 encode slice segment NALU parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code pReferenceFinalLists} is not {@code NULL}, {@code pReferenceFinalLists} <b>must</b> be a valid pointer to a valid {@link VkVideoEncodeH265ReferenceListsEXT} structure</li>
 * <li>{@code pSliceSegmentHeaderStd} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH265SliceSegmentHeader} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265ReferenceListsEXT}, {@link VkVideoEncodeH265VclFrameInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265NaluSliceSegmentEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #ctbCount};
 *     {@link VkVideoEncodeH265ReferenceListsEXT VkVideoEncodeH265ReferenceListsEXT} const * {@link #pReferenceFinalLists};
 *     {@link StdVideoEncodeH265SliceSegmentHeader StdVideoEncodeH265SliceSegmentHeader} const * {@link #pSliceSegmentHeaderStd};
 * }</code></pre>
 */
public class VkVideoEncodeH265NaluSliceSegmentEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CTBCOUNT,
        PREFERENCEFINALLISTS,
        PSLICESEGMENTHEADERSTD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CTBCOUNT = layout.offsetof(2);
        PREFERENCEFINALLISTS = layout.offsetof(3);
        PSLICESEGMENTHEADERSTD = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkVideoEncodeH265NaluSliceSegmentEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265NaluSliceSegmentEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of CTBs in this slice segment. */
    @NativeType("uint32_t")
    public int ctbCount() { return nctbCount(address()); }
    /** {@code NULL} or a pointer to a {@link VkVideoEncodeH265ReferenceListsEXT} structure specifying the reference lists to be used for the current slice segment. If {@code pReferenceFinalLists} is not {@code NULL}, these reference lists override the reference lists provided in {@link VkVideoEncodeH265VclFrameInfoEXT}{@code ::pReferenceFinalLists}. */
    @Nullable
    @NativeType("VkVideoEncodeH265ReferenceListsEXT const *")
    public VkVideoEncodeH265ReferenceListsEXT pReferenceFinalLists() { return npReferenceFinalLists(address()); }
    /** a pointer to a {@code StdVideoEncodeH265SliceSegmentHeader} structure specifying the slice segment header for the current slice segment. */
    @NativeType("StdVideoEncodeH265SliceSegmentHeader const *")
    public StdVideoEncodeH265SliceSegmentHeader pSliceSegmentHeaderStd() { return npSliceSegmentHeaderStd(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265NaluSliceSegmentEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265NaluSliceSegmentEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265NaluSliceSegmentEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #ctbCount} field. */
    public VkVideoEncodeH265NaluSliceSegmentEXT ctbCount(@NativeType("uint32_t") int value) { nctbCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH265ReferenceListsEXT} to the {@link #pReferenceFinalLists} field. */
    public VkVideoEncodeH265NaluSliceSegmentEXT pReferenceFinalLists(@Nullable @NativeType("VkVideoEncodeH265ReferenceListsEXT const *") VkVideoEncodeH265ReferenceListsEXT value) { npReferenceFinalLists(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265SliceSegmentHeader} to the {@link #pSliceSegmentHeaderStd} field. */
    public VkVideoEncodeH265NaluSliceSegmentEXT pSliceSegmentHeaderStd(@NativeType("StdVideoEncodeH265SliceSegmentHeader const *") StdVideoEncodeH265SliceSegmentHeader value) { npSliceSegmentHeaderStd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265NaluSliceSegmentEXT set(
        int sType,
        long pNext,
        int ctbCount,
        @Nullable VkVideoEncodeH265ReferenceListsEXT pReferenceFinalLists,
        StdVideoEncodeH265SliceSegmentHeader pSliceSegmentHeaderStd
    ) {
        sType(sType);
        pNext(pNext);
        ctbCount(ctbCount);
        pReferenceFinalLists(pReferenceFinalLists);
        pSliceSegmentHeaderStd(pSliceSegmentHeaderStd);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265NaluSliceSegmentEXT set(VkVideoEncodeH265NaluSliceSegmentEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265NaluSliceSegmentEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265NaluSliceSegmentEXT malloc() {
        return wrap(VkVideoEncodeH265NaluSliceSegmentEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265NaluSliceSegmentEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265NaluSliceSegmentEXT calloc() {
        return wrap(VkVideoEncodeH265NaluSliceSegmentEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265NaluSliceSegmentEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265NaluSliceSegmentEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH265NaluSliceSegmentEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265NaluSliceSegmentEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265NaluSliceSegmentEXT create(long address) {
        return wrap(VkVideoEncodeH265NaluSliceSegmentEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265NaluSliceSegmentEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH265NaluSliceSegmentEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH265NaluSliceSegmentEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265NaluSliceSegmentEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265NaluSliceSegmentEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265NaluSliceSegmentEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265NaluSliceSegmentEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH265NaluSliceSegmentEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265NaluSliceSegmentEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265NaluSliceSegmentEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265NaluSliceSegmentEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265NaluSliceSegmentEXT.PNEXT); }
    /** Unsafe version of {@link #ctbCount}. */
    public static int nctbCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265NaluSliceSegmentEXT.CTBCOUNT); }
    /** Unsafe version of {@link #pReferenceFinalLists}. */
    @Nullable public static VkVideoEncodeH265ReferenceListsEXT npReferenceFinalLists(long struct) { return VkVideoEncodeH265ReferenceListsEXT.createSafe(memGetAddress(struct + VkVideoEncodeH265NaluSliceSegmentEXT.PREFERENCEFINALLISTS)); }
    /** Unsafe version of {@link #pSliceSegmentHeaderStd}. */
    public static StdVideoEncodeH265SliceSegmentHeader npSliceSegmentHeaderStd(long struct) { return StdVideoEncodeH265SliceSegmentHeader.create(memGetAddress(struct + VkVideoEncodeH265NaluSliceSegmentEXT.PSLICESEGMENTHEADERSTD)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265NaluSliceSegmentEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265NaluSliceSegmentEXT.PNEXT, value); }
    /** Unsafe version of {@link #ctbCount(int) ctbCount}. */
    public static void nctbCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265NaluSliceSegmentEXT.CTBCOUNT, value); }
    /** Unsafe version of {@link #pReferenceFinalLists(VkVideoEncodeH265ReferenceListsEXT) pReferenceFinalLists}. */
    public static void npReferenceFinalLists(long struct, @Nullable VkVideoEncodeH265ReferenceListsEXT value) { memPutAddress(struct + VkVideoEncodeH265NaluSliceSegmentEXT.PREFERENCEFINALLISTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pSliceSegmentHeaderStd(StdVideoEncodeH265SliceSegmentHeader) pSliceSegmentHeaderStd}. */
    public static void npSliceSegmentHeaderStd(long struct, StdVideoEncodeH265SliceSegmentHeader value) { memPutAddress(struct + VkVideoEncodeH265NaluSliceSegmentEXT.PSLICESEGMENTHEADERSTD, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pReferenceFinalLists = memGetAddress(struct + VkVideoEncodeH265NaluSliceSegmentEXT.PREFERENCEFINALLISTS);
        if (pReferenceFinalLists != NULL) {
            VkVideoEncodeH265ReferenceListsEXT.validate(pReferenceFinalLists);
        }
        check(memGetAddress(struct + VkVideoEncodeH265NaluSliceSegmentEXT.PSLICESEGMENTHEADERSTD));
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265NaluSliceSegmentEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265NaluSliceSegmentEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265NaluSliceSegmentEXT ELEMENT_FACTORY = VkVideoEncodeH265NaluSliceSegmentEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265NaluSliceSegmentEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265NaluSliceSegmentEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH265NaluSliceSegmentEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265NaluSliceSegmentEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265NaluSliceSegmentEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265NaluSliceSegmentEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265NaluSliceSegmentEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265NaluSliceSegmentEXT#ctbCount} field. */
        @NativeType("uint32_t")
        public int ctbCount() { return VkVideoEncodeH265NaluSliceSegmentEXT.nctbCount(address()); }
        /** @return a {@link VkVideoEncodeH265ReferenceListsEXT} view of the struct pointed to by the {@link VkVideoEncodeH265NaluSliceSegmentEXT#pReferenceFinalLists} field. */
        @Nullable
        @NativeType("VkVideoEncodeH265ReferenceListsEXT const *")
        public VkVideoEncodeH265ReferenceListsEXT pReferenceFinalLists() { return VkVideoEncodeH265NaluSliceSegmentEXT.npReferenceFinalLists(address()); }
        /** @return a {@link StdVideoEncodeH265SliceSegmentHeader} view of the struct pointed to by the {@link VkVideoEncodeH265NaluSliceSegmentEXT#pSliceSegmentHeaderStd} field. */
        @NativeType("StdVideoEncodeH265SliceSegmentHeader const *")
        public StdVideoEncodeH265SliceSegmentHeader pSliceSegmentHeaderStd() { return VkVideoEncodeH265NaluSliceSegmentEXT.npSliceSegmentHeaderStd(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265NaluSliceSegmentEXT#sType} field. */
        public VkVideoEncodeH265NaluSliceSegmentEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265NaluSliceSegmentEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_EXT} value to the {@link VkVideoEncodeH265NaluSliceSegmentEXT#sType} field. */
        public VkVideoEncodeH265NaluSliceSegmentEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265NaluSliceSegmentEXT#pNext} field. */
        public VkVideoEncodeH265NaluSliceSegmentEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265NaluSliceSegmentEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265NaluSliceSegmentEXT#ctbCount} field. */
        public VkVideoEncodeH265NaluSliceSegmentEXT.Buffer ctbCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265NaluSliceSegmentEXT.nctbCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH265ReferenceListsEXT} to the {@link VkVideoEncodeH265NaluSliceSegmentEXT#pReferenceFinalLists} field. */
        public VkVideoEncodeH265NaluSliceSegmentEXT.Buffer pReferenceFinalLists(@Nullable @NativeType("VkVideoEncodeH265ReferenceListsEXT const *") VkVideoEncodeH265ReferenceListsEXT value) { VkVideoEncodeH265NaluSliceSegmentEXT.npReferenceFinalLists(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265SliceSegmentHeader} to the {@link VkVideoEncodeH265NaluSliceSegmentEXT#pSliceSegmentHeaderStd} field. */
        public VkVideoEncodeH265NaluSliceSegmentEXT.Buffer pSliceSegmentHeaderStd(@NativeType("StdVideoEncodeH265SliceSegmentHeader const *") StdVideoEncodeH265SliceSegmentHeader value) { VkVideoEncodeH265NaluSliceSegmentEXT.npSliceSegmentHeaderStd(address(), value); return this; }

    }

}