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
 * struct VkShaderInstrumentationCreateInfoARM {
 *     VkStructureType sType;
 *     void * pNext;
 * }}</pre>
 */
public class VkShaderInstrumentationCreateInfoARM extends Struct<VkShaderInstrumentationCreateInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
    }

    protected VkShaderInstrumentationCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkShaderInstrumentationCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkShaderInstrumentationCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkShaderInstrumentationCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderInstrumentationCreateInfoARM(ByteBuffer container) {
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

    /** Sets the specified value to the {@code sType} field. */
    public VkShaderInstrumentationCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMShaderInstrumentation#VK_STRUCTURE_TYPE_SHADER_INSTRUMENTATION_CREATE_INFO_ARM STRUCTURE_TYPE_SHADER_INSTRUMENTATION_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkShaderInstrumentationCreateInfoARM sType$Default() { return sType(ARMShaderInstrumentation.VK_STRUCTURE_TYPE_SHADER_INSTRUMENTATION_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkShaderInstrumentationCreateInfoARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkShaderInstrumentationCreateInfoARM set(
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
    public VkShaderInstrumentationCreateInfoARM set(VkShaderInstrumentationCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkShaderInstrumentationCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkShaderInstrumentationCreateInfoARM malloc() {
        return new VkShaderInstrumentationCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkShaderInstrumentationCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkShaderInstrumentationCreateInfoARM calloc() {
        return new VkShaderInstrumentationCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkShaderInstrumentationCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkShaderInstrumentationCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderInstrumentationCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkShaderInstrumentationCreateInfoARM} instance for the specified memory address. */
    public static VkShaderInstrumentationCreateInfoARM create(long address) {
        return new VkShaderInstrumentationCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkShaderInstrumentationCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkShaderInstrumentationCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkShaderInstrumentationCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkShaderInstrumentationCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkShaderInstrumentationCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderInstrumentationCreateInfoARM malloc(MemoryStack stack) {
        return new VkShaderInstrumentationCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkShaderInstrumentationCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderInstrumentationCreateInfoARM calloc(MemoryStack stack) {
        return new VkShaderInstrumentationCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkShaderInstrumentationCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkShaderInstrumentationCreateInfoARM.PNEXT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkShaderInstrumentationCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkShaderInstrumentationCreateInfoARM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkShaderInstrumentationCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkShaderInstrumentationCreateInfoARM, Buffer> implements NativeResource {

        private static final VkShaderInstrumentationCreateInfoARM ELEMENT_FACTORY = VkShaderInstrumentationCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkShaderInstrumentationCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderInstrumentationCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkShaderInstrumentationCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkShaderInstrumentationCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkShaderInstrumentationCreateInfoARM.npNext(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkShaderInstrumentationCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkShaderInstrumentationCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMShaderInstrumentation#VK_STRUCTURE_TYPE_SHADER_INSTRUMENTATION_CREATE_INFO_ARM STRUCTURE_TYPE_SHADER_INSTRUMENTATION_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkShaderInstrumentationCreateInfoARM.Buffer sType$Default() { return sType(ARMShaderInstrumentation.VK_STRUCTURE_TYPE_SHADER_INSTRUMENTATION_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkShaderInstrumentationCreateInfoARM.Buffer pNext(@NativeType("void *") long value) { VkShaderInstrumentationCreateInfoARM.npNext(address(), value); return this; }

    }

}