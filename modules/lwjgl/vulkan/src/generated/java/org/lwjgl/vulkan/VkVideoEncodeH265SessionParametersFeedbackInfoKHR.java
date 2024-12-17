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
 * struct VkVideoEncodeH265SessionParametersFeedbackInfoKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 hasStdVPSOverrides;
 *     VkBool32 hasStdSPSOverrides;
 *     VkBool32 hasStdPPSOverrides;
 * }}</pre>
 */
public class VkVideoEncodeH265SessionParametersFeedbackInfoKHR extends Struct<VkVideoEncodeH265SessionParametersFeedbackInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HASSTDVPSOVERRIDES,
        HASSTDSPSOVERRIDES,
        HASSTDPPSOVERRIDES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HASSTDVPSOVERRIDES = layout.offsetof(2);
        HASSTDSPSOVERRIDES = layout.offsetof(3);
        HASSTDPPSOVERRIDES = layout.offsetof(4);
    }

    protected VkVideoEncodeH265SessionParametersFeedbackInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265SessionParametersFeedbackInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265SessionParametersFeedbackInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code hasStdVPSOverrides} field. */
    @NativeType("VkBool32")
    public boolean hasStdVPSOverrides() { return nhasStdVPSOverrides(address()) != 0; }
    /** @return the value of the {@code hasStdSPSOverrides} field. */
    @NativeType("VkBool32")
    public boolean hasStdSPSOverrides() { return nhasStdSPSOverrides(address()) != 0; }
    /** @return the value of the {@code hasStdPPSOverrides} field. */
    @NativeType("VkBool32")
    public boolean hasStdPPSOverrides() { return nhasStdPPSOverrides(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR set(
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
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR set(VkVideoEncodeH265SessionParametersFeedbackInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR malloc() {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR calloc() {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR create(long address) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265SessionParametersFeedbackInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersFeedbackInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265SessionParametersFeedbackInfoKHR.PNEXT); }
    /** Unsafe version of {@link #hasStdVPSOverrides}. */
    public static int nhasStdVPSOverrides(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersFeedbackInfoKHR.HASSTDVPSOVERRIDES); }
    /** Unsafe version of {@link #hasStdSPSOverrides}. */
    public static int nhasStdSPSOverrides(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersFeedbackInfoKHR.HASSTDSPSOVERRIDES); }
    /** Unsafe version of {@link #hasStdPPSOverrides}. */
    public static int nhasStdPPSOverrides(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersFeedbackInfoKHR.HASSTDPPSOVERRIDES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersFeedbackInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersFeedbackInfoKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265SessionParametersFeedbackInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersFeedbackInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265SessionParametersFeedbackInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersFeedbackInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265SessionParametersFeedbackInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265SessionParametersFeedbackInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.npNext(address()); }
        /** @return the value of the {@code hasStdVPSOverrides} field. */
        @NativeType("VkBool32")
        public boolean hasStdVPSOverrides() { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.nhasStdVPSOverrides(address()) != 0; }
        /** @return the value of the {@code hasStdSPSOverrides} field. */
        @NativeType("VkBool32")
        public boolean hasStdSPSOverrides() { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.nhasStdSPSOverrides(address()) != 0; }
        /** @return the value of the {@code hasStdPPSOverrides} field. */
        @NativeType("VkBool32")
        public boolean hasStdPPSOverrides() { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.nhasStdPPSOverrides(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH265SessionParametersFeedbackInfoKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.npNext(address(), value); return this; }

    }

}