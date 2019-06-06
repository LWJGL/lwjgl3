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
 * Structure specifying the sample locations state to use in the initial layout transition of attachments.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the image referenced by the framebuffer attachment at index {@code attachmentIndex} was not created with {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} then the values specified in {@code sampleLocationsInfo} are ignored.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code attachmentIndex} <b>must</b> be less than the {@code attachmentCount} specified in {@link VkRenderPassCreateInfo} the render pass specified by {@link VkRenderPassBeginInfo}{@code ::renderPass} was created with</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sampleLocationsInfo} <b>must</b> be a valid {@link VkSampleLocationsInfoEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassSampleLocationsBeginInfoEXT}, {@link VkSampleLocationsInfoEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code attachmentIndex} &ndash; the index of the attachment for which the sample locations state is provided.</li>
 * <li>{@code sampleLocationsInfo} &ndash; the sample locations state to use for the layout transition of the given attachment from the initial layout of the attachment to the image layout specified for the attachment in the first subpass using it.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentSampleLocationsEXT {
 *     uint32_t attachmentIndex;
 *     {@link VkSampleLocationsInfoEXT VkSampleLocationsInfoEXT} sampleLocationsInfo;
 * }</code></pre>
 */
public class VkAttachmentSampleLocationsEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ATTACHMENTINDEX,
        SAMPLELOCATIONSINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(VkSampleLocationsInfoEXT.SIZEOF, VkSampleLocationsInfoEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ATTACHMENTINDEX = layout.offsetof(0);
        SAMPLELOCATIONSINFO = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkAttachmentSampleLocationsEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentSampleLocationsEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code attachmentIndex} field. */
    @NativeType("uint32_t")
    public int attachmentIndex() { return nattachmentIndex(address()); }
    /** Returns a {@link VkSampleLocationsInfoEXT} view of the {@code sampleLocationsInfo} field. */
    public VkSampleLocationsInfoEXT sampleLocationsInfo() { return nsampleLocationsInfo(address()); }

    /** Sets the specified value to the {@code attachmentIndex} field. */
    public VkAttachmentSampleLocationsEXT attachmentIndex(@NativeType("uint32_t") int value) { nattachmentIndex(address(), value); return this; }
    /** Copies the specified {@link VkSampleLocationsInfoEXT} to the {@code sampleLocationsInfo} field. */
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo(VkSampleLocationsInfoEXT value) { nsampleLocationsInfo(address(), value); return this; }
    /** Passes the {@code sampleLocationsInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo(java.util.function.Consumer<VkSampleLocationsInfoEXT> consumer) { consumer.accept(sampleLocationsInfo()); return this; }

    /** Initializes this struct with the specified values. */
    public VkAttachmentSampleLocationsEXT set(
        int attachmentIndex,
        VkSampleLocationsInfoEXT sampleLocationsInfo
    ) {
        attachmentIndex(attachmentIndex);
        sampleLocationsInfo(sampleLocationsInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentSampleLocationsEXT set(VkAttachmentSampleLocationsEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentSampleLocationsEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentSampleLocationsEXT malloc() {
        return wrap(VkAttachmentSampleLocationsEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAttachmentSampleLocationsEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentSampleLocationsEXT calloc() {
        return wrap(VkAttachmentSampleLocationsEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAttachmentSampleLocationsEXT} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentSampleLocationsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAttachmentSampleLocationsEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentSampleLocationsEXT} instance for the specified memory address. */
    public static VkAttachmentSampleLocationsEXT create(long address) {
        return wrap(VkAttachmentSampleLocationsEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentSampleLocationsEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkAttachmentSampleLocationsEXT.class, address);
    }

    /**
     * Returns a new {@link VkAttachmentSampleLocationsEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleLocationsEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentSampleLocationsEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleLocationsEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentSampleLocationsEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleLocationsEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAttachmentSampleLocationsEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleLocationsEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentSampleLocationsEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentSampleLocationsEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkAttachmentSampleLocationsEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkAttachmentSampleLocationsEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkAttachmentSampleLocationsEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkAttachmentSampleLocationsEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentSampleLocationsEXT mallocStack(MemoryStack stack) {
        return wrap(VkAttachmentSampleLocationsEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAttachmentSampleLocationsEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentSampleLocationsEXT callocStack(MemoryStack stack) {
        return wrap(VkAttachmentSampleLocationsEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAttachmentSampleLocationsEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleLocationsEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAttachmentSampleLocationsEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleLocationsEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAttachmentSampleLocationsEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleLocationsEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentSampleLocationsEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleLocationsEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #attachmentIndex}. */
    public static int nattachmentIndex(long struct) { return UNSAFE.getInt(null, struct + VkAttachmentSampleLocationsEXT.ATTACHMENTINDEX); }
    /** Unsafe version of {@link #sampleLocationsInfo}. */
    public static VkSampleLocationsInfoEXT nsampleLocationsInfo(long struct) { return VkSampleLocationsInfoEXT.create(struct + VkAttachmentSampleLocationsEXT.SAMPLELOCATIONSINFO); }

    /** Unsafe version of {@link #attachmentIndex(int) attachmentIndex}. */
    public static void nattachmentIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkAttachmentSampleLocationsEXT.ATTACHMENTINDEX, value); }
    /** Unsafe version of {@link #sampleLocationsInfo(VkSampleLocationsInfoEXT) sampleLocationsInfo}. */
    public static void nsampleLocationsInfo(long struct, VkSampleLocationsInfoEXT value) { memCopy(value.address(), struct + VkAttachmentSampleLocationsEXT.SAMPLELOCATIONSINFO, VkSampleLocationsInfoEXT.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        VkSampleLocationsInfoEXT.validate(struct + VkAttachmentSampleLocationsEXT.SAMPLELOCATIONSINFO);
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkAttachmentSampleLocationsEXT} structs. */
    public static class Buffer extends StructBuffer<VkAttachmentSampleLocationsEXT, Buffer> implements NativeResource {

        private static final VkAttachmentSampleLocationsEXT ELEMENT_FACTORY = VkAttachmentSampleLocationsEXT.create(-1L);

        /**
         * Creates a new {@code VkAttachmentSampleLocationsEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentSampleLocationsEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkAttachmentSampleLocationsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code attachmentIndex} field. */
        @NativeType("uint32_t")
        public int attachmentIndex() { return VkAttachmentSampleLocationsEXT.nattachmentIndex(address()); }
        /** Returns a {@link VkSampleLocationsInfoEXT} view of the {@code sampleLocationsInfo} field. */
        public VkSampleLocationsInfoEXT sampleLocationsInfo() { return VkAttachmentSampleLocationsEXT.nsampleLocationsInfo(address()); }

        /** Sets the specified value to the {@code attachmentIndex} field. */
        public VkAttachmentSampleLocationsEXT.Buffer attachmentIndex(@NativeType("uint32_t") int value) { VkAttachmentSampleLocationsEXT.nattachmentIndex(address(), value); return this; }
        /** Copies the specified {@link VkSampleLocationsInfoEXT} to the {@code sampleLocationsInfo} field. */
        public VkAttachmentSampleLocationsEXT.Buffer sampleLocationsInfo(VkSampleLocationsInfoEXT value) { VkAttachmentSampleLocationsEXT.nsampleLocationsInfo(address(), value); return this; }
        /** Passes the {@code sampleLocationsInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAttachmentSampleLocationsEXT.Buffer sampleLocationsInfo(java.util.function.Consumer<VkSampleLocationsInfoEXT> consumer) { consumer.accept(sampleLocationsInfo()); return this; }

    }

}