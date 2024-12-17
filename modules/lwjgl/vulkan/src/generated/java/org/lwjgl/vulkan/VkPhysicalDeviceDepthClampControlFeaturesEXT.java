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
 * struct VkPhysicalDeviceDepthClampControlFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 depthClampControl;
 * }}</pre>
 */
public class VkPhysicalDeviceDepthClampControlFeaturesEXT extends Struct<VkPhysicalDeviceDepthClampControlFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPTHCLAMPCONTROL;

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
        DEPTHCLAMPCONTROL = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDepthClampControlFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDepthClampControlFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDepthClampControlFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDepthClampControlFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDepthClampControlFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code depthClampControl} field. */
    @NativeType("VkBool32")
    public boolean depthClampControl() { return ndepthClampControl(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDepthClampControlFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDepthClampControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceDepthClampControlFeaturesEXT sType$Default() { return sType(EXTDepthClampControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDepthClampControlFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code depthClampControl} field. */
    public VkPhysicalDeviceDepthClampControlFeaturesEXT depthClampControl(@NativeType("VkBool32") boolean value) { ndepthClampControl(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDepthClampControlFeaturesEXT set(
        int sType,
        long pNext,
        boolean depthClampControl
    ) {
        sType(sType);
        pNext(pNext);
        depthClampControl(depthClampControl);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDepthClampControlFeaturesEXT set(VkPhysicalDeviceDepthClampControlFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDepthClampControlFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT malloc() {
        return new VkPhysicalDeviceDepthClampControlFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClampControlFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT calloc() {
        return new VkPhysicalDeviceDepthClampControlFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClampControlFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDepthClampControlFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClampControlFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDepthClampControlFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDepthClampControlFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDepthClampControlFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthClampControlFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthClampControlFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthClampControlFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthClampControlFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDepthClampControlFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDepthClampControlFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #depthClampControl}. */
    public static int ndepthClampControl(long struct) { return memGetInt(struct + VkPhysicalDeviceDepthClampControlFeaturesEXT.DEPTHCLAMPCONTROL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDepthClampControlFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDepthClampControlFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #depthClampControl(boolean) depthClampControl}. */
    public static void ndepthClampControl(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDepthClampControlFeaturesEXT.DEPTHCLAMPCONTROL, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDepthClampControlFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDepthClampControlFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDepthClampControlFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDepthClampControlFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDepthClampControlFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDepthClampControlFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDepthClampControlFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDepthClampControlFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code depthClampControl} field. */
        @NativeType("VkBool32")
        public boolean depthClampControl() { return VkPhysicalDeviceDepthClampControlFeaturesEXT.ndepthClampControl(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDepthClampControlFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDepthClampControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer sType$Default() { return sType(EXTDepthClampControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDepthClampControlFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code depthClampControl} field. */
        public VkPhysicalDeviceDepthClampControlFeaturesEXT.Buffer depthClampControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDepthClampControlFeaturesEXT.ndepthClampControl(address(), value ? 1 : 0); return this; }

    }

}