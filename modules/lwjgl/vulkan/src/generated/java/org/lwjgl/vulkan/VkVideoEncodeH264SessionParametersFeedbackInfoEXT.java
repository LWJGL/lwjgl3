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

/**
 * Structure providing feedback about the requested H.264 video session parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264SessionParametersFeedbackInfoEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #hasStdSPSOverrides};
 *     VkBool32 {@link #hasStdPPSOverrides};
 * }</code></pre>
 */
public class VkVideoEncodeH264SessionParametersFeedbackInfoEXT extends Struct<VkVideoEncodeH264SessionParametersFeedbackInfoEXT> implements NativeResource {

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

    protected VkVideoEncodeH264SessionParametersFeedbackInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264SessionParametersFeedbackInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264SessionParametersFeedbackInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264SessionParametersFeedbackInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether any of the parameters of the requested H.264 sequence parameter set, if one was requested via {@link VkVideoEncodeH264SessionParametersGetInfoEXT}{@code ::writeStdSPS}, were overridden by the implementation. */
    @NativeType("VkBool32")
    public boolean hasStdSPSOverrides() { return nhasStdSPSOverrides(address()) != 0; }
    /** indicates whether any of the parameters of the requested H.264 picture parameter set, if one was requested via {@link VkVideoEncodeH264SessionParametersGetInfoEXT}{@code ::writeStdPPS}, were overridden by the implementation. */
    @NativeType("VkBool32")
    public boolean hasStdPPSOverrides() { return nhasStdPPSOverrides(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264SessionParametersFeedbackInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264SessionParametersFeedbackInfoEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264SessionParametersFeedbackInfoEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264SessionParametersFeedbackInfoEXT set(
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
    public VkVideoEncodeH264SessionParametersFeedbackInfoEXT set(VkVideoEncodeH264SessionParametersFeedbackInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT malloc() {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT calloc() {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264SessionParametersFeedbackInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT create(long address) {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264SessionParametersFeedbackInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersFeedbackInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersFeedbackInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264SessionParametersFeedbackInfoEXT.PNEXT); }
    /** Unsafe version of {@link #hasStdSPSOverrides}. */
    public static int nhasStdSPSOverrides(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersFeedbackInfoEXT.HASSTDSPSOVERRIDES); }
    /** Unsafe version of {@link #hasStdPPSOverrides}. */
    public static int nhasStdPPSOverrides(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersFeedbackInfoEXT.HASSTDPPSOVERRIDES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersFeedbackInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersFeedbackInfoEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionParametersFeedbackInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264SessionParametersFeedbackInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264SessionParametersFeedbackInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264SessionParametersFeedbackInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264SessionParametersFeedbackInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeH264SessionParametersFeedbackInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT#hasStdSPSOverrides} field. */
        @NativeType("VkBool32")
        public boolean hasStdSPSOverrides() { return VkVideoEncodeH264SessionParametersFeedbackInfoEXT.nhasStdSPSOverrides(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT#hasStdPPSOverrides} field. */
        @NativeType("VkBool32")
        public boolean hasStdPPSOverrides() { return VkVideoEncodeH264SessionParametersFeedbackInfoEXT.nhasStdPPSOverrides(address()) != 0; }

        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT#sType} field. */
        public VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersFeedbackInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_EXT} value to the {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT#sType} field. */
        public VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT#pNext} field. */
        public VkVideoEncodeH264SessionParametersFeedbackInfoEXT.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeH264SessionParametersFeedbackInfoEXT.npNext(address(), value); return this; }

    }

}