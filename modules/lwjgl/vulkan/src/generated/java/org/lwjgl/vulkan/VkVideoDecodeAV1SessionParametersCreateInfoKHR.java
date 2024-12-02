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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifies AV1 decoder parameter set information.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>As AV1 video session parameters objects will only ever contain a single AV1 sequence header, this has to be specified at object creation time and such video session parameters objects cannot be updated using the {@link KHRVideoQueue#vkUpdateVideoSessionParametersKHR UpdateVideoSessionParametersKHR} command. When a new AV1 sequence header is decoded from the input video bitstream the application needs to create a new video session parameters object to store it.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoDecodeAV1#VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR}</li>
 * <li>{@code pStdSequenceHeader} <b>must</b> be a valid pointer to a valid {@code StdVideoAV1SequenceHeader} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeAV1SessionParametersCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoAV1SequenceHeader StdVideoAV1SequenceHeader} const * {@link #pStdSequenceHeader};
 * }</code></pre>
 */
public class VkVideoDecodeAV1SessionParametersCreateInfoKHR extends Struct<VkVideoDecodeAV1SessionParametersCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSTDSEQUENCEHEADER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDSEQUENCEHEADER = layout.offsetof(2);
    }

    protected VkVideoDecodeAV1SessionParametersCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeAV1SessionParametersCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeAV1SessionParametersCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR(ByteBuffer container) {
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
    /** a pointer to a {@code StdVideoAV1SequenceHeader} structure describing the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#decode-av1-sequence-header">AV1 sequence header</a> entry to store in the created object. */
    @NativeType("StdVideoAV1SequenceHeader const *")
    public StdVideoAV1SequenceHeader pStdSequenceHeader() { return npStdSequenceHeader(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeAV1#VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR sType$Default() { return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1SequenceHeader} to the {@link #pStdSequenceHeader} field. */
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR pStdSequenceHeader(@NativeType("StdVideoAV1SequenceHeader const *") StdVideoAV1SequenceHeader value) { npStdSequenceHeader(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR set(
        int sType,
        long pNext,
        StdVideoAV1SequenceHeader pStdSequenceHeader
    ) {
        sType(sType);
        pNext(pNext);
        pStdSequenceHeader(pStdSequenceHeader);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR set(VkVideoDecodeAV1SessionParametersCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeAV1SessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR malloc() {
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeAV1SessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR calloc() {
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeAV1SessionParametersCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeAV1SessionParametersCreateInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR create(long address) {
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoDecodeAV1SessionParametersCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeAV1SessionParametersCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeAV1SessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeAV1SessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoDecodeAV1SessionParametersCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeAV1SessionParametersCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdSequenceHeader}. */
    public static StdVideoAV1SequenceHeader npStdSequenceHeader(long struct) { return StdVideoAV1SequenceHeader.create(memGetAddress(struct + VkVideoDecodeAV1SessionParametersCreateInfoKHR.PSTDSEQUENCEHEADER)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoDecodeAV1SessionParametersCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeAV1SessionParametersCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdSequenceHeader(StdVideoAV1SequenceHeader) pStdSequenceHeader}. */
    public static void npStdSequenceHeader(long struct, StdVideoAV1SequenceHeader value) { memPutAddress(struct + VkVideoDecodeAV1SessionParametersCreateInfoKHR.PSTDSEQUENCEHEADER, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdSequenceHeader = memGetAddress(struct + VkVideoDecodeAV1SessionParametersCreateInfoKHR.PSTDSEQUENCEHEADER);
        check(pStdSequenceHeader);
        StdVideoAV1SequenceHeader.validate(pStdSequenceHeader);
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeAV1SessionParametersCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeAV1SessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoDecodeAV1SessionParametersCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeAV1SessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeAV1SessionParametersCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeAV1SessionParametersCreateInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoAV1SequenceHeader} view of the struct pointed to by the {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR#pStdSequenceHeader} field. */
        @NativeType("StdVideoAV1SequenceHeader const *")
        public StdVideoAV1SequenceHeader pStdSequenceHeader() { return VkVideoDecodeAV1SessionParametersCreateInfoKHR.npStdSequenceHeader(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR#sType} field. */
        public VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeAV1SessionParametersCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeAV1#VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR#sType} field. */
        public VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR#pNext} field. */
        public VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeAV1SessionParametersCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1SequenceHeader} to the {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR#pStdSequenceHeader} field. */
        public VkVideoDecodeAV1SessionParametersCreateInfoKHR.Buffer pStdSequenceHeader(@NativeType("StdVideoAV1SequenceHeader const *") StdVideoAV1SequenceHeader value) { VkVideoDecodeAV1SessionParametersCreateInfoKHR.npStdSequenceHeader(address(), value); return this; }

    }

}