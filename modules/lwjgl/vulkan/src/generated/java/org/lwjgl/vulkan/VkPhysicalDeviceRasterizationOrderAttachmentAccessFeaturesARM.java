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
 * <p>If the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with values indicating whether the feature is supported. {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ARMRasterizationOrderAttachmentAccess#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_ARM}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #rasterizationOrderColorAttachmentAccess};
 *     VkBool32 {@link #rasterizationOrderDepthAttachmentAccess};
 *     VkBool32 {@link #rasterizationOrderStencilAttachmentAccess};
 * }</code></pre>
 */
public class VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
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

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMRasterizationOrderAttachmentAccess#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM sType$Default() { return sType(ARMRasterizationOrderAttachmentAccess.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #rasterizationOrderColorAttachmentAccess} field. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderColorAttachmentAccess(@NativeType("VkBool32") boolean value) { nrasterizationOrderColorAttachmentAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #rasterizationOrderDepthAttachmentAccess} field. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderDepthAttachmentAccess(@NativeType("VkBool32") boolean value) { nrasterizationOrderDepthAttachmentAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #rasterizationOrderStencilAttachmentAccess} field. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderStencilAttachmentAccess(@NativeType("VkBool32") boolean value) { nrasterizationOrderStencilAttachmentAccess(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM set(
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
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM set(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM malloc() {
        return wrap(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM calloc() {
        return wrap(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM create(long address) {
        return wrap(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.PNEXT); }
    /** Unsafe version of {@link #rasterizationOrderColorAttachmentAccess}. */
    public static int nrasterizationOrderColorAttachmentAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.RASTERIZATIONORDERCOLORATTACHMENTACCESS); }
    /** Unsafe version of {@link #rasterizationOrderDepthAttachmentAccess}. */
    public static int nrasterizationOrderDepthAttachmentAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.RASTERIZATIONORDERDEPTHATTACHMENTACCESS); }
    /** Unsafe version of {@link #rasterizationOrderStencilAttachmentAccess}. */
    public static int nrasterizationOrderStencilAttachmentAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.RASTERIZATIONORDERSTENCILATTACHMENTACCESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.PNEXT, value); }
    /** Unsafe version of {@link #rasterizationOrderColorAttachmentAccess(boolean) rasterizationOrderColorAttachmentAccess}. */
    public static void nrasterizationOrderColorAttachmentAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.RASTERIZATIONORDERCOLORATTACHMENTACCESS, value); }
    /** Unsafe version of {@link #rasterizationOrderDepthAttachmentAccess(boolean) rasterizationOrderDepthAttachmentAccess}. */
    public static void nrasterizationOrderDepthAttachmentAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.RASTERIZATIONORDERDEPTHATTACHMENTACCESS, value); }
    /** Unsafe version of {@link #rasterizationOrderStencilAttachmentAccess(boolean) rasterizationOrderStencilAttachmentAccess}. */
    public static void nrasterizationOrderStencilAttachmentAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.RASTERIZATIONORDERSTENCILATTACHMENTACCESS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM#rasterizationOrderColorAttachmentAccess} field. */
        @NativeType("VkBool32")
        public boolean rasterizationOrderColorAttachmentAccess() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderColorAttachmentAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM#rasterizationOrderDepthAttachmentAccess} field. */
        @NativeType("VkBool32")
        public boolean rasterizationOrderDepthAttachmentAccess() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderDepthAttachmentAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM#rasterizationOrderStencilAttachmentAccess} field. */
        @NativeType("VkBool32")
        public boolean rasterizationOrderStencilAttachmentAccess() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderStencilAttachmentAccess(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMRasterizationOrderAttachmentAccess#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer sType$Default() { return sType(ARMRasterizationOrderAttachmentAccess.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM#rasterizationOrderColorAttachmentAccess} field. */
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer rasterizationOrderColorAttachmentAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderColorAttachmentAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM#rasterizationOrderDepthAttachmentAccess} field. */
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer rasterizationOrderDepthAttachmentAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderDepthAttachmentAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM#rasterizationOrderStencilAttachmentAccess} field. */
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer rasterizationOrderStencilAttachmentAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderStencilAttachmentAccess(address(), value ? 1 : 0); return this; }

    }

}