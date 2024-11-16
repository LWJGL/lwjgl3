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
 * Structure describing multiview limits that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXMultiviewPerViewAttributes#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #perViewPositionAllComponents};
 * }</code></pre>
 */
public class VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX extends Struct<VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PERVIEWPOSITIONALLCOMPONENTS;

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
        PERVIEWPOSITIONALLCOMPONENTS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(ByteBuffer container) {
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
    /** {@link VK10#VK_TRUE TRUE} if the implementation supports per-view position values that differ in components other than the X component. */
    @NativeType("VkBool32")
    public boolean perViewPositionAllComponents() { return nperViewPositionAllComponents(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVXMultiviewPerViewAttributes#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX} value to the {@link #sType} field. */
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX sType$Default() { return sType(NVXMultiviewPerViewAttributes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX set(
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
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX set(VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX malloc() {
        return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX calloc() {
        return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} instance for the specified memory address. */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX create(long address) {
        return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.PNEXT); }
    /** Unsafe version of {@link #perViewPositionAllComponents}. */
    public static int nperViewPositionAllComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.PERVIEWPOSITIONALLCOMPONENTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX ELEMENT_FACTORY = VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX#perViewPositionAllComponents} field. */
        @NativeType("VkBool32")
        public boolean perViewPositionAllComponents() { return VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.nperViewPositionAllComponents(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX#sType} field. */
        public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.nsType(address(), value); return this; }
        /** Sets the {@link NVXMultiviewPerViewAttributes#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX} value to the {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX#sType} field. */
        public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer sType$Default() { return sType(NVXMultiviewPerViewAttributes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX#pNext} field. */
        public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.npNext(address(), value); return this; }

    }

}