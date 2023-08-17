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
 * Structure specifying parameters for retrieving encoded video session parameter data.
 * 
 * <h5>Description</h5>
 * 
 * <p>Depending on the used video encode operation, additional codec-specific structures <b>may</b> need to be included in the {@code pNext} chain of this structure to identify the specific video session parameters to retrieve encoded parameter data for, as described in the corresponding sections.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoEncodeH264SessionParametersGetInfoEXT} or {@link VkVideoEncodeH265SessionParametersGetInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code videoSessionParameters} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRVideoEncodeQueue#vkGetEncodedVideoSessionParametersKHR GetEncodedVideoSessionParametersKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeSessionParametersGetInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoSessionParametersKHR {@link #videoSessionParameters};
 * }</code></pre>
 */
public class VkVideoEncodeSessionParametersGetInfoKHR extends Struct<VkVideoEncodeSessionParametersGetInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIDEOSESSIONPARAMETERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEOSESSIONPARAMETERS = layout.offsetof(2);
    }

    protected VkVideoEncodeSessionParametersGetInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeSessionParametersGetInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeSessionParametersGetInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeSessionParametersGetInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeSessionParametersGetInfoKHR(ByteBuffer container) {
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
    /** the {@code VkVideoSessionParametersKHR} object to retrieve encoded parameter data from. */
    @NativeType("VkVideoSessionParametersKHR")
    public long videoSessionParameters() { return nvideoSessionParameters(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeSessionParametersGetInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeSessionParametersGetInfoKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeSessionParametersGetInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeH264SessionParametersGetInfoEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeSessionParametersGetInfoKHR pNext(VkVideoEncodeH264SessionParametersGetInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265SessionParametersGetInfoEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeSessionParametersGetInfoKHR pNext(VkVideoEncodeH265SessionParametersGetInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #videoSessionParameters} field. */
    public VkVideoEncodeSessionParametersGetInfoKHR videoSessionParameters(@NativeType("VkVideoSessionParametersKHR") long value) { nvideoSessionParameters(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeSessionParametersGetInfoKHR set(
        int sType,
        long pNext,
        long videoSessionParameters
    ) {
        sType(sType);
        pNext(pNext);
        videoSessionParameters(videoSessionParameters);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeSessionParametersGetInfoKHR set(VkVideoEncodeSessionParametersGetInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeSessionParametersGetInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeSessionParametersGetInfoKHR malloc() {
        return new VkVideoEncodeSessionParametersGetInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeSessionParametersGetInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeSessionParametersGetInfoKHR calloc() {
        return new VkVideoEncodeSessionParametersGetInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeSessionParametersGetInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeSessionParametersGetInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeSessionParametersGetInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeSessionParametersGetInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeSessionParametersGetInfoKHR create(long address) {
        return new VkVideoEncodeSessionParametersGetInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeSessionParametersGetInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeSessionParametersGetInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionParametersGetInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionParametersGetInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionParametersGetInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionParametersGetInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionParametersGetInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionParametersGetInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeSessionParametersGetInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionParametersGetInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeSessionParametersGetInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeSessionParametersGetInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeSessionParametersGetInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeSessionParametersGetInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeSessionParametersGetInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeSessionParametersGetInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeSessionParametersGetInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionParametersGetInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionParametersGetInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionParametersGetInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionParametersGetInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeSessionParametersGetInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeSessionParametersGetInfoKHR.PNEXT); }
    /** Unsafe version of {@link #videoSessionParameters}. */
    public static long nvideoSessionParameters(long struct) { return UNSAFE.getLong(null, struct + VkVideoEncodeSessionParametersGetInfoKHR.VIDEOSESSIONPARAMETERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeSessionParametersGetInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeSessionParametersGetInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #videoSessionParameters(long) videoSessionParameters}. */
    public static void nvideoSessionParameters(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoEncodeSessionParametersGetInfoKHR.VIDEOSESSIONPARAMETERS, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeSessionParametersGetInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeSessionParametersGetInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeSessionParametersGetInfoKHR ELEMENT_FACTORY = VkVideoEncodeSessionParametersGetInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeSessionParametersGetInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeSessionParametersGetInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeSessionParametersGetInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeSessionParametersGetInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeSessionParametersGetInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeSessionParametersGetInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeSessionParametersGetInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeSessionParametersGetInfoKHR#videoSessionParameters} field. */
        @NativeType("VkVideoSessionParametersKHR")
        public long videoSessionParameters() { return VkVideoEncodeSessionParametersGetInfoKHR.nvideoSessionParameters(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeSessionParametersGetInfoKHR#sType} field. */
        public VkVideoEncodeSessionParametersGetInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeSessionParametersGetInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR} value to the {@link VkVideoEncodeSessionParametersGetInfoKHR#sType} field. */
        public VkVideoEncodeSessionParametersGetInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeSessionParametersGetInfoKHR#pNext} field. */
        public VkVideoEncodeSessionParametersGetInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeSessionParametersGetInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeH264SessionParametersGetInfoEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeSessionParametersGetInfoKHR.Buffer pNext(VkVideoEncodeH264SessionParametersGetInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265SessionParametersGetInfoEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeSessionParametersGetInfoKHR.Buffer pNext(VkVideoEncodeH265SessionParametersGetInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoEncodeSessionParametersGetInfoKHR#videoSessionParameters} field. */
        public VkVideoEncodeSessionParametersGetInfoKHR.Buffer videoSessionParameters(@NativeType("VkVideoSessionParametersKHR") long value) { VkVideoEncodeSessionParametersGetInfoKHR.nvideoSessionParameters(address(), value); return this; }

    }

}