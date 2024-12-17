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
 * <pre>{@code
 * struct VkPhysicalDeviceInheritedViewportScissorFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 inheritedViewportScissor2D;
 * }}</pre>
 */
public class VkPhysicalDeviceInheritedViewportScissorFeaturesNV extends Struct<VkPhysicalDeviceInheritedViewportScissorFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INHERITEDVIEWPORTSCISSOR2D;

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
        INHERITEDVIEWPORTSCISSOR2D = layout.offsetof(2);
    }

    protected VkPhysicalDeviceInheritedViewportScissorFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceInheritedViewportScissorFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceInheritedViewportScissorFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code inheritedViewportScissor2D} field. */
    @NativeType("VkBool32")
    public boolean inheritedViewportScissor2D() { return ninheritedViewportScissor2D(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVInheritedViewportScissor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV sType$Default() { return sType(NVInheritedViewportScissor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code inheritedViewportScissor2D} field. */
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV inheritedViewportScissor2D(@NativeType("VkBool32") boolean value) { ninheritedViewportScissor2D(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV set(
        int sType,
        long pNext,
        boolean inheritedViewportScissor2D
    ) {
        sType(sType);
        pNext(pNext);
        inheritedViewportScissor2D(inheritedViewportScissor2D);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV set(VkPhysicalDeviceInheritedViewportScissorFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceInheritedViewportScissorFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV malloc() {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceInheritedViewportScissorFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV calloc() {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceInheritedViewportScissorFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceInheritedViewportScissorFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV create(long address) {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceInheritedViewportScissorFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInheritedViewportScissorFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInheritedViewportScissorFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceInheritedViewportScissorFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceInheritedViewportScissorFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #inheritedViewportScissor2D}. */
    public static int ninheritedViewportScissor2D(long struct) { return memGetInt(struct + VkPhysicalDeviceInheritedViewportScissorFeaturesNV.INHERITEDVIEWPORTSCISSOR2D); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceInheritedViewportScissorFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceInheritedViewportScissorFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #inheritedViewportScissor2D(boolean) inheritedViewportScissor2D}. */
    public static void ninheritedViewportScissor2D(long struct, int value) { memPutInt(struct + VkPhysicalDeviceInheritedViewportScissorFeaturesNV.INHERITEDVIEWPORTSCISSOR2D, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceInheritedViewportScissorFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceInheritedViewportScissorFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceInheritedViewportScissorFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceInheritedViewportScissorFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceInheritedViewportScissorFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceInheritedViewportScissorFeaturesNV.npNext(address()); }
        /** @return the value of the {@code inheritedViewportScissor2D} field. */
        @NativeType("VkBool32")
        public boolean inheritedViewportScissor2D() { return VkPhysicalDeviceInheritedViewportScissorFeaturesNV.ninheritedViewportScissor2D(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceInheritedViewportScissorFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVInheritedViewportScissor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer sType$Default() { return sType(NVInheritedViewportScissor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceInheritedViewportScissorFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code inheritedViewportScissor2D} field. */
        public VkPhysicalDeviceInheritedViewportScissorFeaturesNV.Buffer inheritedViewportScissor2D(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceInheritedViewportScissorFeaturesNV.ninheritedViewportScissor2D(address(), value ? 1 : 0); return this; }

    }

}