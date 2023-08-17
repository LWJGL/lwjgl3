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
 * Structure describing the dynamic rendering unused attachment features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDynamicRenderingUnusedAttachments#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #dynamicRenderingUnusedAttachments};
 * }</code></pre>
 */
public class VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT extends Struct<VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DYNAMICRENDERINGUNUSEDATTACHMENTS;

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
        DYNAMICRENDERINGUNUSEDATTACHMENTS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(ByteBuffer container) {
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
    /** indicates that the implementation supports binding graphics pipelines within a render pass instance where any pipeline {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} element with a format other than {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} is allowed with a corresponding {@link VkRenderingInfo}{@code ::pColorAttachments} element with a {@code imageView} equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, or any pipeline {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} element with a {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} format is allowed with a corresponding {@link VkRenderingInfo}{@code ::pColorAttachments} element with a non-{@link VK10#VK_NULL_HANDLE NULL_HANDLE} {@code imageView}. Also a {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} other than {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} is allowed with a {@link VK10#VK_NULL_HANDLE NULL_HANDLE} {@link VkRenderingInfo}{@code ::pDepthAttachment}, or a {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} of {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} is allowed with a non-{@link VK10#VK_NULL_HANDLE NULL_HANDLE} {@link VkRenderingInfo}{@code ::pDepthAttachment}. Also a {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} other than {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} is allowed with a {@link VK10#VK_NULL_HANDLE NULL_HANDLE} {@link VkRenderingInfo}{@code ::pStencilAttachment}, or a {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} of {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} is allowed with a non-{@link VK10#VK_NULL_HANDLE NULL_HANDLE} {@link VkRenderingInfo}{@code ::pStencilAttachment}. Any writes to a {@link VkRenderingInfo}{@code ::pColorAttachments}, {@link VkRenderingInfo}{@code ::pDepthAttachment}, or {@link VkRenderingInfo}{@code ::pStencilAttachment} with {@link VK10#VK_NULL_HANDLE NULL_HANDLE} are discarded. */
    @NativeType("VkBool32")
    public boolean dynamicRenderingUnusedAttachments() { return ndynamicRenderingUnusedAttachments(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDynamicRenderingUnusedAttachments#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT sType$Default() { return sType(EXTDynamicRenderingUnusedAttachments.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #dynamicRenderingUnusedAttachments} field. */
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT dynamicRenderingUnusedAttachments(@NativeType("VkBool32") boolean value) { ndynamicRenderingUnusedAttachments(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT set(
        int sType,
        long pNext,
        boolean dynamicRenderingUnusedAttachments
    ) {
        sType(sType);
        pNext(pNext);
        dynamicRenderingUnusedAttachments(dynamicRenderingUnusedAttachments);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT set(VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT malloc() {
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT calloc() {
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #dynamicRenderingUnusedAttachments}. */
    public static int ndynamicRenderingUnusedAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.DYNAMICRENDERINGUNUSEDATTACHMENTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #dynamicRenderingUnusedAttachments(boolean) dynamicRenderingUnusedAttachments}. */
    public static void ndynamicRenderingUnusedAttachments(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.DYNAMICRENDERINGUNUSEDATTACHMENTS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT#dynamicRenderingUnusedAttachments} field. */
        @NativeType("VkBool32")
        public boolean dynamicRenderingUnusedAttachments() { return VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.ndynamicRenderingUnusedAttachments(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT#sType} field. */
        public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDynamicRenderingUnusedAttachments#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT} value to the {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT#sType} field. */
        public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer sType$Default() { return sType(EXTDynamicRenderingUnusedAttachments.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT#dynamicRenderingUnusedAttachments} field. */
        public VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.Buffer dynamicRenderingUnusedAttachments(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT.ndynamicRenderingUnusedAttachments(address(), value ? 1 : 0); return this; }

    }

}