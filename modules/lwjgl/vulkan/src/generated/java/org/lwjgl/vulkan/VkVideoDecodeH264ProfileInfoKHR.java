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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifying H.264 decode-specific video profile parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR}</li>
 * <li>If {@code pictureLayout} is not 0, {@code pictureLayout} <b>must</b> be a valid {@code VkVideoDecodeH264PictureLayoutFlagBitsKHR} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH264ProfileInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     StdVideoH264ProfileIdc {@link #stdProfileIdc};
 *     VkVideoDecodeH264PictureLayoutFlagBitsKHR {@link #pictureLayout};
 * }</code></pre>
 */
public class VkVideoDecodeH264ProfileInfoKHR extends Struct<VkVideoDecodeH264ProfileInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STDPROFILEIDC,
        PICTURELAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STDPROFILEIDC = layout.offsetof(2);
        PICTURELAYOUT = layout.offsetof(3);
    }

    protected VkVideoDecodeH264ProfileInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeH264ProfileInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeH264ProfileInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeH264ProfileInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264ProfileInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code StdVideoH264ProfileIdc} value specifying the H.264 codec profile IDC, as defined in section A.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>. */
    @NativeType("StdVideoH264ProfileIdc")
    public int stdProfileIdc() { return nstdProfileIdc(address()); }
    /** a {@code VkVideoDecodeH264PictureLayoutFlagBitsKHR} value specifying the picture layout used by the H.264 video sequence to be decoded. */
    @NativeType("VkVideoDecodeH264PictureLayoutFlagBitsKHR")
    public int pictureLayout() { return npictureLayout(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH264ProfileInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoDecodeH264ProfileInfoKHR sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH264ProfileInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #stdProfileIdc} field. */
    public VkVideoDecodeH264ProfileInfoKHR stdProfileIdc(@NativeType("StdVideoH264ProfileIdc") int value) { nstdProfileIdc(address(), value); return this; }
    /** Sets the specified value to the {@link #pictureLayout} field. */
    public VkVideoDecodeH264ProfileInfoKHR pictureLayout(@NativeType("VkVideoDecodeH264PictureLayoutFlagBitsKHR") int value) { npictureLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264ProfileInfoKHR set(
        int sType,
        long pNext,
        int stdProfileIdc,
        int pictureLayout
    ) {
        sType(sType);
        pNext(pNext);
        stdProfileIdc(stdProfileIdc);
        pictureLayout(pictureLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeH264ProfileInfoKHR set(VkVideoDecodeH264ProfileInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264ProfileInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264ProfileInfoKHR malloc() {
        return new VkVideoDecodeH264ProfileInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264ProfileInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264ProfileInfoKHR calloc() {
        return new VkVideoDecodeH264ProfileInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264ProfileInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264ProfileInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH264ProfileInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264ProfileInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeH264ProfileInfoKHR create(long address) {
        return new VkVideoDecodeH264ProfileInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264ProfileInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeH264ProfileInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264ProfileInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264ProfileInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264ProfileInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264ProfileInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264ProfileInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264ProfileInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeH264ProfileInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264ProfileInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264ProfileInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264ProfileInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264ProfileInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH264ProfileInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264ProfileInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264ProfileInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH264ProfileInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264ProfileInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264ProfileInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264ProfileInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264ProfileInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264ProfileInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264ProfileInfoKHR.PNEXT); }
    /** Unsafe version of {@link #stdProfileIdc}. */
    public static int nstdProfileIdc(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264ProfileInfoKHR.STDPROFILEIDC); }
    /** Unsafe version of {@link #pictureLayout}. */
    public static int npictureLayout(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264ProfileInfoKHR.PICTURELAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264ProfileInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264ProfileInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #stdProfileIdc(int) stdProfileIdc}. */
    public static void nstdProfileIdc(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264ProfileInfoKHR.STDPROFILEIDC, value); }
    /** Unsafe version of {@link #pictureLayout(int) pictureLayout}. */
    public static void npictureLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264ProfileInfoKHR.PICTURELAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264ProfileInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264ProfileInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264ProfileInfoKHR ELEMENT_FACTORY = VkVideoDecodeH264ProfileInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264ProfileInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264ProfileInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeH264ProfileInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH264ProfileInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264ProfileInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH264ProfileInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264ProfileInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoDecodeH264ProfileInfoKHR#stdProfileIdc} field. */
        @NativeType("StdVideoH264ProfileIdc")
        public int stdProfileIdc() { return VkVideoDecodeH264ProfileInfoKHR.nstdProfileIdc(address()); }
        /** @return the value of the {@link VkVideoDecodeH264ProfileInfoKHR#pictureLayout} field. */
        @NativeType("VkVideoDecodeH264PictureLayoutFlagBitsKHR")
        public int pictureLayout() { return VkVideoDecodeH264ProfileInfoKHR.npictureLayout(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH264ProfileInfoKHR#sType} field. */
        public VkVideoDecodeH264ProfileInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264ProfileInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR} value to the {@link VkVideoDecodeH264ProfileInfoKHR#sType} field. */
        public VkVideoDecodeH264ProfileInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoDecodeH264ProfileInfoKHR#pNext} field. */
        public VkVideoDecodeH264ProfileInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264ProfileInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeH264ProfileInfoKHR#stdProfileIdc} field. */
        public VkVideoDecodeH264ProfileInfoKHR.Buffer stdProfileIdc(@NativeType("StdVideoH264ProfileIdc") int value) { VkVideoDecodeH264ProfileInfoKHR.nstdProfileIdc(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeH264ProfileInfoKHR#pictureLayout} field. */
        public VkVideoDecodeH264ProfileInfoKHR.Buffer pictureLayout(@NativeType("VkVideoDecodeH264PictureLayoutFlagBitsKHR") int value) { VkVideoDecodeH264ProfileInfoKHR.npictureLayout(address(), value); return this; }

    }

}