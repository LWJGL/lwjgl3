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
 * struct VkPhysicalDeviceShaderFloatControls2Features {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderFloatControls2;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderFloatControls2Features extends Struct<VkPhysicalDeviceShaderFloatControls2Features> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERFLOATCONTROLS2;

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
        SHADERFLOATCONTROLS2 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderFloatControls2Features(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderFloatControls2Features create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderFloatControls2Features(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderFloatControls2Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderFloatControls2Features(ByteBuffer container) {
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
    /** @return the value of the {@code shaderFloatControls2} field. */
    @NativeType("VkBool32")
    public boolean shaderFloatControls2() { return nshaderFloatControls2(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderFloatControls2Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderFloatControls2Features sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderFloatControls2Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderFloatControls2} field. */
    public VkPhysicalDeviceShaderFloatControls2Features shaderFloatControls2(@NativeType("VkBool32") boolean value) { nshaderFloatControls2(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderFloatControls2Features set(
        int sType,
        long pNext,
        boolean shaderFloatControls2
    ) {
        sType(sType);
        pNext(pNext);
        shaderFloatControls2(shaderFloatControls2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderFloatControls2Features set(VkPhysicalDeviceShaderFloatControls2Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderFloatControls2Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderFloatControls2Features malloc() {
        return new VkPhysicalDeviceShaderFloatControls2Features(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFloatControls2Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderFloatControls2Features calloc() {
        return new VkPhysicalDeviceShaderFloatControls2Features(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFloatControls2Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderFloatControls2Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderFloatControls2Features(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderFloatControls2Features} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderFloatControls2Features create(long address) {
        return new VkPhysicalDeviceShaderFloatControls2Features(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderFloatControls2Features createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderFloatControls2Features(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloatControls2Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloatControls2Features.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloatControls2Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloatControls2Features.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloatControls2Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloatControls2Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderFloatControls2Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloatControls2Features.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderFloatControls2Features.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderFloatControls2Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderFloatControls2Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloatControls2Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderFloatControls2Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderFloatControls2Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloatControls2Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloatControls2Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloatControls2Features.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderFloatControls2Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderFloatControls2Features.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderFloatControls2Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderFloatControls2Features.PNEXT); }
    /** Unsafe version of {@link #shaderFloatControls2}. */
    public static int nshaderFloatControls2(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderFloatControls2Features.SHADERFLOATCONTROLS2); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderFloatControls2Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderFloatControls2Features.PNEXT, value); }
    /** Unsafe version of {@link #shaderFloatControls2(boolean) shaderFloatControls2}. */
    public static void nshaderFloatControls2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderFloatControls2Features.SHADERFLOATCONTROLS2, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderFloatControls2Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderFloatControls2Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderFloatControls2Features ELEMENT_FACTORY = VkPhysicalDeviceShaderFloatControls2Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderFloatControls2Features.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderFloatControls2Features#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderFloatControls2Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderFloatControls2Features.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderFloatControls2Features.npNext(address()); }
        /** @return the value of the {@code shaderFloatControls2} field. */
        @NativeType("VkBool32")
        public boolean shaderFloatControls2() { return VkPhysicalDeviceShaderFloatControls2Features.nshaderFloatControls2(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderFloatControls2Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderFloatControls2Features.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderFloatControls2Features.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderFloatControls2Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderFloatControls2Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderFloatControls2} field. */
        public VkPhysicalDeviceShaderFloatControls2Features.Buffer shaderFloatControls2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderFloatControls2Features.nshaderFloatControls2(address(), value ? 1 : 0); return this; }

    }

}