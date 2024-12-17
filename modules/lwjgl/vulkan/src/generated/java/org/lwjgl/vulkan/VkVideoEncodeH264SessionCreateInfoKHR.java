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
 * <pre>{@code
 * struct VkVideoEncodeH264SessionCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 useMaxLevelIdc;
 *     StdVideoH264LevelIdc maxLevelIdc;
 * }}</pre>
 */
public class VkVideoEncodeH264SessionCreateInfoKHR extends Struct<VkVideoEncodeH264SessionCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        USEMAXLEVELIDC,
        MAXLEVELIDC;

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
        USEMAXLEVELIDC = layout.offsetof(2);
        MAXLEVELIDC = layout.offsetof(3);
    }

    protected VkVideoEncodeH264SessionCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264SessionCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264SessionCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264SessionCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264SessionCreateInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code useMaxLevelIdc} field. */
    @NativeType("VkBool32")
    public boolean useMaxLevelIdc() { return nuseMaxLevelIdc(address()) != 0; }
    /** @return the value of the {@code maxLevelIdc} field. */
    @NativeType("StdVideoH264LevelIdc")
    public int maxLevelIdc() { return nmaxLevelIdc(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH264SessionCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH264SessionCreateInfoKHR sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH264SessionCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code useMaxLevelIdc} field. */
    public VkVideoEncodeH264SessionCreateInfoKHR useMaxLevelIdc(@NativeType("VkBool32") boolean value) { nuseMaxLevelIdc(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code maxLevelIdc} field. */
    public VkVideoEncodeH264SessionCreateInfoKHR maxLevelIdc(@NativeType("StdVideoH264LevelIdc") int value) { nmaxLevelIdc(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264SessionCreateInfoKHR set(
        int sType,
        long pNext,
        boolean useMaxLevelIdc,
        int maxLevelIdc
    ) {
        sType(sType);
        pNext(pNext);
        useMaxLevelIdc(useMaxLevelIdc);
        maxLevelIdc(maxLevelIdc);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264SessionCreateInfoKHR set(VkVideoEncodeH264SessionCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264SessionCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionCreateInfoKHR malloc() {
        return new VkVideoEncodeH264SessionCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionCreateInfoKHR calloc() {
        return new VkVideoEncodeH264SessionCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264SessionCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264SessionCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionCreateInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264SessionCreateInfoKHR create(long address) {
        return new VkVideoEncodeH264SessionCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH264SessionCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264SessionCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264SessionCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH264SessionCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264SessionCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #useMaxLevelIdc}. */
    public static int nuseMaxLevelIdc(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionCreateInfoKHR.USEMAXLEVELIDC); }
    /** Unsafe version of {@link #maxLevelIdc}. */
    public static int nmaxLevelIdc(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionCreateInfoKHR.MAXLEVELIDC); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH264SessionCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264SessionCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #useMaxLevelIdc(boolean) useMaxLevelIdc}. */
    public static void nuseMaxLevelIdc(long struct, int value) { memPutInt(struct + VkVideoEncodeH264SessionCreateInfoKHR.USEMAXLEVELIDC, value); }
    /** Unsafe version of {@link #maxLevelIdc(int) maxLevelIdc}. */
    public static void nmaxLevelIdc(long struct, int value) { memPutInt(struct + VkVideoEncodeH264SessionCreateInfoKHR.MAXLEVELIDC, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264SessionCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264SessionCreateInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264SessionCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264SessionCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264SessionCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264SessionCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264SessionCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264SessionCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code useMaxLevelIdc} field. */
        @NativeType("VkBool32")
        public boolean useMaxLevelIdc() { return VkVideoEncodeH264SessionCreateInfoKHR.nuseMaxLevelIdc(address()) != 0; }
        /** @return the value of the {@code maxLevelIdc} field. */
        @NativeType("StdVideoH264LevelIdc")
        public int maxLevelIdc() { return VkVideoEncodeH264SessionCreateInfoKHR.nmaxLevelIdc(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH264SessionCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264SessionCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH264SessionCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH264SessionCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264SessionCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code useMaxLevelIdc} field. */
        public VkVideoEncodeH264SessionCreateInfoKHR.Buffer useMaxLevelIdc(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264SessionCreateInfoKHR.nuseMaxLevelIdc(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code maxLevelIdc} field. */
        public VkVideoEncodeH264SessionCreateInfoKHR.Buffer maxLevelIdc(@NativeType("StdVideoH264LevelIdc") int value) { VkVideoEncodeH264SessionCreateInfoKHR.nmaxLevelIdc(address(), value); return this; }

    }

}