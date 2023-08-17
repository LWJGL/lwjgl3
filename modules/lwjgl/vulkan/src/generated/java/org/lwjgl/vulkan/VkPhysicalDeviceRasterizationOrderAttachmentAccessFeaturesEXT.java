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
 * Structure describing whether rasterization order attachment access can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTRasterizationOrderAttachmentAccess#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #rasterizationOrderColorAttachmentAccess};
 *     VkBool32 {@link #rasterizationOrderDepthAttachmentAccess};
 *     VkBool32 {@link #rasterizationOrderStencilAttachmentAccess};
 * }</code></pre>
 */
public class VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT extends Struct<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RASTERIZATIONORDERCOLORATTACHMENTACCESS,
        RASTERIZATIONORDERDEPTHATTACHMENTACCESS,
        RASTERIZATIONORDERSTENCILATTACHMENTACCESS;

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
        RASTERIZATIONORDERCOLORATTACHMENTACCESS = layout.offsetof(2);
        RASTERIZATIONORDERDEPTHATTACHMENTACCESS = layout.offsetof(3);
        RASTERIZATIONORDERSTENCILATTACHMENTACCESS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(ByteBuffer container) {
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
    /** indicates that rasterization order access to color and input attachments is supported by the implementation. */
    @NativeType("VkBool32")
    public boolean rasterizationOrderColorAttachmentAccess() { return nrasterizationOrderColorAttachmentAccess(address()) != 0; }
    /** indicates that rasterization order access to the depth aspect of depth/stencil and input attachments is supported by the implementation. */
    @NativeType("VkBool32")
    public boolean rasterizationOrderDepthAttachmentAccess() { return nrasterizationOrderDepthAttachmentAccess(address()) != 0; }
    /** indicates that rasterization order access to the stencil aspect of depth/stencil and input attachments is supported by the implementation. */
    @NativeType("VkBool32")
    public boolean rasterizationOrderStencilAttachmentAccess() { return nrasterizationOrderStencilAttachmentAccess(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTRasterizationOrderAttachmentAccess#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT sType$Default() { return sType(EXTRasterizationOrderAttachmentAccess.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #rasterizationOrderColorAttachmentAccess} field. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderColorAttachmentAccess(@NativeType("VkBool32") boolean value) { nrasterizationOrderColorAttachmentAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #rasterizationOrderDepthAttachmentAccess} field. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderDepthAttachmentAccess(@NativeType("VkBool32") boolean value) { nrasterizationOrderDepthAttachmentAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #rasterizationOrderStencilAttachmentAccess} field. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderStencilAttachmentAccess(@NativeType("VkBool32") boolean value) { nrasterizationOrderStencilAttachmentAccess(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT set(
        int sType,
        long pNext,
        boolean rasterizationOrderColorAttachmentAccess,
        boolean rasterizationOrderDepthAttachmentAccess,
        boolean rasterizationOrderStencilAttachmentAccess
    ) {
        sType(sType);
        pNext(pNext);
        rasterizationOrderColorAttachmentAccess(rasterizationOrderColorAttachmentAccess);
        rasterizationOrderDepthAttachmentAccess(rasterizationOrderDepthAttachmentAccess);
        rasterizationOrderStencilAttachmentAccess(rasterizationOrderStencilAttachmentAccess);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT set(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT malloc() {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT calloc() {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT create(long address) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #rasterizationOrderColorAttachmentAccess}. */
    public static int nrasterizationOrderColorAttachmentAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.RASTERIZATIONORDERCOLORATTACHMENTACCESS); }
    /** Unsafe version of {@link #rasterizationOrderDepthAttachmentAccess}. */
    public static int nrasterizationOrderDepthAttachmentAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.RASTERIZATIONORDERDEPTHATTACHMENTACCESS); }
    /** Unsafe version of {@link #rasterizationOrderStencilAttachmentAccess}. */
    public static int nrasterizationOrderStencilAttachmentAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.RASTERIZATIONORDERSTENCILATTACHMENTACCESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #rasterizationOrderColorAttachmentAccess(boolean) rasterizationOrderColorAttachmentAccess}. */
    public static void nrasterizationOrderColorAttachmentAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.RASTERIZATIONORDERCOLORATTACHMENTACCESS, value); }
    /** Unsafe version of {@link #rasterizationOrderDepthAttachmentAccess(boolean) rasterizationOrderDepthAttachmentAccess}. */
    public static void nrasterizationOrderDepthAttachmentAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.RASTERIZATIONORDERDEPTHATTACHMENTACCESS, value); }
    /** Unsafe version of {@link #rasterizationOrderStencilAttachmentAccess(boolean) rasterizationOrderStencilAttachmentAccess}. */
    public static void nrasterizationOrderStencilAttachmentAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.RASTERIZATIONORDERSTENCILATTACHMENTACCESS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT#rasterizationOrderColorAttachmentAccess} field. */
        @NativeType("VkBool32")
        public boolean rasterizationOrderColorAttachmentAccess() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nrasterizationOrderColorAttachmentAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT#rasterizationOrderDepthAttachmentAccess} field. */
        @NativeType("VkBool32")
        public boolean rasterizationOrderDepthAttachmentAccess() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nrasterizationOrderDepthAttachmentAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT#rasterizationOrderStencilAttachmentAccess} field. */
        @NativeType("VkBool32")
        public boolean rasterizationOrderStencilAttachmentAccess() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nrasterizationOrderStencilAttachmentAccess(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT#sType} field. */
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTRasterizationOrderAttachmentAccess#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT} value to the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT#sType} field. */
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer sType$Default() { return sType(EXTRasterizationOrderAttachmentAccess.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT#rasterizationOrderColorAttachmentAccess} field. */
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer rasterizationOrderColorAttachmentAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nrasterizationOrderColorAttachmentAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT#rasterizationOrderDepthAttachmentAccess} field. */
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer rasterizationOrderDepthAttachmentAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nrasterizationOrderDepthAttachmentAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT#rasterizationOrderStencilAttachmentAccess} field. */
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer rasterizationOrderStencilAttachmentAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.nrasterizationOrderStencilAttachmentAccess(address(), value ? 1 : 0); return this; }

    }

}