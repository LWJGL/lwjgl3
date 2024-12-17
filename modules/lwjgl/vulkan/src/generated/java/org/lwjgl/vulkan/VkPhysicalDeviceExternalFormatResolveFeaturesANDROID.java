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
 * struct VkPhysicalDeviceExternalFormatResolveFeaturesANDROID {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 externalFormatResolve;
 * }}</pre>
 */
public class VkPhysicalDeviceExternalFormatResolveFeaturesANDROID extends Struct<VkPhysicalDeviceExternalFormatResolveFeaturesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTERNALFORMATRESOLVE;

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
        EXTERNALFORMATRESOLVE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceExternalFormatResolveFeaturesANDROID create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExternalFormatResolveFeaturesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code externalFormatResolve} field. */
    @NativeType("VkBool32")
    public boolean externalFormatResolve() { return nexternalFormatResolve(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ANDROIDExternalFormatResolve#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID} value to the {@code sType} field. */
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID sType$Default() { return sType(ANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code externalFormatResolve} field. */
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID externalFormatResolve(@NativeType("VkBool32") boolean value) { nexternalFormatResolve(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID set(
        int sType,
        long pNext,
        boolean externalFormatResolve
    ) {
        sType(sType);
        pNext(pNext);
        externalFormatResolve(externalFormatResolve);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID set(VkPhysicalDeviceExternalFormatResolveFeaturesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExternalFormatResolveFeaturesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID malloc() {
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExternalFormatResolveFeaturesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID calloc() {
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExternalFormatResolveFeaturesANDROID} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExternalFormatResolveFeaturesANDROID} instance for the specified memory address. */
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID create(long address) {
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceExternalFormatResolveFeaturesANDROID createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalFormatResolveFeaturesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalFormatResolveFeaturesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.PNEXT); }
    /** Unsafe version of {@link #externalFormatResolve}. */
    public static int nexternalFormatResolve(long struct) { return memGetInt(struct + VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.EXTERNALFORMATRESOLVE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.PNEXT, value); }
    /** Unsafe version of {@link #externalFormatResolve(boolean) externalFormatResolve}. */
    public static void nexternalFormatResolve(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.EXTERNALFORMATRESOLVE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExternalFormatResolveFeaturesANDROID} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalFormatResolveFeaturesANDROID, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExternalFormatResolveFeaturesANDROID ELEMENT_FACTORY = VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExternalFormatResolveFeaturesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceExternalFormatResolveFeaturesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.npNext(address()); }
        /** @return the value of the {@code externalFormatResolve} field. */
        @NativeType("VkBool32")
        public boolean externalFormatResolve() { return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.nexternalFormatResolve(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.nsType(address(), value); return this; }
        /** Sets the {@link ANDROIDExternalFormatResolve#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID} value to the {@code sType} field. */
        public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer sType$Default() { return sType(ANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code externalFormatResolve} field. */
        public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.Buffer externalFormatResolve(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.nexternalFormatResolve(address(), value ? 1 : 0); return this; }

    }

}