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
 * struct VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 workgroupMemoryExplicitLayout;
 *     VkBool32 workgroupMemoryExplicitLayoutScalarBlockLayout;
 *     VkBool32 workgroupMemoryExplicitLayout8BitAccess;
 *     VkBool32 workgroupMemoryExplicitLayout16BitAccess;
 * }}</pre>
 */
public class VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR extends Struct<VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WORKGROUPMEMORYEXPLICITLAYOUT,
        WORKGROUPMEMORYEXPLICITLAYOUTSCALARBLOCKLAYOUT,
        WORKGROUPMEMORYEXPLICITLAYOUT8BITACCESS,
        WORKGROUPMEMORYEXPLICITLAYOUT16BITACCESS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WORKGROUPMEMORYEXPLICITLAYOUT = layout.offsetof(2);
        WORKGROUPMEMORYEXPLICITLAYOUTSCALARBLOCKLAYOUT = layout.offsetof(3);
        WORKGROUPMEMORYEXPLICITLAYOUT8BITACCESS = layout.offsetof(4);
        WORKGROUPMEMORYEXPLICITLAYOUT16BITACCESS = layout.offsetof(5);
    }

    protected VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code workgroupMemoryExplicitLayout} field. */
    @NativeType("VkBool32")
    public boolean workgroupMemoryExplicitLayout() { return nworkgroupMemoryExplicitLayout(address()) != 0; }
    /** @return the value of the {@code workgroupMemoryExplicitLayoutScalarBlockLayout} field. */
    @NativeType("VkBool32")
    public boolean workgroupMemoryExplicitLayoutScalarBlockLayout() { return nworkgroupMemoryExplicitLayoutScalarBlockLayout(address()) != 0; }
    /** @return the value of the {@code workgroupMemoryExplicitLayout8BitAccess} field. */
    @NativeType("VkBool32")
    public boolean workgroupMemoryExplicitLayout8BitAccess() { return nworkgroupMemoryExplicitLayout8BitAccess(address()) != 0; }
    /** @return the value of the {@code workgroupMemoryExplicitLayout16BitAccess} field. */
    @NativeType("VkBool32")
    public boolean workgroupMemoryExplicitLayout16BitAccess() { return nworkgroupMemoryExplicitLayout16BitAccess(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRWorkgroupMemoryExplicitLayout#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR sType$Default() { return sType(KHRWorkgroupMemoryExplicitLayout.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code workgroupMemoryExplicitLayout} field. */
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout(@NativeType("VkBool32") boolean value) { nworkgroupMemoryExplicitLayout(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code workgroupMemoryExplicitLayoutScalarBlockLayout} field. */
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayoutScalarBlockLayout(@NativeType("VkBool32") boolean value) { nworkgroupMemoryExplicitLayoutScalarBlockLayout(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code workgroupMemoryExplicitLayout8BitAccess} field. */
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout8BitAccess(@NativeType("VkBool32") boolean value) { nworkgroupMemoryExplicitLayout8BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code workgroupMemoryExplicitLayout16BitAccess} field. */
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout16BitAccess(@NativeType("VkBool32") boolean value) { nworkgroupMemoryExplicitLayout16BitAccess(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR set(
        int sType,
        long pNext,
        boolean workgroupMemoryExplicitLayout,
        boolean workgroupMemoryExplicitLayoutScalarBlockLayout,
        boolean workgroupMemoryExplicitLayout8BitAccess,
        boolean workgroupMemoryExplicitLayout16BitAccess
    ) {
        sType(sType);
        pNext(pNext);
        workgroupMemoryExplicitLayout(workgroupMemoryExplicitLayout);
        workgroupMemoryExplicitLayoutScalarBlockLayout(workgroupMemoryExplicitLayoutScalarBlockLayout);
        workgroupMemoryExplicitLayout8BitAccess(workgroupMemoryExplicitLayout8BitAccess);
        workgroupMemoryExplicitLayout16BitAccess(workgroupMemoryExplicitLayout16BitAccess);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR set(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR malloc() {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR calloc() {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR create(long address) {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #workgroupMemoryExplicitLayout}. */
    public static int nworkgroupMemoryExplicitLayout(long struct) { return memGetInt(struct + VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.WORKGROUPMEMORYEXPLICITLAYOUT); }
    /** Unsafe version of {@link #workgroupMemoryExplicitLayoutScalarBlockLayout}. */
    public static int nworkgroupMemoryExplicitLayoutScalarBlockLayout(long struct) { return memGetInt(struct + VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.WORKGROUPMEMORYEXPLICITLAYOUTSCALARBLOCKLAYOUT); }
    /** Unsafe version of {@link #workgroupMemoryExplicitLayout8BitAccess}. */
    public static int nworkgroupMemoryExplicitLayout8BitAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.WORKGROUPMEMORYEXPLICITLAYOUT8BITACCESS); }
    /** Unsafe version of {@link #workgroupMemoryExplicitLayout16BitAccess}. */
    public static int nworkgroupMemoryExplicitLayout16BitAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.WORKGROUPMEMORYEXPLICITLAYOUT16BITACCESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #workgroupMemoryExplicitLayout(boolean) workgroupMemoryExplicitLayout}. */
    public static void nworkgroupMemoryExplicitLayout(long struct, int value) { memPutInt(struct + VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.WORKGROUPMEMORYEXPLICITLAYOUT, value); }
    /** Unsafe version of {@link #workgroupMemoryExplicitLayoutScalarBlockLayout(boolean) workgroupMemoryExplicitLayoutScalarBlockLayout}. */
    public static void nworkgroupMemoryExplicitLayoutScalarBlockLayout(long struct, int value) { memPutInt(struct + VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.WORKGROUPMEMORYEXPLICITLAYOUTSCALARBLOCKLAYOUT, value); }
    /** Unsafe version of {@link #workgroupMemoryExplicitLayout8BitAccess(boolean) workgroupMemoryExplicitLayout8BitAccess}. */
    public static void nworkgroupMemoryExplicitLayout8BitAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.WORKGROUPMEMORYEXPLICITLAYOUT8BITACCESS, value); }
    /** Unsafe version of {@link #workgroupMemoryExplicitLayout16BitAccess(boolean) workgroupMemoryExplicitLayout16BitAccess}. */
    public static void nworkgroupMemoryExplicitLayout16BitAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.WORKGROUPMEMORYEXPLICITLAYOUT16BITACCESS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code workgroupMemoryExplicitLayout} field. */
        @NativeType("VkBool32")
        public boolean workgroupMemoryExplicitLayout() { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayout(address()) != 0; }
        /** @return the value of the {@code workgroupMemoryExplicitLayoutScalarBlockLayout} field. */
        @NativeType("VkBool32")
        public boolean workgroupMemoryExplicitLayoutScalarBlockLayout() { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayoutScalarBlockLayout(address()) != 0; }
        /** @return the value of the {@code workgroupMemoryExplicitLayout8BitAccess} field. */
        @NativeType("VkBool32")
        public boolean workgroupMemoryExplicitLayout8BitAccess() { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayout8BitAccess(address()) != 0; }
        /** @return the value of the {@code workgroupMemoryExplicitLayout16BitAccess} field. */
        @NativeType("VkBool32")
        public boolean workgroupMemoryExplicitLayout16BitAccess() { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayout16BitAccess(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRWorkgroupMemoryExplicitLayout#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer sType$Default() { return sType(KHRWorkgroupMemoryExplicitLayout.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code workgroupMemoryExplicitLayout} field. */
        public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer workgroupMemoryExplicitLayout(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayout(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code workgroupMemoryExplicitLayoutScalarBlockLayout} field. */
        public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer workgroupMemoryExplicitLayoutScalarBlockLayout(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayoutScalarBlockLayout(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code workgroupMemoryExplicitLayout8BitAccess} field. */
        public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer workgroupMemoryExplicitLayout8BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayout8BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code workgroupMemoryExplicitLayout16BitAccess} field. */
        public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer workgroupMemoryExplicitLayout16BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.nworkgroupMemoryExplicitLayout16BitAccess(address(), value ? 1 : 0); return this; }

    }

}