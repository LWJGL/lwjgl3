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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * <pre>{@code
 * struct VkShaderInstrumentationMetricDescriptionARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     char name[VK_MAX_DESCRIPTION_SIZE];
 *     char description[VK_MAX_DESCRIPTION_SIZE];
 * }}</pre>
 */
public class VkShaderInstrumentationMetricDescriptionARM extends Struct<VkShaderInstrumentationMetricDescriptionARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NAME,
        DESCRIPTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __array(1, VK_MAX_DESCRIPTION_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NAME = layout.offsetof(2);
        DESCRIPTION = layout.offsetof(3);
    }

    protected VkShaderInstrumentationMetricDescriptionARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkShaderInstrumentationMetricDescriptionARM create(long address, @Nullable ByteBuffer container) {
        return new VkShaderInstrumentationMetricDescriptionARM(address, container);
    }

    /**
     * Creates a {@code VkShaderInstrumentationMetricDescriptionARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderInstrumentationMetricDescriptionARM(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string stored in the {@code name} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** @return the null-terminated string stored in the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkShaderInstrumentationMetricDescriptionARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMShaderInstrumentation#VK_STRUCTURE_TYPE_SHADER_INSTRUMENTATION_METRIC_DESCRIPTION_ARM STRUCTURE_TYPE_SHADER_INSTRUMENTATION_METRIC_DESCRIPTION_ARM} value to the {@code sType} field. */
    public VkShaderInstrumentationMetricDescriptionARM sType$Default() { return sType(ARMShaderInstrumentation.VK_STRUCTURE_TYPE_SHADER_INSTRUMENTATION_METRIC_DESCRIPTION_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkShaderInstrumentationMetricDescriptionARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Copies the specified encoded string to the {@code name} field. */
    public VkShaderInstrumentationMetricDescriptionARM name(@NativeType("char[VK_MAX_DESCRIPTION_SIZE]") ByteBuffer value) { nname(address(), value); return this; }
    /** Copies the specified encoded string to the {@code description} field. */
    public VkShaderInstrumentationMetricDescriptionARM description(@NativeType("char[VK_MAX_DESCRIPTION_SIZE]") ByteBuffer value) { ndescription(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkShaderInstrumentationMetricDescriptionARM set(
        int sType,
        long pNext,
        ByteBuffer name,
        ByteBuffer description
    ) {
        sType(sType);
        pNext(pNext);
        name(name);
        description(description);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkShaderInstrumentationMetricDescriptionARM set(VkShaderInstrumentationMetricDescriptionARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkShaderInstrumentationMetricDescriptionARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkShaderInstrumentationMetricDescriptionARM malloc() {
        return new VkShaderInstrumentationMetricDescriptionARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkShaderInstrumentationMetricDescriptionARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkShaderInstrumentationMetricDescriptionARM calloc() {
        return new VkShaderInstrumentationMetricDescriptionARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkShaderInstrumentationMetricDescriptionARM} instance allocated with {@link BufferUtils}. */
    public static VkShaderInstrumentationMetricDescriptionARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderInstrumentationMetricDescriptionARM(memAddress(container), container);
    }

    /** Returns a new {@code VkShaderInstrumentationMetricDescriptionARM} instance for the specified memory address. */
    public static VkShaderInstrumentationMetricDescriptionARM create(long address) {
        return new VkShaderInstrumentationMetricDescriptionARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkShaderInstrumentationMetricDescriptionARM createSafe(long address) {
        return address == NULL ? null : new VkShaderInstrumentationMetricDescriptionARM(address, null);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationMetricDescriptionARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationMetricDescriptionARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationMetricDescriptionARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationMetricDescriptionARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationMetricDescriptionARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationMetricDescriptionARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkShaderInstrumentationMetricDescriptionARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationMetricDescriptionARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkShaderInstrumentationMetricDescriptionARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkShaderInstrumentationMetricDescriptionARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderInstrumentationMetricDescriptionARM malloc(MemoryStack stack) {
        return new VkShaderInstrumentationMetricDescriptionARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkShaderInstrumentationMetricDescriptionARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderInstrumentationMetricDescriptionARM calloc(MemoryStack stack) {
        return new VkShaderInstrumentationMetricDescriptionARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationMetricDescriptionARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationMetricDescriptionARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderInstrumentationMetricDescriptionARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderInstrumentationMetricDescriptionARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkShaderInstrumentationMetricDescriptionARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkShaderInstrumentationMetricDescriptionARM.PNEXT); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + VkShaderInstrumentationMetricDescriptionARM.NAME, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + VkShaderInstrumentationMetricDescriptionARM.NAME); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkShaderInstrumentationMetricDescriptionARM.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkShaderInstrumentationMetricDescriptionARM.DESCRIPTION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkShaderInstrumentationMetricDescriptionARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkShaderInstrumentationMetricDescriptionARM.PNEXT, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, VK_MAX_DESCRIPTION_SIZE);
        }
        memCopy(memAddress(value), struct + VkShaderInstrumentationMetricDescriptionARM.NAME, value.remaining());
    }
    /** Unsafe version of {@link #description(ByteBuffer) description}. */
    public static void ndescription(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, VK_MAX_DESCRIPTION_SIZE);
        }
        memCopy(memAddress(value), struct + VkShaderInstrumentationMetricDescriptionARM.DESCRIPTION, value.remaining());
    }

    // -----------------------------------

    /** An array of {@link VkShaderInstrumentationMetricDescriptionARM} structs. */
    public static class Buffer extends StructBuffer<VkShaderInstrumentationMetricDescriptionARM, Buffer> implements NativeResource {

        private static final VkShaderInstrumentationMetricDescriptionARM ELEMENT_FACTORY = VkShaderInstrumentationMetricDescriptionARM.create(-1L);

        /**
         * Creates a new {@code VkShaderInstrumentationMetricDescriptionARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderInstrumentationMetricDescriptionARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkShaderInstrumentationMetricDescriptionARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkShaderInstrumentationMetricDescriptionARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkShaderInstrumentationMetricDescriptionARM.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer name() { return VkShaderInstrumentationMetricDescriptionARM.nname(address()); }
        /** @return the null-terminated string stored in the {@code name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String nameString() { return VkShaderInstrumentationMetricDescriptionARM.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkShaderInstrumentationMetricDescriptionARM.ndescription(address()); }
        /** @return the null-terminated string stored in the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkShaderInstrumentationMetricDescriptionARM.ndescriptionString(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkShaderInstrumentationMetricDescriptionARM.Buffer sType(@NativeType("VkStructureType") int value) { VkShaderInstrumentationMetricDescriptionARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMShaderInstrumentation#VK_STRUCTURE_TYPE_SHADER_INSTRUMENTATION_METRIC_DESCRIPTION_ARM STRUCTURE_TYPE_SHADER_INSTRUMENTATION_METRIC_DESCRIPTION_ARM} value to the {@code sType} field. */
        public VkShaderInstrumentationMetricDescriptionARM.Buffer sType$Default() { return sType(ARMShaderInstrumentation.VK_STRUCTURE_TYPE_SHADER_INSTRUMENTATION_METRIC_DESCRIPTION_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkShaderInstrumentationMetricDescriptionARM.Buffer pNext(@NativeType("void *") long value) { VkShaderInstrumentationMetricDescriptionARM.npNext(address(), value); return this; }
        /** Copies the specified encoded string to the {@code name} field. */
        public VkShaderInstrumentationMetricDescriptionARM.Buffer name(@NativeType("char[VK_MAX_DESCRIPTION_SIZE]") ByteBuffer value) { VkShaderInstrumentationMetricDescriptionARM.nname(address(), value); return this; }
        /** Copies the specified encoded string to the {@code description} field. */
        public VkShaderInstrumentationMetricDescriptionARM.Buffer description(@NativeType("char[VK_MAX_DESCRIPTION_SIZE]") ByteBuffer value) { VkShaderInstrumentationMetricDescriptionARM.ndescription(address(), value); return this; }

    }

}