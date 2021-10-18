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
 * Structure specifies H.265 encode slice NALU parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code pReferenceFinalLists} is not {@code NULL}, {@code pReferenceFinalLists} <b>must</b> be a valid pointer to a valid {@link VkVideoEncodeH265ReferenceListsEXT} structure</li>
 * <li>{@code pSliceHeaderStd} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH265SliceHeader} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265ReferenceListsEXT}, {@link VkVideoEncodeH265VclFrameInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265NaluSliceEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #ctbCount};
 *     {@link VkVideoEncodeH265ReferenceListsEXT VkVideoEncodeH265ReferenceListsEXT} const * {@link #pReferenceFinalLists};
 *     {@link StdVideoEncodeH265SliceHeader StdVideoEncodeH265SliceHeader} const * {@link #pSliceHeaderStd};
 * }</code></pre>
 */
public class VkVideoEncodeH265NaluSliceEXT extends Struct implements NativeResource {

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
        PSLICEHEADERSTD;

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
        PSLICEHEADERSTD = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkVideoEncodeH265NaluSliceEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265NaluSliceEXT(ByteBuffer container) {
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
    /** the number of CTBs in this slice. */
    @NativeType("uint32_t")
    public int ctbCount() { return nctbCount(address()); }
    /** {@code NULL} or a pointer to a {@link VkVideoEncodeH265ReferenceListsEXT} structure specifying the reference lists to be used for the current slice. If {@code pReferenceFinalLists} is not {@code NULL}, these reference lists override the reference lists provided in {@link VkVideoEncodeH265VclFrameInfoEXT}{@code ::pReferenceFinalLists}. */
    @Nullable
    @NativeType("VkVideoEncodeH265ReferenceListsEXT const *")
    public VkVideoEncodeH265ReferenceListsEXT pReferenceFinalLists() { return npReferenceFinalLists(address()); }
    /** a pointer to a {@code StdVideoEncodeH265SliceHeader} structure specifying the slice header for the current slice. */
    @NativeType("StdVideoEncodeH265SliceHeader const *")
    public StdVideoEncodeH265SliceHeader pSliceHeaderStd() { return npSliceHeaderStd(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265NaluSliceEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265NaluSliceEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265NaluSliceEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #ctbCount} field. */
    public VkVideoEncodeH265NaluSliceEXT ctbCount(@NativeType("uint32_t") int value) { nctbCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH265ReferenceListsEXT} to the {@link #pReferenceFinalLists} field. */
    public VkVideoEncodeH265NaluSliceEXT pReferenceFinalLists(@Nullable @NativeType("VkVideoEncodeH265ReferenceListsEXT const *") VkVideoEncodeH265ReferenceListsEXT value) { npReferenceFinalLists(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265SliceHeader} to the {@link #pSliceHeaderStd} field. */
    public VkVideoEncodeH265NaluSliceEXT pSliceHeaderStd(@NativeType("StdVideoEncodeH265SliceHeader const *") StdVideoEncodeH265SliceHeader value) { npSliceHeaderStd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265NaluSliceEXT set(
        int sType,
        long pNext,
        int ctbCount,
        @Nullable VkVideoEncodeH265ReferenceListsEXT pReferenceFinalLists,
        StdVideoEncodeH265SliceHeader pSliceHeaderStd
    ) {
        sType(sType);
        pNext(pNext);
        ctbCount(ctbCount);
        pReferenceFinalLists(pReferenceFinalLists);
        pSliceHeaderStd(pSliceHeaderStd);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265NaluSliceEXT set(VkVideoEncodeH265NaluSliceEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265NaluSliceEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265NaluSliceEXT malloc() {
        return wrap(VkVideoEncodeH265NaluSliceEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265NaluSliceEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265NaluSliceEXT calloc() {
        return wrap(VkVideoEncodeH265NaluSliceEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265NaluSliceEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265NaluSliceEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH265NaluSliceEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265NaluSliceEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265NaluSliceEXT create(long address) {
        return wrap(VkVideoEncodeH265NaluSliceEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265NaluSliceEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH265NaluSliceEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH265NaluSliceEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265NaluSliceEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkVideoEncodeH265NaluSliceEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265NaluSliceEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265NaluSliceEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH265NaluSliceEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265NaluSliceEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265NaluSliceEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265NaluSliceEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265NaluSliceEXT.PNEXT); }
    /** Unsafe version of {@link #ctbCount}. */
    public static int nctbCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265NaluSliceEXT.CTBCOUNT); }
    /** Unsafe version of {@link #pReferenceFinalLists}. */
    @Nullable public static VkVideoEncodeH265ReferenceListsEXT npReferenceFinalLists(long struct) { return VkVideoEncodeH265ReferenceListsEXT.createSafe(memGetAddress(struct + VkVideoEncodeH265NaluSliceEXT.PREFERENCEFINALLISTS)); }
    /** Unsafe version of {@link #pSliceHeaderStd}. */
    public static StdVideoEncodeH265SliceHeader npSliceHeaderStd(long struct) { return StdVideoEncodeH265SliceHeader.create(memGetAddress(struct + VkVideoEncodeH265NaluSliceEXT.PSLICEHEADERSTD)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265NaluSliceEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265NaluSliceEXT.PNEXT, value); }
    /** Unsafe version of {@link #ctbCount(int) ctbCount}. */
    public static void nctbCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265NaluSliceEXT.CTBCOUNT, value); }
    /** Unsafe version of {@link #pReferenceFinalLists(VkVideoEncodeH265ReferenceListsEXT) pReferenceFinalLists}. */
    public static void npReferenceFinalLists(long struct, @Nullable VkVideoEncodeH265ReferenceListsEXT value) { memPutAddress(struct + VkVideoEncodeH265NaluSliceEXT.PREFERENCEFINALLISTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pSliceHeaderStd(StdVideoEncodeH265SliceHeader) pSliceHeaderStd}. */
    public static void npSliceHeaderStd(long struct, StdVideoEncodeH265SliceHeader value) { memPutAddress(struct + VkVideoEncodeH265NaluSliceEXT.PSLICEHEADERSTD, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pReferenceFinalLists = memGetAddress(struct + VkVideoEncodeH265NaluSliceEXT.PREFERENCEFINALLISTS);
        if (pReferenceFinalLists != NULL) {
            VkVideoEncodeH265ReferenceListsEXT.validate(pReferenceFinalLists);
        }
        check(memGetAddress(struct + VkVideoEncodeH265NaluSliceEXT.PSLICEHEADERSTD));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265NaluSliceEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265NaluSliceEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265NaluSliceEXT ELEMENT_FACTORY = VkVideoEncodeH265NaluSliceEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265NaluSliceEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265NaluSliceEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH265NaluSliceEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265NaluSliceEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265NaluSliceEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265NaluSliceEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265NaluSliceEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265NaluSliceEXT#ctbCount} field. */
        @NativeType("uint32_t")
        public int ctbCount() { return VkVideoEncodeH265NaluSliceEXT.nctbCount(address()); }
        /** @return a {@link VkVideoEncodeH265ReferenceListsEXT} view of the struct pointed to by the {@link VkVideoEncodeH265NaluSliceEXT#pReferenceFinalLists} field. */
        @Nullable
        @NativeType("VkVideoEncodeH265ReferenceListsEXT const *")
        public VkVideoEncodeH265ReferenceListsEXT pReferenceFinalLists() { return VkVideoEncodeH265NaluSliceEXT.npReferenceFinalLists(address()); }
        /** @return a {@link StdVideoEncodeH265SliceHeader} view of the struct pointed to by the {@link VkVideoEncodeH265NaluSliceEXT#pSliceHeaderStd} field. */
        @NativeType("StdVideoEncodeH265SliceHeader const *")
        public StdVideoEncodeH265SliceHeader pSliceHeaderStd() { return VkVideoEncodeH265NaluSliceEXT.npSliceHeaderStd(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265NaluSliceEXT#sType} field. */
        public VkVideoEncodeH265NaluSliceEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265NaluSliceEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_EXT} value to the {@link VkVideoEncodeH265NaluSliceEXT#sType} field. */
        public VkVideoEncodeH265NaluSliceEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265NaluSliceEXT#pNext} field. */
        public VkVideoEncodeH265NaluSliceEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265NaluSliceEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265NaluSliceEXT#ctbCount} field. */
        public VkVideoEncodeH265NaluSliceEXT.Buffer ctbCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265NaluSliceEXT.nctbCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH265ReferenceListsEXT} to the {@link VkVideoEncodeH265NaluSliceEXT#pReferenceFinalLists} field. */
        public VkVideoEncodeH265NaluSliceEXT.Buffer pReferenceFinalLists(@Nullable @NativeType("VkVideoEncodeH265ReferenceListsEXT const *") VkVideoEncodeH265ReferenceListsEXT value) { VkVideoEncodeH265NaluSliceEXT.npReferenceFinalLists(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265SliceHeader} to the {@link VkVideoEncodeH265NaluSliceEXT#pSliceHeaderStd} field. */
        public VkVideoEncodeH265NaluSliceEXT.Buffer pSliceHeaderStd(@NativeType("StdVideoEncodeH265SliceHeader const *") StdVideoEncodeH265SliceHeader value) { VkVideoEncodeH265NaluSliceEXT.npSliceHeaderStd(address(), value); return this; }

    }

}