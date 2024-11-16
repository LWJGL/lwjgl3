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
 * Structure describing whether <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#glossary-linear-color-attachment">Linear Color Attachment</a> rendering is supported by the implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVLinearColorAttachment#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceLinearColorAttachmentFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #linearColorAttachment};
 * }</code></pre>
 */
public class VkPhysicalDeviceLinearColorAttachmentFeaturesNV extends Struct<VkPhysicalDeviceLinearColorAttachmentFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LINEARCOLORATTACHMENT;

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
        LINEARCOLORATTACHMENT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceLinearColorAttachmentFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceLinearColorAttachmentFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceLinearColorAttachmentFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV(ByteBuffer container) {
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
    /** indicates whether the implementation supports renderable <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#glossary-linear-color-attachment">Linear Color Attachment</a> */
    @NativeType("VkBool32")
    public boolean linearColorAttachment() { return nlinearColorAttachment(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVLinearColorAttachment#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV sType$Default() { return sType(NVLinearColorAttachment.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #linearColorAttachment} field. */
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV linearColorAttachment(@NativeType("VkBool32") boolean value) { nlinearColorAttachment(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV set(
        int sType,
        long pNext,
        boolean linearColorAttachment
    ) {
        sType(sType);
        pNext(pNext);
        linearColorAttachment(linearColorAttachment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV set(VkPhysicalDeviceLinearColorAttachmentFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLinearColorAttachmentFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV malloc() {
        return new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLinearColorAttachmentFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV calloc() {
        return new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLinearColorAttachmentFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceLinearColorAttachmentFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV create(long address) {
        return new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceLinearColorAttachmentFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLinearColorAttachmentFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLinearColorAttachmentFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceLinearColorAttachmentFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceLinearColorAttachmentFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #linearColorAttachment}. */
    public static int nlinearColorAttachment(long struct) { return memGetInt(struct + VkPhysicalDeviceLinearColorAttachmentFeaturesNV.LINEARCOLORATTACHMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLinearColorAttachmentFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceLinearColorAttachmentFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #linearColorAttachment(boolean) linearColorAttachment}. */
    public static void nlinearColorAttachment(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLinearColorAttachmentFeaturesNV.LINEARCOLORATTACHMENT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLinearColorAttachmentFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceLinearColorAttachmentFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceLinearColorAttachmentFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceLinearColorAttachmentFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceLinearColorAttachmentFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceLinearColorAttachmentFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV#linearColorAttachment} field. */
        @NativeType("VkBool32")
        public boolean linearColorAttachment() { return VkPhysicalDeviceLinearColorAttachmentFeaturesNV.nlinearColorAttachment(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV#sType} field. */
        public VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceLinearColorAttachmentFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVLinearColorAttachment#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV} value to the {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV#sType} field. */
        public VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer sType$Default() { return sType(NVLinearColorAttachment.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV#pNext} field. */
        public VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceLinearColorAttachmentFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV#linearColorAttachment} field. */
        public VkPhysicalDeviceLinearColorAttachmentFeaturesNV.Buffer linearColorAttachment(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLinearColorAttachmentFeaturesNV.nlinearColorAttachment(address(), value ? 1 : 0); return this; }

    }

}