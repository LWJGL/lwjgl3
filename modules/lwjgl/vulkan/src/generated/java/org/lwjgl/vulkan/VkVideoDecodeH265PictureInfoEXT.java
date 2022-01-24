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
 * Structure specifies H.265 picture information when decoding a frame.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_EXT}</li>
 * <li>{@code pStdPictureInfo} <b>must</b> be a valid pointer to a {@code StdVideoDecodeH265PictureInfo} value</li>
 * <li>{@code pSlicesDataOffsets} <b>must</b> be a valid pointer to an array of {@code slicesCount} {@code uint32_t} values</li>
 * <li>{@code slicesCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH265PictureInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoDecodeH265PictureInfo StdVideoDecodeH265PictureInfo} * {@link #pStdPictureInfo};
 *     uint32_t {@link #slicesCount};
 *     uint32_t const * {@link #pSlicesDataOffsets};
 * }</code></pre>
 */
public class VkVideoDecodeH265PictureInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSTDPICTUREINFO,
        SLICESCOUNT,
        PSLICESDATAOFFSETS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDPICTUREINFO = layout.offsetof(2);
        SLICESCOUNT = layout.offsetof(3);
        PSLICESDATAOFFSETS = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkVideoDecodeH265PictureInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH265PictureInfoEXT(ByteBuffer container) {
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
    /** a pointer to a {@code StdVideoDecodeH265PictureInfo} structure specifying codec standard specific picture information from the H.265 specification. */
    @NativeType("StdVideoDecodeH265PictureInfo *")
    public StdVideoDecodeH265PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }
    /** the number of slices in this picture. */
    @NativeType("uint32_t")
    public int slicesCount() { return nslicesCount(address()); }
    /** a pointer to an array of {@code slicesCount} offsets indicating the start offset of each slice within the bitstream buffer. */
    @NativeType("uint32_t const *")
    public IntBuffer pSlicesDataOffsets() { return npSlicesDataOffsets(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH265PictureInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoDecodeH265PictureInfoEXT sType$Default() { return sType(EXTVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH265PictureInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoDecodeH265PictureInfo} to the {@link #pStdPictureInfo} field. */
    public VkVideoDecodeH265PictureInfoEXT pStdPictureInfo(@NativeType("StdVideoDecodeH265PictureInfo *") StdVideoDecodeH265PictureInfo value) { npStdPictureInfo(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pSlicesDataOffsets} field. */
    public VkVideoDecodeH265PictureInfoEXT pSlicesDataOffsets(@NativeType("uint32_t const *") IntBuffer value) { npSlicesDataOffsets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH265PictureInfoEXT set(
        int sType,
        long pNext,
        StdVideoDecodeH265PictureInfo pStdPictureInfo,
        IntBuffer pSlicesDataOffsets
    ) {
        sType(sType);
        pNext(pNext);
        pStdPictureInfo(pStdPictureInfo);
        pSlicesDataOffsets(pSlicesDataOffsets);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeH265PictureInfoEXT set(VkVideoDecodeH265PictureInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH265PictureInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH265PictureInfoEXT malloc() {
        return wrap(VkVideoDecodeH265PictureInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH265PictureInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH265PictureInfoEXT calloc() {
        return wrap(VkVideoDecodeH265PictureInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH265PictureInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH265PictureInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoDecodeH265PictureInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH265PictureInfoEXT} instance for the specified memory address. */
    public static VkVideoDecodeH265PictureInfoEXT create(long address) {
        return wrap(VkVideoDecodeH265PictureInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH265PictureInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoDecodeH265PictureInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265PictureInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265PictureInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265PictureInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265PictureInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265PictureInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265PictureInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoDecodeH265PictureInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265PictureInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH265PictureInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH265PictureInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH265PictureInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH265PictureInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoDecodeH265PictureInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH265PictureInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH265PictureInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoDecodeH265PictureInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265PictureInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265PictureInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265PictureInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH265PictureInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH265PictureInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoDecodeH265PictureInfo npStdPictureInfo(long struct) { return StdVideoDecodeH265PictureInfo.create(memGetAddress(struct + VkVideoDecodeH265PictureInfoEXT.PSTDPICTUREINFO)); }
    /** Unsafe version of {@link #slicesCount}. */
    public static int nslicesCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH265PictureInfoEXT.SLICESCOUNT); }
    /** Unsafe version of {@link #pSlicesDataOffsets() pSlicesDataOffsets}. */
    public static IntBuffer npSlicesDataOffsets(long struct) { return memIntBuffer(memGetAddress(struct + VkVideoDecodeH265PictureInfoEXT.PSLICESDATAOFFSETS), nslicesCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH265PictureInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH265PictureInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoDecodeH265PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoDecodeH265PictureInfo value) { memPutAddress(struct + VkVideoDecodeH265PictureInfoEXT.PSTDPICTUREINFO, value.address()); }
    /** Sets the specified value to the {@code slicesCount} field of the specified {@code struct}. */
    public static void nslicesCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH265PictureInfoEXT.SLICESCOUNT, value); }
    /** Unsafe version of {@link #pSlicesDataOffsets(IntBuffer) pSlicesDataOffsets}. */
    public static void npSlicesDataOffsets(long struct, IntBuffer value) { memPutAddress(struct + VkVideoDecodeH265PictureInfoEXT.PSLICESDATAOFFSETS, memAddress(value)); nslicesCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoDecodeH265PictureInfoEXT.PSTDPICTUREINFO));
        check(memGetAddress(struct + VkVideoDecodeH265PictureInfoEXT.PSLICESDATAOFFSETS));
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH265PictureInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH265PictureInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoDecodeH265PictureInfoEXT ELEMENT_FACTORY = VkVideoDecodeH265PictureInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH265PictureInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH265PictureInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoDecodeH265PictureInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH265PictureInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH265PictureInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH265PictureInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH265PictureInfoEXT.npNext(address()); }
        /** @return a {@link StdVideoDecodeH265PictureInfo} view of the struct pointed to by the {@link VkVideoDecodeH265PictureInfoEXT#pStdPictureInfo} field. */
        @NativeType("StdVideoDecodeH265PictureInfo *")
        public StdVideoDecodeH265PictureInfo pStdPictureInfo() { return VkVideoDecodeH265PictureInfoEXT.npStdPictureInfo(address()); }
        /** @return the value of the {@link VkVideoDecodeH265PictureInfoEXT#slicesCount} field. */
        @NativeType("uint32_t")
        public int slicesCount() { return VkVideoDecodeH265PictureInfoEXT.nslicesCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkVideoDecodeH265PictureInfoEXT#pSlicesDataOffsets} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pSlicesDataOffsets() { return VkVideoDecodeH265PictureInfoEXT.npSlicesDataOffsets(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH265PictureInfoEXT#sType} field. */
        public VkVideoDecodeH265PictureInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH265PictureInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_EXT} value to the {@link VkVideoDecodeH265PictureInfoEXT#sType} field. */
        public VkVideoDecodeH265PictureInfoEXT.Buffer sType$Default() { return sType(EXTVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoDecodeH265PictureInfoEXT#pNext} field. */
        public VkVideoDecodeH265PictureInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH265PictureInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoDecodeH265PictureInfo} to the {@link VkVideoDecodeH265PictureInfoEXT#pStdPictureInfo} field. */
        public VkVideoDecodeH265PictureInfoEXT.Buffer pStdPictureInfo(@NativeType("StdVideoDecodeH265PictureInfo *") StdVideoDecodeH265PictureInfo value) { VkVideoDecodeH265PictureInfoEXT.npStdPictureInfo(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkVideoDecodeH265PictureInfoEXT#pSlicesDataOffsets} field. */
        public VkVideoDecodeH265PictureInfoEXT.Buffer pSlicesDataOffsets(@NativeType("uint32_t const *") IntBuffer value) { VkVideoDecodeH265PictureInfoEXT.npSlicesDataOffsets(address(), value); return this; }

    }

}