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
 * Structure to set video session parameters.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code videoSessionParametersTemplate} represents a valid handle, it <b>must</b> have been created against {@code videoSession}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoDecodeH264SessionParametersCreateInfoEXT}, {@link VkVideoDecodeH265SessionParametersCreateInfoEXT}, {@link VkVideoEncodeH264SessionParametersCreateInfoEXT}, or {@link VkVideoEncodeH265SessionParametersCreateInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code videoSessionParametersTemplate} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
 * <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
 * <li>If {@code videoSessionParametersTemplate} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code videoSession}</li>
 * <li>Both of {@code videoSession}, and {@code videoSessionParametersTemplate} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRVideoQueue#vkCreateVideoSessionParametersKHR CreateVideoSessionParametersKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoSessionParametersCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoSessionParametersKHR {@link #videoSessionParametersTemplate};
 *     VkVideoSessionKHR {@link #videoSession};
 * }</code></pre>
 */
public class VkVideoSessionParametersCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIDEOSESSIONPARAMETERSTEMPLATE,
        VIDEOSESSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEOSESSIONPARAMETERSTEMPLATE = layout.offsetof(2);
        VIDEOSESSION = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkVideoSessionParametersCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoSessionParametersCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a valid handle to a {@code VkVideoSessionParametersKHR} object. If this parameter represents a valid handle, then the underlying Video Session Parameters object will be used as a template for constructing the new video session parameters object. All of the template object’s current parameters will be inherited by the new object in such a case. Optionally, some of the template’s parameters can be updated or new parameters added to the newly constructed object via the extension-specific parameters. */
    @NativeType("VkVideoSessionParametersKHR")
    public long videoSessionParametersTemplate() { return nvideoSessionParametersTemplate(address()); }
    /** the video session object against which the video session parameters object is going to be created. */
    @NativeType("VkVideoSessionKHR")
    public long videoSession() { return nvideoSession(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoSessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoSessionParametersCreateInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoSessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeH264SessionParametersCreateInfoEXT} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoDecodeH264SessionParametersCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265SessionParametersCreateInfoEXT} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoDecodeH265SessionParametersCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264SessionParametersCreateInfoEXT} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeH264SessionParametersCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265SessionParametersCreateInfoEXT} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeH265SessionParametersCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #videoSessionParametersTemplate} field. */
    public VkVideoSessionParametersCreateInfoKHR videoSessionParametersTemplate(@NativeType("VkVideoSessionParametersKHR") long value) { nvideoSessionParametersTemplate(address(), value); return this; }
    /** Sets the specified value to the {@link #videoSession} field. */
    public VkVideoSessionParametersCreateInfoKHR videoSession(@NativeType("VkVideoSessionKHR") long value) { nvideoSession(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoSessionParametersCreateInfoKHR set(
        int sType,
        long pNext,
        long videoSessionParametersTemplate,
        long videoSession
    ) {
        sType(sType);
        pNext(pNext);
        videoSessionParametersTemplate(videoSessionParametersTemplate);
        videoSession(videoSession);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoSessionParametersCreateInfoKHR set(VkVideoSessionParametersCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoSessionParametersCreateInfoKHR malloc() {
        return wrap(VkVideoSessionParametersCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoSessionParametersCreateInfoKHR calloc() {
        return wrap(VkVideoSessionParametersCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoSessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoSessionParametersCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance for the specified memory address. */
    public static VkVideoSessionParametersCreateInfoKHR create(long address) {
        return wrap(VkVideoSessionParametersCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoSessionParametersCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoSessionParametersCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoSessionParametersCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkVideoSessionParametersCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkVideoSessionParametersCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoSessionParametersCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoSessionParametersCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #videoSessionParametersTemplate}. */
    public static long nvideoSessionParametersTemplate(long struct) { return UNSAFE.getLong(null, struct + VkVideoSessionParametersCreateInfoKHR.VIDEOSESSIONPARAMETERSTEMPLATE); }
    /** Unsafe version of {@link #videoSession}. */
    public static long nvideoSession(long struct) { return UNSAFE.getLong(null, struct + VkVideoSessionParametersCreateInfoKHR.VIDEOSESSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionParametersCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoSessionParametersCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #videoSessionParametersTemplate(long) videoSessionParametersTemplate}. */
    public static void nvideoSessionParametersTemplate(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoSessionParametersCreateInfoKHR.VIDEOSESSIONPARAMETERSTEMPLATE, value); }
    /** Unsafe version of {@link #videoSession(long) videoSession}. */
    public static void nvideoSession(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoSessionParametersCreateInfoKHR.VIDEOSESSION, value); }

    // -----------------------------------

    /** An array of {@link VkVideoSessionParametersCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoSessionParametersCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoSessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoSessionParametersCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoSessionParametersCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoSessionParametersCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoSessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoSessionParametersCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoSessionParametersCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoSessionParametersCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoSessionParametersCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoSessionParametersCreateInfoKHR#videoSessionParametersTemplate} field. */
        @NativeType("VkVideoSessionParametersKHR")
        public long videoSessionParametersTemplate() { return VkVideoSessionParametersCreateInfoKHR.nvideoSessionParametersTemplate(address()); }
        /** @return the value of the {@link VkVideoSessionParametersCreateInfoKHR#videoSession} field. */
        @NativeType("VkVideoSessionKHR")
        public long videoSession() { return VkVideoSessionParametersCreateInfoKHR.nvideoSession(address()); }

        /** Sets the specified value to the {@link VkVideoSessionParametersCreateInfoKHR#sType} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoSessionParametersCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@link VkVideoSessionParametersCreateInfoKHR#sType} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoSessionParametersCreateInfoKHR#pNext} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoSessionParametersCreateInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeH264SessionParametersCreateInfoEXT} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoDecodeH264SessionParametersCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265SessionParametersCreateInfoEXT} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoDecodeH265SessionParametersCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264SessionParametersCreateInfoEXT} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoEncodeH264SessionParametersCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265SessionParametersCreateInfoEXT} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoEncodeH265SessionParametersCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoSessionParametersCreateInfoKHR#videoSessionParametersTemplate} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer videoSessionParametersTemplate(@NativeType("VkVideoSessionParametersKHR") long value) { VkVideoSessionParametersCreateInfoKHR.nvideoSessionParametersTemplate(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoSessionParametersCreateInfoKHR#videoSession} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer videoSession(@NativeType("VkVideoSessionKHR") long value) { VkVideoSessionParametersCreateInfoKHR.nvideoSession(address(), value); return this; }

    }

}