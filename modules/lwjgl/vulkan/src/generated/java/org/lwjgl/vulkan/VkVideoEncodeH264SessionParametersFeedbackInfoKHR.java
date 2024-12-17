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

/**
 * <pre>{@code
 * struct VkVideoEncodeH264SessionParametersFeedbackInfoKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 hasStdSPSOverrides;
 *     VkBool32 hasStdPPSOverrides;
 * }}</pre>
 */
public class VkVideoEncodeH264SessionParametersFeedbackInfoKHR extends Struct<VkVideoEncodeH264SessionParametersFeedbackInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HASSTDSPSOVERRIDES,
        HASSTDPPSOVERRIDES;

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
        HASSTDSPSOVERRIDES = layout.offsetof(2);
        HASSTDPPSOVERRIDES = layout.offsetof(3);
    }

    protected VkVideoEncodeH264SessionParametersFeedbackInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264SessionParametersFeedbackInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264SessionParametersFeedbackInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code hasStdSPSOverrides} field. */
    @NativeType("VkBool32")
    public boolean hasStdSPSOverrides() { return nhasStdSPSOverrides(address()) != 0; }
    /** @return the value of the {@code hasStdPPSOverrides} field. */
    @NativeType("VkBool32")
    public boolean hasStdPPSOverrides() { return nhasStdPPSOverrides(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264SessionParametersFeedbackInfoKHR set(VkVideoEncodeH264SessionParametersFeedbackInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR malloc() {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR calloc() {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR create(long address) {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH264SessionParametersFeedbackInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionParametersFeedbackInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264SessionParametersFeedbackInfoKHR.PNEXT); }
    /** Unsafe version of {@link #hasStdSPSOverrides}. */
    public static int nhasStdSPSOverrides(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionParametersFeedbackInfoKHR.HASSTDSPSOVERRIDES); }
    /** Unsafe version of {@link #hasStdPPSOverrides}. */
    public static int nhasStdPPSOverrides(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionParametersFeedbackInfoKHR.HASSTDPPSOVERRIDES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH264SessionParametersFeedbackInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersFeedbackInfoKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264SessionParametersFeedbackInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionParametersFeedbackInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264SessionParametersFeedbackInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264SessionParametersFeedbackInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264SessionParametersFeedbackInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264SessionParametersFeedbackInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.npNext(address()); }
        /** @return the value of the {@code hasStdSPSOverrides} field. */
        @NativeType("VkBool32")
        public boolean hasStdSPSOverrides() { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.nhasStdSPSOverrides(address()) != 0; }
        /** @return the value of the {@code hasStdPPSOverrides} field. */
        @NativeType("VkBool32")
        public boolean hasStdPPSOverrides() { return VkVideoEncodeH264SessionParametersFeedbackInfoKHR.nhasStdPPSOverrides(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH264SessionParametersFeedbackInfoKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeH264SessionParametersFeedbackInfoKHR.npNext(address(), value); return this; }

    }

}