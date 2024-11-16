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
 * Structure specifying video session parameters update information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoDecodeH264SessionParametersAddInfoKHR}, {@link VkVideoDecodeH265SessionParametersAddInfoKHR}, {@link VkVideoEncodeH264SessionParametersAddInfoKHR}, or {@link VkVideoEncodeH265SessionParametersAddInfoKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRVideoQueue#vkUpdateVideoSessionParametersKHR UpdateVideoSessionParametersKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoSessionParametersUpdateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #updateSequenceCount};
 * }</code></pre>
 */
public class VkVideoSessionParametersUpdateInfoKHR extends Struct<VkVideoSessionParametersUpdateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        UPDATESEQUENCECOUNT;

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
        UPDATESEQUENCECOUNT = layout.offsetof(2);
    }

    protected VkVideoSessionParametersUpdateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoSessionParametersUpdateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoSessionParametersUpdateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoSessionParametersUpdateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoSessionParametersUpdateInfoKHR(ByteBuffer container) {
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
    /** the new <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-session-parameters">update sequence count</a> to set for the video session parameters object. */
    @NativeType("uint32_t")
    public int updateSequenceCount() { return nupdateSequenceCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoSessionParametersUpdateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoSessionParametersUpdateInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoSessionParametersUpdateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeH264SessionParametersAddInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersUpdateInfoKHR pNext(VkVideoDecodeH264SessionParametersAddInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265SessionParametersAddInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersUpdateInfoKHR pNext(VkVideoDecodeH265SessionParametersAddInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264SessionParametersAddInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersUpdateInfoKHR pNext(VkVideoEncodeH264SessionParametersAddInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265SessionParametersAddInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersUpdateInfoKHR pNext(VkVideoEncodeH265SessionParametersAddInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #updateSequenceCount} field. */
    public VkVideoSessionParametersUpdateInfoKHR updateSequenceCount(@NativeType("uint32_t") int value) { nupdateSequenceCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoSessionParametersUpdateInfoKHR set(
        int sType,
        long pNext,
        int updateSequenceCount
    ) {
        sType(sType);
        pNext(pNext);
        updateSequenceCount(updateSequenceCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoSessionParametersUpdateInfoKHR set(VkVideoSessionParametersUpdateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoSessionParametersUpdateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoSessionParametersUpdateInfoKHR malloc() {
        return new VkVideoSessionParametersUpdateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoSessionParametersUpdateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoSessionParametersUpdateInfoKHR calloc() {
        return new VkVideoSessionParametersUpdateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoSessionParametersUpdateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoSessionParametersUpdateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoSessionParametersUpdateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoSessionParametersUpdateInfoKHR} instance for the specified memory address. */
    public static VkVideoSessionParametersUpdateInfoKHR create(long address) {
        return new VkVideoSessionParametersUpdateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoSessionParametersUpdateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoSessionParametersUpdateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersUpdateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersUpdateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersUpdateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersUpdateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersUpdateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersUpdateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoSessionParametersUpdateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersUpdateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoSessionParametersUpdateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoSessionParametersUpdateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionParametersUpdateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoSessionParametersUpdateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoSessionParametersUpdateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionParametersUpdateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoSessionParametersUpdateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersUpdateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersUpdateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersUpdateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersUpdateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoSessionParametersUpdateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoSessionParametersUpdateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #updateSequenceCount}. */
    public static int nupdateSequenceCount(long struct) { return memGetInt(struct + VkVideoSessionParametersUpdateInfoKHR.UPDATESEQUENCECOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoSessionParametersUpdateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoSessionParametersUpdateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #updateSequenceCount(int) updateSequenceCount}. */
    public static void nupdateSequenceCount(long struct, int value) { memPutInt(struct + VkVideoSessionParametersUpdateInfoKHR.UPDATESEQUENCECOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoSessionParametersUpdateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoSessionParametersUpdateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoSessionParametersUpdateInfoKHR ELEMENT_FACTORY = VkVideoSessionParametersUpdateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoSessionParametersUpdateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoSessionParametersUpdateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoSessionParametersUpdateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoSessionParametersUpdateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoSessionParametersUpdateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoSessionParametersUpdateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoSessionParametersUpdateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoSessionParametersUpdateInfoKHR#updateSequenceCount} field. */
        @NativeType("uint32_t")
        public int updateSequenceCount() { return VkVideoSessionParametersUpdateInfoKHR.nupdateSequenceCount(address()); }

        /** Sets the specified value to the {@link VkVideoSessionParametersUpdateInfoKHR#sType} field. */
        public VkVideoSessionParametersUpdateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoSessionParametersUpdateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR} value to the {@link VkVideoSessionParametersUpdateInfoKHR#sType} field. */
        public VkVideoSessionParametersUpdateInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoSessionParametersUpdateInfoKHR#pNext} field. */
        public VkVideoSessionParametersUpdateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoSessionParametersUpdateInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeH264SessionParametersAddInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersUpdateInfoKHR.Buffer pNext(VkVideoDecodeH264SessionParametersAddInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265SessionParametersAddInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersUpdateInfoKHR.Buffer pNext(VkVideoDecodeH265SessionParametersAddInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264SessionParametersAddInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersUpdateInfoKHR.Buffer pNext(VkVideoEncodeH264SessionParametersAddInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265SessionParametersAddInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersUpdateInfoKHR.Buffer pNext(VkVideoEncodeH265SessionParametersAddInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoSessionParametersUpdateInfoKHR#updateSequenceCount} field. */
        public VkVideoSessionParametersUpdateInfoKHR.Buffer updateSequenceCount(@NativeType("uint32_t") int value) { VkVideoSessionParametersUpdateInfoKHR.nupdateSequenceCount(address(), value); return this; }

    }

}