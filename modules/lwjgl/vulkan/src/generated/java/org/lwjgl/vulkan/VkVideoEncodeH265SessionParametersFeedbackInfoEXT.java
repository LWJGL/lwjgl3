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
 * Structure providing feedback about the requested H.265 video session parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265SessionParametersFeedbackInfoEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #hasStdVPSOverrides};
 *     VkBool32 {@link #hasStdSPSOverrides};
 *     VkBool32 {@link #hasStdPPSOverrides};
 * }</code></pre>
 */
public class VkVideoEncodeH265SessionParametersFeedbackInfoEXT extends Struct<VkVideoEncodeH265SessionParametersFeedbackInfoEXT> implements NativeResource {

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

    protected VkVideoEncodeH265SessionParametersFeedbackInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265SessionParametersFeedbackInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265SessionParametersFeedbackInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265SessionParametersFeedbackInfoEXT(ByteBuffer container) {
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
    /** indicates whether any of the parameters of the requested H.265 video parameter set, if one was requested via {@link VkVideoEncodeH265SessionParametersGetInfoEXT}{@code ::writeStdVPS}, were overridden by the implementation. */
    @NativeType("VkBool32")
    public boolean hasStdVPSOverrides() { return nhasStdVPSOverrides(address()) != 0; }
    /** indicates whether any of the parameters of the requested H.265 sequence parameter set, if one was requested via {@link VkVideoEncodeH265SessionParametersGetInfoEXT}{@code ::writeStdSPS}, were overridden by the implementation. */
    @NativeType("VkBool32")
    public boolean hasStdSPSOverrides() { return nhasStdSPSOverrides(address()) != 0; }
    /** indicates whether any of the parameters of the requested H.265 picture parameter set, if one was requested via {@link VkVideoEncodeH265SessionParametersGetInfoEXT}{@code ::writeStdPPS}, were overridden by the implementation. */
    @NativeType("VkBool32")
    public boolean hasStdPPSOverrides() { return nhasStdPPSOverrides(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionParametersFeedbackInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionParametersFeedbackInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265SessionParametersFeedbackInfoEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265SessionParametersFeedbackInfoEXT set(
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
    public VkVideoEncodeH265SessionParametersFeedbackInfoEXT set(VkVideoEncodeH265SessionParametersFeedbackInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT malloc() {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT calloc() {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT create(long address) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersFeedbackInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265SessionParametersFeedbackInfoEXT.PNEXT); }
    /** Unsafe version of {@link #hasStdVPSOverrides}. */
    public static int nhasStdVPSOverrides(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersFeedbackInfoEXT.HASSTDVPSOVERRIDES); }
    /** Unsafe version of {@link #hasStdSPSOverrides}. */
    public static int nhasStdSPSOverrides(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersFeedbackInfoEXT.HASSTDSPSOVERRIDES); }
    /** Unsafe version of {@link #hasStdPPSOverrides}. */
    public static int nhasStdPPSOverrides(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersFeedbackInfoEXT.HASSTDPPSOVERRIDES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersFeedbackInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersFeedbackInfoEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersFeedbackInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265SessionParametersFeedbackInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersFeedbackInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265SessionParametersFeedbackInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265SessionParametersFeedbackInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeH265SessionParametersFeedbackInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT#hasStdVPSOverrides} field. */
        @NativeType("VkBool32")
        public boolean hasStdVPSOverrides() { return VkVideoEncodeH265SessionParametersFeedbackInfoEXT.nhasStdVPSOverrides(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT#hasStdSPSOverrides} field. */
        @NativeType("VkBool32")
        public boolean hasStdSPSOverrides() { return VkVideoEncodeH265SessionParametersFeedbackInfoEXT.nhasStdSPSOverrides(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT#hasStdPPSOverrides} field. */
        @NativeType("VkBool32")
        public boolean hasStdPPSOverrides() { return VkVideoEncodeH265SessionParametersFeedbackInfoEXT.nhasStdPPSOverrides(address()) != 0; }

        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT#sType} field. */
        public VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_EXT} value to the {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT#sType} field. */
        public VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT#pNext} field. */
        public VkVideoEncodeH265SessionParametersFeedbackInfoEXT.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeH265SessionParametersFeedbackInfoEXT.npNext(address(), value); return this; }

    }

}