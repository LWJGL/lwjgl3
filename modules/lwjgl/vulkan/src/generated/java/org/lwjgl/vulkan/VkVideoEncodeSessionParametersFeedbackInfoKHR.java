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
 * Structure providing feedback about the requested video session parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>Depending on the used video encode operation, additional codec-specific structures <b>may</b> need to be included in the {@code pNext} chain of this structure to capture feedback information about the requested parameter data, as described in the corresponding sections.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT} or {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRVideoEncodeQueue#vkGetEncodedVideoSessionParametersKHR GetEncodedVideoSessionParametersKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeSessionParametersFeedbackInfoKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #hasOverrides};
 * }</code></pre>
 */
public class VkVideoEncodeSessionParametersFeedbackInfoKHR extends Struct<VkVideoEncodeSessionParametersFeedbackInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HASOVERRIDES;

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
        HASOVERRIDES = layout.offsetof(2);
    }

    protected VkVideoEncodeSessionParametersFeedbackInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeSessionParametersFeedbackInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeSessionParametersFeedbackInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeSessionParametersFeedbackInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeSessionParametersFeedbackInfoKHR(ByteBuffer container) {
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
    /** indicates whether any of the requested parameter data were overridden by the implementation. */
    @NativeType("VkBool32")
    public boolean hasOverrides() { return nhasOverrides(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeSessionParametersFeedbackInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeSessionParametersFeedbackInfoKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeSessionParametersFeedbackInfoKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeSessionParametersFeedbackInfoKHR pNext(VkVideoEncodeH264SessionParametersFeedbackInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeSessionParametersFeedbackInfoKHR pNext(VkVideoEncodeH265SessionParametersFeedbackInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeSessionParametersFeedbackInfoKHR set(
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
    public VkVideoEncodeSessionParametersFeedbackInfoKHR set(VkVideoEncodeSessionParametersFeedbackInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeSessionParametersFeedbackInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR malloc() {
        return new VkVideoEncodeSessionParametersFeedbackInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeSessionParametersFeedbackInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR calloc() {
        return new VkVideoEncodeSessionParametersFeedbackInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeSessionParametersFeedbackInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeSessionParametersFeedbackInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeSessionParametersFeedbackInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR create(long address) {
        return new VkVideoEncodeSessionParametersFeedbackInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeSessionParametersFeedbackInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeSessionParametersFeedbackInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeSessionParametersFeedbackInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeSessionParametersFeedbackInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeSessionParametersFeedbackInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeSessionParametersFeedbackInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeSessionParametersFeedbackInfoKHR.PNEXT); }
    /** Unsafe version of {@link #hasOverrides}. */
    public static int nhasOverrides(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeSessionParametersFeedbackInfoKHR.HASOVERRIDES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeSessionParametersFeedbackInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeSessionParametersFeedbackInfoKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeSessionParametersFeedbackInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeSessionParametersFeedbackInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeSessionParametersFeedbackInfoKHR ELEMENT_FACTORY = VkVideoEncodeSessionParametersFeedbackInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeSessionParametersFeedbackInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeSessionParametersFeedbackInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeSessionParametersFeedbackInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeSessionParametersFeedbackInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeSessionParametersFeedbackInfoKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeSessionParametersFeedbackInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeSessionParametersFeedbackInfoKHR#hasOverrides} field. */
        @NativeType("VkBool32")
        public boolean hasOverrides() { return VkVideoEncodeSessionParametersFeedbackInfoKHR.nhasOverrides(address()) != 0; }

        /** Sets the specified value to the {@link VkVideoEncodeSessionParametersFeedbackInfoKHR#sType} field. */
        public VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeSessionParametersFeedbackInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR} value to the {@link VkVideoEncodeSessionParametersFeedbackInfoKHR#sType} field. */
        public VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeSessionParametersFeedbackInfoKHR#pNext} field. */
        public VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeSessionParametersFeedbackInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeH264SessionParametersFeedbackInfoEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer pNext(VkVideoEncodeH264SessionParametersFeedbackInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265SessionParametersFeedbackInfoEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeSessionParametersFeedbackInfoKHR.Buffer pNext(VkVideoEncodeH265SessionParametersFeedbackInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}