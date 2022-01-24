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
 * Structure specifies H.264 decode picture parameters when decoding a picture.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_EXT}</li>
 * <li>{@code pStdPictureInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoDecodeH264PictureInfo} value</li>
 * <li>{@code pSlicesDataOffsets} <b>must</b> be a valid pointer to an array of {@code slicesCount} {@code uint32_t} values</li>
 * <li>{@code slicesCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH264PictureInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoDecodeH264PictureInfo StdVideoDecodeH264PictureInfo} const * {@link #pStdPictureInfo};
 *     uint32_t {@link #slicesCount};
 *     uint32_t const * {@link #pSlicesDataOffsets};
 * }</code></pre>
 */
public class VkVideoDecodeH264PictureInfoEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkVideoDecodeH264PictureInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264PictureInfoEXT(ByteBuffer container) {
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
    /** a pointer to a {@code StdVideoDecodeH264PictureInfo} structure specifying the codec standard specific picture information from the H.264 specification. */
    @NativeType("StdVideoDecodeH264PictureInfo const *")
    public StdVideoDecodeH264PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }
    /** the number of slices in this picture. */
    @NativeType("uint32_t")
    public int slicesCount() { return nslicesCount(address()); }
    /** a pointer to an array of {@code slicesCount} offsets indicating the start offset of each slice within the bitstream buffer. */
    @NativeType("uint32_t const *")
    public IntBuffer pSlicesDataOffsets() { return npSlicesDataOffsets(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH264PictureInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoDecodeH264PictureInfoEXT sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH264PictureInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeH264MvcEXT} value to the {@code pNext} chain. */
    public VkVideoDecodeH264PictureInfoEXT pNext(VkVideoDecodeH264MvcEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the address of the specified {@link StdVideoDecodeH264PictureInfo} to the {@link #pStdPictureInfo} field. */
    public VkVideoDecodeH264PictureInfoEXT pStdPictureInfo(@NativeType("StdVideoDecodeH264PictureInfo const *") StdVideoDecodeH264PictureInfo value) { npStdPictureInfo(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pSlicesDataOffsets} field. */
    public VkVideoDecodeH264PictureInfoEXT pSlicesDataOffsets(@NativeType("uint32_t const *") IntBuffer value) { npSlicesDataOffsets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264PictureInfoEXT set(
        int sType,
        long pNext,
        StdVideoDecodeH264PictureInfo pStdPictureInfo,
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
    public VkVideoDecodeH264PictureInfoEXT set(VkVideoDecodeH264PictureInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264PictureInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264PictureInfoEXT malloc() {
        return wrap(VkVideoDecodeH264PictureInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264PictureInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264PictureInfoEXT calloc() {
        return wrap(VkVideoDecodeH264PictureInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264PictureInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264PictureInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoDecodeH264PictureInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264PictureInfoEXT} instance for the specified memory address. */
    public static VkVideoDecodeH264PictureInfoEXT create(long address) {
        return wrap(VkVideoDecodeH264PictureInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264PictureInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoDecodeH264PictureInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264PictureInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264PictureInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264PictureInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264PictureInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264PictureInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264PictureInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoDecodeH264PictureInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264PictureInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264PictureInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264PictureInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264PictureInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264PictureInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoDecodeH264PictureInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264PictureInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264PictureInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoDecodeH264PictureInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264PictureInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264PictureInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264PictureInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264PictureInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264PictureInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoDecodeH264PictureInfo npStdPictureInfo(long struct) { return StdVideoDecodeH264PictureInfo.create(memGetAddress(struct + VkVideoDecodeH264PictureInfoEXT.PSTDPICTUREINFO)); }
    /** Unsafe version of {@link #slicesCount}. */
    public static int nslicesCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264PictureInfoEXT.SLICESCOUNT); }
    /** Unsafe version of {@link #pSlicesDataOffsets() pSlicesDataOffsets}. */
    public static IntBuffer npSlicesDataOffsets(long struct) { return memIntBuffer(memGetAddress(struct + VkVideoDecodeH264PictureInfoEXT.PSLICESDATAOFFSETS), nslicesCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264PictureInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264PictureInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoDecodeH264PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoDecodeH264PictureInfo value) { memPutAddress(struct + VkVideoDecodeH264PictureInfoEXT.PSTDPICTUREINFO, value.address()); }
    /** Sets the specified value to the {@code slicesCount} field of the specified {@code struct}. */
    public static void nslicesCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264PictureInfoEXT.SLICESCOUNT, value); }
    /** Unsafe version of {@link #pSlicesDataOffsets(IntBuffer) pSlicesDataOffsets}. */
    public static void npSlicesDataOffsets(long struct, IntBuffer value) { memPutAddress(struct + VkVideoDecodeH264PictureInfoEXT.PSLICESDATAOFFSETS, memAddress(value)); nslicesCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoDecodeH264PictureInfoEXT.PSTDPICTUREINFO));
        check(memGetAddress(struct + VkVideoDecodeH264PictureInfoEXT.PSLICESDATAOFFSETS));
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264PictureInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264PictureInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264PictureInfoEXT ELEMENT_FACTORY = VkVideoDecodeH264PictureInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264PictureInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264PictureInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoDecodeH264PictureInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH264PictureInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264PictureInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH264PictureInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264PictureInfoEXT.npNext(address()); }
        /** @return a {@link StdVideoDecodeH264PictureInfo} view of the struct pointed to by the {@link VkVideoDecodeH264PictureInfoEXT#pStdPictureInfo} field. */
        @NativeType("StdVideoDecodeH264PictureInfo const *")
        public StdVideoDecodeH264PictureInfo pStdPictureInfo() { return VkVideoDecodeH264PictureInfoEXT.npStdPictureInfo(address()); }
        /** @return the value of the {@link VkVideoDecodeH264PictureInfoEXT#slicesCount} field. */
        @NativeType("uint32_t")
        public int slicesCount() { return VkVideoDecodeH264PictureInfoEXT.nslicesCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkVideoDecodeH264PictureInfoEXT#pSlicesDataOffsets} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pSlicesDataOffsets() { return VkVideoDecodeH264PictureInfoEXT.npSlicesDataOffsets(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH264PictureInfoEXT#sType} field. */
        public VkVideoDecodeH264PictureInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264PictureInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_EXT} value to the {@link VkVideoDecodeH264PictureInfoEXT#sType} field. */
        public VkVideoDecodeH264PictureInfoEXT.Buffer sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoDecodeH264PictureInfoEXT#pNext} field. */
        public VkVideoDecodeH264PictureInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264PictureInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeH264MvcEXT} value to the {@code pNext} chain. */
        public VkVideoDecodeH264PictureInfoEXT.Buffer pNext(VkVideoDecodeH264MvcEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the address of the specified {@link StdVideoDecodeH264PictureInfo} to the {@link VkVideoDecodeH264PictureInfoEXT#pStdPictureInfo} field. */
        public VkVideoDecodeH264PictureInfoEXT.Buffer pStdPictureInfo(@NativeType("StdVideoDecodeH264PictureInfo const *") StdVideoDecodeH264PictureInfo value) { VkVideoDecodeH264PictureInfoEXT.npStdPictureInfo(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkVideoDecodeH264PictureInfoEXT#pSlicesDataOffsets} field. */
        public VkVideoDecodeH264PictureInfoEXT.Buffer pSlicesDataOffsets(@NativeType("uint32_t const *") IntBuffer value) { VkVideoDecodeH264PictureInfoEXT.npSlicesDataOffsets(address(), value); return this; }

    }

}