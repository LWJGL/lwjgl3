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
 * Structure indicating support for a render feedback loop image layout.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTAttachmentFeedbackLoopLayout#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #attachmentFeedbackLoopLayout};
 * }</code></pre>
 */
public class VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT extends Struct<VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ATTACHMENTFEEDBACKLOOPLAYOUT;

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
        ATTACHMENTFEEDBACKLOOPLAYOUT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(ByteBuffer container) {
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
    /** indicates whether the implementation supports using {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT} image layout for images created with {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT}. */
    @NativeType("VkBool32")
    public boolean attachmentFeedbackLoopLayout() { return nattachmentFeedbackLoopLayout(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTAttachmentFeedbackLoopLayout#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT sType$Default() { return sType(EXTAttachmentFeedbackLoopLayout.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #attachmentFeedbackLoopLayout} field. */
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT attachmentFeedbackLoopLayout(@NativeType("VkBool32") boolean value) { nattachmentFeedbackLoopLayout(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT set(
        int sType,
        long pNext,
        boolean attachmentFeedbackLoopLayout
    ) {
        sType(sType);
        pNext(pNext);
        attachmentFeedbackLoopLayout(attachmentFeedbackLoopLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT set(VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT malloc() {
        return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT calloc() {
        return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT create(long address) {
        return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #attachmentFeedbackLoopLayout}. */
    public static int nattachmentFeedbackLoopLayout(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.ATTACHMENTFEEDBACKLOOPLAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #attachmentFeedbackLoopLayout(boolean) attachmentFeedbackLoopLayout}. */
    public static void nattachmentFeedbackLoopLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.ATTACHMENTFEEDBACKLOOPLAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT#attachmentFeedbackLoopLayout} field. */
        @NativeType("VkBool32")
        public boolean attachmentFeedbackLoopLayout() { return VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.nattachmentFeedbackLoopLayout(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT#sType} field. */
        public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTAttachmentFeedbackLoopLayout#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT} value to the {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT#sType} field. */
        public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer sType$Default() { return sType(EXTAttachmentFeedbackLoopLayout.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT#attachmentFeedbackLoopLayout} field. */
        public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.Buffer attachmentFeedbackLoopLayout(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.nattachmentFeedbackLoopLayout(address(), value ? 1 : 0); return this; }

    }

}