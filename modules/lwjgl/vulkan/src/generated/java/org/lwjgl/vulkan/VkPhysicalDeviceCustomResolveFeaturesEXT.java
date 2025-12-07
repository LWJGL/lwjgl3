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
 * struct VkPhysicalDeviceCustomResolveFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 customResolve;
 * }}</pre>
 */
public class VkPhysicalDeviceCustomResolveFeaturesEXT extends Struct<VkPhysicalDeviceCustomResolveFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CUSTOMRESOLVE;

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
        CUSTOMRESOLVE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCustomResolveFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCustomResolveFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCustomResolveFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCustomResolveFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCustomResolveFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code customResolve} field. */
    @NativeType("VkBool32")
    public boolean customResolve() { return ncustomResolve(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCustomResolveFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTCustomResolve#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceCustomResolveFeaturesEXT sType$Default() { return sType(EXTCustomResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCustomResolveFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code customResolve} field. */
    public VkPhysicalDeviceCustomResolveFeaturesEXT customResolve(@NativeType("VkBool32") boolean value) { ncustomResolve(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCustomResolveFeaturesEXT set(
        int sType,
        long pNext,
        boolean customResolve
    ) {
        sType(sType);
        pNext(pNext);
        customResolve(customResolve);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCustomResolveFeaturesEXT set(VkPhysicalDeviceCustomResolveFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCustomResolveFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCustomResolveFeaturesEXT malloc() {
        return new VkPhysicalDeviceCustomResolveFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCustomResolveFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCustomResolveFeaturesEXT calloc() {
        return new VkPhysicalDeviceCustomResolveFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCustomResolveFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCustomResolveFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCustomResolveFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCustomResolveFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceCustomResolveFeaturesEXT create(long address) {
        return new VkPhysicalDeviceCustomResolveFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCustomResolveFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCustomResolveFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCustomResolveFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCustomResolveFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCustomResolveFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCustomResolveFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCustomResolveFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCustomResolveFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCustomResolveFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCustomResolveFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCustomResolveFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #customResolve}. */
    public static int ncustomResolve(long struct) { return memGetInt(struct + VkPhysicalDeviceCustomResolveFeaturesEXT.CUSTOMRESOLVE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCustomResolveFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCustomResolveFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #customResolve(boolean) customResolve}. */
    public static void ncustomResolve(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCustomResolveFeaturesEXT.CUSTOMRESOLVE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCustomResolveFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCustomResolveFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCustomResolveFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceCustomResolveFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCustomResolveFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCustomResolveFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCustomResolveFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCustomResolveFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code customResolve} field. */
        @NativeType("VkBool32")
        public boolean customResolve() { return VkPhysicalDeviceCustomResolveFeaturesEXT.ncustomResolve(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCustomResolveFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTCustomResolve#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer sType$Default() { return sType(EXTCustomResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCustomResolveFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code customResolve} field. */
        public VkPhysicalDeviceCustomResolveFeaturesEXT.Buffer customResolve(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCustomResolveFeaturesEXT.ncustomResolve(address(), value ? 1 : 0); return this; }

    }

}