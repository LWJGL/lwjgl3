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
 * Structure describing multiview per view render areas features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMMultiviewPerViewRenderAreas#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #multiviewPerViewRenderAreas};
 * }</code></pre>
 */
public class VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM extends Struct<VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MULTIVIEWPERVIEWRENDERAREAS;

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
        MULTIVIEWPERVIEWRENDERAREAS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(ByteBuffer container) {
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
    /** indicates that the implementation supports multiview per-view render areas. */
    @NativeType("VkBool32")
    public boolean multiviewPerViewRenderAreas() { return nmultiviewPerViewRenderAreas(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMMultiviewPerViewRenderAreas#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM sType$Default() { return sType(QCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #multiviewPerViewRenderAreas} field. */
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM multiviewPerViewRenderAreas(@NativeType("VkBool32") boolean value) { nmultiviewPerViewRenderAreas(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM set(
        int sType,
        long pNext,
        boolean multiviewPerViewRenderAreas
    ) {
        sType(sType);
        pNext(pNext);
        multiviewPerViewRenderAreas(multiviewPerViewRenderAreas);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM set(VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM malloc() {
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM calloc() {
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #multiviewPerViewRenderAreas}. */
    public static int nmultiviewPerViewRenderAreas(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.MULTIVIEWPERVIEWRENDERAREAS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #multiviewPerViewRenderAreas(boolean) multiviewPerViewRenderAreas}. */
    public static void nmultiviewPerViewRenderAreas(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.MULTIVIEWPERVIEWRENDERAREAS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM#multiviewPerViewRenderAreas} field. */
        @NativeType("VkBool32")
        public boolean multiviewPerViewRenderAreas() { return VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.nmultiviewPerViewRenderAreas(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMMultiviewPerViewRenderAreas#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer sType$Default() { return sType(QCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM#multiviewPerViewRenderAreas} field. */
        public VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.Buffer multiviewPerViewRenderAreas(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM.nmultiviewPerViewRenderAreas(address(), value ? 1 : 0); return this; }

    }

}