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

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifying H.264 encode-specific video profile parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264ProfileInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     StdVideoH264ProfileIdc {@link #stdProfileIdc};
 * }</code></pre>
 */
public class VkVideoEncodeH264ProfileInfoKHR extends Struct<VkVideoEncodeH264ProfileInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STDPROFILEIDC;

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
        STDPROFILEIDC = layout.offsetof(2);
    }

    protected VkVideoEncodeH264ProfileInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264ProfileInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264ProfileInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264ProfileInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264ProfileInfoKHR(ByteBuffer container) {
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

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264ProfileInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeH264ProfileInfoKHR sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264ProfileInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #stdProfileIdc} field. */
    public VkVideoEncodeH264ProfileInfoKHR stdProfileIdc(@NativeType("StdVideoH264ProfileIdc") int value) { nstdProfileIdc(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264ProfileInfoKHR set(
        int sType,
        long pNext,
        int stdProfileIdc
    ) {
        sType(sType);
        pNext(pNext);
        stdProfileIdc(stdProfileIdc);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264ProfileInfoKHR set(VkVideoEncodeH264ProfileInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264ProfileInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264ProfileInfoKHR malloc() {
        return new VkVideoEncodeH264ProfileInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264ProfileInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264ProfileInfoKHR calloc() {
        return new VkVideoEncodeH264ProfileInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264ProfileInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264ProfileInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264ProfileInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264ProfileInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264ProfileInfoKHR create(long address) {
        return new VkVideoEncodeH264ProfileInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH264ProfileInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264ProfileInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264ProfileInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264ProfileInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264ProfileInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264ProfileInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264ProfileInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264ProfileInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264ProfileInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264ProfileInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH264ProfileInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264ProfileInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264ProfileInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264ProfileInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264ProfileInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264ProfileInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264ProfileInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264ProfileInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264ProfileInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264ProfileInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264ProfileInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH264ProfileInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264ProfileInfoKHR.PNEXT); }
    /** Unsafe version of {@link #stdProfileIdc}. */
    public static int nstdProfileIdc(long struct) { return memGetInt(struct + VkVideoEncodeH264ProfileInfoKHR.STDPROFILEIDC); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH264ProfileInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264ProfileInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #stdProfileIdc(int) stdProfileIdc}. */
    public static void nstdProfileIdc(long struct, int value) { memPutInt(struct + VkVideoEncodeH264ProfileInfoKHR.STDPROFILEIDC, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264ProfileInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264ProfileInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264ProfileInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264ProfileInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264ProfileInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264ProfileInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264ProfileInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264ProfileInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264ProfileInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264ProfileInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264ProfileInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264ProfileInfoKHR#stdProfileIdc} field. */
        @NativeType("StdVideoH264ProfileIdc")
        public int stdProfileIdc() { return VkVideoEncodeH264ProfileInfoKHR.nstdProfileIdc(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264ProfileInfoKHR#sType} field. */
        public VkVideoEncodeH264ProfileInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264ProfileInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_KHR} value to the {@link VkVideoEncodeH264ProfileInfoKHR#sType} field. */
        public VkVideoEncodeH264ProfileInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeH264ProfileInfoKHR#pNext} field. */
        public VkVideoEncodeH264ProfileInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264ProfileInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264ProfileInfoKHR#stdProfileIdc} field. */
        public VkVideoEncodeH264ProfileInfoKHR.Buffer stdProfileIdc(@NativeType("StdVideoH264ProfileIdc") int value) { VkVideoEncodeH264ProfileInfoKHR.nstdProfileIdc(address(), value); return this; }

    }

}