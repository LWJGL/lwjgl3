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
 * Structure describing multiview per view viewports features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMMultiviewPerViewViewports#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #multiviewPerViewViewports};
 * }</code></pre>
 */
public class VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM extends Struct<VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MULTIVIEWPERVIEWVIEWPORTS;

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
        MULTIVIEWPERVIEWVIEWPORTS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(ByteBuffer container) {
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
    /** indicates that the implementation supports multiview per-view viewports. */
    @NativeType("VkBool32")
    public boolean multiviewPerViewViewports() { return nmultiviewPerViewViewports(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMMultiviewPerViewViewports#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM sType$Default() { return sType(QCOMMultiviewPerViewViewports.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #multiviewPerViewViewports} field. */
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM multiviewPerViewViewports(@NativeType("VkBool32") boolean value) { nmultiviewPerViewViewports(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM set(
        int sType,
        long pNext,
        boolean multiviewPerViewViewports
    ) {
        sType(sType);
        pNext(pNext);
        multiviewPerViewViewports(multiviewPerViewViewports);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM set(VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM malloc() {
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM calloc() {
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #multiviewPerViewViewports}. */
    public static int nmultiviewPerViewViewports(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.MULTIVIEWPERVIEWVIEWPORTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #multiviewPerViewViewports(boolean) multiviewPerViewViewports}. */
    public static void nmultiviewPerViewViewports(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.MULTIVIEWPERVIEWVIEWPORTS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM#multiviewPerViewViewports} field. */
        @NativeType("VkBool32")
        public boolean multiviewPerViewViewports() { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.nmultiviewPerViewViewports(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMMultiviewPerViewViewports#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer sType$Default() { return sType(QCOMMultiviewPerViewViewports.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM#multiviewPerViewViewports} field. */
        public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer multiviewPerViewViewports(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.nmultiviewPerViewViewports(address(), value ? 1 : 0); return this; }

    }

}